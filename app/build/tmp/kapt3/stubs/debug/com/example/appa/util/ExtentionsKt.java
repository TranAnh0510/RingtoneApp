package com.example.appa.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\'\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\r\u00a2\u0006\u0002\u0010\u000e\u001a\n\u0010\u000f\u001a\u00020\n*\u00020\u0001\u001a\n\u0010\u0010\u001a\u00020\b*\u00020\r\u001a\n\u0010\u0011\u001a\u00020\u0003*\u00020\u0001\u001a\n\u0010\u0012\u001a\u00020\u0003*\u00020\u0001\u001a\u0012\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015\u001a\u0012\u0010\u0016\u001a\u00020\b*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0001\u001a\n\u0010\u0018\u001a\u00020\b*\u00020\u0019\u001a\n\u0010\u001a\u001a\u00020\b*\u00020\r\u001a\u0012\u0010\u001b\u001a\u00020\b*\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d\u00a8\u0006\u001e"}, d2 = {"checkTime", "", "time", "", "getDuration", "mi", "", "setVisibility", "", "isVisible", "", "views", "", "Landroid/view/View;", "(Z[Landroid/view/View;)V", "containsNonAllowedCharacters", "hide", "setAvatar", "setImageCategory", "setNameCategory", "context", "Landroid/content/Context;", "shareApp", "name", "shareAppLink", "Landroid/app/Activity;", "show", "showSoftKeyboardEdt", "edt", "Landroid/widget/EditText;", "app_debug"})
public final class ExtentionsKt {
    
    /**
     * Converts milliseconds to a readable duration format.
     * @param mi The duration in milliseconds.
     * @return The duration in the format "HH:MM:SS" or "MM:SS" if less than an hour.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getDuration(long mi) {
        return null;
    }
    
    private static final java.lang.String checkTime(int time) {
        return null;
    }
    
    /**
     * Shares the app via email.
     * @param name The name of the app.
     * @author AnhTTH
     */
    public static final void shareApp(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$shareApp, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    /**
     * Shares the app via a link.
     * @author AnhTTH
     */
    public static final void shareAppLink(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$shareAppLink) {
    }
    
    /**
     * Sets the avatar image based on the language code.
     * @return The resource ID of the avatar image.
     * @author AnhTTH
     */
    public static final int setAvatar(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$setAvatar) {
        return 0;
    }
    
    /**
     * Sets the image category based on the category name.
     * @return The resource ID of the category image.
     * @author AnhTTH
     */
    public static final int setImageCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$setImageCategory) {
        return 0;
    }
    
    /**
     * Sets the localized category name based on the category name.
     * @param context The context used for localization.
     * @return The localized category name.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String setNameCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$setNameCategory, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Shows the soft keyboard for the specified EditText.
     * @param edt The EditText for which to show the soft keyboard.
     * @author AnhTTH
     */
    public static final void showSoftKeyboardEdt(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$showSoftKeyboardEdt, @org.jetbrains.annotations.NotNull()
    android.widget.EditText edt) {
    }
    
    /**
     * Shows the view.
     * @author AnhTTH
     */
    public static final void show(@org.jetbrains.annotations.NotNull()
    android.view.View $this$show) {
    }
    
    /**
     * Hides the view.
     * @author AnhTTH
     */
    public static final void hide(@org.jetbrains.annotations.NotNull()
    android.view.View $this$hide) {
    }
    
    /**
     * Sets the visibility of multiple views.
     * @param isVisible Whether the views should be visible.
     * @param views The views to set the visibility for.
     * @author AnhTTH
     */
    public static final void setVisibility(boolean isVisible, @org.jetbrains.annotations.NotNull()
    android.view.View... views) {
    }
    
    /**
     * Checks if the string contains non-allowed characters.
     * @return True if the string contains non-allowed characters, otherwise false.
     * @author AnhTTH
     */
    public static final boolean containsNonAllowedCharacters(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$containsNonAllowedCharacters) {
        return false;
    }
}