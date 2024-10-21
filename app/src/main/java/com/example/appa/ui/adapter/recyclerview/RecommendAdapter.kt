package com.example.appa.ui.adapter.recyclerview

import androidx.recyclerview.widget.DiffUtil
import com.example.appa.R
import com.example.appa.data.model.ItemRecommend
import com.example.appa.databinding.ItemHistorySearchBinding
import com.example.appa.ui.base.BaseBindingAdapterDiff
import com.example.appa.util.extension.setOnSafeClick

/**
 * RecommendAdapter is a custom adapter that extends BaseBindingPagerAdapter.
 * It is used to bind audio item data to a view for a RecyclerView with view binding.
 */
class RecommendAdapter : BaseBindingAdapterDiff<ItemRecommend, ItemHistorySearchBinding>(object :
    DiffUtil.ItemCallback<ItemRecommend>() {
    /**
     * Checks if two items have the same path.
     * @param oldItem The old item.
     * @param newItem The new item.
     * @return True if the paths are the same, false otherwise.
     */
    override fun areItemsTheSame(oldItem: ItemRecommend, newItem: ItemRecommend): Boolean {
        return oldItem.id == newItem.id
    }

    /**
     * Checks if the contents of two items are the same.
     * @param oldItem The old item.
     * @param newItem The new item.
     * @return True if the contents are the same, false otherwise.
     */
    override fun areContentsTheSame(oldItem: ItemRecommend, newItem: ItemRecommend): Boolean {
        return oldItem == newItem
    }
}) {
    /**
     * Lambda function to handle item click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    var onclickItem: (Int, ItemRecommend) -> Unit = { _, _ -> }

    /**
     * Binds the data to the view holder.
     * @param holder The view holder.
     * @param position The position of the item in the adapter.
     */
    override fun onBindViewHolderBase(holder: BaseHolder<ItemHistorySearchBinding>, position: Int) {
        with(getItem(holder.bindingAdapterPosition)) {
            with(holder.binding) {
                tvHistorySearch.text = nameRecommend

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
        get() = R.layout.item_history_search
}