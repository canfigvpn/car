package defpackage;

import android.view.View;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class mb2 extends rq0 {
    public gm2 v;
    public fq2 w;

    @Override // defpackage.mq0, defpackage.t71
    public final void x0() {
        View viewE = ux.E(this);
        WeakHashMap weakHashMap = fq2.v;
        fq2 fq2VarE = p12.e(viewE);
        fq2VarE.a(viewE);
        this.v.getClass();
        fa faVar = fq2VarE.c;
        if (!ws0.j(faVar, this.u)) {
            this.u = faVar;
            G0();
        }
        this.w = fq2VarE;
        super.x0();
    }

    @Override // defpackage.mq0, defpackage.t71
    public final void y0() {
        View viewE = ux.E(this);
        fq2 fq2Var = this.w;
        if (fq2Var != null) {
            int i = fq2Var.t - 1;
            fq2Var.t = i;
            if (i == 0) {
                Field field = ln2.a;
                fn2.b(viewE, null);
                fp2.a(viewE, null);
                viewE.removeOnAttachStateChangeListener(fq2Var.u);
            }
        }
        super.y0();
    }
}
