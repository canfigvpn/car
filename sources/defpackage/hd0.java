package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hd0 extends t71 implements sw0 {
    public n50 s;
    public float t;

    @Override // defpackage.sw0
    public final x61 e(y61 y61Var, r61 r61Var, long j) {
        int iJ;
        int iH;
        int iG;
        int i;
        if (!sw.d(j) || this.s == n50.e) {
            iJ = sw.j(j);
            iH = sw.h(j);
        } else {
            int iRound = Math.round(sw.h(j) * this.t);
            int iJ2 = sw.j(j);
            iJ = sw.h(j);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!sw.c(j) || this.s == n50.f) {
            int i2 = sw.i(j);
            int iG2 = sw.g(j);
            iG = i2;
            i = iG2;
        } else {
            int iRound2 = Math.round(sw.g(j) * this.t);
            int i3 = sw.i(j);
            iG = sw.g(j);
            if (iRound2 < i3) {
                iRound2 = i3;
            }
            if (iRound2 <= iG) {
                iG = iRound2;
            }
            i = iG;
        }
        jm1 jm1VarE = r61Var.e(tw.a(iJ, iH, iG, i));
        return y61Var.d0(jm1VarE.e, jm1VarE.f, db0.e, new ye(jm1VarE, 3));
    }
}
