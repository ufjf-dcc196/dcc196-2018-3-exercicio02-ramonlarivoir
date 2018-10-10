package com.example.ice.dcc192_exercicio2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SerieDBHelper extends SQLiteOpenHelper {
    public final static Integer DATABASE_VERSION = 1;
    public final static String DATABASE_NAME = "Serie.db";

    public SerieDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SerieContract.Serie.SQL_CREATE_SERIE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SerieContract.Serie.SQL_DROP_LIVRO);
        onCreate(db);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        super.onDowngrade(db, oldVersion, newVersion);
    }
}
