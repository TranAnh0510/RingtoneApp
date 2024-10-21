package com.example.appa.ui.dialog

import android.Manifest
import android.annotation.SuppressLint
import android.media.RingtoneManager
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.lifecycle.lifecycleScope
import com.bumptech.glide.Glide
import com.example.appa.App
import com.example.appa.R
import com.example.appa.data.model.ItemFavoriteUI
import com.example.appa.data.model.ItemRecent
import com.example.appa.data.model.musicserver.MusicServerUI
import com.example.appa.data.model.musicserver.toItemRecent
import com.example.appa.databinding.DialogOptionCategoryBinding
import com.example.appa.ui.base.BaseBindingBottomSheetDialogFragment
import com.example.appa.util.extension.checkSystemWritePermission
import com.example.appa.util.extension.openAndroidPermissionsMenu
import com.example.appa.util.extension.setOnSafeClick
import com.example.appa.util.extension.setRingtoneNew
import com.example.appa.util.setImageCategory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
/**
 * A dialog fragment for displaying options for a sound category.
 * This dialog allows the user to view information about a sound, such as its name and duration,
 * and provides options for actions such as adding the sound to favorites, setting it as ringtone,
 * alarm, or notification.
 * @author AnhTTH
 */
class DialogOptionCategory  : BaseBindingBottomSheetDialogFragment<DialogOptionCategoryBinding>() {
    /**
     * The favorite item associated with the sound category.
     * @author AnhTTH
     */
    private var itemFavoriteUI: ItemFavoriteUI? = null
    /**
     * The music server UI item associated with the sound category.
     * @author AnhTTH
     */
    private var musicServerUI: MusicServerUI? = null
    /**
     * Flag indicating whether the sound is in favorites.
     * @author AnhTTH
     */
    var isFavorite: Boolean = false
    /**
     * The name of the sound.
     * @author AnhTTH
     */
    var nameSound: String? = null
    /**
     * The duration of the sound.
     * @author AnhTTH
     */
    var duration: String? = null
    /**
     * The action to be performed when adding/removing the sound from favorites.
     * @author AnhTTH
     */
    var onClickAddToFavorite: ((ItemFavoriteUI, Boolean) -> Unit) = { _, _ -> }
    /**
     * The action to be performed when setting the sound as ringtone.
     * @author AnhTTH
     */
    var onClickSetRingtone: ((ItemRecent) -> Unit) = { _ -> }
    /**
     * The action to be performed when setting the sound as alarm.
     * @author AnhTTH
     */
    var onClickSetAlarm: ((ItemRecent) -> Unit) = { _ -> }
    /**
     * The action to be performed when setting the sound as notification.
     * @author AnhTTH
     */
    var onClickSetNotification: ((ItemRecent) -> Unit) = { _ -> }
    /**
     * Shows the dialog with the specified music server UI item and favorite item.
     * @param musicServerUI The music server UI item.
     * @param itemFavorite The favorite item.
     * @param isFavorite Flag indicating whether the sound is in favorites.
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
     * Returns the layout resource ID for the dialog.
     * @author AnhTTH
     */
    override val layoutId: Int
        get() = R.layout.dialog_option_category
    /**
     * Initializes the data for the dialog.
     * @author AnhTTH
     */
    override fun onCreatedView(view: View?, savedInstanceState: Bundle?) {
        initData()
        initAction()
    }
    /**
     * Initializes the data displayed in the dialog.
     * Sets the category image, name of the sound, information about its duration,
     * and enables text selection. Also sets the text of the "Add to favorite" button
     * based on whether the sound is in favorites.
     * @author AnhTTH
     */
    @SuppressLint("SetTextI18n")
    private fun initData() {
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

        binding.tvAddToFavorite.text =
            if (isFavorite) context?.getString(R.string.delete_from_my_favorites)
            else context?.getString(R.string.add_to_my_favorites)
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
     * Initializes actions for setting options such as adding to favorites, setting as ringtone, alarm, or notification.
     * @author AnhTTH
     */
    private fun initAction() {

        binding.tvAddToFavorite.setOnSafeClick {
            itemFavoriteUI?.let { itemFavoriteUI ->
                onClickAddToFavorite(itemFavoriteUI, isFavorite)
            }
            dismiss()
        }
        // Set as ringtone
        binding.tvSetRingtone.setOnSafeClick {
            if (context?.checkSystemWritePermission() == false) {
                requestPermissionWriteSetting.launch(Manifest.permission.WRITE_SETTINGS)
            } else {
                lifecycleScope.launch(Dispatchers.Main) {
                    musicServerUI?.pathDownload?.let { pathDownload ->
                        App.instance.setRingtoneNew(
                            Uri.parse(pathDownload).path.toString(),
                            RingtoneManager.TYPE_RINGTONE
                        )
                        musicServerUI?.toItemRecent()?.let {
                            onClickSetRingtone(it)
                        }
                        Toast.makeText(
                            context,
                            getString(R.string.set_the_ringtone),
                            Toast.LENGTH_SHORT
                        ).show()

                        dismiss()
                    }
                }
            }
        }
        // Set as alarm
        binding.tvSetAlarm.setOnSafeClick {
            if (context?.checkSystemWritePermission() == false) {
                requestPermissionWriteSetting.launch(Manifest.permission.WRITE_SETTINGS)
            } else {
                lifecycleScope.launch(Dispatchers.Main) {
                    musicServerUI?.pathDownload?.let { pathDownload ->

                        App.instance.setRingtoneNew(
                            Uri.parse(pathDownload).path.toString(),
                            RingtoneManager.TYPE_ALARM
                        )
                        musicServerUI?.toItemRecent()?.let {
                            onClickSetAlarm(it)
                        }
                        Toast.makeText(
                            context,
                            getString(R.string.set_the_alarm),
                            Toast.LENGTH_SHORT
                        )
                            .show()
                        dismiss()
                    }
                }
            }
        }
        // Set as notification
        binding.tvSetNotification.setOnSafeClick {
            if (context?.checkSystemWritePermission() == false) {
                requestPermissionWriteSetting.launch(Manifest.permission.WRITE_SETTINGS)
            } else {
                lifecycleScope.launch(Dispatchers.Main) {
                    musicServerUI?.pathDownload?.let { pathDownload ->
                        App.instance.setRingtoneNew(
                            Uri.parse(pathDownload).path.toString(),
                            RingtoneManager.TYPE_NOTIFICATION
                        )
                        musicServerUI?.toItemRecent()?.let {
                            onClickSetNotification(it)
                        }
                        Toast.makeText(
                            context,
                            getString(R.string.set_the_notification),
                            Toast.LENGTH_SHORT
                        ).show()
                        dismiss()
                    }
                }
            }
        }
    }

}