package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v30 {
    public static final yo1 a = new yo1(true);

    public static final void a(ad2 ad2Var, mc2 mc2Var, ak0 ak0Var, int i) {
        ak0 ak0Var2;
        Context context;
        ak0Var.X(1904307118);
        int i2 = (ak0Var.f(ad2Var) ? 4 : 2) | i | (ak0Var.h(mc2Var) ? 32 : 16);
        if (ak0Var.O(i2 & 1, (i2 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                ak0Var.W(-1009482584);
                context = (Context) ak0Var.j(u5.b);
                ak0Var.p(false);
            } else {
                ak0Var.W(-1009433480);
                ak0Var.p(false);
                context = null;
            }
            boolean zH = ak0Var.h(mc2Var) | ((i2 & 14) == 4) | ak0Var.h(context);
            Object objL = ak0Var.L();
            if (zH || objL == cv.a) {
                objL = new o1(mc2Var, context, ad2Var, 7);
                ak0Var.g0(objL);
            }
            ak0Var2 = ak0Var;
            px.b(null, null, (ej0) objL, ak0Var2, 0, 3);
        } else {
            ak0Var2 = ak0Var;
            ak0Var2.R();
        }
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new jd(ad2Var, mc2Var, i, 11);
        }
    }

    public static final void b(final int i, final long j, ak0 ak0Var, final int i2) {
        int i3;
        final long j2;
        ak0Var.X(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = (ak0Var.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ak0Var.e(j) ? 32 : 16;
        }
        if (ak0Var.O(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) ak0Var.j(u5.b);
            boolean zF = ((i3 & 14) == 4) | ak0Var.f(context);
            Object objL = ak0Var.L();
            Object obj = cv.a;
            if (zF || objL == obj) {
                objL = Integer.valueOf(context.obtainStyledAttributes(new int[]{i}).getResourceId(0, -1));
                ak0Var.g0(objL);
            }
            int iIntValue = ((Number) objL).intValue();
            if (iIntValue == -1) {
                lr1 lr1VarR = ak0Var.r();
                if (lr1VarR != null) {
                    final int i4 = 1;
                    lr1VarR.d = new ij0() { // from class: u30
                        @Override // defpackage.ij0
                        public final Object g(Object obj2, Object obj3) {
                            int i5 = i4;
                            ll2 ll2Var = ll2.a;
                            int i6 = i2;
                            long j3 = j;
                            int i7 = i;
                            ak0 ak0Var2 = (ak0) obj2;
                            ((Integer) obj3).getClass();
                            switch (i5) {
                                case 0:
                                    v30.b(i7, j3, ak0Var2, ei1.P(i6 | 1));
                                    break;
                                default:
                                    v30.b(i7, j3, ak0Var2, ei1.P(i6 | 1));
                                    break;
                            }
                            return ll2Var;
                        }
                    };
                    return;
                }
                return;
            }
            boolean z = true;
            j2 = j;
            nj1 nj1VarK = vv.K(iIntValue, ak0Var);
            if ((i3 & 112) != 32) {
                z = false;
            }
            Object objL2 = ak0Var.L();
            if (z || objL2 == obj) {
                objL2 = j2 == 16 ? null : new yi(5, j2);
                ak0Var.g0(objL2);
            }
            xj.a(dv1.F(f52.j(ox.e), nj1VarK, dx.a, (yi) objL2, 22), ak0Var, 0);
        } else {
            j2 = j;
            ak0Var.R();
        }
        lr1 lr1VarR2 = ak0Var.r();
        if (lr1VarR2 != null) {
            final int i5 = 0;
            lr1VarR2.d = new ij0() { // from class: u30
                @Override // defpackage.ij0
                public final Object g(Object obj2, Object obj3) {
                    int i6 = i5;
                    ll2 ll2Var = ll2.a;
                    int i7 = i2;
                    long j3 = j2;
                    int i8 = i;
                    ak0 ak0Var2 = (ak0) obj2;
                    ((Integer) obj3).getClass();
                    switch (i6) {
                        case 0:
                            v30.b(i8, j3, ak0Var2, ei1.P(i7 | 1));
                            break;
                        default:
                            v30.b(i8, j3, ak0Var2, ei1.P(i7 | 1));
                            break;
                    }
                    return ll2Var;
                }
            };
        }
    }

    public static final void c(ad2 ad2Var, nc2 nc2Var, ti0 ti0Var, ak0 ak0Var, int i) {
        int i2;
        ak0Var.X(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ak0Var.f(ad2Var) : ak0Var.h(ad2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? ak0Var.f(nc2Var) : ak0Var.h(nc2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ak0Var.h(ti0Var) ? 256 : 128;
        }
        boolean z = false;
        if (ak0Var.O(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && ak0Var.f(nc2Var));
            Object objL = ak0Var.L();
            is1 is1Var = cv.a;
            if (z2 || objL == is1Var) {
                objL = new r51(new ao2(8, new n1(12, nc2Var, ti0Var)));
                ak0Var.g0(objL);
            }
            r51 r51Var = (r51) objL;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && ak0Var.h(ad2Var))) {
                z = true;
            }
            Object objL2 = ak0Var.L();
            if (z || objL2 == is1Var) {
                objL2 = new w8(8, ad2Var);
                ak0Var.g0(objL2);
            }
            s8.a(r51Var, (ti0) objL2, a, vs0.C(1315155414, new jd(10, nc2Var, ad2Var), ak0Var), ak0Var, 3456, 0);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new y8(ad2Var, nc2Var, ti0Var, i, 7);
        }
    }

    public static final void d(u71 u71Var, gt gtVar, ak0 ak0Var, int i) {
        int i2;
        ak0Var.X(1392105195);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (ak0Var.f(u71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.h(gtVar) ? 32 : 16;
        }
        if (ak0Var.O(i2 & 1, (i2 & 19) != 18)) {
            p61.m(u71Var, yc2.a, gtVar, ak0Var, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new q9(u71Var, gtVar, i, i3);
        }
    }
}
