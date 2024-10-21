package com.example.appa.ui.activity.main.ringtones.ringtonemore.record

import android.os.Bundle
import com.example.appa.R
import com.example.appa.databinding.ActivityRecordingBinding
import com.example.appa.ui.adapter.recyclerview.RecordAdapter
import com.example.appa.ui.base.BaseBindingActivity
import com.example.appa.ui.base.observeWithCatch
import com.example.appa.ui.dialog.DialogOptionAllRecord
import com.example.appa.util.extension.setFullScreen
import com.example.appa.util.extension.setOnSafeClick

/**
 * Activity for recording audio.
 * This activity displays a list of recorded audio items and provides options for interaction such as playback, selection, and more actions.
 * It extends BaseBindingActivity for data binding capabilities and utilizes a custom ViewModel for managing data and UI logic.
 * @author AnhTTH
 */
class RecordAct : BaseBindingActivity<ActivityRecordingBinding, RecordVM>() {
    /**
     * Lazy-initialized dialog for displaying additional options related to audio recording.
     * @author AnhTTH
     */
    private val dialogOptionAlRecord: DialogOptionAllRecord by lazy {
        DialogOptionAllRecord().apply {

        }
    }

    /**
     * Lazy-initialized adapter for the list of recorded audio items.
     * It handles item clicks, including selection, playback, and displaying additional options.
     * @author AnhTTH
     */
    private val recordAdapter: RecordAdapter by lazy {
        RecordAdapter().apply {
            binding.rcAudio.adapter = this
            onclickItem = { _, item ->
                item.id?.let { viewModel.checkSelectRecord(it) }
            }
            onclickPlay = { _, item ->
            }
            onclickMore = { pos, item ->
                // Display additional options dialog when more button is clicked
                isDispatchTouchEvent(1000)
                dialogOptionAlRecord.nameSound = item.nameRecording
                dialogOptionAlRecord.date = item.date
                dialogOptionAlRecord.duration = item.duration
                dialogOptionAlRecord.show(
                    supportFragmentManager.beginTransaction().remove(dialogOptionAlRecord), null
                )
            }
        }
    }


    /**
     * Retrieves the layout resource ID for the activity.
     * @return The layout resource ID.
     * @author AnhTTH
     */
    override val layoutId: Int
        get() = R.layout.activity_recording

    /**
     * Retrieves the ViewModel class associated with this activity.
     * @return The ViewModel class.
     * @author AnhTTH
     */
    override fun getViewModel(): Class<RecordVM> = RecordVM::class.java

    /**
     * Performs additional setup for the activity's views.
     * @param savedInstanceState The saved instance state of the activity.
     * @author AnhTTH
     */
    override fun setupView(savedInstanceState: Bundle?) {
        setFullScreen()
        setMarginStatusBar(binding.tvTitle, 20)
        initAction()
    }

    /**
     * Initializes actions and observers for the activity.
     * @author AnhTTH
     */
    private fun initAction() {
        // Sets click listener for back button to finish the activity
        binding.imBack.setOnSafeClick {
            finish()
        }

    }

    /**
     * Sets up data for the activity.
     * @author AnhTTH
     */
    override fun setupData() {
        initObserve()
    }

    /**
     * Initializes observers for data changes.
     * @author AnhTTH
     */
    private fun initObserve() {
        // Retrieves data records from ViewModel
        viewModel.getDataRecord(this)
        // Observes changes in data record list
        viewModel.dataRecordListLiveData.observeWithCatch(this) { dataRecord ->
            runCatching {
                // Submits new list of data records to the adapter
                recordAdapter.submitList(dataRecord)
            }.onFailure {
                it.printStackTrace()
            }
        }
    }


}