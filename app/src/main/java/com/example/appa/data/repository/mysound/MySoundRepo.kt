package com.example.appa.data.repository.mysound

import android.content.Context
import com.example.appa.data.model.ItemMySoundUI

/**
 * Interface defining operations for managing user sounds.
 * @author AnhTTH
 */
interface MySoundRepo {
    /**
     * Retrieves a list of user sounds from room database.
     * @param context The context of the application.
     * @return A list of [ItemMySoundUI] objects representing user sounds.
     * @author AnhTTH
     */
    fun getListMySounds(context: Context): List<ItemMySoundUI>

    /**
     * Deletes a user sound from room database.
     * @param path The path of the user sound to be deleted.
     * @return `true` if the deletion is successful, `false` otherwise.
     * @author AnhTTH
     */
    fun deleteMySound(path: String): Boolean

    /**
     * Inserts a new user sound from room database.
     * @param itemMySoundUI The [ItemMySoundUI] object representing the user sound to be inserted.
     * @return The ID of the inserted user sound.
     * @author AnhTTH
     */
    fun insertMySound(itemMySoundUI: ItemMySoundUI): Long

    /**
     * Updates the name of a user sound from room database.
     * @param name The new name for the user sound.
     * @param id The ID of the user sound to be updated.
     * @return `true` if the update is successful, `false` otherwise.
     * @author AnhTTH
     */
    fun updateNameMySound(name: String, id: Long): Boolean

}