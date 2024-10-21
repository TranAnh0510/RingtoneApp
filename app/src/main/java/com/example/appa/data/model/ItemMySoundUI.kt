package com.example.appa.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

/**
 * Represents a custom sound item with various attributes such as name, duration, and path.
 * @property id The unique identifier for the custom sound item (auto-generated).
 * @property nameRingtone The name of the ringtone or sound. Can be null.
 * @property durationLong The duration of the sound in milliseconds.
 * @property path The file path of the sound. Can be null.
 * @property duration The optional duration of the sound as a formatted string (e.g., "MM:SS"), ignored by Room.
 * @author AnhTTH
 */
@Entity
data class ItemMySoundUI(
    @PrimaryKey(autoGenerate = true) var id: Long = 0,
    @ColumnInfo var nameRingtone: String? = null,
    @ColumnInfo var durationLong: Long = 0L,
    @ColumnInfo var path: String? = null,
    @Ignore var duration: String? = null,

)