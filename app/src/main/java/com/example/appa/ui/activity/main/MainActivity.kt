package com.example.appa.ui.activity.main

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.lifecycle.lifecycleScope
import com.example.appa.R
import com.example.appa.common.Constant
import com.example.appa.common.MessageEvent
import com.example.appa.databinding.ActivityMainBinding
import com.example.appa.ui.activity.main.mysound.edit.EditMySoundAct
import com.example.appa.ui.activity.main.ringtones.ringtonemore.audio.AudioAct
import com.example.appa.ui.activity.main.ringtones.ringtonemore.video.VideoAct
import com.example.appa.ui.adapter.viewpager.MainViewPager
import com.example.appa.ui.base.BaseBindingActivity
import com.example.appa.ui.dialog.DialogDeniedExternalStorage
import com.example.appa.ui.dialog.DialogDeniedMediaAudio
import com.example.appa.ui.dialog.DialogDeniedMediaVideo
import com.example.appa.util.FileUtils.saveAudioToInternalStorage
import com.example.appa.util.extension.gone
import com.example.appa.util.extension.setFullScreen
import com.example.appa.util.extension.setOnSafeClick
import com.example.appa.util.extension.startSetting
import com.example.appa.util.extension.visible
import com.example.appa.util.hideWithAnimation
import com.example.appa.util.showWithAnimation
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.greenrobot.eventbus.EventBus

/**
 * MainActivity is the main activity of the application.
 * It extends BaseBindingActivity to provide data binding support.
 * This activity manages permissions related to external storage and media access.
 * @author AnhTTH
 */
class MainActivity : BaseBindingActivity<ActivityMainBinding, MainVM>() {
    /**
     * Dialog shown when external storage access is denied.
     * Lazily initialized to improve performance.
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
     * Dialog shown when media access (video) is denied.
     * Lazily initialized to improve performance.
     * @author AnhTTH
     */
    private val dialogDeniedMediaVideo: DialogDeniedMediaVideo by lazy {
        DialogDeniedMediaVideo().apply {
            onClickGotoSetting = {
                startSetting()
            }
        }
    }

    private val dialogDeniedMediaAudio: DialogDeniedMediaAudio by lazy {
        DialogDeniedMediaAudio().apply {
            onClickGotoSetting = {
                startSetting()
            }
        }
    }

    private var isGrantStorage = false
        set(value) {
            field = value
            if (value && dialogDeniedExternalStorage.isAdded) {
                dialogDeniedExternalStorage.dismiss()
            }
        }

    private var isGrantVideo = false
        set(value) {
            field = value
            if (value && dialogDeniedMediaVideo.isAdded) {
                dialogDeniedMediaVideo.dismiss()
            }
        }

    private var isGrantAudio = false
        set(value) {
            field = value
            if (value && dialogDeniedMediaAudio.isAdded) {
                dialogDeniedMediaAudio.dismiss()
            }
        }

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
     * Flag indicating whether the "My Sound" feature should be displayed.
     * @author AnhTTH
     */
    private var isShowMySound = false

    /**
     * Launcher for the activity result when recording sound.
     * Registers an activity result listener to handle the result of the sound recording activity.
     * @see [ActivityResultContracts.StartActivityForResult]
     * @author AnhTTH
     */
    private var recordSoundLauncher: ActivityResultLauncher<Intent> = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == RESULT_OK) {
            result.data?.data?.let { uri ->
                val path = this@MainActivity.saveAudioToInternalStorage(
                    this@MainActivity, uri.toString(), uri.path.toString()
                )
                Intent(this, EditMySoundAct::class.java).apply {
                    putExtra(Constant.KEY_URI_FROM_RECORD_AUDIO, path)
                    startActivity(this)
                }
            }
        } else {
        }
    }

    /**
     * Specifies the layout resource ID for the main activity.
     * @author AnhTTH
     */
    override val layoutId: Int
        get() = R.layout.activity_main

    /**
     * Lazily initializes the pagerAdapter used to manage fragments in the ViewPager.
     * @author AnhTTH
     */
    private val pagerAdapter: MainViewPager by lazy {
        MainViewPager(
            supportFragmentManager, lifecycle
        )
    }

    override fun getViewModel() = MainVM::class.java

    override fun setupView(savedInstanceState: Bundle?) {
        setFullScreen()
        setUpViewPager()
        initAction()

    }

    override fun onStop() {
        super.onStop()
        EventBus.getDefault().post(MessageEvent(Constant.EVENT_STOP_MUSIC_RINGTONE_FRAGMENT))
        EventBus.getDefault().post(MessageEvent(Constant.EVENT_STOP_MUSIC_FAVORITE_FRAGMENT))
        EventBus.getDefault().post(MessageEvent(Constant.EVENT_STOP_MUSIC_MY_SOUND_FRAGMENT))
    }

    private fun initAction() {
        // Set click listener for recording sound
        binding.tvRecord.setOnSafeClick {
            runCatching {
                Intent(MediaStore.Audio.Media.RECORD_SOUND_ACTION).apply {
                    recordSoundLauncher.launch(this)
                    hideDialogOption()
                }
            }.onFailure {
                it.printStackTrace()
                toast(getString(R.string.can_not_found_record_audio_application))
            }

        }
        // Set click listener for selecting audio files
        binding.tvSelectAudioFile.setOnSafeClick {
            showOptionAct(AudioAct::class.java)
        }
        // Set click listener for splitting from video
        binding.tvSplitFromVideo.setOnSafeClick {
            showOptionAct(VideoAct::class.java)
        }
        // Set click listener for bottom navigation tabs
        binding.bottomNavigation.onClickTab = {
            if (binding.viewPager.currentItem != it) {
                EventBus.getDefault()
                    .post(MessageEvent(Constant.EVENT_STOP_MUSIC_RINGTONE_FRAGMENT))
                EventBus.getDefault()
                    .post(MessageEvent(Constant.EVENT_STOP_MUSIC_FAVORITE_FRAGMENT))
                EventBus.getDefault()
                    .post(MessageEvent(Constant.EVENT_STOP_MUSIC_MY_SOUND_FRAGMENT))
            }
            binding.viewPager.setCurrentItem(it, false)
            hideDialogOption()
        }
        // Set click listener for new sound action in bottom navigation
        binding.bottomNavigation.onClickNewSound = {
            checkShowDialogOption()
        }
        // Set click listener for root layout to show/hide option dialog
        binding.layoutRoot.setOnSafeClick {
            checkShowDialogOption()
        }
    }

    /**
     * Sets up data for the MainActivity.
     * This method can be used to initialize data or perform data-related operations.
     * @author AnhTTH
     */
    override fun setupData() {
    }

    /**
     * Called when a new intent is received.
     * Handles the intent to show the "My Sound" fragment if specified.
     * If the intent contains the flag KEY_SHOW_MY_SOUND set to true, it posts a delayed action to click on the "My Sound" tab in the bottom navigation.
     * @param intent The new intent that was started for the activity.
     * @author AnhTTH
     */
    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        kotlin.runCatching {
            isShowMySound = intent?.getBooleanExtra(Constant.KEY_SHOW_MY_SOUND, false) ?: false
            if (isShowMySound) binding.bottomNavigation.post {
                lifecycleScope.launch(Dispatchers.Main) {
                    delay(300)
                    binding.bottomNavigation.clickMySound()
                    isShowMySound = false
                }
            }
        }.onFailure { it.printStackTrace() }

    }

    /**
     * Sets up the ViewPager in the MainActivity.
     * Configures ViewPager with adapter, margin, offscreen page limit, and disables user input.
     * @author AnhTTH
     */
    private fun setUpViewPager() {
        kotlin.runCatching {
            binding.viewPager.apply {
                setMarginStatusBar(this, 8)
                adapter = pagerAdapter
                offscreenPageLimit = 4
                isUserInputEnabled = false
            }
        }.onFailure { it.printStackTrace() }
    }

    /**
     * Launches an activity based on the provided class.
     * @param cls The class of the activity to be launched.
     * @author AnhTTH
     */
    private fun showOptionAct(cls: Class<*>) {
        Intent(this, cls).apply {
            startActivity(this)
        }
        hideDialogOption()

    }

    /**
     * Checks and toggles visibility of the option dialog.
     * @author AnhTTH
     */
    private fun checkShowDialogOption() {
        if (binding.layoutRoot.visibility == View.GONE) {
            showDialogOption()
        } else {
            hideDialogOption()
        }
    }

    /**
     * Shows the option dialog with animation.
     * @author AnhTTH
     */
    private fun showDialogOption() {
        binding.layoutRoot.visible()
        binding.layoutDialogOption.showWithAnimation()
    }

    /**
     * Hides the option dialog with animation.
     * @author AnhTTH
     */
    private fun hideDialogOption() {
        binding.layoutRoot.gone()
        binding.layoutDialogOption.hideWithAnimation()
    }

}