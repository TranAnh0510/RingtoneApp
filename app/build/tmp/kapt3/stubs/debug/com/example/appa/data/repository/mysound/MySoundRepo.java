package com.example.appa.data.repository.mysound;

/**
 * Interface defining operations for managing user sounds.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\fH&\u00a8\u0006\u0011"}, d2 = {"Lcom/example/appa/data/repository/mysound/MySoundRepo;", "", "deleteMySound", "", "path", "", "getListMySounds", "", "Lcom/example/appa/data/model/ItemMySoundUI;", "context", "Landroid/content/Context;", "insertMySound", "", "itemMySoundUI", "updateNameMySound", "name", "id", "app_debug"})
public abstract interface MySoundRepo {
    
    /**
     * Retrieves a list of user sounds from room database.
     * @param context The context of the application.
     * @return A list of [ItemMySoundUI] objects representing user sounds.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.appa.data.model.ItemMySoundUI> getListMySounds(@org.jetbrains.annotations.NotNull()
    android.content.Context context);
    
    /**
     * Deletes a user sound from room database.
     * @param path The path of the user sound to be deleted.
     * @return `true` if the deletion is successful, `false` otherwise.
     * @author AnhTTH
     */
    public abstract boolean deleteMySound(@org.jetbrains.annotations.NotNull()
    java.lang.String path);
    
    /**
     * Inserts a new user sound from room database.
     * @param itemMySoundUI The [ItemMySoundUI] object representing the user sound to be inserted.
     * @return The ID of the inserted user sound.
     * @author AnhTTH
     */
    public abstract long insertMySound(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.model.ItemMySoundUI itemMySoundUI);
    
    /**
     * Updates the name of a user sound from room database.
     * @param name The new name for the user sound.
     * @param id The ID of the user sound to be updated.
     * @return `true` if the update is successful, `false` otherwise.
     * @author AnhTTH
     */
    public abstract boolean updateNameMySound(@org.jetbrains.annotations.NotNull()
    java.lang.String name, long id);
}