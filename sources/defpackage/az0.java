package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class az0 extends t71 implements sw0 {
    public static final yy0 v = new yy0();
    public bz0 s;
    public ck t;
    public di1 u;

    public final boolean F0(wy0 wy0Var, int i) {
        if (i != 5 && i != 6) {
            if (i == 3 || i == 4) {
                if (this.u != di1.e) {
                }
            } else if (i != 1 && i != 2) {
                fu1.h("Lazy list does not support beyond bounds layout for the specified direction");
                return false;
            }
            if (G0(i) ? wy0Var.a > 0 : wy0Var.b < this.s.a() - 1) {
                return true;
            }
        } else if (this.u != di1.f) {
            if (G0(i)) {
            }
        }
        return false;
    }

    public final boolean G0(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int iOrdinal = qx.V(this).C.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            qj.p();
            return false;
        }
        if (i != 4) {
            fu1.h("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int iOrdinal2 = qx.V(this).C.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        qj.p();
        return false;
    }

    @Override // defpackage.sw0
    public final x61 e(y61 y61Var, r61 r61Var, long j) {
        jm1 jm1VarE = r61Var.e(j);
        return y61Var.d0(jm1VarE.e, jm1VarE.f, db0.e, new ye(jm1VarE, 5));
    }
}
