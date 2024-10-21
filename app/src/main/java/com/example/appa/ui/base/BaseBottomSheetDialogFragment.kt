package com.example.appa.ui.base

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.Window
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
open class BaseBottomSheetDialogFragment :BottomSheetDialogFragment(){
    override fun onStart() {
        super.onStart()
//        dialog?.let {
//            val width = ViewGroup.LayoutParams.MATCH_PARENT
//            val height = ViewGroup.LayoutParams.WRAP_CONTENT
//            it.window?.setLayout(width, height)
//        }
    }


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
//        dialog.window?.let {
//            it.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT));
//            it.requestFeature(Window.FEATURE_NO_TITLE);
////            setStyle(STYLE_NORMAL, R.style.DialogSlideAnim)
//            it.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
//        }

        return dialog
    }
}