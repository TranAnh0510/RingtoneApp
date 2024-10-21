package com.example.appa.ui.activity.main.ringtones.ringtonemore.audio;

/**
 * Activity for managing audio files.
 * Handles the display of audio files and related actions.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030.H\u0016J\b\u0010/\u001a\u00020\"H\u0002J\b\u00100\u001a\u00020\"H\u0002J\b\u00101\u001a\u00020\"H\u0014J\b\u00102\u001a\u00020\"H\u0002J\b\u00103\u001a\u00020\"H\u0002J\b\u00104\u001a\u00020\"H\u0016J\u0012\u00105\u001a\u00020\"2\b\u00106\u001a\u0004\u0018\u000107H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010\n\u001a\u0004\b*\u0010+\u00a8\u00068"}, d2 = {"Lcom/example/appa/ui/activity/main/ringtones/ringtonemore/audio/AudioAct;", "Lcom/example/appa/ui/base/BaseBindingActivity;", "Lcom/example/appa/databinding/ActivityAudioBinding;", "Lcom/example/appa/ui/activity/main/ringtones/ringtonemore/audio/AudioVM;", "()V", "audioGridAdapter", "Lcom/example/appa/ui/adapter/recyclerview/AudioGridAdapter;", "getAudioGridAdapter", "()Lcom/example/appa/ui/adapter/recyclerview/AudioGridAdapter;", "audioGridAdapter$delegate", "Lkotlin/Lazy;", "audioLinearAdapter", "Lcom/example/appa/ui/adapter/recyclerview/AudioAdapter;", "getAudioLinearAdapter", "()Lcom/example/appa/ui/adapter/recyclerview/AudioAdapter;", "audioLinearAdapter$delegate", "dialogAscending", "Lcom/example/appa/ui/dialog/DialogAscending;", "getDialogAscending", "()Lcom/example/appa/ui/dialog/DialogAscending;", "dialogAscending$delegate", "durationAudio", "", "isClickSetting", "", "isGrantMediaAudio", "isSort", "layoutId", "", "getLayoutId", "()I", "loadState", "Lkotlin/Function1;", "Landroidx/paging/CombinedLoadStates;", "", "location", "", "nameAudio", "", "pathAudio", "sortDialog", "Lcom/example/appa/ui/dialog/DialogSort;", "getSortDialog", "()Lcom/example/appa/ui/dialog/DialogSort;", "sortDialog$delegate", "getViewModel", "Ljava/lang/Class;", "initAction", "initObserve", "onResume", "setUpViewNoData", "setUpViewYesData", "setupData", "setupView", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class AudioAct extends com.example.appa.ui.base.BaseBindingActivity<com.example.appa.databinding.ActivityAudioBinding, com.example.appa.ui.activity.main.ringtones.ringtonemore.audio.AudioVM> {
    @org.jetbrains.annotations.NotNull()
    private final int[] location = null;
    private boolean isGrantMediaAudio = false;
    private boolean isClickSetting = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pathAudio = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nameAudio = "";
    private long durationAudio = 0L;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<androidx.paging.CombinedLoadStates, kotlin.Unit> loadState = null;
    
    /**
     * Adapter for displaying audio files in a linear layout.
     * Manages click events and load state.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy audioLinearAdapter$delegate = null;
    
    /**
     * Adapter for displaying audio files in a grid layout.
     * Manages click events and load state.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy audioGridAdapter$delegate = null;
    
    /**
     * Flag indicating whether the audio files are sorted.
     * @author AnhTTH
     */
    private boolean isSort = false;
    
    /**
     * Dialog for sorting audio files.
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
    
    public AudioAct() {
        super();
    }
    
    /**
     * Adapter for displaying audio files in a linear layout.
     * Manages click events and load state.
     * @author AnhTTH
     */
    private final com.example.appa.ui.adapter.recyclerview.AudioAdapter getAudioLinearAdapter() {
        return null;
    }
    
    /**
     * Adapter for displaying audio files in a grid layout.
     * Manages click events and load state.
     * @author AnhTTH
     */
    private final com.example.appa.ui.adapter.recyclerview.AudioGridAdapter getAudioGridAdapter() {
        return null;
    }
    
    /**
     * Dialog for sorting audio files.
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
    public java.lang.Class<com.example.appa.ui.activity.main.ringtones.ringtonemore.audio.AudioVM> getViewModel() {
        return null;
    }
    
    /**
     * Sets up the view components of the activity.
     * Checks and requests audio permissions, sets up full screen mode, and initializes actions.
     * @param savedInstanceState The saved instance state of the activity.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void setupView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Resumes the activity.
     * Checks and requests audio permissions if necessary.
     * Initializes observers if audio permissions are granted.
     * @author AnhTTH
     */
    @java.lang.Override()
    protected void onResume() {
    }
    
    /**
     * Sets up the data for the activity.
     * Initializes observers to fetch and update audio data.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void setupData() {
    }
    
    /**
     * Initializes actions for UI components.
     * Sets up click listeners for buttons such as sorting, changing layout, going back, and selecting audio.
     * Observes changes in audio data and updates the UI accordingly.
     * @author AnhTTH
     */
    private final void initAction() {
    }
    
    /**
     * Observes changes in the audio data LiveData from the ViewModel.
     * When new data is received, it submits the updated data to both the audioLinearAdapter
     * and audioGridAdapter using the submitData method.
     * This ensures that the UI is updated with the latest audio data.
     * @author AnhTTh
     */
    private final void initObserve() {
    }
    
    /**
     * Configures the UI based on whether there is data available to display.
     * When there is data (setUpViewYesData), it makes the necessary UI elements visible and hides others.
     * Conversely, when there is no data (setUpViewNoData),
     * it hides the elements displaying audio data and shows elements indicating the absence of data.
     * @author AnhTTH
     */
    private final void setUpViewYesData() {
    }
    
    /**
     * Configures the UI when there is no audio data available.
     * @author AnhTTH
     */
    private final void setUpViewNoData() {
    }
}