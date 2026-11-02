package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class rl extends t71 implements lf1, el, k80 {
    public final sl s;
    public boolean t;
    public ej0 u;

    public rl(sl slVar, ej0 ej0Var) {
        this.s = slVar;
        this.u = ej0Var;
        slVar.e = this;
    }

    public final void F0() {
        this.t = false;
        this.s.f = null;
        vv.B(this);
    }

    @Override // defpackage.lf1
    public final void I() {
        F0();
    }

    @Override // defpackage.k80
    public final void K(cx0 cx0Var) {
        boolean z = this.t;
        sl slVar = this.s;
        if (!z) {
            slVar.f = null;
            ux.C(this, new v4(3, this, slVar));
            if (slVar.f == null) {
                throw k3.g("DrawResult not defined, did you forget to call onDraw?");
            }
            this.t = true;
        }
        ao2 ao2Var = slVar.f;
        ao2Var.getClass();
        ((ej0) ao2Var.f).h(cx0Var);
    }

    @Override // defpackage.b40, defpackage.zn1
    public final void a() {
        F0();
    }

    @Override // defpackage.el
    public final m40 b() {
        return qx.V(this).B;
    }

    @Override // defpackage.el
    public final long d() {
        return ux.M(qx.T(this, 4).g);
    }

    @Override // defpackage.el
    public final kw0 getLayoutDirection() {
        return qx.V(this).C;
    }

    @Override // defpackage.k80
    public final void l0() {
        F0();
    }

    @Override // defpackage.b40
    public final void p0() {
        F0();
    }

    @Override // defpackage.t71
    public final void z0() {
        F0();
    }

    @Override // defpackage.t71
    public final void y0() {
    }
}
