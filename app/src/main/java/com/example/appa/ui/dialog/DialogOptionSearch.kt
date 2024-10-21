package com.example.appa.ui.dialog

import android.Manifest
import android.annotation.SuppressLint
import android.media.RingtoneManager
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.example.appa.R
import com.example.appa.data.model.ItemFavoriteUI
import com.example.appa.data.model.ItemRecent
import com.example.appa.data.model.musicserver.MusicServerUI
import com.example.appa.data.model.musicserver.toItemRecent
import com.example.appa.databinding.DialogOptionSearchBinding
import com.example.appa.ui.base.BaseBindingBottomSheetDialogFragment
import com.example.appa.util.extension.checkSystemWritePermission
import com.example.appa.util.extension.openAndroidPermissionsMenu
import com.example.appa.util.extension.setOnSafeClick
import com.example.appa.util.extension.setRingtoneNew
import com.example.appa.util.setImageCategory
/**
 * DialogOptionSearch is a Bottom Sheet Dialog Fragment that provides various options for the selected music item,
 * such as adding to favorites, setting as ringtone, alarm, or notification sound.
 * @author AnhTTH
 */
class DialogOptionSearch  : BaseBindingBottomSheetDialogFragment<DialogOptionSearchBinding>() {
    /** Represents the favorite item UI
     * @author AnhTTH */
    var itemFavoriteUI: ItemFavoriteUI? = null
    /** Represents the music server UI */
    private var musicServerUI: MusicServerUI? = null
    /** Indicates whether the item is a favorite */
    var isFavorite: Boolean = false
    /** The name of the sound */
    var nameSound: String? = null
    /** The duration of the sound */
    var duration: String? = null
    /**
     * Callback function when adding to favorite is clicked.
     * @author AnhTTH
     */
    var onClickAddToFavorite: ((ItemFavoriteUI, Boolean) -> Unit) = { _, _ -> }
    /**
     * Callback function when setting as ringtone is clicked.
     * @author AnhTTH
     */
    var onClickSetRingtone: ((ItemRecent) -> Unit) = { _ -> }
    /**
     * Callback function when setting as alarm is clicked.
     * @author AnhTTH
     */
    var onClickSetAlarm: ((ItemRecent) -> Unit) = { _ -> }
    /**
     * Callback function when setting as notification is clicked.
     * @author AnhTTH
     */
    var onClickSetNotification: ((ItemRecent) -> Unit) = { _ -> }
    /**
     * Shows the dialog with the provided music server UI, favorite item, and favorite status.
     * @param musicServerUI the music server UI
     * @param itemFavourite the favorite item
     * @param isFavorite whether the item is favorite
     * @author AnhTTH
     */
    fun showDialog(
        musicServerUI: MusicServerUI,
        itemFavourite: ItemFavoriteUI,
        isFavorite: Boolean
    ) {
        this.musicServerUI = musicServerUI
        this.itemFavoriteUI = itemFavourite
        this.isFavorite = isFavorite
        this.duration = itemFavourite.duration
        this.nameSound = itemFavourite.name
    }
    /**
     * Returns the layout ID for this fragment.
     * @return the layout ID
     * @author AnhTTH
     */
    override val layoutId: Int
        get() = R.layout.dialog_option_search
    /**
     * Called when the view is created. Initializes data and actions.
     * @param view the view
     * @param savedInstanceState the saved instance state
     * @author AnhTTH
     */
    override fun onCreatedView(view: View?, savedInstanceState: Bundle?) {
        initData()
        initAction()
    }
    /**
     * Initializes the data for the dialog view, setting up the UI elements with the appropriate information.
     * @author AnhTTH
     */
    @SuppressLint("SetTextI18n")
    private fun initData() {
        // Sets the text view to be selected for marquee effect
        binding.tvNameRecord.isSelected = true
        // Load image category if available
        itemFavoriteUI?.category?.setImageCategory()?.let {
            Glide.with(binding.imSound.context)
                .load(it)
                .placeholder(R.drawable.ic_loading_image)
                .error(R.drawable.ic_error_loading_image)
                .into(binding.imSound)
        }
        // Set the name and duration of the sound
        binding.tvNameRecord.text = nameSound
        binding.tvInformation.text = duration
        // Enable marquee effect for text views
        binding.tvNameRecord.isSelected = true
        binding.tvInformation.isSelected = true
        // Set the text for the add to favorite button based on the favorite status
        binding.tvAddToFavorite.text =
            if (isFavorite)
                context?.getString(R.string.delete_from_my_favorites)
            else context?.getString(
                R.string.add_to_my_favorites
            )
    }
    /**
     * Requests permission to write settings, and handles the result.
     * @author AnhTTH
     */
    private var requestPermissionWriteSetting =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
            if (isGranted) {
                // Permission granted
            } else {
                // Open the Android permissions menu if the permission is denied
                context?.openAndroidPermissionsMenu()
            }
        }
    /**
     * Initializes the actions for the dialog view, setting up click listeners for various buttons.
     * @author AnhTTH
     */
    private fun initAction() {
        // Set up click listener for the Add to Favorite button
        binding.tvAddToFavorite.setOnSafeClick {
            itemFavoriteUI?.let { itemFavoriteUI ->
                onClickAddToFavorite(itemFavoriteUI, isFavorite)
            }
            dismiss()
        }
        // Set up click listener for the Set Ringtone button
        binding.tvSetRingtone.setOnSafeClick {
            if (context?.checkSystemWritePermission() == true) {
                musicServerUI?.pathDownload?.let { pathDownload ->
                    context?.setRingtoneNew(
                        Uri.parse(pathDownload).path.toString(),
                        RingtoneManager.TYPE_RINGTONE
                    )
                    onClickSetRingtone(musicServerUI!!.toItemRecent())
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
        // Set up click listener for the Set Alarm button
        binding.tvSetAlarm.setOnSafeClick {
            if (context?.checkSystemWritePermission() == true) {
                musicServerUI?.pathDownload?.let { pathDownload ->
                    context?.setRingtoneNew(
                        Uri.parse(pathDownload).path.toString(),
                        RingtoneManager.TYPE_ALARM
                    )
                    onClickSetAlarm(musicServerUI!!.toItemRecent())
                    Toast.makeText(context, getString(R.string.set_the_alarm), Toast.LENGTH_SHORT)
                        .show()
                    dismiss()
                }
            } else {
                requestPermissionWriteSetting.launch(Manifest.permission.WRITE_SETTINGS)
            }
        }
        // Set up click listener for the Set Notification button
        binding.tvSetNotification.setOnSafeClick {
            if (context?.checkSystemWritePermission() == true) {
                musicServerUI?.pathDownload?.let { pathDownload ->
                    context?.setRingtoneNew(
                        Uri.parse(pathDownload).path.toString(),
                        RingtoneManager.TYPE_NOTIFICATION
                    )
                    onClickSetNotification(musicServerUI!!.toItemRecent())
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