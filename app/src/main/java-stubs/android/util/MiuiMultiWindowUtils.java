package android.util;

import android.content.Context;
import android.content.Intent;

/**
 * Stub for compilation only.
 */
public class MiuiMultiWindowUtils {
    public static void startSmallFreeformForControlCenter(Context context) {}
    public static boolean isForceResizeable(Context context) { return false; }
    public static boolean multiFreeFormSupported(Context context) { return false; }
    public static Object getActivityOptions(Context context, String pkgName, boolean a, boolean b) { return null; }
    public static boolean isPkgMainActivityResizeable(String pkgName, Context context) { return false; }
    public static android.graphics.Rect getFreeformRect(Context context) { return new android.graphics.Rect(); }
    public static void startSmallFreeform(Context context, Intent intent, int userId) {}
    public static boolean hasSmallFreeform(Context context) { return false; }
}
