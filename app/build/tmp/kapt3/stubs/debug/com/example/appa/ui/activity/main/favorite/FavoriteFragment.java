package com.example.appa.ui.activity.main.favorite;

/**
 * Fragment responsible for displaying and managing favorite items.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u001c\u0010!\u001a\u00020\u001c2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\b\u0010&\u001a\u00020\u001cH\u0016J\u0010\u0010\'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)H\u0007J\b\u0010*\u001a\u00020\u001cH\u0016J\b\u0010+\u001a\u00020\u001cH\u0014J\b\u0010,\u001a\u00020\u001cH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/example/appa/ui/activity/main/favorite/FavoriteFragment;", "Lcom/example/appa/ui/base/BaseBindingFragment;", "Lcom/example/appa/databinding/FragmentFavoriteBinding;", "Lcom/example/appa/ui/activity/main/favorite/FavoriteVM;", "()V", "dialogDeniedExternalStorage", "Lcom/example/appa/ui/dialog/DialogDeniedExternalStorage;", "getDialogDeniedExternalStorage", "()Lcom/example/appa/ui/dialog/DialogDeniedExternalStorage;", "dialogDeniedExternalStorage$delegate", "Lkotlin/Lazy;", "dialogLoading", "Lcom/example/appa/ui/dialog/DialogLoading;", "dialogOptionFavorite", "Lcom/example/appa/ui/dialog/DialogOptionFavorite;", "favoriteAdapter", "Lcom/example/appa/ui/adapter/recyclerview/FavoritesAdapter;", "layoutId", "", "getLayoutId", "()I", "requestPermissionExternalStorage", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "getViewModel", "Ljava/lang/Class;", "initAction", "", "initAdapterAndDialog", "onAttach", "context", "Landroid/content/Context;", "onCreatedView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDetach", "onEvent", "messageEvent", "Lcom/example/appa/common/MessageEvent;", "onResume", "registerOnBackPress", "setupData", "app_debug"})
public final class FavoriteFragment extends com.example.appa.ui.base.BaseBindingFragment<com.example.appa.databinding.FragmentFavoriteBinding, com.example.appa.ui.activity.main.favorite.FavoriteVM> {
    @org.jetbrains.annotations.Nullable()
    private com.example.appa.ui.adapter.recyclerview.FavoritesAdapter favoriteAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.example.appa.ui.dialog.DialogOptionFavorite dialogOptionFavorite;
    @org.jetbrains.annotations.Nullable()
    private com.example.appa.ui.dialog.DialogLoading dialogLoading;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dialogDeniedExternalStorage$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionExternalStorage;
    
    public FavoriteFragment() {
        super();
    }
    
    private final com.example.appa.ui.dialog.DialogDeniedExternalStorage getDialogDeniedExternalStorage() {
        return null;
    }
    
    /**
     * Returns the class type of the ViewModel.
     *
     * @return The [FavoriteVM] class type.
     */
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected java.lang.Class<com.example.appa.ui.activity.main.favorite.FavoriteVM> getViewModel() {
        return null;
    }
    
    /**
     * Registers the back press action for this fragment.
     */
    @java.lang.Override()
    protected void registerOnBackPress() {
    }
    
    /**
     * Called when the view is created.
     *
     * @param view The view of the fragment.
     * @param savedInstanceState The saved instance state bundle.
     */
    @java.lang.Override()
    protected void onCreatedView(@org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Initializes the adapter and dialog components.
     */
    private final void initAdapterAndDialog() {
    }
    
    /**
     * Initializes actions for the view components.
     */
    private final void initAction() {
    }
    
    /**
     * Sets up the data for the ViewModel.
     */
    private final void setupData() {
    }
    
    /**
     * Called when the fragment is visible to the user and actively running.
     * Dismisses the denied external storage permission dialog if the read external storage permission is granted.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void onResume() {
    }
    
    /**
     * Receives and handles message events posted by EventBus.
     * Updates the list of favorite items or the path download for favorite items based on the event type.
     * @param messageEvent The message event received from EventBus.
     * @author AnhTTH
     */
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.example.appa.common.MessageEvent messageEvent) {
    }
    
    /**
     * Called when the fragment is first attached to its context.
     * Registers this fragment as an event subscriber to EventBus.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * Called when the fragment is no longer attached to its context.
     * Unregisters this fragment as an event subscriber from EventBus.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void onDetach() {
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
}