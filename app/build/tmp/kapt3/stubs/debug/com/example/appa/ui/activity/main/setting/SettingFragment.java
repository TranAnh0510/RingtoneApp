package com.example.appa.ui.activity.main.setting;

/**
 * Manage settings in the application
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u001c\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0012H\u0014J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lcom/example/appa/ui/activity/main/setting/SettingFragment;", "Lcom/example/appa/ui/base/BaseBindingFragment;", "Lcom/example/appa/databinding/FragmentSettingBinding;", "Lcom/example/appa/ui/activity/main/setting/SettingViewModel;", "()V", "layoutId", "", "getLayoutId", "()I", "ratingDialog", "Lcom/example/appa/ui/dialog/DialogRate;", "getRatingDialog", "()Lcom/example/appa/ui/dialog/DialogRate;", "ratingDialog$delegate", "Lkotlin/Lazy;", "getViewModel", "Ljava/lang/Class;", "initAction", "", "onCreatedView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "registerOnBackPress", "showRate", "startMultiLanguage", "app_debug"})
public final class SettingFragment extends com.example.appa.ui.base.BaseBindingFragment<com.example.appa.databinding.FragmentSettingBinding, com.example.appa.ui.activity.main.setting.SettingViewModel> {
    
    /**
     * dialog for users to rate the application
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy ratingDialog$delegate = null;
    
    public SettingFragment() {
        super();
    }
    
    /**
     * dialog for users to rate the application
     * @author AnhTTH
     */
    private final com.example.appa.ui.dialog.DialogRate getRatingDialog() {
        return null;
    }
    
    /**
     * Returns the [Class] object that represents the [SettingViewModel] class.
     * This method is overridden from the base class [BaseFragment] to provide the appropriate ViewModel class.
     * @return The [Class] object representing the [SettingViewModel] class.
     * @author AnhTTH
     */
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected java.lang.Class<com.example.appa.ui.activity.main.setting.SettingViewModel> getViewModel() {
        return null;
    }
    
    /**
     * This method is overridden from the base class [BaseFragment] but left empty.
     * It's intended to be implemented by subclasses to handle back press events.
     * @author AnhTTH
     */
    @java.lang.Override()
    protected void registerOnBackPress() {
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    /**
     * Called when the view for the setting fragment is created.
     * This method initializes the UI components, such as showing the rate and initializing actions.
     * @param view The created view.
     * @param savedInstanceState The saved instance state, if any.
     * @author AnhTTH
     */
    @java.lang.Override()
    protected void onCreatedView(@org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Set actions for interface elements
     * @author AnhTTH
     */
    private final void initAction() {
    }
    
    /**
     * Go to MultiLanguage
     * @author AnhTTH
     */
    private final void startMultiLanguage() {
    }
    
    /**
     * Check if users have rated the app
     * @author AnhTTH
     */
    private final void showRate() {
    }
}