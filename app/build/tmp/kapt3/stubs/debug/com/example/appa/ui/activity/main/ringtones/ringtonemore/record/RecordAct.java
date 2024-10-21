package com.example.appa.ui.activity.main.ringtones.ringtonemore.record;

/**
 * Activity for recording audio.
 * This activity displays a list of recorded audio items and provides options for interaction such as playback, selection, and more actions.
 * It extends BaseBindingActivity for data binding capabilities and utilizes a custom ViewModel for managing data and UI logic.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\u0012\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001d"}, d2 = {"Lcom/example/appa/ui/activity/main/ringtones/ringtonemore/record/RecordAct;", "Lcom/example/appa/ui/base/BaseBindingActivity;", "Lcom/example/appa/databinding/ActivityRecordingBinding;", "Lcom/example/appa/ui/activity/main/ringtones/ringtonemore/record/RecordVM;", "()V", "dialogOptionAlRecord", "Lcom/example/appa/ui/dialog/DialogOptionAllRecord;", "getDialogOptionAlRecord", "()Lcom/example/appa/ui/dialog/DialogOptionAllRecord;", "dialogOptionAlRecord$delegate", "Lkotlin/Lazy;", "layoutId", "", "getLayoutId", "()I", "recordAdapter", "Lcom/example/appa/ui/adapter/recyclerview/RecordAdapter;", "getRecordAdapter", "()Lcom/example/appa/ui/adapter/recyclerview/RecordAdapter;", "recordAdapter$delegate", "getViewModel", "Ljava/lang/Class;", "initAction", "", "initObserve", "setupData", "setupView", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class RecordAct extends com.example.appa.ui.base.BaseBindingActivity<com.example.appa.databinding.ActivityRecordingBinding, com.example.appa.ui.activity.main.ringtones.ringtonemore.record.RecordVM> {
    
    /**
     * Lazy-initialized dialog for displaying additional options related to audio recording.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dialogOptionAlRecord$delegate = null;
    
    /**
     * Lazy-initialized adapter for the list of recorded audio items.
     * It handles item clicks, including selection, playback, and displaying additional options.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy recordAdapter$delegate = null;
    
    public RecordAct() {
        super();
    }
    
    /**
     * Lazy-initialized dialog for displaying additional options related to audio recording.
     * @author AnhTTH
     */
    private final com.example.appa.ui.dialog.DialogOptionAllRecord getDialogOptionAlRecord() {
        return null;
    }
    
    /**
     * Lazy-initialized adapter for the list of recorded audio items.
     * It handles item clicks, including selection, playback, and displaying additional options.
     * @author AnhTTH
     */
    private final com.example.appa.ui.adapter.recyclerview.RecordAdapter getRecordAdapter() {
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
    public java.lang.Class<com.example.appa.ui.activity.main.ringtones.ringtonemore.record.RecordVM> getViewModel() {
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
     * Initializes actions and observers for the activity.
     * @author AnhTTH
     */
    private final void initAction() {
    }
    
    /**
     * Sets up data for the activity.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void setupData() {
    }
    
    /**
     * Initializes observers for data changes.
     * @author AnhTTH
     */
    private final void initObserve() {
    }
}