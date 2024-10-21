package com.example.appa.data.local.room;

/**
 * Data Access Object (DAO) interface for accessing favorite items in the database.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\'J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/example/appa/data/local/room/FavoriteDao;", "", "deleteFavourite", "", "path", "", "getALlFavorite", "", "Lcom/example/appa/data/model/ItemFavoriteUI;", "insertFavorite", "", "itemFavorite", "updatePathDownload", "pathDownload", "app_debug"})
@androidx.room.Dao()
public abstract interface FavoriteDao {
    
    @androidx.room.Query(value = "select * from ItemFavoriteUI ORDER BY id DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.appa.data.model.ItemFavoriteUI> getALlFavorite();
    
    @androidx.room.Insert()
    public abstract long insertFavorite(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.model.ItemFavoriteUI itemFavorite);
    
    @androidx.room.Query(value = "DELETE FROM ItemFavoriteUI where path=:path")
    public abstract void deleteFavourite(@org.jetbrains.annotations.NotNull()
    java.lang.String path);
    
    @androidx.room.Query(value = "Update ItemFavoriteUI set pathDownload=:pathDownload where path=:path")
    public abstract void updatePathDownload(@org.jetbrains.annotations.NotNull()
    java.lang.String pathDownload, @org.jetbrains.annotations.NotNull()
    java.lang.String path);
}