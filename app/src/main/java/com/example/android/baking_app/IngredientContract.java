package com.example.android.baking_app;

import android.provider.BaseColumns;

public class IngredientContract {
    private IngredientContract(){

    }

    public static abstract class IngredientEntry implements BaseColumns{
        public static final String TABLE_NAME = "ingredients";
        public static final String COLUMN_INGREDIENT_ID = "ingredientId";
        public static final String COLUMN_QUANTITY = "quantity";
        public static final String COLUMN_MEASURE = "measure";
        public static final String COLUMN_INGREDIENT = "ingredient";
    }
    static final String SQL_QUERY_CREATE =
            "CREATE TABLE " + IngredientEntry.TABLE_NAME + " ("
                    + IngredientEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + IngredientEntry.COLUMN_INGREDIENT_ID + " INTEGER NOT NULL,"
                    + IngredientEntry.COLUMN_QUANTITY + " REAL NOT NULL,"
                    + IngredientEntry.COLUMN_MEASURE + " TEXT NOT NULL,"
                    + IngredientEntry.COLUMN_INGREDIENT + " TEXT NOT NULL"
                    + ")";
}
