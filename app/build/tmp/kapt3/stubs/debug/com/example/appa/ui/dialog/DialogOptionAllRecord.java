package com.example.appa.ui.dialog;

/**
 * A dialog fragment for displaying options for all recorded sounds.
 * This dialog allows the user to view information about a recorded sound, such as its name, date, and duration,
 * and provides options for actions such as editing, changing name, adding to my sounds or favorites,
 * setting as ringtone, message, or notification, and deleting the sound.
 * @author AnhTTh
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u00100\u001a\u00020\u0016H\u0002J\b\u00101\u001a\u00020\u0016H\u0003J\u001c\u00102\u001a\u00020\u00162\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000106H\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR \u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001aR \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR \u0010-\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0018\"\u0004\b/\u0010\u001a\u00a8\u00067"}, d2 = {"Lcom/example/appa/ui/dialog/DialogOptionAllRecord;", "Lcom/example/appa/ui/base/BaseBindingBottomSheetDialogFragment;", "Lcom/example/appa/databinding/DialogOptionAllRecordBinding;", "()V", "date", "", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "duration", "getDuration", "setDuration", "layoutId", "", "getLayoutId", "()I", "nameSound", "getNameSound", "setNameSound", "onClickAddToFavorite", "Lkotlin/Function0;", "", "getOnClickAddToFavorite", "()Lkotlin/jvm/functions/Function0;", "setOnClickAddToFavorite", "(Lkotlin/jvm/functions/Function0;)V", "onClickAddToMySound", "getOnClickAddToMySound", "setOnClickAddToMySound", "onClickChangeName", "getOnClickChangeName", "setOnClickChangeName", "onClickDelete", "getOnClickDelete", "setOnClickDelete", "onClickEdit", "getOnClickEdit", "setOnClickEdit", "onClickSetMessage", "getOnClickSetMessage", "setOnClickSetMessage", "onClickSetNotification", "getOnClickSetNotification", "setOnClickSetNotification", "onClickSetRingtone", "getOnClickSetRingtone", "setOnClickSetRingtone", "initAction", "initData", "onCreatedView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class DialogOptionAllRecord extends com.example.appa.ui.base.BaseBindingBottomSheetDialogFragment<com.example.appa.databinding.DialogOptionAllRecordBinding> {
    
    /**
     * The name of the recorded sound.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String nameSound;
    
    /**
     * The date when the sound was recorded.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String date;
    
    /**
     * The duration of the recorded sound.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String duration;
    
    /**
     * The action to be performed when editing the recorded sound.
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onClickEdit;
    
    /**
     * The action to be performed when changing the name of the recorded sound.
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onClickChangeName;
    
    /**
     * The action to be performed when adding the recorded sound to "My Sounds".
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onClickAddToMySound;
    
    /**
     * The action to be performed when adding the recorded sound to favorites.
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onClickAddToFavorite;
    
    /**
     * The action to be performed when setting the recorded sound as ringtone.
     * AnhTTh
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onClickSetRingtone;
    
    /**
     * The action to be performed when setting the recorded sound as message tone.
     * AnhTTh
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onClickSetMessage;
    
    /**
     * The action to be performed when setting the recorded sound as notification tone.
     * AnhTTh
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onClickSetNotification;
    
    /**
     * The action to be performed when deleting the recorded sound.
     * AnhTTh
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onClickDelete;
    
    public DialogOptionAllRecord() {
        super();
    }
    
    /**
     * The name of the recorded sound.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNameSound() {
        return null;
    }
    
    /**
     * The name of the recorded sound.
     */
    public final void setNameSound(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * The date when the sound was recorded.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDate() {
        return null;
    }
    
    /**
     * The date when the sound was recorded.
     */
    public final void setDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * The duration of the recorded sound.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDuration() {
        return null;
    }
    
    /**
     * The duration of the recorded sound.
     */
    public final void setDuration(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * The action to be performed when editing the recorded sound.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClickEdit() {
        return null;
    }
    
    /**
     * The action to be performed when editing the recorded sound.
     */
    public final void setOnClickEdit(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    /**
     * The action to be performed when changing the name of the recorded sound.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClickChangeName() {
        return null;
    }
    
    /**
     * The action to be performed when changing the name of the recorded sound.
     */
    public final void setOnClickChangeName(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    /**
     * The action to be performed when adding the recorded sound to "My Sounds".
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClickAddToMySound() {
        return null;
    }
    
    /**
     * The action to be performed when adding the recorded sound to "My Sounds".
     */
    public final void setOnClickAddToMySound(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    /**
     * The action to be performed when adding the recorded sound to favorites.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClickAddToFavorite() {
        return null;
    }
    
    /**
     * The action to be performed when adding the recorded sound to favorites.
     */
    public final void setOnClickAddToFavorite(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    /**
     * The action to be performed when setting the recorded sound as ringtone.
     * AnhTTh
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClickSetRingtone() {
        return null;
    }
    
    /**
     * The action to be performed when setting the recorded sound as ringtone.
     * AnhTTh
     */
    public final void setOnClickSetRingtone(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    /**
     * The action to be performed when setting the recorded sound as message tone.
     * AnhTTh
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClickSetMessage() {
        return null;
    }
    
    /**
     * The action to be performed when setting the recorded sound as message tone.
     * AnhTTh
     */
    public final void setOnClickSetMessage(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    /**
     * The action to be performed when setting the recorded sound as notification tone.
     * AnhTTh
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClickSetNotification() {
        return null;
    }
    
    /**
     * The action to be performed when setting the recorded sound as notification tone.
     * AnhTTh
     */
    public final void setOnClickSetNotification(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    /**
     * The action to be performed when deleting the recorded sound.
     * AnhTTh
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClickDelete() {
        return null;
    }
    
    /**
     * The action to be performed when deleting the recorded sound.
     * AnhTTh
     */
    public final void setOnClickDelete(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    /**
     * Initializes the data for the dialog.
     * AnhTTh
     */
    @java.lang.Override()
    protected void onCreatedView(@org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Initializes the data displayed in the dialog.
     * Sets the name of the recorded sound, date of recording, and duration of the sound.
     * AnhTTh
     */
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void initData() {
    }
    
    /**
     * Initializes actions for various options available for the recorded sound.
     * Sets actions for editing, changing name, adding to "My Sounds", adding to favorites,
     * setting as ringtone, message tone, notification tone, and deleting the recorded sound.
     * AnhTTh
     */
    private final void initAction() {
    }
}