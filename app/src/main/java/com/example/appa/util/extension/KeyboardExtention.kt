package com.example.appa.util.extension

import android.app.Activity
import android.content.Context
import android.view.inputmethod.InputMethodManager
/**
 * Hides the soft keyboard.
 * @author AnhTTH
 */
fun Activity.hideKeyboard() {
    if (currentFocus != null) {
        (getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager).hideSoftInputFromWindow(
            currentFocus!!.windowToken,
            0
        )
    }
}


