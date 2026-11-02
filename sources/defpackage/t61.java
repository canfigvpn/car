package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class t61 {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;

    public t61(c00 c00Var, z90 z90Var, fg0 fg0Var) {
        int i;
        Object kwVar;
        av1 av1Var = c00Var.g;
        w40 w40Var = c00Var.c;
        wv1 wv1Var = c00Var.p;
        String str = c00Var.b;
        this.c = c00Var;
        this.d = z90Var;
        Object obj = c00Var.e;
        this.e = obj == null ? cb0.e : obj;
        ai0 ai0Var = null;
        if (wv1Var != null) {
            this.g = null;
            if (wv1Var.j()) {
                kwVar = new pk1(new dq0(this, wv1Var), str == null ? ":memory:" : str, fg0Var);
            } else if (str == null) {
                kwVar = new kw(new dq0(this, wv1Var));
            } else {
                dq0 dq0Var = new dq0(this, wv1Var);
                int iOrdinal = av1Var.ordinal();
                if (iOrdinal == 1) {
                    i = 1;
                } else {
                    if (iOrdinal != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + av1Var + '\'').toString());
                    }
                    i = 4;
                }
                int iOrdinal2 = av1Var.ordinal();
                if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + av1Var + '\'').toString());
                }
                kwVar = new kw(dq0Var, str, i);
            }
            this.f = kwVar;
        } else {
            if (w40Var == null) {
                qj.r("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            ai0Var = new ai0(c00Var.a, str, new qs(this, z90Var.a));
            this.g = ai0Var;
            this.f = new pk1(new qk1(ai0Var), str == null ? ":memory:" : str, fg0Var);
        }
        boolean z = av1Var == av1.f;
        if (ai0Var != null) {
            ai0Var.setWriteAheadLoggingEnabled(z);
        }
    }

    public static void a(vv1 vv1Var) {
        xv1 xv1VarC = vv1Var.C("PRAGMA busy_timeout");
        try {
            xv1VarC.y();
            long j = xv1VarC.getLong(0);
            ir2.h(xv1VarC, null);
            if (j < 3000) {
                ix.t(vv1Var, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ir2.h(xv1VarC, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static boolean d(ax0 ax0Var, sw swVar) throws Throwable {
        boolean zZ0;
        ax0 ax0Var2 = ax0Var.l;
        ex0 ex0Var = ax0Var.J;
        if (ax0Var2 == null) {
            return false;
        }
        if (swVar == null) {
            d51 d51Var = ex0Var.q;
            sw swVar2 = d51Var != null ? d51Var.r : null;
            if (swVar2 == null || ax0Var2 == null) {
                zZ0 = false;
            } else {
                d51Var.getClass();
                zZ0 = d51Var.z0(swVar2.a);
            }
        } else if (ax0Var2 != null) {
            d51 d51Var2 = ex0Var.q;
            d51Var2.getClass();
            zZ0 = d51Var2.z0(swVar.a);
        } else {
            zZ0 = false;
        }
        ax0 ax0VarU = ax0Var.u();
        if (zZ0 && ax0VarU != null) {
            if (ax0VarU.l == null) {
                ax0.V(ax0VarU, false, 3);
                return zZ0;
            }
            if (ax0Var.s() == yw0.e) {
                ax0.T(ax0VarU, false, 3);
                return zZ0;
            }
            if (ax0Var.s() == yw0.f) {
                ax0VarU.S(false);
            }
        }
        return zZ0;
    }

    public static boolean e(ax0 ax0Var, sw swVar) throws Throwable {
        boolean zY0;
        yw0 yw0Var = yw0.g;
        if (swVar != null) {
            if (ax0Var.F == yw0Var) {
                ax0Var.e();
            }
            zY0 = ax0Var.J.p.y0(swVar.a);
        } else {
            v61 v61Var = ax0Var.J.p;
            sw swVar2 = v61Var.n ? new sw(v61Var.h) : null;
            if (swVar2 != null) {
                if (ax0Var.F == yw0Var) {
                    ax0Var.e();
                }
                zY0 = ax0Var.J.p.y0(swVar2.a);
            } else {
                ax0Var.getClass();
                zY0 = false;
            }
        }
        ax0 ax0VarU = ax0Var.u();
        if (zY0 && ax0VarU != null) {
            if (ax0Var.r() == yw0.e) {
                ax0.V(ax0VarU, false, 3);
                return zY0;
            }
            if (ax0Var.r() == yw0.f) {
                ax0VarU.U(false);
            }
        }
        return zY0;
    }

    public static boolean j(ax0 ax0Var) {
        d51 d51Var;
        bx0 bx0Var;
        if (ax0Var.J.e) {
            return (ax0Var.s() == yw0.g && ((d51Var = ax0Var.J.q) == null || (bx0Var = d51Var.v) == null || !bx0Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean k(ax0 ax0Var) {
        if (!ax0Var.q()) {
            return false;
        }
        do {
            if (ax0Var.r() == yw0.g && !ax0Var.J.p.B.e()) {
                ax0 ax0VarU = ax0Var.u();
                if ((ax0VarU != null ? ax0VarU.J.d : null) != ww0.e) {
                    return false;
                }
            }
            ax0Var = ax0Var.u();
            if (ax0Var == null) {
                return false;
            }
        } while (!ax0Var.I());
        return true;
    }

    public static boolean l(ax0 ax0Var) {
        d51 d51Var;
        bx0 bx0Var;
        ex0 ex0Var = ax0Var.J;
        return ax0Var.I() || ex0Var.p.x || k(ax0Var) || ws0.j(ax0Var.J(), Boolean.TRUE) || j(ax0Var) || ex0Var.p.B.e() || !((d51Var = ex0Var.q) == null || (bx0Var = d51Var.v) == null || !bx0Var.e());
    }

    public void b(vv1 vv1Var) throws Throwable {
        Object ut1Var;
        z90 z90Var = (z90) this.d;
        c00 c00Var = (c00) this.c;
        av1 av1Var = c00Var.g;
        av1 av1Var2 = av1.f;
        if (av1Var == av1Var2) {
            ix.t(vv1Var, "PRAGMA journal_mode = WAL");
        } else {
            ix.t(vv1Var, "PRAGMA journal_mode = TRUNCATE");
        }
        if (c00Var.g == av1Var2) {
            ix.t(vv1Var, "PRAGMA synchronous = NORMAL");
        } else {
            ix.t(vv1Var, "PRAGMA synchronous = FULL");
        }
        a(vv1Var);
        xv1 xv1VarC = vv1Var.C("PRAGMA user_version");
        try {
            xv1VarC.y();
            int i = (int) xv1VarC.getLong(0);
            ir2.h(xv1VarC, null);
            int i2 = z90Var.a;
            int i3 = z90Var.a;
            if (i != i2) {
                ix.t(vv1Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        p(vv1Var);
                    } else {
                        q(vv1Var, i, i3);
                    }
                    ix.t(vv1Var, "PRAGMA user_version = " + i3);
                    ut1Var = ll2.a;
                } catch (Throwable th) {
                    ut1Var = new ut1(th);
                }
                if (!(ut1Var instanceof ut1)) {
                    ix.t(vv1Var, "END TRANSACTION");
                }
                Throwable thA = vt1.a(ut1Var);
                if (thA != null) {
                    ix.t(vv1Var, "ROLLBACK TRANSACTION");
                    throw thA;
                }
            }
            r(vv1Var);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ir2.h(xv1VarC, th2);
                throw th3;
            }
        }
    }

    public void c(boolean z) {
        dq0 dq0Var = (dq0) this.e;
        fa1 fa1Var = (fa1) dq0Var.f;
        if (z) {
            ax0 ax0Var = (ax0) this.c;
            if (ax0Var.Q > 0) {
                fa1Var.g();
                fa1Var.b(ax0Var);
                ax0Var.P = true;
            }
        }
        if (fa1Var.g != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                dq0Var.m();
            } finally {
                Trace.endSection();
            }
        }
    }

    public void f() {
        fa1 fa1Var = (fa1) this.g;
        int i = fa1Var.g;
        if (i != 0) {
            Object[] objArr = fa1Var.e;
            for (int i2 = 0; i2 < i; i2++) {
                s61 s61Var = (s61) objArr[i2];
                if (s61Var.a.H()) {
                    boolean z = s61Var.b;
                    ax0 ax0Var = s61Var.a;
                    boolean z2 = s61Var.c;
                    if (z) {
                        ax0.T(ax0Var, z2, 2);
                    } else {
                        ax0.V(ax0Var, z2, 2);
                    }
                }
            }
            fa1Var.g();
        }
    }

    public void g(ax0 ax0Var) {
        fa1 fa1VarZ = ax0Var.z();
        Object[] objArr = fa1VarZ.e;
        int i = fa1VarZ.g;
        for (int i2 = 0; i2 < i; i2++) {
            ax0 ax0Var2 = (ax0) objArr[i2];
            if (ws0.j(ax0Var2.J(), Boolean.TRUE) && !ax0Var2.R) {
                if (((ud) this.d).b(ax0Var2)) {
                    ax0Var2.K();
                }
                g(ax0Var2);
            }
        }
    }

    public void h(ax0 ax0Var, boolean z) {
        if (!this.a) {
            vp0.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? ax0Var.J.e : ax0Var.q()) {
            vp0.a("node not yet measured");
        }
        i(ax0Var, z);
    }

    public void i(ax0 ax0Var, boolean z) throws Throwable {
        d51 d51Var;
        bx0 bx0Var;
        fa1 fa1VarZ = ax0Var.z();
        Object[] objArr = fa1VarZ.e;
        int i = fa1VarZ.g;
        for (int i2 = 0; i2 < i; i2++) {
            ax0 ax0Var2 = (ax0) objArr[i2];
            yw0 yw0Var = yw0.e;
            if ((!z && (ax0Var2.r() == yw0Var || ax0Var2.J.p.B.e())) || (z && (ax0Var2.s() == yw0Var || ((d51Var = ax0Var2.J.q) != null && (bx0Var = d51Var.v) != null && bx0Var.e())))) {
                boolean zB = ex.B(ax0Var2);
                ex0 ex0Var = ax0Var2.J;
                if (zB && !z) {
                    if (ex0Var.e && ((ud) this.d).b(ax0Var2)) {
                        t(ax0Var2, true);
                    } else {
                        h(ax0Var2, true);
                    }
                }
                if (z ? ex0Var.e : ax0Var2.q()) {
                    t(ax0Var2, z);
                }
                if (!(z ? ex0Var.e : ax0Var2.q())) {
                    i(ax0Var2, z);
                }
            }
        }
        if (z ? ax0Var.J.e : ax0Var.q()) {
            t(ax0Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [t71] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [t71] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [fa1] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [fa1] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    public boolean m(u4 u4Var) {
        boolean z;
        ?? P;
        boolean z2;
        ax0 ax0Var;
        boolean z3;
        boolean zT;
        ud udVar = (ud) this.d;
        ao2 ao2Var = (ao2) udVar.b;
        ax0 ax0Var2 = (ax0) this.c;
        if (!ax0Var2.H()) {
            vp0.a("performMeasureAndLayout called with unattached root");
        }
        if (!ax0Var2.I()) {
            vp0.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.a) {
            vp0.a("performMeasureAndLayout called during measure layout");
        }
        int i = 0;
        if (((sw) this.h) != null) {
            this.a = true;
            this.b = true;
            try {
                if (udVar.p()) {
                    z = false;
                    while (true) {
                        ao2 ao2Var2 = (ao2) udVar.d;
                        p72 p72Var = (p72) ao2Var2.f;
                        ao2 ao2Var3 = (ao2) udVar.c;
                        p72 p72Var2 = (p72) ao2Var3.f;
                        if (!((p72) ao2Var.f).isEmpty()) {
                            ax0Var = (ax0) ((p72) ao2Var.f).first();
                            ao2Var.q(ax0Var);
                            z3 = ax0Var.l != null;
                            z2 = false;
                        } else if (!p72Var2.isEmpty()) {
                            ax0Var = (ax0) p72Var2.first();
                            ao2Var3.q(ax0Var);
                            z3 = ax0Var.l != null;
                            z2 = true;
                        } else {
                            if (p72Var.isEmpty()) {
                                break;
                            }
                            ax0 ax0Var3 = (ax0) p72Var.first();
                            ao2Var2.q(ax0Var3);
                            z2 = true;
                            ax0Var = ax0Var3;
                            z3 = false;
                        }
                        if (z2) {
                            zT = s(ax0Var, z3);
                        } else {
                            zT = t(ax0Var, z3);
                            if (ax0Var.J.f) {
                                udVar.a(ax0Var, dt0.f);
                            }
                            if (ax0Var.p()) {
                                udVar.a(ax0Var, dt0.h);
                            }
                        }
                        if (ax0Var == ax0Var2 && zT) {
                            z = true;
                        }
                    }
                    if (u4Var != null) {
                        u4Var.a();
                    }
                } else {
                    z = false;
                }
                this.a = false;
                this.b = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.a = false;
                    this.b = false;
                    throw th2;
                }
            }
        } else {
            z = false;
        }
        fa1 fa1Var = (fa1) this.f;
        Object[] objArr = fa1Var.e;
        int i2 = fa1Var.g;
        int i3 = 0;
        while (i3 < i2) {
            he1 he1Var = ((ax0) objArr[i3]).I;
            bq0 bq0Var = he1Var.c;
            boolean zG = ne1.g(4194304);
            t71 t71Var = bq0Var.V;
            if (zG || (t71Var = t71Var.i) != null) {
                bu1 bu1Var = me1.Q;
                t71 t71VarU0 = bq0Var.U0(zG);
                while (t71VarU0 != null && (t71VarU0.h & 4194304) != 0) {
                    if ((t71VarU0.g & 4194304) != 0) {
                        ?? r12 = t71VarU0;
                        ?? fa1Var2 = 0;
                        while (r12 != 0) {
                            if (r12 instanceof hw0) {
                                ((hw0) r12).o(he1Var.c);
                            } else {
                                if ((r12.g & 4194304) != 0 && (r12 instanceof c40)) {
                                    t71 t71Var2 = ((c40) r12).t;
                                    int i4 = i;
                                    while (t71Var2 != null) {
                                        if ((t71Var2.g & 4194304) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                P = r12;
                                                fa1Var2 = fa1Var2;
                                                fa1Var2 = fa1Var2;
                                                P = t71Var2;
                                            } else {
                                                if (fa1Var2 == 0) {
                                                    fa1Var2 = new fa1(new t71[16]);
                                                }
                                                if (P != 0) {
                                                    fa1Var2.b(P);
                                                    P = 0;
                                                }
                                                fa1Var2.b(t71Var2);
                                            }
                                        } else {
                                            P = r12;
                                            fa1Var2 = fa1Var2;
                                        }
                                        t71Var2 = t71Var2.j;
                                        P = P;
                                        fa1Var2 = fa1Var2;
                                    }
                                    if (i4 == 1) {
                                        P = r12;
                                        fa1Var2 = fa1Var2;
                                    }
                                }
                                i = 0;
                                r12 = P;
                                fa1Var2 = fa1Var2;
                            }
                            P = r12;
                            fa1Var2 = fa1Var2;
                            P = qx.P(fa1Var2);
                            i = 0;
                            r12 = P;
                            fa1Var2 = fa1Var2;
                        }
                    }
                    if (t71VarU0 == t71Var) {
                        break;
                    }
                    t71VarU0 = t71VarU0.j;
                    i = 0;
                }
            }
            i3++;
            i = 0;
        }
        fa1Var.g();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [t71] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [t71] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [fa1] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [fa1] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public void n(ax0 ax0Var, long j) {
        ax0 ax0Var2 = (ax0) this.c;
        boolean z = ax0Var.R;
        ex0 ex0Var = ax0Var.J;
        if (z) {
            return;
        }
        if (ax0Var == ax0Var2) {
            vp0.a("measureAndLayout called on root");
        }
        if (!ax0Var2.H()) {
            vp0.a("performMeasureAndLayout called with unattached root");
        }
        if (!ax0Var2.I()) {
            vp0.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.a) {
            vp0.a("performMeasureAndLayout called during measure layout");
        }
        if (((sw) this.h) != null) {
            this.a = true;
            this.b = false;
            try {
                ud udVar = (ud) this.d;
                ((ao2) udVar.b).q(ax0Var);
                ((ao2) udVar.c).q(ax0Var);
                ((ao2) udVar.d).q(ax0Var);
                if (d(ax0Var, new sw(j)) || ex0Var.f) {
                    if (ws0.j(ax0Var.J(), Boolean.TRUE)) {
                        ax0Var.K();
                    }
                }
                g(ax0Var);
                if (ax0Var.F == yw0.g) {
                    ax0Var.e();
                }
                boolean zY0 = ex0Var.p.y0(j);
                ax0 ax0VarU = ax0Var.u();
                if (zY0 && ax0VarU != null) {
                    if (ax0Var.r() == yw0.e) {
                        ax0.V(ax0VarU, false, 3);
                    } else if (ax0Var.r() == yw0.f) {
                        ax0VarU.U(false);
                    }
                }
                if (ax0Var.p() && ax0Var.I()) {
                    ax0Var.R();
                    dq0 dq0Var = (dq0) this.e;
                    if (ax0Var.Q > 0) {
                        ((fa1) dq0Var.f).b(ax0Var);
                        ax0Var.P = true;
                    }
                }
                f();
                this.a = false;
                this.b = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.a = false;
                    this.b = false;
                    throw th2;
                }
            }
        }
        fa1 fa1Var = (fa1) this.f;
        Object[] objArr = fa1Var.e;
        int i = fa1Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            he1 he1Var = ((ax0) objArr[i2]).I;
            bq0 bq0Var = he1Var.c;
            boolean zG = ne1.g(4194304);
            t71 t71Var = bq0Var.V;
            if (zG || (t71Var = t71Var.i) != null) {
                bu1 bu1Var = me1.Q;
                for (t71 t71VarU0 = bq0Var.U0(zG); t71VarU0 != null && (t71VarU0.h & 4194304) != 0; t71VarU0 = t71VarU0.j) {
                    if ((t71VarU0.g & 4194304) != 0) {
                        ?? P = t71VarU0;
                        ?? fa1Var2 = 0;
                        while (P != 0) {
                            if (P instanceof hw0) {
                                ((hw0) P).o(he1Var.c);
                            } else if ((P.g & 4194304) != 0 && (P instanceof c40)) {
                                t71 t71Var2 = ((c40) P).t;
                                int i3 = 0;
                                while (t71Var2 != null) {
                                    if ((t71Var2.g & 4194304) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            P = P;
                                            fa1Var2 = fa1Var2;
                                            fa1Var2 = fa1Var2;
                                            P = t71Var2;
                                        } else {
                                            if (fa1Var2 == 0) {
                                                fa1Var2 = new fa1(new t71[16]);
                                            }
                                            if (P != 0) {
                                                fa1Var2.b(P);
                                                P = 0;
                                            }
                                            fa1Var2.b(t71Var2);
                                        }
                                    } else {
                                        P = P;
                                        fa1Var2 = fa1Var2;
                                    }
                                    t71Var2 = t71Var2.j;
                                    P = P;
                                    fa1Var2 = fa1Var2;
                                }
                                if (i3 == 1) {
                                    P = P;
                                    fa1Var2 = fa1Var2;
                                } else {
                                    P = P;
                                    fa1Var2 = fa1Var2;
                                }
                            }
                            P = qx.P(fa1Var2);
                        }
                    }
                    if (t71VarU0 == t71Var) {
                        break;
                    }
                }
            }
        }
        fa1Var.g();
    }

    public void o() {
        ax0 ax0Var = (ax0) this.c;
        ud udVar = (ud) this.d;
        if (udVar.p()) {
            if (!ax0Var.H()) {
                vp0.a("performMeasureAndLayout called with unattached root");
            }
            if (!ax0Var.I()) {
                vp0.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.a) {
                vp0.a("performMeasureAndLayout called during measure layout");
            }
            if (((sw) this.h) != null) {
                this.a = true;
                this.b = false;
                try {
                    if ((((p72) ((ao2) udVar.d).f).isEmpty() || ((p72) ((ao2) udVar.b).f).isEmpty()) ? false : true) {
                        if (ax0Var.l != null) {
                            v(ax0Var, true);
                        } else {
                            u(ax0Var);
                        }
                    }
                    v(ax0Var, false);
                    this.a = false;
                    this.b = false;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        this.a = false;
                        this.b = false;
                        throw th2;
                    }
                }
            }
        }
    }

    public void p(vv1 vv1Var) {
        z90 z90Var = (z90) this.d;
        vv1Var.getClass();
        xv1 xv1VarC = vv1Var.C("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (xv1VarC.y() && xv1VarC.getLong(0) == 0) {
                z = true;
            }
            ir2.h(xv1VarC, null);
            z90Var.a(vv1Var);
            if (!z) {
                dv dvVarG = z90Var.g(vv1Var);
                if (!dvVarG.a) {
                    fu1.g((String) dvVarG.b, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            x(vv1Var);
            z90Var.c(vv1Var);
            for (zu1 zu1Var : (List) this.e) {
                zu1Var.getClass();
                if (vv1Var instanceof ha2) {
                    zu1Var.a(((ha2) vv1Var).e);
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ir2.h(xv1VarC, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX WARN: Code duplicated, block: B:145:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:? A[LOOP:4: B:9:0x0028->B:149:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:63:0x0139  */
    public void q(vv1 vv1Var, int i, int i2) {
        Iterable iterable;
        LinkedHashMap linkedHashMap;
        TreeMap treeMap;
        qj1 qj1Var;
        Iterator it;
        boolean z;
        int iIntValue;
        TreeMap treeMap2;
        boolean z2;
        z90 z90Var = (z90) this.d;
        vv1Var.getClass();
        c00 c00Var = (c00) this.c;
        qp0 qp0Var = c00Var.d;
        if (i == i2) {
            iterable = cb0.e;
        } else {
            boolean z3 = i2 > i;
            ArrayList arrayList = new ArrayList();
            int i3 = i;
            while (true) {
                if (z3) {
                    if (i3 < i2) {
                        linkedHashMap = qp0Var.a;
                        if (z3) {
                            treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                            if (treeMap2 == null) {
                                qj1Var = null;
                            } else {
                                qj1Var = new qj1(treeMap2, treeMap2.descendingKeySet());
                            }
                        } else {
                            treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                            if (treeMap == null) {
                                qj1Var = null;
                            } else {
                                qj1Var = new qj1(treeMap, treeMap.keySet());
                            }
                        }
                        if (qj1Var == null) {
                            Map map = (Map) qj1Var.e;
                            it = ((Iterable) qj1Var.f).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                iIntValue = ((Number) it.next()).intValue();
                                if (z3) {
                                    if (i3 + 1 <= iIntValue && iIntValue <= i2) {
                                        Object obj = map.get(Integer.valueOf(iIntValue));
                                        obj.getClass();
                                        arrayList.add(obj);
                                        z = true;
                                        i3 = iIntValue;
                                        break;
                                    }
                                } else {
                                    if (i2 <= iIntValue && iIntValue < i3) {
                                        Object obj2 = map.get(Integer.valueOf(iIntValue));
                                        obj2.getClass();
                                        arrayList.add(obj2);
                                        z = true;
                                        i3 = iIntValue;
                                        break;
                                        break;
                                    }
                                }
                            }
                            if (!z) {
                            }
                        }
                        iterable = null;
                    } else {
                        iterable = arrayList;
                    }
                } else if (i3 > i2) {
                    linkedHashMap = qp0Var.a;
                    if (z3) {
                        treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap2 == null) {
                            qj1Var = null;
                        } else {
                            qj1Var = new qj1(treeMap2, treeMap2.descendingKeySet());
                        }
                    } else {
                        treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap == null) {
                            qj1Var = null;
                        } else {
                            qj1Var = new qj1(treeMap, treeMap.keySet());
                        }
                    }
                    if (qj1Var == null) {
                        Map map2 = (Map) qj1Var.e;
                        it = ((Iterable) qj1Var.f).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z = false;
                                break;
                                break;
                            }
                            iIntValue = ((Number) it.next()).intValue();
                            if (z3) {
                                if (i3 + 1 <= iIntValue) {
                                    continue;
                                }
                            } else if (i2 <= iIntValue) {
                                continue;
                            }
                        }
                        if (!z) {
                        }
                    }
                    iterable = null;
                } else {
                    iterable = arrayList;
                }
            }
        }
        if (iterable != null) {
            z90Var.f(vv1Var);
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                int i4 = ((wa1) it2.next()).c;
                vv1Var.getClass();
                switch (i4) {
                    case 0:
                        ix.t(vv1Var, "ALTER TABLE `service_records` ADD COLUMN `action` TEXT NOT NULL DEFAULT 'CHANGE'");
                        break;
                    case 1:
                        ix.t(vv1Var, "ALTER TABLE `cars` ADD COLUMN `plateTwoDigits` TEXT NOT NULL DEFAULT ''");
                        ix.t(vv1Var, "ALTER TABLE `cars` ADD COLUMN `plateLetter` TEXT NOT NULL DEFAULT ''");
                        ix.t(vv1Var, "ALTER TABLE `cars` ADD COLUMN `plateThreeDigits` TEXT NOT NULL DEFAULT ''");
                        ix.t(vv1Var, "ALTER TABLE `cars` ADD COLUMN `plateRegion` TEXT NOT NULL DEFAULT ''");
                        ix.t(vv1Var, "CREATE TABLE IF NOT EXISTS `_new_cars` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `make` TEXT NOT NULL, `model` TEXT NOT NULL, `year` INTEGER, `plateTwoDigits` TEXT NOT NULL DEFAULT '', `plateLetter` TEXT NOT NULL DEFAULT '', `plateThreeDigits` TEXT NOT NULL DEFAULT '', `plateRegion` TEXT NOT NULL DEFAULT '', `fuelType` TEXT NOT NULL, `currentOdometerKm` INTEGER NOT NULL, `odometerUpdatedEpochDay` INTEGER NOT NULL, `createdEpochDay` INTEGER NOT NULL)");
                        ix.t(vv1Var, "INSERT INTO `_new_cars` (`id`,`name`,`make`,`model`,`year`,`fuelType`,`currentOdometerKm`,`odometerUpdatedEpochDay`,`createdEpochDay`) SELECT `id`,`name`,`make`,`model`,`year`,`fuelType`,`currentOdometerKm`,`odometerUpdatedEpochDay`,`createdEpochDay` FROM `cars`");
                        ix.t(vv1Var, "DROP TABLE `cars`");
                        ix.t(vv1Var, "ALTER TABLE `_new_cars` RENAME TO `cars`");
                        if (vv1Var instanceof ha2) {
                            ((ha2) vv1Var).e.getClass();
                        }
                        break;
                    case 2:
                        ix.t(vv1Var, "ALTER TABLE `service_types` ADD COLUMN `sortOrder` INTEGER NOT NULL DEFAULT 1000");
                        break;
                    default:
                        ix.t(vv1Var, "ALTER TABLE `cars` ADD COLUMN `typicalDailyKm` INTEGER DEFAULT NULL");
                        ix.t(vv1Var, "CREATE TABLE IF NOT EXISTS `odometer_readings` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `carId` INTEGER NOT NULL, `epochDay` INTEGER NOT NULL, `odometerKm` INTEGER NOT NULL, `source` TEXT NOT NULL, `recordId` INTEGER, FOREIGN KEY(`carId`) REFERENCES `cars`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`recordId`) REFERENCES `service_records`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                        ix.t(vv1Var, "CREATE INDEX IF NOT EXISTS `index_odometer_readings_carId` ON `odometer_readings` (`carId`)");
                        ix.t(vv1Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_odometer_readings_recordId` ON `odometer_readings` (`recordId`)");
                        break;
                }
            }
            dv dvVarG = z90Var.g(vv1Var);
            if (!dvVarG.a) {
                fu1.g((String) dvVarG.b, "Migration didn't properly handle: ");
                return;
            } else {
                z90Var.e(vv1Var);
                x(vv1Var);
                return;
            }
        }
        c00Var.getClass();
        if (i <= i2 || !c00Var.k) {
            Set set = c00Var.l;
            if (!c00Var.j || (set != null && set.contains(Integer.valueOf(i)))) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (z2) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (c00Var.o) {
            xv1 xv1VarC = vv1Var.C("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                z21 z21VarL = vs0.l();
                while (xv1VarC.y()) {
                    String strF = xv1VarC.f(0);
                    if (!o92.z(strF, "sqlite_") && !strF.equals("android_metadata")) {
                        z21VarL.add(new qj1(strF, Boolean.valueOf(ws0.j(xv1VarC.f(1), "view"))));
                    }
                }
                z21 z21VarI = vs0.i(z21VarL);
                ir2.h(xv1VarC, null);
                ListIterator listIterator = z21VarI.listIterator(0);
                while (true) {
                    tm0 tm0Var = (tm0) listIterator;
                    if (!tm0Var.hasNext()) {
                        break;
                    }
                    qj1 qj1Var2 = (qj1) tm0Var.next();
                    String str = (String) qj1Var2.e;
                    if (((Boolean) qj1Var2.f).booleanValue()) {
                        ix.t(vv1Var, "DROP VIEW IF EXISTS `" + str + '`');
                    } else {
                        ix.t(vv1Var, "DROP TABLE IF EXISTS `" + str + '`');
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ir2.h(xv1VarC, th);
                    throw th2;
                }
            }
        } else {
            z90Var.b(vv1Var);
        }
        Iterator it3 = ((List) this.e).iterator();
        while (it3.hasNext()) {
            ((zu1) it3.next()).getClass();
            if (vv1Var instanceof ha2) {
                ((ha2) vv1Var).e.getClass();
            }
        }
        z90Var.a(vv1Var);
    }

    public void r(vv1 vv1Var) throws Throwable {
        Object ut1Var;
        vv1Var.getClass();
        z90 z90Var = (z90) this.d;
        xv1 xv1VarC = vv1Var.C("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z = xv1VarC.y() && xv1VarC.getLong(0) != 0;
            ir2.h(xv1VarC, null);
            if (z) {
                xv1 xv1VarC2 = vv1Var.C("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strF = xv1VarC2.y() ? xv1VarC2.f(0) : null;
                    ir2.h(xv1VarC2, null);
                    if (!((String) z90Var.b).equals(strF) && !((String) z90Var.c).equals(strF)) {
                        throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) z90Var.b) + ", found: " + strF).toString());
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ir2.h(xv1VarC2, th);
                        throw th2;
                    }
                }
            } else {
                ix.t(vv1Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    dv dvVarG = z90Var.g(vv1Var);
                    if (!dvVarG.a) {
                        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + ((String) dvVarG.b)).toString());
                    }
                    z90Var.e(vv1Var);
                    x(vv1Var);
                    ut1Var = ll2.a;
                    if (!(ut1Var instanceof ut1)) {
                        ix.t(vv1Var, "END TRANSACTION");
                    }
                    Throwable thA = vt1.a(ut1Var);
                    if (thA != null) {
                        ix.t(vv1Var, "ROLLBACK TRANSACTION");
                        throw thA;
                    }
                } catch (Throwable th3) {
                    ut1Var = new ut1(th3);
                }
            }
            z90Var.d(vv1Var);
            for (zu1 zu1Var : (List) this.e) {
                zu1Var.getClass();
                if (vv1Var instanceof ha2) {
                    zu1Var.b(((ha2) vv1Var).e);
                }
            }
            this.a = true;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                ir2.h(xv1VarC, th4);
                throw th5;
            }
        }
    }

    public boolean s(ax0 ax0Var, boolean z) {
        sw swVar;
        ax0 ax0VarU;
        ax0 ax0Var2 = (ax0) this.c;
        boolean z2 = ax0Var.R;
        ex0 ex0Var = ax0Var.J;
        boolean zD = false;
        if (!z2 && l(ax0Var)) {
            if (ax0Var == ax0Var2) {
                swVar = (sw) this.h;
                swVar.getClass();
            } else {
                swVar = null;
            }
            if (z) {
                zD = ex0Var.e ? d(ax0Var, swVar) : false;
                if ((zD || ex0Var.f) && ws0.j(ax0Var.J(), Boolean.TRUE)) {
                    ax0Var.K();
                }
            } else {
                boolean zE = ax0Var.q() ? e(ax0Var, swVar) : false;
                if (ax0Var.p() && (ax0Var == ax0Var2 || ((ax0VarU = ax0Var.u()) != null && ax0VarU.I() && ex0Var.p.x))) {
                    if (ax0Var == ax0Var2) {
                        if (ax0Var.F == yw0.g) {
                            ax0Var.f();
                        }
                        ax0 ax0VarU2 = ax0Var.u();
                        im1.k(ax0VarU2 != null ? ax0VarU2.I.c.p : ((e5) dx0.a(ax0Var)).getPlacementScope(), ex0Var.p, 0, 0);
                    } else {
                        ax0Var.R();
                    }
                    dq0 dq0Var = (dq0) this.e;
                    if (ax0Var.Q > 0) {
                        ((fa1) dq0Var.f).b(ax0Var);
                        ax0Var.P = true;
                    }
                }
                zD = zE;
            }
            f();
        }
        return zD;
    }

    public boolean t(ax0 ax0Var, boolean z) throws Throwable {
        sw swVar;
        boolean zE = false;
        if (!ax0Var.R && l(ax0Var)) {
            if (ax0Var == ((ax0) this.c)) {
                swVar = (sw) this.h;
                swVar.getClass();
            } else {
                swVar = null;
            }
            if (z) {
                if (ax0Var.J.e) {
                    zE = d(ax0Var, swVar);
                }
            } else if (ax0Var.q()) {
                zE = e(ax0Var, swVar);
            }
            f();
        }
        return zE;
    }

    public void u(ax0 ax0Var) throws Throwable {
        fa1 fa1VarZ = ax0Var.z();
        Object[] objArr = fa1VarZ.e;
        int i = fa1VarZ.g;
        for (int i2 = 0; i2 < i; i2++) {
            ax0 ax0Var2 = (ax0) objArr[i2];
            if (ax0Var2.r() == yw0.e || ax0Var2.J.p.B.e()) {
                if (ex.B(ax0Var2)) {
                    v(ax0Var2, true);
                } else {
                    u(ax0Var2);
                }
            }
        }
    }

    public void v(ax0 ax0Var, boolean z) throws Throwable {
        sw swVar;
        if (ax0Var.R) {
            return;
        }
        if (ax0Var == ((ax0) this.c)) {
            swVar = (sw) this.h;
            swVar.getClass();
        } else {
            swVar = null;
        }
        if (z) {
            d(ax0Var, swVar);
        } else {
            e(ax0Var, swVar);
        }
    }

    public boolean w(ax0 ax0Var, boolean z) {
        int iOrdinal = ax0Var.J.d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                ((fa1) this.g).b(new s61(ax0Var, false, z));
            } else {
                if (iOrdinal != 4) {
                    qj.p();
                    return false;
                }
                if (!ax0Var.q() || z) {
                    ax0Var.J.p.y = true;
                    if (!ax0Var.R && (ax0Var.I() || k(ax0Var))) {
                        ax0 ax0VarU = ax0Var.u();
                        if (ax0VarU == null || !ax0VarU.q()) {
                            ((ud) this.d).a(ax0Var, dt0.g);
                        }
                        if (!this.b) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public void x(vv1 vv1Var) {
        ix.t(vv1Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        ix.t(vv1Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) ((z90) this.d).b) + "')");
    }

    public void y(long j) {
        ax0 ax0Var = (ax0) this.c;
        sw swVar = (sw) this.h;
        if (swVar == null ? false : sw.b(swVar.a, j)) {
            return;
        }
        if (this.a) {
            vp0.a("updateRootConstraints called while measuring");
        }
        this.h = new sw(j);
        ax0 ax0Var2 = ax0Var.l;
        ex0 ex0Var = ax0Var.J;
        if (ax0Var2 != null) {
            ex0Var.e = true;
        }
        ex0Var.p.y = true;
        ((ud) this.d).a(ax0Var, ax0Var2 != null ? dt0.e : dt0.g);
    }

    public t61(c00 c00Var, xi1 xi1Var, fg0 fg0Var) {
        this.c = c00Var;
        this.d = new xu1(-1, "", "");
        List list = c00Var.e;
        cb0 cb0Var = cb0.e;
        this.e = list == null ? cb0Var : list;
        vq.Z(list == null ? cb0Var : list, new yu1(new tr1(1, this)));
        throw new we1(0);
    }

    public t61(ax0 ax0Var) {
        this.c = ax0Var;
        this.d = new ud(4);
        this.e = new dq0(26);
        this.f = new fa1(new ax0[16]);
        this.g = new fa1(new s61[16]);
    }
}
