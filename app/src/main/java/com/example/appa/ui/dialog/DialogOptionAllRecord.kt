package com.example.appa.ui.dialog

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import com.example.appa.R
import com.example.appa.databinding.DialogOptionAllRecordBinding
import com.example.appa.ui.base.BaseBindingBottomSheetDialogFragment
import com.example.appa.util.extension.setOnSafeClick
/**
 * A dialog fragment for displaying options for all recorded sounds.
 * This dialog allows the user to view information about a recorded sound, such as its name, date, and duration,
 * and provides options for actions such as editing, changing name, adding to my sounds or favorites,
 * setting as ringtone, message, or notification, and deleting the sound.
 * @author AnhTTh
 */
class DialogOptionAllRecord : BaseBindingBottomSheetDialogFragment<DialogOptionAllRecordBinding>() {

    /**
     * The name of the recorded sound.
     */
    var nameSound: String? = null
    /**
     * The date when the sound was recorded.
     */
    var date: String? = null
    /**
     * The duration of the recorded sound.
     */
    var duration: String? = null
    /**
     * The action to be performed when editing the recorded sound.
     */
    var onClickEdit: (() -> Unit) = {}
    /**
     * The action to be performed when changing the name of the recorded sound.
     */
    var onClickChangeName: (() -> Unit) = {}
    /**
     * The action to be performed when adding the recorded sound to "My Sounds".
     */
    var onClickAddToMySound: (() -> Unit) = {}
    /**
     * The action to be performed when adding the recorded sound to favorites.
     */
    var onClickAddToFavorite: (() -> Unit) = {}
    /**
     * The action to be performed when setting the recorded sound as ringtone.
     * AnhTTh
     */
    var onClickSetRingtone: (() -> Unit) = {}
    /**
     * The action to be performed when setting the recorded sound as message tone.
     * AnhTTh
     */
    var onClickSetMessage: (() -> Unit) = {}
    /**
     * The action to be performed when setting the recorded sound as notification tone.
     * AnhTTh
     */
    var onClickSetNotification: (() -> Unit) = {}
    /**
     * The action to be performed when deleting the recorded sound.
     * AnhTTh
     */
    var onClickDelete: (() -> Unit) = {}
    /**
     * Returns the layout resource ID for the dialog.
     * AnhTTh
     */
    override val layoutId: Int
        get() = R.layout.dialog_option_all_record
    /**
     * Initializes the data for the dialog.
     * AnhTTh
     */
    override fun onCreatedView(view: View?, savedInstanceState: Bundle?) {
        initData()
        initAction()
    }
    /**
     * Initializes the data displayed in the dialog.
     * Sets the name of the recorded sound, date of recording, and duration of the sound.
     * AnhTTh
     */
    @SuppressLint("SetTextI18n")
    private fun initData() {
        binding.tvNameRecord.text = nameSound
        binding.tvInformation.text = "$date - $duration"
    }
    /**
     * Initializes actions for various options available for the recorded sound.
     * Sets actions for editing, changing name, adding to "My Sounds", adding to favorites,
     * setting as ringtone, message tone, notification tone, and deleting the recorded sound.
     * AnhTTh
     */
    private fun initAction() {
        // Edit the recorded sound
        binding.tvEdit.setOnSafeClick {
            onClickEdit()
        }
        // Change the name of the recorded sound
        binding.tvChangeName.setOnSafeClick {
            onClickChangeName()
        }
        // Add the recorded sound to "My Sounds"
        binding.tvAddToMySound.setOnSafeClick {
            onClickAddToMySound()
        }
        // Add the recorded sound to favorites
        binding.tvAddToFavorite.setOnSafeClick {
            onClickAddToFavorite()
        }
        // Set the recorded sound as ringtone
        binding.tvSetRingtone.setOnSafeClick {
            onClickSetRingtone()
        }
        // Set the recorded sound as message tone
        binding.tvSetMessage.setOnSafeClick {
            onClickSetMessage()
        }
        // Set the recorded sound as notification tone
        binding.tvSetNotification.setOnSafeClick {
            onClickSetNotification()
        }
        // Delete the recorded sound
        binding.tvDelete.setOnSafeClick {
            onClickDelete()
        }
    }
}