package com.example.appa.di;

/**
 * Dagger module that provides repository implementations for various data sources.
 * @author AnhTTH
 */
@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\b\u0010 \u001a\u00020!H\u0007J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0007J\u0010\u0010&\u001a\u00020\'2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\'H\u0007\u00a8\u0006+"}, d2 = {"Lcom/example/appa/di/RepoModule;", "", "()V", "provideAudioDataSource", "Lcom/example/appa/data/repository/audio/AudioDataSource;", "context", "Landroid/app/Application;", "provideAudioRepo", "Lcom/example/appa/data/repository/audio/AudioRepo;", "audioDataSource", "provideFavoriteRepo", "Lcom/example/appa/data/repository/favorite/FavoriteRepo;", "favoriteDao", "Lcom/example/appa/data/local/room/FavoriteDao;", "provideFileRepo", "Lcom/example/appa/data/repository/file/FileRepo;", "provideLanguageRepo", "Lcom/example/appa/data/repository/language/LanguageRepo;", "languageDao", "Lcom/example/appa/data/local/room/LanguageDao;", "provideMusicServerRepo", "Lcom/example/appa/data/repository/server/MusicServerRepo;", "musicServerDao", "Lcom/example/appa/data/local/room/MusicServerDao;", "recentDao", "Lcom/example/appa/data/local/room/RecentDao;", "provideMySoundRepo", "Lcom/example/appa/data/repository/mysound/MySoundRepo;", "mySoundDao", "Lcom/example/appa/data/local/room/MySoundDao;", "provideRecentRepo", "Lcom/example/appa/data/repository/recent/RecentRepo;", "provideRecordingRepo", "Lcom/example/appa/data/repository/recording/RecordingRepo;", "provideSearchRepo", "Lcom/example/appa/data/repository/search/SearchRepo;", "searchDao", "Lcom/example/appa/data/local/room/SearchDao;", "provideVideoDataSourceImpl", "Lcom/example/appa/data/repository/video/VideoDataSource;", "provideVideoRepositoryImpl", "Lcom/example/appa/data/repository/video/VideoRepo;", "videoDataSource", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class RepoModule {
    
    public RepoModule() {
        super();
    }
    
    /**
     * Provides a singleton instance of [LanguageRepo].
     * @param languageDao The data access object for language data.
     * @return The [LanguageRepo] implementation.
     * @author AnhTTH
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.appa.data.repository.language.LanguageRepo provideLanguageRepo(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.local.room.LanguageDao languageDao) {
        return null;
    }
    
    /**
     * Provides a singleton instance of [RecentRepo].
     * @param recentDao The data access object for recent data.
     * @return The [RecentRepo] implementation.
     * @author AnhTTH
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.appa.data.repository.recent.RecentRepo provideRecentRepo(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.local.room.RecentDao recentDao) {
        return null;
    }
    
    /**
     * Provides a singleton instance of [SearchRepo].
     * @param searchDao The data access object for search data.
     * @return The [SearchRepo] implementation.
     * @author AnhTTH
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.appa.data.repository.search.SearchRepo provideSearchRepo(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.local.room.SearchDao searchDao) {
        return null;
    }
    
    /**
     * Provides a singleton instance of [FavoriteRepo].
     * @param favoriteDao The data access object for favorite data.
     * @return The [FavoriteRepo] implementation.
     * @author AnhTTH
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.appa.data.repository.favorite.FavoriteRepo provideFavoriteRepo(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.local.room.FavoriteDao favoriteDao) {
        return null;
    }
    
    /**
     * Provides a singleton instance of [MySoundRepo].
     * @param mySoundDao The data access object for my sound data.
     * @return The [MySoundRepo] implementation.
     * @author AnhTTH
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.appa.data.repository.mysound.MySoundRepo provideMySoundRepo(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.local.room.MySoundDao mySoundDao) {
        return null;
    }
    
    /**
     * Provides a singleton instance of [RecordingRepo].
     * @return The [RecordingRepo] implementation.
     * @author AnhTTH
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.appa.data.repository.recording.RecordingRepo provideRecordingRepo() {
        return null;
    }
    
    /**
     * Provides a singleton instance of [MusicServerRepo].
     * @param musicServerDao The data access object for music server data.
     * @param favoriteDao The data access object for favorite data.
     * @param recentDao The data access object for recent data.
     * @return The [MusicServerRepo] implementation.
     * @author AnhTTH
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.appa.data.repository.server.MusicServerRepo provideMusicServerRepo(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.local.room.MusicServerDao musicServerDao, @org.jetbrains.annotations.NotNull()
    com.example.appa.data.local.room.FavoriteDao favoriteDao, @org.jetbrains.annotations.NotNull()
    com.example.appa.data.local.room.RecentDao recentDao) {
        return null;
    }
    
    /**
     * Provides a singleton instance of [FileRepo].
     * @return The [FileRepo] implementation.
     * @author AnhTTH
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.appa.data.repository.file.FileRepo provideFileRepo() {
        return null;
    }
    
    /**
     * Provides a singleton instance of [AudioDataSource].
     * @param context The application context.
     * @return The [AudioDataSource] implementation.
     * @author AnhTTH
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.appa.data.repository.audio.AudioDataSource provideAudioDataSource(@org.jetbrains.annotations.NotNull()
    android.app.Application context) {
        return null;
    }
    
    /**
     * Provides a singleton instance of [AudioRepo].
     * @param audioDataSource The data source for audio data.
     * @return The [AudioRepo] implementation.
     * @author AnhTTH
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.appa.data.repository.audio.AudioRepo provideAudioRepo(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.audio.AudioDataSource audioDataSource) {
        return null;
    }
    
    /**
     * Provides a singleton instance of [VideoDataSource].
     * @param context The application context.
     * @return The [VideoDataSource] implementation.
     * @author AnhTTH
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.appa.data.repository.video.VideoDataSource provideVideoDataSourceImpl(@org.jetbrains.annotations.NotNull()
    android.app.Application context) {
        return null;
    }
    
    /**
     * Provides a singleton instance of [VideoRepo].
     * @param videoDataSource The data source for video data.
     * @return The [VideoRepo] implementation.
     * @author AnhTTH
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.appa.data.repository.video.VideoRepo provideVideoRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.repository.video.VideoDataSource videoDataSource) {
        return null;
    }
}