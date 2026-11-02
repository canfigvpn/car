package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ar2 extends t71 implements sw0 {
    public n50 s;
    public ij0 t;

    @Override // defpackage.sw0
    public final x61 e(final y61 y61Var, r61 r61Var, long j) {
        final jm1 jm1VarE = r61Var.e(tw.a(this.s != n50.e ? 0 : sw.j(j), sw.h(j), this.s == n50.f ? sw.i(j) : 0, sw.g(j)));
        final int iH = ex.h(jm1VarE.e, sw.j(j), sw.h(j));
        final int iH2 = ex.h(jm1VarE.f, sw.i(j), sw.g(j));
        return y61Var.d0(iH, iH2, db0.e, new ej0() { // from class: zq2
            @Override // defpackage.ej0
            public final Object h(Object obj) {
                ij0 ij0Var = this.e.t;
                jm1 jm1Var = jm1VarE;
                im1.j((im1) obj, jm1Var, ((ir0) ij0Var.g(new qr0((((long) (iH - jm1Var.e)) << 32) | (((long) (iH2 - jm1Var.f)) & 4294967295L)), y61Var.getLayoutDirection())).a);
                return ll2.a;
            }
        });
    }
}
