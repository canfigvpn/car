package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class zs1 implements w11 {
    public final /* synthetic */ q11 e;
    public final /* synthetic */ gs1 f;
    public final /* synthetic */ ez g;
    public final /* synthetic */ q11 h;
    public final /* synthetic */ om i;
    public final /* synthetic */ ta1 j;
    public final /* synthetic */ g k;

    public zs1(q11 q11Var, gs1 gs1Var, ez ezVar, q11 q11Var2, om omVar, ta1 ta1Var, g gVar) {
        this.e = q11Var;
        this.f = gs1Var;
        this.g = ezVar;
        this.h = q11Var2;
        this.i = omVar;
        this.j = ta1Var;
        this.k = gVar;
    }

    @Override // defpackage.w11
    public final void j(y11 y11Var, q11 q11Var) throws IllegalAccessException, InvocationTargetException {
        q11 q11Var2 = this.e;
        gs1 gs1Var = this.f;
        if (q11Var == q11Var2) {
            gs1Var.e = nj2.y(this.g, null, new n7(9, null, this.j, this.k), 3);
            return;
        }
        if (q11Var == this.h) {
            ot0 ot0Var = (ot0) gs1Var.e;
            if (ot0Var != null) {
                ot0Var.d(null);
            }
            gs1Var.e = null;
        }
        if (q11Var == q11.ON_DESTROY) {
            this.i.i(ll2.a);
        }
    }
}
