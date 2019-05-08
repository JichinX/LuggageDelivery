package me.xujichang.luggagedelivery.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PrefUtil {

    public static long getLoginUserId(Context pContext) {
        return getDefaultPrefs(pContext).getLong("login_user", -1L);
    }

    public static void putLoginUserId(Context pContext, long id) {
        getDefaultPrefs(pContext).edit().putLong("login_user", id).apply();
    }

    private static SharedPreferences getDefaultPrefs(Context pContext) {
        return PreferenceManager.getDefaultSharedPreferences(pContext);
    }
}
