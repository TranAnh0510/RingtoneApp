package com.example.appa.ui.adapter.viewpager

import androidx.recyclerview.widget.DiffUtil
import com.example.appa.R
import com.example.appa.data.model.IntroUI
import com.example.appa.databinding.ItemIntroBinding
import com.example.appa.ui.base.BaseBindingAdapterDiff

class IntroAdapter : BaseBindingAdapterDiff<IntroUI, ItemIntroBinding>(
    object : DiffUtil.ItemCallback<IntroUI>() {
        override fun areItemsTheSame(oldItem: IntroUI, newItem: IntroUI): Boolean {
            return oldItem.title == newItem.title
        }

        override fun areContentsTheSame(oldItem: IntroUI, newItem: IntroUI): Boolean {
            return oldItem == newItem
        }
    }
) {

    /**
     * Assign data to views in ViewHolder at the given location
     * @author AnhTTH
     */
    override fun onBindViewHolderBase(holder: BaseHolder<ItemIntroBinding>, position: Int) {
        with(getItem(holder.adapterPosition)) {
            holder.binding.apply {
                imIntro.setImageResource(icon ?: 0)
                tvTitle.text = title ?: ""
                tvContent.text = content ?: ""
                tvContent.requestLayout()
            }
        }
    }

    override val layoutIdItem: Int
        get() = R.layout.item_intro
}