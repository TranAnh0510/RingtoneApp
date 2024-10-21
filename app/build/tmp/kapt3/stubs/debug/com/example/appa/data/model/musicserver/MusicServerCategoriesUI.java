package com.example.appa.data.model.musicserver;

/**
 * Represents a category of music on the server with a name, number of songs, and additional optional properties.
 * @property name The name of the music category.
 * @property numberSong The number of songs in the music category.
 * @property id The unique identifier for the music category (auto-generated).
 * @property listSong The list of songs in the music category (ignored by Room).
 * @property image The optional image associated with the music category (ignored by Room).
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u0005H\u00d6\u0001J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006&"}, d2 = {"Lcom/example/appa/data/model/musicserver/MusicServerCategoriesUI;", "", "name", "", "numberSong", "", "(Ljava/lang/String;I)V", "id", "", "getId", "()J", "setId", "(J)V", "image", "getImage", "()Ljava/lang/Integer;", "setImage", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "listSong", "", "Lcom/example/appa/data/model/musicserver/MusicServerUI;", "getListSong", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getNumberSong", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
@androidx.room.Entity()
public final class MusicServerCategoriesUI {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    private final int numberSong = 0;
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long id = 0L;
    @androidx.room.Ignore()
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.appa.data.model.musicserver.MusicServerUI> listSong = null;
    @androidx.room.Ignore()
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer image;
    
    public MusicServerCategoriesUI(@org.jetbrains.annotations.NotNull()
    java.lang.String name, int numberSong) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getNumberSong() {
        return 0;
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.appa.data.model.musicserver.MusicServerUI> getListSong() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public MusicServerCategoriesUI() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.appa.data.model.musicserver.MusicServerCategoriesUI copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, int numberSong) {
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