package com.example.appa.data.repository.audio

import android.content.ContentResolver
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import androidx.annotation.RequiresApi
import com.example.appa.data.model.ItemAudio
import com.example.appa.util.extension.isAtLeastSdkVersion
import java.io.File
import javax.inject.Inject

/**
 * Implementation of the [AudioDataSource] interface responsible for fetching audio data from the device's gallery.
 * @property context The application context.
 * @author AnhTTH
 */
class AudioDataSourceImpl @Inject constructor(
    context: Context
) : AudioDataSource {
    private val contentResolver = context.contentResolver

    /**
     * Fetches a list of audio items from the gallery with specified limits, offsets, sorting type, and order.
     * @param limit The maximum number of audio items to fetch.
     * @param offset The offset from which to start fetching audio items.
     * @param typeSort The type of sorting to apply (e.g., by name, date, size).
     * @param isDescending Whether the sorting order is descending.
     * @return A list of [ItemAudio] objects representing the fetched audio items.
     * @author AnhTTH
     */
    override fun fetchGalleryAudio(
        limit: Int, offset: Int, typeSort: Int, isDecending: Boolean
    ): List<ItemAudio> {
        val galleryAudio = mutableListOf<ItemAudio>()
        getCursorAudio(limit, offset)?.use { cursor ->
            // Lấy ra tất cả audio trong device
            // Check lượng lấy, cursor count là tổng số lượng audio trong máy, offset là số lượng đã lấy.
            if (cursor.count > offset) {
                val columnPath = cursor.getColumnIndex(MediaStore.Audio.Media.DATA)
                val columnName = cursor.getColumnIndex(MediaStore.Audio.Media.DISPLAY_NAME)
                val columnSize = cursor.getColumnIndex(MediaStore.Audio.Media.SIZE)
                val columnDuration = cursor.getColumnIndex(MediaStore.Audio.Media.DURATION)
                val columnDateAdded = cursor.getColumnIndex(MediaStore.Audio.Media.DATE_ADDED)
                val columnBucketDisPlayName =
                    cursor.getColumnIndex(MediaStore.Audio.Media.BUCKET_DISPLAY_NAME)
                kotlin.runCatching {
                    while (cursor.moveToNext()) {
                        val path = try {
                            cursor.getString(columnPath)
                        } catch (e: Exception) {
                            e.printStackTrace()
                            continue
                        } ?: continue

                        if (!path.startsWith(".")) {
                            val f = File(path)
                            if (f.isFile && !f.isHidden) {
                                val nameFileImage = cursor.getString(columnName) ?: f.name ?: ""
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
                                galleryAudio.add(
                                    ItemAudio(
                                        nameFileImage,
                                        nameFolder,
                                        size,
                                        nameFileImage.substringAfterLast('.', ""),
                                        path,
                                        timeAdded,
                                        duration,
                                        timeDuration
                                    )
                                )
                            }
                        }
                    }
                }.onFailure {
                    it.printStackTrace()
                }
            }

        }
        if (isDecending) {
            when (typeSort) {
                1 -> {
                    galleryAudio.sortBy { it.nameFile }
                }

                2 -> {
                    galleryAudio.sortBy { it.timeAdded }
                }

                3 -> {
                    galleryAudio.sortBy { it.size }
                }
            }

        } else {
            when (typeSort) {
                1 -> {
                    galleryAudio.sortByDescending { it.nameFile }
                }

                2 -> {
                    galleryAudio.sortByDescending { it.timeAdded }
                }

                3 -> {
                    galleryAudio.sortByDescending { it.size }
                }
            }
        }
        return galleryAudio
    }

    /**
     * Retrieves a cursor for querying audio files based on the provided limit and offset.
     * On devices running Android Oreo (API level 26) or later, uses a specific method to obtain the cursor,
     * otherwise, falls back to a method compatible with older Android versions.
     *
     * @param limit The maximum number of items to return in the cursor.
     * @param offset The index from which to start retrieving items in the cursor.
     * @return A cursor containing audio file information, or null if an error occurs.
     * @author AnhTTH
     */
    private fun getCursorAudio(limit: Int, offset: Int) = try {
        if (isAtLeastSdkVersion(Build.VERSION_CODES.O)) {

            getCursorFromO(limit, offset)
        } else {
            getCursorBelowO(limit, offset)
        }
    } catch (e: Exception) {
        e.printStackTrace()
        null
    }

    /**
     * Retrieves a cursor for querying audio files on devices running Android Oreo (API level 26) or later.
     *
     * @param limit The maximum number of items to return in the cursor.
     * @param offset The index from which to start retrieving items in the cursor.
     * @return A cursor containing audio file information.
     * @author AnhTTH
     */

    @RequiresApi(Build.VERSION_CODES.O)
    private fun getCursorFromO(limit: Int, offset: Int) = try {

        contentResolver.query(
            getContentUri(), getProjectionAudio(), Bundle().apply {
                putInt(ContentResolver.QUERY_ARG_LIMIT, limit)
                putInt(ContentResolver.QUERY_ARG_OFFSET, offset)

                putInt(
                    ContentResolver.QUERY_ARG_SORT_DIRECTION,
                    ContentResolver.QUERY_SORT_DIRECTION_DESCENDING
                )
                putString(ContentResolver.QUERY_ARG_SQL_SELECTION, getSelectionAudio())

            }, null
        )


    } catch (e: Exception) {
        e.printStackTrace()
        null
    }

    /**
     * Retrieves a cursor for querying audio files on devices running Android versions below Oreo (API level 26).
     * @param limit The maximum number of items to return in the cursor.
     * @param offset The index from which to start retrieving items in the cursor.
     * @return A cursor containing audio file information.
     * @author AnhTTH
     */
    private fun getCursorBelowO(limit: Int, offset: Int) = try {
        contentResolver.query(
            getContentUri(),
            getProjectionAudio(),
            getSelectionAudio(),
            null,
            "${MediaStore.Audio.Media.DATE_TAKEN} DESC LIMIT $limit OFFSET $offset"
        )
    } catch (e: Exception) {
        e.printStackTrace()
        null
    }

    /**
     * Constructs the SQL selection clause for querying audio files based on the Android version.
     * On Android Q (API level 29) and above, selects audio files with a size greater than 0.
     * @return The SQL selection clause for querying audio files.
     * @author AnhTTH
     */
    private fun getSelectionAudio() = try {
        if (isAtLeastSdkVersion(Build.VERSION_CODES.Q)) MediaStore.Audio.Media.SIZE + " > 0"
        else null
    } catch (e: Exception) {
        null
    }

    /**
     * Retrieves the content URI for querying audio files.
     * @return The content URI for querying audio files.
     * @author AnhTTH
     */
    private fun getContentUri() = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI

    /**
     * Retrieves the projection array for querying audio files.
     * @return The projection array containing the columns to retrieve from the audio files.
     * @author AnhTTH
     */
    private fun getProjectionAudio() = arrayOf(
        MediaStore.Audio.Media._ID,
        MediaStore.Audio.Media.DISPLAY_NAME,
        MediaStore.Audio.Media.DATA,
        MediaStore.Audio.Media.DATE_ADDED,
        MediaStore.Audio.Media.SIZE,
        MediaStore.Audio.Media.DURATION,
    )
}