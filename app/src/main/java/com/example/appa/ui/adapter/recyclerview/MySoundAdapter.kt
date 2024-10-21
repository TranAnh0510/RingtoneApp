package com.example.appa.ui.adapter.recyclerview

import androidx.recyclerview.widget.DiffUtil
import com.bumptech.glide.Glide
import com.example.appa.R
import com.example.appa.data.model.ItemMySoundUI
import com.example.appa.databinding.ItemMySoundsBinding
import com.example.appa.ui.base.BaseBindingAdapterDiff
import com.example.appa.util.extension.gone
import com.example.appa.util.extension.setOnSafeClick
import com.example.appa.util.extension.visible
/**
 * MySoundAdapter is a custom adapter that extends BaseBindingPagerAdapter.
 * It is used to bind audio item data to a view for a RecyclerView with view binding.
 */
class MySoundAdapter : BaseBindingAdapterDiff<ItemMySoundUI, ItemMySoundsBinding>(object :
    DiffUtil.ItemCallback<ItemMySoundUI>() {
    /**
     * Checks if two items have the same path.
     * @param oldItem The old item.
     * @param newItem The new item.
     * @return True if the paths are the same, false otherwise.
     */
    override fun areItemsTheSame(oldItem: ItemMySoundUI, newItem: ItemMySoundUI): Boolean {
        return oldItem.path == newItem.path
    }
    /**
     * Checks if the contents of two items are the same.
     * @param oldItem The old item.
     * @param newItem The new item.
     * @return True if the contents are the same, false otherwise.
     */
    override fun areContentsTheSame(oldItem: ItemMySoundUI, newItem: ItemMySoundUI): Boolean {
        return oldItem == newItem
    }
}
) {
    /**
     * Indicates whether an item is selected.
     */
    var isSelect = false
    /**
     * Lambda function to handle item click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    var onclickItem: (Int, ItemMySoundUI) -> Unit = { _, _ -> }
    /**
     * Lambda function to handle edit button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    var onclickEdit: (Int, ItemMySoundUI) -> Unit = { _, _ -> }
    /**
     * Lambda function to handle "more" button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    var onclickMore: (Int, ItemMySoundUI) -> Unit = { _, _ -> }
    /**
     * Lambda function to handle change name button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    var onclickChangeName: (Int, ItemMySoundUI) -> Unit = { _, _ -> }
    /**
     * Binds the data to the view holder.
     * @param holder The view holder.
     * @param position The position of the item in the adapter.
     */
    override fun onBindViewHolderBase(holder: BaseHolder<ItemMySoundsBinding>, position: Int) {
        with(getItem(holder.bindingAdapterPosition)) {
            with(holder.binding) {
                Glide.with(imRingTone.context)
                    .load(R.drawable.im_audio_device)
                    .placeholder(R.drawable.ic_loading_image)
                    .error(R.drawable.ic_error_loading_image)
                    .into(imRingTone)
                tvNameRingTone.text = nameRingtone
                tvNameSinger.text = duration
                if (isSelect) {
                    tvEdit.visible()
                    tvChangeName.visible()
                    tvMore.visible()
                    tvLineSelect.gone()
                } else {
                    tvEdit.gone()
                    tvChangeName.gone()
                    tvMore.gone()
                    tvLineSelect.visible()
                }
            }
            holder.binding.tvEdit.setOnSafeClick {
                onclickEdit(holder.bindingAdapterPosition, this)
            }
            holder.binding.tvChangeName.setOnSafeClick {
                onclickChangeName(holder.bindingAdapterPosition, this)
            }
            holder.binding.tvMore.setOnSafeClick {
                onclickMore(holder.bindingAdapterPosition, this)
            }
            holder.itemView.setOnSafeClick {
                onclickItem(holder.bindingAdapterPosition, this)
            }
        }

    }

    /**
     * Returns the layout resource ID for the item.
     * @return The layout resource ID.
     */
    override val layoutIdItem: Int
        get() = R.layout.item_my_sounds
}