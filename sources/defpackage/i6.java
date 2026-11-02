package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i6 {
    public static final float a = (25.0f * 2.0f) / 2.4142137f;

    public static final void a(final yf1 yf1Var, final u71 u71Var, long j, ak0 ak0Var, final int i) {
        int i2;
        ak0Var.X(1776202187);
        int i3 = (ak0Var.f(yf1Var) ? 4 : 2) | i | (ak0Var.f(u71Var) ? 32 : 16) | 128;
        if (ak0Var.O(i3 & 1, (i3 & 147) != 146)) {
            ak0Var.T();
            if ((i & 1) == 0 || ak0Var.y()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                ak0Var.R();
                i2 = i3 & (-897);
            }
            ak0Var.q();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objL = ak0Var.L();
            if (z || objL == cv.a) {
                objL = new m(3, yf1Var);
                ak0Var.g0(objL);
            }
            sv0.I(yf1Var, q90.g, vs0.C(-1653527038, new d6(j, l02.a(u71Var, false, (ej0) objL)), ak0Var), ak0Var, i4 | 432);
        } else {
            ak0Var.R();
        }
        final long j2 = j;
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0(u71Var, j2, i) { // from class: e6
                public final /* synthetic */ u71 f;
                public final /* synthetic */ long g;

                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(1);
                    i6.a(this.e, this.f, this.g, (ak0) obj, iP);
                    return ll2.a;
                }
            };
        }
    }

    public static final void b(u71 u71Var, ak0 ak0Var, int i, int i2) {
        int i3;
        ak0Var.X(694251107);
        int i4 = i2 & 1;
        int i5 = 4;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (ak0Var.f(u71Var) ? 4 : 2) | i;
        }
        if (ak0Var.O(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                u71Var = r71.a;
            }
            r02.b(ak0Var, nj2.n(f52.k(u71Var, a, 25.0f), new qt(i5)));
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new f6(u71Var, i, i2);
        }
    }
}
