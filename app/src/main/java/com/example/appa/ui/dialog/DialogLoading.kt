package com.example.appa.ui.dialog

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import com.example.appa.R
import com.example.appa.common.Constant
import com.example.appa.common.MessageEvent
import com.example.appa.databinding.DialogLoadingBinding
import com.example.appa.ui.base.BaseBindingDialogFragment
import com.example.appa.util.downloadMusic
import com.example.appa.util.getDownloadedFileUri
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

class DialogLoading : BaseBindingDialogFragment<DialogLoadingBinding>() {

    var title: String = ""
    var path: String = ""
    private var downloadId: Long = -1

    var onUpdate: (String, String) -> Unit = {_,_->}
    override val layoutId: Int
        get() = R.layout.dialog_loading

    /**
     * Called when the dialog is created and displayed
     * @author AnhTTH
     */
    override fun onCreatedView(view: View?, savedInstanceState: Bundle?) {
        EventBus.getDefault().register(this)
        /**
         * downloads the audio with the given path and title
         * @author AnhTTH
         */
        context?.downloadMusic(path, title ?: "")?.let {
            downloadId = it
        }
    }

    /**
     * handle EventBus events when new events are sent
     * @author AnhTTH
     */
    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onEvent(messageEvent: MessageEvent) {
        when (messageEvent.typeEvent) {
            Constant.EVENT_DOWNLOAD_COMPLETE -> {
                kotlin.runCatching {
                    val pathDownLoad = context?.getDownloadedFileUri(downloadId)
                    onUpdate(pathDownLoad.toString(), path)
                    dismiss()
                }.onFailure { it.printStackTrace() }
            }

        }
    }

    /**
     * unregister DialogOptionRecent
     * @author AnhTTH
     */
    override fun onDismiss(dialog: DialogInterface) {
        super.onDismiss(dialog)
        EventBus.getDefault().unregister(this)
    }
}