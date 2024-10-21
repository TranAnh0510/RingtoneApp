package com.example.appa.ui.dialog

import android.Manifest
import android.annotation.SuppressLint
import android.media.RingtoneManager
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.bumptech.glide.Glide
import com.example.appa.App
import com.example.appa.R
import com.example.appa.data.model.ItemFavoriteUI
import com.example.appa.data.model.ItemRecent
import com.example.appa.data.model.toItemRecent
import com.example.appa.databinding.DialogOptionFavoriteBinding
import com.example.appa.ui.base.BaseBindingBottomSheetDialogFragment
import com.example.appa.util.extension.checkSystemWritePermission
import com.example.appa.util.extension.openAndroidPermissionsMenu
import com.example.appa.util.extension.setOnSafeClick
import com.example.appa.util.extension.setRingtoneNew
import com.example.appa.util.setImageCategory

/**
 * A dialog fragment for displaying options for a favorite item.
 * This dialog allows the user to view information about a favorite item, such as its name and duration,
 * and provides options for actions such as setting the item as ringtone, alarm, or notification.
 * @author AnhTTh
 */
class DialogOptionFavorite : BaseBindingBottomSheetDialogFragment<DialogOptionFavoriteBinding>() {
    /**
     * The favorite item to be displayed in the dialog.
     * @author AnhTTh
     */
    var itemFavoriteUI: ItemFavoriteUI? = null
    /**
     * The name of the favorite sound.
     * @author AnhTTh
     */
    var nameSound: String? = null
    /**
     * The duration of the favorite sound.
     * @author AnhTTh
     */
    var duration: String? = null
    /**
     * The action to be performed when setting the item as ringtone.
     * @author AnhTTh
     */
    var onClickSetRingtone: ((ItemRecent) -> Unit) = { _ -> }
    /**
     * The action to be performed when setting the item as alarm.
     * @author AnhTTh
     */
    var onClickSetAlarm: ((ItemRecent) -> Unit) = { _ -> }
    /**
     * The action to be performed when setting the item as notification.
     * @author AnhTTh
     */
    var onClickSetNotification: ((ItemRecent) -> Unit) = { _ -> }
    /**
     * Returns the layout resource ID for the dialog.
     * @author AnhTTh
     */
    override val layoutId: Int
        get() = R.layout.dialog_option_favorite
    /**
     * Initializes the data for the dialog.
     * @author AnhTTh
     */
    override fun onCreatedView(view: View?, savedInstanceState: Bundle?) {
        initData()
        initAction()
    }
    /**
     * Shows the dialog with the specified favorite item.
     * @param itemFavorite The favorite item to be displayed.
     * @author AnhTTh
     */
    fun showDialog(itemFavourite: ItemFavoriteUI) {
        this.itemFavoriteUI = itemFavourite
        this.duration = itemFavourite.duration
        this.nameSound = itemFavourite.name
    }
    /**
     * Initializes the data displayed in the dialog.
     * Sets the category image, name of the recorded sound, information about its duration,
     * and enables text selection.
     * @author AnhTTH
     */
    @SuppressLint("SetTextI18n")
    private fun initData() {
        // Set the favorite item as ringtone
        itemFavoriteUI?.category?.setImageCategory()?.let {
            Glide.with(binding.imSound.context)
                .load(it)
                .placeholder(R.drawable.ic_loading_image)
                .error(R.drawable.ic_error_loading_image)
                .into(binding.imSound)
        }
        binding.tvNameRecord.text = nameSound
        binding.tvInformation.text = duration
        binding.tvNameRecord.isSelected = true
        binding.tvInformation.isSelected = true
    }
    /**
     * Callback for handling the result of the permission request for writing settings.
     * @author AnhTTH
     */
    private var requestPermissionWriteSetting =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
            if (isGranted) {
            } else {
                context?.openAndroidPermissionsMenu()
            }
        }
    /**
     * Initializes actions for setting the favorite item as ringtone, alarm, or notification.
     * @author AnhTTH
     */
    private fun initAction() {
        binding.tvSetRingtone.setOnSafeClick {
            if (context?.checkSystemWritePermission() == true) {
                itemFavoriteUI?.pathDownload?.let { pathDownload ->
                    App.instance.setRingtoneNew(
                        Uri.parse(pathDownload).path.toString(),
                        RingtoneManager.TYPE_RINGTONE
                    )
                    itemFavoriteUI?.toItemRecent()?.let {
                        onClickSetRingtone(it)
                    }
                    Toast.makeText(
                        context,
                        getString(R.string.set_the_ringtone),
                        Toast.LENGTH_SHORT
                    ).show()
                    dismiss()
                }
            } else {
                requestPermissionWriteSetting.launch(Manifest.permission.WRITE_SETTINGS)
            }
        }
        // Set the favorite item as alarm
        binding.tvSetAlarm.setOnSafeClick {
            if (context?.checkSystemWritePermission() == true) {
                itemFavoriteUI?.pathDownload?.let { pathDownload ->
                    App.instance.setRingtoneNew(
                        Uri.parse(pathDownload).path.toString(),
                        RingtoneManager.TYPE_ALARM
                    )
                    itemFavoriteUI?.toItemRecent()?.let {
                        onClickSetAlarm(it)
                    }
                    Toast.makeText(context, getString(R.string.set_the_alarm), Toast.LENGTH_SHORT)
                        .show()
                    dismiss()
                }
            } else {
                requestPermissionWriteSetting.launch(Manifest.permission.WRITE_SETTINGS)
            }
        }
        // Set the favorite item as notification
        binding.tvSetNotification.setOnSafeClick {
            if (context?.checkSystemWritePermission() == true) {
                itemFavoriteUI?.pathDownload?.let { pathDownload ->
                    App.instance.setRingtoneNew(
                        Uri.parse(pathDownload).path.toString(),
                        RingtoneManager.TYPE_NOTIFICATION
                    )
                    itemFavoriteUI?.toItemRecent()?.let {
                        onClickSetNotification(it)
                    }
                    Toast.makeText(
                        context,
                        getString(R.string.set_the_notification),
                        Toast.LENGTH_SHORT
                    ).show()
                    dismiss()
                }
            } else {
                requestPermissionWriteSetting.launch(Manifest.permission.WRITE_SETTINGS)
            }
        }
    }
}