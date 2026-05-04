package miui.security;

import java.util.HashSet;

/**
 * Stub for compilation only - real class provided by MIUI system at runtime.
 */
public class SecurityManager {
    public boolean getApplicationAccessControlEnabledAsUser(String pkgName, int userId) { return false; }
    public void setApplicationAccessControlEnabledForUser(String pkgName, boolean enabled, int userId) {}
    public HashSet<String> getAllPrivacyApps(int userId) { return new HashSet<>(); }
    public void setPrivacyApp(String pkgName, int userId, boolean privacy) {}
}
