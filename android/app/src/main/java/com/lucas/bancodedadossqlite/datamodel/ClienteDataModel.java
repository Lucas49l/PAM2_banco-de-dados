package com.lucas.bancodedadossqlite.datamodel;

public class ClienteDataModel {
    // passo 1 -  atributo nome da tabela
    public static final String TABLE_NAME= "cliente";

    // paso 2 atributos da tabela
    public static final String ID = "id";
    public static final String NOME = "nome";
    public static final String EMAIL = "email";

    //passo 3 - query para criar a tabela no banco de dados
    public static String queryCriarTabela = "";

    //passo 4 - metodo para gerar o script de criação da tabela
    public static String criarTabela(){
        queryCriarTabela = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + "(";
        queryCriarTabela += ID   + "INTEGER PRIMARY KEY AUTOINCREMENT, ";
        queryCriarTabela += NOME + "TEXT NOT NULL, ";
        queryCriarTabela += EMAIL + "TEXT NOT NULL UNIQUE";
        queryCriarTabela += ")";

        return queryCriarTabela;
    }
}

