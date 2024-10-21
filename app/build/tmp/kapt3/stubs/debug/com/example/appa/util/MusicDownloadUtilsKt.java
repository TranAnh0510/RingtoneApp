package com.example.appa.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b\u001a\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u00a8\u0006\r"}, d2 = {"receiver", "Lcom/example/appa/receiver/DownloadReceiver;", "getReceiver", "()Lcom/example/appa/receiver/DownloadReceiver;", "downloadMusic", "", "Landroid/content/Context;", "url", "", "title", "getDownloadedFileUri", "Landroid/net/Uri;", "downloadId", "app_debug"})
public final class MusicDownloadUtilsKt {
    @org.jetbrains.annotations.NotNull()
    private static final com.example.appa.receiver.DownloadReceiver receiver = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final com.example.appa.receiver.DownloadReceiver getReceiver() {
        return null;
    }
    
    /**
     * Initiates a music download from the specified URL with the given title.
     * @param url The URL of the music file to download.
     * @param title The title of the music file.
     * @return The ID of the download request.
     * @author AnhTTH
     */
    public static final long downloadMusic(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$downloadMusic, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
        return 0L;
    }
    
    /**
     * Retrieves the URI of the downloaded file corresponding to the given download ID.
     * @param downloadId The ID of the download request.
     * @return The URI of the downloaded file, or null if not found.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.Nullable()
    public static final android.net.Uri getDownloadedFileUri(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getDownloadedFileUri, long downloadId) {
        return null;
    }
}