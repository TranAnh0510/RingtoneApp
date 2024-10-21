package com.example.appa.ui.customview

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.res.ResourcesCompat
import androidx.databinding.DataBindingUtil
import com.example.appa.R
import com.example.appa.databinding.CustomBottomNavigationBinding
import com.example.appa.util.extension.setOnSafeClick
/**
 * Custom view for bottom navigation.
 * @author AnhTTh
 */
class CustomBottomNavigation : ConstraintLayout {
    // Callback for tab click event
    var onClickTab: ((pos: Int) -> Unit) = {}
    // Callback for new sound click event
    var onClickNewSound: (() -> Unit) = {}
    // Data binding instance
    private val binding: CustomBottomNavigationBinding = DataBindingUtil.inflate(
        LayoutInflater.from(context), R.layout.custom_bottom_navigation, this, true
    )
    // Enumeration for types of selection
    enum class TypeSelect {
        TYPE_RINGTONE, TYPE_FAVORITE, TYPE_MY_SOUND, TYPE_SETTING
    }
    /**
     * Updates UI based on the selected type.
     * @param type The type of selection.
     * @author AnhTTh
     */

    private fun updateUI(type: TypeSelect) {
        when (type) {
            TypeSelect.TYPE_FAVORITE -> {
                binding.imRingtones.setImageResource(R.drawable.ic_ringtone_unselected)
                binding.imFavorite.setImageResource(R.drawable.ic_favorite_selected)
                binding.imMySound.setImageResource(R.drawable.ic_my_sound_unselected)
                binding.imSetting.setImageResource(R.drawable.ic_setting_unselected)



            }

            TypeSelect.TYPE_MY_SOUND -> {
                binding.imRingtones.setImageResource(R.drawable.ic_ringtone_unselected)
                binding.imFavorite.setImageResource(R.drawable.ic_favorite_unselected)
                binding.imMySound.setImageResource(R.drawable.ic_my_sound_selected)
                binding.imSetting.setImageResource(R.drawable.ic_setting_unselected)

            }

            TypeSelect.TYPE_SETTING -> {
                binding.imRingtones.setImageResource(R.drawable.ic_ringtone_unselected)
                binding.imFavorite.setImageResource(R.drawable.ic_favorite_unselected)
                binding.imMySound.setImageResource(R.drawable.ic_my_sound_unselected)
                binding.imSetting.setImageResource(R.drawable.ic_setting_selected)

            }

            else -> {
                binding.imRingtones.setImageResource(R.drawable.ic_ringtone_selected)
                binding.imFavorite.setImageResource(R.drawable.ic_favorite_unselected)
                binding.imMySound.setImageResource(R.drawable.ic_my_sound_unselected)
                binding.imSetting.setImageResource(R.drawable.ic_setting_unselected)

            }
        }
    }
    /**
     * Constructor with context.
     * @author AnhTTh
     */
    constructor(context: Context) : super(context) {
        initView()
    }
    /**
     * Initializes the view.
     * @author AnhTTh
     */
    private fun initView() {
        updateUI(TypeSelect.TYPE_RINGTONE)

        initListener()
    }
    /**
     * Simulates click on "My Sound" tab.
     * @author AnhTTh
     */
    fun clickMySound() {
        updateUI(TypeSelect.TYPE_MY_SOUND)
        onClickTab(2)
    }
    /**
     * Initializes listeners for UI elements.
     * @author AnhTTh
     */
    private fun initListener() {

        binding.itemRingtones.setOnSafeClick {
            updateUI(TypeSelect.TYPE_RINGTONE)
            onClickTab(0)
        }

        binding.itemFavorite.setOnSafeClick {
            updateUI(TypeSelect.TYPE_FAVORITE)
            onClickTab(1)
        }

        binding.itemMySound.setOnSafeClick {
            updateUI(TypeSelect.TYPE_MY_SOUND)
            onClickTab(2)
        }

        binding.itemSetting.setOnSafeClick {
            updateUI(TypeSelect.TYPE_SETTING)
            onClickTab(3)
        }

        binding.itemNewSound.setOnSafeClick {
            onClickNewSound()
        }
    }
    /**
     * Constructor with context and attributes.
     * @author AnhTTh
     */
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        initView()
    }
    /**
     * Constructor with context, attributes, and default style.
     * @author AnhTTh
     */
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        initView()
    }
    /**
     * Constructor with context, attributes, default style, and default resource.
     * @author AnhTTh
     */
    constructor(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
        initView()
    }
}