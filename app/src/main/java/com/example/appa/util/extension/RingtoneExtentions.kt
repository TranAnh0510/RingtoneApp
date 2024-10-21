package com.example.appa.util.extension


import android.content.ContentUris
import android.content.ContentValues
import android.content.Context
import android.media.RingtoneManager
import android.net.Uri
import android.os.Build
import android.os.StrictMode
import android.provider.MediaStore
import android.util.Log
import android.webkit.MimeTypeMap
import java.io.File

/**
 * Sets a custom ringtone, alarm, or notification sound using the provided path and type.
 * @param path The path to the audio file.
 * @param type The type of sound to set: {@link RingtoneManager#TYPE_RINGTONE},
 * {@link RingtoneManager#TYPE_ALARM}, or {@link RingtoneManager#TYPE_NOTIFICATION}.
 * @author AnhTTH
 */
fun Context.setRingtoneNew(path: String, type: Int) {
    if (Build.VERSION.SDK_INT <= 28) {


        var k = File(path)
        val values = ContentValues()
        values.put(MediaStore.MediaColumns.TITLE, k.name)
        values.put(MediaStore.MediaColumns.MIME_TYPE, getMIMETypeNew(k.absolutePath))
        if (RingtoneManager.TYPE_RINGTONE == type) {
            values.put(MediaStore.Audio.Media.IS_RINGTONE, true)

        } else if (RingtoneManager.TYPE_ALARM == type) {
            values.put(MediaStore.Audio.Media.IS_ALARM, true)

        } else {
            values.put(MediaStore.Audio.Media.IS_NOTIFICATION, true)

        }
        values.put(MediaStore.MediaColumns.DATA, k.absolutePath)
        val uri = MediaStore.Audio.Media.getContentUriForPath(
            k.absolutePath
        )
        if (uri != null) {
            contentResolver.delete(
                uri, MediaStore.MediaColumns.DATA + "=\"" + k.absolutePath + "\"", null
            )
        }
        val newUri: Uri? = uri?.let { contentResolver.insert(it, values) }
        RingtoneManager.setActualDefaultRingtoneUri(
            this, type, newUri
        )
        MediaStore.Audio.Media.getContentUriForPath(
            k.absolutePath
        )?.let {
            contentResolver.insert(it, values)
        }


    } else {

        try {
            if (Build.VERSION.SDK_INT == 29) {
                var file = File(path)
                var uri = Uri.fromFile(file)
                if (uri != null) {
                    val builder = StrictMode.VmPolicy.Builder()
                    StrictMode.setVmPolicy(builder.build())

                    when (type) {
                        RingtoneManager.TYPE_ALARM -> {
                            RingtoneManager.setActualDefaultRingtoneUri(
                                this, RingtoneManager.TYPE_ALARM, uri
                            )

                        }

                        RingtoneManager.TYPE_NOTIFICATION -> {
                            RingtoneManager.setActualDefaultRingtoneUri(
                                this, RingtoneManager.TYPE_NOTIFICATION, uri
                            )

                        }

                        RingtoneManager.TYPE_RINGTONE -> {
                            RingtoneManager.setActualDefaultRingtoneUri(
                                this, RingtoneManager.TYPE_RINGTONE, uri
                            )
                        }
                    }
                }
            } else {
                val mediaID = getFilePathToMediaID(path, this)
                val uriN = ContentUris.withAppendedId(
                    MediaStore.Audio.Media.getContentUri("external"), mediaID
                )
                uriN.let { uri ->
                    try {
                        contentResolver.openOutputStream(uri)?.use { os ->
                            // Copy your file from an asset into os here
                        }
                    } catch (ignored: Exception) {
                        // Handle exceptions if needed
                    }
                    // Assuming 'type' is a variable or parameter defined elsewhere
                    when (type) {
                        RingtoneManager.TYPE_ALARM -> {
                            RingtoneManager.setActualDefaultRingtoneUri(
                                this, RingtoneManager.TYPE_ALARM, uri
                            )

                        }

                        RingtoneManager.TYPE_NOTIFICATION -> {
                            RingtoneManager.setActualDefaultRingtoneUri(
                                this, RingtoneManager.TYPE_NOTIFICATION, uri
                            )

                        }

                        RingtoneManager.TYPE_RINGTONE -> {
                            RingtoneManager.setActualDefaultRingtoneUri(
                                this, RingtoneManager.TYPE_RINGTONE, uri
                            )
                        }
                    }
                }
            }


        } catch (t: Throwable) {
        }
    }
}

/**
 * Retrieves the MIME type of the provided URL.
 *
 * @param url The URL of the file.
 * @return The MIME type of the file.
 */
private fun getMIMETypeNew(url: String?): String? {
    var mType: String? = null
    val mExtension = MimeTypeMap.getFileExtensionFromUrl(url)
    if (mExtension != null) {
        mType = MimeTypeMap.getSingleton().getMimeTypeFromExtension(mExtension)
    }
    return mType
}

/**
 * Retrieves the media ID associated with the provided song path.
 * @param songPath The path of the song.
 * @param context  The context.
 * @return The media ID of the song.
 */
private fun getFilePathToMediaID(songPath: String, context: Context): Long {
    var id: Long = 0
    val cr = context.contentResolver
    val uri = MediaStore.Files.getContentUri("external")
    val selection = MediaStore.Audio.Media.DATA
    val selectionArgs = arrayOf(songPath)
    val projection = arrayOf(MediaStore.Audio.Media._ID)
    val sortOrder = MediaStore.Audio.Media.TITLE + " ASC"
    val cursor = cr.query(
        uri, projection, "$selection=?", selectionArgs, null
    )
    if (cursor != null) {
        while (cursor.moveToNext()) {
            val idIndex = cursor.getColumnIndex(MediaStore.Audio.Media._ID)
            id = cursor.getString(idIndex).toLong()
        }
    }
    return id
}
