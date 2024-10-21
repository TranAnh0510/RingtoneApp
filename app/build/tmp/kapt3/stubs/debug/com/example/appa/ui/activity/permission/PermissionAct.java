package com.example.appa.ui.activity.permission;

/**
 * Permission Activity to set permission for this app.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u000201H\u0002J\b\u00103\u001a\u000201H\u0002J\u000e\u00104\u001a\b\u0012\u0004\u0012\u00020\u000305H\u0016J\b\u00106\u001a\u000201H\u0002J\b\u00107\u001a\u000201H\u0014J\b\u00108\u001a\u000201H\u0016J\u0012\u00109\u001a\u0002012\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010<\u001a\u000201H\u0002J\b\u0010=\u001a\u000201H\u0002J\u0014\u0010>\u001a\u000201*\u00020?2\u0006\u0010@\u001a\u00020\u001bH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b \u0010\u001eR\u001e\u0010!\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\"\u0010\u001eR\u001e\u0010#\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b$\u0010\u001eR\u0014\u0010%\u001a\u00020&8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\'\u0010(R\u001c\u0010)\u001a\u0010\u0012\f\u0012\n ,*\u0004\u0018\u00010+0+0*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010-\u001a\u0010\u0012\f\u0012\n ,*\u0004\u0018\u00010+0+0*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010.\u001a\u0010\u0012\f\u0012\n ,*\u0004\u0018\u00010+0+0*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010/\u001a\u0010\u0012\f\u0012\n ,*\u0004\u0018\u00010+0+0*X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lcom/example/appa/ui/activity/permission/PermissionAct;", "Lcom/example/appa/ui/base/BaseBindingActivity;", "Lcom/example/appa/databinding/ActivityPermissionBinding;", "Lcom/example/appa/ui/activity/permission/PermissionVM;", "()V", "dialogDeniedExternalStorage", "Lcom/example/appa/ui/dialog/DialogDeniedExternalStorage;", "getDialogDeniedExternalStorage", "()Lcom/example/appa/ui/dialog/DialogDeniedExternalStorage;", "dialogDeniedExternalStorage$delegate", "Lkotlin/Lazy;", "dialogDeniedMediaAudio", "Lcom/example/appa/ui/dialog/DialogDeniedMediaAudio;", "getDialogDeniedMediaAudio", "()Lcom/example/appa/ui/dialog/DialogDeniedMediaAudio;", "dialogDeniedMediaAudio$delegate", "dialogDeniedMediaVideo", "Lcom/example/appa/ui/dialog/DialogDeniedMediaVideo;", "getDialogDeniedMediaVideo", "()Lcom/example/appa/ui/dialog/DialogDeniedMediaVideo;", "dialogDeniedMediaVideo$delegate", "dialogDeniedWriteSetting", "Lcom/example/appa/ui/dialog/DialogDeniedWriteSetting;", "getDialogDeniedWriteSetting", "()Lcom/example/appa/ui/dialog/DialogDeniedWriteSetting;", "dialogDeniedWriteSetting$delegate", "value", "", "isGrantAudio", "setGrantAudio", "(Z)V", "isGrantStorage", "setGrantStorage", "isGrantVideo", "setGrantVideo", "isGrantWriteSetting", "setGrantWriteSetting", "layoutId", "", "getLayoutId", "()I", "requestPermissionExternalStorage", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "requestPermissionMediaAudio", "requestPermissionMediaVideo", "requestPermissionWriteSetting", "checkBuildVersion", "", "checkClickGo", "checkPermission", "getViewModel", "Ljava/lang/Class;", "initAction", "onResume", "setupData", "setupView", "savedInstanceState", "Landroid/os/Bundle;", "showButtonGo", "startMainAct", "setOnOff", "Landroid/widget/TextView;", "isOn", "app_debug"})
public final class PermissionAct extends com.example.appa.ui.base.BaseBindingActivity<com.example.appa.databinding.ActivityPermissionBinding, com.example.appa.ui.activity.permission.PermissionVM> {
    
    /**
     * grant permission for external storage
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dialogDeniedExternalStorage$delegate = null;
    
    /**
     * grant permission for media video
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dialogDeniedMediaVideo$delegate = null;
    
    /**
     * grant permission for media audio
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dialogDeniedMediaAudio$delegate = null;
    
    /**
     * grant permission for write setting
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dialogDeniedWriteSetting$delegate = null;
    
    /**
     * manage state through isGrantWriteSetting variable, update app permission changes
     * @author AnhTTH
     */
    private boolean isGrantWriteSetting = false;
    
    /**
     * update permission storage state by calling binding.tvWriteStorage.setOnOff(value)
     * if the new value is true and the dialogDeniedExternalStorage is currently being displayed,
     * then the dialog will be hidden
     * @author AnhTTH
     */
    private boolean isGrantStorage = false;
    
    /**
     * update permission storage state by calling binding.tvWriteStorage.setOnOff(value)
     * if the new value is true and the dialogDeniedMediaVideo is currently being displayed,
     * then the dialog will be hidden
     * @author AnhTTH
     */
    private boolean isGrantVideo = false;
    
    /**
     * update permission storage state by calling binding.tvWriteStorage.setOnOff(value)
     * if the new value is true and the dialogDeniedMediaAudio is currently being displayed,
     * then the dialog will be hidden
     * @author AnhTTH
     */
    private boolean isGrantAudio = false;
    
    /**
     * registration of permission request to write setting
     * if the permission is granted, isGrantWriteSetting is set to true
     * if the permission is denied, the dialogDeniedWriteSetting is displayed
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionWriteSetting;
    
    /**
     * registration of permission request to external storage
     * if the permission is granted, isGrantStorage is set to true
     * if the permission is denied, the dialogDeniedExternalStorage to grant permission
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionExternalStorage;
    
    /**
     * registration of permission request to media video
     * if the permission is granted, isGrantVideo is set to true
     * if the permission is denied, the dialogDeniedMediaVideo to grant permission
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionMediaVideo;
    
    /**
     * registration of permission request to media audio
     * if the permission is granted, isGrantAudio is set to true
     * if the permission is denied, the dialogDeniedMediaAudio to grant permission
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionMediaAudio;
    
    public PermissionAct() {
        super();
    }
    
    /**
     * grant permission for external storage
     * @author AnhTTH
     */
    private final com.example.appa.ui.dialog.DialogDeniedExternalStorage getDialogDeniedExternalStorage() {
        return null;
    }
    
    /**
     * grant permission for media video
     */
    private final com.example.appa.ui.dialog.DialogDeniedMediaVideo getDialogDeniedMediaVideo() {
        return null;
    }
    
    /**
     * grant permission for media audio
     */
    private final com.example.appa.ui.dialog.DialogDeniedMediaAudio getDialogDeniedMediaAudio() {
        return null;
    }
    
    /**
     * grant permission for write setting
     */
    private final com.example.appa.ui.dialog.DialogDeniedWriteSetting getDialogDeniedWriteSetting() {
        return null;
    }
    
    private final void setGrantWriteSetting(boolean value) {
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
     * Returns the ViewModel class for the activity.
     * @return The [Class] object representing the ViewModel class.
     * @author AnhTTH
     */
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.Class<com.example.appa.ui.activity.permission.PermissionVM> getViewModel() {
        return null;
    }
    
    /**
     * display view intro on screen
     * @author AnhTTH
     */
    @java.lang.Override()
    public void setupView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Set data for app
     * @author AnhTTH
     */
    @java.lang.Override()
    public void setupData() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    /**
     * Check permission version code for app
     * @author AnhTTH
     */
    private final void checkPermission() {
    }
    
    /**
     * Check build version for app
     * @author AnhTTH
     */
    private final void checkBuildVersion() {
    }
    
    /**
     * set click action for button
     * @author AnhTTH
     */
    private final void initAction() {
    }
    
    /**
     * check the state of specific action from SharePreference
     * @author AnhTTH
     */
    private final void checkClickGo() {
    }
    
    /**
     * Start to Main Screen
     * @author AnhTTH
     */
    private final void startMainAct() {
    }
    
    /**
     * Set state enabled for Switch
     * @author AnhTTH
     */
    private final void setOnOff(android.widget.TextView $this$setOnOff, boolean isOn) {
    }
    
    /**
     * control the display between 2 interface component
     * base on condition of permission
     * @author AnhTTH
     */
    private final void showButtonGo() {
    }
}