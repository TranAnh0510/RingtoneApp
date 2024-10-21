package com.example.appa.ui.base

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.ViewGroup
import android.view.Window
import androidx.fragment.app.DialogFragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
open class BaseDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        /**
         * Tạo hộp thoại từ DialogFragment.
         * @author AnhTTH
         */
        val dialog = super.onCreateDialog(savedInstanceState)

        dialog.window?.let {
            /**
             * Set the background of the dialog window to transparent.
             * @author AnhTTH
             */
            it.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT));
            /**
             * Requires untitled window
             * @author ATTH
             */
            it.requestFeature(Window.FEATURE_NO_TITLE);
//            setStyle(STYLE_NO_FRAME, R.style.CustomBottomSheetDialogTheme)
            /**
             * Set the size of the dialog window to take up the full width and height of the screen.
             * @author AnhTTH
             */
            it.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        }
        return dialog
    }

    /**
     * Make default settings
     * @author AnhTTH
     */
    override fun onStart() {
        super.onStart()
        dialog?.let {
            /**
             * takes up the entire width of the screen
             * @author AnhTTH
             */
            val width = ViewGroup.LayoutParams.MATCH_PARENT
            val height = ViewGroup.LayoutParams.MATCH_PARENT
            /**
             *Set the size of the dialog window using width values and the specified height
             * @author AnhTTH
             */
            it.window?.setLayout(width, height)
        }
    }

}