package com.example.kotlinanimeroom;

import android.database.Cursor;
import android.graphics.Bitmap;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class UsuarioDAO_Impl implements UsuarioDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfUsuario;

  private final Converters __converters = new Converters();

  public UsuarioDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUsuario = new EntityInsertionAdapter<Usuario>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Usuario`(`id`,`userName`,`senha`,`imagem`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Usuario value) {
        stmt.bindLong(1, value.getId());
        if (value.getUserName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUserName());
        }
        if (value.getSenha() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSenha());
        }
        final byte[] _tmp;
        _tmp = __converters.BitMapToByte(value.getImagem());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindBlob(4, _tmp);
        }
      }
    };
  }

  @Override
  public void insert(Usuario usuario) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfUsuario.insert(usuario);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Usuario> getUsuarios() {
    final String _sql = "SELECT * FROM usuario";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfUserName = _cursor.getColumnIndexOrThrow("userName");
      final int _cursorIndexOfSenha = _cursor.getColumnIndexOrThrow("senha");
      final int _cursorIndexOfImagem = _cursor.getColumnIndexOrThrow("imagem");
      final List<Usuario> _result = new ArrayList<Usuario>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Usuario _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpUserName;
        _tmpUserName = _cursor.getString(_cursorIndexOfUserName);
        final String _tmpSenha;
        _tmpSenha = _cursor.getString(_cursorIndexOfSenha);
        final Bitmap _tmpImagem;
        final byte[] _tmp;
        _tmp = _cursor.getBlob(_cursorIndexOfImagem);
        _tmpImagem = __converters.ByteToBitmap(_tmp);
        _item = new Usuario(_tmpId,_tmpUserName,_tmpSenha,_tmpImagem);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
