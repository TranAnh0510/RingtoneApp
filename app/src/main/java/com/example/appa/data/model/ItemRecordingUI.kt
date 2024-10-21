package com.example.appa.data.model

/**
 * Represents a recorded item with various attributes such as ID, name, duration, date, size, and selection status.
 * @property id The unique identifier for the recorded item.
 * @property nameRecording The name of the recorded item.
 * @property duration The duration of the recorded item as a formatted string (e.g., "HH:MM:SS").
 * @property date The date of the recorded item.
 * @property sizeData The size of the recorded item data.
 * @property isSelect Indicates whether the recorded item is selected.
 * @author AnhTTH
 */
data class ItemRecordingUI(
    var id: Int? = null,
    val nameRecording: String? = null,
    val duration: String? = null,
    val date: String? = null,
    val sizeData: Float? = null,
    var isSelect: Boolean = false
)