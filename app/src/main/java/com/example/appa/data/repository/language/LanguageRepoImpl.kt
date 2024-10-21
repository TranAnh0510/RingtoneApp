package com.example.appa.data.repository.language

import com.example.appa.data.local.room.LanguageDao
import com.example.appa.data.model.LanguageUI
import javax.inject.Inject

/**
 * get data from local database, process logic and send result to LanguageRepo
 * Create helps avoid direct risk of results for ViewModel when there is any change to ViewModel
 * @author AnhTTH
 */
class LanguageRepoImpl @Inject constructor(
    private val languageDao: LanguageDao,
) : LanguageRepo {
    /**
     * get all language from local database
     * @author AnhTTH
     */
    override suspend fun getAllLanguage(): List<LanguageUI> {
        return languageDao.getAllLanguage() ?: mutableListOf()
    }

    /**
     * insert language UI to local database.
     * @author AnhTTH
     */
    override suspend fun insertLanguageToDb(languageUI: LanguageUI): Long {
        return languageDao.insertLanguage(languageUI)

    }
}