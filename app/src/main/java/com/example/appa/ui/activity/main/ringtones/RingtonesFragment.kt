package com.example.appa.ui.activity.main.ringtones

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import com.example.appa.R
import com.example.appa.common.Constant
import com.example.appa.common.MessageEvent
import com.example.appa.data.model.toItemFavourite
import com.example.appa.databinding.FragmentRingtonesBinding
import com.example.appa.ui.activity.main.MainActivity
import com.example.appa.ui.activity.main.ringtones.category.CategoryAct
import com.example.appa.ui.activity.main.ringtones.recent.RecentAct
import com.example.appa.ui.activity.main.search.SearchAct
import com.example.appa.ui.adapter.recyclerview.CategoryHomeAdapter
import com.example.appa.ui.adapter.recyclerview.RecentAdapter
import com.example.appa.ui.base.BaseBindingFragment
import com.example.appa.ui.base.observeWithCatch
import com.example.appa.ui.dialog.DialogOptionRecent
import com.example.appa.ui.guideline.GuideLineAct
import com.example.appa.util.MediaPlayerUtil
import com.example.appa.util.MediaPlayerUtil.releaseMediaPlayer
import com.example.appa.util.extension.gone
import com.example.appa.util.extension.setOnSafeClick
import com.example.appa.util.extension.visible
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

/**
 * Fragment for managing ringtones.
 * @author AnhTTH
 */
class RingtonesFragment : BaseBindingFragment<FragmentRingtonesBinding, RingtoneVM>() {
    // Adapters for recent items and home categories
    private var recentAdapter: RecentAdapter? = null
    private var categoryHomeAdapter: CategoryHomeAdapter? = null

    // Position of the recent item
    private var posRecent = 0

    // Dialog for handling recent options
    private val dialogOptionRecent: DialogOptionRecent by lazy {
        DialogOptionRecent().apply {
            onClickAddToFavorite = { itemFavoriteUI, isFavorite ->
                if (isFavorite) viewModel.deleteFavorite(itemFavoriteUI.path)
                else viewModel.insertFavorite(itemFavoriteUI)
            }
        }
    }

    /**
     * Retrieves the ViewModel class associated with this fragment.
     * @return The ViewModel class.
     * @author AnhTTH
     */
    override fun getViewModel(): Class<RingtoneVM> {
        return RingtoneVM::class.java
    }

    /**
     * Does nothing for back press registration.
     * @author AnhTTH
     */
    override fun registerOnBackPress() {

    }

    /**
     * Retrieves the layout resource ID for the fragment.
     * @return The layout resource ID.
     * @author AnhTTH
     */
    override val layoutId: Int
        get() = R.layout.fragment_ringtones

    /**
     * Called when the view is created.
     * @author AnhTTH
     */
    override fun onCreatedView(view: View?, savedInstanceState: Bundle?) {
        setupData()
        initAdapter()
        initAction()
    }

    /**
     * Initializes actions for UI elements.
     * @author AnhTTH
     */
    private fun initAction() {
        // Navigates to guideline activity
        binding.imGuide.setOnSafeClick {
            (activity as MainActivity).isDispatchTouchEvent(1000)
            Intent(context, GuideLineAct::class.java).apply {
                startActivity(this)
            }
        }
        // Navigates to search activity
        binding.tvSearch.setOnSafeClick {
            (activity as MainActivity).isDispatchTouchEvent(1000)
            Intent(context, SearchAct::class.java).apply {
                startActivity(this)
            }
        }
        // Navigates to recent activity
        binding.tvSeeAll.setOnSafeClick {
            (activity as MainActivity).isDispatchTouchEvent(1000)
            Intent(context, RecentAct::class.java).apply {
                startActivity(this)
            }
        }
    }

    /**
     * Sets up data for the fragment.
     * @author AnhTTH
     */
    private fun setupData() {
        viewModel.getAllRecent()
        viewModel.getAllCategory()
        viewModel.recentLiveData.observeWithCatch(viewLifecycleOwner) { listRecent ->
            recentAdapter?.submitList(listRecent)
            if (listRecent.isEmpty()) {
                binding.tvRecent.gone()
                binding.tvSeeAll.gone()
                binding.rcRecent.gone()
            } else {
                binding.tvRecent.visible()
                binding.tvSeeAll.visible()
                binding.rcRecent.visible()
            }
        }
        viewModel.categoryLiveData.observeWithCatch(viewLifecycleOwner) { listCategory ->
            categoryHomeAdapter?.submitList(listCategory)
        }
    }

    /**
     * Initializes adapters for recent items and home categories.
     * @author AnhTTH
     */
    private fun initAdapter() {
        kotlin.runCatching {
            recentAdapter = RecentAdapter().apply {
                onclickItem = { pos, item ->
                    posRecent = pos
                    if (MediaPlayerUtil.path == item.path && MediaPlayerUtil.isPlaying) {
                        releaseMediaPlayer()
                        notifyItemChanged(pos)
                    } else {
                        lifecycleScope.launch(Dispatchers.IO) {
                            viewModel.recentLiveData.value?.let { listMusic ->
                                val oldPos =
                                    listMusic.indexOfFirst { it.path == MediaPlayerUtil.path }
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
                binding.rcRecent.adapter = this
                onclickMore = { _, item ->
                    kotlin.runCatching {
                        dialogOptionRecent.showDialog(item, item.toItemFavourite(), item.isFavorite)

                        dialogOptionRecent.show(
                            childFragmentManager.beginTransaction().remove(dialogOptionRecent), null
                        )
                    }.onFailure { it.printStackTrace() }
                }
            }
            categoryHomeAdapter = CategoryHomeAdapter().apply {
                onclickItem = { _, item ->
                    Intent(context, CategoryAct::class.java).apply {
                        putExtra(Constant.KEY_NAME_CATEGORY, item.name)
                        startActivity(this)
                    }
                }
                binding.rcCategories.adapter = this
            }
        }.onFailure { it.printStackTrace() }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onEvent(messageEvent: MessageEvent) {
        when (messageEvent.typeEvent) {
            Constant.EVENT_UPDATE_RECENT -> {
                kotlin.runCatching {
                    viewModel.getAllRecent()
                }.onFailure { it.printStackTrace() }
            }

            Constant.EVENT_STOP_MUSIC_RINGTONE_FRAGMENT -> {
                releaseMediaPlayer()
            }
        }
    }



    /**
     * Called when the fragment is attached to a context.
     * @param context The context to attach.
     * @author AnhTTH
     */
    override fun onAttach(context: Context) {
        super.onAttach(context)
        EventBus.getDefault().register(this)
    }

    /**
     * Called when the fragment is detached from its context.
     * @author AnhTTH
     */
    override fun onDetach() {
        super.onDetach()
        EventBus.getDefault().unregister(this)
    }

    /**
     * Called when the fragment is no longer visible to the user.
     * @author AnhTTH
     */
    override fun onStop() {
        super.onStop()
        releaseMediaPlayer()
        recentAdapter?.notifyItemChanged(posRecent)
    }

}