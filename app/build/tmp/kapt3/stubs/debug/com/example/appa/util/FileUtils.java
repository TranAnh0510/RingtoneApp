package com.example.appa.util;

/**
 * Utility object for file-related operations.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\"\u0010\u0012\u001a\u00020\u000f*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f\u00a8\u0006\u0014"}, d2 = {"Lcom/example/appa/util/FileUtils;", "", "()V", "addToMediaStore", "", "context", "Landroid/content/Context;", "file", "Ljava/io/File;", "copyFile", "inputStream", "Ljava/io/InputStream;", "outputStream", "Ljava/io/OutputStream;", "getPath", "", "uri", "Landroid/net/Uri;", "saveAudioToInternalStorage", "name", "app_debug"})
public final class FileUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.appa.util.FileUtils INSTANCE = null;
    
    private FileUtils() {
        super();
    }
    
    /**
     * Saves an audio file to internal storage and adds it to the media store.
     * @param context The context from which the method is called.
     * @param uri The URI of the audio file.
     * @param name The name of the audio file.
     * @return The absolute path of the saved audio file, or an empty string if saving fails.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String saveAudioToInternalStorage(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$saveAudioToInternalStorage, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String uri, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    /**
     * Copies data from an input stream to an output stream.
     * @param inputStream The input stream.
     * @param outputStream The output stream.
     * @author AnhTTH
     */
    private final void copyFile(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
    }
    
    /**
     * Adds the file to the media store.
     * @param context The context from which the method is called.
     * @param file The file to be added to the media store.
     * @author AnhTTH
     */
    private final void addToMediaStore(android.content.Context context, java.io.File file) {
    }
    
    /**
     * Gets the path of a file from its URI.
     * @param context The context from which the method is called.
     * @param uri The URI of the file.
     * @return The path of the file, or null if not found.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPath(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
}