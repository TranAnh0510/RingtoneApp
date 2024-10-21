package com.example.appa.ui.activity.main.ringtones.ringtonemore.video

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
import com.example.appa.databinding.ActivityVideoBinding
import com.example.appa.ui.activity.main.mysound.edit.EditMySoundAct
import com.example.appa.ui.adapter.recyclerview.VideoAdapter
import com.example.appa.ui.adapter.recyclerview.VideoLinearAdapter
import com.example.appa.ui.base.BaseBindingActivity
import com.example.appa.ui.base.observeWithCatch
import com.example.appa.ui.dialog.DialogAscending
import com.example.appa.ui.dialog.DialogSort
import com.example.appa.ui.dialog.TYPE_AZ
import com.example.appa.ui.dialog.TYPE_DATE
import com.example.appa.ui.dialog.TYPE_SIZE
import com.example.appa.util.extension.gone
import com.example.appa.util.extension.invisible
import com.example.appa.util.extension.isGrantMediaVideoPermission
import com.example.appa.util.extension.setFullScreen
import com.example.appa.util.extension.setOnSafeClick
import com.example.appa.util.extension.startSetting
import com.example.appa.util.extension.visible
import kotlinx.coroutines.launch

/**
 * Activity for managing videos.
 * This activity displays a list of videos in both grid and linear layouts.
 * It extends BaseBindingActivity for data binding capabilities and utilizes a custom ViewModel
 * for managing data and UI logic.
 * @author AnhTTH
 */
class VideoAct : BaseBindingActivity<ActivityVideoBinding, VideoVM>() {
    private val location = IntArray(2)
    private var isGrantVideo = false
    private var pathVideo = ""
    private var nameVideo = ""
    private var durationVideo = 0L

    /**
     * Listener for observing load states of video lists.
     * @author AnhTTH
     */
    private val loadStates: (CombinedLoadStates) -> Unit = { loadState ->
        when (loadState.refresh) {
            is LoadState.NotLoading -> {
                // Scroll to the top when sorting is applied
                if (isSort) {
                    binding.rcVideoGrid.post {
                        binding.rcVideoGrid.scrollToPosition(0)
                        isSort = false
                    }
                    binding.rcVideoLinear.post {
                        binding.rcVideoLinear.scrollToPosition(0)
                        isSort = false
                    }
                }
                // Update UI based on video data availability and permission status
                if (isGrantVideo) {
                    binding.tvGoToSetting.gone()
                    if (videoLinearAdapter.itemCount == 0) {
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

            is LoadState.Loading -> {
                // Show loading state
                if (isGrantVideo) {
                    binding.tvGoToSetting.gone()
                    if (videoLinearAdapter.itemCount == 0) {
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

            is LoadState.Error -> {
                // Show error state
                if (isGrantVideo) {
                    binding.tvGoToSetting.gone()
                    if (videoLinearAdapter.itemCount == 0) {
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
     * Adapter for displaying videos in a grid layout.
     *  @author AnhTTH
     */
    private val videoGridAdapter: VideoAdapter by lazy {
        VideoAdapter().apply {
            binding.rcVideoGrid.adapter = this
            // Handles item click events
            onclickItem = { pos, item ->
                pathVideo = item.path
                videoLinearAdapter.newPath
                nameVideo = item.nameFile
                durationVideo = item.durationLong
            }
            addLoadStateListener(loadStates)
        }
    }

    /**
     * Adapter for displaying videos in a linear layout.
     *  @author AnhTTH
     */
    private val videoLinearAdapter: VideoLinearAdapter by lazy {
        VideoLinearAdapter().apply {
            binding.rcVideoLinear.adapter = this
            // Handles item click events
            onclickItem = { pos, item ->
                pathVideo = item.path
                videoGridAdapter.newPath = item.path
                nameVideo = item.nameFile
                durationVideo = item.durationLong
            }
            addLoadStateListener(loadStates)
            binding.rcVideoLinear.adapter = this
        }
    }

    /**
     * Flag indicating whether sorting is applied.
     */
    private var isSort = false

    /**
     * Dialog for sorting videos.
     *  @author AnhTTH
     */
    private val sortDialog: DialogSort by lazy {
        DialogSort().apply {
            typeSort = viewModel.typeSort
            onClickTypeSort = { type ->
                viewModel.typeSort = type
                isSort = true
                viewModel.getAllVideo()
                when (type) {
                    // Update UI based on selected sort type
                    TYPE_AZ -> {
                        binding.tvSortAZ.text = getString(R.string.a_z)
                    }

                    TYPE_DATE -> {
                        binding.tvSortAZ.text = getString(R.string.date)
                    }

                    TYPE_SIZE -> {
                        binding.tvSortAZ.text = getString(R.string.size)
                    }
                }
            }
        }
    }

    /**
     * Dialog for selecting ascending or descending order.
     * @author AnhTTH
     */
    private val dialogAscending: DialogAscending by lazy {
        DialogAscending().apply {
            isAscending = viewModel.isAscending
            onClickAscending = { isAscending ->
                viewModel.isAscending = isAscending
                isSort = true
                viewModel.getAllVideo()
                // Update UI based on selected order
                if (isAscending) {
                    binding.tvAscending.text = getString(R.string.ascending)
                } else {
                    binding.tvAscending.text = getString(R.string.decending)
                }
            }
        }
    }

    /**
     * Retrieves the layout resource ID for the activity.
     * @return The layout resource ID.
     * @author AnhTTH
     */
    override val layoutId: Int
        get() = R.layout.activity_video

    /**
     * Retrieves the ViewModel class associated with this activity.
     * @return The ViewModel class.
     * @author AnhTTH
     */
    override fun getViewModel(): Class<VideoVM> = VideoVM::class.java

    /**
     * Performs additional setup for the activity's views.
     * @param savedInstanceState The saved instance state of the activity.
     * @author AnhTTH
     */
    override fun setupView(savedInstanceState: Bundle?) {
        isGrantVideo = isGrantMediaVideoPermission() == true

        setFullScreen()
        setMarginStatusBar(binding.tvTitle, 20)
        initAction()
    }

    /**
     * Sets up data for the activity.
     * @author AnhTTH
     */
    override fun setupData() {
        initObserve()
    }

    /**
     * Resumes the activity.
     * @author AnhTTH
     */
    override fun onResume() {
        super.onResume()
        isGrantVideo = isGrantMediaVideoPermission() == true
        if (isGrantVideo) {
            initObserve()
        }
    }

    /**
     * Initializes actions for UI elements.
     * @author AnhTTH
     */
    private fun initAction() {
        // Switches between grid and linear layouts
        binding.imGridLayout.setOnSafeClick {
                binding.rcVideoLinear.post {
                    if (binding.rcVideoLinear.visibility == View.VISIBLE) {
                        binding.rcVideoGrid.visible()
                        binding.rcVideoLinear.gone()
                        binding.imGridLayout.setImageResource(R.drawable.ic_linear)
                    } else {
                        binding.rcVideoGrid.gone()
                        binding.rcVideoLinear.visible()
                        binding.imGridLayout.setImageResource(R.drawable.ic_grid)
                    }
                }

        }
        // Navigates back
        binding.imBack.setOnSafeClick {
            finish()
        }
        // Shows sorting dialog
        binding.tvSortAZ.setOnSafeClick(1200) {
            kotlin.runCatching {
                isDispatchTouchEvent(1000)
                binding.locationToShow.getLocationInWindow(location)
                sortDialog.typeSort = viewModel.typeSort
                if (location.size > 1) {
                    sortDialog.showDialogSort(
                        location[0].toFloat(),
                        location[1].toFloat()
                    )
                }
                sortDialog.show(supportFragmentManager.beginTransaction().remove(sortDialog), null)

            }.onFailure { it.printStackTrace() }

        }
        // Shows ascending or descending order dialog
        binding.tvAscending.setOnSafeClick(1200) {
            isDispatchTouchEvent(1000)
            binding.locationToShowAscending.getLocationInWindow(location)
            dialogAscending.isAscending = viewModel.isAscending == true
            dialogAscending.showDialog(
                location[0].toFloat(), location[1].toFloat()
            )
            dialogAscending.show(
                supportFragmentManager.beginTransaction().remove(dialogAscending), null
            )
        }
        // Navigates to system settings
        binding.tvGoToSetting.setOnSafeClick {
            startSetting()
        }
        // Navigates to edit sound activity
        binding.imChooseVideo.setOnSafeClick {
            Intent(this, EditMySoundAct::class.java).apply {
                runCatching {
                    if (pathVideo.isEmpty()) {
                        videoLinearAdapter.snapshot().items.let {
                            if (it.isNotEmpty()) {
                                pathVideo = it[0].path
                            }
                        }
                    }
                }.onFailure { it.printStackTrace() }
                putExtra(Constant.KEY_PATH_VIDEO, pathVideo)

                runCatching {
                    if (nameVideo.isEmpty()) {
                        videoLinearAdapter.snapshot().items.let {
                            if (it.isNotEmpty()) {
                                nameVideo = it[0].nameFile
                            }
                        }
                    }
                }.onFailure { it.printStackTrace() }
                putExtra(Constant.KEY_NAME_VIDEO, nameVideo)

                runCatching {
                    if (durationVideo == 0L) {
                        videoLinearAdapter.snapshot().items.let {
                            if (it.isNotEmpty()) {
                                durationVideo = it[0].durationLong
                            }
                        }
                    }
                }.onFailure { it.printStackTrace() }
                putExtra(Constant.KEY_DURATION_VIDEO, durationVideo)

                startActivity(this)
            }
        }


    }

    /**
     * Observes changes in video data.
     * @author AnhTTH
     */
    private fun initObserve() {
        viewModel.getAllVideo()
        viewModel.allVideoLiveData.observeWithCatch(this) { dataVideo ->
            lifecycleScope.launch {
                videoGridAdapter.submitData(lifecycle, dataVideo)
                videoLinearAdapter.submitData(lifecycle, dataVideo)
            }
        }
    }

    /**
     * Sets up UI when there is data available.
     * @author AnhTTH
     */
    private fun setUpViewYesData() {
        binding.imChooseVideo.visible()
        binding.tvAscending.visible()
        binding.tvSortAZ.visible()
        if (binding.rcVideoGrid.visibility == View.VISIBLE) {
            binding.rcVideoGrid.visible()
            binding.rcVideoLinear.gone()
        } else {
            binding.rcVideoLinear.visible()
            binding.rcVideoGrid.gone()
        }
        binding.imGridLayout.visible()
        binding.tvAllVideo.visible()
        binding.tvNoData.gone()
        binding.imNoData.gone()
        binding.tvTitleNoData.gone()
    }

    /**
     * Sets up UI when there is no data available.
     * @author AnhTTH
     */
    private fun setUpViewNoData() {
        binding.imChooseVideo.invisible()
        binding.tvAscending.gone()
        binding.tvSortAZ.gone()
        binding.rcVideoLinear.gone()
        binding.rcVideoGrid.gone()
        binding.imGridLayout.gone()
        binding.tvAllVideo.gone()
        binding.tvNoData.visible()
        binding.imNoData.visible()
        binding.tvTitleNoData.visible()
    }
}