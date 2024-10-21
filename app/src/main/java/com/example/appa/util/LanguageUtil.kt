package com.example.appa.util

import android.content.Context
import android.content.res.Configuration
import com.example.appa.data.local.shared.SharedPreferenceHelper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.Locale

/**
 * Utility object for managing language settings.
 * @author AnhTTH
 */
object LanguageUtil {
    // The current locale.
    private var myLocale: Locale? = null

    // The key for storing the language preference in shared preferences.
    const val KEY_LANGUAGE = "KEY_LANGUAGE"

    /**
     * Sets the locale based on the language preference stored in shared preferences.
     * @author AnhTTH
     */
    fun Context.setLocale() {
        kotlin.runCatching {
            val language = getPreLanguage()
            if (language == "") {
                Locale.getDefault().apply {
                    Locale.setDefault(this)
                    Configuration().let { config ->
                        config.locale = this
                        resources.updateConfiguration(config, resources.displayMetrics)
                    }
                }
            } else {
                this.changeLang(language)
            }
        }.onFailure { it.printStackTrace() }
    }

    /**
     * Changes the language to the specified language.
     * @param lang The language code (e.g., "en" for English, "fr" for French).
     * @author AnhTTH
     */
    fun Context.changeLang(lang: String) {
        kotlin.runCatching {
            if (lang.equals("", ignoreCase = true)) return
            myLocale = Locale(lang)
            lang.saveKeyLanguageToSharedPrefrerences()
            myLocale?.let { Locale.setDefault(it) }
            Configuration().apply {
                locale = myLocale
                resources.updateConfiguration(this, resources.displayMetrics)
            }
        }.onFailure { it.printStackTrace() }
    }

    /**
     * Retrieves the previously set language from shared preferences.
     * @return The previously set language, defaulting to "en" (English) if not found.
     * @author AnhTTH
     */
    fun Context.getPreLanguage() = SharedPreferenceHelper.getStringWithDefault(KEY_LANGUAGE, "en")

    /**
     * Saves the language preference to shared preferences.
     * @author AnhTTH
     */
    fun String.saveKeyLanguageToSharedPrefrerences() {
        kotlin.runCatching {
            if (this == "") return
            CoroutineScope(Dispatchers.IO).launch {
                kotlin.runCatching {
                    SharedPreferenceHelper.storeString(
                        KEY_LANGUAGE, this@saveKeyLanguageToSharedPrefrerences
                    )
                }.onFailure { it.printStackTrace() }
            }
        }.onFailure { it.printStackTrace() }
    }
}