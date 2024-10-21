package com.example.appa.ui.dialog

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import com.example.appa.R
import com.example.appa.common.Constant
import com.example.appa.data.local.shared.SharedPreferenceHelper
import com.example.appa.databinding.DialogRateBinding
import com.example.appa.ui.base.BaseBindingDialogFragment
import com.example.appa.util.extension.setOnSafeClick
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * The DialogRate class extends BaseBindingDialogFragment and represents a dialog
 * for rating purposes.
 */
class DialogRate : BaseBindingDialogFragment<DialogRateBinding>() {
    /** Callback for when the user clicks on five stars. */
    var onClickFiveStar: (() -> Unit) = {}

    /** Callback for when rating occurs. */
    var onRating: (() -> Unit) = {}

    /** Callback for when the dialog is dismissed. */
    var onDismiss: () -> Unit = {}

    /** Returns the layout resource ID for the dialog. */
    override val layoutId: Int
        get() = R.layout.dialog_rate

    /**
     * Fragment view is created
     * @author AnhTTH
     */
    override fun onCreatedView(view: View?, savedInstanceState: Bundle?) {
        initAction()
        initListener()
        binding.ratingBar.rating = 5f
    }

    /**
     * Register a listener for RatingBar to listen for user changes
     * @author AnhTTH
     */
    private fun initListener() {
        /**
         * Set up a listener for RatingBar to listen for rating change events
         * @author AnhTTH
         */
        binding.ratingBar.setOnRatingChangeListener { ratingBar, numberRate, fromUser ->
            when (numberRate) {
                1f -> {
                    context?.setDataRate(
                        title = R.string.title_rate_1,
                        content = R.string.content_rate_1_2_3,
                        icon = R.drawable.img_rating_1
                    )
                }

                2f -> {
                    context?.setDataRate(
                        title = R.string.title_rate_2,
                        content = R.string.content_rate_1_2_3,
                        icon = R.drawable.img_rating_2
                    )
                }

                3f -> {
                    context?.setDataRate(
                        title = R.string.title_rate_3,
                        content = R.string.content_rate_1_2_3,
                        icon = R.drawable.img_rating_3
                    )
                }

                4f -> {
                    context?.setDataRate(
                        title = R.string.title_rate_4,
                        content = R.string.content_rate_4_5,
                        icon = R.drawable.img_rating_4
                    )
                }

                5f -> {
                    context?.setDataRate(
                        title = R.string.title_rate_5,
                        content = R.string.content_rate_4_5,
                        icon = R.drawable.img_rating_5
                    )
                }

                else -> {
                    context?.setDataRate(
                        title = R.string.title_rate_default,
                        content = R.string.content_rate_default,
                        icon = R.drawable.im_rate_default
                    )
                }
            }
        }
    }

    /**
     * set data to update the user interface
     * @author AnhTTH
     */
    private fun Context.setDataRate(title: Int, content: Int, icon: Int) {
        binding.tvTitle.text = getString(title)
        binding.tvContent.text = getString(content)
        binding.imgIcon.setImageResource(icon)
    }

    /**
     * Set actions for interface elements
     * event handling when user clicks on rating btnRate and exit tvExit
     * @author AnhTTH
     */
    private fun initAction() {
        binding.btnRate.setOnSafeClick {
            if (binding.ratingBar.rating == 0f) {
                toast(getString(R.string.please_feedback))
            } else {
                binding.imgIcon.visibility = View.VISIBLE
                if (binding.ratingBar.rating == 5f) {
                    lifecycleScope.launch(Dispatchers.IO) {
                        SharedPreferenceHelper.storeBoolean(Constant.KEY_IS_RATE, true)
                        withContext(Dispatchers.Main) {
                            onClickFiveStar()
                        }
                    }
                } else {
                    onRating()
                }
            }
        }
        binding.tvExit.setOnClickListener { dismiss() }
    }


}