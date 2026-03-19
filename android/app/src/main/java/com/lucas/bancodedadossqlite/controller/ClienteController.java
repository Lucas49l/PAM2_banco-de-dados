package com.lucas.bancodedadossqlite.controller;

import android.content.Context;
import android.util.Log;

import com.lucas.bancodedadossqlite.api.AppUtil;
import com.lucas.bancodedadossqlite.datasource.AppDataBase;

public class ClienteController extends AppDataBase {
    public ClienteController(Context context) {
        super(context);
        Log.i(AppUtil.TAG, "ClienteController: Conectado ao banco");
    }
}
