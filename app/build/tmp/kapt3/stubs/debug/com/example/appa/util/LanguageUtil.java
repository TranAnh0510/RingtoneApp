package com.example.appa.util;

/**
 * Utility object for managing language settings.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u0004J\n\u0010\u000b\u001a\u00020\u0004*\u00020\tJ\n\u0010\f\u001a\u00020\b*\u00020\u0004J\n\u0010\r\u001a\u00020\b*\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/appa/util/LanguageUtil;", "", "()V", "KEY_LANGUAGE", "", "myLocale", "Ljava/util/Locale;", "changeLang", "", "Landroid/content/Context;", "lang", "getPreLanguage", "saveKeyLanguageToSharedPrefrerences", "setLocale", "app_debug"})
public final class LanguageUtil {
    @org.jetbrains.annotations.Nullable()
    private static java.util.Locale myLocale;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_LANGUAGE = "KEY_LANGUAGE";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.appa.util.LanguageUtil INSTANCE = null;
    
    private LanguageUtil() {
        super();
    }
    
    /**
     * Sets the locale based on the language preference stored in shared preferences.
     * @author AnhTTH
     */
    public final void setLocale(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$setLocale) {
    }
    
    /**
     * Changes the language to the specified language.
     * @param lang The language code (e.g., "en" for English, "fr" for French).
     * @author AnhTTH
     */
    public final void changeLang(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$changeLang, @org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
    }
    
    /**
     * Retrieves the previously set language from shared preferences.
     * @return The previously set language, defaulting to "en" (English) if not found.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPreLanguage(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getPreLanguage) {
        return null;
    }
    
    /**
     * Saves the language preference to shared preferences.
     * @author AnhTTH
     */
    public final void saveKeyLanguageToSharedPrefrerences(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$saveKeyLanguageToSharedPrefrerences) {
    }
}