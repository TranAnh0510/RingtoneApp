package com.example.appa.data.local.room;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.appa.data.model.ItemRecommend;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SearchDao_Impl implements SearchDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ItemRecommend> __insertionAdapterOfItemRecommend;

  public SearchDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfItemRecommend = new EntityInsertionAdapter<ItemRecommend>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `ItemRecommend` (`id`,`nameOriginal`,`nameRecommend`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ItemRecommend entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getNameOriginal() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getNameOriginal());
        }
        if (entity.getNameRecommend() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getNameRecommend());
        }
      }
    };
  }

  @Override
  public long insertHistory(final ItemRecommend itemSearch) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final long _result = __insertionAdapterOfItemRecommend.insertAndReturnId(itemSearch);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<ItemRecommend> getALlRecent() {
    final String _sql = "SELECT * FROM ItemRecommend ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfNameOriginal = CursorUtil.getColumnIndexOrThrow(_cursor, "nameOriginal");
      final int _cursorIndexOfNameRecommend = CursorUtil.getColumnIndexOrThrow(_cursor, "nameRecommend");
      final List<ItemRecommend> _result = new ArrayList<ItemRecommend>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final ItemRecommend _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpNameOriginal;
        if (_cursor.isNull(_cursorIndexOfNameOriginal)) {
          _tmpNameOriginal = null;
        } else {
          _tmpNameOriginal = _cursor.getString(_cursorIndexOfNameOriginal);
        }
        final String _tmpNameRecommend;
        if (_cursor.isNull(_cursorIndexOfNameRecommend)) {
          _tmpNameRecommend = null;
        } else {
          _tmpNameRecommend = _cursor.getString(_cursorIndexOfNameRecommend);
        }
        _item = new ItemRecommend(_tmpId,_tmpNameOriginal,_tmpNameRecommend);
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
