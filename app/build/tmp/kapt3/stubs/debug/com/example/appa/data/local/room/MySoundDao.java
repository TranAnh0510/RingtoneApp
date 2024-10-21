package com.example.appa.data.local.room;

/**
 * Data Access Object (DAO) for managing CRUD operations on the MySound database table.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\'J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\nH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/example/appa/data/local/room/MySoundDao;", "", "deleteMySound", "", "path", "", "getALlMySound", "", "Lcom/example/appa/data/model/ItemMySoundUI;", "insertMySound", "", "itemMySound", "updateNameMySound", "name", "id", "app_debug"})
@androidx.room.Dao()
public abstract interface MySoundDao {
    
    /**
     * Retrieves all items from the ItemMySoundUI table at room database ordered by ID in descending order.
     * @return A list of [ItemMySoundUI] objects.
     * @author AnhTTH
     */
    @androidx.room.Query(value = "select * from ItemMySoundUI ORDER BY id DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.appa.data.model.ItemMySoundUI> getALlMySound();
    
    /**
     * Inserts a new sound item into the ItemMySoundUI table at room database.
     * @param itemMySound The [ItemMySoundUI] object to be inserted.
     * @return The row ID of the newly inserted item.
     * @author AnhTTH
     */
    @androidx.room.Insert()
    public abstract long insertMySound(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.model.ItemMySoundUI itemMySound);
    
    /**
     * Deletes a sound item from the ItemMySoundUI table at room database based on the provided path.
     * @param path The path of the sound item to be deleted.
     * @author AnhTTH
     */
    @androidx.room.Query(value = "DELETE FROM ItemMySoundUI where path=:path")
    public abstract void deleteMySound(@org.jetbrains.annotations.NotNull()
    java.lang.String path);
    
    /**
     * Updates the name of a sound item in the ItemMySoundUI table at room database based on the provided ID.
     * @param name The new name for the sound item.
     * @param id The ID of the sound item to be updated.
     * @author AnhTTH
     */
    @androidx.room.Query(value = "update ItemMySoundUI Set nameRingtone =:name where id=:id")
    public abstract void updateNameMySound(@org.jetbrains.annotations.NotNull()
    java.lang.String name, long id);
}