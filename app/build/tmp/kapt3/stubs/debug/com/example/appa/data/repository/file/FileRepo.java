package com.example.appa.data.repository.file;

/**
 * Interface for a file repository providing methods to retrieve duration and path from a given URI.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\n"}, d2 = {"Lcom/example/appa/data/repository/file/FileRepo;", "", "getDurationFromUri", "", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "getPathFromUri", "", "app_debug"})
public abstract interface FileRepo {
    
    /**
     * Retrieves the duration of the media file corresponding to the provided URI.
     * @param context The context of the application.
     * @param uri The URI of the media file.
     * @return The duration of the media file in milliseconds.
     * @author AnhTTH
     */
    public abstract long getDurationFromUri(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri);
    
    /**
     * Retrieves the file path corresponding to the provided URI.
     * @param context The context of the application.
     * @param uri The URI of the file.
     * @return The file path.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getPathFromUri(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri);
}