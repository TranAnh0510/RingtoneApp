package com.example.appa.ui.dialog

import android.graphics.Color
import android.os.Bundle
import android.view.View
import com.example.appa.R
import com.example.appa.databinding.DialogSortBinding
import com.example.appa.ui.base.BaseBindingDialogFragment
import com.example.appa.ui.customview.RippleCornerTextView
import com.example.appa.util.extension.dpToPx
import com.example.appa.util.extension.setOnSafeClick

/**
 * Dialog fragment for sorting options.
 * @author AnhTTh
 */
class DialogSort : BaseBindingDialogFragment<DialogSortBinding>() {

    private var posX = 0f
    private var posY = 0f
    var typeSort = TYPE_AZ
    // Callback for sort type selection
    var onClickTypeSort: (Int) -> Unit = {}
    override val layoutId: Int
        get() = R.layout.dialog_sort
    /**
     * Called when the view is created.
     * @author AnhTTh
     */
    override fun onCreatedView(view: View?, savedInstanceState: Bundle?) {
        dialog?.window?.setBackgroundDrawableResource(R.color.dialog_background_transparent)
        when (typeSort) {
            TYPE_DATE -> {
                binding.tvSortAZ.setNoSelect()
                binding.tvDate.setSelect()
                binding.tvSize.setNoSelect()
            }

            TYPE_SIZE -> {
                binding.tvSortAZ.setNoSelect()
                binding.tvDate.setNoSelect()
                binding.tvSize.setSelect()
            }

            TYPE_AZ -> {
                binding.tvSortAZ.setSelect()
                binding.tvDate.setNoSelect()
                binding.tvSize.setNoSelect()
            }
        }
        initLayoutParam()
        initAction()
    }
    /**
     * Shows the sort dialog.
     * @param posX The x-coordinate of the dialog.
     * @param posY The y-coordinate of the dialog.
     * @author AnhTTh
     */
    fun showDialogSort(
        posX: Float, posY: Float
    ) {
        this.posX = posX
        this.posY = posY
//        show(fragmentManager, null)
    }
    /**
     * Initializes actions for UI elements.
     * @author AnhTTh
     */
    private fun initAction() {
        binding.layoutRoot.setOnSafeClick {
            dismiss()
        }

        binding.tvSortAZ.setOnSafeClick {
            binding.tvSortAZ.setSelect()
            binding.tvDate.setNoSelect()
            binding.tvSize.setNoSelect()
            onClickTypeSort(TYPE_AZ)
            dismiss()
        }

        binding.tvDate.setOnSafeClick {
            binding.tvSortAZ.setNoSelect()
            binding.tvDate.setSelect()
            binding.tvSize.setNoSelect()
            onClickTypeSort(TYPE_DATE)
            dismiss()
        }

        binding.tvSize.setOnSafeClick {
            binding.tvSortAZ.setNoSelect()
            binding.tvDate.setNoSelect()
            binding.tvSize.setSelect()
            onClickTypeSort(TYPE_SIZE)
            dismiss()
        }

    }
    /**
     * Sets the view as selected.
     * @author AnhTTh
     */
    private fun RippleCornerTextView.setSelect() {
        setDrawableRight(R.drawable.done)
        setTextColor(Color.parseColor("#E2E4E9"))
    }
    /**
     * Sets the view as not selected.
     * @author AnhTTh
     */
    private fun RippleCornerTextView.setNoSelect() {
        setDrawableRight(0)
        setTextColor(Color.parseColor("#E2E4E9"))
    }

    /**
     * Initializes layout parameters.
     * @author AnhTTh
     */
    private fun initLayoutParam() {
        kotlin.runCatching {
            dialog?.let { safeDialog ->
                safeDialog.window?.decorView?.post {
                    if (isAdded) {
                        binding.rootContainer.x = posX + 16
                        binding.rootContainer.y = posY - 30.dpToPx()

                    }
                }
            }
        }.onFailure {
            it.printStackTrace()
        }

    }
}
// Constants for sorting types
const val TYPE_AZ = 1
const val TYPE_DATE = 2
const val TYPE_SIZE = 3