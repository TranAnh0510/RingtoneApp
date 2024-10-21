package com.example.appa.di

import android.app.Application
import android.content.SharedPreferences
import android.preference.PreferenceManager
import androidx.room.Room
import com.example.appa.data.local.room.AppDatabase
import com.example.appa.data.local.room.FavoriteDao
import com.example.appa.data.local.room.LanguageDao
import com.example.appa.data.local.room.MusicServerDao
import com.example.appa.data.local.room.MySoundDao
import com.example.appa.data.local.room.RecentDao
import com.example.appa.data.local.room.SearchDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Initialization according to the single tone component is only Initialized once
 *  initialization room database
 *  @author AnhTTH
 */

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideSharedPreference(context: Application?): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }

    /**
     * initialization room database
     * @author AnhTTH
     */
    @Provides
    @Singleton
    fun provideRoomDb3(context: Application): AppDatabase {
        return Room.databaseBuilder(
            context, AppDatabase::class.java, AppDatabase.DATABASE_NAME
        ).allowMainThreadQueries().build()
    }

    /**
     * Provide Language Dao from App database
     * @param database  RoomDatabase in this app.
     * @author AnhTTH
     */
    @Provides
    @Singleton
    fun provideLanguageDao(database: AppDatabase): LanguageDao {
        return database.languageDao()
    }

    /**
     * Provide MusicServer Dao from App database
     * @param database  RoomDatabase in this app.
     * @author AnhTTH
     */
    @Provides
    @Singleton
    fun provideMusicServerDao(database: AppDatabase): MusicServerDao {
        return database.musicServerDao()
    }

    /**
     * Provide Favourite Dao from App database
     * @param database  RoomDatabase in this app.
     * @author AnhTTH
     */
    @Provides
    @Singleton
    fun provideFavouriteDao(database: AppDatabase): FavoriteDao {
        return database.favouriteDao()
    }

    /**
     * Provide Recent Dao from App database
     * @param database  RoomDatabase in this app.
     * @author AnhTTH
     */
    @Provides
    @Singleton
    fun provideRecentDao(database: AppDatabase): RecentDao {
        return database.recentDao()
    }

    /**
     * Provide MySound Dao from App database
     * @param database  RoomDatabase in this app.
     * @author AnhTTH
     */
    @Provides
    @Singleton
    fun provideMySoundDao(database: AppDatabase): MySoundDao {
        return database.mySoundDao()
    }

    /**
     * Provide Search Dao from App database
     * @param database  RoomDatabase in this app.
     * @author AnhTTH
     */
    @Provides
    @Singleton
    fun provideSearchDao(database: AppDatabase): SearchDao {
        return database.searchDao()
    }
}