package com.example.appa.ui.activity.main.favorite

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import androidx.lifecycle.lifecycleScope
import com.example.appa.R
import com.example.appa.common.Constant
import com.example.appa.common.MessageEvent
import com.example.appa.databinding.FragmentFavoriteBinding
import com.example.appa.ui.adapter.recyclerview.FavoritesAdapter
import com.example.appa.ui.base.BaseBindingFragment
import com.example.appa.ui.base.observeWithCatch
import com.example.appa.ui.dialog.DialogDeniedExternalStorage
import com.example.appa.ui.dialog.DialogLoading
import com.example.appa.ui.dialog.DialogOptionFavorite
import com.example.appa.util.MediaPlayerUtil
import com.example.appa.util.MediaPlayerUtil.releaseMediaPlayer
import com.example.appa.util.extension.gone
import com.example.appa.util.extension.isAtLeastSdkVersion
import com.example.appa.util.extension.isGrantReadExternalStoragePermission
import com.example.appa.util.extension.setFullScreen
import com.example.appa.util.extension.startSetting
import com.example.appa.util.extension.visible
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

/**
 * Fragment responsible for displaying and managing favorite items.
 * @author AnhTTH
 */
class FavoriteFragment : BaseBindingFragment<FragmentFavoriteBinding, FavoriteVM>() {

    private var favoriteAdapter: FavoritesAdapter? = null
    private var dialogOptionFavorite: DialogOptionFavorite? = null
    private var dialogLoading: DialogLoading? = null
    private val dialogDeniedExternalStorage: DialogDeniedExternalStorage by lazy {
        DialogDeniedExternalStorage().apply {
            onClickGotoSetting = {
                activity?.startSetting()
            }
        }
    }

    private var requestPermissionExternalStorage =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
            if (isGranted) {

            } else {
                dialogDeniedExternalStorage.show(
                    childFragmentManager.beginTransaction().remove(dialogDeniedExternalStorage),
                    null
                )
            }
        }

    /**
     * Returns the class type of the ViewModel.
     *
     * @return The [FavoriteVM] class type.
     */
    override fun getViewModel(): Class<FavoriteVM> {
        return FavoriteVM::class.java
    }

    /**
     * Registers the back press action for this fragment.
     */
    override fun registerOnBackPress() {

    }

    /**
     * Called when the view is created.
     *
     * @param view The view of the fragment.
     * @param savedInstanceState The saved instance state bundle.
     */
    override fun onCreatedView(view: View?, savedInstanceState: Bundle?) {
        activity?.setFullScreen()
        setupData()
        initAdapterAndDialog()
        initAction()

    }

    /**
     * Initializes the adapter and dialog components.
     */
    private fun initAdapterAndDialog() {
        dialogLoading = DialogLoading().apply {
            onUpdate = { pathDownload, path ->
                context?.let { viewModel.updatePathDownload(it, pathDownload, path) }
            }
        }
        favoriteAdapter = FavoritesAdapter().apply {
            onclickItem = { pos, item ->
                if (MediaPlayerUtil.path == item.path && MediaPlayerUtil.isPlaying) {
                    releaseMediaPlayer()
                    notifyItemChanged(pos)
                } else {
                    lifecycleScope.launch(Dispatchers.IO) {
                        viewModel.favoriteLiveData.value?.let { listMusic ->
                            val oldPos = listMusic.indexOfFirst { it.path == MediaPlayerUtil.path }
                            withContext(Dispatchers.Main) {
                                if (oldPos >= 0) notifyItemChanged(oldPos)
                                context?.let {
                                    MediaPlayerUtil.playSound(it, item.path, onPrepare = {
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
            }
            onclickMore = { _, item ->

                dialogOptionFavorite?.showDialog(item)
                dialogOptionFavorite?.show(childFragmentManager, null)
            }
            onclickDelete = { _, item ->
                viewModel.deleteFavorite(item.path)
            }
            onclickDownload = { _, item ->
                if (!isAtLeastSdkVersion(29)) {
                    if (context?.isGrantReadExternalStoragePermission() == true) {
                        dialogLoading?.path = item.path
                        dialogLoading?.title = item.name
                        dialogLoading?.show(
                            childFragmentManager, null
                        )
                    } else {
                        requestPermissionExternalStorage.launch(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    }
                } else {
                    dialogLoading?.path = item.path
                    dialogLoading?.title = item.name
                    dialogLoading?.show(
                        childFragmentManager, null
                    )
                }
            }
            binding.rcMyFavorites.adapter = this
        }

    }

    /**
     * Initializes actions for the view components.
     */
    private fun initAction() {

    }

    /**
     * Sets up the data for the ViewModel.
     */
    private fun setupData() {
        dialogOptionFavorite = DialogOptionFavorite().apply {
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
        viewModel.getAllFavorite()
        viewModel.favoriteLiveData.observeWithCatch(viewLifecycleOwner) { listFavorite ->
            favoriteAdapter?.submitList(listFavorite)
            if (listFavorite.isEmpty()) {
                binding.imNoData.visible()
                binding.tvTitleNoData.visible()
                binding.tvContentNoData.visible()
                binding.rcMyFavorites.gone()
            } else {
                binding.imNoData.gone()
                binding.tvTitleNoData.gone()
                binding.tvContentNoData.gone()
                binding.rcMyFavorites.visible()
            }
        }

    }

    /**
     * Called when the fragment is visible to the user and actively running.
     * Dismisses the denied external storage permission dialog if the read external storage permission is granted.
     * @author AnhTTH
     */
    override fun onResume() {
        super.onResume()
        if (context?.isGrantReadExternalStoragePermission() == true && dialogDeniedExternalStorage.isAdded) {
            dialogDeniedExternalStorage.dismiss()
        }
    }

    /**
     * Receives and handles message events posted by EventBus.
     * Updates the list of favorite items or the path download for favorite items based on the event type.
     * @param messageEvent The message event received from EventBus.
     * @author AnhTTH
     */
    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onEvent(messageEvent: MessageEvent) {
        when (messageEvent.typeEvent) {
            Constant.EVENT_UPDATE_FAVORITE -> {
                kotlin.runCatching {
                    viewModel.getAllFavorite()
                }.onFailure { it.printStackTrace() }
            }

            Constant.EVENT_UPDATE_PATH_DOWNLOAD_FAVOURITE -> {
                kotlin.runCatching {
                    viewModel.getAllFavorite()
                }.onFailure { it.printStackTrace() }
            }

        }
    }

    /**
     * Called when the fragment is first attached to its context.
     * Registers this fragment as an event subscriber to EventBus.
     * @author AnhTTH
     */
    override fun onAttach(context: Context) {
        super.onAttach(context)
        EventBus.getDefault().register(this)
    }

    /**
     * Called when the fragment is no longer attached to its context.
     * Unregisters this fragment as an event subscriber from EventBus.
     * @author AnhTTH
     */
    override fun onDetach() {
        super.onDetach()
        EventBus.getDefault().unregister(this)
    }

    /**
     * Returns the layout resource ID for the fragment.
     * @return The layout resource ID.
     * @author AnhTTH
     */
    override val layoutId: Int
        get() = R.layout.fragment_favorite

}