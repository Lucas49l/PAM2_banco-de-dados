package com.lucas.bancodedadossqlite.datasource;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.lucas.bancodedadossqlite.api.AppUtil;

public class AppDataBase extends SQLiteOpenHelper {

    public static final String DB_NAME = "Loja.sqlite";
    public static int version = 1;

    public AppDataBase(Context context) {
        super(context, DB_NAME, null, version);
        Log.i(AppUtil.TAG, "AppDataBase: Criando Banco");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
