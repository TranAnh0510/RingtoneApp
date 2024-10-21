package com.example.appa.data.repository.file

import android.content.Context
import android.net.Uri

/**
 * Interface for a file repository providing methods to retrieve duration and path from a given URI.
 * @author AnhTTH
 */
interface FileRepo {
    /**
     * Retrieves the duration of the media file corresponding to the provided URI.
     * @param context The context of the application.
     * @param uri The URI of the media file.
     * @return The duration of the media file in milliseconds.
     * @author AnhTTH
     */
    fun getDurationFromUri(context: Context, uri: Uri): Long

    /**
     * Retrieves the file path corresponding to the provided URI.
     * @param context The context of the application.
     * @param uri The URI of the file.
     * @return The file path.
     * @author AnhTTH
     */
    fun getPathFromUri(context: Context, uri: Uri): String
}