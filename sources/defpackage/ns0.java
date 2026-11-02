package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ns0 extends rs0 {
    public qs0 t;
    public boolean u;

    @Override // defpackage.rs0, defpackage.sw0
    public final int A(x41 x41Var, r61 r61Var, int i) {
        return this.t == qs0.e ? r61Var.e0(i) : r61Var.f(i);
    }

    @Override // defpackage.rs0
    public final long F0(r61 r61Var, long j) {
        int iE0 = this.t == qs0.e ? r61Var.e0(sw.h(j)) : r61Var.f(sw.h(j));
        if (iE0 < 0) {
            iE0 = 0;
        }
        if (iE0 < 0) {
            xp0.a("height must be >= 0");
        }
        return tw.h(0, Integer.MAX_VALUE, iE0, iE0);
    }

    @Override // defpackage.rs0
    public final boolean G0() {
        return this.u;
    }

    @Override // defpackage.rs0, defpackage.sw0
    public final int n(x41 x41Var, r61 r61Var, int i) {
        return this.t == qs0.e ? r61Var.e0(i) : r61Var.f(i);
    }
}
