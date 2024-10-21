package com.example.appa.ui.activity.permission

import android.Manifest
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import com.example.appa.R
import com.example.appa.common.Constant
import com.example.appa.data.local.shared.SharedPreferenceHelper
import com.example.appa.databinding.ActivityPermissionBinding
import com.example.appa.ui.activity.main.MainActivity
import com.example.appa.ui.base.BaseBindingActivity
import com.example.appa.ui.dialog.DialogDeniedExternalStorage
import com.example.appa.ui.dialog.DialogDeniedMediaAudio
import com.example.appa.ui.dialog.DialogDeniedMediaVideo
import com.example.appa.ui.dialog.DialogDeniedWriteSetting
import com.example.appa.util.extension.checkSystemWritePermission
import com.example.appa.util.extension.gone
import com.example.appa.util.extension.isAtLeastSdkVersion
import com.example.appa.util.extension.isGrantMediaAudioPermission
import com.example.appa.util.extension.isGrantMediaVideoPermission
import com.example.appa.util.extension.isGrantReadExternalStoragePermission
import com.example.appa.util.extension.openAndroidPermissionsMenu
import com.example.appa.util.extension.setFullScreen
import com.example.appa.util.extension.setIconDrawableEnd
import com.example.appa.util.extension.setOnSafeClick
import com.example.appa.util.extension.startSetting
import com.example.appa.util.extension.visible

/**
 * Permission Activity to set permission for this app.
 * @author AnhTTH
 */
class PermissionAct : BaseBindingActivity<ActivityPermissionBinding, PermissionVM>() {

    /**
     * grant permission for external storage
     * @author AnhTTH
     */
    private val dialogDeniedExternalStorage: DialogDeniedExternalStorage by lazy {
        DialogDeniedExternalStorage().apply {
            onClickGotoSetting = {
                startSetting()
            }
        }
    }

    /**
     * grant permission for media video
     */
    private val dialogDeniedMediaVideo: DialogDeniedMediaVideo by lazy {
        DialogDeniedMediaVideo().apply {
            onClickGotoSetting = {
                startSetting()
            }
        }
    }

    /**
     * grant permission for media audio
     */

    private val dialogDeniedMediaAudio: DialogDeniedMediaAudio by lazy {
        DialogDeniedMediaAudio().apply {
            onClickGotoSetting = {
                startSetting()
            }
        }
    }

    /**
     * grant permission for write setting
     */
    private val dialogDeniedWriteSetting: DialogDeniedWriteSetting by lazy {
        DialogDeniedWriteSetting().apply {
            onClickGotoSetting = {
                openAndroidPermissionsMenu()
            }
        }
    }

    /**
     * manage state through isGrantWriteSetting variable, update app permission changes
     * @author AnhTTH
     */
    private var isGrantWriteSetting = false
        set(value) {
            field = value
            binding.tvWriteSetting.setOnOff(value)
            showButtonGo()
            if (value && dialogDeniedWriteSetting.isAdded) {
                dialogDeniedWriteSetting.dismiss()
            }
        }

    /**
     * update permission storage state by calling binding.tvWriteStorage.setOnOff(value)
     * if the new value is true and the dialogDeniedExternalStorage is currently being displayed,
     * then the dialog will be hidden
     * @author AnhTTH
     */

    private var isGrantStorage = false
        set(value) {
            field = value
            binding.tvWriteStorage.setOnOff(value)
            showButtonGo()
            if (value && dialogDeniedExternalStorage.isAdded) {
                dialogDeniedExternalStorage.dismiss()
            }
        }

    /**
     * update permission storage state by calling binding.tvWriteStorage.setOnOff(value)
     * if the new value is true and the dialogDeniedMediaVideo is currently being displayed,
     * then the dialog will be hidden
     * @author AnhTTH
     */

    private var isGrantVideo = false
        set(value) {
            field = value
            binding.tvMediaVideo.setOnOff(value)
            showButtonGo()
            if (value && dialogDeniedMediaVideo.isAdded) {
                dialogDeniedMediaVideo.dismiss()
            }
        }

    /**
     * update permission storage state by calling binding.tvWriteStorage.setOnOff(value)
     * if the new value is true and the dialogDeniedMediaAudio is currently being displayed,
     * then the dialog will be hidden
     * @author AnhTTH
     */

    private var isGrantAudio = false
        set(value) {
            field = value
            binding.tvMediaAudio.setOnOff(value)
            showButtonGo()
            if (value && dialogDeniedMediaAudio.isAdded) {
                dialogDeniedMediaAudio.dismiss()
            }
        }

    /**
     * registration of permission request to write setting
     * if the permission is granted, isGrantWriteSetting is set to true
     * if the permission is denied, the dialogDeniedWriteSetting is displayed
     * @author AnhTTH
     */
    private var requestPermissionWriteSetting =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
            if (isGranted) {
                isGrantWriteSetting = true
            } else {
                openAndroidPermissionsMenu()
            }
        }

    /**
     * registration of permission request to external storage
     * if the permission is granted, isGrantStorage is set to true
     * if the permission is denied, the dialogDeniedExternalStorage to grant permission
     * @author AnhTTH
     */

    private var requestPermissionExternalStorage =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
            if (isGranted) {
                isGrantStorage = true
            } else {
                dialogDeniedExternalStorage.show(
                    supportFragmentManager.beginTransaction().remove(dialogDeniedExternalStorage),
                    null
                )
            }
        }

    /**
     * registration of permission request to media video
     * if the permission is granted, isGrantVideo is set to true
     * if the permission is denied, the dialogDeniedMediaVideo to grant permission
     * @author AnhTTH
     */

    private var requestPermissionMediaVideo =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
            if (isGranted) {
                isGrantVideo = true
            } else {
                dialogDeniedMediaVideo.show(
                    supportFragmentManager.beginTransaction().remove(dialogDeniedMediaVideo), null
                )
            }
        }

    /**
     * registration of permission request to media audio
     * if the permission is granted, isGrantAudio is set to true
     * if the permission is denied, the dialogDeniedMediaAudio to grant permission
     * @author AnhTTH
     */

    private var requestPermissionMediaAudio =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
            if (isGranted) {
                isGrantAudio = true
            } else {
                dialogDeniedMediaAudio.show(
                    supportFragmentManager.beginTransaction().remove(dialogDeniedMediaAudio), null
                )
            }
        }

    /**
     * Provides the layout resource ID for the activity.
     * @return The layout resource ID.
     * @author AnhTTH
     */
    override val layoutId: Int
        get() = R.layout.activity_permission

    /**
     * Returns the ViewModel class for the activity.
     * @return The [Class] object representing the ViewModel class.
     * @author AnhTTH
     */
    override fun getViewModel(): Class<PermissionVM> = PermissionVM::class.java

    /**
     * display view intro on screen
     * @author AnhTTH
     */
    override fun setupView(savedInstanceState: Bundle?) {
        setFullScreen()
        setMarginStatusBar(binding.tvPermission, 8)
        checkBuildVersion()
        checkPermission()
        initAction()
    }

    /**
     * Set data for app
     * @author AnhTTH
     */
    override fun setupData() {
    }

    override fun onResume() {
        super.onResume()
        checkPermission()
    }

    /**
     * Check permission version code for app
     * @author AnhTTH
     */
    private fun checkPermission() {
        if (isAtLeastSdkVersion(33)) {
            isGrantWriteSetting = checkSystemWritePermission()
            isGrantVideo = isGrantMediaVideoPermission()
            isGrantAudio = isGrantMediaAudioPermission()
        } else {
            isGrantWriteSetting = checkSystemWritePermission()
            isGrantStorage = isGrantReadExternalStoragePermission()
        }
    }

    /**
     * Check build version for app
     * @author AnhTTH
     */
    private fun checkBuildVersion() {
        if (isAtLeastSdkVersion(Build.VERSION_CODES.TIRAMISU)) {
            binding.tvWriteStorage.gone()
            binding.tvMediaAudio.visible()
            binding.tvMediaVideo.visible()
            if (isGrantWriteSetting && isGrantVideo && isGrantAudio) {
                checkClickGo()
            }
        } else {
            binding.tvWriteStorage.visible()
            binding.tvMediaAudio.gone()
            binding.tvMediaVideo.gone()
            if (isGrantWriteSetting && isGrantStorage) {
                checkClickGo()
            }
        }
    }

    /**
     * set click action for button
     * @author AnhTTH
     */
    private fun initAction() {
        binding.tvGo.setOnSafeClick {
            /** Save state tvGo to True ( store: lưu trạng thái)
             * @author AnhTTH
             */

            SharedPreferenceHelper.storeBoolean(Constant.KEY_CLICK_GO, true)
            startMainAct()
        }
        binding.tvSkip.setOnSafeClick {
            /** Save state button skip to True
             * @author AnhTTH
             */

            SharedPreferenceHelper.storeBoolean(Constant.KEY_CLICK_SKIP, true)
            startMainAct()
        }
        /** check permission WriteSetting
         * if permission is denied, the dialogDeniedWriteSetting is displayed requestPermissionWriteSetting
         * @author AnhTTH
         */

        binding.tvWriteSetting.setOnSafeClick {
            if (!isGrantWriteSetting) {
                requestPermissionWriteSetting.launch(Manifest.permission.WRITE_SETTINGS)
            }
        }
        /** check permission WriteStorage
         * if permission is denied, the dialogDeniedExternalStorage is displayed requestPermissionExternalStorage
         * @author AnhTTH
         */

        binding.tvWriteStorage.setOnSafeClick {
            if (!isGrantStorage) {
                requestPermissionExternalStorage.launch(Manifest.permission.WRITE_EXTERNAL_STORAGE)

            }
        }
        /** check permission MediaVideo
         * if permission is denied, the dialogDeniedMediaVideo is displayed requestPermissionMediaVideo
         * @author AnhTTH
         */

        binding.tvMediaVideo.setOnSafeClick {
            if (!isGrantVideo) {
                if (isAtLeastSdkVersion(Build.VERSION_CODES.TIRAMISU)) {
                    requestPermissionMediaVideo.launch(Manifest.permission.READ_MEDIA_VIDEO)
                }
            }
        }
        /**
         *  check permission MediaAudio
         *  if permission is denied, the dialogDeniedMediaAudio is displayed requestPermissionMediaVideo
         *  @author AnhTTH
         */

        binding.tvMediaAudio.setOnSafeClick {
            if (!isGrantAudio) {
                if (isAtLeastSdkVersion(Build.VERSION_CODES.TIRAMISU)) {
                    requestPermissionMediaAudio.launch(Manifest.permission.READ_MEDIA_AUDIO)
                }
            }
        }
    }

    /**
     * check the state of specific action from SharePreference
     * @author AnhTTH
     */
    private fun checkClickGo() {
        SharedPreferenceHelper.getBoolean(Constant.KEY_CLICK_GO, false).let { isClickGo ->
            if (isClickGo) {
                startMainAct()
            }
        }
    }

    /**
     * Start to Main Screen
     * @author AnhTTH
     */
    private fun startMainAct() {
        Intent(this@PermissionAct, MainActivity::class.java).apply {
            startActivity(this)
            finish()
        }
    }


    /**
     * Set state enabled for Switch
     * @author AnhTTH
     */
    private fun TextView.setOnOff(isOn: Boolean) {
        setIconDrawableEnd(
            if (isOn) {
                R.drawable.ic_switch
            } else {
                R.drawable.ic_switch_off
            }
        )
    }

    /**
     * control the display between 2 interface component
     * base on condition of permission
     * @author AnhTTH
     */
    private fun showButtonGo() {
        if (isAtLeastSdkVersion(33)) {
            if (isGrantWriteSetting && isGrantVideo && isGrantAudio) {
                binding.tvGo.visible()
                binding.tvSkip.gone()
            } else {
                binding.tvGo.gone()
                binding.tvSkip.visible()
            }
        } else {
            if (isGrantWriteSetting && isGrantStorage) {
                binding.tvGo.visible()
                binding.tvSkip.gone()
            } else {
                binding.tvGo.gone()
                binding.tvSkip.visible()
            }
        }
    }
}