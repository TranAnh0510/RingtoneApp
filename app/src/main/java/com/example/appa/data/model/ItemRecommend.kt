package com.example.appa.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Represents a recommended item with original name and recommended name.
 * @property id The unique identifier for the recommended item (auto-generated).
 * @property nameOriginal The original name of the item.
 * @property nameRecommend The recommended name of the item.
 * @author AnhTTH
 */
@Entity
data class ItemRecommend(
    @PrimaryKey(autoGenerate = true) var id: Long = 0,
    var nameOriginal: String? = null,
    val nameRecommend: String? = null,
)