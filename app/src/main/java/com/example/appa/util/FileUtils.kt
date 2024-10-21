package com.example.appa.util

import android.content.ContentResolver
import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.database.Cursor
import android.net.Uri
import android.os.Build.VERSION_CODES.Q
import android.os.Environment
import android.provider.MediaStore
import com.example.appa.util.extension.isAtLeastSdkVersion
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream

/**
 * Utility object for file-related operations.
 * @author AnhTTH
 */
object FileUtils {
    /**
     * Saves an audio file to internal storage and adds it to the media store.
     * @param context The context from which the method is called.
     * @param uri The URI of the audio file.
     * @param name The name of the audio file.
     * @return The absolute path of the saved audio file, or an empty string if saving fails.
     * @author AnhTTH
     */
    fun Context.saveAudioToInternalStorage(context: Context, uri: String, name: String): String {
        val contentResolver: ContentResolver = contentResolver
        val inputStream: InputStream

        try {
            inputStream = contentResolver.openInputStream(Uri.parse(uri)) ?: return ""

            val outputDir = File(filesDir, "App190/recordings")
            if (!outputDir.exists()) {
                outputDir.mkdirs()
            }
            val outputFile = File(outputDir, "${System.currentTimeMillis()}.aac")
            if (outputFile.exists()) outputFile.mkdirs()

            copyFile(inputStream, FileOutputStream(outputFile))
            addToMediaStore(context, outputFile)
            return outputFile.absolutePath
        } catch (e: IOException) {
            e.printStackTrace()
            return ""
        }
    }

    /**
     * Copies data from an input stream to an output stream.
     * @param inputStream The input stream.
     * @param outputStream The output stream.
     * @author AnhTTH
     */
    private fun copyFile(inputStream: InputStream, outputStream: OutputStream) {
        val buffer = ByteArray(1024)
        var read: Int

        try {
            while (inputStream.read(buffer).also { read = it } != -1) {
                outputStream.write(buffer, 0, read)
            }
        } finally {
            inputStream.close()
            outputStream.close()
        }
    }

    /**
     * Adds the file to the media store.
     * @param context The context from which the method is called.
     * @param file The file to be added to the media store.
     * @author AnhTTH
     */
    private fun addToMediaStore(context: Context, file: File) {
        val values = ContentValues().apply {
            put(MediaStore.Images.Media.DISPLAY_NAME, file.name)
            put(MediaStore.Images.Media.MIME_TYPE, "audio/aac")
            if (isAtLeastSdkVersion(Q)) {
                put(MediaStore.Images.Media.RELATIVE_PATH, Environment.DIRECTORY_MUSIC)
            } else {
//                put(MediaStore.Images.Media.DATA, Environment.DIRECTORY_MUSIC)
            }
        }

        val contentResolver: ContentResolver = context.contentResolver
        kotlin.runCatching {
            val uri = contentResolver.insert(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, values)

            uri?.let {
                try {
                    val outputStream = contentResolver.openOutputStream(it)
                    val inputStream = FileInputStream(file)
                    if (outputStream != null) {
                        copyFile(inputStream, outputStream)
                    }
                    inputStream.close()
                    outputStream?.close()

                    val mediaScanIntent = Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE)
                    mediaScanIntent.data = Uri.fromFile(file)
                    context.sendBroadcast(mediaScanIntent)
                } catch (e: IOException) {
                    e.printStackTrace()
                }
            }
        }.onFailure {
            it.printStackTrace()
        }


    }

    /**
     * Gets the path of a file from its URI.
     * @param context The context from which the method is called.
     * @param uri The URI of the file.
     * @return The path of the file, or null if not found.
     * @author AnhTTH
     */
    fun getPath(context: Context, uri: Uri): String? {
        if ("content".equals(uri.scheme, ignoreCase = true)) {
            val projection = arrayOf(
                MediaStore.Images.Media.DATA
            )
            val cursor: Cursor?
            try {
                cursor = context.contentResolver.query(uri, projection, null, null, null)
                if (cursor != null) {
                    val column_index = cursor.getColumnIndex(MediaStore.Audio.Media.DATA)
                    if (cursor.moveToFirst()) {
                        return cursor.getString(column_index)
                    }
                    cursor.close()
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        } else if ("file".equals(uri.scheme, ignoreCase = true)) {
            return uri.path
        }
        return null
    }
}