package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class tt0 extends rt0 {
    public final vt0 i;
    public final ut0 j;
    public final ip k;
    public final Object l;

    public tt0(vt0 vt0Var, ut0 ut0Var, ip ipVar, Object obj) {
        this.i = vt0Var;
        this.j = ut0Var;
        this.k = ipVar;
        this.l = obj;
    }

    @Override // defpackage.rt0
    public final boolean m() {
        return false;
    }

    @Override // defpackage.rt0
    public final void n(Throwable th) {
        ip ipVar = this.k;
        ip ipVarX = vt0.X(ipVar);
        vt0 vt0Var = this.i;
        ut0 ut0Var = this.j;
        Object obj = this.l;
        if (ipVarX == null || !vt0Var.g0(ut0Var, ipVarX, obj)) {
            ut0Var.e.e(new a31(2), 2);
            ip ipVarX2 = vt0.X(ipVar);
            if (ipVarX2 == null || !vt0Var.g0(ut0Var, ipVarX2, obj)) {
                vt0Var.x(vt0Var.J(ut0Var, obj));
            }
        }
    }
}
