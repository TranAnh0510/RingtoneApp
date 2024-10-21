package com.example.appa.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.appa.common.Constant
import com.example.appa.common.MessageEvent
import org.greenrobot.eventbus.EventBus

/**
 *  listen and process network change through Intent
 *  @author AnhTTH
 */
class NetworkChangeReceiver : BroadcastReceiver() {
    /**
     * A broadcast event to this receiver when the network state changes
     * @author AnhTTH
     */
    override fun onReceive(context: Context, intent: Intent) {
        EventBus.getDefault().post(MessageEvent(Constant.EVENT_NET_WORK_CHANGE))
    }
}