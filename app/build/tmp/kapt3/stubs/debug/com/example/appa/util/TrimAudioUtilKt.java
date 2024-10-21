package com.example.appa.util;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000$\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004\u001a*\u0010\n\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004\u00a8\u0006\u000e"}, d2 = {"format", "", "time", "formatTimeCutVideo", "", "extractAudioFromVideo", "", "Landroid/content/Context;", "nameFile", "path", "trimAudio", "startTime", "", "endTime", "app_debug"})
public final class TrimAudioUtilKt {
    
    /**
     * Extracts audio from a video file and saves it as an MP3 file.
     * @param nameFile The name of the output audio file.
     * @param path The path of the input video file.
     * @author AnhTTH
     */
    public static final void extractAudioFromVideo(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$extractAudioFromVideo, @org.jetbrains.annotations.NotNull()
    java.lang.String nameFile, @org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    /**
     * Trims an audio file to a specified start and end time, and saves the result as an MP3 file.
     * @param startTime The start time in milliseconds.
     * @param endTime The end time in milliseconds.
     * @param nameFile The name of the output audio file.
     * @param path The path of the input audio file.
     * @author AnhTTH
     */
    public static final void trimAudio(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$trimAudio, int startTime, int endTime, @org.jetbrains.annotations.NotNull()
    java.lang.String nameFile, @org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    /**
     * Formats a time duration in milliseconds to a string in the format HH:mm:ss.S.
     * @param time The time in milliseconds.
     * @return The formatted time string.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatTimeCutVideo(long time) {
        return null;
    }
    
    /**
     * Recursively formats the remaining milliseconds to a single digit.
     * @param time The time in milliseconds.
     * @return The formatted time.
     * @author AnhTTH
     */
    public static final long format(long time) {
        return 0L;
    }
}