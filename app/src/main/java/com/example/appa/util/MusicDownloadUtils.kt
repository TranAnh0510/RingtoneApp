package com.example.appa.util

import android.app.DownloadManager
import android.content.Context
import android.content.IntentFilter
import android.net.Uri
import android.os.Build
import android.os.Environment
import com.example.appa.App
import com.example.appa.receiver.DownloadReceiver

// The download receiver instance to handle download completion events.
val receiver = DownloadReceiver()

/**
 * Initiates a music download from the specified URL with the given title.
 * @param url The URL of the music file to download.
 * @param title The title of the music file.
 * @return The ID of the download request.
 * @author AnhTTH
 */
fun Context.downloadMusic(url: String, title: String): Long {
    val downloadManager = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
    val request = DownloadManager.Request(Uri.parse(url))
    request.setTitle(title)
    request.setDescription("Downloading...")
    request.allowScanningByMediaScanner()
    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)

    request.setDestinationInExternalPublicDir(
        Environment.DIRECTORY_DOWNLOADS, "${title}${System.currentTimeMillis()}.mp3"
    )

    val intentFilter = IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE)
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        App.instance.registerReceiver(receiver, intentFilter, Context.RECEIVER_EXPORTED)
    } else {
        App.instance.registerReceiver(receiver, intentFilter)

    }
    return downloadManager.enqueue(request)
}

/**
 * Retrieves the URI of the downloaded file corresponding to the given download ID.
 * @param downloadId The ID of the download request.
 * @return The URI of the downloaded file, or null if not found.
 * @author AnhTTH
 */
fun Context.getDownloadedFileUri(downloadId: Long): Uri? {
    try {
        val downloadManager = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
        val query = DownloadManager.Query().setFilterById(downloadId)
        val cursor = downloadManager.query(query)
        if (cursor.moveToFirst()) {
            val uriIndex = cursor.getColumnIndex(DownloadManager.COLUMN_LOCAL_URI)
            cursor.getString(uriIndex)?.let { uriString ->

                return Uri.parse(uriString)
            }
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }
    return null
}

