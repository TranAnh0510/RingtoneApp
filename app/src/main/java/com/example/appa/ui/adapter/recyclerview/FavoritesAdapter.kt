package com.example.appa.ui.adapter.recyclerview

import androidx.recyclerview.widget.DiffUtil
import com.bumptech.glide.Glide
import com.example.appa.R
import com.example.appa.data.model.ItemFavoriteUI
import com.example.appa.databinding.ItemFavoritesBinding
import com.example.appa.ui.base.BaseBindingAdapterDiff
import com.example.appa.util.MediaPlayerUtil
import com.example.appa.util.extension.gone
import com.example.appa.util.extension.setOnSafeClick
import com.example.appa.util.extension.visible

/**
 * Adapter for displaying favorite items in a RecyclerView.
 * @author AnhTTH
 */
class FavoritesAdapter : BaseBindingAdapterDiff<ItemFavoriteUI, ItemFavoritesBinding>(object :
    DiffUtil.ItemCallback<ItemFavoriteUI>() {
    override fun areItemsTheSame(oldItem: ItemFavoriteUI, newItem: ItemFavoriteUI): Boolean {
        return oldItem.image == newItem.image
    }

    override fun areContentsTheSame(oldItem: ItemFavoriteUI, newItem: ItemFavoriteUI): Boolean {
        return oldItem == newItem
    }
}) {
    // Click listeners for delete, download, more options, and item click events
    var onclickDelete: (Int, ItemFavoriteUI) -> Unit = { _, _ -> }
    var onclickDownload: (Int, ItemFavoriteUI) -> Unit = { _, _ -> }
    var onclickMore: (Int, ItemFavoriteUI) -> Unit = { _, _ -> }
    var onclickItem: (Int, ItemFavoriteUI) -> Unit = { _, _ -> }

    // Path of the previously selected item
    var oldPath: String = ""
        set(value) {
            field = value
            if (value.isNotEmpty()) {
                value.notifyItemWithPath()
            }
        }

    // Path of the currently selected item
    var newPath: String = ""
        set(value) {
            // Set the oldPath to the previous value of newPath before updating it
            oldPath = newPath
            field = value
            // Notify the adapter to update the item with the newPath
            value.notifyItemWithPath()
        }

    /**
     * Notifies the adapter that the item with the given path should be updated.
     * @param path The path of the item to be updated.
     * @author AnhTTH
     */
    private fun String.notifyItemWithPath() = kotlin.runCatching {
        var index = currentList.indexOfFirst { it.path == this }
        if (index < 0) {
            index = 0
            if (currentList.isNotEmpty()) {
                newPath = currentList[0].path
            }
        }
        notifyItemChanged(index)
    }.onFailure { it.printStackTrace() }

    /**
     * Binds the data to the views of the item at the specified position.
     * @param holder The ViewHolder containing the views.
     * @param position The position of the item in the adapter.
     * @author AnhTTH
     */
    override fun onBindViewHolderBase(holder: BaseHolder<ItemFavoritesBinding>, position: Int) {
        with(getItem(holder.bindingAdapterPosition)) {
            // Retrieve the item at the specified position
            with(holder.binding) {
                // Bind data to the views within the ViewHolder
                if (pathDownload.isNullOrEmpty()) {
                    // Show/hide download and more options based on pathDownload availability
                    imDownload.visible()
                    imMore.gone()
                } else {
                    imMore.visible()
                    imDownload.gone()
                }
                // Load image using Glide if available
                image?.let {
                    Glide.with(imRingTone.context).load(it).placeholder(R.drawable.ic_loading_image)
                        .error(R.drawable.ic_error_loading_image).into(imRingTone)
                }
                // Set text for ringtone name and singer
                tvNameRingTone.text = name
                tvNameSinger.text = duration
                // Set play button image based on whether the item's path matches the MediaPlayerUtil's path
                if (path == MediaPlayerUtil.path) {
                    imPlay.setImageResource(if (MediaPlayerUtil.isPlaying) R.drawable.ic_pause else R.drawable.ic_play)
                } else {
                    imPlay.setImageResource(R.drawable.ic_play)
                }
            }
            // Set click listeners for item view, more options, download, and delete buttons
            holder.itemView.setOnSafeClick {
                onclickItem(holder.bindingAdapterPosition, this)
            }
            holder.binding.imMore.setOnSafeClick {
                onclickMore(holder.bindingAdapterPosition, this)
            }
            holder.binding.imDownload.setOnSafeClick {
                onclickDownload(holder.bindingAdapterPosition, this)
            }

            holder.binding.imFavorites.setOnSafeClick {
                onclickDelete(holder.bindingAdapterPosition, this)
            }
        }

    }

    /**
     * Returns the layout ID for the item view.
     * @author AnhTTH
     */
    override val layoutIdItem: Int
        get() = R.layout.item_favorites
}