package net.grandcentrix.tray.core;

import android.util.Log;

/**
 * Logging helper class for Tray inspired by Volley
 * <p>
 * start logging with: {@code adb shell setprop log.tag.Tray VERBOSE}
 * <p>
 * disable logging: {@code adb shell setprop log.tag.Tray SUPPRESS}
 * <p>
 * Created by pascalwelsch on 9/23/15.
 */
public class TrayLog {

    private static String TAG = "Tray";

    public static boolean DEBUG = Log.isLoggable(TAG, Log.VERBOSE);

    public static void logd(String s) {
        Log.d(TAG, s);
    }

    public static void loge(String s) {
        Log.e(TAG, s);
    }

    public static void loge(Throwable tr, String s) {
        Log.e(TAG, s, tr);
    }

    public static void logv(String s) {
        if (DEBUG) {
            Log.v(TAG, s);
        }
    }

    public static void logw(String s) {
        Log.w(TAG, s);
    }

    public static void logwtf(String s) {
        Log.wtf(TAG, s);
    }

    public static void logwtf(Throwable tr, String s) {
        Log.wtf(TAG, s, tr);
    }

    /**
     * Customize the log tag for your application, so that other apps
     * using Tray don't mix their logs with yours.
     * <br />
     * Enable the log property for your tag before starting your app:
     * <br />
     * {@code adb shell setprop log.tag.&lt;tag&gt;}
     */
    public static void setTag(String tag) {
        logd("Changing log tag to " + tag);
        TAG = tag;

        // Reinitialize the DEBUG "constant"
        DEBUG = Log.isLoggable(TAG, Log.VERBOSE);
    }
}
