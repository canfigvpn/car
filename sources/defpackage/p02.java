package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class p02 {
    public final t71 a;
    public final boolean b;
    public final ax0 c;
    public final i02 d;
    public p02 e;
    public final int f;

    public p02(t71 t71Var, boolean z, ax0 ax0Var, i02 i02Var) {
        this.a = t71Var;
        this.b = z;
        this.c = ax0Var;
        this.d = i02Var;
        this.f = ax0Var.f;
    }

    public static /* synthetic */ List j(int i, p02 p02Var) {
        return p02Var.i((i & 1) != 0 ? !p02Var.b : false, (i & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [t71] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [t71] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [fa1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [fa1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final yr1 a(me1 me1Var) {
        ?? P;
        p02 p02VarL = l();
        if (p02VarL == null) {
            return yr1.e;
        }
        t71 t71Var = p02VarL.c.I.f;
        if ((t71Var.h & 8) == 0) {
            P = 0;
            break;
        }
        loop0: while (true) {
            if (t71Var != null) {
                if ((t71Var.g & 8) != 0) {
                    P = t71Var;
                    ?? fa1Var = 0;
                    while (P != 0) {
                        if (P instanceof m02) {
                            if (((m02) P).i()) {
                                break loop0;
                            }
                        } else if ((P.g & 8) != 0 && (P instanceof c40)) {
                            t71 t71Var2 = ((c40) P).t;
                            int i = 0;
                            while (t71Var2 != null) {
                                if ((t71Var2.g & 8) != 0) {
                                    i++;
                                    if (i == 1) {
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
                            if (i == 1) {
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
                if ((t71Var.h & 8) != 0) {
                    t71Var = t71Var.j;
                }
            }
            P = 0;
            break;
        }
        m02 m02Var = (m02) P;
        me1 me1VarT = m02Var != null ? qx.T(m02Var, 8) : null;
        return me1VarT == null ? p02VarL.a(me1Var) : me1VarT.K(me1Var, true);
    }

    public final p02 b(wu1 wu1Var, ej0 ej0Var) {
        i02 i02Var = new i02();
        i02Var.g = false;
        i02Var.h = false;
        ej0Var.h(i02Var);
        p02 p02Var = new p02(new o02(ej0Var), false, new ax0(this.f + (wu1Var != null ? 1000000000 : 2000000000), true), i02Var);
        p02Var.e = this;
        return p02Var;
    }

    public final void c(ax0 ax0Var, ArrayList arrayList) {
        fa1 fa1VarX = ax0Var.x();
        Object[] objArr = fa1VarX.e;
        int i = fa1VarX.g;
        for (int i2 = 0; i2 < i; i2++) {
            ax0 ax0Var2 = (ax0) objArr[i2];
            if (ax0Var2.H() && !ax0Var2.R) {
                if (ax0Var2.I.c(8)) {
                    arrayList.add(r02.a(ax0Var2, this.b));
                } else {
                    c(ax0Var2, arrayList);
                }
            }
        }
    }

    public final me1 d() {
        if (!n()) {
            m02 m02VarF = f();
            return m02VarF != null ? qx.T(m02VarF, 8) : this.c.I.c;
        }
        p02 p02VarL = l();
        if (p02VarL != null) {
            return p02VarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        r(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            p02 p02Var = (p02) arrayList.get(size2);
            if (p02Var.o()) {
                arrayList2.add(p02Var);
            } else if (!p02Var.d.h) {
                p02Var.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [t71] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [t71] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [fa1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [fa1] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final m02 f() {
        ?? P;
        boolean z;
        ?? r0;
        boolean z2 = this.d.g;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        ax0 ax0Var = this.c;
        if (!z2) {
            t71 t71Var = ax0Var.I.f;
            if ((t71Var.h & 8) != 0) {
                loop3: while (t71Var != null) {
                    if ((t71Var.g & 8) != 0) {
                        P = t71Var;
                        ?? fa1Var = 0;
                        while (true) {
                            if (P != 0) {
                                if (P instanceof m02) {
                                    if (((m02) P).i()) {
                                        r4 = P;
                                    }
                                } else if ((P.g & 8) != 0 && (P instanceof c40)) {
                                    t71 t71Var2 = ((c40) P).t;
                                    int i = 0;
                                    while (t71Var2 != null) {
                                        if ((t71Var2.g & 8) != 0) {
                                            i++;
                                            if (i == 1) {
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
                                    if (i == 1) {
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
                    if ((t71Var.h & 8) == 0) {
                        break;
                    }
                    t71Var = t71Var.j;
                }
            }
        } else {
            t71 t71Var3 = ax0Var.I.f;
            if ((t71Var3.h & 8) != 0) {
                P = 0;
                while (t71Var3 != null) {
                    if ((t71Var3.g & 8) != 0) {
                        t71 t71VarP = t71Var3;
                        fa1 fa1Var2 = null;
                        while (t71VarP != null) {
                            if (t71VarP instanceof m02) {
                                m02 m02Var = (m02) t71VarP;
                                if (m02Var.i()) {
                                    if (m02Var.h0()) {
                                        r0 = P;
                                        r0 = P;
                                        return m02Var;
                                    }
                                    if (P == 0) {
                                        r0 = m02Var;
                                    }
                                }
                                r0 = P;
                                z = false;
                                P = r0;
                            } else {
                                z = true;
                            }
                            if (z) {
                                P = P;
                                if ((t71VarP.g & 8) != 0 && (t71VarP instanceof c40)) {
                                    int i2 = 0;
                                    for (t71 t71Var4 = ((c40) t71VarP).t; t71Var4 != null; t71Var4 = t71Var4.j) {
                                        if ((t71Var4.g & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                t71VarP = t71Var4;
                                            } else {
                                                if (fa1Var2 == null) {
                                                    fa1Var2 = new fa1(new t71[16]);
                                                }
                                                if (t71VarP != null) {
                                                    fa1Var2.b(t71VarP);
                                                    t71VarP = null;
                                                }
                                                fa1Var2.b(t71Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                            } else {
                                P = P;
                            }
                            t71VarP = qx.P(fa1Var2);
                        }
                    }
                    if ((t71Var3.h & 8) == 0) {
                        break;
                    }
                    t71Var3 = t71Var3.j;
                    P = P;
                }
                r4 = P;
            }
        }
        return (m02) r4;
    }

    public final yr1 g() {
        me1 me1VarD = d();
        if (me1VarD != null) {
            if (!me1VarD.S0().r) {
                me1VarD = null;
            }
            if (me1VarD != null) {
                return sv.A(me1VarD).K(me1VarD, true);
            }
        }
        return yr1.e;
    }

    public final yr1 h() {
        me1 me1VarD = d();
        if (me1VarD != null) {
            if (!me1VarD.S0().r) {
                me1VarD = null;
            }
            if (me1VarD != null) {
                return sv.m(me1VarD, true);
            }
        }
        return yr1.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.h) {
            return cb0.e;
        }
        ArrayList arrayList = new ArrayList();
        if (!o()) {
            return r(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final i02 k() {
        boolean zO = o();
        i02 i02Var = this.d;
        if (!zO) {
            return i02Var;
        }
        i02 i02VarB = i02Var.b();
        q(new ArrayList(), i02VarB);
        return i02VarB;
    }

    public final p02 l() {
        ax0 ax0VarU;
        p02 p02Var = this.e;
        if (p02Var != null) {
            return p02Var;
        }
        ax0 ax0Var = this.c;
        boolean z = this.b;
        if (!z) {
            ax0VarU = null;
            break;
        }
        ax0VarU = ax0Var.u();
        while (true) {
            if (ax0VarU == null) {
                ax0VarU = null;
                break;
            }
            i02 i02VarW = ax0VarU.w();
            if (i02VarW != null && i02VarW.g) {
                break;
            }
            ax0VarU = ax0VarU.u();
        }
        if (ax0VarU == null) {
            for (ax0 ax0VarU2 = ax0Var.u(); ax0VarU2 != null; ax0VarU2 = ax0VarU2.u()) {
                if (ax0VarU2.I.c(8)) {
                    ax0VarU = ax0VarU2;
                }
            }
            ax0VarU = null;
        }
        if (ax0VarU == null) {
            return null;
        }
        return r02.a(ax0VarU, z);
    }

    public final yr1 m() {
        Object objF = f();
        if (objF == null) {
            return this.c.I.c.o1();
        }
        t71 t71Var = ((t71) objF).e;
        Object objG = this.d.e.g(h02.b);
        if (objG == null) {
            objG = null;
        }
        return n02.i(t71Var, objG != null, true);
    }

    public final boolean n() {
        return this.e != null;
    }

    public final boolean o() {
        return this.b && this.d.g;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public final boolean p() {
        if (n() || !j(4, this).isEmpty()) {
            return false;
        }
        ax0 ax0VarU = this.c.u();
        while (ax0VarU != null) {
            i02 i02VarW = ax0VarU.w();
            if (i02VarW != null && i02VarW.g) {
                if (ax0VarU == null) {
                    return true;
                }
                return false;
            }
            ax0VarU = ax0VarU.u();
        }
        ax0VarU = null;
        if (ax0VarU == null) {
            return true;
        }
        return false;
    }

    public final void q(ArrayList arrayList, i02 i02Var) {
        if (this.d.h) {
            return;
        }
        r(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            p02 p02Var = (p02) arrayList.get(size2);
            if (!p02Var.o()) {
                i02Var.d(p02Var.d);
                p02Var.q(arrayList, i02Var);
            }
        }
    }

    public final List r(ArrayList arrayList, boolean z) {
        if (n()) {
            return cb0.e;
        }
        c(this.c, arrayList);
        if (z) {
            i02 i02Var = this.d;
            w91 w91Var = i02Var.e;
            Object objG = w91Var.g(u02.z);
            if (objG == null) {
                objG = null;
            }
            wu1 wu1Var = (wu1) objG;
            if (wu1Var != null && i02Var.g && !arrayList.isEmpty()) {
                arrayList.add(b(wu1Var, new y3(17, wu1Var)));
            }
            y02 y02Var = u02.a;
            if (w91Var.c(y02Var) && !arrayList.isEmpty() && i02Var.g) {
                Object objG2 = w91Var.g(y02Var);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) vq.R(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new y3(18, str)));
                }
            }
        }
        return arrayList;
    }
}
