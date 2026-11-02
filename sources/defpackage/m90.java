package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class m90 extends l90 {
    @Override // defpackage.k90, defpackage.p90
    public void b(ib2 ib2Var, ib2 ib2Var2, Window window, View view, boolean z, boolean z2) {
        j12 cq2Var;
        ib2Var.getClass();
        ib2Var2.getClass();
        window.getClass();
        view.getClass();
        r02.q(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            cq2Var = new eq2(window);
        } else if (i >= 30) {
            cq2Var = new dq2(window);
        } else {
            cq2Var = i >= 26 ? new cq2(window) : new bq2(window);
        }
        cq2Var.m(!z);
        cq2Var.l(!z2);
    }
}
