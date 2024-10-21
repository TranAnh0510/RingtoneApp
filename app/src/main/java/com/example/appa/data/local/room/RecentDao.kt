package com.example.appa.data.local.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.appa.data.model.ItemRecent

/**
 * Data Access Object (DAO) interface for accessing recent items data in the database.
 * @author AnhTTH
 */
@Dao
interface RecentDao {
    /**
     * Retrieves all recent items from the database ordered by their ID in descending order.
     * @return a list of all recent items.
     * @author AnhTTH
     */
    @Query("SELECT * FROM ItemRecent ORDER BY id DESC")
    fun getALlRecent(): List<ItemRecent>

    /**
     * Updates the time added of a recent item in the database.
     * @param time the new time to be set.
     * @param path the path of the recent item to be updated.
     * @author AnhTTH
     */
    @Query("update ItemRecent set timeAdd=:time where path=:path")
    fun updateTimeRecent(time: Long, path: String)

    /**
     * Inserts a recent item into the database.
     * @param imageDetail the recent item to be inserted.
     * @return the row ID of the newly inserted recent item.
     * @author AnhTTH
     */
    @Insert
    fun insertRecent(imageDetail: ItemRecent): Long

    /**
     * Updates the download path of a recent item in the database.
     * @param pathDownload the new download path.
     * @param path the original path of the recent item to be updated.
     * @author AnhTTH
     */
    @Query("Update ItemRecent set pathDownload=:pathDownload where path=:path")
    fun updatePathDownload(pathDownload: String, path: String)
}