package com.example.appa.util.extension

import android.content.res.Resources

/**
 * Converts density-independent pixels (dp) to pixels.
 * @return The converted value in pixels.
 * @author AnhTTH
 */
fun Int.dpToPx(): Float {
    return this * Resources.getSystem().displayMetrics.density
}
/**
 * Converts density-independent pixels (dp) to pixels.
 * @return The converted value in pixels.
 * @author AnhTTH
 */
fun Float.dpToPx(): Float {
    return this * Resources.getSystem().displayMetrics.density
}
