package com.example.appa.data.local.room;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.appa.data.model.LanguageUI;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LanguageDao_Impl implements LanguageDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<LanguageUI> __insertionAdapterOfLanguageUI;

  public LanguageDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLanguageUI = new EntityInsertionAdapter<LanguageUI>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `LanguageUI` (`id`,`name`,`code`,`isSelected`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final LanguageUI entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName());
        }
        if (entity.getCode() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getCode());
        }
        final int _tmp = entity.isSelected() ? 1 : 0;
        statement.bindLong(4, _tmp);
      }
    };
  }

  @Override
  public Object insertLanguage(final LanguageUI languageUI,
      final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfLanguageUI.insertAndReturnId(languageUI);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public List<LanguageUI> getAllLanguage() {
    final String _sql = "SELECT * FROM LanguageUI ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfCode = CursorUtil.getColumnIndexOrThrow(_cursor, "code");
      final int _cursorIndexOfIsSelected = CursorUtil.getColumnIndexOrThrow(_cursor, "isSelected");
      final List<LanguageUI> _result = new ArrayList<LanguageUI>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final LanguageUI _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpCode;
        if (_cursor.isNull(_cursorIndexOfCode)) {
          _tmpCode = null;
        } else {
          _tmpCode = _cursor.getString(_cursorIndexOfCode);
        }
        final boolean _tmpIsSelected;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsSelected);
        _tmpIsSelected = _tmp != 0;
        _item = new LanguageUI(_tmpId,_tmpName,_tmpCode,_tmpIsSelected);
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
