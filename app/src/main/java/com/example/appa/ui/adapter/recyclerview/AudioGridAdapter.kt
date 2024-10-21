package com.example.appa.ui.adapter.recyclerview

import androidx.recyclerview.widget.DiffUtil
import com.bumptech.glide.Glide
import com.example.appa.R
import com.example.appa.data.model.ItemAudio
import com.example.appa.databinding.ItemGridAudioBinding
import com.example.appa.ui.base.BaseBindingPagerAdapter
import com.example.appa.util.StorageUtils
import com.example.appa.util.extension.setOnSafeClick

/**
 * AudioGridAdapter is a custom adapter that extends BaseBindingPagerAdapter.
 * It is used to bind audio item data to a view for a RecyclerView with view binding.
 * @author AnhTTH
 */
class AudioGridAdapter : BaseBindingPagerAdapter<ItemAudio, ItemGridAudioBinding>(object :
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
    var onclickItem: (Int, ItemAudio) -> Unit = { _, _ -> }

    // Path of the previously selected audio item
    var oldPath: String = ""
        set(value) {
            field = value
            if (value.isNotEmpty()) {
                value.notifyItemWithPath()
            }
        }

    // Path of the currently selected audio item
    var newPath: String = ""
        set(value) {
            // Set the oldPath to the previous value of newPath before updating it
            oldPath = newPath
            field = value
            // Highlight the item with the newPath
            value.notifyItemWithPath()
        }

    /**
     * Initializes the adapter. Sets the newPath to an empty string.
     * @author AnhTTH
     */
    init {
        newPath = ""
    }




    /**
     * Binds the data to the item view and handles item click events.
     * @param holder The ViewHolder for the item view.
     * @param position The position of the item in the list.
     * @author AnhTTH
     */
    override fun onBindViewHolderBase(holder: BaseHolder<ItemGridAudioBinding>, position: Int) {
        getItem(holder.bindingAdapterPosition)?.let { item ->
            holder.binding.apply {
                // Load audio image using Glide
                Glide.with(imAudio.context).load(R.drawable.im_audio_device)
                    .placeholder(R.drawable.ic_loading_image)
                    .error(R.drawable.ic_error_loading_image).into(imAudio)
                // Set duration, name, and size of the audio item
                tvDuration.text = item.duration
                tvNameAudio.text = item.nameFile
                tvSize.text = StorageUtils.readableFileSize(item.size)
                // Check if the newPath is empty
                if (newPath.isEmpty()) {
                    // If newPath is empty, set it to the path of the first item in the list
                    if (holder.bindingAdapterPosition == 0) {
                        newPath = item.path
                    }
                } else {
                    // If newPath is not empty, highlight the selected item
                    if (newPath == item.path) {
                        constrainLayout.setBackgroundResource(R.drawable.bg_audio_select)
                    } else {
                        constrainLayout.setBackgroundResource(R.drawable.bg_audio_unselect)
                    }
                }

            }
            // Set click listener for the item view
            holder.itemView.setOnSafeClick {
                // Call the onclickItem lambda function
                onclickItem(holder.bindingAdapterPosition, item)
                // Update newPath to the path of the clicked item
                if (newPath != item.path) {
                    newPath = item.path
                }
            }
        }

    }

    /**
     * Notifies the adapter to update the item corresponding to the given path.
     * If the path does not exist in the list, it defaults to the first item in the list.
     * @param path The path of the item to be updated.
     * @author AnhTTH
     */
    private fun String.notifyItemWithPath() = kotlin.runCatching {
        // Find the index of the item with the specified path
        var index = snapshot().items.indexOfFirst { it.path == this }
        if (index < 0) {
            // If the path is not found, default to the first item in the list
            index = 0
            if (snapshot().items.isNotEmpty()) {
                newPath = snapshot().items[0].path
            }
        }
        // Notify the adapter to update the item at the specified index
        notifyItemChanged(index)
    }.onFailure { it.printStackTrace() }

    /**
     * Returns the layout resource ID for the item.
     * @return The layout resource ID.
     * @author AnhTTH
     */
    override val layoutIdItem: Int
        get() = R.layout.item_grid_audio

}
