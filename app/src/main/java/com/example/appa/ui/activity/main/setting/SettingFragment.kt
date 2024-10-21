package com.example.appa.ui.activity.main.setting

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import com.example.appa.R
import com.example.appa.common.Constant
import com.example.appa.common.Constant.KEY_IS_RATE
import com.example.appa.data.local.shared.SharedPreferenceHelper
import com.example.appa.databinding.FragmentSettingBinding
import com.example.appa.ui.activity.main.MainActivity
import com.example.appa.ui.activity.multilang.MultiLangAct
import com.example.appa.ui.base.BaseBindingFragment
import com.example.appa.ui.dialog.DialogRate
import com.example.appa.util.extension.gone
import com.example.appa.util.extension.hideSystemUI
import com.example.appa.util.extension.setOnSafeClick
import com.example.appa.util.extension.visible
import com.example.appa.util.shareAppLink

/**
 * Manage settings in the application
 * @author AnhTTH
 */
class SettingFragment : BaseBindingFragment<FragmentSettingBinding, SettingViewModel>() {

    /**
     * dialog for users to rate the application
     * @author AnhTTH
     */
    private val ratingDialog: DialogRate by lazy {
        DialogRate().apply {
            /**
             * Display a "thank you" message and close the dialog when the user rates
             * @author AnhTTH
             */
            onRating = {
                toast(getString(R.string.thank_you))
                ratingDialog.dismiss()
            }
            /**
             * Show notification and close dialog when user rates
             * @author AnhTTH
             */
            onClickFiveStar = {
                binding.tvRateUs.gone()
                toast(getString(R.string.thank_you))
                ratingDialog.dismiss()
            }
            /**
             * Hide system interface when dialog is closed
             * @author AnhTTH
             */
            onDismiss = {
                activity?.hideSystemUI()
            }
        }
    }

    /**
     * Returns the [Class] object that represents the [SettingViewModel] class.
     * This method is overridden from the base class [BaseFragment] to provide the appropriate ViewModel class.
     * @return The [Class] object representing the [SettingViewModel] class.
     * @author AnhTTH
     */
    override fun getViewModel(): Class<SettingViewModel> {
        return SettingViewModel::class.java
    }

    /**
     * This method is overridden from the base class [BaseFragment] but left empty.
     * It's intended to be implemented by subclasses to handle back press events.
     * @author AnhTTH
     */
    override fun registerOnBackPress() {

    }

    /**
     * Returns the layout resource ID for the setting fragment.
     * @return The layout resource ID.
     * @author AnhTTH
     */
    override val layoutId: Int
        get() = R.layout.fragment_setting

    /**
     * Called when the view for the setting fragment is created.
     * This method initializes the UI components, such as showing the rate and initializing actions.
     * @param view The created view.
     * @param savedInstanceState The saved instance state, if any.
     * @author AnhTTH
     */
    override fun onCreatedView(view: View?, savedInstanceState: Bundle?) {
        showRate()
        initAction()
    }

    /**
     * Set actions for interface elements
     * @author AnhTTH
     */
    private fun initAction() {
        /**
         * Start the language change function
         * @author AnhTTH
         */
        binding.tvLanguageOptions.setOnSafeClick {
            (activity as MainActivity).isDispatchTouchEvent(1000)
            startMultiLanguage()
        }

        /**
         * show ratingDialog
         * @author AnhTTH
         */
        binding.tvRateUs.setOnSafeClick {
            (activity as MainActivity).isDispatchTouchEvent(1000)
            ratingDialog.show(childFragmentManager.beginTransaction().remove(ratingDialog), null)
        }


    }

    /**
     * Go to MultiLanguage
     * @author AnhTTH
     */
    private fun startMultiLanguage() {
        Intent(
            context, MultiLangAct::class.java
        ).apply {
            putExtra(Constant.TYPE_LANG, 2)
            startActivity(this)
        }
    }

    /**
     * Check if users have rated the app
     * @author AnhTTH
     */
    private fun showRate() {
        val isRate = SharedPreferenceHelper.getBoolean(
            KEY_IS_RATE, false
        )
        if (isRate) {
            binding.tvRateUs.gone()
        } else {
            binding.tvRateUs.visible()
        }

    }
}