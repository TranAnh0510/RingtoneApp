package com.example.appa.ui.dialog

import android.graphics.Color
import android.os.Bundle
import android.view.View
import com.example.appa.R
import com.example.appa.databinding.DialogAscendingBinding
import com.example.appa.ui.base.BaseBindingDialogFragment
import com.example.appa.ui.customview.RippleCornerTextView
import com.example.appa.util.extension.dpToPx
import com.example.appa.util.extension.setOnSafeClick
/**
 * A dialog fragment for selecting ascending or descending order.
 * This dialog allows the user to choose between ascending and descending order for sorting.
 * @author AnhTTh
 */
class DialogAscending  : BaseBindingDialogFragment<DialogAscendingBinding>() {

    private var posX = 0f
    private var posY = 0f
    var isAscending = true

    var onClickAscending: (Boolean) -> Unit = {}
    /**
     * Returns the layout resource ID for the dialog.
     * @author AnhTTh
     */
    override val layoutId: Int
        get() = R.layout.dialog_ascending
    /**
     * Called when the dialog's view is created.
     * @author AnhTTh
     */
    override fun onCreatedView(view: View?, savedInstanceState: Bundle?) {
        dialog?.window?.setBackgroundDrawableResource(R.color.dialog_background_transparent)
        if (!isAscending) {
            binding.tvAscending.setNoSelect()
            binding.tvDecending.setSelect()
        } else {
            binding.tvAscending.setSelect()
            binding.tvDecending.setNoSelect()
        }
        initLayoutParam()
        initAction()
    }
    /**
     * Shows the dialog at the specified position.
     * @param posX The x-coordinate of the dialog's position.
     * @param posY The y-coordinate of the dialog's position.
     * @author AnhTTh
     */
    fun showDialog(
        posX: Float, posY: Float,
    ) {
        this.posX = posX
        this.posY = posY
    }
    /**
     * Initializes the actions for the dialog buttons.
     * @author AnhTTh
     */
    private fun initAction() {
        // Dismiss the dialog when clicking outside the dialog area

        binding.layoutRoot.setOnSafeClick {
            dismiss()
        }
        // Select ascending order
        binding.tvAscending.setOnSafeClick {
            binding.tvAscending.setSelect()
            binding.tvDecending.setNoSelect()
            onClickAscending(true)
            dismiss()
        }
        // Select descending order
        binding.tvDecending.setOnSafeClick {
            binding.tvAscending.setNoSelect()
            binding.tvDecending.setSelect()
            onClickAscending(false)
            dismiss()
        }
    }
    /**
     * Sets the appearance of the text view as selected.
     * @author AnhTTh
     */
    private fun RippleCornerTextView.setSelect() {
        setDrawableRight(R.drawable.done)
        setTextColor(Color.parseColor("#E2E4E9"))
    }
    /**
     * Sets the appearance of the text view as not selected.
     * @author AnhTTh
     */
    private fun RippleCornerTextView.setNoSelect() {
        setDrawableRight(0)
        setTextColor(Color.parseColor("#E2E4E9"))
    }
    /**
     * Initializes the layout parameters of the dialog.
     * @author AnhTTh
     */
    private fun initLayoutParam() {
        kotlin.runCatching {
            dialog?.let { safeDialog ->
                safeDialog.window?.decorView?.post {
                    if (isAdded) {
                        binding.rootContainer.x = posX - binding.rootContainer.width - 13f.dpToPx()
                        binding.rootContainer.y = posY - 30.dpToPx()

                    }
                }
            }
        }.onFailure {
            it.printStackTrace()
        }

    }
}

