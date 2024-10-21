package com.example.appa.data.repository.file

import android.content.Context
import android.database.Cursor
import android.media.MediaMetadataRetriever
import android.net.Uri
import android.provider.MediaStore
import com.example.appa.util.FileUtils
/**
 * Implementation of the [FileRepo] interface for retrieving duration and path from a given URI.
 * @author AnhTTH
 */
class FileRepoImpl : FileRepo {
    /**
     * Array of projection columns to be queried from the content resolver.
     * @author AnhTTH
     */
    val projection = arrayOf(
        MediaStore.Audio.AudioColumns.TITLE,
        MediaStore.Audio.AudioColumns.DATA,
        MediaStore.Audio.AudioColumns.DISPLAY_NAME,
        MediaStore.Audio.AudioColumns.RELATIVE_PATH,
        MediaStore.Audio.AudioColumns.DURATION,
        MediaStore.Audio.AudioColumns.SIZE
    )
    /**
     * Retrieves the duration of the media file corresponding to the provided URI.
     * @param context The context of the application.
     * @param uri The URI of the media file.
     * @return The duration of the media file in milliseconds.
     * @author AnhTTH
     */
    override fun getDurationFromUri(context: Context, uri: Uri): Long {
        context.contentResolver.query(uri, projection, null, null, null)?.use { cursor ->
            if (cursor.moveToFirst()) {
                val size = cursor.getSizeFile()
                if (size > 0) {
                    var duration = cursor.getDurationFile()
                    if (duration <= 0) {
                        duration = context.getDurationFromMediaRetriever(uri)
                    }
                    return (duration)
                } else {
                    return (0)
                }

            }

        }
        return  0
    }
    /**
     * Retrieves the file path corresponding to the provided URI.
     * @param context The context of the application.
     * @param uri The URI of the file.
     * @return The file path.
     * @author AnhTTH
     */
    override fun getPathFromUri(context: Context, uri: Uri): String {
        context.contentResolver.query(uri, projection, null, null, null)?.use { cursor ->
            if (cursor.moveToFirst()) {
                val size = cursor.getSizeFile()
                if (size > 0) {
                    var duration = cursor.getDurationFile()
                    if (duration <= 0) {
                        duration = context.getDurationFromMediaRetriever(uri)
                    }
                    if (duration > 0) {
                        var path: String? = cursor.getPathFile()
                        if (path == null) {
                            path = FileUtils.getPath(context, uri)
                            if (path == null) {

                                uri.path?.let { return (it) }
                            } else {
                                return (path)
                            }
                        } else {
                            return (path)
                        }
                    } else {
                        uri.path?.let { return (it) }
                    }
                } else {
                    uri.path?.let { return (it) }
                }
            } else {
                uri.path?.let { return (it) }
            }

        }
        return ""


    }
    /**
     * Extracts the file path from the cursor.
     * @return The file path.
     * @author AnhTTH
     */
    private fun Cursor.getPathFile() = try {
        val columnPath = getColumnIndex(MediaStore.Audio.AudioColumns.DATA)
        if (columnPath < 0) {
            val columnDisPlayName = getColumnIndex(MediaStore.Audio.AudioColumns.DISPLAY_NAME)
            val columnBucketDisPlayName =
                getColumnIndex(MediaStore.Audio.AudioColumns.RELATIVE_PATH)

        }
        getString(columnPath)
    } catch (e: Exception) {
        e.printStackTrace()
        null
    }
    /**
     * Extracts the file size from the cursor.
     * @return The file size.
     * @author AnhTTH
     */
    private fun Cursor.getSizeFile() = try {
        val columnSize = getColumnIndex(MediaStore.Audio.AudioColumns.SIZE)
        getLong(columnSize)
    } catch (e: Exception) {
        e.printStackTrace()
        0
    }
    /**
     * Extracts the duration of the file from the cursor.
     * @return The duration of the file.
     * @author AnhTTH
     */
    private fun Cursor.getDurationFile() = try {
        val columnDuration = getColumnIndex(MediaStore.Audio.AudioColumns.DURATION)
        getLong(columnDuration)
    } catch (e: Exception) {
        0
    }
    /**
     * Retrieves the duration of the media file using MediaMetadataRetriever.
     * @return The duration of the media file.
     * @author AnhTTH
     */
    private fun Context.getDurationFromMediaRetriever(uri: Uri) = try {
        val mmr = MediaMetadataRetriever().apply {
            setDataSource(this@getDurationFromMediaRetriever, uri)
        }
        val durationStr = mmr.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION)
        mmr.release()
        durationStr?.toLong() ?: 0
    } catch (e: Exception) {
        e.printStackTrace()
        0
    }
}