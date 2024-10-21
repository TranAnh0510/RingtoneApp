package com.example.appa.data.local.room;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.appa.data.model.musicserver.MusicServerCategoriesUI;
import com.example.appa.data.model.musicserver.MusicServerUI;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MusicServerDao_Impl implements MusicServerDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MusicServerCategoriesUI> __insertionAdapterOfMusicServerCategoriesUI;

  private final EntityInsertionAdapter<MusicServerUI> __insertionAdapterOfMusicServerUI;

  private final SharedSQLiteStatement __preparedStmtOfUpdatePathDownload;

  public MusicServerDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMusicServerCategoriesUI = new EntityInsertionAdapter<MusicServerCategoriesUI>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `MusicServerCategoriesUI` (`name`,`numberSong`,`id`) VALUES (?,?,nullif(?, 0))";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final MusicServerCategoriesUI entity) {
        if (entity.getName() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getName());
        }
        statement.bindLong(2, entity.getNumberSong());
        statement.bindLong(3, entity.getId());
      }
    };
    this.__insertionAdapterOfMusicServerUI = new EntityInsertionAdapter<MusicServerUI>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `MusicServerUI` (`id`,`name`,`category`,`duration`,`path`,`isFavorite`,`pathDownload`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final MusicServerUI entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName());
        }
        if (entity.getCategory() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getCategory());
        }
        if (entity.getDuration() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getDuration());
        }
        if (entity.getPath() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getPath());
        }
        final int _tmp = entity.isFavorite() ? 1 : 0;
        statement.bindLong(6, _tmp);
        if (entity.getPathDownload() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getPathDownload());
        }
      }
    };
    this.__preparedStmtOfUpdatePathDownload = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update MusicServerUI set pathDownload =? where path=? ";
        return _query;
      }
    };
  }

  @Override
  public long insertCategory(final MusicServerCategoriesUI musicServerCategoriesUI) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final long _result = __insertionAdapterOfMusicServerCategoriesUI.insertAndReturnId(musicServerCategoriesUI);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long insertMusic(final MusicServerUI musicServerUI) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final long _result = __insertionAdapterOfMusicServerUI.insertAndReturnId(musicServerUI);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updatePathDownload(final String pathDownload, final String path) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdatePathDownload.acquire();
    int _argIndex = 1;
    if (pathDownload == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, pathDownload);
    }
    _argIndex = 2;
    if (path == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, path);
    }
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdatePathDownload.release(_stmt);
    }
  }

  @Override
  public List<MusicServerCategoriesUI> getALlCategory() {
    final String _sql = "select * from MusicServerCategoriesUI ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfNumberSong = CursorUtil.getColumnIndexOrThrow(_cursor, "numberSong");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final List<MusicServerCategoriesUI> _result = new ArrayList<MusicServerCategoriesUI>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final MusicServerCategoriesUI _item;
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final int _tmpNumberSong;
        _tmpNumberSong = _cursor.getInt(_cursorIndexOfNumberSong);
        _item = new MusicServerCategoriesUI(_tmpName,_tmpNumberSong);
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        _item.setId(_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<MusicServerUI> getALlListMusic(final String category) {
    final String _sql = "select * from MusicServerUI WHERE category=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (category == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, category);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
      final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
      final int _cursorIndexOfPath = CursorUtil.getColumnIndexOrThrow(_cursor, "path");
      final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
      final int _cursorIndexOfPathDownload = CursorUtil.getColumnIndexOrThrow(_cursor, "pathDownload");
      final List<MusicServerUI> _result = new ArrayList<MusicServerUI>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final MusicServerUI _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpCategory;
        if (_cursor.isNull(_cursorIndexOfCategory)) {
          _tmpCategory = null;
        } else {
          _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
        }
        final String _tmpDuration;
        if (_cursor.isNull(_cursorIndexOfDuration)) {
          _tmpDuration = null;
        } else {
          _tmpDuration = _cursor.getString(_cursorIndexOfDuration);
        }
        final String _tmpPath;
        if (_cursor.isNull(_cursorIndexOfPath)) {
          _tmpPath = null;
        } else {
          _tmpPath = _cursor.getString(_cursorIndexOfPath);
        }
        final boolean _tmpIsFavorite;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
        _tmpIsFavorite = _tmp != 0;
        final String _tmpPathDownload;
        if (_cursor.isNull(_cursorIndexOfPathDownload)) {
          _tmpPathDownload = null;
        } else {
          _tmpPathDownload = _cursor.getString(_cursorIndexOfPathDownload);
        }
        _item = new MusicServerUI(_tmpId,_tmpName,_tmpCategory,_tmpDuration,_tmpPath,_tmpIsFavorite,_tmpPathDownload);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<MusicServerUI> getALlListMusicSearch() {
    final String _sql = "select * from MusicServerUI ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
      final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
      final int _cursorIndexOfPath = CursorUtil.getColumnIndexOrThrow(_cursor, "path");
      final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
      final int _cursorIndexOfPathDownload = CursorUtil.getColumnIndexOrThrow(_cursor, "pathDownload");
      final List<MusicServerUI> _result = new ArrayList<MusicServerUI>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final MusicServerUI _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpCategory;
        if (_cursor.isNull(_cursorIndexOfCategory)) {
          _tmpCategory = null;
        } else {
          _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
        }
        final String _tmpDuration;
        if (_cursor.isNull(_cursorIndexOfDuration)) {
          _tmpDuration = null;
        } else {
          _tmpDuration = _cursor.getString(_cursorIndexOfDuration);
        }
        final String _tmpPath;
        if (_cursor.isNull(_cursorIndexOfPath)) {
          _tmpPath = null;
        } else {
          _tmpPath = _cursor.getString(_cursorIndexOfPath);
        }
        final boolean _tmpIsFavorite;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
        _tmpIsFavorite = _tmp != 0;
        final String _tmpPathDownload;
        if (_cursor.isNull(_cursorIndexOfPathDownload)) {
          _tmpPathDownload = null;
        } else {
          _tmpPathDownload = _cursor.getString(_cursorIndexOfPathDownload);
        }
        _item = new MusicServerUI(_tmpId,_tmpName,_tmpCategory,_tmpDuration,_tmpPath,_tmpIsFavorite,_tmpPathDownload);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
