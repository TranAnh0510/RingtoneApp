package com.example.appa.di

import android.app.Application
import com.example.appa.data.local.room.FavoriteDao
import com.example.appa.data.local.room.LanguageDao
import com.example.appa.data.local.room.MusicServerDao
import com.example.appa.data.local.room.MySoundDao
import com.example.appa.data.local.room.RecentDao
import com.example.appa.data.local.room.SearchDao
import com.example.appa.data.repository.audio.AudioDataSource
import com.example.appa.data.repository.audio.AudioDataSourceImpl
import com.example.appa.data.repository.audio.AudioRepo
import com.example.appa.data.repository.audio.AudioRepoImpl
import com.example.appa.data.repository.favorite.FavoriteRepo
import com.example.appa.data.repository.favorite.FavoriteRepoImpl
import com.example.appa.data.repository.file.FileRepo
import com.example.appa.data.repository.file.FileRepoImpl
import com.example.appa.data.repository.language.LanguageRepo
import com.example.appa.data.repository.language.LanguageRepoImpl
import com.example.appa.data.repository.mysound.MySoundRepo
import com.example.appa.data.repository.mysound.MySoundRepoImpl
import com.example.appa.data.repository.recent.RecentRepo
import com.example.appa.data.repository.recent.RecentRepoImpl
import com.example.appa.data.repository.recording.RecordingRepo
import com.example.appa.data.repository.recording.RecordingRepoImpl
import com.example.appa.data.repository.search.SearchRepo
import com.example.appa.data.repository.search.SearchRepoImpl
import com.example.appa.data.repository.server.MusicServerRepo
import com.example.appa.data.repository.server.MusicServerRepoImpl
import com.example.appa.data.repository.video.VideoDataSource
import com.example.appa.data.repository.video.VideoDataSourceImpl
import com.example.appa.data.repository.video.VideoRepo
import com.example.appa.data.repository.video.VideoRepoImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Dagger module that provides repository implementations for various data sources.
 * @author AnhTTH
 */
@Module
@InstallIn(SingletonComponent::class)
class RepoModule {
    /**
     * Provides a singleton instance of [LanguageRepo].
     * @param languageDao The data access object for language data.
     * @return The [LanguageRepo] implementation.
     * @author AnhTTH
     */
    @Provides
    @Singleton
    fun provideLanguageRepo(languageDao: LanguageDao): LanguageRepo {
        return LanguageRepoImpl(languageDao)
    }

    /**
     * Provides a singleton instance of [RecentRepo].
     * @param recentDao The data access object for recent data.
     * @return The [RecentRepo] implementation.
     * @author AnhTTH
     */
    @Provides
    @Singleton
    fun provideRecentRepo(recentDao: RecentDao): RecentRepo {
        return RecentRepoImpl(recentDao)
    }

    /**
     * Provides a singleton instance of [SearchRepo].
     * @param searchDao The data access object for search data.
     * @return The [SearchRepo] implementation.
     * @author AnhTTH
     */
    @Provides
    @Singleton
    fun provideSearchRepo(searchDao: SearchDao): SearchRepo {
        return SearchRepoImpl(searchDao)
    }

    /**
     * Provides a singleton instance of [FavoriteRepo].
     * @param favoriteDao The data access object for favorite data.
     * @return The [FavoriteRepo] implementation.
     * @author AnhTTH
     */
    @Provides
    @Singleton
    fun provideFavoriteRepo(favoriteDao: FavoriteDao): FavoriteRepo {
        return FavoriteRepoImpl(favoriteDao)
    }

    /**
     * Provides a singleton instance of [MySoundRepo].
     * @param mySoundDao The data access object for my sound data.
     * @return The [MySoundRepo] implementation.
     * @author AnhTTH
     */
    @Provides
    @Singleton
    fun provideMySoundRepo(mySoundDao: MySoundDao): MySoundRepo {
        return MySoundRepoImpl(mySoundDao)
    }

    /**
     * Provides a singleton instance of [RecordingRepo].
     * @return The [RecordingRepo] implementation.
     * @author AnhTTH
     */
    @Provides
    @Singleton
    fun provideRecordingRepo(): RecordingRepo {
        return RecordingRepoImpl()
    }

    /**
     * Provides a singleton instance of [MusicServerRepo].
     * @param musicServerDao The data access object for music server data.
     * @param favoriteDao The data access object for favorite data.
     * @param recentDao The data access object for recent data.
     * @return The [MusicServerRepo] implementation.
     * @author AnhTTH
     */
    @Provides
    @Singleton
    fun provideMusicServerRepo(
        musicServerDao: MusicServerDao, favoriteDao: FavoriteDao, recentDao: RecentDao
    ): MusicServerRepo {
        return MusicServerRepoImpl(musicServerDao, favoriteDao, recentDao)
    }

    /**
     * Provides a singleton instance of [FileRepo].
     * @return The [FileRepo] implementation.
     * @author AnhTTH
     */
    @Provides
    @Singleton
    fun provideFileRepo(): FileRepo {
        return FileRepoImpl()
    }

    /**
     * Provides a singleton instance of [AudioDataSource].
     * @param context The application context.
     * @return The [AudioDataSource] implementation.
     * @author AnhTTH
     */
    @Provides
    @Singleton
    fun provideAudioDataSource(context: Application): AudioDataSource {
        return AudioDataSourceImpl(context)
    }

    /**
     * Provides a singleton instance of [AudioRepo].
     * @param audioDataSource The data source for audio data.
     * @return The [AudioRepo] implementation.
     * @author AnhTTH
     */
    @Provides
    @Singleton
    fun provideAudioRepo(audioDataSource: AudioDataSource): AudioRepo {
        return AudioRepoImpl(audioDataSource)
    }

    /**
     * Provides a singleton instance of [VideoDataSource].
     * @param context The application context.
     * @return The [VideoDataSource] implementation.
     * @author AnhTTH
     */

    @Provides
    @Singleton
    fun provideVideoDataSourceImpl(context: Application): VideoDataSource {
        return VideoDataSourceImpl(context)
    }

    /**
     * Provides a singleton instance of [VideoRepo].
     * @param videoDataSource The data source for video data.
     * @return The [VideoRepo] implementation.
     * @author AnhTTH
     */
    @Provides
    @Singleton
    fun provideVideoRepositoryImpl(videoDataSource: VideoDataSource): VideoRepo {
        return VideoRepoImpl(videoDataSource)
    }

}