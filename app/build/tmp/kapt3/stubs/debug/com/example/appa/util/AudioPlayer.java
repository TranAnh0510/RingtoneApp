package com.example.appa.util;

/**
 * Manages audio playback functionality.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J0\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\rJ\u0006\u0010\u0018\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/appa/util/AudioPlayer;", "", "()V", "handler", "Landroid/os/Handler;", "isPlaying", "", "()Z", "mMediaPlayer", "Landroid/media/MediaPlayer;", "runnable", "Ljava/lang/Runnable;", "getDuration", "", "c", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "play", "", "path", "", "startSeconds", "endSeconds", "stop", "app_debug"})
public final class AudioPlayer {
    @org.jetbrains.annotations.Nullable()
    private android.media.MediaPlayer mMediaPlayer;
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler handler = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Runnable runnable = null;
    
    public AudioPlayer() {
        super();
    }
    
    /**
     * Stops audio playback.
     * @author AnhTTH
     */
    public final void stop() {
    }
    
    /**
     * Gets the duration of an audio file.
     * @param c The context.
     * @param uri The URI of the audio file.
     * @return The duration of the audio file.
     * @author AnhTTH
     */
    public final int getDuration(@org.jetbrains.annotations.NotNull()
    android.content.Context c, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return 0;
    }
    
    /**
     * Plays audio from a given URI with specified start and end seconds.
     * @param c The context.
     * @param uri The URI of the audio file.
     * @param path The path of the audio file.
     * @param startSeconds The starting point in seconds.
     * @param endSeconds The ending point in seconds.
     */
    public final void play(@org.jetbrains.annotations.NotNull()
    android.content.Context c, @org.jetbrains.annotations.Nullable()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    java.lang.String path, int startSeconds, int endSeconds) {
    }
    
    public final boolean isPlaying() {
        return false;
    }
}