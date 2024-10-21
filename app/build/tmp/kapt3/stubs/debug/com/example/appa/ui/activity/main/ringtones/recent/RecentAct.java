package com.example.appa.ui.activity.main.ringtones.recent;

/**
 * RecentAct is an activity class that extends BaseBindingActivity with
 * ActivityRecentBinding and RecentVM as type parameters.
 * It handles the initialization of the view, setting up data observers,
 * and managing actions related to recent items.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0014J\b\u0010\u001f\u001a\u00020\u001cH\u0016J\u0012\u0010 \u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006#"}, d2 = {"Lcom/example/appa/ui/activity/main/ringtones/recent/RecentAct;", "Lcom/example/appa/ui/base/BaseBindingActivity;", "Lcom/example/appa/databinding/ActivityRecentBinding;", "Lcom/example/appa/ui/activity/main/ringtones/recent/RecentVM;", "()V", "dialogLoading", "Lcom/example/appa/ui/dialog/DialogLoading;", "getDialogLoading", "()Lcom/example/appa/ui/dialog/DialogLoading;", "dialogLoading$delegate", "Lkotlin/Lazy;", "dialogOptionRecent", "Lcom/example/appa/ui/dialog/DialogOptionRecent;", "getDialogOptionRecent", "()Lcom/example/appa/ui/dialog/DialogOptionRecent;", "dialogOptionRecent$delegate", "layoutId", "", "getLayoutId", "()I", "recentAdapter", "Lcom/example/appa/ui/adapter/recyclerview/RecentActAdapter;", "getRecentAdapter", "()Lcom/example/appa/ui/adapter/recyclerview/RecentActAdapter;", "recentAdapter$delegate", "getViewModel", "Ljava/lang/Class;", "initAction", "", "initObserve", "onStop", "setupData", "setupView", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class RecentAct extends com.example.appa.ui.base.BaseBindingActivity<com.example.appa.databinding.ActivityRecentBinding, com.example.appa.ui.activity.main.ringtones.recent.RecentVM> {
    
    /**
     * initializes a DialogOptionRecent object
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dialogOptionRecent$delegate = null;
    
    /**
     * displays a dialog for download progress
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dialogLoading$delegate = null;
    
    /**
     * displays a list of recent items
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy recentAdapter$delegate = null;
    
    public RecentAct() {
        super();
    }
    
    /**
     * initializes a DialogOptionRecent object
     * @author AnhTTH
     */
    private final com.example.appa.ui.dialog.DialogOptionRecent getDialogOptionRecent() {
        return null;
    }
    
    /**
     * displays a dialog for download progress
     * @author AnhTTH
     */
    private final com.example.appa.ui.dialog.DialogLoading getDialogLoading() {
        return null;
    }
    
    /**
     * displays a list of recent items
     * @author AnhTTH
     */
    private final com.example.appa.ui.adapter.recyclerview.RecentActAdapter getRecentAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    /**
     * Provides the ViewModel class associated with this activity.
     * @return The ViewModel class, which is {@code RecentVM.class}.
     * @author AnhTTH
     */
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.Class<com.example.appa.ui.activity.main.ringtones.recent.RecentVM> getViewModel() {
        return null;
    }
    
    /**
     * sets up the user interface and actions when the activity is created or restored after being destroyed
     * @author AnhTTH
     */
    @java.lang.Override()
    public void setupView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * initiates actions for user interface components in the activity
     * @author AnhTTH
     */
    private final void initAction() {
    }
    
    /**
     * set up data for activity
     * @author AnhTTH
     */
    @java.lang.Override()
    public void setupData() {
    }
    
    /**
     * initiate the process of observing data and processing when data changes
     * @author AnhTTH
     */
    private final void initObserve() {
    }
    
    /**
     * perform cleanup jobs or release resources before the operation is cancelled
     * @author AnhTTH
     */
    @java.lang.Override()
    protected void onStop() {
    }
}