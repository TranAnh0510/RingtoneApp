package com.example.appa.data.repository.video

import android.content.ContentResolver
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import androidx.annotation.RequiresApi
import com.example.appa.data.repository.video.model.ItemVideo
import com.example.appa.util.extension.isAtLeastSdkVersion
import java.io.File
import javax.inject.Inject

/**
 * Implementation of [VideoDataSource] responsible for fetching videos from the device's gallery.
 * @property context The application context.
 * @author AnhTTH
 */
class VideoDataSourceImpl @Inject constructor(
    context: Context
) : VideoDataSource {
    private val contentResolver = context.contentResolver

    /**
     * Fetches a list of gallery videos with specified criteria.
     * @param limit The maximum number of videos to fetch.
     * @param offset The offset from which to start fetching videos.
     * @param typeSort The type of sorting to apply (1: by name, 2: by date added, 3: by size).
     * @param isDescending Determines whether sorting should be in descending order.
     * @return A list of [ItemVideo] objects representing the gallery videos.
     * @author AnhTTH
     */
    override fun fetchGalleryVideos(
        limit: Int, offset: Int, typeSort: Int, isDecending: Boolean
    ): List<ItemVideo> {
        val galleryVideo = mutableListOf<ItemVideo>()
        // Fetch videos using cursor
        getCursorVideo(limit, offset)?.use { cursor ->
            if (cursor.count > offset) {
                // Retrieve column indices
                val columnPath = cursor.getColumnIndex(MediaStore.Video.Media.DATA)
                val columnName = cursor.getColumnIndex(MediaStore.Video.Media.DISPLAY_NAME)
                val columnSize = cursor.getColumnIndex(MediaStore.Video.Media.SIZE)
                val columnWidth = cursor.getColumnIndex(MediaStore.Video.Media.WIDTH)
                val columnHeight = cursor.getColumnIndex(MediaStore.Video.Media.HEIGHT)
                val columnDuration = cursor.getColumnIndex(MediaStore.Audio.Media.DURATION)

                val columnDateAdded = cursor.getColumnIndex(MediaStore.Video.Media.DATE_ADDED)
                val columnBucketDisPlayName =
                    cursor.getColumnIndex(MediaStore.Video.Media.BUCKET_DISPLAY_NAME)
                // Iterate through cursor
                while (cursor.moveToNext()) {
                    // Extract video details
                    val path = try {
                        cursor.getString(columnPath)
                    } catch (e: Exception) {
                        e.printStackTrace()
                        continue
                    } ?: continue
                    // Exclude hidden files and directories
                    if (!path.startsWith(".")) {
                        val f = File(path)
                        if (f.isFile && !f.isHidden) {
                            val nameFileImage = cursor.getString(columnName) ?: ""
                            if (nameFileImage.startsWith(".")) continue
                            var size = cursor.getLong(columnSize)
                            if (size == 0L) size = f.length()
                            if (size == 0L) continue
                            val timeAdded = cursor.getLong(columnDateAdded) * 1000
                            var nameFolder = ""
                            if (isAtLeastSdkVersion(Build.VERSION_CODES.Q)) {
                                if (columnBucketDisPlayName > -1) {
                                    nameFolder = cursor.getString(columnBucketDisPlayName) ?: ""
                                }
                            } else {
                                nameFolder = f.parentFile?.name ?: ""
                            }
                            val timeDuration = cursor.getLong(columnDuration)
                            if (timeDuration < 1000) continue

                            var minute = (timeDuration) / (60 * 1000)
                            var second = (timeDuration - minute * 60 * 1000) / 1000
                            val miliSecond = (timeDuration - minute * 60 * 1000 - second * 1000)
                            if (miliSecond > 500) second += 1
                            if (second == 60L) {
                                second = 0
                                minute += 1L
                            }

                            val duration = "${
                                minute.toString().padStart(2, '0')
                            }:${second.toString().padStart(2, '0')}"
                            // Add video item to list
                            galleryVideo.add(
                                ItemVideo(
                                    nameFileImage,
                                    nameFolder,
                                    size,
                                    nameFileImage.substringAfterLast('.', ""),
                                    path,
                                    timeAdded,
                                    "${cursor.getLong(columnWidth)}x${
                                        cursor.getLong(
                                            columnHeight
                                        )
                                    }",
                                    duration = duration,
                                    timeDuration
                                )
                            )
                        }
                    }
                }
            }

        }
        // Sort videos based on criteria and order
        if (isDecending) {
            when (typeSort) {
                1 -> {
                    galleryVideo.sortBy { it.nameFile }
                }

                2 -> {
                    galleryVideo.sortBy { it.timeAdded }
                }

                3 -> {
                    galleryVideo.sortBy { it.size }
                }
            }

        } else {
            when (typeSort) {
                1 -> {
                    galleryVideo.sortByDescending { it.nameFile }
                }

                2 -> {
                    galleryVideo.sortByDescending { it.timeAdded }
                }

                3 -> {
                    galleryVideo.sortByDescending { it.size }
                }
            }
        }

        return galleryVideo
    }

    /**
     * Retrieves a cursor to fetch videos compatible with Android Q (API level 29) and above.
     * @param limit The maximum number of videos to fetch.
     * @param offset The offset from which to start fetching videos.
     * @return A cursor containing video details.
     * @author AnhTTH
     */
    private fun getCursorVideo(limit: Int, offset: Int) =
        if (isAtLeastSdkVersion(Build.VERSION_CODES.O)) {
            getCursorFromO(limit, offset)
        } else {
            getCursorBelowO(limit, offset)
        }

    /**
     * Retrieves a cursor to fetch videos compatible with Android Oreo (API level 26) and above.
     * @param limit The maximum number of videos to fetch.
     * @param offset The offset from which to start fetching videos.
     * @return A cursor containing video details.
     * @author AnhTTH
     */
    @RequiresApi(Build.VERSION_CODES.O)
    private fun getCursorFromO(limit: Int, offset: Int) = contentResolver.query(
        getContentUri(), getProjectionVideo(), Bundle().apply {
            putInt(ContentResolver.QUERY_ARG_LIMIT, limit)
            putInt(ContentResolver.QUERY_ARG_OFFSET, offset)
            putStringArray(
                ContentResolver.QUERY_ARG_SORT_COLUMNS, arrayOf(MediaStore.Video.Media.DATE_TAKEN)
            )
            putInt(
                ContentResolver.QUERY_ARG_SORT_DIRECTION,
                ContentResolver.QUERY_SORT_DIRECTION_DESCENDING
            )
            putString(ContentResolver.QUERY_ARG_SQL_SELECTION, getSelectionVideo())
        }, null
    )

    /**
     * Retrieves a cursor to fetch videos below Android Oreo (API level 26).
     * @param limit The maximum number of videos to fetch.
     * @param offset The offset from which to start fetching videos.
     * @return A cursor containing video details.
     * @author AnhTTH
     */
    private fun getCursorBelowO(limit: Int, offset: Int) = try {
        contentResolver.query(
            getContentUri(),
            getProjectionVideo(),
            getSelectionVideo(),
            null,
            "${MediaStore.Video.Media.DATE_TAKEN} DESC LIMIT $limit OFFSET $offset"
        )
    } catch (e: Exception) {
        e.printStackTrace()
        null
    }

    /**
     * Retrieves the selection criteria for querying videos based on platform compatibility.
     * @return The selection criteria as a string.
     * @author AnhTTH
     */
    private fun getSelectionVideo() = try {
        if (isAtLeastSdkVersion(Build.VERSION_CODES.Q)) MediaStore.Video.Media.SIZE + " > 0"
        else null
    } catch (e: Exception) {
        null
    }

    /**
     * Retrieves the content URI for querying videos.
     * @return The content URI for videos.
     * @author AnhTTH
     */
    private fun getContentUri() = MediaStore.Video.Media.EXTERNAL_CONTENT_URI

    /**
     * Retrieves the projection for querying videos.
     * @return The projection array for videos.
     * @author AnhTTH
     */
    private fun getProjectionVideo() = arrayOf(
        MediaStore.Video.Media._ID,
        MediaStore.Video.Media.TITLE,
        MediaStore.Video.Media.DISPLAY_NAME,
        MediaStore.Video.Media.DATA,
        MediaStore.Video.Media.MIME_TYPE,
        MediaStore.Video.Media.DATE_TAKEN,
        MediaStore.Video.Media.DATE_ADDED,
        MediaStore.Video.Media.DURATION,
        MediaStore.Video.Media.BUCKET_DISPLAY_NAME,
        MediaStore.Video.Media.SIZE,
        MediaStore.Video.Media.WIDTH,
        MediaStore.Video.Media.HEIGHT,
    )
}