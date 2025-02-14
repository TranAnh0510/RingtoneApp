// Generated by Dagger (https://dagger.dev).
package com.example.appa.data.repository.mysound;

import com.example.appa.data.local.room.MySoundDao;
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
public final class MySoundRepoImpl_Factory implements Factory<MySoundRepoImpl> {
  private final Provider<MySoundDao> mySoundDaoProvider;

  public MySoundRepoImpl_Factory(Provider<MySoundDao> mySoundDaoProvider) {
    this.mySoundDaoProvider = mySoundDaoProvider;
  }

  @Override
  public MySoundRepoImpl get() {
    return newInstance(mySoundDaoProvider.get());
  }

  public static MySoundRepoImpl_Factory create(Provider<MySoundDao> mySoundDaoProvider) {
    return new MySoundRepoImpl_Factory(mySoundDaoProvider);
  }

  public static MySoundRepoImpl newInstance(MySoundDao mySoundDao) {
    return new MySoundRepoImpl(mySoundDao);
  }
}
