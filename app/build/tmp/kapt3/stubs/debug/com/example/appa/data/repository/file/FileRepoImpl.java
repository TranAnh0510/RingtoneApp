package com.example.appa.data.repository.file;

/**
 * Implementation of the [FileRepo] interface for retrieving duration and path from a given URI.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\f\u0010\u0010\u001a\u00020\n*\u00020\u0011H\u0002J\u0014\u0010\u0012\u001a\u00020\n*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u0013\u001a\u0004\u0018\u00010\u0005*\u00020\u0011H\u0002J\f\u0010\u0014\u001a\u00020\n*\u00020\u0011H\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/example/appa/data/repository/file/FileRepoImpl;", "Lcom/example/appa/data/repository/file/FileRepo;", "()V", "projection", "", "", "getProjection", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getDurationFromUri", "", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "getPathFromUri", "getDurationFile", "Landroid/database/Cursor;", "getDurationFromMediaRetriever", "getPathFile", "getSizeFile", "app_debug"})
public final class FileRepoImpl implements com.example.appa.data.repository.file.FileRepo {
    
    /**
     * Array of projection columns to be queried from the content resolver.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String[] projection = {"title", "_data", "_display_name", "relative_path", "duration", "_size"};
    
    public FileRepoImpl() {
        super();
    }
    
    /**
     * Array of projection columns to be queried from the content resolver.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getProjection() {
        return null;
    }
    
    /**
     * Retrieves the duration of the media file corresponding to the provided URI.
     * @param context The context of the application.
     * @param uri The URI of the media file.
     * @return The duration of the media file in milliseconds.
     * @author AnhTTH
     */
    @java.lang.Override()
    public long getDurationFromUri(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return 0L;
    }
    
    /**
     * Retrieves the file path corresponding to the provided URI.
     * @param context The context of the application.
     * @param uri The URI of the file.
     * @return The file path.
     * @author AnhTTH
     */
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getPathFromUri(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
    
    /**
     * Extracts the file path from the cursor.
     * @return The file path.
     * @author AnhTTH
     */
    private final java.lang.String getPathFile(android.database.Cursor $this$getPathFile) {
        return null;
    }
    
    /**
     * Extracts the file size from the cursor.
     * @return The file size.
     * @author AnhTTH
     */
    private final long getSizeFile(android.database.Cursor $this$getSizeFile) {
        return 0L;
    }
    
    /**
     * Extracts the duration of the file from the cursor.
     * @return The duration of the file.
     * @author AnhTTH
     */
    private final long getDurationFile(android.database.Cursor $this$getDurationFile) {
        return 0L;
    }
    
    /**
     * Retrieves the duration of the media file using MediaMetadataRetriever.
     * @return The duration of the media file.
     * @author AnhTTH
     */
    private final long getDurationFromMediaRetriever(android.content.Context $this$getDurationFromMediaRetriever, android.net.Uri uri) {
        return 0L;
    }
}