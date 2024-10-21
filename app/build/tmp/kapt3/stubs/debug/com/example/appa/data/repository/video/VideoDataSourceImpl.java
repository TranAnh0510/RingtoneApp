package com.example.appa.data.repository.video;

/**
 * Implementation of [VideoDataSource] responsible for fetching videos from the device's gallery.
 * @property context The application context.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J.\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\n \u0007*\u0004\u0018\u00010\u00120\u0012H\u0002J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0003J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002\u00a2\u0006\u0002\u0010\u001aJ\n\u0010\u001b\u001a\u0004\u0018\u00010\u0019H\u0002R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/appa/data/repository/video/VideoDataSourceImpl;", "Lcom/example/appa/data/repository/video/VideoDataSource;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "contentResolver", "Landroid/content/ContentResolver;", "kotlin.jvm.PlatformType", "fetchGalleryVideos", "", "Lcom/example/appa/data/repository/video/model/ItemVideo;", "limit", "", "offset", "typeSort", "isDecending", "", "getContentUri", "Landroid/net/Uri;", "getCursorBelowO", "Landroid/database/Cursor;", "getCursorFromO", "getCursorVideo", "getProjectionVideo", "", "", "()[Ljava/lang/String;", "getSelectionVideo", "app_debug"})
public final class VideoDataSourceImpl implements com.example.appa.data.repository.video.VideoDataSource {
    private final android.content.ContentResolver contentResolver = null;
    
    @javax.inject.Inject()
    public VideoDataSourceImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    /**
     * Fetches a list of gallery videos with specified criteria.
     * @param limit The maximum number of videos to fetch.
     * @param offset The offset from which to start fetching videos.
     * @param typeSort The type of sorting to apply (1: by name, 2: by date added, 3: by size).
     * @param isDescending Determines whether sorting should be in descending order.
     * @return A list of [ItemVideo] objects representing the gallery videos.
     * @author AnhTTH
     */
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.example.appa.data.repository.video.model.ItemVideo> fetchGalleryVideos(int limit, int offset, int typeSort, boolean isDecending) {
        return null;
    }
    
    /**
     * Retrieves a cursor to fetch videos compatible with Android Q (API level 29) and above.
     * @param limit The maximum number of videos to fetch.
     * @param offset The offset from which to start fetching videos.
     * @return A cursor containing video details.
     * @author AnhTTH
     */
    private final android.database.Cursor getCursorVideo(int limit, int offset) {
        return null;
    }
    
    /**
     * Retrieves a cursor to fetch videos compatible with Android Oreo (API level 26) and above.
     * @param limit The maximum number of videos to fetch.
     * @param offset The offset from which to start fetching videos.
     * @return A cursor containing video details.
     * @author AnhTTH
     */
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final android.database.Cursor getCursorFromO(int limit, int offset) {
        return null;
    }
    
    /**
     * Retrieves a cursor to fetch videos below Android Oreo (API level 26).
     * @param limit The maximum number of videos to fetch.
     * @param offset The offset from which to start fetching videos.
     * @return A cursor containing video details.
     * @author AnhTTH
     */
    private final android.database.Cursor getCursorBelowO(int limit, int offset) {
        return null;
    }
    
    /**
     * Retrieves the selection criteria for querying videos based on platform compatibility.
     * @return The selection criteria as a string.
     * @author AnhTTH
     */
    private final java.lang.String getSelectionVideo() {
        return null;
    }
    
    /**
     * Retrieves the content URI for querying videos.
     * @return The content URI for videos.
     * @author AnhTTH
     */
    private final android.net.Uri getContentUri() {
        return null;
    }
    
    /**
     * Retrieves the projection for querying videos.
     * @return The projection array for videos.
     * @author AnhTTH
     */
    private final java.lang.String[] getProjectionVideo() {
        return null;
    }
}