package com.example.appa.data.model.musicserver

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.example.appa.data.model.ItemFavoriteUI
import com.example.appa.data.model.ItemRecent

/**
 * Represents a category of music on the server with a name, number of songs, and additional optional properties.
 * @property name The name of the music category.
 * @property numberSong The number of songs in the music category.
 * @property id The unique identifier for the music category (auto-generated).
 * @property listSong The list of songs in the music category (ignored by Room).
 * @property image The optional image associated with the music category (ignored by Room).
 * @author AnhTTH
 */
@Entity
data class MusicServerCategoriesUI(
    var name: String = "",
    val numberSong: Int = 0,
) {

    @PrimaryKey(autoGenerate = true)
    var id: Long = 0

    @Ignore
    val listSong: List<MusicServerUI> = mutableListOf()

    @Ignore
    var image: Int? = null
}

/**
 * Represents a music item on the server with various details such as name, category, duration, path, and favorite status.
 * @property id The unique identifier for the music item (auto-generated).
 * @property name The name of the music track.
 * @property category The category to which the music track belongs.
 * @property duration The duration of the music track in the format "MM:SS".
 * @property path The file path of the music track.
 * @property isFavorite Indicates whether the music track is marked as favorite.
 * @property pathDownload The optional download path for the music track.
 * @property image The optional image associated with the music track (ignored by Room).
 * @author AnhTTH
 */
@Entity
data class MusicServerUI(
    @PrimaryKey(autoGenerate = true) var id: Long = 0,
    val name: String = "",
    val category: String = "",
    val duration: String = "00:00",
    val path: String = "",
    var isFavorite: Boolean = false,
    var pathDownload: String? = null
) {
    @Ignore
    var image: Int? = null

    /**
     * Returns a string representation of the MusicServerUI object.
     * @return A string containing the name and favorite status of the music track.
     * @author AnhTTH
     */
    override fun toString(): String {
        return "MusicServerUI(name='$name', isFavorite=$isFavorite) \n"
    }
}

/**
 * Extension function to convert a [MusicServerUI] object to an [ItemRecent] object.
 * @return An [ItemRecent] object containing the path, name, duration, category, addition time,
 * and download path of the music entity.
 * @author AnhTTH
 */
fun MusicServerUI.toItemRecent() = ItemRecent(
    path = path,
    nameSound = name,
    duration = duration,
    category = category,
    timeAdd = System.currentTimeMillis(),
    pathDownload = pathDownload,
)

/**
 * Extension function to convert a [MusicServerUI] object to an [ItemFavoriteUI] object.
 * @return An [ItemFavoriteUI] object containing the path, name, category, duration,
 * and download path of the music entity.
 * @author AnhTTH
 */
fun MusicServerUI.toItemFavourite() = ItemFavoriteUI(
    path = path,
    name = name,
    category = category,
    duration = duration,
    pathDownload = pathDownload,
)