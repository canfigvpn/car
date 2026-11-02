package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class j5 extends dw0 implements ej0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ k5 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j5(k5 k5Var, int i) {
        super(1);
        this.f = i;
        this.g = k5Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.f;
        k5 k5Var = this.g;
        switch (i) {
            case 0:
                View view = k5Var.h;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                wx1 wx1Var = (wx1) obj;
                if (wx1Var.f.contains(wx1Var)) {
                    cj1 snapshotObserver = k5Var.h.getSnapshotObserver();
                    snapshotObserver.a.c(wx1Var, k5Var.Q, new v4(1, wx1Var, k5Var));
                }
                return ll2.a;
        }
    }
}
