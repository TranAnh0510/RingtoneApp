package com.example.appa.util.extension

import android.content.Context
import android.view.View
import androidx.core.view.isVisible

/**
 * Get the height of the device screen
 * @author AnhTTH
 */
fun Context.getScreenHeight(): Int {
    return resources.displayMetrics.heightPixels
}

/**
 * Makes a View visible.
 * @author AnhTTH
 */
fun View.visible() = if (!this.isVisible) this.visibility = View.VISIBLE else {
}

/**
 * Makes a View invisible (gone).
 * @author AnhTTH
 */
fun View.gone() {
    if (this.isVisible) this.visibility = View.GONE
}

/**
 * Makes a View invisible but still takes up space in the layout.
 * @author AnhTTH
 */
fun View.invisible() = if (this.isVisible) this.visibility = View.INVISIBLE else {
}

/**
 * Set up a safe OnClickListener that prevents pressing too quickly from causing many unwanted events.
 * @author AnhTTH
 */
fun View.setOnSafeClick(defaultInterval: Int = 600, onSafeClick: (View) -> Unit) {
    val safeClickListener = SafeClickListener(defaultInterval) {
        onSafeClick(it)
    }
    setOnClickListener(safeClickListener)
}

/**
 * Prevents rapid successive clicks on a View
 * @author AnhTTH
 */
class SafeClickListener(
    /**
     *  defaultInterval: Minimum interval between presses.
     * @author AnhTTH
     */
    private var defaultInterval: Int = 600,
    /**
     * onSafeCLick: Action performed when View is pressed.
     * @author AnhTTH
     */
    private val onSafeCLick: (View) -> Unit
) : View.OnClickListener {
    /**
     * lastTimeClicked: Time of last time View was pressed.
     * @author AnhTTH
     */
    private var lastTimeClicked: Long = 0

    /**
     * Prevents rapid successive clicks on a View
     * @author AnhTTH
     */
    override fun onClick(v: View) {
        if (System.currentTimeMillis() - lastTimeClicked < defaultInterval) {
            return
        }
        lastTimeClicked = System.currentTimeMillis()
        kotlin.runCatching {
            onSafeCLick(v)
        }.onFailure {
            it.printStackTrace()
        }
    }
}