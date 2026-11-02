package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class tl2 extends t71 implements sw0 {
    public float s;
    public float t;

    @Override // defpackage.sw0
    public final int A(x41 x41Var, r61 r61Var, int i) {
        int iE0 = r61Var.e0(i);
        int iO = !Float.isNaN(this.t) ? x41Var.O(this.t) : 0;
        return iE0 < iO ? iO : iE0;
    }

    @Override // defpackage.sw0
    public final int P(x41 x41Var, r61 r61Var, int i) {
        int iU = r61Var.U(i);
        int iO = !Float.isNaN(this.s) ? x41Var.O(this.s) : 0;
        return iU < iO ? iO : iU;
    }

    @Override // defpackage.sw0
    public final x61 e(y61 y61Var, r61 r61Var, long j) {
        int iJ;
        int i;
        if (Float.isNaN(this.s) || sw.j(j) != 0) {
            iJ = sw.j(j);
        } else {
            int iO = y61Var.O(this.s);
            iJ = sw.h(j);
            if (iO < 0) {
                iO = 0;
            }
            if (iO <= iJ) {
                iJ = iO;
            }
        }
        int iH = sw.h(j);
        if (Float.isNaN(this.t) || sw.i(j) != 0) {
            i = sw.i(j);
        } else {
            int iO2 = y61Var.O(this.t);
            i = sw.g(j);
            int i2 = iO2 >= 0 ? iO2 : 0;
            if (i2 <= i) {
                i = i2;
            }
        }
        jm1 jm1VarE = r61Var.e(tw.a(iJ, iH, i, sw.g(j)));
        return y61Var.d0(jm1VarE.e, jm1VarE.f, db0.e, new ye(jm1VarE, 11));
    }

    @Override // defpackage.sw0
    public final int f(x41 x41Var, r61 r61Var, int i) {
        int iA0 = r61Var.a0(i);
        int iO = !Float.isNaN(this.s) ? x41Var.O(this.s) : 0;
        return iA0 < iO ? iO : iA0;
    }

    @Override // defpackage.sw0
    public final int n(x41 x41Var, r61 r61Var, int i) {
        int iF = r61Var.f(i);
        int iO = !Float.isNaN(this.t) ? x41Var.O(this.t) : 0;
        return iF < iO ? iO : iF;
    }
}
