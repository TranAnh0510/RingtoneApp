package com.example.appa.data.repository.favorite

import com.example.appa.data.local.room.FavoriteDao
import com.example.appa.data.model.ItemFavoriteUI
import javax.inject.Inject

/**
 * Implementation of the FavoriteRepo interface for managing favorite items using a DAO.
 * @property favoriteDao the DAO for accessing favorite items data.
 * @author AnhTTH
 *
 */
class FavoriteRepoImpl @Inject constructor(private val favoriteDao: FavoriteDao) : FavoriteRepo {
    /**
     * Deletes a favorite item from room database by its path.
     * @param path the path of the favorite item to be deleted.
     * @return true indicating the deletion was successful.
     * @author AnhTTH
     */
    override fun deleteFavorite(path: String): Boolean {
        favoriteDao.deleteFavourite(path)
        return (true)
    }

    /**
     * Inserts a favorite item into room database.
     * @param itemFavorite the favorite item to be inserted.
     * @return the row ID of the newly inserted favorite item.
     * @author AnhTTH
     */
    override fun insertFavorite(itemFavorite: ItemFavoriteUI): Long {
        return (favoriteDao.insertFavorite(itemFavorite))

    }

    /**
     * Retrieves all favorite items from room database, ensuring uniqueness by name.
     * @return a list of all favorite items, with each name appearing only once.
     * @author AnhTTH
     */
    override fun getALlFavorite(): List<ItemFavoriteUI> {
        return favoriteDao.getALlFavorite().distinctBy { it.name }
    }
}