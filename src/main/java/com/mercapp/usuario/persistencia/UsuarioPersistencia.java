package com.mercapp.usuario.persistencia;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.mercapp.infra.BDHelper;
import com.mercapp.usuario.dominio.Usuario;


/**
 * Created by wellington on 20/10/16.
 */

public class UsuarioPersistencia {
    private BDHelper bdHelper;

    public void cadastrarUsuario(Usuario usuario){
        SQLiteDatabase db = bdHelper.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(bdHelper.COLUNA_EMAIL, usuario.getEmail());
        values.put(bdHelper.COLUNA_SENHA, usuario.getSenha());

        db.insert(bdHelper.TBL_USUARIO, null, values);
        db.close();
    }

    public Usuario buscarUsuario(String email, String senha){
        SQLiteDatabase db = bdHelper.getReadableDatabase();

        Usuario usuario = null;

        Cursor cursor = db.rawQuery("SELECT * FROM " + bdHelper.TBL_USUARIO + " WHERE " +
                bdHelper.COLUNA_EMAIL + " LIKE ? AND " + bdHelper.COLUNA_SENHA + " LIKE ? ",
                new String[]{email, senha});
        if (cursor.moveToFirst()){
            usuario = criarUsuario(cursor);
        }
        db.close();
        cursor.close();
        return usuario;
    }

    private Usuario criarUsuario(Cursor cursor){
        Usuario usuario = new Usuario();
        usuario.setId(cursor.getInt(0));
        usuario.setEmail(cursor.getString(1));
        usuario.setSenha(cursor.getString(2));
        return usuario;
    }
}
