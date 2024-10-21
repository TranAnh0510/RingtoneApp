package com.example.appa.data.repository.server

import android.content.Context
import com.example.appa.data.model.musicserver.MusicServerCategoriesUI
import com.example.appa.data.model.musicserver.MusicServerUI

/**
 * Repository interface for managing music server data in the application.
 */
interface MusicServerRepo {
    /**
     * Retrieves all music categories from the music server.
     * @param context the context used for accessing resources or system services.
     * @return a list of all music categories.
     * @author AnhTTH
     */
    fun getALlCategory(context: Context): List<MusicServerCategoriesUI>

    /**
     * Retrieves all music items belonging to a specific category from the music server.
     * @param category the category for which music items are to be retrieved.
     * @return a list of all music items in the specified category.
     * @author AnhTTH
     */
    fun getALlListMusic(category: String): List<MusicServerUI>

    /**
     * Searches for music items based on the provided query.
     * @param context the context used for accessing resources or system services.
     * @param query the search query.
     * @return a list of music items matching the search query.
     * @author AnhTTH
     */
    fun getListMusicSearch(context: Context, query: String): List<MusicServerUI>

    /**
     * Updates the download path of a music item in the music server.
     * @param context the context used for accessing resources or system services.
     * @param pathDownload the new download path for the music item.
     * @param path the path of the music item to be updated.
     * @return true if the update was successful, false otherwise.
     * @author AnhTTH
     */
    fun updatePathDownload(context: Context, pathDownload: String, path: String): Boolean
}