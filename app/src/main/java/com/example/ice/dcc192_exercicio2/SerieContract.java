package com.example.ice.dcc192_exercicio2;

import android.provider.BaseColumns;

public final class SerieContract {
    public final class Serie implements BaseColumns{
        public final static String TABLE_NAME = "Serie";
        public static final String COLUMN_TITULO_SERIE = "titulo";
        public static final String COLUMN_NUMERO_TEMPORADA = "temporada";
        public static final String COLUMN_NUMERO_EPISODIO = "episodio";
        public static final String SQL_CREATE_SERIE = "CREATE TABLE " + Serie.TABLE_NAME + " (" +
                Serie._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Serie.COLUMN_TITULO_SERIE + " TEXT, "
                + Serie.COLUMN_NUMERO_TEMPORADA + " INTEGER, "
                + Serie.COLUMN_NUMERO_EPISODIO + " INTEGER"
                +")";
        public static final String SQL_DROP_LIVRO = "DROP TABLE IF EXISTS" + Serie.TABLE_NAME;

    }

}
