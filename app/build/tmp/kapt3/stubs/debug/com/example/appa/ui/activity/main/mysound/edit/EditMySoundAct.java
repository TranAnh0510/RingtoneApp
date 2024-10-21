package com.example.appa.ui.activity.main.mysound.edit;

/**
 * EditMySoundAct is the activity for editing a custom sound.
 * It extends BaseBindingActivity to provide data binding support.
 * This activity manages audio playback and editing functionalities.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0003J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0003J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\b\u0010\u001d\u001a\u00020\u0017H\u0014J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0007J\b\u0010!\u001a\u00020\u0017H\u0014J\b\u0010\"\u001a\u00020\u0017H\u0002J\b\u0010#\u001a\u00020\u0017H\u0016J\u0012\u0010$\u001a\u00020\u00172\b\u0010%\u001a\u0004\u0018\u00010&H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/example/appa/ui/activity/main/mysound/edit/EditMySoundAct;", "Lcom/example/appa/ui/base/BaseBindingActivity;", "Lcom/example/appa/databinding/ActivityEditMySoundBinding;", "Lcom/example/appa/ui/activity/main/mysound/edit/EditMySoundVM;", "()V", "TIME_TOTAL_DEFAULT", "", "audioPlayer", "Lcom/example/appa/util/AudioPlayer;", "isMoveTimeAudio", "", "layoutId", "", "getLayoutId", "()I", "path", "", "timeEndAudio", "timeRunAudio", "timeStartAudio", "uri", "Landroid/net/Uri;", "getDataFromIntent", "", "getViewModel", "Ljava/lang/Class;", "initAction", "initObserve", "initTrimViewListener", "onDestroy", "onEvent", "messageEvent", "Lcom/example/appa/common/MessageEvent;", "onPause", "pauseAudio", "setupData", "setupView", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class EditMySoundAct extends com.example.appa.ui.base.BaseBindingActivity<com.example.appa.databinding.ActivityEditMySoundBinding, com.example.appa.ui.activity.main.mysound.edit.EditMySoundVM> {
    private final long TIME_TOTAL_DEFAULT = 3000L;
    @org.jetbrains.annotations.Nullable()
    private com.example.appa.util.AudioPlayer audioPlayer;
    @org.jetbrains.annotations.Nullable()
    private android.net.Uri uri;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String path;
    private long timeStartAudio = 0L;
    private long timeRunAudio = 0L;
    private long timeEndAudio;
    private boolean isMoveTimeAudio = false;
    
    public EditMySoundAct() {
        super();
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    /**
     * Retrieves the ViewModel class for the activity.
     * @return The ViewModel class for EditMySoundAct.
     * @author AnhTTH
     */
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.Class<com.example.appa.ui.activity.main.mysound.edit.EditMySoundVM> getViewModel() {
        return null;
    }
    
    /**
     * Sets up the user interface for the activity.
     * Registers EventBus if not already registered, sets full-screen mode,
     * adjusts margin for the title TextView, and initializes actions.
     * @param savedInstanceState An instance of Bundle containing data
     * to restore the activity's state after being destroyed.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void setupView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Sets up data for the EditMySoundAct activity.
     * Retrieves data from the intent, initializes observers, and handles updates to the edited sound item.
     * If the editing operation is successful, it posts an EventBus message to update the "My Sound" fragment and navigates back to the MainActivity.
     * If an error occurs during editing, it displays a toast with an error message.
     * Hides the loading view after data processing.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void setupData() {
    }
    
    /**
     * Retrieves data from the intent and initializes UI elements based on the received data.
     * If the intent contains audio data from recording or selecting a file,
     * it sets up audio playback controls and initializes the trim view.
     * If the intent contains video data, it extracts audio from the video,
     * sets up UI elements with video information, and initializes the trim view.
     * If the intent contains audio data from selecting a file, it sets up UI
     * elements with audio information and initializes the trim view.
     * Hides the loading view after data processing.
     * @author AnhTTH
     */
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void getDataFromIntent() {
    }
    
    /**
     * Initializes observers for LiveData objects in the ViewModel.
     * Observes changes in durationLiveData to update the total time displayed and the trim view's duration.
     * Observes changes in pathLiveData to update the audio file path and initialize
     * the AudioPlayer if a path is available.
     * Hides the loading view after data processing.
     * @author AnhTTH
     */
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void initObserve() {
    }
    
    /**
     * Receives EventBus events and performs actions based on the event type.
     * Handles events related to successful and failed audio trimming and audio extraction from video.
     * If audio trimming is successful, it creates a new ItemMySoundUI object and inserts it into the ViewModel.
     * If audio trimming or audio extraction fails, it displays an error message and hides the loading view.
     * @param messageEvent The EventBus message event containing information about the event type and data.
     * @author AnhTTH
     */
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.example.appa.common.MessageEvent messageEvent) {
    }
    
    /**
     * Pauses audio playback and performs cleanup operations when the activity is paused.
     * Stops the audio playback, pauses the drawing process in the trim view,
     * and updates the play/pause button icon.
     * @author AnhTTH
     */
    @java.lang.Override()
    protected void onPause() {
    }
    
    /**
     * Performs cleanup operations when the activity is destroyed.
     * Stops the audio playback, unregisters from EventBus if registered,
     * and handles potential exceptions.
     * @author AnhTTH
     */
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    /**
     * Pauses audio playback and drawing process in the trim view.
     * Stops the audio playback, pauses the drawing process in the trim view,
     * and updates the play/pause button icon.
     * @author AnhTTH
     */
    private final void pauseAudio() {
    }
    
    /**
     * Initializes the listener for the trim view to handle trimming events.
     * Implements the OnTrimVideoListener interface to handle events such as time changes,
     * time selections, and time runs.
     * @author AnhTTH
     */
    private final void initTrimViewListener() {
    }
    
    /**
     * Initializes actions for various views in the activity.
     * Sets up a listener for the trim view to handle trimming events.
     * Sets click listeners for buttons to handle audio playback, pause, trimming, and navigation.
     * Handles playback controls for audio files, including play, pause, stop, and resume.
     * Handles trimming of audio files based on user-defined start and end times.
     * @author AnhTTH
     */
    private final void initAction() {
    }
}