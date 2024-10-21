package com.example.appa.ui.adapter.recyclerview

import android.annotation.SuppressLint
import android.view.View
import androidx.recyclerview.widget.DiffUtil
import com.bumptech.glide.Glide
import com.example.appa.R
import com.example.appa.databinding.ItemVideoLinearBinding
import com.example.appa.ui.base.BaseBindingPagerAdapter
import com.example.appa.util.StorageUtils
import com.example.appa.util.extension.setOnSafeClick
import com.example.appa.data.repository.video.model.ItemVideo
/**
 * VideoLinearAdapter is a custom adapter that extends BaseBindingPagerAdapter.
 * It is used to bind audio item data to a view for a RecyclerView with view binding.
 */
class VideoLinearAdapter : BaseBindingPagerAdapter<ItemVideo, ItemVideoLinearBinding>(object :
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
    var oldPath: String = ""
        set(value) {
            field = value
            if (newPath.isNotEmpty()) {
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

    /**
     * Binds the data to the view holder.
     * @param holder The view holder.
     * @param position The position of the item in the adapter.
     */
    @SuppressLint("SetTextI18n")
    override fun onBindViewHolderBase(holder: BaseHolder<ItemVideoLinearBinding>, position: Int) {
        getItem(holder.bindingAdapterPosition)?.let { item ->
            holder.binding.apply {
                Glide.with(imRingTone.context)
                    .load(item.path)
                    .placeholder(R.drawable.ic_loading_image)
                    .error(R.drawable.ic_error_loading_image)
                    .into(imRingTone)
                tvNameVideo.text = item.nameFile
                tvDuration.text = item.duration
                tvDateAndCapacity.text = item.duration + " - "  + item.size.let {
                    StorageUtils.readableFileSize(it)
                }
                if (newPath.isEmpty()) {
                    if (holder.bindingAdapterPosition==0){ newPath = item.path }
                } else {
                    viewImageSelect.visibility =
                        if (newPath == item.path) View.VISIBLE else View.INVISIBLE
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
        get() = R.layout.item_video_linear
}