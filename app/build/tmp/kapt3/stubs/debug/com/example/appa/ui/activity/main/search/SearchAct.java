package com.example.appa.ui.activity.main.search;

/**
 * Represents an activity for handling search operations.
 * This activity extends from BaseBindingActivity and uses ViewModel SearchVM.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030*H\u0016J\b\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020,H\u0002J\b\u0010.\u001a\u00020,H\u0014J\b\u0010/\u001a\u00020,H\u0014J\u0010\u00100\u001a\u00020,2\u0006\u00101\u001a\u00020\"H\u0002J\b\u00102\u001a\u00020,H\u0016J\u0012\u00103\u001a\u00020,2\b\u00104\u001a\u0004\u0018\u000105H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\"0\"0!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010\n\u001a\u0004\b&\u0010\'\u00a8\u00066"}, d2 = {"Lcom/example/appa/ui/activity/main/search/SearchAct;", "Lcom/example/appa/ui/base/BaseBindingActivity;", "Lcom/example/appa/databinding/ActivitySearchBinding;", "Lcom/example/appa/ui/activity/main/search/SearchVM;", "()V", "dialogDeniedExternalStorage", "Lcom/example/appa/ui/dialog/DialogDeniedExternalStorage;", "getDialogDeniedExternalStorage", "()Lcom/example/appa/ui/dialog/DialogDeniedExternalStorage;", "dialogDeniedExternalStorage$delegate", "Lkotlin/Lazy;", "dialogLoading", "Lcom/example/appa/ui/dialog/DialogLoading;", "getDialogLoading", "()Lcom/example/appa/ui/dialog/DialogLoading;", "dialogLoading$delegate", "dialogOptionSearch", "Lcom/example/appa/ui/dialog/DialogOptionSearch;", "getDialogOptionSearch", "()Lcom/example/appa/ui/dialog/DialogOptionSearch;", "dialogOptionSearch$delegate", "isSearchWithEdt", "", "layoutId", "", "getLayoutId", "()I", "recommendAdapter", "Lcom/example/appa/ui/adapter/recyclerview/RecommendAdapter;", "getRecommendAdapter", "()Lcom/example/appa/ui/adapter/recyclerview/RecommendAdapter;", "recommendAdapter$delegate", "requestPermissionExternalStorage", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "searchDetailAdapter", "Lcom/example/appa/ui/adapter/recyclerview/SearchDetailAdapter;", "getSearchDetailAdapter", "()Lcom/example/appa/ui/adapter/recyclerview/SearchDetailAdapter;", "searchDetailAdapter$delegate", "getViewModel", "Ljava/lang/Class;", "initAction", "", "initObserve", "onDestroy", "onResume", "searchMusic", "query", "setupData", "setupView", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class SearchAct extends com.example.appa.ui.base.BaseBindingActivity<com.example.appa.databinding.ActivitySearchBinding, com.example.appa.ui.activity.main.search.SearchVM> {
    private boolean isSearchWithEdt = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dialogLoading$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dialogDeniedExternalStorage$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionExternalStorage;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dialogOptionSearch$delegate = null;
    
    /**
     * Lazy-loaded instance of RecommendAdapter.
     * This adapter handles the recommendation list and its item click events.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy recommendAdapter$delegate = null;
    
    /**
     * Lazy-loaded instance of SearchDetailAdapter.
     * This adapter handles the detailed search results and its item click events.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy searchDetailAdapter$delegate = null;
    
    public SearchAct() {
        super();
    }
    
    private final com.example.appa.ui.dialog.DialogLoading getDialogLoading() {
        return null;
    }
    
    private final com.example.appa.ui.dialog.DialogDeniedExternalStorage getDialogDeniedExternalStorage() {
        return null;
    }
    
    private final com.example.appa.ui.dialog.DialogOptionSearch getDialogOptionSearch() {
        return null;
    }
    
    /**
     * Lazy-loaded instance of RecommendAdapter.
     * This adapter handles the recommendation list and its item click events.
     * @author AnhTTH
     */
    private final com.example.appa.ui.adapter.recyclerview.RecommendAdapter getRecommendAdapter() {
        return null;
    }
    
    /**
     * Lazy-loaded instance of SearchDetailAdapter.
     * This adapter handles the detailed search results and its item click events.
     * @author AnhTTH
     */
    private final com.example.appa.ui.adapter.recyclerview.SearchDetailAdapter getSearchDetailAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    /**
     * Returns the ViewModel class for this activity.
     * @author AnhTTH
     */
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.Class<com.example.appa.ui.activity.main.search.SearchVM> getViewModel() {
        return null;
    }
    
    /**
     * Sets up the view and initializes the UI components.
     * @param savedInstanceState The saved instance state.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void setupView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Sets up the data and initializes observers.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void setupData() {
    }
    
    /**
     * Called when the activity is resumed.
     * @author AnhTTH
     */
    @java.lang.Override()
    protected void onResume() {
    }
    
    /**
     * Called when the activity is destroyed.
     * @author AnhTTH
     */
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    /**
     * Initializes observers for LiveData.
     * @author AnhTTH
     */
    private final void initObserve() {
    }
    
    /**
     * Initializes actions and event listeners.
     * @author AnhTTH
     */
    private final void initAction() {
    }
    
    /**
     * Searches for music based on the query.
     * @author AnhTTH
     * @param query The search query.
     */
    private final void searchMusic(java.lang.String query) {
    }
}