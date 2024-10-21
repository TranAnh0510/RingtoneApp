package com.example.appa.data.model

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

/**
 * The LanguageUI class represents a language entity in the user interface.
 * It is used for displaying language information in the application.
 * @author AnhTTh
 */
@Entity
data class LanguageUI(
    /** The unique identifier for the language. */
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    /** The name of the language. */
    val name: String?,
    /** The language code. */
    val code: String?,
    /** Indicates whether the language is selected. */
    var isSelected: Boolean = false,
) {
    /** A field to store the avatar resource ID. */
    @Ignore
    var avatar: Int? = null
}
