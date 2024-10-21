package com.example.appa.ui.dialog;

/**
 * A dialog fragment for displaying options for a custom sound.
 * This dialog allows the user to view information about a custom sound, such as its name, duration, and path,
 * and provides options for actions such as deleting the sound.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010$\u001a\u00020\u0019H\u0002J\b\u0010%\u001a\u00020\u0019H\u0003J\u001c\u0010&\u001a\u00020\u00192\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00190\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\tR\u001c\u0010!\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\u00050\u00050\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/example/appa/ui/dialog/DialogOptionMySound;", "Lcom/example/appa/ui/base/BaseBindingBottomSheetDialogFragment;", "Lcom/example/appa/databinding/DialogOptionMySoundBinding;", "()V", "duration", "", "getDuration", "()Ljava/lang/String;", "setDuration", "(Ljava/lang/String;)V", "id", "", "getId", "()J", "setId", "(J)V", "layoutId", "", "getLayoutId", "()I", "nameSound", "getNameSound", "setNameSound", "onClickDelete", "Lkotlin/Function1;", "", "getOnClickDelete", "()Lkotlin/jvm/functions/Function1;", "setOnClickDelete", "(Lkotlin/jvm/functions/Function1;)V", "path", "getPath", "setPath", "requestPermissionWriteSetting", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "initAction", "initData", "onCreatedView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class DialogOptionMySound extends com.example.appa.ui.base.BaseBindingBottomSheetDialogFragment<com.example.appa.databinding.DialogOptionMySoundBinding> {
    
    /**
     * The name of the custom sound.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String nameSound;
    
    /**
     * The duration of the custom sound.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String duration;
    
    /**
     * The path to the custom sound file.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String path;
    
    /**
     * The action to be performed when the delete option is clicked.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onClickDelete;
    
    /**
     * The ID of the custom sound.
     * @author AnhTTH
     */
    private long id = 0L;
    
    /**
     * Callback for handling the result of the permission request for writing settings.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionWriteSetting;
    
    public DialogOptionMySound() {
        super();
    }
    
    /**
     * The name of the custom sound.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNameSound() {
        return null;
    }
    
    /**
     * The name of the custom sound.
     * @author AnhTTH
     */
    public final void setNameSound(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * The duration of the custom sound.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDuration() {
        return null;
    }
    
    /**
     * The duration of the custom sound.
     * @author AnhTTH
     */
    public final void setDuration(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * The path to the custom sound file.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPath() {
        return null;
    }
    
    /**
     * The path to the custom sound file.
     * @author AnhTTH
     */
    public final void setPath(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * The action to be performed when the delete option is clicked.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnClickDelete() {
        return null;
    }
    
    /**
     * The action to be performed when the delete option is clicked.
     * @author AnhTTH
     */
    public final void setOnClickDelete(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> p0) {
    }
    
    /**
     * The ID of the custom sound.
     * @author AnhTTH
     */
    public final long getId() {
        return 0L;
    }
    
    /**
     * The ID of the custom sound.
     * @author AnhTTH
     */
    public final void setId(long p0) {
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    /**
     * Initializes the data for the dialog.
     * @author AnhTTH
     */
    @java.lang.Override()
    protected void onCreatedView(@org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Initializes the data displayed in the dialog.
     * Sets the name of the recorded sound, information about its duration, and enables text selection.
     * @author AnhTTH
     */
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void initData() {
    }
    
    /**
     * Initializes actions for various buttons in the dialog.
     * Sets actions for setting the sound as ringtone, alarm, or notification, and deleting the sound.
     * @author AnhTTH
     */
    private final void initAction() {
    }
}