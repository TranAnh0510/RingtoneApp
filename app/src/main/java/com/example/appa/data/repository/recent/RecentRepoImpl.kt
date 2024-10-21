package com.example.appa.data.repository.recent


import com.example.appa.data.local.room.RecentDao
import com.example.appa.data.model.ItemRecent
import javax.inject.Inject

/**
 * Implementation of the RecentRepo interface for managing recent items using a DAO.
 * @property recentDao the DAO for accessing recent items data.
 * @author AnhTTH
 */
class RecentRepoImpl @Inject constructor(private val recentDao: RecentDao) : RecentRepo {
    /**
     * Inserts a recent item into room database.
     * @param item the recent item to be inserted.
     * @return the row ID of the newly inserted recent item.
     * @author AnhTTH
     */
    override fun insertRecent(item: ItemRecent): Long {
        return recentDao.insertRecent(item)
    }

    /**
     * Retrieves all recent items from room database, ensuring uniqueness by nameSound.
     * @return a list of all recent items, with each nameSound appearing only once.
     * @author AnhTTH
     */
    override fun getALlRecent(): List<ItemRecent> {
        return recentDao.getALlRecent().distinctBy { it.nameSound }
    }

    /**
     * Updates the time added of a recent item in room database.
     * @param time the new time to be set.
     * @param path the path of the recent item to be updated.
     * @return true if the update was successful, false otherwise.
     * @author AnhTTH
     */
    override fun updateTimeRecent(time: Long, path: String): Boolean {
        return try {
            recentDao.updateTimeRecent(time, path)
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }
}