package com.example.appa.util

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import androidx.core.app.ShareCompat
import com.example.appa.R

/**
 * Converts milliseconds to a readable duration format.
 * @param mi The duration in milliseconds.
 * @return The duration in the format "HH:MM:SS" or "MM:SS" if less than an hour.
 * @author AnhTTH
 */
fun getDuration(mi: Long): String {
    val millis = mi / 1000
    val seconds = (millis % 60).toInt()
    val minutes = (millis / 60 % 60).toInt()
    val hour = (millis / 60 / 60).toInt()
    var time = ""
    time = if (hour > 0) {
        checkTime(hour) + ":" + checkTime(minutes) + ":" + checkTime(seconds)
    } else {
        checkTime(minutes) + ":" + checkTime(seconds)
    }
    return time
}

private fun checkTime(time: Int): String {
    val result: String
    if (time < 10) {
        result = "0$time"
        return result
    }
    return time.toString()
}

/**
 * Shares the app via email.
 * @param name The name of the app.
 * @author AnhTTH
 */
fun Context.shareApp(name: String) {
    kotlin.runCatching {
        Intent(Intent.ACTION_SEND).apply {
            type = "text/email"
            putExtra(
                Intent.EXTRA_SUBJECT, name + " " + getString(R.string.app_name)
            )
            putExtra(Intent.EXTRA_TEXT, "market://details?id=$packageName")
            startActivity(Intent.createChooser(this, ""))
        }
    }.onFailure { it.printStackTrace() }
}

/**
 * Shares the app via a link.
 * @author AnhTTH
 */
fun Activity.shareAppLink() {
    kotlin.runCatching {
        ShareCompat.IntentBuilder.from(this).setType("text/plain").setChooserTitle("Chooser title")
            .setText(" " + getString(R.string.app_name) + "\nhttp://play.google.com/store/apps/details?id=$packageName")
            .startChooser()
    }.onFailure { it.printStackTrace() }
}

/**
 * Sets the avatar image based on the language code.
 * @return The resource ID of the avatar image.
 * @author AnhTTH
 */
fun String.setAvatar(): Int {
    return when (this) {
        "en" -> R.drawable.img_english
        "fr" -> R.drawable.img_french
        "es" -> R.drawable.img_spanish
        "pt" -> R.drawable.img_portuguese
        "hi" -> R.drawable.img_hindi
        else -> R.drawable.img_vietnam
    }
}

/**
 * Sets the image category based on the category name.
 * @return The resource ID of the category image.
 * @author AnhTTH
 */
fun String.setImageCategory(): Int {
    return when (this) {
        "Pop Music" -> R.drawable.img_pop_sound
        "Rock Music" -> R.drawable.img_rock_sound
        "Ballad Music" -> R.drawable.img_ballad_sound
        "Dance Music" -> R.drawable.img_dance_sound
        "Electronic Music" -> R.drawable.img_electronic_sound
        "Classical Music" -> R.drawable.img_classic_sound
        "Beat Music" -> R.drawable.img_beat_sound
        "Hiphop Music" -> R.drawable.img_hiphop_sound
        "Acoustic Music" -> R.drawable.img_acoustic_sound
        "Piano Music" -> R.drawable.img_piano_sound
        else -> R.drawable.img_pop_sound
    }
}

/**
 * Sets the localized category name based on the category name.
 * @param context The context used for localization.
 * @return The localized category name.
 * @author AnhTTH
 */
fun String.setNameCategory(context: Context): String {
    return context.getString(
        when (this) {
            "Pop Music" -> R.string.pop_music
            "Rock Music" -> R.string.rock_music
            "Ballad Music" -> R.string.ballad_music
            "Dance Music" -> R.string.dance_music
            "Electronic Music" -> R.string.electronic_music
            "Classical Music" -> R.string.classical_music
            "Beat Music" -> R.string.beat
            "Hiphop Music" -> R.string.hiphop
            "Acoustic Music" -> R.string.acoustic_music
            "Piano Music" -> R.string.piano_music
            else -> R.string.pop_music
        }
    )

}

/**
 * Shows the soft keyboard for the specified EditText.
 * @param edt The EditText for which to show the soft keyboard.
 * @author AnhTTH
 */
fun Activity.showSoftKeyboardEdt(edt: EditText) {
    kotlin.runCatching {
        edt.requestFocus()
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

        edt.postDelayed({
            imm.showSoftInput(edt, InputMethodManager.SHOW_IMPLICIT)
        }, 200) // Đặt một khoảng thời gian nhỏ trước khi hiển thị bàn phím

        edt.setOnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                imm.showSoftInput(edt, InputMethodManager.SHOW_IMPLICIT)
            } else {
                imm.hideSoftInputFromWindow(edt.windowToken, 0)
            }
        }
    }.onFailure { it.printStackTrace() }
}

/**
 * Shows the view.
 * @author AnhTTH
 */
fun View.show() {
    visibility = View.VISIBLE
}

/**
 * Hides the view.
 * @author AnhTTH
 */
fun View.hide() {
    visibility = View.GONE
}

/**
 * Sets the visibility of multiple views.
 * @param isVisible Whether the views should be visible.
 * @param views The views to set the visibility for.
 * @author AnhTTH
 */
fun setVisibility(isVisible: Boolean, vararg views: View) {
    for (view in views) {
        if (isVisible) view.show() else view.hide()
    }
}

/**
 * Checks if the string contains non-allowed characters.
 * @return True if the string contains non-allowed characters, otherwise false.
 * @author AnhTTH
 */
fun String.containsNonAllowedCharacters(): Boolean {
    return this.contains(Regex("[^a-zA-Z0-9\\sàáảãạăắằẳẵặâấầẩẫậđèéẻẽẹêếềểễệìíỉĩịòóỏõọôốồổỗộơớờởỡợùúủũụưứừửữựỳýỷỹỵ]+"))
}

