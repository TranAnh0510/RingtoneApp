package com.example.appa.ui.activity.main.ringtones;

/**
 * Fragment for managing ringtones.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001c\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\u0017H\u0016J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0007J\b\u0010%\u001a\u00020\u0017H\u0016J\b\u0010&\u001a\u00020\u0017H\u0014J\b\u0010\'\u001a\u00020\u0017H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/example/appa/ui/activity/main/ringtones/RingtonesFragment;", "Lcom/example/appa/ui/base/BaseBindingFragment;", "Lcom/example/appa/databinding/FragmentRingtonesBinding;", "Lcom/example/appa/ui/activity/main/ringtones/RingtoneVM;", "()V", "categoryHomeAdapter", "Lcom/example/appa/ui/adapter/recyclerview/CategoryHomeAdapter;", "dialogOptionRecent", "Lcom/example/appa/ui/dialog/DialogOptionRecent;", "getDialogOptionRecent", "()Lcom/example/appa/ui/dialog/DialogOptionRecent;", "dialogOptionRecent$delegate", "Lkotlin/Lazy;", "layoutId", "", "getLayoutId", "()I", "posRecent", "recentAdapter", "Lcom/example/appa/ui/adapter/recyclerview/RecentAdapter;", "getViewModel", "Ljava/lang/Class;", "initAction", "", "initAdapter", "onAttach", "context", "Landroid/content/Context;", "onCreatedView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDetach", "onEvent", "messageEvent", "Lcom/example/appa/common/MessageEvent;", "onStop", "registerOnBackPress", "setupData", "app_debug"})
public final class RingtonesFragment extends com.example.appa.ui.base.BaseBindingFragment<com.example.appa.databinding.FragmentRingtonesBinding, com.example.appa.ui.activity.main.ringtones.RingtoneVM> {
    @org.jetbrains.annotations.Nullable()
    private com.example.appa.ui.adapter.recyclerview.RecentAdapter recentAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.example.appa.ui.adapter.recyclerview.CategoryHomeAdapter categoryHomeAdapter;
    private int posRecent = 0;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dialogOptionRecent$delegate = null;
    
    public RingtonesFragment() {
        super();
    }
    
    private final com.example.appa.ui.dialog.DialogOptionRecent getDialogOptionRecent() {
        return null;
    }
    
    /**
     * Retrieves the ViewModel class associated with this fragment.
     * @return The ViewModel class.
     * @author AnhTTH
     */
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected java.lang.Class<com.example.appa.ui.activity.main.ringtones.RingtoneVM> getViewModel() {
        return null;
    }
    
    /**
     * Does nothing for back press registration.
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
     * Called when the view is created.
     * @author AnhTTH
     */
    @java.lang.Override()
    protected void onCreatedView(@org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Initializes actions for UI elements.
     * @author AnhTTH
     */
    private final void initAction() {
    }
    
    /**
     * Sets up data for the fragment.
     * @author AnhTTH
     */
    private final void setupData() {
    }
    
    /**
     * Initializes adapters for recent items and home categories.
     * @author AnhTTH
     */
    private final void initAdapter() {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.example.appa.common.MessageEvent messageEvent) {
    }
    
    /**
     * Called when the fragment is attached to a context.
     * @param context The context to attach.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * Called when the fragment is detached from its context.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void onDetach() {
    }
    
    /**
     * Called when the fragment is no longer visible to the user.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void onStop() {
    }
}