package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class v4 extends dw0 implements ti0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v4(int i, Object obj, Object obj2) {
        super(0);
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [t71] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [t71] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [fa1] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [fa1] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v18 */
    @Override // defpackage.ti0
    public final Object a() {
        p02 p02Var;
        ax0 ax0Var;
        yr1 yr1Var;
        int i = this.f;
        ll2 ll2Var = ll2.a;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj));
            case 1:
                k5 k5Var = (k5) obj;
                wx1 wx1Var = (wx1) obj2;
                nx1 nx1Var = wx1Var.i;
                nx1 nx1Var2 = wx1Var.j;
                Float f = wx1Var.g;
                Float f2 = wx1Var.h;
                float fFloatValue = (nx1Var == null || f == null) ? 0.0f : ((Number) nx1Var.a.a()).floatValue() - f.floatValue();
                float fFloatValue2 = (nx1Var2 == null || f2 == null) ? 0.0f : ((Number) nx1Var2.a.a()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iV = k5Var.v(wx1Var.e);
                    s02 s02Var = (s02) k5Var.n().b(k5Var.o);
                    if (s02Var != null) {
                        try {
                            k1 k1Var = k5Var.q;
                            if (k1Var != null) {
                                k1Var.a.setBoundsInScreen(k5Var.f(s02Var));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    s02 s02Var2 = (s02) k5Var.n().b(k5Var.p);
                    if (s02Var2 != null) {
                        try {
                            k1 k1Var2 = k5Var.r;
                            if (k1Var2 != null) {
                                k1Var2.a.setBoundsInScreen(k5Var.f(s02Var2));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    k5Var.h.invalidate();
                    s02 s02Var3 = (s02) k5Var.n().b(iV);
                    if (s02Var3 != null && (p02Var = s02Var3.a) != null && (ax0Var = p02Var.c) != null) {
                        if (nx1Var != null) {
                            k5Var.t.h(iV, nx1Var);
                        }
                        if (nx1Var2 != null) {
                            k5Var.u.h(iV, nx1Var2);
                        }
                        k5Var.r(ax0Var);
                    }
                }
                if (nx1Var != null) {
                    wx1Var.g = (Float) nx1Var.a.a();
                }
                if (nx1Var2 != null) {
                    wx1Var.h = (Float) nx1Var2.a.a();
                }
                return ll2Var;
            case 2:
                ti0 ti0Var = (ti0) obj2;
                if (ti0Var != null && (yr1Var = (yr1) ti0Var.a()) != null) {
                    return yr1Var;
                }
                me1 me1Var = (me1) obj;
                if (!me1Var.S0().r) {
                    me1Var = null;
                }
                if (me1Var != null) {
                    return sv.e(0L, ux.M(me1Var.g));
                }
                return null;
            case 3:
                ((rl) obj2).u.h((sl) obj);
                return ll2Var;
            case 4:
                ((gs1) obj2).e = ((cg0) obj).H0();
                return ll2Var;
            case 5:
                ((sm0) obj2).d((t71) obj);
                return ll2Var;
            case 6:
                he1 he1Var = ((ax0) obj2).I;
                gs1 gs1Var = (gs1) obj;
                if ((he1Var.f.h & 8) != 0) {
                    for (t71 t71Var = he1Var.e; t71Var != null; t71Var = t71Var.i) {
                        if ((t71Var.g & 8) != 0) {
                            ?? P = t71Var;
                            ?? fa1Var = 0;
                            while (P != 0) {
                                if (P instanceof m02) {
                                    m02 m02Var = (m02) P;
                                    if (m02Var.g0()) {
                                        i02 i02Var = new i02();
                                        gs1Var.e = i02Var;
                                        i02Var.h = true;
                                    }
                                    if (m02Var.h0()) {
                                        ((i02) gs1Var.e).g = true;
                                    }
                                    m02Var.e0((z02) gs1Var.e);
                                } else if ((P.g & 8) != 0 && (P instanceof c40)) {
                                    t71 t71Var2 = ((c40) P).t;
                                    int i2 = 0;
                                    while (t71Var2 != null) {
                                        if ((t71Var2.g & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                P = P;
                                                fa1Var = fa1Var;
                                                fa1Var = fa1Var;
                                                P = t71Var2;
                                            } else {
                                                if (fa1Var == 0) {
                                                    fa1Var = new fa1(new t71[16]);
                                                }
                                                if (P != 0) {
                                                    fa1Var.b(P);
                                                    P = 0;
                                                }
                                                fa1Var.b(t71Var2);
                                            }
                                        } else {
                                            P = P;
                                            fa1Var = fa1Var;
                                        }
                                        t71Var2 = t71Var2.j;
                                        P = P;
                                        fa1Var = fa1Var;
                                    }
                                    if (i2 == 1) {
                                        P = P;
                                        fa1Var = fa1Var;
                                    } else {
                                        P = P;
                                        fa1Var = fa1Var;
                                    }
                                }
                                P = qx.P(fa1Var);
                            }
                        }
                    }
                }
                return ll2Var;
            default:
                bu1 bu1Var = me1.Q;
                ((ej0) obj2).h(bu1Var);
                me1 me1Var2 = (me1) obj;
                boolean zJ = ws0.j(me1Var2.H, bu1Var.o);
                boolean z = me1Var2.I;
                boolean z2 = bu1Var.p;
                boolean z3 = z != z2;
                if (!zJ || z3) {
                    me1Var2.H = bu1Var.o;
                    me1Var2.I = z2;
                    if (me1Var2.J && (z3 || (z2 && !zJ))) {
                        me1Var2.s.F();
                    }
                }
                me1Var2.J = true;
                bu1Var.u = bu1Var.o.a(bu1Var.q, bu1Var.s, bu1Var.r);
                return ll2Var;
        }
    }
}
