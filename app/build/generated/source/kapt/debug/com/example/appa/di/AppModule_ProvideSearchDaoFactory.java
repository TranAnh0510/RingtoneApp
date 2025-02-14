// Generated by Dagger (https://dagger.dev).
package com.example.appa.di;

import com.example.appa.data.local.room.AppDatabase;
import com.example.appa.data.local.room.SearchDao;
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
public final class AppModule_ProvideSearchDaoFactory implements Factory<SearchDao> {
  private final AppModule module;

  private final Provider<AppDatabase> databaseProvider;

  public AppModule_ProvideSearchDaoFactory(AppModule module,
      Provider<AppDatabase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public SearchDao get() {
    return provideSearchDao(module, databaseProvider.get());
  }

  public static AppModule_ProvideSearchDaoFactory create(AppModule module,
      Provider<AppDatabase> databaseProvider) {
    return new AppModule_ProvideSearchDaoFactory(module, databaseProvider);
  }

  public static SearchDao provideSearchDao(AppModule instance, AppDatabase database) {
    return Preconditions.checkNotNullFromProvides(instance.provideSearchDao(database));
  }
}
