package com.example.appa.ui.dialog

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import com.example.appa.R
import com.example.appa.databinding.DialogChangeNameMySoundBinding
import com.example.appa.ui.base.BaseBindingDialogFragment
import com.example.appa.util.containsNonAllowedCharacters
import com.example.appa.util.extension.setOnSafeClick
import com.example.appa.util.showSoftKeyboardEdt
/**
 * A dialog fragment for changing the name of a sound in "My Sounds".
 * This dialog allows the user to enter a new name for the sound and confirm the change.
 * @author AnhTTH
 */
class DialogChangeNameMySound : BaseBindingDialogFragment<DialogChangeNameMySoundBinding>() {
    /**
     * The action to be performed when confirming the new name.
     * @author AnhTTH
     */
    var onClickConfirm: (String) -> Unit = { _ -> }
    /**
     * Returns the layout resource ID for the dialog.
     * @author AnhTTH
     */
    override val layoutId: Int
        get() = R.layout.dialog_change_name_my_sound
    /**
     * Called when the dialog's view is created.
     * @author AnhTTH
     */
    override fun onCreatedView(view: View?, savedInstanceState: Bundle?) {
        activity?.showSoftKeyboardEdt(binding.edtInputPlayList)
        dialog?.window?.setBackgroundDrawableResource(R.color.dialog_background)
        initAction()
    }
    /**
     * Initializes the actions for the dialog buttons.
     * @author AnhTTH
     */
    private fun initAction() {
        // Cancel button action
        binding.btnCancel.setOnSafeClick {
            binding.edtInputPlayList.clearFocus()
            dismiss()
        }
        // Confirm button action
        binding.btnConfirm.setOnSafeClick {
            val text = try {
                binding.edtInputPlayList.text.toString().trim()
            } catch (e: Exception) {
                ""
            }
            if (text.isEmpty()) {
                toast(getString(R.string.new_name))
            } else if (text.containsNonAllowedCharacters()) {
                toast(getString(R.string.character_name))
            } else {
                onClickConfirm(text)
                binding.edtInputPlayList.clearFocus()
                dismiss()
            }
            binding.edtInputPlayList.showSoftInputOnFocus = false
        }
    }
    /**
     * Called when the dialog is dismissed.
     * @author AnhTTH
     */
    override fun onDismiss(dialog: DialogInterface) {
        super.onDismiss(dialog)
        kotlin.runCatching {
            binding.edtInputPlayList.setText("")
            binding.edtInputPlayList.clearFocus()
        }.onFailure { it.printStackTrace() }
    }
}