package com.example.appa.data.repository.language

import com.example.appa.data.model.LanguageUI

/**
 * Repository interface for managing language items in the application.
 * @author AnhTTH
 */
interface LanguageRepo {

    /**
     * get all language from database
     *   @author AnhTTH
     */
    suspend fun getAllLanguage(): List<LanguageUI>

    /**
     * insert language to database
     * @author AnhTTH
     */
    suspend fun insertLanguageToDb(languageUI: LanguageUI): Long
}