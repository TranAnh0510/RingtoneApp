package com.example.appa.ui.adapter.recyclerview

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil
import com.bumptech.glide.Glide
import com.example.appa.R
import com.example.appa.data.model.ItemAudio
import com.example.appa.databinding.ItemAudioBinding
import com.example.appa.ui.base.BaseBindingPagerAdapter
import com.example.appa.util.StorageUtils
import com.example.appa.util.extension.gone
import com.example.appa.util.extension.setOnSafeClick
import com.example.appa.util.extension.visible

/**
 * AudioAdapter is a custom adapter that extends BaseBindingPagerAdapter.
 * It is used to bind audio item data to a view for a RecyclerView with view binding.
 * @author AnhTTH
 */
class AudioAdapter : BaseBindingPagerAdapter<ItemAudio, ItemAudioBinding>(object :
    DiffUtil.ItemCallback<ItemAudio>() {
    /**
     * Checks if two items have the same path.
     * @param oldItem The old item.
     * @param newItem The new item.
     * @return True if the paths are the same, false otherwise.
     * @author AnhTTH
     */
    override fun areItemsTheSame(oldItem: ItemAudio, newItem: ItemAudio): Boolean {
        return oldItem.path == newItem.path
    }

    /**
     * Checks if the contents of two items are the same.
     * @param oldItem The old item.
     * @param newItem The new item.
     * @return True if the contents are the same, false otherwise.
     * @author AnhTTH
     */
    override fun areContentsTheSame(oldItem: ItemAudio, newItem: ItemAudio): Boolean {
        return oldItem == newItem
    }
}) {
    /**
     * Lambda function to handle item click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     * @author AnhTTH
     */
    var onclickItem: (Int, ItemAudio) -> Unit = { _, _ -> }

    /**
     * The path of the previously selected audio item.
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
     * The path of the currently selected audio item.
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
     * Initializes the newPath to an empty string.
     * @author AnhTTH
     */
    init {
        newPath = ""

    }



    /**
     * Binds the data to the view holder.
     * @param holder The view holder.
     * @param position The position of the item in the adapter.
     * @author AnhTTH
     */
    @SuppressLint("SetTextI18n")
    override fun onBindViewHolderBase(holder: BaseHolder<ItemAudioBinding>, position: Int) {
        getItem(holder.bindingAdapterPosition)?.let { item ->
            holder.binding.apply {
                Glide.with(imAudio.context).load(R.drawable.im_audio_device)
                    .placeholder(R.drawable.ic_loading_image)
                    .error(R.drawable.ic_error_loading_image).into(imAudio)
                tvNameAudio.text = item.nameFile
                tvDateAndCapacity.text =
                    item.duration + " - " + StorageUtils.readableFileSize(item.size)

                if (newPath.isEmpty()) {
                    if (holder.bindingAdapterPosition == 0) {
                        newPath = item.path
                    }
                } else {
                    if (newPath == item.path) {
                        constrainLayout.setBackgroundResource(R.drawable.bg_audio_select)
                        tvLine.gone()
                    } else {
                        constrainLayout.setBackgroundResource(R.drawable.bg_audio_unselect)
                        tvLine.visible()
                    }
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
     * Extension function to notify the adapter about the item with the given path.
     * @author AnhTTH
     */
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
     * Returns the layout resource ID for the item.
     * @return The layout resource ID.
     * @author AnhTTH
     */
    override val layoutIdItem: Int
        get() = R.layout.item_audio
}