package android.provider;

import android.content.ContentResolver;

/**
 * Stub for compilation only.
 */
public class MiuiSettings {
    public static class Global {
        public static boolean getBoolean(ContentResolver cr, String key) { return false; }
        public static boolean getBoolean(ContentResolver cr, String key, boolean def) { return def; }
        public static int getInt(ContentResolver cr, String key, int def) { return def; }
        public static String getString(ContentResolver cr, String key) { return null; }
    }
    public static class System {
        public static boolean getBoolean(ContentResolver cr, String key) { return false; }
        public static int getInt(ContentResolver cr, String key, int def) { return def; }
        public static String getString(ContentResolver cr, String key) { return null; }
    }
    public static class Secure {
        public static boolean getBoolean(ContentResolver cr, String key) { return false; }
        public static int getInt(ContentResolver cr, String key, int def) { return def; }
    }
}
