package com.example.appa.data.model;

/**
 * Represents an audio item with various attributes such as file name, folder name, size, type, path, time added, and duration.
 * @property nameFile The name of the audio file.
 * @property nameFolder The name of the folder containing the audio file.
 * @property size The size of the audio file in bytes.
 * @property typeFile The type or format of the audio file.
 * @property path The file path of the audio file.
 * @property timeAdded The timestamp when the audio file was added, in milliseconds since epoch.
 * @property duration The duration of the audio file as a formatted string (e.g., "MM:SS").
 * @property durationLong The duration of the audio file in milliseconds.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0006H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0006H\u00c6\u0003JY\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020.H\u00d6\u0001J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010\u00a8\u00060"}, d2 = {"Lcom/example/appa/data/model/ItemAudio;", "", "nameFile", "", "nameFolder", "size", "", "typeFile", "path", "timeAdded", "duration", "durationLong", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;J)V", "getDuration", "()Ljava/lang/String;", "setDuration", "(Ljava/lang/String;)V", "getDurationLong", "()J", "setDurationLong", "(J)V", "getNameFile", "setNameFile", "getNameFolder", "setNameFolder", "getPath", "setPath", "getSize", "setSize", "getTimeAdded", "setTimeAdded", "getTypeFile", "setTypeFile", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class ItemAudio {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nameFile;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nameFolder;
    private long size;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String typeFile;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String path;
    private long timeAdded;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String duration;
    private long durationLong;
    
    public ItemAudio(@org.jetbrains.annotations.NotNull()
    java.lang.String nameFile, @org.jetbrains.annotations.NotNull()
    java.lang.String nameFolder, long size, @org.jetbrains.annotations.NotNull()
    java.lang.String typeFile, @org.jetbrains.annotations.NotNull()
    java.lang.String path, long timeAdded, @org.jetbrains.annotations.NotNull()
    java.lang.String duration, long durationLong) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNameFile() {
        return null;
    }
    
    public final void setNameFile(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNameFolder() {
        return null;
    }
    
    public final void setNameFolder(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getSize() {
        return 0L;
    }
    
    public final void setSize(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTypeFile() {
        return null;
    }
    
    public final void setTypeFile(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPath() {
        return null;
    }
    
    public final void setPath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getTimeAdded() {
        return 0L;
    }
    
    public final void setTimeAdded(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDuration() {
        return null;
    }
    
    public final void setDuration(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getDurationLong() {
        return 0L;
    }
    
    public final void setDurationLong(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final long component3() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    public final long component6() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    public final long component8() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.appa.data.model.ItemAudio copy(@org.jetbrains.annotations.NotNull()
    java.lang.String nameFile, @org.jetbrains.annotations.NotNull()
    java.lang.String nameFolder, long size, @org.jetbrains.annotations.NotNull()
    java.lang.String typeFile, @org.jetbrains.annotations.NotNull()
    java.lang.String path, long timeAdded, @org.jetbrains.annotations.NotNull()
    java.lang.String duration, long durationLong) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}