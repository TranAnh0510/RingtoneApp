package com.example.appa.ui.adapter.recyclerview

import androidx.recyclerview.widget.DiffUtil
import com.example.appa.R
import com.example.appa.data.model.ItemRecordingUI
import com.example.appa.databinding.ItemRecordingBinding
import com.example.appa.ui.base.BaseBindingAdapterDiff
import com.example.appa.util.extension.setOnSafeClick
import com.example.appa.util.setVisibility
/**
 * RecordAdapter is a custom adapter that extends BaseBindingPagerAdapter.
 * It is used to bind audio item data to a view for a RecyclerView with view binding.
 */
class RecordAdapter : BaseBindingAdapterDiff<ItemRecordingUI, ItemRecordingBinding>(object :
    DiffUtil.ItemCallback<ItemRecordingUI>() {
    /**
     * Checks if two items have the same path.
     * @param oldItem The old item.
     * @param newItem The new item.
     * @return True if the paths are the same, false otherwise.
     */
    override fun areItemsTheSame(oldItem: ItemRecordingUI, newItem: ItemRecordingUI): Boolean {
        return oldItem.date == newItem.date
    }
    /**
     * Checks if the contents of two items are the same.
     * @param oldItem The old item.
     * @param newItem The new item.
     * @return True if the contents are the same, false otherwise.
     */
    override fun areContentsTheSame(oldItem: ItemRecordingUI, newItem: ItemRecordingUI): Boolean {
        return oldItem == newItem
    }
}
) {
    /**
     * Lambda function to handle item click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    var onclickItem: (Int, ItemRecordingUI) -> Unit = { _, _ -> }
    /**
     * Lambda function to handle play button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    var onclickPlay: (Int, ItemRecordingUI) -> Unit = { _, _ -> }
    /**
     * Lambda function to handle rewind 15 seconds button click events.
     * The parameter is the position of the clicked item.
     */
    var onclickRewind15s: (Int) -> Unit = { _ -> }
    /**
     * Lambda function to handle fast forward 15 seconds button click events.
     * The parameter is the position of the clicked item.
     */
    var onclickFastForward15s: (Int) -> Unit = { _ -> }
    /**
     * Lambda function to handle "more" button click events.
     * The first parameter is the position of the clicked item.
     * The second parameter is the clicked item itself.
     */
    var onclickMore: (Int, ItemRecordingUI) -> Unit = { _, _ -> }
    /**
     * Indicates whether an item is currently playing.
     */
    var isPlay = false
    /**
     * Binds the data to the view holder.
     * @param holder The view holder.
     * @param position The position of the item in the adapter.
     */
    override fun onBindViewHolderBase(holder: BaseHolder<ItemRecordingBinding>, position: Int) {
        with(getItem(holder.bindingAdapterPosition)) {
            with(holder.binding) {
                tvNameRecording.text = nameRecording
                tvDateAndCapacity.text = "$date - $sizeData"
                setVisibility(
                    isSelect,
                    seekBar,
                    tvTimeStart,
                    tvTimeEnd,
                    imRewind15s,
                    imFastForward15s,
                    imPlay,
                    tvLineSelect
                )
                setVisibility(!isSelect, tvLineUnSelect)
            }
            holder.binding.imMore.setOnSafeClick {
                onclickMore(holder.bindingAdapterPosition, this)
            }

            holder.binding.imPlay.setOnSafeClick {
                isPlay = !isPlay
                holder.binding.imPlay.setImageResource(if (isPlay) R.drawable.ic_pause else R.drawable.ic_play_recording)
                onclickPlay(holder.bindingAdapterPosition, this)
            }
            holder.binding.imRewind15s.setOnSafeClick {
                onclickRewind15s(holder.bindingAdapterPosition)
            }
            holder.binding.imFastForward15s.setOnSafeClick {
                onclickFastForward15s(holder.bindingAdapterPosition)
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
        get() = R.layout.item_recording


}