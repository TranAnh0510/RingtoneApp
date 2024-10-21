package com.example.appa.receiver

import android.app.DownloadManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.appa.common.Constant
import com.example.appa.common.MessageEvent
import org.greenrobot.eventbus.EventBus
/**
 * A BroadcastReceiver that listens for download completion events.
 * @author AnhTTH
 */
class DownloadReceiver:BroadcastReceiver() {
    /**
     * Invoked when a broadcast is received.
     * @param context The Context in which the receiver is running.
     * @param intent The Intent being received.
     * @author AnhTTH
     */
    override fun onReceive(context: Context, intent: Intent) {
        val action = intent.action
        if (action == DownloadManager.ACTION_DOWNLOAD_COMPLETE) {
            val downloadId = intent.getLongExtra(DownloadManager.EXTRA_DOWNLOAD_ID, -1)
            EventBus.getDefault().post(MessageEvent(Constant.EVENT_DOWNLOAD_COMPLETE, downloadId))
            context.unregisterReceiver(this)
        }
    }
}