package com.example.appa.data.repository.mysound

import android.content.Context
import com.example.appa.data.local.room.MySoundDao
import com.example.appa.data.model.ItemMySoundUI
import javax.inject.Inject

/**
 * Implementation of the [MySoundRepo] interface that interacts with the MySoundDao to perform operations on user sounds.
 * @property mySoundDao The DAO interface for accessing the MySound database.
 * @constructor Creates an instance of MySoundRepoImpl with the specified MySoundDao.
 * @author AnhTTH
 */
class MySoundRepoImpl @Inject constructor(private val mySoundDao: MySoundDao) : MySoundRepo {
    /**
     * Retrieves a list of user sounds from the database.
     * @param context The context of the application.
     * @return A list of [ItemMySoundUI] objects representing user sounds.
     * @author AnhTTH
     */
    override fun getListMySounds(context: Context): List<ItemMySoundUI> {
        val listNew: MutableList<ItemMySoundUI> = mutableListOf()
        kotlin.runCatching {
            listNew.addAll(mySoundDao.getALlMySound().distinctBy { it.nameRingtone })
        }.onFailure { it.printStackTrace() }
        return (listNew)

    }

    /**
     * Deletes a user sound from the database.
     * @param path The path of the user sound to be deleted.
     * @return `true` if the deletion is successful, `false` otherwise.
     * @author AnhTTH
     */
    override fun deleteMySound(path: String): Boolean {
        mySoundDao.deleteMySound(path)
        return (true)

    }

    /**
     * Inserts a new user sound into the database.
     * @param itemMySoundUI The [ItemMySoundUI] object representing the user sound to be inserted.
     * @return The ID of the inserted user sound.
     * @author AnhTTH
     */
    override fun insertMySound(itemMySoundUI: ItemMySoundUI): Long {
        return (mySoundDao.insertMySound(itemMySoundUI))

    }

    /**
     * Updates the name of a user sound in the database.
     * @param name The new name for the user sound.
     * @param id The ID of the user sound to be updated.
     * @return `true` if the update is successful, `false` otherwise.
     * @author AnhTTH
     */
    override fun updateNameMySound(name: String, id: Long): Boolean {
        mySoundDao.updateNameMySound(name, id)
        return true

    }
}