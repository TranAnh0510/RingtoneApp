package com.example.appa.util.extension;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\t\u001a\u00020\n*\u00020\u0002\u00a8\u0006\u000b"}, d2 = {"checkSystemWritePermission", "", "Landroid/content/Context;", "isGrantMediaAudioPermission", "isGrantMediaVideoPermission", "isGrantPermission", "permission", "", "isGrantReadExternalStoragePermission", "openAndroidPermissionsMenu", "", "app_debug"})
public final class PermissionExtentionKt {
    
    /**
     * Checks if the specified permission is granted.
     * @param permission The permission to check.
     * @return `true` if the permission is granted, `false` otherwise.
     * @author AnhTTH
     */
    public static final boolean isGrantPermission(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isGrantPermission, @org.jetbrains.annotations.NotNull()
    java.lang.String permission) {
        return false;
    }
    
    /**
     * Check if the app has permission to read data from external storage
     * @author AnhTTH
     */
    public static final boolean isGrantReadExternalStoragePermission(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isGrantReadExternalStoragePermission) {
        return false;
    }
    
    /**
     * Check if the application has access to the video from the media spatial memory.
     * @author AnhTTH
     */
    public static final boolean isGrantMediaVideoPermission(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isGrantMediaVideoPermission) {
        return false;
    }
    
    /**
     * Check if the app has access to audio from media spatial memory
     * If the device has android version TIRAMISU or higher, access audio. If below, access external memory
     * @author AnhTTH
     */
    public static final boolean isGrantMediaAudioPermission(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isGrantMediaAudioPermission) {
        return false;
    }
    
    /**
     * Check if the app has permission to write to system settings.
     * @author AnhTTH
     */
    public static final boolean checkSystemWritePermission(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$checkSystemWritePermission) {
        return false;
    }
    
    /**
     * Open the settings menu to request write permission to system settings.
     * @author AnhTTH
     */
    public static final void openAndroidPermissionsMenu(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$openAndroidPermissionsMenu) {
    }
}