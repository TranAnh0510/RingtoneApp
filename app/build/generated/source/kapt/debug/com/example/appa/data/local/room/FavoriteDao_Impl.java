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
import com.example.appa.data.model.ItemFavoriteUI;
import java.lang.Class;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FavoriteDao_Impl implements FavoriteDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ItemFavoriteUI> __insertionAdapterOfItemFavoriteUI;

  private final SharedSQLiteStatement __preparedStmtOfDeleteFavourite;

  private final SharedSQLiteStatement __preparedStmtOfUpdatePathDownload;

  public FavoriteDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfItemFavoriteUI = new EntityInsertionAdapter<ItemFavoriteUI>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `ItemFavoriteUI` (`id`,`path`,`name`,`category`,`duration`,`durationLong`,`pathDownload`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ItemFavoriteUI entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getPath() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getPath());
        }
        if (entity.getName() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getName());
        }
        if (entity.getCategory() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getCategory());
        }
        if (entity.getDuration() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getDuration());
        }
        if (entity.getDurationLong() == null) {
          statement.bindNull(6);
        } else {
          statement.bindLong(6, entity.getDurationLong());
        }
        if (entity.getPathDownload() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getPathDownload());
        }
      }
    };
    this.__preparedStmtOfDeleteFavourite = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM ItemFavoriteUI where path=?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdatePathDownload = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "Update ItemFavoriteUI set pathDownload=? where path=?";
        return _query;
      }
    };
  }

  @Override
  public long insertFavorite(final ItemFavoriteUI itemFavorite) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final long _result = __insertionAdapterOfItemFavoriteUI.insertAndReturnId(itemFavorite);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteFavourite(final String path) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteFavourite.acquire();
    int _argIndex = 1;
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
      __preparedStmtOfDeleteFavourite.release(_stmt);
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
  public List<ItemFavoriteUI> getALlFavorite() {
    final String _sql = "select * from ItemFavoriteUI ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfPath = CursorUtil.getColumnIndexOrThrow(_cursor, "path");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
      final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
      final int _cursorIndexOfDurationLong = CursorUtil.getColumnIndexOrThrow(_cursor, "durationLong");
      final int _cursorIndexOfPathDownload = CursorUtil.getColumnIndexOrThrow(_cursor, "pathDownload");
      final List<ItemFavoriteUI> _result = new ArrayList<ItemFavoriteUI>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final ItemFavoriteUI _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpPath;
        if (_cursor.isNull(_cursorIndexOfPath)) {
          _tmpPath = null;
        } else {
          _tmpPath = _cursor.getString(_cursorIndexOfPath);
        }
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
        final Long _tmpDurationLong;
        if (_cursor.isNull(_cursorIndexOfDurationLong)) {
          _tmpDurationLong = null;
        } else {
          _tmpDurationLong = _cursor.getLong(_cursorIndexOfDurationLong);
        }
        final String _tmpPathDownload;
        if (_cursor.isNull(_cursorIndexOfPathDownload)) {
          _tmpPathDownload = null;
        } else {
          _tmpPathDownload = _cursor.getString(_cursorIndexOfPathDownload);
        }
        _item = new ItemFavoriteUI(_tmpId,_tmpPath,_tmpName,_tmpCategory,_tmpDuration,_tmpDurationLong,_tmpPathDownload);
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
