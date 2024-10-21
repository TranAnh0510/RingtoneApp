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
import com.example.appa.data.model.ItemRecent;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RecentDao_Impl implements RecentDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ItemRecent> __insertionAdapterOfItemRecent;

  private final SharedSQLiteStatement __preparedStmtOfUpdateTimeRecent;

  private final SharedSQLiteStatement __preparedStmtOfUpdatePathDownload;

  public RecentDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfItemRecent = new EntityInsertionAdapter<ItemRecent>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `ItemRecent` (`id`,`path`,`category`,`duration`,`nameSound`,`isFavorite`,`timeAdd`,`pathDownload`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ItemRecent entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getPath() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getPath());
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
        if (entity.getNameSound() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getNameSound());
        }
        final int _tmp = entity.isFavorite() ? 1 : 0;
        statement.bindLong(6, _tmp);
        statement.bindLong(7, entity.getTimeAdd());
        if (entity.getPathDownload() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getPathDownload());
        }
      }
    };
    this.__preparedStmtOfUpdateTimeRecent = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update ItemRecent set timeAdd=? where path=?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdatePathDownload = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "Update ItemRecent set pathDownload=? where path=?";
        return _query;
      }
    };
  }

  @Override
  public long insertRecent(final ItemRecent imageDetail) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final long _result = __insertionAdapterOfItemRecent.insertAndReturnId(imageDetail);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateTimeRecent(final long time, final String path) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateTimeRecent.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, time);
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
      __preparedStmtOfUpdateTimeRecent.release(_stmt);
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
  public List<ItemRecent> getALlRecent() {
    final String _sql = "SELECT * FROM ItemRecent ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfPath = CursorUtil.getColumnIndexOrThrow(_cursor, "path");
      final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
      final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
      final int _cursorIndexOfNameSound = CursorUtil.getColumnIndexOrThrow(_cursor, "nameSound");
      final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
      final int _cursorIndexOfTimeAdd = CursorUtil.getColumnIndexOrThrow(_cursor, "timeAdd");
      final int _cursorIndexOfPathDownload = CursorUtil.getColumnIndexOrThrow(_cursor, "pathDownload");
      final List<ItemRecent> _result = new ArrayList<ItemRecent>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final ItemRecent _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpPath;
        if (_cursor.isNull(_cursorIndexOfPath)) {
          _tmpPath = null;
        } else {
          _tmpPath = _cursor.getString(_cursorIndexOfPath);
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
        final String _tmpNameSound;
        if (_cursor.isNull(_cursorIndexOfNameSound)) {
          _tmpNameSound = null;
        } else {
          _tmpNameSound = _cursor.getString(_cursorIndexOfNameSound);
        }
        final boolean _tmpIsFavorite;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
        _tmpIsFavorite = _tmp != 0;
        final long _tmpTimeAdd;
        _tmpTimeAdd = _cursor.getLong(_cursorIndexOfTimeAdd);
        final String _tmpPathDownload;
        if (_cursor.isNull(_cursorIndexOfPathDownload)) {
          _tmpPathDownload = null;
        } else {
          _tmpPathDownload = _cursor.getString(_cursorIndexOfPathDownload);
        }
        _item = new ItemRecent(_tmpId,_tmpPath,_tmpCategory,_tmpDuration,_tmpNameSound,_tmpIsFavorite,_tmpTimeAdd,_tmpPathDownload);
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
