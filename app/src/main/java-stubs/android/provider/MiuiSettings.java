package android.provider;

import android.content.ContentResolver;

/**
 * Stub for compilation only.
 */
public class MiuiSettings {
    public static class Global {
        public static boolean getBoolean(ContentResolver resolver, String key) { return false; }
        public static boolean getBoolean(ContentResolver resolver, String key, boolean defaultValue) { return defaultValue; }
        public static int getInt(ContentResolver resolver, String key, int defaultValue) { return defaultValue; }
        public static String getString(ContentResolver resolver, String key) { return null; }
    }
    public static class System {
        public static boolean getBoolean(ContentResolver resolver, String key) { return false; }
        public static int getInt(ContentResolver resolver, String key, int defaultValue) { return defaultValue; }
    }
    public static class Secure {
        public static boolean getBoolean(ContentResolver resolver, String key) { return false; }
    }
}
