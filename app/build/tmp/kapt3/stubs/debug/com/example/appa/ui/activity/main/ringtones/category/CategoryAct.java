package com.example.appa.ui.activity.main.ringtones.category;

/**
 * Activity class for managing the category-related UI and interactions.
 * This activity handles loading dialogs, permission requests, and interactions
 * with category items such as playing sounds, setting ringtones, and managing favorites.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030#H\u0016J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0002J\b\u0010\'\u001a\u00020%H\u0002J\b\u0010(\u001a\u00020%H\u0014J\b\u0010)\u001a\u00020%H\u0014J\b\u0010*\u001a\u00020%H\u0016J\u0012\u0010+\u001a\u00020%2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010 0 0\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/example/appa/ui/activity/main/ringtones/category/CategoryAct;", "Lcom/example/appa/ui/base/BaseBindingActivity;", "Lcom/example/appa/databinding/ActivityCategoryBinding;", "Lcom/example/appa/ui/activity/main/ringtones/category/CategoryVM;", "()V", "categoryDetailAdapter", "Lcom/example/appa/ui/adapter/recyclerview/CategoryDetailAdapter;", "getCategoryDetailAdapter", "()Lcom/example/appa/ui/adapter/recyclerview/CategoryDetailAdapter;", "categoryDetailAdapter$delegate", "Lkotlin/Lazy;", "dialogDeniedExternalStorage", "Lcom/example/appa/ui/dialog/DialogDeniedExternalStorage;", "getDialogDeniedExternalStorage", "()Lcom/example/appa/ui/dialog/DialogDeniedExternalStorage;", "dialogDeniedExternalStorage$delegate", "dialogLoading", "Lcom/example/appa/ui/dialog/DialogLoading;", "getDialogLoading", "()Lcom/example/appa/ui/dialog/DialogLoading;", "dialogLoading$delegate", "dialogOptionCategory", "Lcom/example/appa/ui/dialog/DialogOptionCategory;", "getDialogOptionCategory", "()Lcom/example/appa/ui/dialog/DialogOptionCategory;", "dialogOptionCategory$delegate", "layoutId", "", "getLayoutId", "()I", "requestPermissionExternalStorage", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "getViewModel", "Ljava/lang/Class;", "initAction", "", "initObserve", "initView", "onDestroy", "onResume", "setupData", "setupView", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class CategoryAct extends com.example.appa.ui.base.BaseBindingActivity<com.example.appa.databinding.ActivityCategoryBinding, com.example.appa.ui.activity.main.ringtones.category.CategoryVM> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dialogLoading$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dialogDeniedExternalStorage$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionExternalStorage;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dialogOptionCategory$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy categoryDetailAdapter$delegate = null;
    
    public CategoryAct() {
        super();
    }
    
    private final com.example.appa.ui.dialog.DialogLoading getDialogLoading() {
        return null;
    }
    
    private final com.example.appa.ui.dialog.DialogDeniedExternalStorage getDialogDeniedExternalStorage() {
        return null;
    }
    
    private final com.example.appa.ui.dialog.DialogOptionCategory getDialogOptionCategory() {
        return null;
    }
    
    private final com.example.appa.ui.adapter.recyclerview.CategoryDetailAdapter getCategoryDetailAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    /**
     * Provides the ViewModel class associated with this activity.
     * @return The ViewModel class, which is `CategoryVM::class.java`.
     * @author AnhTTH
     */
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.Class<com.example.appa.ui.activity.main.ringtones.category.CategoryVM> getViewModel() {
        return null;
    }
    
    /**
     * Sets up the view for this activity. This includes setting the activity
     * to full screen, adjusting the margin for the status bar, and initializing
     * the view and actions.
     * @param savedInstanceState The saved instance state of the activity, if any.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void setupView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Initializes the view components of this activity. This method sets the title
     * of the activity based on the category name passed through the intent.
     * @author AnhTTH
     */
    private final void initView() {
    }
    
    /**
     * Called when the activity is resumed. Checks if the read external storage permission
     * is granted, and if the dialog indicating denial of this permission is currently shown,
     * it dismisses the dialog.
     * @author AnhTTH
     */
    @java.lang.Override()
    protected void onResume() {
    }
    
    /**
     * Sets up data observers and other data-related initializations.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void setupData() {
    }
    
    /**
     * Called when the activity is destroyed. Releases the media player resources.
     * @author AnhTTH
     */
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    /**
     * Initializes observers for the ViewModel. Fetches the category data based on the category name
     * passed through the intent and observes the live data for changes. Updates the adapter's data
     * when changes are observed.
     * @author AnhTTH
     */
    private final void initAction() {
    }
    
    /**
     * Initializes observers for the ViewModel. This method retrieves the category name
     * from the intent, fetches the category data using the ViewModel, and sets up an observer
     * on the `categoryLiveData` to update the adapter's data when changes are observed.
     * @author AnhTTH
     */
    private final void initObserve() {
    }
}