package com.example.appa.data.local.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.appa.data.model.LanguageUI

@Dao
/**
 * Data Access Object (DAO) interface for accessing language items data in the database.
 * @author AnhTTH
 */
interface LanguageDao {
    /**
     * Queries the database for all languageUIs, ordered by ID in ascending order.
     * @return A list of all languageUIs in the database, or null if there are no languageUIs.
     * @author AnhTTH
     */
    @Query("SELECT * FROM LanguageUI ORDER BY id ASC")
    fun getAllLanguage(): List<LanguageUI>?

    /**
     * Inserts a new languageUI into the database.
     * @param languageUI The languageUI to insert.
     * @return The ID of the newly inserted languageUI, or -1 if the insert operation failed.
     * @author AnhTTH
     */
    @Insert
    suspend fun insertLanguage(languageUI: LanguageUI): Long
}