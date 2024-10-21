package com.example.appa.ui.dialog;

/**
 * DialogOptionSearch is a Bottom Sheet Dialog Fragment that provides various options for the selected music item,
 * such as adding to favorites, setting as ringtone, alarm, or notification sound.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u00105\u001a\u00020 H\u0002J\b\u00106\u001a\u00020 H\u0003J\u001c\u00107\u001a\u00020 2\b\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010;H\u0014J\u001e\u0010<\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\tR,\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020 0\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020 0&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R&\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020 0&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R&\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020 0&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010)\"\u0004\b1\u0010+R\u001c\u00102\u001a\u0010\u0012\f\u0012\n 4*\u0004\u0018\u00010\u00050\u000503X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006>"}, d2 = {"Lcom/example/appa/ui/dialog/DialogOptionSearch;", "Lcom/example/appa/ui/base/BaseBindingBottomSheetDialogFragment;", "Lcom/example/appa/databinding/DialogOptionSearchBinding;", "()V", "duration", "", "getDuration", "()Ljava/lang/String;", "setDuration", "(Ljava/lang/String;)V", "isFavorite", "", "()Z", "setFavorite", "(Z)V", "itemFavoriteUI", "Lcom/example/appa/data/model/ItemFavoriteUI;", "getItemFavoriteUI", "()Lcom/example/appa/data/model/ItemFavoriteUI;", "setItemFavoriteUI", "(Lcom/example/appa/data/model/ItemFavoriteUI;)V", "layoutId", "", "getLayoutId", "()I", "musicServerUI", "Lcom/example/appa/data/model/musicserver/MusicServerUI;", "nameSound", "getNameSound", "setNameSound", "onClickAddToFavorite", "Lkotlin/Function2;", "", "getOnClickAddToFavorite", "()Lkotlin/jvm/functions/Function2;", "setOnClickAddToFavorite", "(Lkotlin/jvm/functions/Function2;)V", "onClickSetAlarm", "Lkotlin/Function1;", "Lcom/example/appa/data/model/ItemRecent;", "getOnClickSetAlarm", "()Lkotlin/jvm/functions/Function1;", "setOnClickSetAlarm", "(Lkotlin/jvm/functions/Function1;)V", "onClickSetNotification", "getOnClickSetNotification", "setOnClickSetNotification", "onClickSetRingtone", "getOnClickSetRingtone", "setOnClickSetRingtone", "requestPermissionWriteSetting", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "initAction", "initData", "onCreatedView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showDialog", "itemFavourite", "app_debug"})
public final class DialogOptionSearch extends com.example.appa.ui.base.BaseBindingBottomSheetDialogFragment<com.example.appa.databinding.DialogOptionSearchBinding> {
    
    /**
     * Represents the favorite item UI
     * @author AnhTTH
     */
    @org.jetbrains.annotations.Nullable()
    private com.example.appa.data.model.ItemFavoriteUI itemFavoriteUI;
    
    /**
     * Represents the music server UI
     */
    @org.jetbrains.annotations.Nullable()
    private com.example.appa.data.model.musicserver.MusicServerUI musicServerUI;
    
    /**
     * Indicates whether the item is a favorite
     */
    private boolean isFavorite = false;
    
    /**
     * The name of the sound
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String nameSound;
    
    /**
     * The duration of the sound
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String duration;
    
    /**
     * Callback function when adding to favorite is clicked.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function2<? super com.example.appa.data.model.ItemFavoriteUI, ? super java.lang.Boolean, kotlin.Unit> onClickAddToFavorite;
    
    /**
     * Callback function when setting as ringtone is clicked.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super com.example.appa.data.model.ItemRecent, kotlin.Unit> onClickSetRingtone;
    
    /**
     * Callback function when setting as alarm is clicked.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super com.example.appa.data.model.ItemRecent, kotlin.Unit> onClickSetAlarm;
    
    /**
     * Callback function when setting as notification is clicked.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super com.example.appa.data.model.ItemRecent, kotlin.Unit> onClickSetNotification;
    
    /**
     * Requests permission to write settings, and handles the result.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionWriteSetting;
    
    public DialogOptionSearch() {
        super();
    }
    
    /**
     * Represents the favorite item UI
     * @author AnhTTH
     */
    @org.jetbrains.annotations.Nullable()
    public final com.example.appa.data.model.ItemFavoriteUI getItemFavoriteUI() {
        return null;
    }
    
    /**
     * Represents the favorite item UI
     * @author AnhTTH
     */
    public final void setItemFavoriteUI(@org.jetbrains.annotations.Nullable()
    com.example.appa.data.model.ItemFavoriteUI p0) {
    }
    
    /**
     * Indicates whether the item is a favorite
     */
    public final boolean isFavorite() {
        return false;
    }
    
    /**
     * Indicates whether the item is a favorite
     */
    public final void setFavorite(boolean p0) {
    }
    
    /**
     * The name of the sound
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNameSound() {
        return null;
    }
    
    /**
     * The name of the sound
     */
    public final void setNameSound(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * The duration of the sound
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDuration() {
        return null;
    }
    
    /**
     * The duration of the sound
     */
    public final void setDuration(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * Callback function when adding to favorite is clicked.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<com.example.appa.data.model.ItemFavoriteUI, java.lang.Boolean, kotlin.Unit> getOnClickAddToFavorite() {
        return null;
    }
    
    /**
     * Callback function when adding to favorite is clicked.
     * @author AnhTTH
     */
    public final void setOnClickAddToFavorite(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.example.appa.data.model.ItemFavoriteUI, ? super java.lang.Boolean, kotlin.Unit> p0) {
    }
    
    /**
     * Callback function when setting as ringtone is clicked.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.example.appa.data.model.ItemRecent, kotlin.Unit> getOnClickSetRingtone() {
        return null;
    }
    
    /**
     * Callback function when setting as ringtone is clicked.
     * @author AnhTTH
     */
    public final void setOnClickSetRingtone(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.appa.data.model.ItemRecent, kotlin.Unit> p0) {
    }
    
    /**
     * Callback function when setting as alarm is clicked.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.example.appa.data.model.ItemRecent, kotlin.Unit> getOnClickSetAlarm() {
        return null;
    }
    
    /**
     * Callback function when setting as alarm is clicked.
     * @author AnhTTH
     */
    public final void setOnClickSetAlarm(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.appa.data.model.ItemRecent, kotlin.Unit> p0) {
    }
    
    /**
     * Callback function when setting as notification is clicked.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.example.appa.data.model.ItemRecent, kotlin.Unit> getOnClickSetNotification() {
        return null;
    }
    
    /**
     * Callback function when setting as notification is clicked.
     * @author AnhTTH
     */
    public final void setOnClickSetNotification(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.appa.data.model.ItemRecent, kotlin.Unit> p0) {
    }
    
    /**
     * Shows the dialog with the provided music server UI, favorite item, and favorite status.
     * @param musicServerUI the music server UI
     * @param itemFavourite the favorite item
     * @param isFavorite whether the item is favorite
     * @author AnhTTH
     */
    public final void showDialog(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.model.musicserver.MusicServerUI musicServerUI, @org.jetbrains.annotations.NotNull()
    com.example.appa.data.model.ItemFavoriteUI itemFavourite, boolean isFavorite) {
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    /**
     * Called when the view is created. Initializes data and actions.
     * @param view the view
     * @param savedInstanceState the saved instance state
     * @author AnhTTH
     */
    @java.lang.Override()
    protected void onCreatedView(@org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Initializes the data for the dialog view, setting up the UI elements with the appropriate information.
     * @author AnhTTH
     */
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void initData() {
    }
    
    /**
     * Initializes the actions for the dialog view, setting up click listeners for various buttons.
     * @author AnhTTH
     */
    private final void initAction() {
    }
}