package com.example.appa.ui.activity.main.mysound

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.appa.R
import com.example.appa.common.Constant
import com.example.appa.common.MessageEvent
import com.example.appa.data.model.ItemMySoundUI
import com.example.appa.databinding.FragmentMySoundBinding
import com.example.appa.ui.activity.main.MainActivity
import com.example.appa.ui.activity.main.mysound.edit.EditMySoundAct
import com.example.appa.ui.adapter.recyclerview.MySoundAdapter
import com.example.appa.ui.base.BaseBindingFragment
import com.example.appa.ui.base.observeWithCatch
import com.example.appa.ui.dialog.DialogChangeNameMySound
import com.example.appa.ui.dialog.DialogOptionMySound
import com.example.appa.util.extension.gone
import com.example.appa.util.extension.visible
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

/**
 * A fragment for managing user's custom sound recordings.
 * Manages the UI for displaying and interacting with the user's sound recordings.
 * Uses a ViewModel to handle data operations and observe changes in the list of sound recordings.
 * @author AnhTTH
 */
class MySoundFragment : BaseBindingFragment<FragmentMySoundBinding, MySoundVM>() {

    private var dialogOptionMySound: DialogOptionMySound? = null
    private var mySoundAdapter: MySoundAdapter? = null
    private var dialogChangeName: DialogChangeNameMySound? = null
    private var itemClickCurrent: ItemMySoundUI? = null

    /**
     * Retrieves the ViewModel class associated with this fragment.
     * @return The ViewModel class.
     * @author AnhTTH
     */
    override fun getViewModel(): Class<MySoundVM> {
        return MySoundVM::class.java
    }

    /**
     * Placeholder method for registering back press actions.
     * No action is registered in this fragment.
     * @author AnhTTH
     */
    override fun registerOnBackPress() {

    }

    /**
     * Retrieves the layout resource ID for this fragment's UI.
     * @return The layout resource ID.
     * @author AnhTTH
     */
    override val layoutId: Int
        get() = R.layout.fragment_my_sound

    /**
     * Callback method invoked when the view is created.
     * Initializes the adapter and dialog components, sets up data, and initializes actions.
     * @param view The fragment's root view.
     * @param savedInstanceState The saved state of the fragment if available.
     * @author AnhTTH
     */
    override fun onCreatedView(view: View?, savedInstanceState: Bundle?) {
        initAdapterAndDialog()
        setupData()
        initAction()
    }

    /**
     * Initializes UI actions and event handlers.
     * Currently, no actions are initialized in this method.
     * @author AnhTTH
     */
    private fun initAction() {
    }

    /**
     * Sets up data for the fragment.
     * Retrieves the list of user's sound recordings from the ViewModel and updates the UI accordingly.
     * @author AnhTTH
     */
    private fun setupData() {
        context?.let {
            viewModel.getAllMySound(it)
        }
        viewModel.mySoundLiveData.observeWithCatch(viewLifecycleOwner) { dataSound ->
            mySoundAdapter?.submitList(dataSound)
            if (dataSound.isEmpty()) {
                binding.imNoData.visible()
                binding.tvTitleNoData.visible()
                binding.tvContentNoData.visible()
                binding.rcMySounds.gone()
            } else {
                binding.imNoData.gone()
                binding.tvTitleNoData.gone()
                binding.tvContentNoData.gone()
                binding.rcMySounds.visible()
            }
        }
    }

    /**
     * Initializes the adapter and dialog components used in the fragment.
     * @author AnhTTH
     */
    private fun initAdapterAndDialog() {
        initDialogChangeName()
        initMySoundAdapter()
    }

    /**
     * Initializes the MySoundAdapter for managing the list of user's sound recordings.
     * Sets up click listeners for various actions such as selecting an item, changing the name, editing, and accessing more options.
     * Also initializes the DialogOptionMySound for displaying additional options for a selected sound recording item.
     * @author AnhTTH
     */
    private fun initMySoundAdapter() {
        mySoundAdapter = MySoundAdapter().apply {
            binding.rcMySounds.adapter = this
            onclickItem = { pos, item ->
                isSelect = !isSelect
                notifyItemChanged(pos)
            }
            onclickChangeName = { _, item ->
                itemClickCurrent = item
                dialogChangeName?.let {
                    it.show(childFragmentManager.beginTransaction().remove(it), null)
                }
            }
            onclickEdit = { _, item ->
                Intent(context, EditMySoundAct::class.java).apply {
                    putExtra(Constant.KEY_PATH_AUDIO, item.path)
                    putExtra(Constant.KEY_NAME_AUDIO, item.nameRingtone)
                    putExtra(Constant.KEY_DURATION_AUDIO, item.durationLong)
                    startActivity(this)
                }
            }
            onclickMore = { _, item ->
                dialogOptionMySound?.id = item.id
                dialogOptionMySound?.path = item.path
                dialogOptionMySound?.nameSound = item.nameRingtone
                dialogOptionMySound?.duration = item.duration
                dialogOptionMySound?.show(
                    childFragmentManager, null
                )
            }
        }

        dialogOptionMySound = DialogOptionMySound().apply {
            onClickDelete = {
                viewModel.deleteMySound(it)
            }
        }
    }

    /**
     * Initializes the DialogChangeNameMySound dialog for changing the name of a sound recording item.
     * Sets up the confirmation click listener to handle the name change request.
     * @author AnhTTH
     */
    private fun initDialogChangeName() {
        dialogChangeName = DialogChangeNameMySound().apply {
            onClickConfirm = { newName ->
                (activity as MainActivity).isDispatchTouchEvent(1000)
                itemClickCurrent?.id?.let {
                    viewModel.updateNameMySound(newName, it)
                }
            }
        }
    }

    /**
     * Handles EventBus events, specifically updates in the list of user's sound recordings.
     * Listens for EVENT_UPDATE_MY_SOUND event to trigger reloading of the sound recordings from the ViewModel.
     * @author AnhTTH
     */
    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onEvent(messageEvent: MessageEvent) {
        when (messageEvent.typeEvent) {
            Constant.EVENT_UPDATE_MY_SOUND -> {
                kotlin.runCatching {
                    context?.let { context ->
                        viewModel.getAllMySound(context)
                    }
                }.onFailure { it.printStackTrace() }
            }
        }
    }

    /**
     * Called when the fragment is attached to its hosting activity.
     * Registers this fragment as an EventBus subscriber to listen for events.
     * This method is typically used for initialization tasks that need access to the hosting activity's context.
     * @param context The context in which the fragment is attached.
     * @author AnhTTH
     */
    override fun onAttach(context: Context) {
        super.onAttach(context)
        EventBus.getDefault().register(this)
    }

    /**
     * Called when the fragment is detached from its hosting activity.
     * Unregisters this fragment as an EventBus subscriber to stop listening for events.
     * This method is typically used for cleanup tasks when the fragment is being removed or replaced.
     * @author AnhTTH
     */
    override fun onDetach() {
        super.onDetach()
        EventBus.getDefault().unregister(this)
    }
}