package com.example.appa.ui.dialog

import android.os.Bundle
import android.view.View
import com.example.appa.R
import com.example.appa.databinding.DialogDeniedWriteSettingBinding
import com.example.appa.ui.base.BaseBindingDialogFragment
import com.example.appa.util.extension.setOnSafeClick


class DialogDeniedWriteSetting :
    BaseBindingDialogFragment<DialogDeniedWriteSettingBinding>() {

    var onClickCancel: (() -> Unit) = {}
    var onClickGotoSetting: (() -> Unit) = {}

    override val layoutId: Int
        get() = R.layout.dialog_denied_write_setting

    override fun onCreatedView(view: View?, savedInstanceState: Bundle?) {
        /**
         * Set background color for dialog
         * @author AnhTTH
         */
        dialog?.window?.setBackgroundDrawableResource(R.color.dialog_background)
        initListener()
        binding.tvGoToSetting.isSelected = true
    }
    /**
     * Set click actions for interface elements
     * @author AnhTTH
     */
    private fun initListener() {
        /**
         * When tvCancel is pressed, the dialog will be closed
         * @author AnhTTH
         */
        binding.tvCancel.setOnSafeClick {
            onClickCancel()
            dismiss()
        }
        /**
         * allows the subsequent processing when the user clicks the "Go to Setting" button
         * to be defined outside the Dialog class.
         * @author AnhTTH
         */
        binding.tvGoToSetting.setOnSafeClick {
            onClickGotoSetting()
        }
    }
}