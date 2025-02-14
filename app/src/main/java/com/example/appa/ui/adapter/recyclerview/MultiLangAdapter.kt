package com.example.appa.ui.adapter.recyclerview

import androidx.recyclerview.widget.DiffUtil
import com.example.appa.R
import com.example.appa.data.model.LanguageUI
import com.example.appa.databinding.ItemMultiLangBinding
import com.example.appa.ui.base.BaseBindingAdapterDiff
import com.example.appa.util.extension.setOnSafeClick


class MultiLangAdapter : BaseBindingAdapterDiff<LanguageUI, ItemMultiLangBinding>(
    object : DiffUtil.ItemCallback<LanguageUI>() {
        override fun areItemsTheSame(oldItem: LanguageUI, newItem: LanguageUI): Boolean {
            return oldItem.code == newItem.code
        }

        override fun areContentsTheSame(oldItem: LanguageUI, newItem: LanguageUI): Boolean {
            return oldItem == newItem
        }
    }
) {
    /**
     * store old position of item in list
     * @author AnhTTH
     */
    private var oldPosition: Int = -1
        set(value) {
            field = value
            notifyItemChanged(value)
        }

    /**
     * store new position of item in list
     * @author AnhTTH
     */
    var newPosition: Int = -1
        set(value) {
            oldPosition = field
            field = value
            notifyItemChanged(value)
        }

    /**
     * callback for item click
     * @author AnhTTH
     */
    var callBack: (Int, LanguageUI) -> Unit = { _, _ -> }

    /**
     * assign data to views in ViewHolder at the given location
     * @author AnhTTH
     */
    override fun onBindViewHolderBase(holder: BaseHolder<ItemMultiLangBinding>, position: Int) {
        with(getItem(holder.adapterPosition)) {
            holder.binding.apply {
                if (holder.adapterPosition == newPosition) {
                    imRadioButton.setImageResource(R.drawable.ic_language_selected)
                    itemLanguage.setBackgroundResource(R.drawable.bg_language_selected)
                } else {
                    imRadioButton.setImageResource(R.drawable.ic_language_notselected)
                    itemLanguage.setBackgroundResource(R.drawable.bg_language_unselected)
                }
                tvCountry.text = name
                avatar?.let { imFrag.setImageResource(it) }
                root.setOnSafeClick {
                    callBack(position, this@with)
                    newPosition = holder.adapterPosition
                }

            }
        }

    }

    override val layoutIdItem: Int
        get() = R.layout.item_multi_lang
}