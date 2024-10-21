package com.example.appa.util.extension;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0006\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\t\u001a\n\u0010\n\u001a\u00020\b*\u00020\t\u001a\n\u0010\u000b\u001a\u00020\b*\u00020\t\u001a\n\u0010\f\u001a\u00020\r*\u00020\t\u00a8\u0006\u000e"}, d2 = {"isAtLeastSdkVersion", "", "versionCode", "", "isSamsungDeviceBelowAndroid10", "getHeightStatusBar", "Landroid/content/Context;", "hideSystemUI", "", "Landroid/app/Activity;", "lockPortraitOrientation", "setFullScreen", "startSetting", "Landroid/content/Intent;", "app_debug"})
public final class SettingExtentionKt {
    
    /**
     * Set up unknown screen rotation mode (UNSPECIFIED) for Samsung devices running Android versions below 10.
     * @author AnhTTH
     */
    public static final void lockPortraitOrientation(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$lockPortraitOrientation) {
    }
    
    /**
     * Check if the device is from Samsung and runs Android version below 10.
     * @author AnhTTH
     */
    public static final boolean isSamsungDeviceBelowAndroid10() {
        return false;
    }
    
    /**
     * Opens the application details settings page itself
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public static final android.content.Intent startSetting(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$startSetting) {
        return null;
    }
    
    /**
     * Set full screen mode for Activity
     * @author AnhTTH
     */
    public static final void setFullScreen(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$setFullScreen) {
    }
    
    /**
     * get the height ò status bar
     * @author AnhTTH
     */
    public static final int getHeightStatusBar(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getHeightStatusBar) {
        return 0;
    }
    
    /**
     * Check if the device's current SDK version is greater than or equal to a specific version
     * @author AnhTTH
     */
    public static final boolean isAtLeastSdkVersion(int versionCode) {
        return false;
    }
    
    /**
     * Hides the system UI (status bar and navigation bar) and makes the content appear fullscreen.
     * This method sets the system UI visibility flags to achieve immersive mode.
     * @author AnhTTH
     */
    public static final void hideSystemUI(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$hideSystemUI) {
    }
}