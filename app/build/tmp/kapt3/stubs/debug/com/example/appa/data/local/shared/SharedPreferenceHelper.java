package com.example.appa.data.local.shared;

/**
 * Helper class for managing shared preferences.
 * This class provides methods for storing and retrieving string, integer, and boolean values in shared preferences.
 * An instance of this class is injected with a {@link SharedPreferences} instance.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0006"}, d2 = {"Lcom/example/appa/data/local/shared/SharedPreferenceHelper;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "Companion", "app_debug"})
public final class SharedPreferenceHelper {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DEFAULT_STRING = "";
    public static android.content.SharedPreferences sharedPreferences;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.appa.data.local.shared.SharedPreferenceHelper.Companion Companion = null;
    
    @javax.inject.Inject()
    public SharedPreferenceHelper(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\fJ\u0010\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010H\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u0015\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u0018\u0010\u0016\u001a\u00020\u00172\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\fJ\u001f\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\u00172\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/example/appa/data/local/shared/SharedPreferenceHelper$Companion;", "", "()V", "DEFAULT_STRING", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "getBoolean", "", "key", "default", "getEditor", "Landroid/content/SharedPreferences$Editor;", "kotlin.jvm.PlatformType", "getInt", "", "getString", "getStringWithDefault", "storeBoolean", "", "value", "storeInt", "(Ljava/lang/String;I)Lkotlin/Unit;", "storeString", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.SharedPreferences getSharedPreferences() {
            return null;
        }
        
        public final void setSharedPreferences(@org.jetbrains.annotations.NotNull()
        android.content.SharedPreferences p0) {
        }
        
        private final android.content.SharedPreferences.Editor getEditor() {
            return null;
        }
        
        public final void storeString(@org.jetbrains.annotations.Nullable()
        java.lang.String key, @org.jetbrains.annotations.Nullable()
        java.lang.String value) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getString(@org.jetbrains.annotations.Nullable()
        java.lang.String key) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getStringWithDefault(@org.jetbrains.annotations.Nullable()
        java.lang.String key, @org.jetbrains.annotations.NotNull()
        java.lang.String p1_772401952) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.Unit storeInt(@org.jetbrains.annotations.Nullable()
        java.lang.String key, int value) {
            return null;
        }
        
        public final int getInt(@org.jetbrains.annotations.Nullable()
        java.lang.String key, int p1_772401952) {
            return 0;
        }
        
        public final void storeBoolean(@org.jetbrains.annotations.Nullable()
        java.lang.String key, boolean value) {
        }
        
        public final boolean getBoolean(@org.jetbrains.annotations.Nullable()
        java.lang.String key, boolean p1_772401952) {
            return false;
        }
    }
}