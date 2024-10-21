package com.example.appa.ui.activity.main.ringtones.ringtonemore.video;

/**
 * Activity for managing videos.
 * This activity displays a list of videos in both grid and linear layouts.
 * It extends BaseBindingActivity for data binding capabilities and utilizes a custom ViewModel
 * for managing data and UI logic.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030-H\u0016J\b\u0010.\u001a\u00020\u0017H\u0002J\b\u0010/\u001a\u00020\u0017H\u0002J\b\u00100\u001a\u00020\u0017H\u0014J\b\u00101\u001a\u00020\u0017H\u0002J\b\u00102\u001a\u00020\u0017H\u0002J\b\u00103\u001a\u00020\u0017H\u0016J\u0012\u00104\u001a\u00020\u00172\b\u00105\u001a\u0004\u0018\u000106H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\n\u001a\u0004\b$\u0010%R\u001b\u0010\'\u001a\u00020(8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010\n\u001a\u0004\b)\u0010*\u00a8\u00067"}, d2 = {"Lcom/example/appa/ui/activity/main/ringtones/ringtonemore/video/VideoAct;", "Lcom/example/appa/ui/base/BaseBindingActivity;", "Lcom/example/appa/databinding/ActivityVideoBinding;", "Lcom/example/appa/ui/activity/main/ringtones/ringtonemore/video/VideoVM;", "()V", "dialogAscending", "Lcom/example/appa/ui/dialog/DialogAscending;", "getDialogAscending", "()Lcom/example/appa/ui/dialog/DialogAscending;", "dialogAscending$delegate", "Lkotlin/Lazy;", "durationVideo", "", "isGrantVideo", "", "isSort", "layoutId", "", "getLayoutId", "()I", "loadStates", "Lkotlin/Function1;", "Landroidx/paging/CombinedLoadStates;", "", "location", "", "nameVideo", "", "pathVideo", "sortDialog", "Lcom/example/appa/ui/dialog/DialogSort;", "getSortDialog", "()Lcom/example/appa/ui/dialog/DialogSort;", "sortDialog$delegate", "videoGridAdapter", "Lcom/example/appa/ui/adapter/recyclerview/VideoAdapter;", "getVideoGridAdapter", "()Lcom/example/appa/ui/adapter/recyclerview/VideoAdapter;", "videoGridAdapter$delegate", "videoLinearAdapter", "Lcom/example/appa/ui/adapter/recyclerview/VideoLinearAdapter;", "getVideoLinearAdapter", "()Lcom/example/appa/ui/adapter/recyclerview/VideoLinearAdapter;", "videoLinearAdapter$delegate", "getViewModel", "Ljava/lang/Class;", "initAction", "initObserve", "onResume", "setUpViewNoData", "setUpViewYesData", "setupData", "setupView", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class VideoAct extends com.example.appa.ui.base.BaseBindingActivity<com.example.appa.databinding.ActivityVideoBinding, com.example.appa.ui.activity.main.ringtones.ringtonemore.video.VideoVM> {
    @org.jetbrains.annotations.NotNull()
    private final int[] location = null;
    private boolean isGrantVideo = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pathVideo = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nameVideo = "";
    private long durationVideo = 0L;
    
    /**
     * Listener for observing load states of video lists.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<androidx.paging.CombinedLoadStates, kotlin.Unit> loadStates = null;
    
    /**
     * Adapter for displaying videos in a grid layout.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy videoGridAdapter$delegate = null;
    
    /**
     * Adapter for displaying videos in a linear layout.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy videoLinearAdapter$delegate = null;
    
    /**
     * Flag indicating whether sorting is applied.
     */
    private boolean isSort = false;
    
    /**
     * Dialog for sorting videos.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy sortDialog$delegate = null;
    
    /**
     * Dialog for selecting ascending or descending order.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dialogAscending$delegate = null;
    
    public VideoAct() {
        super();
    }
    
    /**
     * Adapter for displaying videos in a grid layout.
     * @author AnhTTH
     */
    private final com.example.appa.ui.adapter.recyclerview.VideoAdapter getVideoGridAdapter() {
        return null;
    }
    
    /**
     * Adapter for displaying videos in a linear layout.
     * @author AnhTTH
     */
    private final com.example.appa.ui.adapter.recyclerview.VideoLinearAdapter getVideoLinearAdapter() {
        return null;
    }
    
    /**
     * Dialog for sorting videos.
     * @author AnhTTH
     */
    private final com.example.appa.ui.dialog.DialogSort getSortDialog() {
        return null;
    }
    
    /**
     * Dialog for selecting ascending or descending order.
     * @author AnhTTH
     */
    private final com.example.appa.ui.dialog.DialogAscending getDialogAscending() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    /**
     * Retrieves the ViewModel class associated with this activity.
     * @return The ViewModel class.
     * @author AnhTTH
     */
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.Class<com.example.appa.ui.activity.main.ringtones.ringtonemore.video.VideoVM> getViewModel() {
        return null;
    }
    
    /**
     * Performs additional setup for the activity's views.
     * @param savedInstanceState The saved instance state of the activity.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void setupView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Sets up data for the activity.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void setupData() {
    }
    
    /**
     * Resumes the activity.
     * @author AnhTTH
     */
    @java.lang.Override()
    protected void onResume() {
    }
    
    /**
     * Initializes actions for UI elements.
     * @author AnhTTH
     */
    private final void initAction() {
    }
    
    /**
     * Observes changes in video data.
     * @author AnhTTH
     */
    private final void initObserve() {
    }
    
    /**
     * Sets up UI when there is data available.
     * @author AnhTTH
     */
    private final void setUpViewYesData() {
    }
    
    /**
     * Sets up UI when there is no data available.
     * @author AnhTTH
     */
    private final void setUpViewNoData() {
    }
}