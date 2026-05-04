package miui.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Stub for compilation only.
 */
public class MiuiFreeFormManager {
    public static List<MiuiFreeFormStackInfo> getAllFreeFormStackInfosOnDisplay(int displayId) {
        return new ArrayList<>();
    }
    public static class MiuiFreeFormStackInfo {
        public int taskId;
        public String packageName;
    }
}
