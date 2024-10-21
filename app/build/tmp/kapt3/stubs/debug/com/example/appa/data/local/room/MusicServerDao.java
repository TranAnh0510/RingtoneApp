package com.example.appa.data.local.room;

/**
 * Data Access Object (DAO) interface for accessing music server data in the database.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\'J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H\'J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\'\u00a8\u0006\u0013"}, d2 = {"Lcom/example/appa/data/local/room/MusicServerDao;", "", "getALlCategory", "", "Lcom/example/appa/data/model/musicserver/MusicServerCategoriesUI;", "getALlListMusic", "Lcom/example/appa/data/model/musicserver/MusicServerUI;", "category", "", "getALlListMusicSearch", "insertCategory", "", "musicServerCategoriesUI", "insertMusic", "musicServerUI", "updatePathDownload", "", "pathDownload", "path", "app_debug"})
@androidx.room.Dao()
public abstract interface MusicServerDao {
    
    /**
     * Retrieves all music server categories from the database ordered by their ID in descending order.
     * @return a list of all music server categories.
     * @author AnhTTH
     */
    @androidx.room.Query(value = "select * from MusicServerCategoriesUI ORDER BY id DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.appa.data.model.musicserver.MusicServerCategoriesUI> getALlCategory();
    
    /**
     * Retrieves all music items from the database that belong to a specific category.
     * @param category the category of the music items to be retrieved.
     * @return a list of all music items in the specified category.
     * @author AnhTTH
     */
    @androidx.room.Query(value = "select * from MusicServerUI WHERE category=:category")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.appa.data.model.musicserver.MusicServerUI> getALlListMusic(@org.jetbrains.annotations.NotNull()
    java.lang.String category);
    
    /**
     * Retrieves all music items from the database for search purposes.
     * @return a list of all music items.
     * @author AnhTTH
     */
    @androidx.room.Query(value = "select * from MusicServerUI ")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.appa.data.model.musicserver.MusicServerUI> getALlListMusicSearch();
    
    /**
     * Updates the download path of a music item in the database.
     * @param pathDownload the new download path.
     * @param path the original path of the music item to be updated.
     * @author AnhTTH
     */
    @androidx.room.Query(value = "update MusicServerUI set pathDownload =:pathDownload where path=:path ")
    public abstract void updatePathDownload(@org.jetbrains.annotations.NotNull()
    java.lang.String pathDownload, @org.jetbrains.annotations.NotNull()
    java.lang.String path);
    
    /**
     * Inserts a music server category into the database.
     * @param musicServerCategoriesUI the music server category to be inserted.
     * @return the row ID of the newly inserted category.
     * @author AnhTTH
     */
    @androidx.room.Insert()
    public abstract long insertCategory(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.model.musicserver.MusicServerCategoriesUI musicServerCategoriesUI);
    
    /**
     * Inserts a music item into the database.
     * @param musicServerUI the music item to be inserted.
     * @return the row ID of the newly inserted music item.
     * @author AnhTTH
     */
    @androidx.room.Insert()
    public abstract long insertMusic(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.model.musicserver.MusicServerUI musicServerUI);
}