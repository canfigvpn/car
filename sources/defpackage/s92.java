package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class s92 extends c40 implements zn1, mf0, zf0 {
    public ti0 u;
    public boolean v;
    public final cb2 w;

    public s92(ti0 ti0Var) {
        this.u = ti0Var;
        u6 u6Var = new u6(4, this);
        pn1 pn1Var = ya2.a;
        cb2 cb2Var = new cb2(null, null, u6Var);
        F0(cb2Var);
        this.w = cb2Var;
    }

    @Override // defpackage.zn1
    public final void G(pn1 pn1Var, qn1 qn1Var, long j) {
        this.w.G(pn1Var, qn1Var, j);
    }

    @Override // defpackage.mf0
    public final void U(bg0 bg0Var) {
        this.v = bg0Var.a();
    }

    @Override // defpackage.zn1
    public final void f0() {
        this.w.f0();
    }

    @Override // defpackage.zn1
    public final long q() {
        a70 a70Var = vs0.E;
        m40 m40Var = qx.V(this).B;
        a70Var.getClass();
        int i = rh2.b;
        return n02.o(m40Var.O(10.0f), m40Var.O(40.0f), m40Var.O(10.0f), m40Var.O(40.0f));
    }
}
