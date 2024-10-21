package com.example.appa.data.repository.favorite

import com.example.appa.data.model.ItemFavoriteUI

/**
 * Repository interface for managing favorite items in the application.
 * @author AnhTTH
 */
interface FavoriteRepo {
    /**
     * Deletes a favorite item from room database by its path.
     * @param path the path of the favorite item to be deleted.
     * @return true if the deletion was successful, false otherwise.
     * @author AnhTTH
     */
    fun deleteFavorite(path: String): Boolean

    /**
     * Inserts a favorite item into room database.
     * @param itemFavorite the favorite item to be inserted.
     * @return the row ID of the newly inserted favorite item.
     * @author AnhTTH
     */
    fun insertFavorite(itemFavorite: ItemFavoriteUI): Long

    /**
     * Retrieves all favorite items from room database.
     * @return a list of all favorite items.
     * @author AnhTTH
     */
    fun getALlFavorite(): List<ItemFavoriteUI>


}