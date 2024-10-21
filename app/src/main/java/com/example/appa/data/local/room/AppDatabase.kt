package com.example.appa.data.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.appa.data.model.ItemFavoriteUI
import com.example.appa.data.model.ItemMySoundUI
import com.example.appa.data.model.ItemRecent
import com.example.appa.data.model.ItemRecommend
import com.example.appa.data.model.LanguageUI
import com.example.appa.data.model.musicserver.MusicServerCategoriesUI
import com.example.appa.data.model.musicserver.MusicServerUI

/**
 * @see androidx.room.Database
 *
 * @author AnhTTH
 */
@Database(
    entities = [LanguageUI::class, MusicServerCategoriesUI::class, MusicServerUI::class, ItemFavoriteUI::class, ItemRecent::class, ItemMySoundUI::class, ItemRecommend::class],
    version = 1,
    exportSchema = false
)
/**
 * Local database in this App
 * @see androidx.room.RoomDatabase
 *
 * @author AnhTTH
 */
abstract class AppDatabase : RoomDatabase() {

    /**
     * Get language Dao to access language table.
     * @author AnhTTH
     */
    abstract fun languageDao(): LanguageDao

    /**
     * Get musicServerDao to access musicServer table.
     * @author AnhTTH
     */
    abstract fun musicServerDao(): MusicServerDao

    /**
     * Get favouriteDao to access favourite table.
     * @author AnhTTH
     */
    abstract fun favouriteDao(): FavoriteDao

    /**
     * Get recentDao to access recent table.
     * @author AnhTTH
     */
    abstract fun recentDao(): RecentDao

    /**
     * Get mySoundDao to access mySound table.
     * @author AnhTTH
     */
    abstract fun mySoundDao(): MySoundDao

    /**
     * Get searchDao to access search table.
     * @author AnhTTH
     */
    abstract fun searchDao(): SearchDao


    companion object {

        const val DATABASE_NAME: String = "DATABASE_NAME" }
}



