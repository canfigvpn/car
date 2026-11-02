package defpackage;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import java.util.Arrays;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class px1 {
    public final dk1 a = y12.s(Boolean.FALSE);

    public final void a(e5 e5Var, t02 t02Var, uy uyVar, Consumer consumer) {
        fa1 fa1Var = new fa1(new qx1[16]);
        ux.R(t02Var.a(), 0, new ox1(1, 8, fa1.class, fa1Var, "add", "add(Ljava/lang/Object;)Z"));
        Arrays.sort(fa1Var.e, 0, fa1Var.g, s5.C(je1.t, je1.u));
        int i = fa1Var.g;
        qx1 qx1Var = (qx1) (i == 0 ? null : fa1Var.e[i - 1]);
        if (qx1Var == null) {
            return;
        }
        mr0 mr0Var = qx1Var.c;
        qu quVar = new qu(qx1Var.a, mr0Var, qx.b(uyVar), this, e5Var);
        me1 me1Var = qx1Var.d;
        yr1 yr1VarK = sv.A(me1Var).K(me1Var, true);
        long j = (((long) mr0Var.b) & 4294967295L) | (((long) mr0Var.a) << 32);
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(e5Var, ux.J(qx.Y(yr1VarK)), new Point((int) (j >> 32), (int) (j & 4294967295L)), quVar);
        scrollCaptureTarget.setScrollBounds(ux.J(mr0Var));
        consumer.accept(scrollCaptureTarget);
    }
}
