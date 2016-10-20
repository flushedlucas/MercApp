package com.mercapp.infra;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Rejane Vieira on 18/10/2016.
 */
public class BD extends SQLiteOpenHelper {

    private static final int VERSAO = 1;
    private static final String NOME = "mercapp.sqlite";
    private static final String CREATE_USUARIO = "CREATE TABLE IF NOT EXISTS usuario (" + "id INTEGER PRIMARY KEY, "
                                                                                        + "username NOT NULL, "
    + "senha NOT NULL, "
    + "nome NOT NULL, " +
            "endereco NOT NULL, " +
            "cartao NOT NULL, " +
            "telefone NOT NULL," +
            "email NOT NULL,);";

    private static final String CREATE_SUPERMERCADO = "CREATE TABLE IF NOT EXISTS supermercado ("
            + "id INTEGER PRIMARY KEY, " +
            ";";

    public BD(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
