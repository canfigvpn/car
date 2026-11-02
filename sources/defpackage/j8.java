package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class j8 implements ez {
    public final View e;
    public final ye2 f;
    public final ez g;
    public final AtomicReference h = new AtomicReference(null);

    public j8(View view, ye2 ye2Var, ez ezVar) {
        this.e = view;
        this.f = ye2Var;
        this.g = ezVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void a(g11 g11Var, tx txVar) {
        g8 g8Var;
        if (txVar instanceof g8) {
            g8Var = (g8) txVar;
            int i = g8Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                g8Var.j = i - Integer.MIN_VALUE;
            } else {
                g8Var = new g8(this, txVar);
            }
        } else {
            g8Var = new g8(this, txVar);
        }
        Object obj = g8Var.h;
        int i2 = g8Var.j;
        if (i2 == 0) {
            ix.Q(obj);
            i8 i8Var = new i8(0, g11Var, this);
            sx sxVar = null;
            e eVar = new e(3, sxVar, this);
            g8Var.j = 1;
            if (qx.w(new n7(i8Var, this.h, eVar, sxVar, 12), g8Var) == fz.e) {
                return;
            }
        } else {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            ix.Q(obj);
        }
        qj.e();
    }

    @Override // defpackage.ez
    public final uy h() {
        return this.g.h();
    }
}
