package com.example.appa.data.local.room;

/**
 * @see androidx.room.Database
 *
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u0010"}, d2 = {"Lcom/example/appa/data/local/room/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "favouriteDao", "Lcom/example/appa/data/local/room/FavoriteDao;", "languageDao", "Lcom/example/appa/data/local/room/LanguageDao;", "musicServerDao", "Lcom/example/appa/data/local/room/MusicServerDao;", "mySoundDao", "Lcom/example/appa/data/local/room/MySoundDao;", "recentDao", "Lcom/example/appa/data/local/room/RecentDao;", "searchDao", "Lcom/example/appa/data/local/room/SearchDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.example.appa.data.model.LanguageUI.class, com.example.appa.data.model.musicserver.MusicServerCategoriesUI.class, com.example.appa.data.model.musicserver.MusicServerUI.class, com.example.appa.data.model.ItemFavoriteUI.class, com.example.appa.data.model.ItemRecent.class, com.example.appa.data.model.ItemMySoundUI.class, com.example.appa.data.model.ItemRecommend.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATABASE_NAME = "DATABASE_NAME";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.appa.data.local.room.AppDatabase.Companion Companion = null;
    
    public AppDatabase() {
        super();
    }
    
    /**
     * Get language Dao to access language table.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.appa.data.local.room.LanguageDao languageDao();
    
    /**
     * Get musicServerDao to access musicServer table.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.appa.data.local.room.MusicServerDao musicServerDao();
    
    /**
     * Get favouriteDao to access favourite table.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.appa.data.local.room.FavoriteDao favouriteDao();
    
    /**
     * Get recentDao to access recent table.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.appa.data.local.room.RecentDao recentDao();
    
    /**
     * Get mySoundDao to access mySound table.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.appa.data.local.room.MySoundDao mySoundDao();
    
    /**
     * Get searchDao to access search table.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.appa.data.local.room.SearchDao searchDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/appa/data/local/room/AppDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}