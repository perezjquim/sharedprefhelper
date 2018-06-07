package com.perezjquim;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Set;

public class SharedPreferencesHelper
{
    private Context context;

    public SharedPreferencesHelper(Context context)
    {
        this.context = context;
    }
    private SharedPreferences getSharedPreferences(String xml)
    {
        return context.getSharedPreferences(xml, Context.MODE_PRIVATE);
    }

    // STRING
    public String getString(String xml, String key)
    {
        return getSharedPreferences(xml).getString(key,null);
    }
    public void setString(String xml, String key, String value)
    {
        SharedPreferences.Editor prefs = getSharedPreferences(xml).edit();
        prefs.putString(key,value);
        prefs.apply();
    }

    // STRING SET
    public Set<String> getStringSet(String xml, String key)
    {
        return getSharedPreferences(xml).getStringSet(key,null);
    }
    public void setStringSet(String xml, String key, Set<String> value)
    {
        SharedPreferences.Editor prefs = getSharedPreferences(xml).edit();
        prefs.putStringSet(key,value);
        prefs.apply();
    }

    // BOOLEAN
    public boolean getBoolean(String xml, String key)
    {
        return getSharedPreferences(xml).getBoolean(key,false);
    }
    public void setBoolean(String xml, String key, boolean value)
    {
        SharedPreferences.Editor prefs = getSharedPreferences(xml).edit();
        prefs.putBoolean(key,value);
        prefs.apply();
    }

    // FLOAT
    public float getFloat(String xml, String key)
    {
        return getSharedPreferences(xml).getFloat(key,-1);
    }
    public void setFloat(String xml, String key, float value)
    {
        SharedPreferences.Editor prefs = getSharedPreferences(xml).edit();
        prefs.putFloat(key,value);
        prefs.apply();
    }

    // INT
    public int getInt(String xml, String key)
    {
        return getSharedPreferences(xml).getInt(key,-1);
    }
    public void setInt(String xml, String key, int value)
    {
        SharedPreferences.Editor prefs = getSharedPreferences(xml).edit();
        prefs.putInt(key,value);
        prefs.apply();
    }

    // LONG
    public long getLong(String xml, String key)
    {
        return getSharedPreferences(xml).getLong(key,-1);
    }
    public void setLong(String xml, String key, long value)
    {
        SharedPreferences.Editor prefs = getSharedPreferences(xml).edit();
        prefs.putLong(key,value);
        prefs.apply();
    }
}
