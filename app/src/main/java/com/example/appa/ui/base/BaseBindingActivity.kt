package com.example.appa.ui.base

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Toast
import androidx.core.view.WindowCompat
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.example.appa.util.extension.getHeightStatusBar
import com.example.appa.util.extension.getScreenHeight
import com.example.appa.util.extension.lockPortraitOrientation

abstract class BaseBindingActivity<B : ViewDataBinding, VM : BaseViewModel> : BaseActivity() {
    lateinit var binding: B
    lateinit var viewModel: VM
    var isDispatchTouchEvent = true

    abstract val layoutId: Int
    abstract fun getViewModel(): Class<VM>
    abstract fun setupView(savedInstanceState: Bundle?)
    abstract fun setupData()

    private var toast: Toast? = null
    private var handlerToast = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        /**
         * lock the activity's screen orientation to portrait
         * @author AnhTTH
         */
        this.lockPortraitOrientation()
        /**
         * perform any preparations defined in the base class
         * @author AnhTTH
         */
        super.onCreate(savedInstanceState)
        /**
         * tie the activity layout to the data and to be able to access components in the layout
         * @author AnhTTH
         */
        binding = DataBindingUtil.setContentView(this, layoutId)
        /**
         * Create an instance of ViewModel using ViewModelProvider
         * @author AnhTTH
         */
        viewModel = ViewModelProvider(this)[getViewModel()]
        /**
         * The status bar and navigation bar will automatically hide when not in use and reappear when needed
         * @author AnhTTH
         */
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        /**
         * Set the window's status bar to dark
         * @author AnhTTH
         */
        window.setLightStatusBars(false)
        /**
         * Make user interface settings
         * @author AnhTTH
         */
        setupView(savedInstanceState)
        /**
         * Perform data settings.
         * @author AnhTTH
         */
        setupData()
    }

    /**
     * The activity is no longer in a user-interactive state
     * @author AnhTTH
     */
    override fun onStop() {
        super.onStop()
        /**
         * Hides unnecessary UI parts when activity stops
         * @author AnhTTH
         */
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        /**
         * Cancel any toast notifications that are showing
         * @author AnhTTH
         */
        toast?.cancel()
    }

    /**
     * The activity is about to be canceled and will no longer be used
     * @author AnhTTH
     */
    override fun onDestroy() {
        super.onDestroy()
        //Cancel any toast notifications that are showing
        toast?.cancel()

        //prevent sending any messages to the activity after the activity has been destroyed
        handlerToast.removeCallbacksAndMessages(null)
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        /**
         * maintain full screen mode
         * @author AnhTTH
         */
        window?.decorView?.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)
    }

    /**
     * There is a touch event sent to the activity
     * @author AnhTTH
     */
    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        return !isDispatchTouchEvent || super.dispatchTouchEvent(ev)
    }

    /**
     * temporarily disables touch event handling for a period of time
     * @author AnhTTH
     */
    fun isDispatchTouchEvent(time: Int) {
        isDispatchTouchEvent = false
        Handler(Looper.getMainLooper()).postDelayed({ isDispatchTouchEvent = true }, time.toLong())
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
        toast = Toast.makeText(this, text, Toast.LENGTH_SHORT)
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

    /**
     * Set the status bar of the window
     *@author AnhTTH
     */
    private fun Window.setLightStatusBars(b: Boolean) {
        WindowCompat.getInsetsController(this, decorView).isAppearanceLightStatusBars = b
    }

    /**
     * Convert units from dp (density-independent pixels) to px (pixels)
     *@author AnhTTH
     */
    fun dpToPx(dp: Int): Int {
        val density = resources.displayMetrics.density
        return (dp * density).toInt()
    }

    /**
     * Sets the top margin for a TextView to ensure that it is not obscured by the status bar
     * @author AnhTTH
     */
    fun setMarginStatusBar(textView: View, marginTop: Int) {
        val params = textView.layoutParams as ViewGroup.MarginLayoutParams
        //height status bar = 30, margin top = 20, height screen device code = 2400
        params.topMargin = getHeightStatusBar() + dpToPx(marginTop) * getScreenHeight() / 2400

    }
}