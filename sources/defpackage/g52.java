package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class g52 extends t71 implements sw0 {
    public float s;
    public float t;
    public float u;
    public float v;
    public boolean w;

    @Override // defpackage.sw0
    public final int A(x41 x41Var, r61 r61Var, int i) {
        long jF0 = F0(x41Var);
        if (sw.e(jF0)) {
            return sw.g(jF0);
        }
        if (!this.w) {
            i = tw.g(i, jF0);
        }
        return tw.f(r61Var.e0(i), jF0);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    public final long F0(y61 y61Var) {
        int iO;
        int iO2;
        int iO3;
        int i = 0;
        if (Float.isNaN(this.u)) {
            iO = Integer.MAX_VALUE;
        } else {
            iO = y61Var.O(this.u);
            if (iO < 0) {
                iO = 0;
            }
        }
        if (Float.isNaN(this.v)) {
            iO2 = Integer.MAX_VALUE;
        } else {
            iO2 = y61Var.O(this.v);
            if (iO2 < 0) {
                iO2 = 0;
            }
        }
        if (Float.isNaN(this.s)) {
            iO3 = 0;
        } else {
            iO3 = y61Var.O(this.s);
            if (iO3 < 0) {
                iO3 = 0;
            }
            if (iO3 > iO) {
                iO3 = iO;
            }
            if (iO3 == Integer.MAX_VALUE) {
                iO3 = 0;
            }
        }
        if (!Float.isNaN(this.t)) {
            int iO4 = y61Var.O(this.t);
            if (iO4 < 0) {
                iO4 = 0;
            }
            if (iO4 > iO2) {
                iO4 = iO2;
            }
            if (iO4 != Integer.MAX_VALUE) {
                i = iO4;
            }
        }
        return tw.a(iO3, iO, i, iO2);
    }

    @Override // defpackage.sw0
    public final int P(x41 x41Var, r61 r61Var, int i) {
        long jF0 = F0(x41Var);
        if (sw.f(jF0)) {
            return sw.h(jF0);
        }
        if (!this.w) {
            i = tw.f(i, jF0);
        }
        return tw.g(r61Var.U(i), jF0);
    }

    @Override // defpackage.sw0
    public final x61 e(y61 y61Var, r61 r61Var, long j) {
        int iJ;
        int iH;
        int i;
        int iG;
        long jA;
        long jF0 = F0(y61Var);
        if (this.w) {
            jA = tw.e(j, jF0);
        } else {
            if (Float.isNaN(this.s)) {
                iJ = sw.j(j);
                int iH2 = sw.h(jF0);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = sw.j(jF0);
            }
            if (Float.isNaN(this.u)) {
                iH = sw.h(j);
                int iJ2 = sw.j(jF0);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = sw.h(jF0);
            }
            if (Float.isNaN(this.t)) {
                i = sw.i(j);
                int iG2 = sw.g(jF0);
                if (i > iG2) {
                    i = iG2;
                }
            } else {
                i = sw.i(jF0);
            }
            if (Float.isNaN(this.v)) {
                iG = sw.g(j);
                int i2 = sw.i(jF0);
                if (iG < i2) {
                    iG = i2;
                }
            } else {
                iG = sw.g(jF0);
            }
            jA = tw.a(iJ, iH, i, iG);
        }
        jm1 jm1VarE = r61Var.e(jA);
        return y61Var.d0(jm1VarE.e, jm1VarE.f, db0.e, new ye(jm1VarE, 7));
    }

    @Override // defpackage.sw0
    public final int f(x41 x41Var, r61 r61Var, int i) {
        long jF0 = F0(x41Var);
        if (sw.f(jF0)) {
            return sw.h(jF0);
        }
        if (!this.w) {
            i = tw.f(i, jF0);
        }
        return tw.g(r61Var.a0(i), jF0);
    }

    @Override // defpackage.sw0
    public final int n(x41 x41Var, r61 r61Var, int i) {
        long jF0 = F0(x41Var);
        if (sw.e(jF0)) {
            return sw.g(jF0);
        }
        if (!this.w) {
            i = tw.g(i, jF0);
        }
        return tw.f(r61Var.f(i), jF0);
    }
}
