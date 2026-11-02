package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ik1 extends t71 implements sw0 {
    public float s;
    public ak1 t;

    @Override // defpackage.sw0
    public final x61 e(y61 y61Var, r61 r61Var, long j) {
        ak1 ak1Var = this.t;
        int iRound = (ak1Var == null || ((Number) ak1Var.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) ak1Var.getValue()).floatValue() * this.s);
        int iJ = iRound != Integer.MAX_VALUE ? iRound : sw.j(j);
        int i = sw.i(j);
        if (iRound == Integer.MAX_VALUE) {
            iRound = sw.h(j);
        }
        jm1 jm1VarE = r61Var.e(tw.a(iJ, iRound, i, sw.g(j)));
        return y61Var.d0(jm1VarE.e, jm1VarE.f, db0.e, new ye(jm1VarE, 6));
    }
}
