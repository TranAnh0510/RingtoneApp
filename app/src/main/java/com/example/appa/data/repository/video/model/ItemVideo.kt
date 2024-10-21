package com.example.appa.data.repository.video.model
/**
 * Data class representing a video item.
 *
 * @property nameFile The name of the video file.
 * @property nameFolder The name of the folder containing the video.
 * @property size The size of the video file in bytes.
 * @property typeFile The type of the video file (e.g., mp4, avi, etc.).
 * @property path The file path to the video.
 * @property timeAdded The timestamp when the video was added.
 * @property resolution The resolution of the video.
 * @property duration The duration of the video as a string.
 * @property durationLong The duration of the video in milliseconds.
 * @author AnhTTH
 */
data class ItemVideo(
    var nameFile: String,
    var nameFolder: String,
    var size: Long,
    var typeFile: String,
    var path: String,
    var timeAdded: Long,
    var resolution: String,
    var duration: String,
    var durationLong: Long,
) {
    /**
     * Returns a string representation of the video item, including its file path.
     * @return A string representation of the video item.
     * @author AnhTTH
     */
    override fun toString(): String {
        return "ItemImage(path='$path') \n"
    }

}

