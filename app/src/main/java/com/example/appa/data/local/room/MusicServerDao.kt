package com.example.appa.data.local.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.appa.data.model.musicserver.MusicServerCategoriesUI
import com.example.appa.data.model.musicserver.MusicServerUI

/**
 * Data Access Object (DAO) interface for accessing music server data in the database.
 * @author AnhTTH
 */
@Dao
interface MusicServerDao {
    /**
     * Retrieves all music server categories from the database ordered by their ID in descending order.
     * @return a list of all music server categories.
     * @author AnhTTH
     */
    @Query("select * from MusicServerCategoriesUI ORDER BY id DESC")
    fun getALlCategory(): List<MusicServerCategoriesUI>

    /**
     * Retrieves all music items from the database that belong to a specific category.
     * @param category the category of the music items to be retrieved.
     * @return a list of all music items in the specified category.
     * @author AnhTTH
     */
    @Query("select * from MusicServerUI WHERE category=:category")
    fun getALlListMusic(category: String): List<MusicServerUI>

    /**
     * Retrieves all music items from the database for search purposes.
     * @return a list of all music items.
     * @author AnhTTH
     */
    @Query("select * from MusicServerUI ")
    fun getALlListMusicSearch(): List<MusicServerUI>

    /**
     * Updates the download path of a music item in the database.
     * @param pathDownload the new download path.
     * @param path the original path of the music item to be updated.
     * @author AnhTTH
     */
    @Query("update MusicServerUI set pathDownload =:pathDownload where path=:path ")
    fun updatePathDownload(pathDownload: String, path: String)

    /**
     * Inserts a music server category into the database.
     * @param musicServerCategoriesUI the music server category to be inserted.
     * @return the row ID of the newly inserted category.
     * @author AnhTTH
     */
    @Insert
    fun insertCategory(musicServerCategoriesUI: MusicServerCategoriesUI): Long

    /**
     * Inserts a music item into the database.
     * @param musicServerUI the music item to be inserted.
     * @return the row ID of the newly inserted music item.
     * @author AnhTTH
     */
    @Insert
    fun insertMusic(musicServerUI: MusicServerUI): Long

}