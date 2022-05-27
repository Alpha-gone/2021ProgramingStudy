package com.example.chatbottest;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.appcompat.app.AppCompatDelegate;

public class ThemeUtil {
    public static final String LIGHT_MODE = "light";
    public static final String DARK_MODE = "dark";
    public static final String DEFAULT_MODE = "default";

    public static void applyTheme(String themeColor){
        switch (themeColor){
            case LIGHT_MODE:
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                break;

            case DARK_MODE:
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                break;
        }
    }

    public static void modSave(Context context, String selectedMod){
        SharedPreferences sp;
        sp = context.getSharedPreferences("mod", context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("mod", selectedMod);
        editor.commit();
    }

    public static String modLoad(Context context){
        SharedPreferences sp;
        sp = context.getSharedPreferences("mod", context.MODE_PRIVATE);
        String loadMod = sp.getString("mod", "light");
        return loadMod;
    }
}
