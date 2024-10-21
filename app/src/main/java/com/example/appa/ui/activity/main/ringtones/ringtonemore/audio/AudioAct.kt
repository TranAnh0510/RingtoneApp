package com.example.appa.ui.activity.main.ringtones.ringtonemore.audio

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import androidx.paging.CombinedLoadStates
import androidx.paging.LoadState
import com.example.appa.R
import com.example.appa.common.Constant
import com.example.appa.databinding.ActivityAudioBinding
import com.example.appa.ui.activity.main.mysound.edit.EditMySoundAct
import com.example.appa.ui.adapter.recyclerview.AudioAdapter
import com.example.appa.ui.adapter.recyclerview.AudioGridAdapter
import com.example.appa.ui.base.BaseBindingActivity
import com.example.appa.ui.base.observeWithCatch
import com.example.appa.ui.dialog.DialogAscending
import com.example.appa.ui.dialog.DialogSort
import com.example.appa.ui.dialog.TYPE_AZ
import com.example.appa.ui.dialog.TYPE_DATE
import com.example.appa.ui.dialog.TYPE_SIZE
import com.example.appa.util.extension.gone
import com.example.appa.util.extension.invisible
import com.example.appa.util.extension.isGrantMediaAudioPermission
import com.example.appa.util.extension.setFullScreen
import com.example.appa.util.extension.setOnSafeClick
import com.example.appa.util.extension.startSetting
import com.example.appa.util.extension.visible
import kotlinx.coroutines.launch

/**
 * Activity for managing audio files.
 * Handles the display of audio files and related actions.
 * @author AnhTTH
 */
class AudioAct : BaseBindingActivity<ActivityAudioBinding, AudioVM>() {
    // Array to hold the location of views
    private val location = IntArray(2)

    // Flag indicating whether the app has permission to access media audio
    private var isGrantMediaAudio = false

    // Flag indicating whether the user clicked on the setting button
    private var isClickSetting = false

    // Path of the audio file
    private var pathAudio = ""

    // Name of the audio file
    private var nameAudio = ""

    // Duration of the audio file
    private var durationAudio = 0L

    // Listener to handle the load state of audio files
    private val loadState: (CombinedLoadStates) -> Unit = { loadState ->
        when (loadState.refresh) {
            // Handling when not loading
            is LoadState.NotLoading -> {
                runCatching {
                    // Scroll to top if sorting
                    if (isSort) {
                        binding.rcAudio.post {
                            binding.rcAudio.scrollToPosition(0)
                            isSort = false
                        }
                        binding.rcAudioGrid.post {
                            binding.rcAudioGrid.scrollToPosition(0)
                            isSort = false
                        }
                    }
                }.onFailure {
                    it.printStackTrace()
                }

                // Handling when there are no audio files
                if (isGrantMediaAudio) {
                    binding.tvGoToSetting.gone()
                    if (audioLinearAdapter.itemCount == 0) {
                        setUpViewNoData()
                        binding.tvNoData.text = getString(R.string.no_my_sound)
                    } else {
                        setUpViewYesData()
                    }
                } else {
                    setUpViewNoData()
                    binding.tvGoToSetting.visible()
                }
            }
            // Handling when loading
            is LoadState.Loading -> {
                if (isGrantMediaAudio) {
                    binding.tvGoToSetting.gone()
                    if (audioLinearAdapter.itemCount == 0) {
                        setUpViewNoData()
                        binding.tvNoData.text = getString(R.string.no_my_sound)
                    } else {
                        setUpViewYesData()
                    }
                } else {
                    setUpViewNoData()
                    binding.tvGoToSetting.visible()
                }
            }
            // Handling when error occurs during loading
            is LoadState.Error -> {
                if (isGrantMediaAudio) {
                    binding.tvGoToSetting.gone()
                    if (audioLinearAdapter.itemCount == 0) {
                        setUpViewNoData()
                        binding.tvNoData.text = getString(R.string.no_my_sound)
                    } else {
                        setUpViewYesData()
                    }
                } else {
                    setUpViewNoData()
                    binding.tvGoToSetting.visible()
                }
            }
        }
    }

    /**
     * Adapter for displaying audio files in a linear layout.
     * Manages click events and load state.
     * @author AnhTTH
     */
    private val audioLinearAdapter: AudioAdapter by lazy {
        AudioAdapter().apply {
            // Listener for item click events
            onclickItem = { _, item ->
                pathAudio = item.path
                audioGridAdapter.newPath = item.path
                nameAudio = item.nameFile
                durationAudio = item.durationLong
            }
            // Add load state listener
            addLoadStateListener(loadState)
            binding.rcAudio.adapter = this
        }
    }

    /**
     * Adapter for displaying audio files in a grid layout.
     * Manages click events and load state.
     * @author AnhTTH
     */
    private val audioGridAdapter: AudioGridAdapter by lazy {
        AudioGridAdapter().apply {
            // Listener for item click events
            onclickItem = { _, item ->
                pathAudio = item.path
                audioLinearAdapter.newPath = item.path
                nameAudio = item.nameFile
                durationAudio = item.durationLong
            }
            // Add load state listener
            addLoadStateListener(loadState)
            binding.rcAudioGrid.adapter = this
        }
    }

    /**
     * Flag indicating whether the audio files are sorted.
     * @author AnhTTH
     */
    private var isSort = false

    /**
     * Dialog for sorting audio files.
     * @author AnhTTH
     */
    private val sortDialog: DialogSort by lazy {
        DialogSort().apply {
            // Set type of sorting
            typeSort = viewModel.typeSort
            // Listener for type of sorting selection
            onClickTypeSort = { type ->
                viewModel.typeSort = type
                isSort = true
                viewModel.getAllAudio()
                binding.tvSortAZ.text = getString(
                    when (type) {
                        TYPE_AZ -> R.string.a_z
                        TYPE_DATE -> R.string.date
                        TYPE_SIZE -> R.string.size
                        else -> R.string.a_z
                    }
                )
            }
        }
    }

    /**
     * Dialog for selecting ascending or descending order.
     * @author AnhTTH
     */
    private val dialogAscending: DialogAscending by lazy {
        DialogAscending().apply {
            // Set ascending flag
            isAscending = viewModel.isAscending
            // Listener for ascending selection
            onClickAscending = { isAscending ->
                viewModel.isAscending = isAscending
                isSort = true
                viewModel.getAllAudio()
                if (isAscending) {
                    binding.tvAscending.text = getString(R.string.ascending)
                } else {
                    binding.tvAscending.text = getString(R.string.decending)
                }
            }
        }
    }

    /**
     * Returns the layout resource ID for the activity.
     * @return The layout resource ID.
     * @author AnhTTH
     */
    override val layoutId: Int
        get() = R.layout.activity_audio

    /**
     * Retrieves the ViewModel class associated with this activity.
     * @return The ViewModel class.
     * @author AnhTTH
     */
    override fun getViewModel(): Class<AudioVM> = AudioVM::class.java

    /**
     * Sets up the view components of the activity.
     * Checks and requests audio permissions, sets up full screen mode, and initializes actions.
     * @param savedInstanceState The saved instance state of the activity.
     * @author AnhTTH
     */
    override fun setupView(savedInstanceState: Bundle?) {
        isGrantMediaAudio = isGrantMediaAudioPermission() == true
        setFullScreen()
        setMarginStatusBar(binding.tvTitle, 20)
        initAction()

    }

    /**
     * Resumes the activity.
     * Checks and requests audio permissions if necessary.
     * Initializes observers if audio permissions are granted.
     * @author AnhTTH
     */
    override fun onResume() {
        super.onResume()
        isGrantMediaAudio = isGrantMediaAudioPermission() == true
        if (isGrantMediaAudio) {
            initObserve()
        }
    }

    /**
     * Sets up the data for the activity.
     * Initializes observers to fetch and update audio data.
     * @author AnhTTH
     */
    override fun setupData() {
        initObserve()
    }

    /**
     * Initializes actions for UI components.
     * Sets up click listeners for buttons such as sorting, changing layout, going back, and selecting audio.
     * Observes changes in audio data and updates the UI accordingly.
     * @author AnhTTH
     */
    private fun initAction() {
        // Click listener for changing layout between linear and grid
        binding.imGridLayout.setOnSafeClick {
            // Toggles between linear and grid layout
            kotlin.runCatching {
                if (binding.rcAudio.isVisible) {
                    // Switch to grid layout
                    binding.rcAudioGrid.visible()
                    binding.rcAudio.invisible()
                    binding.imGridLayout.setImageResource(R.drawable.ic_linear)
                } else {
                    // Switch to linear layout
                    binding.rcAudioGrid.invisible()
                    binding.rcAudio.visible()
                    binding.imGridLayout.setImageResource(R.drawable.ic_grid)
                }
            }.onFailure { it.printStackTrace() }
        }
        // Click listener for going back
        binding.imBack.setOnSafeClick {
            finish()
        }
        // Click listener for sorting audio
        binding.tvSortAZ.setOnSafeClick(1200) {
            kotlin.runCatching {
                // Displays the sorting dialog
                isDispatchTouchEvent(1000)
                binding.locationToShow.getLocationInWindow(location)
                sortDialog.typeSort = viewModel.typeSort
                if (location.size > 1) {
                    sortDialog.showDialogSort(
                        location[0].toFloat(), location[1].toFloat()
                    )
                }
                sortDialog.show(supportFragmentManager.beginTransaction().remove(sortDialog), null)
            }.onFailure { it.printStackTrace() }
        }
        // Click listener for toggling ascending/descending order
        binding.tvAscending.setOnSafeClick(1200) {
            kotlin.runCatching {
                binding.locationToShowAscending.getLocationInWindow(location)
                dialogAscending.isAscending = viewModel.isAscending == true
                if (location.size > 1) {
                    dialogAscending.showDialog(
                        location[0].toFloat(), location[1].toFloat()
                    )
                }
                dialogAscending.show(
                    supportFragmentManager.beginTransaction().remove(dialogAscending), null
                )
            }.onFailure { it.printStackTrace() }
        }
        // Click listener for selecting audio
        binding.imChooseAudio.setOnClickListener {
            // Opens the EditMySoundAct activity with selected audio details
            Intent(this, EditMySoundAct::class.java).apply {
                runCatching {
                    // Retrieves audio details from the adapter
                    if (pathAudio.isEmpty()) {
                        audioLinearAdapter.snapshot().items.let {

                            if (it.isNotEmpty()) {
                                pathAudio = it[0].path
                            }
                        }
                    }
                }.onFailure { it.printStackTrace() }
                putExtra(Constant.KEY_PATH_AUDIO, pathAudio)

                runCatching {
                    if (nameAudio.isEmpty()) {
                        audioLinearAdapter.snapshot().items.let {
                            if (it.isNotEmpty()) {
                                nameAudio = it[0].nameFile
                            }
                        }
                    }
                }.onFailure { it.printStackTrace() }
                putExtra(Constant.KEY_NAME_AUDIO, nameAudio)

                runCatching {
                    if (durationAudio == 0L) {
                        audioLinearAdapter.snapshot().items.let {
                            if (it.isNotEmpty()) {
                                durationAudio = it[0].durationLong
                            }
                        }
                    }
                }.onFailure { it.printStackTrace() }
                putExtra(Constant.KEY_DURATION_AUDIO, durationAudio)
                startActivity(this)
            }
        }
        // Click listener for going to app settings
        binding.tvGoToSetting.setOnSafeClick {
            startSetting()
        }

    }

    /**
     * Observes changes in the audio data LiveData from the ViewModel.
     * When new data is received, it submits the updated data to both the audioLinearAdapter
     * and audioGridAdapter using the submitData method.
     * This ensures that the UI is updated with the latest audio data.
     * @author AnhTTh
     */
    private fun initObserve() {
        viewModel.getAllAudio()
        viewModel.allAudioLiveData.observeWithCatch(this) { dataAudio ->
            lifecycleScope.launch {
                audioLinearAdapter.submitData(lifecycle, dataAudio)
                audioGridAdapter.submitData(lifecycle, dataAudio)
            }
        }
    }

    /**
     * Configures the UI based on whether there is data available to display.
     * When there is data (setUpViewYesData), it makes the necessary UI elements visible and hides others.
     * Conversely, when there is no data (setUpViewNoData),
     * it hides the elements displaying audio data and shows elements indicating the absence of data.
     * @author AnhTTH
     */
    private fun setUpViewYesData() {
        binding.imChooseAudio.visible()

        binding.tvAscending.visible()
        binding.tvSortAZ.visible()
        binding.imGridLayout.visible()
        binding.tvAllAudio.visible()
        if (binding.rcAudioGrid.visibility == View.VISIBLE) {
            binding.rcAudioGrid.visible()
            binding.rcAudio.gone()
        } else {
            binding.rcAudio.visible()
            binding.rcAudioGrid.gone()
        }
        binding.tvNoData.gone()
        binding.imNoData.gone()
        binding.tvTitleNoData.gone()
    }

    /**
     * Configures the UI when there is no audio data available.
     * @author AnhTTH
     */
    private fun setUpViewNoData() {
        binding.imChooseAudio.invisible()
        binding.tvAscending.gone()
        binding.tvSortAZ.gone()
        binding.rcAudio.gone()
        binding.imGridLayout.gone()
        binding.tvAllAudio.gone()
        binding.tvNoData.visible()
        binding.imNoData.visible()
        binding.tvTitleNoData.visible()
    }
}