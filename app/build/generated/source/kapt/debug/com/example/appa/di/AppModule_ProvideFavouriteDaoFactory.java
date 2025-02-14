// Generated by Dagger (https://dagger.dev).
package com.example.appa.di;

import com.example.appa.data.local.room.AppDatabase;
import com.example.appa.data.local.room.FavoriteDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_ProvideFavouriteDaoFactory implements Factory<FavoriteDao> {
  private final AppModule module;

  private final Provider<AppDatabase> databaseProvider;

  public AppModule_ProvideFavouriteDaoFactory(AppModule module,
      Provider<AppDatabase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public FavoriteDao get() {
    return provideFavouriteDao(module, databaseProvider.get());
  }

  public static AppModule_ProvideFavouriteDaoFactory create(AppModule module,
      Provider<AppDatabase> databaseProvider) {
    return new AppModule_ProvideFavouriteDaoFactory(module, databaseProvider);
  }

  public static FavoriteDao provideFavouriteDao(AppModule instance, AppDatabase database) {
    return Preconditions.checkNotNullFromProvides(instance.provideFavouriteDao(database));
  }
}
