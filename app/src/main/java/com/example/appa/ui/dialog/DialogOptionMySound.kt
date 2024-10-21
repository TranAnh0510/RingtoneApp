package com.example.appa.ui.dialog

import android.Manifest
import android.annotation.SuppressLint
import android.media.RingtoneManager
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.example.appa.App
import com.example.appa.R
import com.example.appa.databinding.DialogOptionMySoundBinding
import com.example.appa.ui.base.BaseBindingBottomSheetDialogFragment
import com.example.appa.util.extension.checkSystemWritePermission
import com.example.appa.util.extension.openAndroidPermissionsMenu
import com.example.appa.util.extension.setOnSafeClick
import com.example.appa.util.extension.setRingtoneNew
/**
 * A dialog fragment for displaying options for a custom sound.
 * This dialog allows the user to view information about a custom sound, such as its name, duration, and path,
 * and provides options for actions such as deleting the sound.
 * @author AnhTTH
 */
class DialogOptionMySound : BaseBindingBottomSheetDialogFragment<DialogOptionMySoundBinding>() {
    /**
     * The name of the custom sound.
     *  @author AnhTTH
     */
    var nameSound: String? = null
    /**
     * The duration of the custom sound.
     *  @author AnhTTH
     */
    var duration: String? = null
    /**
     * The path to the custom sound file.
     *  @author AnhTTH
     */
    var path: String? = null
    /**
     * The action to be performed when the delete option is clicked.
     *  @author AnhTTH
     */
    var onClickDelete: ((String) -> Unit) = {}
    /**
     * The ID of the custom sound.
     *  @author AnhTTH
     */
    var id: Long = 0

    /**
     * Returns the layout resource ID for the dialog.
     *  @author AnhTTH
     */
    override val layoutId: Int
        get() = R.layout.dialog_option_my_sound
    /**
     * Initializes the data for the dialog.
     *  @author AnhTTH
     */
    override fun onCreatedView(view: View?, savedInstanceState: Bundle?) {
        initData()
        initAction()
    }
    /**
     * Callback for handling the result of the permission request for writing settings.
     *  @author AnhTTH
     */
    private var requestPermissionWriteSetting =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
            if (isGranted) {
            } else {
                context?.openAndroidPermissionsMenu()
            }
        }
    /**
     * Initializes the data displayed in the dialog.
     * Sets the name of the recorded sound, information about its duration, and enables text selection.
     *  @author AnhTTH
     */
    @SuppressLint("SetTextI18n")
    private fun initData() {
        binding.tvNameRecord.text = nameSound
        binding.tvInformation.text = duration
        binding.tvNameRecord.isSelected = true
        binding.tvInformation.isSelected = true
    }
    /**
     * Initializes actions for various buttons in the dialog.
     * Sets actions for setting the sound as ringtone, alarm, or notification, and deleting the sound.
     *  @author AnhTTH
     */
    private fun initAction() {
        // Set the sound as ringtone
        binding.tvSetRingtone.setOnSafeClick {
            Log.e("TAG", "initAction: "+path )
            if (context?.checkSystemWritePermission() == true) {
                path?.let { it1 ->
                    App.instance.setRingtoneNew(
                        it1,
                        RingtoneManager.TYPE_RINGTONE
                    )
                }
                Toast.makeText(context, getString(R.string.set_the_ringtone), Toast.LENGTH_SHORT)
                    .show()
                dismiss()
            } else {
                requestPermissionWriteSetting.launch(Manifest.permission.WRITE_SETTINGS)

            }
        }
        // Set the sound as alarm
        binding.tvSetMessage.setOnSafeClick {
            if (context?.checkSystemWritePermission() == true) {
                path?.let { it1 ->
                    App.instance.setRingtoneNew(
                        it1,
                        RingtoneManager.TYPE_ALARM
                    )
                }
                Toast.makeText(context, getString(R.string.set_the_alarm), Toast.LENGTH_SHORT)
                    .show()
                dismiss()
            } else {
                requestPermissionWriteSetting.launch(Manifest.permission.WRITE_SETTINGS)

            }
        }
        // Set the sound as notification
        binding.tvSetNotification.setOnSafeClick {
            if (context?.checkSystemWritePermission() == true) {
                path?.let { it1 ->
                    App.instance.setRingtoneNew(
                        it1,
                        RingtoneManager.TYPE_NOTIFICATION
                    )
                }
                Toast.makeText(
                    context,
                    getString(R.string.set_the_notification),
                    Toast.LENGTH_SHORT
                )
                    .show()
                dismiss()
            } else {
                requestPermissionWriteSetting.launch(Manifest.permission.WRITE_SETTINGS)

            }
        }
        // Delete the sound
        binding.tvDelete.setOnSafeClick {
            path?.let { it1 -> onClickDelete(it1) }
            dismiss()
        }
    }
}