package com.example.appa.util.extension

import android.app.Activity
import android.content.Context
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat

/**
 * to set the image on the right side of the text.
 * @author AnhTTH
 */
fun TextView.setIconDrawableEnd(icon: Int) {
    setCompoundDrawablesWithIntrinsicBounds(
        0,
        0,
        icon,
        0
    )
}

