// Generated by Dagger (https://dagger.dev).
package com.example.appa.ui.activity.main.ringtones.ringtonemore.video;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class VideoVM_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static VideoVM_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(VideoVM_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final VideoVM_HiltModules_KeyModule_ProvideFactory INSTANCE = new VideoVM_HiltModules_KeyModule_ProvideFactory();
  }
}
