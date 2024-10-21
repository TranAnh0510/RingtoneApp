package com.example.appa.data.repository.server

import android.content.Context
import com.example.appa.data.entities.MusicCategoriesEntities
import com.example.appa.data.entities.toModelUI
import com.example.appa.data.local.room.FavoriteDao
import com.example.appa.data.local.room.MusicServerDao
import com.example.appa.data.local.room.RecentDao
import com.example.appa.data.model.musicserver.MusicServerCategoriesUI
import com.example.appa.data.model.musicserver.MusicServerUI
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException
import javax.inject.Inject

/**
 * Implementation of the MusicServerRepo interface for managing music server data.
 * @param musicServerDao the DAO for accessing music server data.
 * @param favoriteDao the DAO for accessing favorite items data.
 * @param recentDao the DAO for accessing recent items data.
 * @author AnhTTH
 */
class MusicServerRepoImpl @Inject constructor(
    private val musicServerDao: MusicServerDao,
    private val favoriteDao: FavoriteDao,
    private val recentDao: RecentDao
) : MusicServerRepo {
    /** The list of all music categories.
     * @author AnhTTH
     */
    private var listAllCate: MutableList<MusicServerCategoriesUI> = mutableListOf()

    /** The list of all music items.
     * @author AnhTTH
     */
    private var listAllMusic: List<MusicServerUI> = mutableListOf()

    /**
     * Retrieves all music categories from the music server.
     * @param context the context used for accessing resources or system services.
     * @return a list of all music categories.
     * @author AnhTTH
     */

    override fun getALlCategory(context: Context): List<MusicServerCategoriesUI> {
        listAllCate.clear()
        val categoriesFromDao = musicServerDao.getALlCategory()
        listAllCate.addAll(categoriesFromDao)

        if (listAllCate.isEmpty()) {
            val categoriesFromServer = getAllMusicCategory(context)
            listAllCate.addAll(categoriesFromServer)
        }

        return listAllCate
    }

    /**
     * Retrieves all music items belonging to a specific category from the music server.
     * @param category the category for which music items are to be retrieved.
     * @return a list of all music items in the specified category.
     * @author AnhTTH
     */
    override fun getALlListMusic(category: String): List<MusicServerUI> {

        val listMusicFromDB = musicServerDao.getALlListMusic(category)

        if (listMusicFromDB.isNotEmpty()) {
            return (listMusicFromDB)
        }

        val listMusic = listAllCate.firstOrNull { it.name == category }?.listSong ?: mutableListOf()

        return listMusic
    }

    /**
     * Searches for music items based on the provided query.
     * @param context the context used for accessing resources or system services.
     * @param query the search query.
     * @return a list of music items matching the search query.
     * @author AnhTTH
     */
    override fun getListMusicSearch(context: Context, query: String): List<MusicServerUI> {

        if (listAllMusic.isEmpty()) {
            listAllMusic = musicServerDao.getALlListMusicSearch()
        }

        val listSearch = listAllMusic.filter {
            it.name.uppercase().contains(query.uppercase()) || it.category.uppercase()
                .contains(query.uppercase())
        }
        return listSearch
    }

    /**
     * Updates the download path of a music item in the music server.
     * @param context the context used for accessing resources or system services.
     * @param pathDownload the new download path for the music item.
     * @param path the path of the music item to be updated.
     * @return true if the update was successful, false otherwise.
     * @author AnhTTH
     */
    override fun updatePathDownload(
        context: Context, pathDownload: String, path: String
    ): Boolean {
        musicServerDao.updatePathDownload(pathDownload, path)
        favoriteDao.updatePathDownload(pathDownload, path)
        recentDao.updatePathDownload(pathDownload, path)
        return (true)

    }

    /**
     * Retrieves music categories and their corresponding songs from a JSON file
     * named "Ringtone.json" in the assets folder.
     *
     * @param context the context used for accessing assets.
     * @return a mutable list of MusicServerCategoriesUI containing music categories and their songs.
     * @author AnhTTH
     */
    private fun getAllMusicCategory(context: Context): MutableList<MusicServerCategoriesUI> {
        val dataUI: MutableList<MusicServerCategoriesUI> = arrayListOf()
        kotlin.runCatching {
            val dataEntities: ArrayList<MusicCategoriesEntities> = arrayListOf()
            dataEntities.addAll(getListMusicFromJson(context, "Ringtone.json"))
            dataEntities.forEach { cate ->
                val listSongUI = mutableListOf<MusicServerUI>()
                cate.listSong.forEach {
                    listSongUI.add(it.toModelUI())

                }
                cate.listSong.firstOrNull()?.let {
                    listSongUI.forEach {
                        musicServerDao.insertMusic(it)
                    }
                }
                listAllCate.add(
                    MusicServerCategoriesUI(
                        name = cate.name, numberSong = listSongUI.size
                    )
                )
            }
            listAllCate.forEach {
                it.id = musicServerDao.insertCategory(it)
            }
        }.onFailure { it.printStackTrace() }
        return dataUI
    }

    /**
     * Retrieves music categories and their corresponding songs from a JSON file in the assets folder.
     * @param context the context used for accessing assets.
     * @param name the name of the JSON file containing music categories and songs.
     * @return a list of MusicCategoriesEntities containing music categories and songs.
     * @author AnhTTH
     */
    private fun getListMusicFromJson(
        context: Context, name: String
    ): MutableList<MusicCategoriesEntities> {
        name.readJsonFromAssets(context)?.let {
            try {
                val item = Gson().fromJson<ArrayList<MusicCategoriesEntities>?>(
                    it, object : TypeToken<ArrayList<MusicCategoriesEntities>>() {}.type
                )

                return item
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        return mutableListOf()
    }

    /**
     * Reads JSON data from a file in the assets folder.
     * @param context the context used for accessing assets.
     * @return the JSON string read from the file.
     * @author AnhTTH
     */
    private fun String.readJsonFromAssets(context: Context): String? {
        var json: String? = null
        try {
            val inputStream = context.assets.open(this)
            json = inputStream.bufferedReader().use { it.readText() }
            inputStream.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return json
    }
}