package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class us0 extends rs0 {
    public qs0 t;
    public boolean u;

    @Override // defpackage.rs0
    public final long F0(r61 r61Var, long j) {
        int iU = this.t == qs0.e ? r61Var.U(sw.g(j)) : r61Var.a0(sw.g(j));
        if (iU < 0) {
            iU = 0;
        }
        if (iU < 0) {
            xp0.a("width must be >= 0");
        }
        return tw.h(iU, iU, 0, Integer.MAX_VALUE);
    }

    @Override // defpackage.rs0
    public final boolean G0() {
        return this.u;
    }

    @Override // defpackage.rs0, defpackage.sw0
    public final int P(x41 x41Var, r61 r61Var, int i) {
        return this.t == qs0.e ? r61Var.U(i) : r61Var.a0(i);
    }

    @Override // defpackage.rs0, defpackage.sw0
    public final int f(x41 x41Var, r61 r61Var, int i) {
        return this.t == qs0.e ? r61Var.U(i) : r61Var.a0(i);
    }
}
