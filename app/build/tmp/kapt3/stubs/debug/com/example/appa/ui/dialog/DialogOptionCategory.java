package com.example.appa.ui.dialog;

/**
 * A dialog fragment for displaying options for a sound category.
 * This dialog allows the user to view information about a sound, such as its name and duration,
 * and provides options for actions such as adding the sound to favorites, setting it as ringtone,
 * alarm, or notification.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u00101\u001a\u00020\u001cH\u0002J\b\u00102\u001a\u00020\u001cH\u0003J\u001c\u00103\u001a\u00020\u001c2\b\u00104\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u000107H\u0014J\u001e\u00108\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u00109\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR,\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R&\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001c0\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R&\u0010(\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001c0\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010%\"\u0004\b*\u0010\'R&\u0010+\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001c0\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010%\"\u0004\b-\u0010\'R\u001c\u0010.\u001a\u0010\u0012\f\u0012\n 0*\u0004\u0018\u00010\u00050\u00050/X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lcom/example/appa/ui/dialog/DialogOptionCategory;", "Lcom/example/appa/ui/base/BaseBindingBottomSheetDialogFragment;", "Lcom/example/appa/databinding/DialogOptionCategoryBinding;", "()V", "duration", "", "getDuration", "()Ljava/lang/String;", "setDuration", "(Ljava/lang/String;)V", "isFavorite", "", "()Z", "setFavorite", "(Z)V", "itemFavoriteUI", "Lcom/example/appa/data/model/ItemFavoriteUI;", "layoutId", "", "getLayoutId", "()I", "musicServerUI", "Lcom/example/appa/data/model/musicserver/MusicServerUI;", "nameSound", "getNameSound", "setNameSound", "onClickAddToFavorite", "Lkotlin/Function2;", "", "getOnClickAddToFavorite", "()Lkotlin/jvm/functions/Function2;", "setOnClickAddToFavorite", "(Lkotlin/jvm/functions/Function2;)V", "onClickSetAlarm", "Lkotlin/Function1;", "Lcom/example/appa/data/model/ItemRecent;", "getOnClickSetAlarm", "()Lkotlin/jvm/functions/Function1;", "setOnClickSetAlarm", "(Lkotlin/jvm/functions/Function1;)V", "onClickSetNotification", "getOnClickSetNotification", "setOnClickSetNotification", "onClickSetRingtone", "getOnClickSetRingtone", "setOnClickSetRingtone", "requestPermissionWriteSetting", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "initAction", "initData", "onCreatedView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showDialog", "itemFavourite", "app_debug"})
public final class DialogOptionCategory extends com.example.appa.ui.base.BaseBindingBottomSheetDialogFragment<com.example.appa.databinding.DialogOptionCategoryBinding> {
    
    /**
     * The favorite item associated with the sound category.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.Nullable()
    private com.example.appa.data.model.ItemFavoriteUI itemFavoriteUI;
    
    /**
     * The music server UI item associated with the sound category.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.Nullable()
    private com.example.appa.data.model.musicserver.MusicServerUI musicServerUI;
    
    /**
     * Flag indicating whether the sound is in favorites.
     * @author AnhTTH
     */
    private boolean isFavorite = false;
    
    /**
     * The name of the sound.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String nameSound;
    
    /**
     * The duration of the sound.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String duration;
    
    /**
     * The action to be performed when adding/removing the sound from favorites.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function2<? super com.example.appa.data.model.ItemFavoriteUI, ? super java.lang.Boolean, kotlin.Unit> onClickAddToFavorite;
    
    /**
     * The action to be performed when setting the sound as ringtone.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super com.example.appa.data.model.ItemRecent, kotlin.Unit> onClickSetRingtone;
    
    /**
     * The action to be performed when setting the sound as alarm.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super com.example.appa.data.model.ItemRecent, kotlin.Unit> onClickSetAlarm;
    
    /**
     * The action to be performed when setting the sound as notification.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super com.example.appa.data.model.ItemRecent, kotlin.Unit> onClickSetNotification;
    
    /**
     * Callback for handling the result of the permission request for writing settings.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionWriteSetting;
    
    public DialogOptionCategory() {
        super();
    }
    
    /**
     * Flag indicating whether the sound is in favorites.
     * @author AnhTTH
     */
    public final boolean isFavorite() {
        return false;
    }
    
    /**
     * Flag indicating whether the sound is in favorites.
     * @author AnhTTH
     */
    public final void setFavorite(boolean p0) {
    }
    
    /**
     * The name of the sound.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNameSound() {
        return null;
    }
    
    /**
     * The name of the sound.
     * @author AnhTTH
     */
    public final void setNameSound(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * The duration of the sound.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDuration() {
        return null;
    }
    
    /**
     * The duration of the sound.
     * @author AnhTTH
     */
    public final void setDuration(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * The action to be performed when adding/removing the sound from favorites.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<com.example.appa.data.model.ItemFavoriteUI, java.lang.Boolean, kotlin.Unit> getOnClickAddToFavorite() {
        return null;
    }
    
    /**
     * The action to be performed when adding/removing the sound from favorites.
     * @author AnhTTH
     */
    public final void setOnClickAddToFavorite(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.example.appa.data.model.ItemFavoriteUI, ? super java.lang.Boolean, kotlin.Unit> p0) {
    }
    
    /**
     * The action to be performed when setting the sound as ringtone.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.example.appa.data.model.ItemRecent, kotlin.Unit> getOnClickSetRingtone() {
        return null;
    }
    
    /**
     * The action to be performed when setting the sound as ringtone.
     * @author AnhTTH
     */
    public final void setOnClickSetRingtone(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.appa.data.model.ItemRecent, kotlin.Unit> p0) {
    }
    
    /**
     * The action to be performed when setting the sound as alarm.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.example.appa.data.model.ItemRecent, kotlin.Unit> getOnClickSetAlarm() {
        return null;
    }
    
    /**
     * The action to be performed when setting the sound as alarm.
     * @author AnhTTH
     */
    public final void setOnClickSetAlarm(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.appa.data.model.ItemRecent, kotlin.Unit> p0) {
    }
    
    /**
     * The action to be performed when setting the sound as notification.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.example.appa.data.model.ItemRecent, kotlin.Unit> getOnClickSetNotification() {
        return null;
    }
    
    /**
     * The action to be performed when setting the sound as notification.
     * @author AnhTTH
     */
    public final void setOnClickSetNotification(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.appa.data.model.ItemRecent, kotlin.Unit> p0) {
    }
    
    /**
     * Shows the dialog with the specified music server UI item and favorite item.
     * @param musicServerUI The music server UI item.
     * @param itemFavorite The favorite item.
     * @param isFavorite Flag indicating whether the sound is in favorites.
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
     * Sets the category image, name of the sound, information about its duration,
     * and enables text selection. Also sets the text of the "Add to favorite" button
     * based on whether the sound is in favorites.
     * @author AnhTTH
     */
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void initData() {
    }
    
    /**
     * Initializes actions for setting options such as adding to favorites, setting as ringtone, alarm, or notification.
     * @author AnhTTH
     */
    private final void initAction() {
    }
}