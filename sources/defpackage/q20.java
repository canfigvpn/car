package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class q20 extends t71 implements k80 {
    public final ur0 s;
    public boolean t;
    public boolean u;
    public boolean v;

    public q20(ur0 ur0Var) {
        this.s = ur0Var;
    }

    @Override // defpackage.k80
    public final void K(cx0 cx0Var) {
        cx0Var.a();
        um umVar = cx0Var.e;
        if (this.t) {
            l80.c0(cx0Var, dr.b(0.3f, dr.b), 0L, umVar.d(), 122);
        } else if (this.u || this.v) {
            l80.c0(cx0Var, dr.b(0.1f, dr.b), 0L, umVar.d(), 122);
        }
    }

    @Override // defpackage.t71
    public final void x0() {
        nj2.y(t0(), null, new ln(2, (sx) null, this), 3);
    }
}
