package com.example.appa.ui.adapter.viewpager;

/**
 * Manage and display Fragments in a ViewPager Setting
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006!"}, d2 = {"Lcom/example/appa/ui/adapter/viewpager/MainViewPager;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;)V", "favoriteFragment", "Lcom/example/appa/ui/activity/main/favorite/FavoriteFragment;", "getFavoriteFragment", "()Lcom/example/appa/ui/activity/main/favorite/FavoriteFragment;", "favoriteFragment$delegate", "Lkotlin/Lazy;", "mySoundFragment", "Lcom/example/appa/ui/activity/main/mysound/MySoundFragment;", "getMySoundFragment", "()Lcom/example/appa/ui/activity/main/mysound/MySoundFragment;", "mySoundFragment$delegate", "ringtonesFragment", "Lcom/example/appa/ui/activity/main/ringtones/RingtonesFragment;", "getRingtonesFragment", "()Lcom/example/appa/ui/activity/main/ringtones/RingtonesFragment;", "ringtonesFragment$delegate", "settingFragment", "Lcom/example/appa/ui/activity/main/setting/SettingFragment;", "getSettingFragment", "()Lcom/example/appa/ui/activity/main/setting/SettingFragment;", "settingFragment$delegate", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "app_debug"})
public final class MainViewPager extends androidx.viewpager2.adapter.FragmentStateAdapter {
    
    /**
     * initialize Fragments only when they are accessed for the first time
     * Optimize performance and avoid unnecessary initialization
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy ringtonesFragment$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy favoriteFragment$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mySoundFragment$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy settingFragment$delegate = null;
    
    public MainViewPager(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Lifecycle lifecycle) {
        super(null);
    }
    
    /**
     * initialize Fragments only when they are accessed for the first time
     * Optimize performance and avoid unnecessary initialization
     * @author AnhTTH
     */
    private final com.example.appa.ui.activity.main.ringtones.RingtonesFragment getRingtonesFragment() {
        return null;
    }
    
    private final com.example.appa.ui.activity.main.favorite.FavoriteFragment getFavoriteFragment() {
        return null;
    }
    
    private final com.example.appa.ui.activity.main.mysound.MySoundFragment getMySoundFragment() {
        return null;
    }
    
    private final com.example.appa.ui.activity.main.setting.SettingFragment getSettingFragment() {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    /**
     * Creates and returns Fragment corresponding to position in ViewPager2
     * @author AnhTTH
     */
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.fragment.app.Fragment createFragment(int position) {
        return null;
    }
}