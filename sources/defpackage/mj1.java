package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class mj1 extends t71 implements sw0 {
    public gj1 s;

    @Override // defpackage.sw0
    public final x61 e(y61 y61Var, r61 r61Var, long j) {
        float fA = this.s.a(y61Var.getLayoutDirection());
        float fD = this.s.d();
        float fB = this.s.b(y61Var.getLayoutDirection());
        float fC = this.s.c();
        if (!((w60.a(fA, 0.0f) >= 0) & (w60.a(fD, 0.0f) >= 0) & (w60.a(fB, 0.0f) >= 0) & (w60.a(fC, 0.0f) >= 0))) {
            tp0.a("Padding must be non-negative");
        }
        int iO = y61Var.O(fA);
        int iO2 = y61Var.O(fB) + iO;
        int iO3 = y61Var.O(fD);
        int iO4 = y61Var.O(fC) + iO3;
        jm1 jm1VarE = r61Var.e(tw.i(-iO2, -iO4, j));
        return y61Var.d0(tw.g(jm1VarE.e + iO2, j), tw.f(jm1VarE.f + iO4, j), db0.e, new qq0(jm1VarE, iO, iO3, 2));
    }
}
