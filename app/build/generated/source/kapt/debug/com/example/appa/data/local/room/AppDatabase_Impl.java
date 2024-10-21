package com.example.appa.data.local.room;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile LanguageDao _languageDao;

  private volatile MusicServerDao _musicServerDao;

  private volatile FavoriteDao _favoriteDao;

  private volatile RecentDao _recentDao;

  private volatile MySoundDao _mySoundDao;

  private volatile SearchDao _searchDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `LanguageUI` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT, `code` TEXT, `isSelected` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `MusicServerCategoriesUI` (`name` TEXT NOT NULL, `numberSong` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `MusicServerUI` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `category` TEXT NOT NULL, `duration` TEXT NOT NULL, `path` TEXT NOT NULL, `isFavorite` INTEGER NOT NULL, `pathDownload` TEXT)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `ItemFavoriteUI` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `path` TEXT NOT NULL, `name` TEXT NOT NULL, `category` TEXT NOT NULL, `duration` TEXT NOT NULL, `durationLong` INTEGER, `pathDownload` TEXT)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `ItemRecent` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `path` TEXT NOT NULL, `category` TEXT NOT NULL, `duration` TEXT NOT NULL, `nameSound` TEXT NOT NULL, `isFavorite` INTEGER NOT NULL, `timeAdd` INTEGER NOT NULL, `pathDownload` TEXT)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `ItemMySoundUI` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `nameRingtone` TEXT, `durationLong` INTEGER NOT NULL, `path` TEXT)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `ItemRecommend` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `nameOriginal` TEXT, `nameRecommend` TEXT)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3cbb4c9064be8e31bc59d4afb766148e')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `LanguageUI`");
        db.execSQL("DROP TABLE IF EXISTS `MusicServerCategoriesUI`");
        db.execSQL("DROP TABLE IF EXISTS `MusicServerUI`");
        db.execSQL("DROP TABLE IF EXISTS `ItemFavoriteUI`");
        db.execSQL("DROP TABLE IF EXISTS `ItemRecent`");
        db.execSQL("DROP TABLE IF EXISTS `ItemMySoundUI`");
        db.execSQL("DROP TABLE IF EXISTS `ItemRecommend`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsLanguageUI = new HashMap<String, TableInfo.Column>(4);
        _columnsLanguageUI.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLanguageUI.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLanguageUI.put("code", new TableInfo.Column("code", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLanguageUI.put("isSelected", new TableInfo.Column("isSelected", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLanguageUI = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLanguageUI = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLanguageUI = new TableInfo("LanguageUI", _columnsLanguageUI, _foreignKeysLanguageUI, _indicesLanguageUI);
        final TableInfo _existingLanguageUI = TableInfo.read(db, "LanguageUI");
        if (!_infoLanguageUI.equals(_existingLanguageUI)) {
          return new RoomOpenHelper.ValidationResult(false, "LanguageUI(com.example.appa.data.model.LanguageUI).\n"
                  + " Expected:\n" + _infoLanguageUI + "\n"
                  + " Found:\n" + _existingLanguageUI);
        }
        final HashMap<String, TableInfo.Column> _columnsMusicServerCategoriesUI = new HashMap<String, TableInfo.Column>(3);
        _columnsMusicServerCategoriesUI.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMusicServerCategoriesUI.put("numberSong", new TableInfo.Column("numberSong", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMusicServerCategoriesUI.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMusicServerCategoriesUI = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMusicServerCategoriesUI = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMusicServerCategoriesUI = new TableInfo("MusicServerCategoriesUI", _columnsMusicServerCategoriesUI, _foreignKeysMusicServerCategoriesUI, _indicesMusicServerCategoriesUI);
        final TableInfo _existingMusicServerCategoriesUI = TableInfo.read(db, "MusicServerCategoriesUI");
        if (!_infoMusicServerCategoriesUI.equals(_existingMusicServerCategoriesUI)) {
          return new RoomOpenHelper.ValidationResult(false, "MusicServerCategoriesUI(com.example.appa.data.model.musicserver.MusicServerCategoriesUI).\n"
                  + " Expected:\n" + _infoMusicServerCategoriesUI + "\n"
                  + " Found:\n" + _existingMusicServerCategoriesUI);
        }
        final HashMap<String, TableInfo.Column> _columnsMusicServerUI = new HashMap<String, TableInfo.Column>(7);
        _columnsMusicServerUI.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMusicServerUI.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMusicServerUI.put("category", new TableInfo.Column("category", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMusicServerUI.put("duration", new TableInfo.Column("duration", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMusicServerUI.put("path", new TableInfo.Column("path", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMusicServerUI.put("isFavorite", new TableInfo.Column("isFavorite", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMusicServerUI.put("pathDownload", new TableInfo.Column("pathDownload", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMusicServerUI = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMusicServerUI = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMusicServerUI = new TableInfo("MusicServerUI", _columnsMusicServerUI, _foreignKeysMusicServerUI, _indicesMusicServerUI);
        final TableInfo _existingMusicServerUI = TableInfo.read(db, "MusicServerUI");
        if (!_infoMusicServerUI.equals(_existingMusicServerUI)) {
          return new RoomOpenHelper.ValidationResult(false, "MusicServerUI(com.example.appa.data.model.musicserver.MusicServerUI).\n"
                  + " Expected:\n" + _infoMusicServerUI + "\n"
                  + " Found:\n" + _existingMusicServerUI);
        }
        final HashMap<String, TableInfo.Column> _columnsItemFavoriteUI = new HashMap<String, TableInfo.Column>(7);
        _columnsItemFavoriteUI.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemFavoriteUI.put("path", new TableInfo.Column("path", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemFavoriteUI.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemFavoriteUI.put("category", new TableInfo.Column("category", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemFavoriteUI.put("duration", new TableInfo.Column("duration", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemFavoriteUI.put("durationLong", new TableInfo.Column("durationLong", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemFavoriteUI.put("pathDownload", new TableInfo.Column("pathDownload", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysItemFavoriteUI = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesItemFavoriteUI = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoItemFavoriteUI = new TableInfo("ItemFavoriteUI", _columnsItemFavoriteUI, _foreignKeysItemFavoriteUI, _indicesItemFavoriteUI);
        final TableInfo _existingItemFavoriteUI = TableInfo.read(db, "ItemFavoriteUI");
        if (!_infoItemFavoriteUI.equals(_existingItemFavoriteUI)) {
          return new RoomOpenHelper.ValidationResult(false, "ItemFavoriteUI(com.example.appa.data.model.ItemFavoriteUI).\n"
                  + " Expected:\n" + _infoItemFavoriteUI + "\n"
                  + " Found:\n" + _existingItemFavoriteUI);
        }
        final HashMap<String, TableInfo.Column> _columnsItemRecent = new HashMap<String, TableInfo.Column>(8);
        _columnsItemRecent.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemRecent.put("path", new TableInfo.Column("path", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemRecent.put("category", new TableInfo.Column("category", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemRecent.put("duration", new TableInfo.Column("duration", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemRecent.put("nameSound", new TableInfo.Column("nameSound", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemRecent.put("isFavorite", new TableInfo.Column("isFavorite", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemRecent.put("timeAdd", new TableInfo.Column("timeAdd", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemRecent.put("pathDownload", new TableInfo.Column("pathDownload", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysItemRecent = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesItemRecent = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoItemRecent = new TableInfo("ItemRecent", _columnsItemRecent, _foreignKeysItemRecent, _indicesItemRecent);
        final TableInfo _existingItemRecent = TableInfo.read(db, "ItemRecent");
        if (!_infoItemRecent.equals(_existingItemRecent)) {
          return new RoomOpenHelper.ValidationResult(false, "ItemRecent(com.example.appa.data.model.ItemRecent).\n"
                  + " Expected:\n" + _infoItemRecent + "\n"
                  + " Found:\n" + _existingItemRecent);
        }
        final HashMap<String, TableInfo.Column> _columnsItemMySoundUI = new HashMap<String, TableInfo.Column>(4);
        _columnsItemMySoundUI.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemMySoundUI.put("nameRingtone", new TableInfo.Column("nameRingtone", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemMySoundUI.put("durationLong", new TableInfo.Column("durationLong", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemMySoundUI.put("path", new TableInfo.Column("path", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysItemMySoundUI = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesItemMySoundUI = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoItemMySoundUI = new TableInfo("ItemMySoundUI", _columnsItemMySoundUI, _foreignKeysItemMySoundUI, _indicesItemMySoundUI);
        final TableInfo _existingItemMySoundUI = TableInfo.read(db, "ItemMySoundUI");
        if (!_infoItemMySoundUI.equals(_existingItemMySoundUI)) {
          return new RoomOpenHelper.ValidationResult(false, "ItemMySoundUI(com.example.appa.data.model.ItemMySoundUI).\n"
                  + " Expected:\n" + _infoItemMySoundUI + "\n"
                  + " Found:\n" + _existingItemMySoundUI);
        }
        final HashMap<String, TableInfo.Column> _columnsItemRecommend = new HashMap<String, TableInfo.Column>(3);
        _columnsItemRecommend.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemRecommend.put("nameOriginal", new TableInfo.Column("nameOriginal", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemRecommend.put("nameRecommend", new TableInfo.Column("nameRecommend", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysItemRecommend = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesItemRecommend = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoItemRecommend = new TableInfo("ItemRecommend", _columnsItemRecommend, _foreignKeysItemRecommend, _indicesItemRecommend);
        final TableInfo _existingItemRecommend = TableInfo.read(db, "ItemRecommend");
        if (!_infoItemRecommend.equals(_existingItemRecommend)) {
          return new RoomOpenHelper.ValidationResult(false, "ItemRecommend(com.example.appa.data.model.ItemRecommend).\n"
                  + " Expected:\n" + _infoItemRecommend + "\n"
                  + " Found:\n" + _existingItemRecommend);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "3cbb4c9064be8e31bc59d4afb766148e", "57fa9640014546e60401f91e8c9c1d02");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "LanguageUI","MusicServerCategoriesUI","MusicServerUI","ItemFavoriteUI","ItemRecent","ItemMySoundUI","ItemRecommend");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `LanguageUI`");
      _db.execSQL("DELETE FROM `MusicServerCategoriesUI`");
      _db.execSQL("DELETE FROM `MusicServerUI`");
      _db.execSQL("DELETE FROM `ItemFavoriteUI`");
      _db.execSQL("DELETE FROM `ItemRecent`");
      _db.execSQL("DELETE FROM `ItemMySoundUI`");
      _db.execSQL("DELETE FROM `ItemRecommend`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(LanguageDao.class, LanguageDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(MusicServerDao.class, MusicServerDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(FavoriteDao.class, FavoriteDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(RecentDao.class, RecentDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(MySoundDao.class, MySoundDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(SearchDao.class, SearchDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public LanguageDao languageDao() {
    if (_languageDao != null) {
      return _languageDao;
    } else {
      synchronized(this) {
        if(_languageDao == null) {
          _languageDao = new LanguageDao_Impl(this);
        }
        return _languageDao;
      }
    }
  }

  @Override
  public MusicServerDao musicServerDao() {
    if (_musicServerDao != null) {
      return _musicServerDao;
    } else {
      synchronized(this) {
        if(_musicServerDao == null) {
          _musicServerDao = new MusicServerDao_Impl(this);
        }
        return _musicServerDao;
      }
    }
  }

  @Override
  public FavoriteDao favouriteDao() {
    if (_favoriteDao != null) {
      return _favoriteDao;
    } else {
      synchronized(this) {
        if(_favoriteDao == null) {
          _favoriteDao = new FavoriteDao_Impl(this);
        }
        return _favoriteDao;
      }
    }
  }

  @Override
  public RecentDao recentDao() {
    if (_recentDao != null) {
      return _recentDao;
    } else {
      synchronized(this) {
        if(_recentDao == null) {
          _recentDao = new RecentDao_Impl(this);
        }
        return _recentDao;
      }
    }
  }

  @Override
  public MySoundDao mySoundDao() {
    if (_mySoundDao != null) {
      return _mySoundDao;
    } else {
      synchronized(this) {
        if(_mySoundDao == null) {
          _mySoundDao = new MySoundDao_Impl(this);
        }
        return _mySoundDao;
      }
    }
  }

  @Override
  public SearchDao searchDao() {
    if (_searchDao != null) {
      return _searchDao;
    } else {
      synchronized(this) {
        if(_searchDao == null) {
          _searchDao = new SearchDao_Impl(this);
        }
        return _searchDao;
      }
    }
  }
}
