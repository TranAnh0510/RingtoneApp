package com.example.appa.ui.dialog;

/**
 * A dialog fragment for displaying options for a favorite item.
 * This dialog allows the user to view information about a favorite item, such as its name and duration,
 * and provides options for actions such as setting the item as ringtone, alarm, or notification.
 * @author AnhTTh
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010(\u001a\u00020\u001aH\u0002J\b\u0010)\u001a\u00020\u001aH\u0003J\u001c\u0010*\u001a\u00020\u001a2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0014J\u000e\u0010/\u001a\u00020\u001a2\u0006\u00100\u001a\u00020\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR&\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR&\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u001c\u0010%\u001a\u0010\u0012\f\u0012\n \'*\u0004\u0018\u00010\u00050\u00050&X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/example/appa/ui/dialog/DialogOptionFavorite;", "Lcom/example/appa/ui/base/BaseBindingBottomSheetDialogFragment;", "Lcom/example/appa/databinding/DialogOptionFavoriteBinding;", "()V", "duration", "", "getDuration", "()Ljava/lang/String;", "setDuration", "(Ljava/lang/String;)V", "itemFavoriteUI", "Lcom/example/appa/data/model/ItemFavoriteUI;", "getItemFavoriteUI", "()Lcom/example/appa/data/model/ItemFavoriteUI;", "setItemFavoriteUI", "(Lcom/example/appa/data/model/ItemFavoriteUI;)V", "layoutId", "", "getLayoutId", "()I", "nameSound", "getNameSound", "setNameSound", "onClickSetAlarm", "Lkotlin/Function1;", "Lcom/example/appa/data/model/ItemRecent;", "", "getOnClickSetAlarm", "()Lkotlin/jvm/functions/Function1;", "setOnClickSetAlarm", "(Lkotlin/jvm/functions/Function1;)V", "onClickSetNotification", "getOnClickSetNotification", "setOnClickSetNotification", "onClickSetRingtone", "getOnClickSetRingtone", "setOnClickSetRingtone", "requestPermissionWriteSetting", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "initAction", "initData", "onCreatedView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showDialog", "itemFavourite", "app_debug"})
public final class DialogOptionFavorite extends com.example.appa.ui.base.BaseBindingBottomSheetDialogFragment<com.example.appa.databinding.DialogOptionFavoriteBinding> {
    
    /**
     * The favorite item to be displayed in the dialog.
     * @author AnhTTh
     */
    @org.jetbrains.annotations.Nullable()
    private com.example.appa.data.model.ItemFavoriteUI itemFavoriteUI;
    
    /**
     * The name of the favorite sound.
     * @author AnhTTh
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String nameSound;
    
    /**
     * The duration of the favorite sound.
     * @author AnhTTh
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String duration;
    
    /**
     * The action to be performed when setting the item as ringtone.
     * @author AnhTTh
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super com.example.appa.data.model.ItemRecent, kotlin.Unit> onClickSetRingtone;
    
    /**
     * The action to be performed when setting the item as alarm.
     * @author AnhTTh
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super com.example.appa.data.model.ItemRecent, kotlin.Unit> onClickSetAlarm;
    
    /**
     * The action to be performed when setting the item as notification.
     * @author AnhTTh
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super com.example.appa.data.model.ItemRecent, kotlin.Unit> onClickSetNotification;
    
    /**
     * Callback for handling the result of the permission request for writing settings.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionWriteSetting;
    
    public DialogOptionFavorite() {
        super();
    }
    
    /**
     * The favorite item to be displayed in the dialog.
     * @author AnhTTh
     */
    @org.jetbrains.annotations.Nullable()
    public final com.example.appa.data.model.ItemFavoriteUI getItemFavoriteUI() {
        return null;
    }
    
    /**
     * The favorite item to be displayed in the dialog.
     * @author AnhTTh
     */
    public final void setItemFavoriteUI(@org.jetbrains.annotations.Nullable()
    com.example.appa.data.model.ItemFavoriteUI p0) {
    }
    
    /**
     * The name of the favorite sound.
     * @author AnhTTh
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNameSound() {
        return null;
    }
    
    /**
     * The name of the favorite sound.
     * @author AnhTTh
     */
    public final void setNameSound(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * The duration of the favorite sound.
     * @author AnhTTh
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDuration() {
        return null;
    }
    
    /**
     * The duration of the favorite sound.
     * @author AnhTTh
     */
    public final void setDuration(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * The action to be performed when setting the item as ringtone.
     * @author AnhTTh
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.example.appa.data.model.ItemRecent, kotlin.Unit> getOnClickSetRingtone() {
        return null;
    }
    
    /**
     * The action to be performed when setting the item as ringtone.
     * @author AnhTTh
     */
    public final void setOnClickSetRingtone(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.appa.data.model.ItemRecent, kotlin.Unit> p0) {
    }
    
    /**
     * The action to be performed when setting the item as alarm.
     * @author AnhTTh
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.example.appa.data.model.ItemRecent, kotlin.Unit> getOnClickSetAlarm() {
        return null;
    }
    
    /**
     * The action to be performed when setting the item as alarm.
     * @author AnhTTh
     */
    public final void setOnClickSetAlarm(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.appa.data.model.ItemRecent, kotlin.Unit> p0) {
    }
    
    /**
     * The action to be performed when setting the item as notification.
     * @author AnhTTh
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.example.appa.data.model.ItemRecent, kotlin.Unit> getOnClickSetNotification() {
        return null;
    }
    
    /**
     * The action to be performed when setting the item as notification.
     * @author AnhTTh
     */
    public final void setOnClickSetNotification(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.appa.data.model.ItemRecent, kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    /**
     * Initializes the data for the dialog.
     * @author AnhTTh
     */
    @java.lang.Override()
    protected void onCreatedView(@org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Shows the dialog with the specified favorite item.
     * @param itemFavorite The favorite item to be displayed.
     * @author AnhTTh
     */
    public final void showDialog(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.model.ItemFavoriteUI itemFavourite) {
    }
    
    /**
     * Initializes the data displayed in the dialog.
     * Sets the category image, name of the recorded sound, information about its duration,
     * and enables text selection.
     * @author AnhTTH
     */
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void initData() {
    }
    
    /**
     * Initializes actions for setting the favorite item as ringtone, alarm, or notification.
     * @author AnhTTH
     */
    private final void initAction() {
    }
}