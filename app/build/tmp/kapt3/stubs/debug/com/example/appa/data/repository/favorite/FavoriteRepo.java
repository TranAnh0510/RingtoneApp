package com.example.appa.data.repository.favorite;

/**
 * Repository interface for managing favorite items in the application.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH&\u00a8\u0006\f"}, d2 = {"Lcom/example/appa/data/repository/favorite/FavoriteRepo;", "", "deleteFavorite", "", "path", "", "getALlFavorite", "", "Lcom/example/appa/data/model/ItemFavoriteUI;", "insertFavorite", "", "itemFavorite", "app_debug"})
public abstract interface FavoriteRepo {
    
    /**
     * Deletes a favorite item from room database by its path.
     * @param path the path of the favorite item to be deleted.
     * @return true if the deletion was successful, false otherwise.
     * @author AnhTTH
     */
    public abstract boolean deleteFavorite(@org.jetbrains.annotations.NotNull()
    java.lang.String path);
    
    /**
     * Inserts a favorite item into room database.
     * @param itemFavorite the favorite item to be inserted.
     * @return the row ID of the newly inserted favorite item.
     * @author AnhTTH
     */
    public abstract long insertFavorite(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.model.ItemFavoriteUI itemFavorite);
    
    /**
     * Retrieves all favorite items from room database.
     * @return a list of all favorite items.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.appa.data.model.ItemFavoriteUI> getALlFavorite();
}