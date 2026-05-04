package miui.security;

import java.util.HashMap;
import java.util.Map;

/**
 * Stub for compilation only.
 */
public class SecurityManager {
    public boolean getApplicationAccessControlEnabledAsUser(String pkgName, int userId) { return false; }
    public void setApplicationAccessControlEnabledForUser(String pkgName, boolean enabled, int userId) {}
    public Map<Integer, Boolean> getAllPrivacyApps(int userId) { return new HashMap<>(); }
    public void setPrivacyApp(String pkgName, int userId, boolean isPrivacy) {}
}
