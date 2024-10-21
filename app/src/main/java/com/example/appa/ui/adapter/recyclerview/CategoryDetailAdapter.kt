package com.example.appa.ui.adapter.recyclerview

import androidx.recyclerview.widget.DiffUtil
import com.bumptech.glide.Glide
import com.example.appa.R
import com.example.appa.data.model.musicserver.MusicServerUI
import com.example.appa.databinding.ItemCategoryDetailBinding
import com.example.appa.ui.base.BaseBindingAdapterDiff
import com.example.appa.util.MediaPlayerUtil
import com.example.appa.util.extension.invisible
import com.example.appa.util.extension.setOnSafeClick
import com.example.appa.util.extension.visible

/**
 * CategoryDetailAdapter is a custom adapter that extends BaseBindingPagerAdapter.
 * It is used to bind audio item data to a view for a RecyclerView with view binding.
 * @author AnhTTH
 */
class CategoryDetailAdapter :
    BaseBindingAdapterDiff<MusicServerUI, ItemCategoryDetailBinding>(object :
        DiffUtil.ItemCallback<MusicServerUI>() {
        /**
         * Checks if two items have the same path.
         * @param oldItem The old item.
         * @param newItem The new item.
         * @return True if the paths are the same, false otherwise.
         * @author AnhTTH
         */
        override fun areItemsTheSame(
            oldItem: MusicServerUI, newItem: MusicServerUI
        ): Boolean {
            return oldItem.name == newItem.name
        }

        /**
         * Checks if the contents of two items are the same.
         * @param oldItem The old item.
         * @param newItem The new item.
         * @return True if the contents are the same, false otherwise.
         * @author AnhTTH
         */
        override fun areContentsTheSame(
            oldItem: MusicServerUI, newItem: MusicServerUI
        ): Boolean {
            return oldItem == newItem
        }
    }) {
    /**
     * Lambda function to handle "more" button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     * @author AnhTTH
     */
    var onclickMore: (Int, MusicServerUI) -> Unit = { _, _ -> }

    /**
     * Lambda function to handle download button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     * @author AnhTTH
     */
    var onclickDownload: (Int, MusicServerUI) -> Unit = { _, _ -> }

    /**
     * Lambda function to handle item click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     * @author AnhTTH
     */
    var onclickItem: (Int, MusicServerUI) -> Unit = { _, _ -> }

    /**
     * The path of the previously selected item.
     * When set, it triggers a notification to update the item with the new path.
     * @author AnhTTH
     */
    var oldPath: String = ""
        set(value) {
            field = value
            if (value.isNotEmpty()) {
                value.notifyItemWithPath()
            }
        }

    /**
     * The path of the currently selected item.
     * When set, it triggers a notification to update the item with the new path.
     * @author AnhTTH
     */
    var newPath: String = ""
        set(value) {
            oldPath = newPath
            field = value
            value.notifyItemWithPath()
        }

    /**
     * Extension function to notify the adapter about the item with the given path.
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
     * Binds the data to the view holder.
     * @param holder The view holder.
     * @param position The position of the item in the adapter.
     * @author AnhTTH
     */
    override fun onBindViewHolderBase(
        holder: BaseHolder<ItemCategoryDetailBinding>, position: Int
    ) {
        // Retrieve the item at the specified position
        with(getItem(holder.bindingAdapterPosition)) {
            // Bind data to the views within the ViewHolder
            with(holder.binding) {
                // Set play button image based on whether the item's path matches the MediaPlayerUtil's path
                if (path == MediaPlayerUtil.path) {
                    imPlay.setImageResource(if (MediaPlayerUtil.isPlaying) R.drawable.ic_pause else R.drawable.ic_play)
                } else {
                    imPlay.setImageResource(R.drawable.ic_play)
                }
                // Show/hide download and more options based on pathDownload availability
                if (pathDownload.isNullOrEmpty()) {
                    imDownload.visible()
                    imMore.invisible()
                } else {
                    imMore.visible()
                    imDownload.invisible()
                }
                // Load image using Glide if available
                image?.let {
                    Glide.with(imRingTone.context).load(it).placeholder(R.drawable.ic_loading_image)
                        .error(R.drawable.ic_error_loading_image).into(imRingTone)
                }
                // Set text for ringtone name and singer
                tvNameRingTone.text = name
                tvNameSinger.text = duration

            }
            // Set click listeners for item view, more options, and download buttons
            holder.itemView.setOnSafeClick {
                onclickItem(holder.bindingAdapterPosition, this)
            }
            holder.binding.imMore.setOnSafeClick {
                onclickMore(holder.bindingAdapterPosition, this)
            }
            holder.binding.imDownload.setOnSafeClick {
                onclickDownload(holder.bindingAdapterPosition, this)
            }
        }

    }

    /**
     * Returns the layout resource ID for the item.
     * @return The layout resource ID.
     * @author AnhTTH
     */
    override val layoutIdItem: Int
        get() = R.layout.item_category_detail
}