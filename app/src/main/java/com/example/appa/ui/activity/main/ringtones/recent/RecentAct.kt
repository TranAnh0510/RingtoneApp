package com.example.appa.ui.activity.main.ringtones.recent

import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.appa.R
import com.example.appa.data.model.toItemFavourite
import com.example.appa.databinding.ActivityRecentBinding
import com.example.appa.ui.adapter.recyclerview.RecentActAdapter
import com.example.appa.ui.base.BaseBindingActivity
import com.example.appa.ui.base.observeWithCatch
import com.example.appa.ui.dialog.DialogLoading
import com.example.appa.ui.dialog.DialogOptionRecent
import com.example.appa.util.MediaPlayerUtil
import com.example.appa.util.extension.setFullScreen
import com.example.appa.util.extension.setOnSafeClick
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * RecentAct is an activity class that extends BaseBindingActivity with
 * ActivityRecentBinding and RecentVM as type parameters.
 * It handles the initialization of the view, setting up data observers,
 * and managing actions related to recent items.
 * @author AnhTTH
 */
class RecentAct : BaseBindingActivity<ActivityRecentBinding, RecentVM>() {

    /**
     * initializes a DialogOptionRecent object
     * @author AnhTTH
     */
    private val dialogOptionRecent: DialogOptionRecent by lazy {
        DialogOptionRecent().apply {
            /**
             * Set the action that occurs when the user clicks the add to favorites button in the dialog.
             * @author AnhTTH
             */
            onClickAddToFavorite = { itemFavoriteUI, isFavorite ->
                if (isFavorite) viewModel.deleteFavorite(itemFavoriteUI.path)
                else viewModel.insertFavorite(itemFavoriteUI)
            }
            /**
             * Set the action that occurs when the user taps the set as ringtone button in the dialog
             * @author AnhTTH
             */
            onClickSetRingtone = { item ->
                viewModel.insertRecent(item)

            }
            /**
             * Set the action that occurs when the user taps the alarm set button in the dialog
             * @author AnhTTH
             */
            onClickSetAlarm = { item ->
                viewModel.insertRecent(item)

            }
            /**
             * set the action occurs when the user taps the notification set button in the dialog
             */
            onClickSetNotification = { item ->
                viewModel.insertRecent(item)

            }

        }
    }

    /**
     * displays a dialog for download progress
     * @author AnhTTH
     */
    private val dialogLoading: DialogLoading by lazy {
        DialogLoading().apply {
            /**
             * Call the viewModel's updatePathDownload method to update the download path.
             * @author AnhTTH
             */
            onUpdate = { pathDownload, path ->
                viewModel.updatePathDownload(this@RecentAct, pathDownload, path)
            }
        }
    }

    /**
     * displays a list of recent items
     * @author AnhTTH
     */
    private val recentAdapter: RecentActAdapter by lazy {
        RecentActAdapter().apply {
            binding.rcRecentPlay.adapter = this
            /**
             * Set up the action that occurs when the user clicks an item in the list
             * @author AnhTTH
             */
            onclickItem = { pos, item ->
                /**
                 * Check if the current item's path matches the path of the played sound and the sound being played
                 * Call the releaseMediaPlayer() method to release memory and stop playing audio
                 * @author AnhTTH
                 */
                if (MediaPlayerUtil.path == item.path && MediaPlayerUtil.isPlaying) {
                    MediaPlayerUtil.releaseMediaPlayer()
                    notifyItemChanged(pos)
                } else {
                    /**
                     * If there is no match, start playing a new sound
                     * @author AnhTTH
                     */
                    lifecycleScope.launch(Dispatchers.IO) {
                        viewModel.dataRecentListLiveData.value?.let { listMusic ->
                            val oldPos = listMusic.indexOfFirst { it.path == MediaPlayerUtil.path }
                            withContext(Dispatchers.Main) {
                                if (oldPos >= 0) notifyItemChanged(oldPos)
                                MediaPlayerUtil.playSound(this@RecentAct, item.path, onPrepare = {
                                    notifyItemChanged(pos)
                                }, onStart = {
                                    notifyItemChanged(pos)
                                }, onDone = {
                                    notifyItemChanged(pos)
                                })
                            }
                        }
                    }
                }
            }
            /**
             * Set up the action that occurs when the user taps the "More options" button on an item.
             * @author AnhTTH
             */
            onclickMore = { _, item ->
                kotlin.runCatching {
                    isDispatchTouchEvent(1000)
                    dialogOptionRecent.showDialog(item, item.toItemFavourite(), item.isFavorite)
                    dialogOptionRecent.show(
                        supportFragmentManager.beginTransaction().remove(dialogOptionRecent), null
                    )
                }.onFailure { it.printStackTrace() }
            }
            /**
             * Set up the action that occurs when the user taps the "Download" button on an item
             * @author AnhTTH
             */
            onclickDownload = { _, item ->
                isDispatchTouchEvent(1000)
                dialogLoading.path = item.path
                dialogLoading.title = item.nameSound
                dialogLoading.show(
                    supportFragmentManager.beginTransaction().remove(dialogOptionRecent), null
                )
            }
        }

    }
    /**
     * Gets the layout resource ID for this activity.
     * @return The layout resource ID, which is {@code R.layout.activity_recent}.
     * @author AnhTTH
     */
    override val layoutId: Int
        get() = R.layout.activity_recent


    /**
     * Provides the ViewModel class associated with this activity.
     * @return The ViewModel class, which is {@code RecentVM.class}.
     * @author AnhTTH
     */
    override fun getViewModel(): Class<RecentVM> {
        return RecentVM::class.java
    }

    /**
     * sets up the user interface and actions when the activity is created or restored after being destroyed
     * @author AnhTTH
     */
    override fun setupView(savedInstanceState: Bundle?) {
        setFullScreen()
        setMarginStatusBar(binding.tvTitle, 8)
        initAction()
    }

    /**
     * initiates actions for user interface components in the activity
     * @author AnhTTH
     */
    private fun initAction() {
        /**
         * End the current activity and return to the previous activity or close it completely
         * @author AnhTTH
         */
        binding.imBack.setOnSafeClick { finish() }
    }

    /**
     * set up data for activity
     * @author AnhTTH
     */
    override fun setupData() {
        initObserve()

    }

    /**
     * initiate the process of observing data and processing when data changes
     * @author AnhTTH
     */
    private fun initObserve() {
        viewModel.getDataRecent()
        viewModel.dataRecentListLiveData.observeWithCatch(this) { dataRecent ->
            runCatching {
                recentAdapter.submitList(dataRecent)
            }.onFailure {
                it.printStackTrace()
            }
        }
    }

    /**
     * perform cleanup jobs or release resources before the operation is cancelled
     * @author AnhTTH
     */
    override fun onStop() {
        super.onStop()
        /**
         * Free up memory and stop playing music before the operation is stopped
         * @author AnhTTH
         */
        MediaPlayerUtil.releaseMediaPlayer()

    }

}