package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class d31 implements AccessibilityManager$AccessibilityServicesStateChangeListener {
    public final dk1 a;
    public final dk1 b;

    public d31(f31 f31Var) {
        Boolean bool = Boolean.FALSE;
        this.a = y12.s(bool);
        this.b = y12.s(bool);
    }

    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        this.a.setValue(Boolean.valueOf(f31.a(accessibilityManager)));
        this.b.setValue(Boolean.valueOf(f31.b(accessibilityManager)));
    }
}
