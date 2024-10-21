package com.example.appa.data.repository.recent

import com.example.appa.data.model.ItemRecent

/**
 * Repository interface for managing recent items in the application.
 * @author AnhTTH
 */
interface RecentRepo {
    /**
     * Inserts a recent item into room database.
     * @param item the recent item to be inserted.
     * @return the row ID of the newly inserted recent item.
     * @author AnhTTH
     */
    fun insertRecent(item: ItemRecent): Long

    /**
     * Updates the time added of a recent item from room database.
     * @param time the new time to be set.
     * @param path the path of the recent item to be updated.
     * @return true if the update was successful, false otherwise.
     * @author AnhTTH
     */
    fun updateTimeRecent(time: Long, path: String): Boolean

    /**
     * Retrieves all recent items from room database.
     * @return a list of all recent items.
     * @author AnhTTH
     */
    fun getALlRecent(): List<ItemRecent>
}