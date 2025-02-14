// Generated by Dagger (https://dagger.dev).
package com.example.appa.ui.activity.main.ringtones.ringtonemore.video;

import com.example.appa.data.repository.video.VideoRepo;
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
public final class VideoVM_Factory implements Factory<VideoVM> {
  private final Provider<VideoRepo> videoRepoProvider;

  public VideoVM_Factory(Provider<VideoRepo> videoRepoProvider) {
    this.videoRepoProvider = videoRepoProvider;
  }

  @Override
  public VideoVM get() {
    return newInstance(videoRepoProvider.get());
  }

  public static VideoVM_Factory create(Provider<VideoRepo> videoRepoProvider) {
    return new VideoVM_Factory(videoRepoProvider);
  }

  public static VideoVM newInstance(VideoRepo videoRepo) {
    return new VideoVM(videoRepo);
  }
}
