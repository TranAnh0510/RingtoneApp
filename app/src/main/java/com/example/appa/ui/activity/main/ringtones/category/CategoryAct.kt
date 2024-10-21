package com.example.appa.ui.activity.main.ringtones.category

import android.content.Intent
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.example.appa.R
import com.example.appa.common.Constant
import com.example.appa.data.model.musicserver.toItemFavourite
import com.example.appa.databinding.ActivityCategoryBinding
import com.example.appa.ui.activity.main.search.SearchAct
import com.example.appa.ui.adapter.recyclerview.CategoryDetailAdapter
import com.example.appa.ui.base.BaseBindingActivity
import com.example.appa.ui.base.observeWithCatch
import com.example.appa.ui.dialog.DialogDeniedExternalStorage
import com.example.appa.ui.dialog.DialogLoading
import com.example.appa.ui.dialog.DialogOptionCategory
import com.example.appa.util.MediaPlayerUtil
import com.example.appa.util.extension.isAtLeastSdkVersion
import com.example.appa.util.extension.isGrantReadExternalStoragePermission
import com.example.appa.util.extension.setFullScreen
import com.example.appa.util.extension.setOnSafeClick
import com.example.appa.util.extension.startSetting
import com.example.appa.util.setNameCategory

/**
 * Activity class for managing the category-related UI and interactions.
 * This activity handles loading dialogs, permission requests, and interactions
 * with category items such as playing sounds, setting ringtones, and managing favorites.
 * @author AnhTTH
 */
class CategoryAct : BaseBindingActivity<ActivityCategoryBinding, CategoryVM>() {
    // Lazy initialization of the loading dialog
    private val dialogLoading: DialogLoading by lazy {
        DialogLoading().apply {
            onUpdate = { pathDownload, path ->
                viewModel.updatePathDownload(this@CategoryAct, pathDownload, path)
            }
        }
    }

    // Lazy initialization of the dialog for denied external storage permission
    private val dialogDeniedExternalStorage: DialogDeniedExternalStorage by lazy {
        DialogDeniedExternalStorage().apply {
            onClickGotoSetting = {
                startSetting()
            }
        }
    }

    // Request permission for external storage access
    private var requestPermissionExternalStorage =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
            if (isGranted) {

            } else {
                dialogDeniedExternalStorage.show(
                    supportFragmentManager.beginTransaction().remove(dialogDeniedExternalStorage),
                    null
                )
            }
        }

    // Lazy initialization of the dialog for category options
    private val dialogOptionCategory: DialogOptionCategory by lazy {
        DialogOptionCategory().apply {
            onClickAddToFavorite = { itemFavoriteUI, isFavorite ->
                if (isFavorite) viewModel.deleteFavorite(itemFavoriteUI.path)
                else viewModel.insertFavorite(itemFavoriteUI)
            }

            onClickSetRingtone = { item ->
                viewModel.insertRecent(item)

            }
            onClickSetAlarm = { item ->
                viewModel.insertRecent(item)

            }
            onClickSetNotification = { item ->
                viewModel.insertRecent(item)

            }
        }
    }

    // Lazy initialization of the category detail adapter
    private val categoryDetailAdapter: CategoryDetailAdapter by lazy {
        CategoryDetailAdapter().apply {
            onclickItem = { pos, item ->
                isDispatchTouchEvent(1000)
                runCatching {
                    if (MediaPlayerUtil.path == item.path && MediaPlayerUtil.isPlaying) {
                        MediaPlayerUtil.releaseMediaPlayer()
                        notifyItemChanged(pos)
                    } else {
                        viewModel.categoryLiveData.value?.let { listMusic ->
                            val oldPos = listMusic.indexOfFirst { it.path == MediaPlayerUtil.path }
                            if (oldPos >= 0) notifyItemChanged(oldPos)
                            MediaPlayerUtil.playSound(this@CategoryAct, item.path, onPrepare = {
                                notifyItemChanged(pos)
                            }, onStart = {
                                notifyItemChanged(pos)
                            }, onDone = {
                                notifyItemChanged(pos)
                            })
                        }
                    }
                }.onFailure { it.printStackTrace() }
            }

            onclickMore = { _, item ->
                kotlin.runCatching {
                    isDispatchTouchEvent(1000)
                    dialogOptionCategory.showDialog(item, item.toItemFavourite(), item.isFavorite)
                    dialogOptionCategory.show(
                        supportFragmentManager.beginTransaction().remove(dialogOptionCategory), null
                    )
                }.onFailure { it.printStackTrace() }
            }

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
            binding.rcCategorie.adapter = this
        }
    }

    /**
     * Retrieves the layout resource ID for this activity.
     * @return The layout resource ID, which is `R.layout.activity_category'.
     * @author AnhTTH
     */
    override val layoutId: Int
        get() = R.layout.activity_category

    /**
     * Provides the ViewModel class associated with this activity.
     * @return The ViewModel class, which is `CategoryVM::class.java`.
     * @author AnhTTH
     */
    override fun getViewModel(): Class<CategoryVM> = CategoryVM::class.java

    /**
     * Sets up the view for this activity. This includes setting the activity
     * to full screen, adjusting the margin for the status bar, and initializing
     * the view and actions.
     * @param savedInstanceState The saved instance state of the activity, if any.
     * @author AnhTTH
     */
    override fun setupView(savedInstanceState: Bundle?) {
        setFullScreen()
        setMarginStatusBar(binding.tvTitle, 20)
        initView()
        initAction()
    }

    /**
     * Initializes the view components of this activity. This method sets the title
     * of the activity based on the category name passed through the intent.
     * @author AnhTTH
     */
    private fun initView() {
        intent.getStringExtra(Constant.KEY_NAME_CATEGORY)?.let { nameCategory ->
            binding.tvTitle.text = nameCategory.setNameCategory(this)
        }
    }

    /**
     * Called when the activity is resumed. Checks if the read external storage permission
     * is granted, and if the dialog indicating denial of this permission is currently shown,
     * it dismisses the dialog.
     * @author AnhTTH
     */
    override fun onResume() {
        super.onResume()
        if (isGrantReadExternalStoragePermission() && dialogDeniedExternalStorage.isAdded) {
            dialogDeniedExternalStorage.dismiss()
        }

    }

    /**
     * Sets up data observers and other data-related initializations.
     * @author AnhTTH
     */
    override fun setupData() {
        initObserve()
    }

    /**
     * Called when the activity is destroyed. Releases the media player resources.
     * @author AnhTTH
     */
    override fun onDestroy() {
        super.onDestroy()
        MediaPlayerUtil.releaseMediaPlayer()
    }

    /**
     * Initializes observers for the ViewModel. Fetches the category data based on the category name
     * passed through the intent and observes the live data for changes. Updates the adapter's data
     * when changes are observed.
     * @author AnhTTH
     */
    private fun initAction() {
        binding.imBack.setOnSafeClick {
            finish()
        }
        binding.imSearch.setOnSafeClick {
            Intent(this, SearchAct::class.java).apply {
                startActivity(this)
            }
        }
    }

    /**
     * Initializes observers for the ViewModel. This method retrieves the category name
     * from the intent, fetches the category data using the ViewModel, and sets up an observer
     * on the `categoryLiveData` to update the adapter's data when changes are observed.
     * @author AnhTTH
     */
    private fun initObserve() {
        intent.getStringExtra(Constant.KEY_NAME_CATEGORY)?.let { nameCategory ->
            viewModel.getDataCategory(nameCategory)
            viewModel.categoryLiveData.observeWithCatch(this) { listMusic ->
                categoryDetailAdapter.submitList(listMusic)
            }
        }
    }


}