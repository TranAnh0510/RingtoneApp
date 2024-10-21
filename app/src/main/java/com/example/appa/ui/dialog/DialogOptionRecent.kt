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
import com.example.appa.databinding.DialogOptionRecentBinding
import com.example.appa.ui.base.BaseBindingBottomSheetDialogFragment
import com.example.appa.util.extension.checkSystemWritePermission
import com.example.appa.util.extension.openAndroidPermissionsMenu
import com.example.appa.util.extension.setOnSafeClick
import com.example.appa.util.extension.setRingtoneNew
import com.example.appa.util.setImageCategory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * display options related to recent items
 * @author AnhTTH
 */
class DialogOptionRecent : BaseBindingBottomSheetDialogFragment<DialogOptionRecentBinding>() {
    private var itemFavoriteUI: ItemFavoriteUI? = null
    private var itemRecent: ItemRecent? = null
    var isFavorite: Boolean = false
    var nameSound: String? = null
    var duration: String? = null
    var onClickAddToFavorite: ((ItemFavoriteUI, Boolean) -> Unit) = { _, _ -> }
    var onClickSetRingtone: ((ItemRecent) -> Unit) = { _ -> }
    var onClickSetAlarm: ((ItemRecent) -> Unit) = { _ -> }
    var onClickSetNotification: ((ItemRecent) -> Unit) = { _ -> }

    /**
     * displays the dialog and passes data from recents and favorites into the dialog, respectively
     * @author AnhTTH
     */
    fun showDialog(
        itemRecent: ItemRecent,
        itemFavourite: ItemFavoriteUI,
        isFavorite: Boolean
    ) {
        this.itemRecent = itemRecent
        this.itemFavoriteUI = itemFavourite
        this.isFavorite = isFavorite
        this.duration = itemFavourite.duration
        this.nameSound = itemFavourite.name
    }

    override val layoutId: Int
        get() = R.layout.dialog_option_recent

    override fun onCreatedView(view: View?, savedInstanceState: Bundle?) {
//        musicServerUI?.path?.let {
//            context?.downloadMusic(it, nameSound ?: "")?.let {
//                downloadId = it
//            }
//        }

        initData()
        initAction()
    }

    /**
     * Initialize data for the user interface in dialog
     * @author AnhTTh
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
            if (isFavorite)
                context?.getString(R.string.delete_from_my_favorites)
            else context?.getString(
                R.string.add_to_my_favorites
            )
    }

    /**
     * Register an activity result for the authorization request
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
     * assign actions to user interface elements in dialog
     * @author AnhTTH
     */
    private fun initAction() {
        /**
         * Assign an action when the user taps the TextView tvAddToFavorite
         * @author AnhTTH
         */
        binding.tvAddToFavorite.setOnSafeClick {
            itemFavoriteUI?.let { itemFavoriteUI ->
                onClickAddToFavorite(itemFavoriteUI, isFavorite)
            }
            dismiss()
        }
        /**
         * Assign an action when the user taps the TextView setRingtone
         * @author AnhTTH
         */
        binding.tvSetRingtone.setOnSafeClick {
            if (context?.checkSystemWritePermission() == true) {
                lifecycleScope.launch(Dispatchers.Main) {
                    itemFavoriteUI?.pathDownload?.let { pathDownload ->
                        App.instance.setRingtoneNew(
                            Uri.parse(pathDownload).path.toString(),
                            RingtoneManager.TYPE_RINGTONE
                        )
                        itemRecent?.let { it1 -> onClickSetRingtone(it1) }
                        Toast.makeText(
                            context,
                            getString(R.string.set_the_ringtone),
                            Toast.LENGTH_SHORT
                        ).show()
                        dismiss()
                    }
                }
            } else {
                requestPermissionWriteSetting.launch(Manifest.permission.WRITE_SETTINGS)

            }

        }

        /**
         * Assign an action when the user taps the TextView SetAlarm
         * @author AnhTTH
         */
        binding.tvSetAlarm.setOnSafeClick {
            if (context?.checkSystemWritePermission() == true) {

                lifecycleScope.launch(Dispatchers.Main) {
                    itemFavoriteUI?.pathDownload?.let { pathDownload ->
                        App.instance.setRingtoneNew(
                            Uri.parse(pathDownload).path.toString(),
                            RingtoneManager.TYPE_ALARM
                        )
                        itemRecent?.let { it1 -> onClickSetAlarm(it1) }
                        Toast.makeText(
                            context,
                            getString(R.string.set_the_alarm),
                            Toast.LENGTH_SHORT
                        ).show()
                        dismiss()
                    }
                }
            } else {
                requestPermissionWriteSetting.launch(Manifest.permission.WRITE_SETTINGS)

            }
        }
        /**
         * Assign an action when the user taps the TextView SetNotification
         * @author AnhTTH
         */
        binding.tvSetNotification.setOnSafeClick {
            if (context?.checkSystemWritePermission() == true) {

                lifecycleScope.launch(Dispatchers.Main) {
                    itemFavoriteUI?.pathDownload?.let { pathDownload ->
                        App.instance.setRingtoneNew(
                            Uri.parse(pathDownload).path.toString(),
                            RingtoneManager.TYPE_NOTIFICATION
                        )
                        itemRecent?.let { it1 -> onClickSetNotification(it1) }
                        Toast.makeText(
                            context,
                            getString(R.string.set_the_notification),
                            Toast.LENGTH_SHORT
                        ).show()

                        dismiss()
                    }

                }
            } else {
                requestPermissionWriteSetting.launch(Manifest.permission.WRITE_SETTINGS)

            }
        }
    }
}