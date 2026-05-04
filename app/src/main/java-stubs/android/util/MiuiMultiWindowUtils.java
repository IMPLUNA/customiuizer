package android.util;

import android.app.ActivityOptions;
import android.content.Context;

/**
 * Stub for compilation only - real class provided by MIUI system at runtime.
 */
public class MiuiMultiWindowUtils {
    public static void startSmallFreeformForControlCenter(Context context) {}
    public static boolean isForceResizeable(Context context) { return false; }
    public static boolean multiFreeFormSupported(Context context) { return false; }
    public static ActivityOptions getActivityOptions(Context context, String pkgName, boolean a, boolean b) { return null; }
    public static Rect getFreeformRect(Context context) { return null; }
}
