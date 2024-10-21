package com.example.appa.ui.activity.main.mysound.edit

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.appa.R
import com.example.appa.common.Constant
import com.example.appa.common.MessageEvent
import com.example.appa.data.model.ItemMySoundUI
import com.example.appa.databinding.ActivityEditMySoundBinding
import com.example.appa.ui.activity.main.MainActivity
import com.example.appa.ui.base.BaseBindingActivity
import com.example.appa.ui.base.observeWithCatch
import com.example.appa.util.AudioPlayer
import com.example.appa.util.containsNonAllowedCharacters
import com.example.appa.util.extension.gone
import com.example.appa.util.extension.hideKeyboard
import com.example.appa.util.extension.setFullScreen
import com.example.appa.util.extension.setOnSafeClick
import com.example.appa.util.extension.visible
import com.example.appa.util.extractAudioFromVideo
import com.example.appa.util.getDuration
import com.example.appa.util.trimAudio
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import trim.OnTrimVideoListener

/**
 * EditMySoundAct is the activity for editing a custom sound.
 * It extends BaseBindingActivity to provide data binding support.
 * This activity manages audio playback and editing functionalities.
 * @author AnhTTH
 */
class EditMySoundAct : BaseBindingActivity<ActivityEditMySoundBinding, EditMySoundVM>() {
    // Default total time for audio playback
    private val TIME_TOTAL_DEFAULT: Long = 3000

    // AudioPlayer instance for managing audio playback
    private var audioPlayer: AudioPlayer? = null

    // URI of the audio file
    private var uri: Uri? = null

    // File path of the audio file
    private var path: String? = null

    // Start time of audio playback
    private var timeStartAudio: Long = 0

    // Current running time of audio playback
    private var timeRunAudio: Long = 0

    // End time of audio playback
    private var timeEndAudio: Long = TIME_TOTAL_DEFAULT

    // Flag indicating whether the user is moving the audio playback time
    private var isMoveTimeAudio = false

    /**
     * Specifies the layout resource ID for the activity.
     * @author AnhTTH
     */
    override val layoutId: Int
        get() = R.layout.activity_edit_my_sound

    /**
     * Retrieves the ViewModel class for the activity.
     * @return The ViewModel class for EditMySoundAct.
     * @author AnhTTH
     */
    override fun getViewModel(): Class<EditMySoundVM> = EditMySoundVM::class.java

    /**
     * Sets up the user interface for the activity.
     * Registers EventBus if not already registered, sets full-screen mode,
     * adjusts margin for the title TextView, and initializes actions.
     * @param savedInstanceState An instance of Bundle containing data
     * to restore the activity's state after being destroyed.
     * @author AnhTTH
     */
    override fun setupView(savedInstanceState: Bundle?) {
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this)
        }
        setFullScreen()
        setMarginStatusBar(binding.tvTitle, 20)
        initAction()
    }

    /**
     * Sets up data for the EditMySoundAct activity.
     * Retrieves data from the intent, initializes observers, and handles updates to the edited sound item.
     * If the editing operation is successful, it posts an EventBus message to update the "My Sound" fragment and navigates back to the MainActivity.
     * If an error occurs during editing, it displays a toast with an error message.
     * Hides the loading view after data processing.
     * @author AnhTTH
     */
    override fun setupData() {
        getDataFromIntent()
        initObserve()
        viewModel.idItemMySoundLiveData.observeWithCatch(this) {
            if (it >= 0) {
                EventBus.getDefault().post(MessageEvent(Constant.EVENT_UPDATE_MY_SOUND))
                Intent(this@EditMySoundAct, MainActivity::class.java).apply {
                    putExtra(Constant.KEY_SHOW_MY_SOUND, true)
                    addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
                    startActivity(this)
                    finish()
                }
            } else {
                toast(getString(R.string.error_edit))
            }
            binding.viewLoading.gone()
        }
    }

    /**
     * Retrieves data from the intent and initializes UI elements based on the received data.
     * If the intent contains audio data from recording or selecting a file,
     * it sets up audio playback controls and initializes the trim view.
     * If the intent contains video data, it extracts audio from the video,
     * sets up UI elements with video information, and initializes the trim view.
     * If the intent contains audio data from selecting a file, it sets up UI
     * elements with audio information and initializes the trim view.
     * Hides the loading view after data processing.
     * @author AnhTTH
     */
    @SuppressLint("SetTextI18n")
    private fun getDataFromIntent() {
        intent?.let {
            it.getStringExtra(Constant.KEY_URI_FROM_RECORD_AUDIO)?.let { path ->
                this.path = path
                if (path.isNotEmpty()) {
                    audioPlayer = AudioPlayer()
                    val duration =
                        audioPlayer?.getDuration(this@EditMySoundAct, Uri.parse(path)) ?: 0
                    var timeTotal: Int = TIME_TOTAL_DEFAULT.toInt()
                    if (TIME_TOTAL_DEFAULT > duration) timeTotal = duration
                    binding.tvTotalTime.text =
                        getString(R.string.total) + " " + getDuration(timeTotal.toLong())
                    timeEndAudio = timeTotal.toLong()
                    binding.trimView.setDuration(timeTotal, 1, duration)
                }
                binding.viewLoading.gone()
            }

            it.getStringExtra(Constant.KEY_PATH_VIDEO)?.let { path ->
                it.getStringExtra(Constant.KEY_NAME_VIDEO)?.let { name ->
                    binding.etName.setText(name)
                    lifecycleScope.launch(Dispatchers.IO) {
                        extractAudioFromVideo(name, path)
                    }
                }
                it.getLongExtra(Constant.KEY_DURATION_VIDEO, 0L).let { duration ->
                    var timeTotal: Int = TIME_TOTAL_DEFAULT.toInt()
                    if (TIME_TOTAL_DEFAULT > duration) timeTotal = duration.toInt()
                    binding.tvTotalTime.text =
                        getString(R.string.total) + " " + getDuration(timeTotal.toLong())
                    timeEndAudio = timeTotal.toLong()
                    binding.trimView.setDuration(timeTotal, 1, duration.toInt())
                }

            }


            it.getStringExtra(Constant.KEY_PATH_AUDIO)?.let { path ->
                it.getStringExtra(Constant.KEY_NAME_AUDIO)?.let { name ->
                    binding.etName.setText(name)
                    this.path = path
                    if (path.isNotEmpty()) {
                        audioPlayer = AudioPlayer()
                    }
                    binding.viewLoading.gone()

                }
                it.getLongExtra(Constant.KEY_DURATION_AUDIO, 0L).let { duration ->
                    var timeTotal: Int = TIME_TOTAL_DEFAULT.toInt()
                    if (TIME_TOTAL_DEFAULT > duration) timeTotal = duration.toInt()
                    binding.tvTotalTime.text =
                        getString(R.string.total) + " " + getDuration(timeTotal.toLong())
                    timeEndAudio = timeTotal.toLong()
                    binding.trimView.setDuration(timeTotal, 1, duration.toInt())
                }

            }
        }
    }

    /**
     * Initializes observers for LiveData objects in the ViewModel.
     * Observes changes in durationLiveData to update the total time displayed and the trim view's duration.
     * Observes changes in pathLiveData to update the audio file path and initialize
     * the AudioPlayer if a path is available.
     * Hides the loading view after data processing.
     * @author AnhTTH
     */
    @SuppressLint("SetTextI18n")
    private fun initObserve() {
        viewModel.durationLiveData.observeWithCatch(this) { duration ->
            var timeTotal: Int = TIME_TOTAL_DEFAULT.toInt()
            if (TIME_TOTAL_DEFAULT > duration) timeTotal = duration.toInt()
            binding.tvTotalTime.text =
                getString(R.string.total) + " " + getDuration(timeTotal.toLong())
            timeEndAudio = timeTotal.toLong()
            binding.trimView.setDuration(timeTotal, 1, duration.toInt())
        }


        viewModel.pathLiveData.observeWithCatch(this) { path ->
            this.path = path
            if (path.isNotEmpty()) {
                audioPlayer = AudioPlayer()
            }
            binding.viewLoading.gone()
        }
    }

    /**
     * Receives EventBus events and performs actions based on the event type.
     * Handles events related to successful and failed audio trimming and audio extraction from video.
     * If audio trimming is successful, it creates a new ItemMySoundUI object and inserts it into the ViewModel.
     * If audio trimming or audio extraction fails, it displays an error message and hides the loading view.
     * @param messageEvent The EventBus message event containing information about the event type and data.
     * @author AnhTTH
     */
    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onEvent(messageEvent: MessageEvent) {
        when (messageEvent.typeEvent) {
            Constant.EVENT_TRIM_AUDIO_SUCCESS -> {
                lifecycleScope.launch(Dispatchers.Main) {
                    val newPath = messageEvent.stringValue1
                    if (newPath.isNullOrEmpty()) {
                        toast(getString(R.string.error_edit))
                    } else {
                        ItemMySoundUI(
                            nameRingtone = binding.etName.text.toString(),
                            durationLong = timeEndAudio - timeStartAudio,
                            path = newPath
                        ).apply {
                            viewModel.insertMySound(this)
                        }
                    }
                }
            }

            Constant.EVENT_TRIM_AUDIO_FAILED -> {
                lifecycleScope.launch(Dispatchers.Main) {
                    toast(getString(R.string.error_edit))
                    binding.viewLoading.gone()
                }
            }

            Constant.EVENT_EXTRACT_AUDIO_FROM_VIDEO_SUCCESS -> {
                path = messageEvent.stringValue1 ?: ""
                if (path?.isNotEmpty() == true) {
                    audioPlayer = AudioPlayer()
                }
                binding.viewLoading.gone()
            }

            Constant.EVENT_EXTRACT_AUDIO_FROM_VIDEO_FAILED -> {
                binding.viewLoading.gone()
            }
        }
    }

    /**
     * Pauses audio playback and performs cleanup operations when the activity is paused.
     * Stops the audio playback, pauses the drawing process in the trim view,
     * and updates the play/pause button icon.
     * @author AnhTTH
     */
    override fun onPause() {
        super.onPause()
        pauseAudio()
    }

    /**
     * Performs cleanup operations when the activity is destroyed.
     * Stops the audio playback, unregisters from EventBus if registered,
     * and handles potential exceptions.
     * @author AnhTTH
     */
    override fun onDestroy() {
        super.onDestroy()
        kotlin.runCatching {
            audioPlayer?.stop()
            if (EventBus.getDefault().isRegistered(this)) {
                EventBus.getDefault().unregister(this)
            }
        }.onFailure { it.printStackTrace() }
    }

    /**
     * Pauses audio playback and drawing process in the trim view.
     * Stops the audio playback, pauses the drawing process in the trim view,
     * and updates the play/pause button icon.
     * @author AnhTTH
     */
    private fun pauseAudio() {
        kotlin.runCatching {
            audioPlayer?.stop()
            binding.trimView.pauseDrawProcess()
            binding.imPlayPause.setImageResource(R.drawable.icon_next_edit)
        }.onFailure { it.printStackTrace() }
    }

    /**
     * Initializes the listener for the trim view to handle trimming events.
     * Implements the OnTrimVideoListener interface to handle events such as time changes,
     * time selections, and time runs.
     * @author AnhTTH
     */
    private fun initTrimViewListener() {
        binding.trimView.setOnTrimVideoListener(object : OnTrimVideoListener {
            override fun onReady() {}
            @SuppressLint("SetTextI18n")
            override fun onTimeStartChanged(timeStart: Int) {
                kotlin.runCatching {
                    timeStartAudio = timeStart.toLong()
                    timeRunAudio = timeStartAudio
                    binding.tvTimeStart.text = getDuration(timeStart.toLong())
                    binding.tvTotalTime.text =
                        getString(R.string.total) + " " + getDuration(timeEndAudio - timeStartAudio)
                    binding.imPlayPause.setImageResource(R.drawable.icon_next_edit)
                    audioPlayer?.stop()
                }.onFailure { it.printStackTrace() }

            }

            @SuppressLint("SetTextI18n")
            override fun onTimeEndChanged(timeEnd: Int) {
                kotlin.runCatching {
                    timeEndAudio = timeEnd.toLong()
                    binding.tvTimeStart.text = getDuration(timeEndAudio)
                    binding.tvTotalTime.text = getString(R.string.total) + " " + getDuration(
                        timeEndAudio - timeStartAudio
                    )
                    binding.imPlayPause.setImageResource(R.drawable.icon_next_edit)
                    audioPlayer?.stop()
                    timeRunAudio = timeStartAudio
                }.onFailure { it.printStackTrace() }

            }

            override fun onTimeSelected(timeStart: Int, timeEnd: Int) {
                kotlin.runCatching {
                    timeStartAudio = timeStart.toLong()
                    timeEndAudio = timeEnd.toLong()
                    isMoveTimeAudio = false
                }.onFailure { it.printStackTrace() }

            }

            override fun onTimeRun(time: Int) {
                kotlin.runCatching {
                    timeRunAudio = time.toLong()
                    binding.tvTimeStart.text = getDuration(timeRunAudio)
                    if (timeRunAudio >= timeEndAudio) {
                        timeRunAudio = timeStartAudio
                        binding.imPlayPause.setImageResource(R.drawable.icon_next_edit)
                        audioPlayer?.stop()
                        binding.trimView.disableDrawProcess()
                    }
                }.onFailure { it.printStackTrace() }

            }

            override fun onMoveTime(time: Int) {
                kotlin.runCatching {
                    isMoveTimeAudio = true
                    timeRunAudio = time.toLong()
                    pauseAudio()
                    binding.tvTimeStart.text = getDuration(timeRunAudio)
                }.onFailure { it.printStackTrace() }
            }
        })
    }

    /**
     * Initializes actions for various views in the activity.
     * Sets up a listener for the trim view to handle trimming events.
     * Sets click listeners for buttons to handle audio playback, pause, trimming, and navigation.
     * Handles playback controls for audio files, including play, pause, stop, and resume.
     * Handles trimming of audio files based on user-defined start and end times.
     * @author AnhTTH
     */
    private fun initAction() {
        initTrimViewListener()
        binding.imPrevious.setOnSafeClick {
            timeRunAudio = timeStartAudio
            binding.trimView.startDrawProcess()
            binding.imPlayPause.setImageResource(R.drawable.icon_next_edit)
            audioPlayer?.stop()
            if (uri == null) {
                path?.let { it1 ->
                    audioPlayer?.play(
                        this, uri, it1, timeStartAudio.toInt(), timeEndAudio.toInt()
                    )
                }

            } else {
                path?.let { it1 ->
                    audioPlayer?.play(
                        this, uri, it1, timeStartAudio.toInt(), timeEndAudio.toInt()
                    )
                }

            }
        }
        binding.imPlayPause.setOnSafeClick {
            val isPlaying: Boolean = audioPlayer?.isPlaying ?: false
            if (isPlaying) {
                isMoveTimeAudio = true
                pauseAudio()
            } else {
                binding.imPlayPause.setImageResource(R.drawable.icon_pause_edit)
                binding.tvTimeStart.text = getDuration(timeRunAudio)
                path?.let { it1 ->
                    audioPlayer?.play(
                        this, uri, it1, timeRunAudio.toInt(), timeEndAudio.toInt()
                    )
                }
                if (timeRunAudio == timeStartAudio) {
                    path?.let { it1 ->
                        audioPlayer?.play(
                            this, uri, it1, timeStartAudio.toInt(), timeEndAudio.toInt()
                        )
                    }
                    binding.trimView.startDrawProcess()
                } else {
                    if (isMoveTimeAudio) {
                        path?.let { it1 ->
                            audioPlayer?.play(
                                this, uri, it1, timeRunAudio.toInt(), timeEndAudio.toInt()
                            )
                        }
                        binding.trimView.resumeDrawProcess()
                    } else {
                        path?.let { it1 ->
                            audioPlayer?.play(
                                this, uri, it1, timeStartAudio.toInt(), timeEndAudio.toInt()
                            )
                        }
                        binding.trimView.startDrawProcessMove()
                    }
                }
                isMoveTimeAudio = false
            }
        }

        binding.tvDone.setOnSafeClick {
            hideKeyboard()
            pauseAudio()
            val nameFile = try {
                binding.etName.text.toString()
            } catch (e: Exception) {
                e.printStackTrace()
                ""
            }
            if (nameFile.isEmpty()) {
                toast(getString(R.string.name_empty))
            } else if (nameFile.containsNonAllowedCharacters()) {
                toast(getString(R.string.name_specific))
            } else {
                binding.viewLoading.visible()
                lifecycleScope.launch(Dispatchers.IO) {
                    path?.let { it1 ->
                        trimAudio(
                            timeStartAudio.toInt(), timeEndAudio.toInt(), nameFile, it1
                        )
                    }
                }

            }
        }

        binding.imBack.setOnSafeClick {
            finish()
        }


    }


}