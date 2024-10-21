package com.example.appa.di;

/**
 * Initialization according to the single tone component is only Initialized once
 * initialization room database
 * @author AnhTTH
 */
@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007\u00a8\u0006\u0016"}, d2 = {"Lcom/example/appa/di/AppModule;", "", "()V", "provideFavouriteDao", "Lcom/example/appa/data/local/room/FavoriteDao;", "database", "Lcom/example/appa/data/local/room/AppDatabase;", "provideLanguageDao", "Lcom/example/appa/data/local/room/LanguageDao;", "provideMusicServerDao", "Lcom/example/appa/data/local/room/MusicServerDao;", "provideMySoundDao", "Lcom/example/appa/data/local/room/MySoundDao;", "provideRecentDao", "Lcom/example/appa/data/local/room/RecentDao;", "provideRoomDb3", "context", "Landroid/app/Application;", "provideSearchDao", "Lcom/example/appa/data/local/room/SearchDao;", "provideSharedPreference", "Landroid/content/SharedPreferences;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    
    public AppModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences provideSharedPreference(@org.jetbrains.annotations.Nullable()
    android.app.Application context) {
        return null;
    }
    
    /**
     * initialization room database
     * @author AnhTTH
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.appa.data.local.room.AppDatabase provideRoomDb3(@org.jetbrains.annotations.NotNull()
    android.app.Application context) {
        return null;
    }
    
    /**
     * Provide Language Dao from App database
     * @param database  RoomDatabase in this app.
     * @author AnhTTH
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.appa.data.local.room.LanguageDao provideLanguageDao(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.local.room.AppDatabase database) {
        return null;
    }
    
    /**
     * Provide MusicServer Dao from App database
     * @param database  RoomDatabase in this app.
     * @author AnhTTH
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.appa.data.local.room.MusicServerDao provideMusicServerDao(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.local.room.AppDatabase database) {
        return null;
    }
    
    /**
     * Provide Favourite Dao from App database
     * @param database  RoomDatabase in this app.
     * @author AnhTTH
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.appa.data.local.room.FavoriteDao provideFavouriteDao(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.local.room.AppDatabase database) {
        return null;
    }
    
    /**
     * Provide Recent Dao from App database
     * @param database  RoomDatabase in this app.
     * @author AnhTTH
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.appa.data.local.room.RecentDao provideRecentDao(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.local.room.AppDatabase database) {
        return null;
    }
    
    /**
     * Provide MySound Dao from App database
     * @param database  RoomDatabase in this app.
     * @author AnhTTH
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.appa.data.local.room.MySoundDao provideMySoundDao(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.local.room.AppDatabase database) {
        return null;
    }
    
    /**
     * Provide Search Dao from App database
     * @param database  RoomDatabase in this app.
     * @author AnhTTH
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.appa.data.local.room.SearchDao provideSearchDao(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.local.room.AppDatabase database) {
        return null;
    }
}