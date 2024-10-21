package com.example.appa.ui.activity.main.search

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.lifecycle.lifecycleScope
import com.example.appa.R
import com.example.appa.data.model.musicserver.toItemFavourite
import com.example.appa.databinding.ActivitySearchBinding
import com.example.appa.ui.adapter.recyclerview.RecommendAdapter
import com.example.appa.ui.adapter.recyclerview.SearchDetailAdapter
import com.example.appa.ui.base.BaseBindingActivity
import com.example.appa.ui.base.observeWithCatch
import com.example.appa.ui.dialog.DialogDeniedExternalStorage
import com.example.appa.ui.dialog.DialogLoading
import com.example.appa.ui.dialog.DialogOptionSearch
import com.example.appa.util.MediaPlayerUtil
import com.example.appa.util.MediaPlayerUtil.playSound
import com.example.appa.util.MediaPlayerUtil.releaseMediaPlayer
import com.example.appa.util.extension.isAtLeastSdkVersion
import com.example.appa.util.extension.isGrantReadExternalStoragePermission
import com.example.appa.util.extension.setFullScreen
import com.example.appa.util.extension.setOnSafeClick
import com.example.appa.util.extension.startSetting
import com.example.appa.util.extension.visible
import com.example.appa.util.setVisibility
import com.google.android.flexbox.FlexWrap
import com.google.android.flexbox.FlexboxLayoutManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * Represents an activity for handling search operations.
 * This activity extends from BaseBindingActivity and uses ViewModel SearchVM.
 */
class SearchAct : BaseBindingActivity<ActivitySearchBinding, SearchVM>() {
    // Indicates whether the search is performed using the EditText field
    private var isSearchWithEdt = false

    // Lazy-loaded instance of DialogLoading
    private val dialogLoading: DialogLoading by lazy {
        DialogLoading().apply {
            onUpdate = { pathDownload, path ->
                viewModel.updatePathDownload(this@SearchAct, pathDownload, path)
            }
        }
    }

    // Lazy-loaded instance of DialogDeniedExternalStorage
    private val dialogDeniedExternalStorage: DialogDeniedExternalStorage by lazy {
        /**
         * Navigates to the settings screen.
         * @author AnhTTH
         */
        DialogDeniedExternalStorage().apply {
            onClickGotoSetting = {
                startSetting()
            }
        }
    }

    // Requests permission for external storage and handles the result
    private var requestPermissionExternalStorage =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
            if (isGranted) {
                // Permission granted
            } else {
                // Permission denied, show dialog
                dialogDeniedExternalStorage.show(
                    supportFragmentManager.beginTransaction().remove(dialogDeniedExternalStorage),
                    null
                )
            }
        }

    // Lazy-loaded instance of DialogOptionSearch
    private val dialogOptionSearch: DialogOptionSearch by lazy {
        /**
         * Adds or removes an item from favorites.
         * @param itemFavoriteUI The item to be added or removed from favorites.
         * @param isFavorite Indicates whether the item is currently a favorite.
         * @author AnhTTH
         */
        DialogOptionSearch().apply {
            onClickAddToFavorite = { itemFavoriteUI, isFavorite ->
                if (isFavorite) viewModel.deleteFavorite(itemFavoriteUI.path)
                else viewModel.insertFavorite(itemFavoriteUI)
            }
            /**
             * Sets an item as the ringtone and adds it to recent items.
             * @param item The item to be set as the ringtone.
             * @author AnhTTH
             */
            onClickSetRingtone = { item ->
                viewModel.insertRecent(item)

            }
            /**
             * Sets an item as the alarm tone and adds it to recent items.
             * @param item The item to be set as the alarm tone.
             * @author AnhTTH
             */
            onClickSetAlarm = { item ->
                viewModel.insertRecent(item)

            }
            /**
             * Sets an item as the notification tone and adds it to recent items.
             * @param item The item to be set as the notification tone.
             * @author AnhTTH
             */
            onClickSetNotification = { item ->
                viewModel.insertRecent(item)

            }

        }
    }

    /**
     * Lazy-loaded instance of RecommendAdapter.
     * This adapter handles the recommendation list and its item click events.
     * @author AnhTTH
     */
    private val recommendAdapter: RecommendAdapter by lazy {
        RecommendAdapter().apply {
            with(binding.rcHistorySearch) {
                itemAnimator = null
                adapter = this@apply
                FlexboxLayoutManager(this@SearchAct).apply {
                    flexWrap = FlexWrap.WRAP
                    layoutManager = this
                }
            }
            /**
             * Handles item click events in the recommendation list.
             * @param item The clicked item.
             * @author AnhTTH
             */
            onclickItem = { _, item ->
                item.nameOriginal?.let { searchMusic(it) }
                item.nameRecommend?.let {
                    isSearchWithEdt = true
                    binding.etSearch.setText(it)
                    binding.etSearch.setSelection(it.length)
                }
            }
        }
    }

    /**
     * Lazy-loaded instance of SearchDetailAdapter.
     * This adapter handles the detailed search results and its item click events.
     * @author AnhTTH
     */
    private val searchDetailAdapter: SearchDetailAdapter by lazy {
        SearchDetailAdapter().apply {
            binding.rcSearch.adapter = this
            /**
             * Handles item click events in the detailed search results.
             * @param pos The position of the clicked item.
             * @param item The clicked item.
             * @author AnhTTH
             */
            onclickItem = { pos, item ->
                if (MediaPlayerUtil.path == item.path && MediaPlayerUtil.isPlaying) {
                    releaseMediaPlayer()
                    notifyItemChanged(pos)
                } else {
                    lifecycleScope.launch(Dispatchers.IO) {
                        viewModel.listMusicLiveData.value?.let { listMusic ->
                            val oldPos = listMusic.indexOfFirst { it.path == MediaPlayerUtil.path }
                            withContext(Dispatchers.Main) {
                                if (oldPos >= 0) notifyItemChanged(oldPos)
                                playSound(this@SearchAct, item.path, onPrepare = {
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
             * Handles "more" button click events in the detailed search results.
             * @param item The item for which the "more" button was clicked.
             * @author AnhTTH
             */
            onclickMore = { _, item ->
                kotlin.runCatching {
                    isDispatchTouchEvent(1000)
                    dialogOptionSearch.showDialog(item, item.toItemFavourite(), item.isFavorite)
                    dialogOptionSearch.show(
                        supportFragmentManager.beginTransaction().remove(dialogOptionSearch), null
                    )
                }.onFailure { it.printStackTrace() }
            }
            /**
             * Handles download button click events in the detailed search results.
             * @param item The item for which the download button was clicked.
             */
            onclickDownload = { _, item ->
                isDispatchTouchEvent(1000)
                if (!isAtLeastSdkVersion(29)) {
                    if (isGrantReadExternalStoragePermission()) {
                        dialogLoading.path = item.path
                        dialogLoading.title = item.name
                        dialogLoading.show(
                            supportFragmentManager.beginTransaction().remove(dialogLoading), null
                        )
                    } else {
                        requestPermissionExternalStorage.launch(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)

                    }
                } else {
                    dialogLoading.path = item.path
                    dialogLoading.title = item.name
                    dialogLoading.show(
                        supportFragmentManager.beginTransaction().remove(dialogLoading), null
                    )
                }
            }
        }

    }

    /**
     * Returns the layout resource ID for this activity.
     * @author AnhTTH
     */
    override val layoutId: Int
        get() = R.layout.activity_search

    /**
     * Returns the ViewModel class for this activity.
     * @author AnhTTH
     */
    override fun getViewModel(): Class<SearchVM> = SearchVM::class.java

    /**
     * Sets up the view and initializes the UI components.
     * @param savedInstanceState The saved instance state.
     * @author AnhTTH
     */
    override fun setupView(savedInstanceState: Bundle?) {
        setFullScreen()
        setMarginStatusBar(binding.etSearch, 8)
        initAction()
    }

    /**
     * Sets up the data and initializes observers.
     * @author AnhTTH
     */
    override fun setupData() {
        initObserve()
    }

    /**
     * Called when the activity is resumed.
     * @author AnhTTH
     */
    override fun onResume() {
        super.onResume()
        if (isGrantReadExternalStoragePermission() && dialogDeniedExternalStorage.isAdded) {
            dialogDeniedExternalStorage.dismiss()
        }
    }

    /**
     * Called when the activity is destroyed.
     * @author AnhTTH
     */
    override fun onDestroy() {
        super.onDestroy()
        releaseMediaPlayer()
    }

    /**
     * Initializes observers for LiveData.
     * @author AnhTTH
     */
    private fun initObserve() {
        viewModel.getDataRecommend(this)
        viewModel.recommendLiveData.observeWithCatch(this) { dataCategory ->
            recommendAdapter.submitList(dataCategory)
        }
        viewModel.listMusicLiveData.observeWithCatch(this) { listMusic ->
            if (listMusic.isNotEmpty()) {
                with(binding) {
                    setVisibility(true, rcSearch, imCloseSearch)
                    setVisibility(
                        false,
                        tvContentNoData,
                        tvTitleNoData,
                        imNoData,
                        rcHistorySearch,
                        tvRecommended
                    )
                }
                searchDetailAdapter.submitList(listMusic) {
                    isSearchWithEdt = false
                }
            } else {
                with(binding) {
                    setVisibility(
                        false, rcSearch, rcSearch, rcHistorySearch, tvRecommended
                    )
                    setVisibility(true, tvContentNoData, tvTitleNoData, imNoData)
                }
            }
        }
    }

    /**
     * Initializes actions and event listeners.
     * @author AnhTTH
     */
    private fun initAction() {
        binding.imBack.setOnSafeClick {
            finish()
        }
        binding.etSearch.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (!isSearchWithEdt) {
                    searchMusic(s.toString())
                }
            }

            override fun afterTextChanged(s: Editable?) {
            }

        })
        binding.imCloseSearch.setOnSafeClick {
            binding.etSearch.text.clear()
        }
    }

    /**
     * Searches for music based on the query.
     * @author AnhTTH
     * @param query The search query.
     */
    private fun searchMusic(query: String) {
        kotlin.runCatching {
            binding.imCloseSearch.visible()
            if (query.isNotEmpty()) {
                viewModel.searchMusicWithKey(this@SearchAct, query)
            } else {
                with(binding) {
                    setVisibility(true, binding.rcHistorySearch, binding.tvRecommended)
                    setVisibility(
                        false, tvContentNoData, tvTitleNoData, imNoData, imCloseSearch, rcSearch
                    )
                }
            }
        }.onFailure { it.printStackTrace() }
    }
}