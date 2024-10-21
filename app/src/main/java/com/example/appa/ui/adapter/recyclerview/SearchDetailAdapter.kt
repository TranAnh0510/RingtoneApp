package com.example.appa.ui.adapter.recyclerview

import androidx.recyclerview.widget.DiffUtil
import com.bumptech.glide.Glide
import com.example.appa.R
import com.example.appa.data.model.musicserver.MusicServerUI
import com.example.appa.databinding.ItemSearchBinding
import com.example.appa.ui.base.BaseBindingAdapterDiff
import com.example.appa.util.MediaPlayerUtil
import com.example.appa.util.extension.gone
import com.example.appa.util.extension.setOnSafeClick
import com.example.appa.util.extension.visible
/**
 * SearchDetailAdapter is a custom adapter that extends BaseBindingPagerAdapter.
 * It is used to bind audio item data to a view for a RecyclerView with view binding.
 */
class SearchDetailAdapter :
    BaseBindingAdapterDiff<MusicServerUI, ItemSearchBinding>(object :
        DiffUtil.ItemCallback<MusicServerUI>() {
        /**
         * Checks if two items have the same path.
         * @param oldItem The old item.
         * @param newItem The new item.
         * @return True if the paths are the same, false otherwise.
         */
        override fun areItemsTheSame(
            oldItem: MusicServerUI,
            newItem: MusicServerUI
        ): Boolean {
            return oldItem.name == newItem.name
        }
        /**
         * Checks if the contents of two items are the same.
         * @param oldItem The old item.
         * @param newItem The new item.
         * @return True if the contents are the same, false otherwise.
         */
        override fun areContentsTheSame(
            oldItem: MusicServerUI,
            newItem: MusicServerUI
        ): Boolean {
            return oldItem == newItem
        }
    }
    ) {
    var onclickMore: (Int, MusicServerUI) -> Unit = { _, _ -> }
    var onclickDownload: (Int, MusicServerUI) -> Unit = { _, _ -> }
    var onclickItem: (Int, MusicServerUI) -> Unit = { _, _ -> }
    var oldPath: String = ""
        set(value) {
            field = value
            if (value.isNotEmpty()) {
                value.notifyItemWithPath()
            }
        }

    var newPath: String = ""
        set(value) {
            oldPath = newPath
            field = value
            value.notifyItemWithPath()
        }

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
     */
    override fun onBindViewHolderBase(
        holder: BaseHolder<ItemSearchBinding>, position: Int
    ) {
        with(getItem(holder.bindingAdapterPosition)) {
            with(holder.binding) {
                if (pathDownload.isNullOrEmpty()) {
                    imDownload.visible()
                    imMore.gone()
                } else {
                    imMore.visible()
                    imDownload.gone()
                }
                image?.let {
                    Glide.with(imSound.context)
                        .load(it)
                        .placeholder(R.drawable.ic_loading_image)
                        .error(R.drawable.ic_error_loading_image)
                        .into(imSound)
                }
                tvNameSound.text = name
                tvDuration.text = duration
                if (path == MediaPlayerUtil.path) {
                    imPlay.setImageResource(if (MediaPlayerUtil.isPlaying) R.drawable.ic_pause else R.drawable.ic_play)
                } else {
                    imPlay.setImageResource(R.drawable.ic_play)
                }
            }
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
     */
    override val layoutIdItem: Int
        get() = R.layout.item_search
}