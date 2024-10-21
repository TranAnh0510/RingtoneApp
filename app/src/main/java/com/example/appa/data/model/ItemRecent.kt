package com.example.appa.data.model

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

/**
 * Represents a recently accessed audio item with various attributes such as path, category, duration, name, and favorite status.
 * @property id The unique identifier for the recent item (auto-generated).
 * @property path The file path of the audio item.
 * @property category The category to which the audio item belongs.
 * @property duration The duration of the audio item as a formatted string (e.g., "MM:SS").
 * @property nameSound The name of the audio item.
 * @property isFavorite Indicates whether the audio item is marked as favorite.
 * @property timeAdd The timestamp when the audio item was added.
 * @property pathDownload The optional download path for the audio item.
 * @property image The optional image associated with the audio item (ignored by Room).
 * @author AnhTTH
 */
@Entity
data class ItemRecent(
    @PrimaryKey(autoGenerate = true) var id: Long = 0,
    var path: String,
    val category: String,
    val duration: String = "00:00",
    var nameSound: String,
    var isFavorite: Boolean = false,
    var timeAdd: Long,
    var pathDownload: String? = null
) {
    @Ignore
    var image: Int? = null
}

/**
 * Extension function to convert an [ItemRecent] object to an [ItemFavoriteUI] object.
 * @return An [ItemFavoriteUI] object containing the path, name, category, duration, and download path of the audio item.
 * @author AnhTTH
 */
fun ItemRecent.toItemFavourite() = ItemFavoriteUI(
    path = path,
    name = nameSound,
    category = category,
    duration = duration,
    pathDownload = pathDownload,
)