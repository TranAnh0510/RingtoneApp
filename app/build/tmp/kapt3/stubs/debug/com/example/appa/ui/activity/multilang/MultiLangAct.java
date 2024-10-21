package com.example.appa.ui.activity.multilang;

/**
 * Activity for managing multiple languages.
 * Extends [BaseBindingActivity] to utilize data binding and ViewModel.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/appa/ui/activity/multilang/MultiLangAct;", "Lcom/example/appa/ui/base/BaseBindingActivity;", "Lcom/example/appa/databinding/ActivityMultiLangBinding;", "Lcom/example/appa/ui/activity/multilang/MultiLangVM;", "()V", "code", "", "currentPosLanguage", "", "layoutId", "getLayoutId", "()I", "multiLangAdapter", "Lcom/example/appa/ui/adapter/recyclerview/MultiLangAdapter;", "getMultiLangAdapter", "()Lcom/example/appa/ui/adapter/recyclerview/MultiLangAdapter;", "multiLangAdapter$delegate", "Lkotlin/Lazy;", "oldCode", "type", "getViewModel", "Ljava/lang/Class;", "setupData", "", "setupView", "savedInstanceState", "Landroid/os/Bundle;", "updateUIForType", "app_debug"})
public final class MultiLangAct extends com.example.appa.ui.base.BaseBindingActivity<com.example.appa.databinding.ActivityMultiLangBinding, com.example.appa.ui.activity.multilang.MultiLangVM> {
    private int type = 0;
    private int currentPosLanguage = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String oldCode = "en";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String code = "";
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy multiLangAdapter$delegate = null;
    
    public MultiLangAct() {
        super();
    }
    
    private final com.example.appa.ui.adapter.recyclerview.MultiLangAdapter getMultiLangAdapter() {
        return null;
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
    public java.lang.Class<com.example.appa.ui.activity.multilang.MultiLangVM> getViewModel() {
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
     * setup Data from repository and observe the changes in LanguageLiveData
     * when data change, updates the language list for the adapter
     * determine the current position of language selected
     * @author AnhTTH
     */
    @java.lang.Override()
    public void setupData() {
    }
    
    /**
     * update UI for type
     * @author AnhTTH
     */
    private final void updateUIForType(int type) {
    }
}