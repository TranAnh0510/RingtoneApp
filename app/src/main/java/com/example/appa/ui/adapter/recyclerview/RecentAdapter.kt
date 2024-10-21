package com.example.appa.ui.adapter.recyclerview

import androidx.recyclerview.widget.DiffUtil
import com.bumptech.glide.Glide
import com.example.appa.R
import com.example.appa.data.model.ItemRecent
import com.example.appa.databinding.ItemRecentBinding
import com.example.appa.ui.base.BaseBindingAdapterDiff
import com.example.appa.util.MediaPlayerUtil
import com.example.appa.util.extension.setOnSafeClick
/**
 * Adapter for displaying recent items in a RecyclerView.
 * @author AnhTTH
 */
class RecentAdapter : BaseBindingAdapterDiff<ItemRecent, ItemRecentBinding>(
    object : DiffUtil.ItemCallback<ItemRecent>() {
        override fun areItemsTheSame(oldItem: ItemRecent, newItem: ItemRecent): Boolean {
            return oldItem.nameSound == newItem.nameSound
        }

        override fun areContentsTheSame(oldItem: ItemRecent, newItem: ItemRecent): Boolean {
            return oldItem == newItem
        }
    }
) {

    var onclickItem: (Int, ItemRecent) -> Unit = { _, _ -> }
    var onclickMore: (Int, ItemRecent) -> Unit = { _, _ -> }
    /**
     * Binds the data to the views of the item at the specified position.
     * @param holder The ViewHolder containing the views.
     * @param position The position of the item in the adapter.
     * @author AnhTTH
     */
    override fun onBindViewHolderBase(holder: BaseHolder<ItemRecentBinding>, position: Int) {
        with(getItem(holder.adapterPosition)) {
            holder.binding.apply {
                // Set name of the sound
                tvNameSound.text = nameSound
                // Load image using Glide
                image?.let {
                    Glide.with(imSound.context)
                        .load(it)
                        .placeholder(R.drawable.ic_loading_image)
                        .error(R.drawable.ic_error_loading_image)
                        .into(imSound)
                }
                // Set play button icon based on whether the sound is currently playing
                if (path == MediaPlayerUtil.path) {
                    imPlay.setImageResource(if (MediaPlayerUtil.isPlaying) R.drawable.ic_pause else R.drawable.ic_play)
                } else {
                    imPlay.setImageResource(R.drawable.ic_play)
                }
            }
            // Set click listener for the item
            holder.itemView.setOnSafeClick {
                onclickItem(holder.bindingAdapterPosition, this)
            }
            // Set click listener for more options button
            holder.binding.imMore.setOnSafeClick {
                onclickMore(holder.bindingAdapterPosition, this)
            }
        }
    }
    /**
     * Returns the layout ID for the item view.
     * @author AnhTTH
     */
    override val layoutIdItem: Int
        get() = R.layout.item_recent
}