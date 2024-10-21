package com.example.appa.ui.adapter.recyclerview

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil
import com.bumptech.glide.Glide
import com.example.appa.R
import com.example.appa.data.model.musicserver.MusicServerCategoriesUI
import com.example.appa.databinding.ItemCategoriesBinding
import com.example.appa.ui.base.BaseBindingAdapterDiff
import com.example.appa.util.extension.setOnSafeClick
import com.example.appa.util.setNameCategory

/**
 * Adapter for displaying music categories in a RecyclerView.
 * @author AnhTTH
 */
class CategoryHomeAdapter :
    BaseBindingAdapterDiff<MusicServerCategoriesUI, ItemCategoriesBinding>(object :
        DiffUtil.ItemCallback<MusicServerCategoriesUI>() {
        override fun areItemsTheSame(
            oldItem: MusicServerCategoriesUI, newItem: MusicServerCategoriesUI
        ): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(
            oldItem: MusicServerCategoriesUI, newItem: MusicServerCategoriesUI
        ): Boolean {
            return oldItem == newItem
        }
    }) {

    var onclickItem: (Int, MusicServerCategoriesUI) -> Unit = { _, _ -> }

    /**
     * Binds the data to the views of the item at the specified position.
     * @param holder The ViewHolder containing the views.
     * @param position The position of the item in the adapter.
     * @author AnhTTH
     */
    @SuppressLint("SetTextI18n")
    override fun onBindViewHolderBase(holder: BaseHolder<ItemCategoriesBinding>, position: Int) {
        with(getItem(holder.bindingAdapterPosition)) {
            val context = holder.itemView.context
            holder.binding.apply {
                // Set category name and number of sounds
                tvNameCategories.text = name.setNameCategory(context)
                tvSoundNumber.text =
                    "$numberSong " + if (numberSong > 1) context.getString(R.string.sounds) else context.getString(
                        R.string.sound
                    )
                // Load image using Glide
                image?.let {
                    Glide.with(imCategory.context).load(it).placeholder(R.drawable.ic_loading_image)
                        .error(R.drawable.ic_error_loading_image).into(imCategory)
                }

            }
            // Set click listener for the item
            holder.itemView.setOnSafeClick {
                onclickItem(holder.bindingAdapterPosition, this)
            }
        }
    }

    /**
     * Returns the layout ID for the item view.
     * @author AnhTTH
     */
    override val layoutIdItem: Int
        get() = R.layout.item_categories
}