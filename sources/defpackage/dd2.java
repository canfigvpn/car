package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class dd2 extends c40 implements rv, nc2 {
    public ru1 u;
    public fe2 v;
    public ge2 w;
    public wx x;
    public j82 y;
    public final v40 z = e72.b(new r12(8, this));
    public yr1 A = yr1.e;

    public dd2(ru1 ru1Var, fe2 fe2Var, ge2 ge2Var, wx wxVar) {
        this.u = ru1Var;
        this.v = fe2Var;
        this.w = ge2Var;
        this.x = wxVar;
    }

    @Override // defpackage.nc2
    public final long h(jw0 jw0Var) {
        return m(jw0Var).d();
    }

    @Override // defpackage.nc2
    public final yr1 m(jw0 jw0Var) {
        if (!this.r) {
            return this.A;
        }
        yr1 yr1Var = (yr1) this.x.h(jw0Var);
        if (yr1Var == null) {
            return this.A;
        }
        this.A = yr1Var;
        return yr1Var;
    }

    @Override // defpackage.nc2
    public final mc2 o0() {
        return (mc2) this.z.getValue();
    }

    @Override // defpackage.t71
    public final void x0() {
        ru1 ru1Var = this.u;
        ru1Var.c = eh2.g;
        ru1Var.b = this;
    }

    @Override // defpackage.t71
    public final void y0() {
        ru1 ru1Var = this.u;
        ru1Var.c = eh2.f;
        ru1Var.b = null;
    }
}
