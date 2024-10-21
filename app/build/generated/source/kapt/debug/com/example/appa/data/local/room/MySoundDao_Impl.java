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
import com.example.appa.data.model.ItemMySoundUI;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MySoundDao_Impl implements MySoundDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ItemMySoundUI> __insertionAdapterOfItemMySoundUI;

  private final SharedSQLiteStatement __preparedStmtOfDeleteMySound;

  private final SharedSQLiteStatement __preparedStmtOfUpdateNameMySound;

  public MySoundDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfItemMySoundUI = new EntityInsertionAdapter<ItemMySoundUI>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `ItemMySoundUI` (`id`,`nameRingtone`,`durationLong`,`path`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ItemMySoundUI entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getNameRingtone() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getNameRingtone());
        }
        statement.bindLong(3, entity.getDurationLong());
        if (entity.getPath() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getPath());
        }
      }
    };
    this.__preparedStmtOfDeleteMySound = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM ItemMySoundUI where path=?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateNameMySound = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "update ItemMySoundUI Set nameRingtone =? where id=?";
        return _query;
      }
    };
  }

  @Override
  public long insertMySound(final ItemMySoundUI itemMySound) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final long _result = __insertionAdapterOfItemMySoundUI.insertAndReturnId(itemMySound);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteMySound(final String path) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteMySound.acquire();
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
      __preparedStmtOfDeleteMySound.release(_stmt);
    }
  }

  @Override
  public void updateNameMySound(final String name, final long id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateNameMySound.acquire();
    int _argIndex = 1;
    if (name == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, name);
    }
    _argIndex = 2;
    _stmt.bindLong(_argIndex, id);
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateNameMySound.release(_stmt);
    }
  }

  @Override
  public List<ItemMySoundUI> getALlMySound() {
    final String _sql = "select * from ItemMySoundUI ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfNameRingtone = CursorUtil.getColumnIndexOrThrow(_cursor, "nameRingtone");
      final int _cursorIndexOfDurationLong = CursorUtil.getColumnIndexOrThrow(_cursor, "durationLong");
      final int _cursorIndexOfPath = CursorUtil.getColumnIndexOrThrow(_cursor, "path");
      final List<ItemMySoundUI> _result = new ArrayList<ItemMySoundUI>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final ItemMySoundUI _item;
        _item = new ItemMySoundUI();
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpNameRingtone;
        if (_cursor.isNull(_cursorIndexOfNameRingtone)) {
          _tmpNameRingtone = null;
        } else {
          _tmpNameRingtone = _cursor.getString(_cursorIndexOfNameRingtone);
        }
        _item.setNameRingtone(_tmpNameRingtone);
        final long _tmpDurationLong;
        _tmpDurationLong = _cursor.getLong(_cursorIndexOfDurationLong);
        _item.setDurationLong(_tmpDurationLong);
        final String _tmpPath;
        if (_cursor.isNull(_cursorIndexOfPath)) {
          _tmpPath = null;
        } else {
          _tmpPath = _cursor.getString(_cursorIndexOfPath);
        }
        _item.setPath(_tmpPath);
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
