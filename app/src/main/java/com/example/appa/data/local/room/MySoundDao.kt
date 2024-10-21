package com.example.appa.data.local.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.appa.data.model.ItemMySoundUI

/**
 * Data Access Object (DAO) for managing CRUD operations on the MySound database table.
 * @author AnhTTH
 */
@Dao
interface MySoundDao {
    /**
     * Retrieves all items from the ItemMySoundUI table at room database ordered by ID in descending order.
     * @return A list of [ItemMySoundUI] objects.
     * @author AnhTTH
     */
    @Query("select * from ItemMySoundUI ORDER BY id DESC")
    fun getALlMySound(): List<ItemMySoundUI>

    /**
     * Inserts a new sound item into the ItemMySoundUI table at room database.
     * @param itemMySound The [ItemMySoundUI] object to be inserted.
     * @return The row ID of the newly inserted item.
     * @author AnhTTH
     */
    @Insert
    fun insertMySound(itemMySound: ItemMySoundUI): Long

    /**
     * Deletes a sound item from the ItemMySoundUI table at room database based on the provided path.
     * @param path The path of the sound item to be deleted.
     * @author AnhTTH
     */
    @Query("DELETE FROM ItemMySoundUI where path=:path")
    fun deleteMySound(path: String)

    /**
     * Updates the name of a sound item in the ItemMySoundUI table at room database based on the provided ID.
     * @param name The new name for the sound item.
     * @param id The ID of the sound item to be updated.
     * @author AnhTTH
     */
    @Query("update ItemMySoundUI Set nameRingtone =:name where id=:id")
    fun updateNameMySound(name: String, id: Long)
}