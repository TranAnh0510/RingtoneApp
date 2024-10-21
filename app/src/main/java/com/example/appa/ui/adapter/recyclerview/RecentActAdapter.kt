package com.example.appa.ui.adapter.recyclerview

import androidx.recyclerview.widget.DiffUtil
import com.bumptech.glide.Glide
import com.example.appa.R
import com.example.appa.data.model.ItemRecent
import com.example.appa.databinding.ItemRecentActBinding
import com.example.appa.ui.base.BaseBindingAdapterDiff
import com.example.appa.util.MediaPlayerUtil
import com.example.appa.util.extension.gone
import com.example.appa.util.extension.setOnSafeClick
import com.example.appa.util.extension.visible

/**
 * displays a list of recent items
 * @author AnhTTH
 */
class RecentActAdapter : BaseBindingAdapterDiff<ItemRecent, ItemRecentActBinding>(object :
    DiffUtil.ItemCallback<ItemRecent>() {
    override fun areItemsTheSame(oldItem: ItemRecent, newItem: ItemRecent): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ItemRecent, newItem: ItemRecent): Boolean {
        return oldItem == newItem
    }
}
) {
    /**
     * handle an event when a user clicks an item, download button,
     * or "More options" button. handle an event when a user clicks an item,
     * download button, or "More options" button.
     * @author AnhTTH
     */
    var onclickItem: (Int, ItemRecent) -> Unit = { _, _ -> }
    var onclickDownload: (Int, ItemRecent) -> Unit = { _, _ -> }
    var onclickMore: (Int, ItemRecent) -> Unit = { _, _ -> }

    /**
     * Notifies updates to list items when paths change
     * @author AnhTTH
     */
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

    /**
     * Notifies the update of a list item based on a new path
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
     * assign data to a specific ViewHolder in RecyclerView
     * @author AnhTTH
     */
    override fun onBindViewHolderBase(holder: BaseHolder<ItemRecentActBinding>, position: Int) {
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
                tvNameRingTone.text = nameSound
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

    override val layoutIdItem: Int
        get() = R.layout.item_recent_act
}