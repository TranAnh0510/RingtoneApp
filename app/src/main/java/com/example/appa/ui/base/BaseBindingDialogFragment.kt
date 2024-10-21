package com.example.appa.ui.base

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseBindingDialogFragment<B : ViewDataBinding> : BaseDialogFragment() {
    protected lateinit var binding: B
    protected abstract val layoutId: Int
    protected abstract fun onCreatedView(view: View?, savedInstanceState: Bundle?)

    private var toast: Toast? = null

    private var handlerToast = Handler(Looper.getMainLooper())

    /**
     * Set the dialog view and configure the dialog window properties
     * @author AnhTTH
     */
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        /**
         * Prevents the dialog from receiving focus from the user
         * @author AnhTTH
         */
        dialog?.window?.setFlags(
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
        )
        /**
         * hides the navigation bar and other system UIs, and enables immersive mode
         * @author AnhTTH
         */
        dialog?.window?.decorView?.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)
        /**
         * Allows the dialog to receive focus from the user after UI properties have been set
         *@author AnhTTH
         */
        dialog?.window?.clearFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE)
        return binding.root
    }

    /**
     * Performs additional initialization operations on the view after it has been created
     *@author AnhTTH
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        /**
         * Performs various initialization operations on the created view
         *@author AnhTTH
         */
        super.onViewCreated(view, savedInstanceState)
        onCreatedView(view, savedInstanceState)
    }

    /**
     * when the fragment is about to be destroyed
     * @author AnhTTH
     */
    override fun onDestroy() {
        super.onDestroy()
        toast?.cancel()
        handlerToast.removeCallbacksAndMessages(null)
    }
    /**
     * displays a short Toast message on the screen
     *@author AnhTTH
     */
    fun toast(text: String) {
        /**
         * Cancel the current Toast if it is displayed
         * @author AnhTTH
         */
        toast?.cancel()
        /**
         * Create a new Toast with the text provided and a short duration
         * @author AnhTTH
         */
        toast = Toast.makeText(requireActivity(), text, Toast.LENGTH_SHORT)
        /**
         * Show new Toast
         * @author AnhTTH
         */
        toast?.show()
        /**
         * Cancel the Toast after 1.5 seconds to ensure it doesn't last too long.
         * @author AnhTTH
         */
        handlerToast.postDelayed({
            toast?.cancel()
        }, 1500)
    }
}