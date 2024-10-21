package com.example.appa.data.model

/**
 * Represents an audio item with various attributes such as file name, folder name, size, type, path, time added, and duration.
 * @property nameFile The name of the audio file.
 * @property nameFolder The name of the folder containing the audio file.
 * @property size The size of the audio file in bytes.
 * @property typeFile The type or format of the audio file.
 * @property path The file path of the audio file.
 * @property timeAdded The timestamp when the audio file was added, in milliseconds since epoch.
 * @property duration The duration of the audio file as a formatted string (e.g., "MM:SS").
 * @property durationLong The duration of the audio file in milliseconds.
 * @author AnhTTH
 */
data class ItemAudio(
    var nameFile: String,
    var nameFolder: String,
    var size: Long,
    var typeFile: String,
    var path: String,
    var timeAdded: Long,
    var duration: String,
    var durationLong: Long,

    )
