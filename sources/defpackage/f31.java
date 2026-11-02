package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class f31 implements AccessibilityManager.AccessibilityStateChangeListener, p82 {
    public final boolean e;
    public final boolean f;
    public final dk1 g = y12.s(Boolean.FALSE);
    public final e31 h;
    public final d31 i;

    public f31(boolean z, boolean z2, boolean z3) {
        this.e = z2;
        this.f = z3;
        d31 d31Var = null;
        this.h = z ? new e31() : null;
        if ((z2 || z3) && Build.VERSION.SDK_INT >= 33) {
            d31Var = new d31(this);
        }
        this.i = d31Var;
    }

    public static boolean a(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && h92.C(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && h92.C(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    @Override // defpackage.p82
    public final Object getValue() {
        boolean z;
        if (((Boolean) this.g.getValue()).booleanValue()) {
            z = true;
            e31 e31Var = this.h;
            if (e31Var == null || !((Boolean) e31Var.e.getValue()).booleanValue()) {
                boolean z2 = this.e;
                d31 d31Var = this.i;
                if ((!z2 || d31Var == null || !((Boolean) d31Var.a.getValue()).booleanValue()) && (!this.f || d31Var == null || !((Boolean) d31Var.b.getValue()).booleanValue())) {
                    z = false;
                }
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.g.setValue(Boolean.valueOf(z));
    }
}
