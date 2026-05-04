package miui.telephony;

/**
 * Stub for compilation only - real class provided by MIUI system at runtime.
 */
public class TelephonyManager {
    private static final TelephonyManager sInstance = new TelephonyManager();

    public static TelephonyManager getDefault() { return sInstance; }
    public boolean isUserFiveGEnabled() { return false; }
    public void setUserFiveGEnabled(boolean enabled) {}
    public boolean isFiveGCapable() { return false; }
}
