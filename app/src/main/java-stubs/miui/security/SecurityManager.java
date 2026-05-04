package miui.security;

import java.util.ArrayList;
import java.util.List;

/**
 * Stub for compilation only.
 */
public class SecurityManager {
    public boolean getApplicationAccessControlEnabledAsUser(String pkgName, int userId) { return false; }
    public void setApplicationAccessControlEnabledForUser(String pkgName, boolean enabled, int userId) {}
    public List<String> getAllPrivacyApps(int userId) { return new ArrayList<>(); }
    public void setPrivacyApp(String pkgName, int userId, boolean isPrivacy) {}
}
