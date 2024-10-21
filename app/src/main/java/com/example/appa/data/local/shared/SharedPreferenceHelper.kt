package com.example.appa.data.local.shared

import android.content.SharedPreferences
import javax.inject.Inject

/**
 * Helper class for managing shared preferences.
 * This class provides methods for storing and retrieving string, integer, and boolean values in shared preferences.
 * An instance of this class is injected with a {@link SharedPreferences} instance.
 * @author AnhTTH
 */
class SharedPreferenceHelper @Inject constructor(sharedPreferences: SharedPreferences) {
    companion object {
        // Default values
        private const val DEFAULT_STRING = ""
        lateinit var sharedPreferences: SharedPreferences

        // Retrieve the Editor of SharedPreferences
        private fun getEditor() = sharedPreferences.edit()

        // Store a string into SharedPreferences
        fun storeString(key: String?, value: String?) = getEditor().putString(key, value).apply()

        // Get a string from SharedPreferences with default value
        fun getString(key: String?) = sharedPreferences.getString(key, DEFAULT_STRING)

        // Get a string from SharedPreferences, returning default if not present
        fun getStringWithDefault(key: String?, default: String) =
            sharedPreferences.getString(key, default) ?: default

        // Store an integer into SharedPreferences
        fun storeInt(key: String?, value: Int) = getEditor().putInt(key, value)?.apply()

        // Get an integer from SharedPreferences with default value
        fun getInt(key: String?, default: Int) = sharedPreferences.getInt(key, default)

        // Store a boolean into SharedPreferences
        fun storeBoolean(key: String?, value: Boolean) = getEditor().putBoolean(key, value).apply()

        // Get a boolean from SharedPreferences with default value
        fun getBoolean(key: String?, default: Boolean) = sharedPreferences.getBoolean(key, default)

    }

    // Initialize companion object with the provided SharedPreferences
    init {
        Companion.sharedPreferences = sharedPreferences
    }
}