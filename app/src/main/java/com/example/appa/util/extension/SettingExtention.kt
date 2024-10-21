package com.example.appa.util.extension

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.pm.ActivityInfo
import android.content.pm.PackageManager
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.view.WindowManager
import androidx.fragment.app.Fragment

/**
 * Set up unknown screen rotation mode (UNSPECIFIED) for Samsung devices running Android versions below 10.
 * @author AnhTTH
 */
fun Activity.lockPortraitOrientation() {
    kotlin.runCatching {
        if (isSamsungDeviceBelowAndroid10()) {
            requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED
        }
    }.onFailure { it.printStackTrace() }

}

/**
 * Check if the device is from Samsung and runs Android version below 10.
 * @author AnhTTH
 */
fun isSamsungDeviceBelowAndroid10(): Boolean {
    return try {
        Build.MANUFACTURER.equals(
            "Samsung",
            ignoreCase = true
        ) && !isAtLeastSdkVersion(29)
    } catch (e: PackageManager.NameNotFoundException) {
        false
    }

}


/**
 * Opens the application details settings page itself
 * @author AnhTTH
 */
fun Activity.startSetting() = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
    data = Uri.fromParts("package", packageName, null)
    startActivity(this)
}

/**
 * Set full screen mode for Activity
 * @author AnhTTH
 */
fun Activity.setFullScreen() {
    kotlin.runCatching {
        /**
         * expands the entire screen
         * @author AnhTTH
         */
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
    }.onFailure { it.printStackTrace() }
}

/**
 * get the height ò status bar
 * @author AnhTTH
 */
fun Context.getHeightStatusBar(): Int {
    var statusBarHeight = 0
    kotlin.runCatching {
        val resourceId: Int = resources.getIdentifier("status_bar_height", "dimen", "android")
        if (resourceId > 0) {
            statusBarHeight = resources.getDimensionPixelSize(resourceId)
        }
    }.onFailure { it.printStackTrace() }
    if (statusBarHeight == 0) statusBarHeight = 33 * getScreenHeight() / 2400
    return statusBarHeight
}

/**
 * Check if the device's current SDK version is greater than or equal to a specific version
 * @author AnhTTH
 */
fun isAtLeastSdkVersion(versionCode: Int): Boolean {
    return Build.VERSION.SDK_INT >= versionCode
}

/**
 * Hides the system UI (status bar and navigation bar) and makes the content appear fullscreen.
 * This method sets the system UI visibility flags to achieve immersive mode.
 * @author AnhTTH
 */
fun Activity.hideSystemUI() {
    kotlin.runCatching {
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                or View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                or View.SYSTEM_UI_FLAG_IMMERSIVE)
    }.onFailure { it.printStackTrace() }
}






