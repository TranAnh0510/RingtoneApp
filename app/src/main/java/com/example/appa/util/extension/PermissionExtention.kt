package com.example.appa.util.extension

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.provider.Settings
import androidx.core.content.ContextCompat

/**
 * Checks if the specified permission is granted.
 * @param permission The permission to check.
 * @return `true` if the permission is granted, `false` otherwise.
 * @author AnhTTH
 */
fun Context.isGrantPermission(permission: String) = ContextCompat.checkSelfPermission(
    this, permission
) == PackageManager.PERMISSION_GRANTED


/**
 * Check if the app has permission to read data from external storage
 * @author AnhTTH
 */
fun Context.isGrantReadExternalStoragePermission() =
    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU) {
        isGrantPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)
    } else {
        false
    }


/**
 * Check if the application has access to the video from the media spatial memory.
 * @author AnhTTH
 */
fun Context.isGrantMediaVideoPermission() = if (isAtLeastSdkVersion(Build.VERSION_CODES.TIRAMISU)) {
    isGrantPermission(Manifest.permission.READ_MEDIA_VIDEO)
} else {
    isGrantReadExternalStoragePermission()
}

/**
 * Check if the app has access to audio from media spatial memory
 * If the device has android version TIRAMISU or higher, access audio. If below, access external memory
 * @author AnhTTH
 */
fun Context.isGrantMediaAudioPermission() = if (isAtLeastSdkVersion(Build.VERSION_CODES.TIRAMISU)) {
    isGrantPermission(Manifest.permission.READ_MEDIA_AUDIO)
} else {
    isGrantReadExternalStoragePermission()
}


/**
 * Check if the app has permission to write to system settings.
 * @author AnhTTH
 */
fun Context.checkSystemWritePermission(): Boolean {
    return Settings.System.canWrite(this)
}

/**
 * Open the settings menu to request write permission to system settings.
 * @author AnhTTH
 */
fun Context.openAndroidPermissionsMenu() {
    val intent = Intent(Settings.ACTION_MANAGE_WRITE_SETTINGS)
    intent.data = Uri.parse("package:" + this.packageName)
    startActivity(intent)
}


