// Generated by Dagger (https://dagger.dev).
package com.example.appa.ui.activity.main.ringtones.category;

import com.example.appa.data.repository.favorite.FavoriteRepo;
import com.example.appa.data.repository.recent.RecentRepo;
import com.example.appa.data.repository.server.MusicServerRepo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class CategoryVM_Factory implements Factory<CategoryVM> {
  private final Provider<MusicServerRepo> musicServerRepoProvider;

  private final Provider<RecentRepo> recentRepoProvider;

  private final Provider<FavoriteRepo> favoriteRepoProvider;

  public CategoryVM_Factory(Provider<MusicServerRepo> musicServerRepoProvider,
      Provider<RecentRepo> recentRepoProvider, Provider<FavoriteRepo> favoriteRepoProvider) {
    this.musicServerRepoProvider = musicServerRepoProvider;
    this.recentRepoProvider = recentRepoProvider;
    this.favoriteRepoProvider = favoriteRepoProvider;
  }

  @Override
  public CategoryVM get() {
    return newInstance(musicServerRepoProvider.get(), recentRepoProvider.get(), favoriteRepoProvider.get());
  }

  public static CategoryVM_Factory create(Provider<MusicServerRepo> musicServerRepoProvider,
      Provider<RecentRepo> recentRepoProvider, Provider<FavoriteRepo> favoriteRepoProvider) {
    return new CategoryVM_Factory(musicServerRepoProvider, recentRepoProvider, favoriteRepoProvider);
  }

  public static CategoryVM newInstance(MusicServerRepo musicServerRepo, RecentRepo recentRepo,
      FavoriteRepo favoriteRepo) {
    return new CategoryVM(musicServerRepo, recentRepo, favoriteRepo);
  }
}
