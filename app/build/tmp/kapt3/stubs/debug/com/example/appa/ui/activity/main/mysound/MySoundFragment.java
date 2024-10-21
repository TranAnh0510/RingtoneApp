package com.example.appa.ui.activity.main.mysound;

/**
 * A fragment for managing user's custom sound recordings.
 * Manages the UI for displaying and interacting with the user's sound recordings.
 * Uses a ViewModel to handle data operations and observe changes in the list of sound recordings.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001c\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u0014H\u0016J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#H\u0007J\b\u0010$\u001a\u00020\u0014H\u0014J\b\u0010%\u001a\u00020\u0014H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/example/appa/ui/activity/main/mysound/MySoundFragment;", "Lcom/example/appa/ui/base/BaseBindingFragment;", "Lcom/example/appa/databinding/FragmentMySoundBinding;", "Lcom/example/appa/ui/activity/main/mysound/MySoundVM;", "()V", "dialogChangeName", "Lcom/example/appa/ui/dialog/DialogChangeNameMySound;", "dialogOptionMySound", "Lcom/example/appa/ui/dialog/DialogOptionMySound;", "itemClickCurrent", "Lcom/example/appa/data/model/ItemMySoundUI;", "layoutId", "", "getLayoutId", "()I", "mySoundAdapter", "Lcom/example/appa/ui/adapter/recyclerview/MySoundAdapter;", "getViewModel", "Ljava/lang/Class;", "initAction", "", "initAdapterAndDialog", "initDialogChangeName", "initMySoundAdapter", "onAttach", "context", "Landroid/content/Context;", "onCreatedView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDetach", "onEvent", "messageEvent", "Lcom/example/appa/common/MessageEvent;", "registerOnBackPress", "setupData", "app_debug"})
public final class MySoundFragment extends com.example.appa.ui.base.BaseBindingFragment<com.example.appa.databinding.FragmentMySoundBinding, com.example.appa.ui.activity.main.mysound.MySoundVM> {
    @org.jetbrains.annotations.Nullable()
    private com.example.appa.ui.dialog.DialogOptionMySound dialogOptionMySound;
    @org.jetbrains.annotations.Nullable()
    private com.example.appa.ui.adapter.recyclerview.MySoundAdapter mySoundAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.example.appa.ui.dialog.DialogChangeNameMySound dialogChangeName;
    @org.jetbrains.annotations.Nullable()
    private com.example.appa.data.model.ItemMySoundUI itemClickCurrent;
    
    public MySoundFragment() {
        super();
    }
    
    /**
     * Retrieves the ViewModel class associated with this fragment.
     * @return The ViewModel class.
     * @author AnhTTH
     */
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected java.lang.Class<com.example.appa.ui.activity.main.mysound.MySoundVM> getViewModel() {
        return null;
    }
    
    /**
     * Placeholder method for registering back press actions.
     * No action is registered in this fragment.
     * @author AnhTTH
     */
    @java.lang.Override()
    protected void registerOnBackPress() {
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    /**
     * Callback method invoked when the view is created.
     * Initializes the adapter and dialog components, sets up data, and initializes actions.
     * @param view The fragment's root view.
     * @param savedInstanceState The saved state of the fragment if available.
     * @author AnhTTH
     */
    @java.lang.Override()
    protected void onCreatedView(@org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Initializes UI actions and event handlers.
     * Currently, no actions are initialized in this method.
     * @author AnhTTH
     */
    private final void initAction() {
    }
    
    /**
     * Sets up data for the fragment.
     * Retrieves the list of user's sound recordings from the ViewModel and updates the UI accordingly.
     * @author AnhTTH
     */
    private final void setupData() {
    }
    
    /**
     * Initializes the adapter and dialog components used in the fragment.
     * @author AnhTTH
     */
    private final void initAdapterAndDialog() {
    }
    
    /**
     * Initializes the MySoundAdapter for managing the list of user's sound recordings.
     * Sets up click listeners for various actions such as selecting an item, changing the name, editing, and accessing more options.
     * Also initializes the DialogOptionMySound for displaying additional options for a selected sound recording item.
     * @author AnhTTH
     */
    private final void initMySoundAdapter() {
    }
    
    /**
     * Initializes the DialogChangeNameMySound dialog for changing the name of a sound recording item.
     * Sets up the confirmation click listener to handle the name change request.
     * @author AnhTTH
     */
    private final void initDialogChangeName() {
    }
    
    /**
     * Handles EventBus events, specifically updates in the list of user's sound recordings.
     * Listens for EVENT_UPDATE_MY_SOUND event to trigger reloading of the sound recordings from the ViewModel.
     * @author AnhTTH
     */
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.example.appa.common.MessageEvent messageEvent) {
    }
    
    /**
     * Called when the fragment is attached to its hosting activity.
     * Registers this fragment as an EventBus subscriber to listen for events.
     * This method is typically used for initialization tasks that need access to the hosting activity's context.
     * @param context The context in which the fragment is attached.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * Called when the fragment is detached from its hosting activity.
     * Unregisters this fragment as an EventBus subscriber to stop listening for events.
     * This method is typically used for cleanup tasks when the fragment is being removed or replaced.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void onDetach() {
    }
}