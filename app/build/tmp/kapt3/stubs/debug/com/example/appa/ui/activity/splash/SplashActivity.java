package com.example.appa.ui.activity.splash;

/**
 * It sets up the view and data for the splash screen,
 * manages animations, and directs to the appropriate next screen.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\fH\u0002J\b\u0010\u0012\u001a\u00020\fH\u0002R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/example/appa/ui/activity/splash/SplashActivity;", "Lcom/example/appa/ui/base/BaseBindingActivity;", "Lcom/example/appa/databinding/ActivitySplashBinding;", "Lcom/example/appa/ui/activity/splash/SplashVM;", "()V", "layoutId", "", "getLayoutId", "()I", "getViewModel", "Ljava/lang/Class;", "openMainActivity", "", "setupData", "setupView", "savedInstanceState", "Landroid/os/Bundle;", "startIntroAct", "startMultiLangAct", "app_debug"})
public final class SplashActivity extends com.example.appa.ui.base.BaseBindingActivity<com.example.appa.databinding.ActivitySplashBinding, com.example.appa.ui.activity.splash.SplashVM> {
    
    public SplashActivity() {
        super();
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    /**
     * Returns the ViewModel class associated with this activity.
     * @return The SplashVM class.
     * @author AnhTTH
     */
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.Class<com.example.appa.ui.activity.splash.SplashVM> getViewModel() {
        return null;
    }
    
    /**
     * Sets up the view for the splash screen.
     * This method sets the screen to full screen mode and initializes the animation listener for the logo.
     * @param savedInstanceState The saved instance state bundle.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void setupView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Sets up the data for the splash screen.
     * Observes the ViewModel for the next screen type
     * and navigates to the appropriate activity based on the type.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void setupData() {
    }
    
    private final void startIntroAct() {
    }
    
    /**
     * Starts the MultiLangAct activity with the appropriate extras.
     * @author AnhTTH
     */
    private final void startMultiLangAct() {
    }
    
    /**
     * Opens the main activity by invoking the ViewModel's method to get the next screen type.
     * @author AnhTTH
     */
    private final void openMainActivity() {
    }
}