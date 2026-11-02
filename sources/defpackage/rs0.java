package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rs0 extends t71 implements sw0 {
    public final /* synthetic */ int s;

    public int A(x41 x41Var, r61 r61Var, int i) {
        switch (this.s) {
            case 0:
                break;
        }
        return r61Var.e0(i);
    }

    public abstract long F0(r61 r61Var, long j);

    public abstract boolean G0();

    @Override // defpackage.sw0
    public int P(x41 x41Var, r61 r61Var, int i) {
        switch (this.s) {
            case 0:
                break;
        }
        return r61Var.U(i);
    }

    public x61 e(y61 y61Var, r61 r61Var, long j) {
        long jF0 = F0(r61Var, j);
        if (G0()) {
            jF0 = tw.e(j, jF0);
        }
        jm1 jm1VarE = r61Var.e(jF0);
        return y61Var.d0(jm1VarE.e, jm1VarE.f, db0.e, new ye(jm1VarE, 4));
    }

    @Override // defpackage.sw0
    public int f(x41 x41Var, r61 r61Var, int i) {
        switch (this.s) {
            case 0:
                break;
        }
        return r61Var.a0(i);
    }

    public int n(x41 x41Var, r61 r61Var, int i) {
        switch (this.s) {
            case 0:
                break;
        }
        return r61Var.f(i);
    }
}
