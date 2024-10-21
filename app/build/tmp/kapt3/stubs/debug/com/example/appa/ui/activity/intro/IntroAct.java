package com.example.appa.ui.activity.intro;

/**
 * Activity for displaying the introductory screens.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0012\u0010\u0014\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/example/appa/ui/activity/intro/IntroAct;", "Lcom/example/appa/ui/base/BaseBindingActivity;", "Lcom/example/appa/databinding/ActivityIntroBinding;", "Lcom/example/appa/ui/activity/intro/IntroVM;", "()V", "introAdapter", "Lcom/example/appa/ui/adapter/viewpager/IntroAdapter;", "getIntroAdapter", "()Lcom/example/appa/ui/adapter/viewpager/IntroAdapter;", "introAdapter$delegate", "Lkotlin/Lazy;", "layoutId", "", "getLayoutId", "()I", "getViewModel", "Ljava/lang/Class;", "initAction", "", "setupData", "setupView", "savedInstanceState", "Landroid/os/Bundle;", "setupViewPager", "app_debug"})
public final class IntroAct extends com.example.appa.ui.base.BaseBindingActivity<com.example.appa.databinding.ActivityIntroBinding, com.example.appa.ui.activity.intro.IntroVM> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy introAdapter$delegate = null;
    
    public IntroAct() {
        super();
    }
    
    private final com.example.appa.ui.adapter.viewpager.IntroAdapter getIntroAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    /**
     * Returns the class type of the ViewModel.
     * @return The [IntroVM] class type.
     * @author AnhTTH
     */
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.Class<com.example.appa.ui.activity.intro.IntroVM> getViewModel() {
        return null;
    }
    
    /**
     * Sets up the view components of the activity.
     * @param savedInstanceState The saved instance state bundle.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void setupView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Initializes actions for the view components.
     * @author AnhTTH
     */
    private final void initAction() {
    }
    
    /**
     * Sets up the ViewPager for displaying intro screens.
     * @author AnhTTH
     */
    private final void setupViewPager() {
    }
    
    /**
     * Sets up data for the ViewModel.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void setupData() {
    }
}