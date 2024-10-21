package com.example.appa.ui.adapter.recyclerview

import android.graphics.Color
import androidx.recyclerview.widget.DiffUtil
import com.bumptech.glide.Glide
import com.example.appa.R
import com.example.appa.databinding.ItemChooseVideoBinding
import com.example.appa.ui.base.BaseBindingPagerAdapter
import com.example.appa.util.extension.setOnSafeClick
import com.example.appa.data.repository.video.model.ItemVideo
/**
 * VideoAdapter is a custom adapter that extends BaseBindingPagerAdapter.
 * It is used to bind audio item data to a view for a RecyclerView with view binding.
 */
class VideoAdapter : BaseBindingPagerAdapter<ItemVideo, ItemChooseVideoBinding>(object :
    DiffUtil.ItemCallback<ItemVideo>() {
    /**
     * Checks if two items have the same path.
     * @param oldItem The old item.
     * @param newItem The new item.
     * @return True if the paths are the same, false otherwise.
     */
    override fun areItemsTheSame(oldItem: ItemVideo, newItem: ItemVideo): Boolean {
        return oldItem.path == newItem.path
    }
    /**
     * Checks if the contents of two items are the same.
     * @param oldItem The old item.
     * @param newItem The new item.
     * @return True if the contents are the same, false otherwise.
     */
    override fun areContentsTheSame(oldItem: ItemVideo, newItem: ItemVideo): Boolean {
        return oldItem == newItem
    }
}
) {
    var onclickItem: (Int, ItemVideo) -> Unit = { _, _ -> }
    private var oldPath: String = ""
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

    init {
        newPath = ""
    }

    private fun String.notifyItemWithPath() = kotlin.runCatching {
        var index = snapshot().items.indexOfFirst { it.path == this }
        if (index < 0) {
            index = 0
            if (snapshot().items.isNotEmpty()) {
                newPath = snapshot().items[0].path
            }
        }
        notifyItemChanged(index)
    }.onFailure { it.printStackTrace() }

    private val colorSelected = Color.parseColor("#FFDB20")
    private val colorNonSelected = Color.parseColor("#00FFFFFF")
    /**
     * Binds the data to the view holder.
     * @param holder The view holder.
     * @param position The position of the item in the adapter.
     */
    override fun onBindViewHolderBase(holder: BaseHolder<ItemChooseVideoBinding>, position: Int) {
        getItem(holder.bindingAdapterPosition)?.let { item ->
            holder.binding.apply {
                Glide.with(imVideo.context)
                    .load(item.path)
                    .placeholder(R.drawable.ic_loading_image)
                    .error(R.drawable.ic_error_loading_image)
                    .into(imVideo)
                tvDuration.text = item.duration
                if (newPath.isEmpty()) {
                    if (holder.bindingAdapterPosition == 0) {
                        newPath = item.path
                    }
                } else {
                    cvImage.strokeColor =
                        if (newPath == item.path) colorSelected else colorNonSelected
                }
            }
            holder.itemView.setOnSafeClick {
                onclickItem(holder.bindingAdapterPosition, item)
                if (newPath != item.path) {
                    newPath = item.path
                }
            }
        }

    }
    /**
     * Returns the layout resource ID for the item.
     * @return The layout resource ID.
     */
    override val layoutIdItem: Int
        get() = R.layout.item_choose_video

}


