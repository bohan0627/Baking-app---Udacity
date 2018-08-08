package com.example.android.baking_app.Database;

public class RecipeContract {
    private RecipeContract(){

    }
    public static abstract class RecipeEntry {

        public static final String TABLE_NAME = "recipes";

        public static final String COLUMN_RECIPE_ID = "recipeId";
        public static final String COLUMN_NAME = "ingredientName";
        public static final String COLUMN_SERVINGS = "ingredientServings";
        public static final String COLUMN_IMAGE = "ingredientImage";
    }

    static final String SQL_QUERY_CREATE =
            "CREATE TABLE " + RecipeEntry.TABLE_NAME + " ("
                    + RecipeEntry.COLUMN_RECIPE_ID + " INTEGER PRIMARY KEY,"
                    + RecipeEntry.COLUMN_NAME + " TEXT NOT NULL,"
                    + RecipeEntry.COLUMN_SERVINGS + " INTEGER NOT NULL,"
                    + RecipeEntry.COLUMN_IMAGE + " TEXT NOT NULL"
                    + ")";
}
