package com.example.appa.data.local.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.appa.data.model.ItemRecommend

/**
 * Data Access Object (DAO) for managing search-related operations on the database.
 * @author AnhTTH
 */
@Dao
interface SearchDao {
    /**
     * Retrieves all recent items from the ItemRecommend table ordered by ID in descending order.
     * @return A list of [ItemRecommend] objects representing recent search items.
     * @author AnhTTH
     */
    @Query("SELECT * FROM ItemRecommend ORDER BY id DESC")
    fun getALlRecent(): List<ItemRecommend>

    /**
     * Inserts a new search item into the ItemRecommend table at room database.
     * @param itemSearch The [ItemRecommend] object to be inserted.
     * @return The row ID of the newly inserted item.
     * @author AnhTTH
     */
    @Insert
    fun insertHistory(itemSearch: ItemRecommend): Long
}