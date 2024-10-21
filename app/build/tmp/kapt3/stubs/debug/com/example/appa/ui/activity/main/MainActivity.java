package com.example.appa.ui.activity.main;

/**
 * MainActivity is the main activity of the application.
 * It extends BaseBindingActivity to provide data binding support.
 * This activity manages permissions related to external storage and media access.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u00100\u001a\u000201H\u0002J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020\u000303H\u0016J\b\u00104\u001a\u000201H\u0002J\b\u00105\u001a\u000201H\u0002J\u0012\u00106\u001a\u0002012\b\u00107\u001a\u0004\u0018\u00010*H\u0014J\b\u00108\u001a\u000201H\u0014J\b\u00109\u001a\u000201H\u0002J\b\u0010:\u001a\u000201H\u0016J\u0012\u0010;\u001a\u0002012\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\b\u0010>\u001a\u000201H\u0002J\u0014\u0010?\u001a\u0002012\n\u0010@\u001a\u0006\u0012\u0002\b\u000303H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u001b\u0010\u0019R\u001e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u001d\u0010\u0019R\u000e\u0010\u001e\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020 8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010\n\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010+\u001a\u0010\u0012\f\u0012\n -*\u0004\u0018\u00010,0,0)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010.\u001a\u0010\u0012\f\u0012\n -*\u0004\u0018\u00010,0,0)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010/\u001a\u0010\u0012\f\u0012\n -*\u0004\u0018\u00010,0,0)X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lcom/example/appa/ui/activity/main/MainActivity;", "Lcom/example/appa/ui/base/BaseBindingActivity;", "Lcom/example/appa/databinding/ActivityMainBinding;", "Lcom/example/appa/ui/activity/main/MainVM;", "()V", "dialogDeniedExternalStorage", "Lcom/example/appa/ui/dialog/DialogDeniedExternalStorage;", "getDialogDeniedExternalStorage", "()Lcom/example/appa/ui/dialog/DialogDeniedExternalStorage;", "dialogDeniedExternalStorage$delegate", "Lkotlin/Lazy;", "dialogDeniedMediaAudio", "Lcom/example/appa/ui/dialog/DialogDeniedMediaAudio;", "getDialogDeniedMediaAudio", "()Lcom/example/appa/ui/dialog/DialogDeniedMediaAudio;", "dialogDeniedMediaAudio$delegate", "dialogDeniedMediaVideo", "Lcom/example/appa/ui/dialog/DialogDeniedMediaVideo;", "getDialogDeniedMediaVideo", "()Lcom/example/appa/ui/dialog/DialogDeniedMediaVideo;", "dialogDeniedMediaVideo$delegate", "value", "", "isGrantAudio", "setGrantAudio", "(Z)V", "isGrantStorage", "setGrantStorage", "isGrantVideo", "setGrantVideo", "isShowMySound", "layoutId", "", "getLayoutId", "()I", "pagerAdapter", "Lcom/example/appa/ui/adapter/viewpager/MainViewPager;", "getPagerAdapter", "()Lcom/example/appa/ui/adapter/viewpager/MainViewPager;", "pagerAdapter$delegate", "recordSoundLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "requestPermissionExternalStorage", "", "kotlin.jvm.PlatformType", "requestPermissionMediaAudio", "requestPermissionMediaVideo", "checkShowDialogOption", "", "getViewModel", "Ljava/lang/Class;", "hideDialogOption", "initAction", "onNewIntent", "intent", "onStop", "setUpViewPager", "setupData", "setupView", "savedInstanceState", "Landroid/os/Bundle;", "showDialogOption", "showOptionAct", "cls", "app_debug"})
public final class MainActivity extends com.example.appa.ui.base.BaseBindingActivity<com.example.appa.databinding.ActivityMainBinding, com.example.appa.ui.activity.main.MainVM> {
    
    /**
     * Dialog shown when external storage access is denied.
     * Lazily initialized to improve performance.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dialogDeniedExternalStorage$delegate = null;
    
    /**
     * Dialog shown when media access (video) is denied.
     * Lazily initialized to improve performance.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dialogDeniedMediaVideo$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dialogDeniedMediaAudio$delegate = null;
    private boolean isGrantStorage = false;
    private boolean isGrantVideo = false;
    private boolean isGrantAudio = false;
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionExternalStorage;
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionMediaVideo;
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionMediaAudio;
    
    /**
     * Flag indicating whether the "My Sound" feature should be displayed.
     * @author AnhTTH
     */
    private boolean isShowMySound = false;
    
    /**
     * Launcher for the activity result when recording sound.
     * Registers an activity result listener to handle the result of the sound recording activity.
     * @see [ActivityResultContracts.StartActivityForResult]
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> recordSoundLauncher;
    
    /**
     * Lazily initializes the pagerAdapter used to manage fragments in the ViewPager.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy pagerAdapter$delegate = null;
    
    public MainActivity() {
        super();
    }
    
    /**
     * Dialog shown when external storage access is denied.
     * Lazily initialized to improve performance.
     * @author AnhTTH
     */
    private final com.example.appa.ui.dialog.DialogDeniedExternalStorage getDialogDeniedExternalStorage() {
        return null;
    }
    
    /**
     * Dialog shown when media access (video) is denied.
     * Lazily initialized to improve performance.
     * @author AnhTTH
     */
    private final com.example.appa.ui.dialog.DialogDeniedMediaVideo getDialogDeniedMediaVideo() {
        return null;
    }
    
    private final com.example.appa.ui.dialog.DialogDeniedMediaAudio getDialogDeniedMediaAudio() {
        return null;
    }
    
    private final void setGrantStorage(boolean value) {
    }
    
    private final void setGrantVideo(boolean value) {
    }
    
    private final void setGrantAudio(boolean value) {
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    /**
     * Lazily initializes the pagerAdapter used to manage fragments in the ViewPager.
     * @author AnhTTH
     */
    private final com.example.appa.ui.adapter.viewpager.MainViewPager getPagerAdapter() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.Class<com.example.appa.ui.activity.main.MainVM> getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void setupView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    private final void initAction() {
    }
    
    /**
     * Sets up data for the MainActivity.
     * This method can be used to initialize data or perform data-related operations.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void setupData() {
    }
    
    /**
     * Called when a new intent is received.
     * Handles the intent to show the "My Sound" fragment if specified.
     * If the intent contains the flag KEY_SHOW_MY_SOUND set to true, it posts a delayed action to click on the "My Sound" tab in the bottom navigation.
     * @param intent The new intent that was started for the activity.
     * @author AnhTTH
     */
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    /**
     * Sets up the ViewPager in the MainActivity.
     * Configures ViewPager with adapter, margin, offscreen page limit, and disables user input.
     * @author AnhTTH
     */
    private final void setUpViewPager() {
    }
    
    /**
     * Launches an activity based on the provided class.
     * @param cls The class of the activity to be launched.
     * @author AnhTTH
     */
    private final void showOptionAct(java.lang.Class<?> cls) {
    }
    
    /**
     * Checks and toggles visibility of the option dialog.
     * @author AnhTTH
     */
    private final void checkShowDialogOption() {
    }
    
    /**
     * Shows the option dialog with animation.
     * @author AnhTTH
     */
    private final void showDialogOption() {
    }
    
    /**
     * Hides the option dialog with animation.
     * @author AnhTTH
     */
    private final void hideDialogOption() {
    }
}