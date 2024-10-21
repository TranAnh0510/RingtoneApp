package com.example.appa.data.model

/**
 * Represents an introductory UI element with a title, content, and an optional icon.
 * @property title The title of the introductory element. Can be null.
 * @property content The content of the introductory element. Can be null.
 * @property icon The optional icon associated with the introductory element. Can be null.
 * @author AnhTTH
 */
data class IntroUI(
    val title: String? = null, val content: String? = null, val icon: Int? = null
)
