package com.example.appa.data.model

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

/**
 * Represents a favorite audio item with various attributes such as name, category, duration, and paths.
 * @property id The unique identifier for the favorite item (auto-generated).
 * @property path The file path of the favorite item.
 * @property name The name of the favorite item.
 * @property category The category to which the favorite item belongs.
 * @property duration The duration of the favorite item as a formatted string (e.g., "MM:SS").
 * @property durationLong The duration of the favorite item in milliseconds.
 * @property pathDownload The optional download path for the favorite item.
 * @property image The optional image associated with the favorite item (ignored by Room).
 * @author AnhTTH
 */
@Entity
data class ItemFavoriteUI(
    @PrimaryKey(autoGenerate = true) var id: Long = 0,
    var path: String = "",
    val name: String = "",
    val category: String = "",
    val duration: String = "",
    val durationLong: Long? = 0L,
    var pathDownload: String? = null
) {
    @Ignore
    var image: Int? = null
}

/**
 * Extension function to convert an [ItemFavoriteUI] object to an [ItemRecent] object.
 * @return An [ItemRecent] object containing the path, name, duration, category,
 * and addition time of the favorite item.
 * @author AnhTTH
 */
fun ItemFavoriteUI.toItemRecent() = ItemRecent(
    path = path,
    nameSound = name,
    duration = duration,
    category = category,
    timeAdd = System.currentTimeMillis()
)