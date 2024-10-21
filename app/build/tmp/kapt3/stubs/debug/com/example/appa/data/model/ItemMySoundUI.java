package com.example.appa.data.model;

/**
 * Represents a custom sound item with various attributes such as name, duration, and path.
 * @property id The unique identifier for the custom sound item (auto-generated).
 * @property nameRingtone The name of the ringtone or sound. Can be null.
 * @property durationLong The duration of the sound in milliseconds.
 * @property path The file path of the sound. Can be null.
 * @property duration The optional duration of the sound as a formatted string (e.g., "MM:SS"), ignored by Room.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003JA\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\u0005H\u00d6\u0001R \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r\u00a8\u0006$"}, d2 = {"Lcom/example/appa/data/model/ItemMySoundUI;", "", "id", "", "nameRingtone", "", "durationLong", "path", "duration", "(JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getDuration", "()Ljava/lang/String;", "setDuration", "(Ljava/lang/String;)V", "getDurationLong", "()J", "setDurationLong", "(J)V", "getId", "setId", "getNameRingtone", "setNameRingtone", "getPath", "setPath", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
@androidx.room.Entity()
public final class ItemMySoundUI {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long id;
    @androidx.room.ColumnInfo()
    @org.jetbrains.annotations.Nullable()
    private java.lang.String nameRingtone;
    @androidx.room.ColumnInfo()
    private long durationLong;
    @androidx.room.ColumnInfo()
    @org.jetbrains.annotations.Nullable()
    private java.lang.String path;
    @androidx.room.Ignore()
    @org.jetbrains.annotations.Nullable()
    private java.lang.String duration;
    
    public ItemMySoundUI(long id, @org.jetbrains.annotations.Nullable()
    java.lang.String nameRingtone, long durationLong, @org.jetbrains.annotations.Nullable()
    java.lang.String path, @org.jetbrains.annotations.Nullable()
    java.lang.String duration) {
        super();
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNameRingtone() {
        return null;
    }
    
    public final void setNameRingtone(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final long getDurationLong() {
        return 0L;
    }
    
    public final void setDurationLong(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPath() {
        return null;
    }
    
    public final void setPath(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDuration() {
        return null;
    }
    
    public final void setDuration(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public ItemMySoundUI() {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    public final long component3() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.appa.data.model.ItemMySoundUI copy(long id, @org.jetbrains.annotations.Nullable()
    java.lang.String nameRingtone, long durationLong, @org.jetbrains.annotations.Nullable()
    java.lang.String path, @org.jetbrains.annotations.Nullable()
    java.lang.String duration) {
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