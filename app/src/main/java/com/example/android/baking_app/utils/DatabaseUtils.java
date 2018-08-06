package com.example.android.baking_app.utils;

import android.content.ContentValues;
import android.support.annotation.NonNull;

import com.example.android.baking_app.Base.Ingredient;

public class DatabaseUtils {
    public static String getAllQuery(String tableName){
        return "SELECT * FROM" + tableName;
    }

    public static String getByIdQuery(String tableName, String id){
        return "SELECT * FROM" + tableName + "WHERE" + id + "=?";
    }

    public static ContentValues ingreToContent(@NonNull Ingredient ingredient, int recipeId){
        ContentValues content = new ContentValues();

        content.put(IngredientEn)
    }
}
