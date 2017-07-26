package com.yossibarel.logutil;

import android.util.Log;

/**
 * Created by yossibarel on 26/07/2017.
 */

public class LogDebug {
    private static final String TAG = LogDebug.class.getSimpleName();

    public static void d(String log) {
        Log.d(TAG, log);
    }

}
