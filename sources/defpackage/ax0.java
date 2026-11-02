package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ax0 implements ju, bj1, wu {
    public static final gv1 S = new gv1("Undefined intrinsics block and it is required", 1);
    public static final vw0 T = new vw0();
    public static final t8 U = new t8(4);
    public dq0 A;
    public m40 B;
    public kw0 C;
    public on2 D;
    public uv E;
    public yw0 F;
    public yw0 G;
    public boolean H;
    public final he1 I;
    public final ex0 J;
    public ox0 K;
    public me1 L;
    public boolean M;
    public u71 N;
    public u71 O;
    public boolean P;
    public int Q;
    public boolean R;
    public final boolean e;
    public int f;
    public boolean g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public ax0 l;
    public int m;
    public final dq0 n;
    public fa1 o;
    public boolean p;
    public ax0 q;
    public aj1 r;
    public int s;
    public boolean t;
    public boolean u;
    public i02 v;
    public boolean w;
    public final fa1 x;
    public boolean y;
    public w61 z;

    public ax0(int i, boolean z) {
        this.e = z;
        this.f = i;
        this.h = 9223372034707292159L;
        this.i = true;
        this.j = true;
        this.n = new dq0(24, new fa1(new ax0[16]), new h8(6, this));
        this.x = new fa1(new ax0[16]);
        this.y = true;
        this.z = S;
        this.B = dx0.a;
        this.C = kw0.e;
        this.D = T;
        uv.d.getClass();
        this.E = tv.b;
        yw0 yw0Var = yw0.g;
        this.F = yw0Var;
        this.G = yw0Var;
        this.I = new he1(this);
        this.J = new ex0(this);
        this.M = true;
        this.N = r71.a;
    }

    public static void T(ax0 ax0Var, boolean z, int i) {
        ax0 ax0VarU;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (ax0Var.l == null) {
            vp0.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        aj1 aj1Var = ax0Var.r;
        if (aj1Var == null || ax0Var.t || ax0Var.e) {
            return;
        }
        ((e5) aj1Var).z(ax0Var, true, z, z2);
        if (z3) {
            d51 d51Var = ax0Var.J.q;
            d51Var.getClass();
            ex0 ex0Var = d51Var.j;
            ax0 ax0VarU2 = ex0Var.a.u();
            yw0 yw0Var = ex0Var.a.F;
            if (ax0VarU2 == null || yw0Var == yw0.g) {
                return;
            }
            while (ax0VarU2.F == yw0Var && (ax0VarU = ax0VarU2.u()) != null) {
                ax0VarU2 = ax0VarU;
            }
            int iOrdinal = yw0Var.ordinal();
            if (iOrdinal == 0) {
                if (ax0VarU2.l != null) {
                    T(ax0VarU2, z, 6);
                    return;
                } else {
                    V(ax0VarU2, z, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                fu1.h("Intrinsics isn't used by the parent");
            } else if (ax0VarU2.l != null) {
                ax0VarU2.S(z);
            } else {
                ax0VarU2.U(z);
            }
        }
    }

    public static void V(ax0 ax0Var, boolean z, int i) {
        aj1 aj1Var;
        ax0 ax0VarU;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (ax0Var.t || ax0Var.e || (aj1Var = ax0Var.r) == null) {
            return;
        }
        ((e5) aj1Var).z(ax0Var, false, z, z2);
        if (z3) {
            ex0 ex0Var = ax0Var.J.p.j;
            ax0 ax0VarU2 = ex0Var.a.u();
            yw0 yw0Var = ex0Var.a.F;
            if (ax0VarU2 == null || yw0Var == yw0.g) {
                return;
            }
            while (ax0VarU2.F == yw0Var && (ax0VarU = ax0VarU2.u()) != null) {
                ax0VarU2 = ax0VarU;
            }
            int iOrdinal = yw0Var.ordinal();
            if (iOrdinal == 0) {
                V(ax0VarU2, z, 6);
            } else if (iOrdinal == 1) {
                ax0VarU2.U(z);
            } else {
                fu1.h("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void W(ax0 ax0Var) {
        int i = zw0.a[ax0Var.J.d.ordinal()];
        ex0 ex0Var = ax0Var.J;
        if (i != 1) {
            qj.q(ex0Var.d, "Unexpected state ");
            return;
        }
        if (ex0Var.e) {
            T(ax0Var, true, 6);
            return;
        }
        if (ex0Var.f) {
            ax0Var.S(true);
        }
        if (ax0Var.q()) {
            V(ax0Var, true, 6);
        } else if (ax0Var.p()) {
            ax0Var.U(true);
        }
    }

    private final String j(ax0 ax0Var) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(ax0Var);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(g(0));
        sb.append(" Other tree: ");
        ax0 ax0Var2 = ax0Var.q;
        sb.append(ax0Var2 != null ? ax0Var2.g(0) : null);
        return sb.toString();
    }

    public final void A(long j, vm0 vm0Var, int i, boolean z) {
        he1 he1Var = this.I;
        me1 me1Var = he1Var.d;
        bu1 bu1Var = me1.Q;
        he1Var.d.X0(me1.T, me1Var.P0(j), vm0Var, i, z);
    }

    public final void B(int i, ax0 ax0Var) {
        if (ax0Var.q != null && ax0Var.r != null) {
            vp0.b(j(ax0Var));
        }
        ax0Var.q = this;
        dq0 dq0Var = this.n;
        ((fa1) dq0Var.f).a(i, ax0Var);
        ((h8) dq0Var.g).a();
        O();
        if (ax0Var.e) {
            this.m++;
        }
        G();
        aj1 aj1Var = this.r;
        if (aj1Var != null) {
            ax0Var.d(aj1Var);
        }
        if (ax0Var.J.l > 0) {
            ex0 ex0Var = this.J;
            ex0Var.d(ex0Var.l + 1);
        }
        if (ax0Var.Q > 0) {
            a0(this.Q + 1);
        }
    }

    public final void C() {
        if (this.M) {
            he1 he1Var = this.I;
            me1 me1Var = he1Var.c;
            me1 me1Var2 = he1Var.d.u;
            this.L = null;
            while (!ws0.j(me1Var, me1Var2)) {
                if ((me1Var != null ? me1Var.P : null) != null) {
                    this.L = me1Var;
                    break;
                }
                me1Var = me1Var != null ? me1Var.u : null;
            }
            this.M = false;
        }
        me1 me1Var3 = this.L;
        if (me1Var3 != null && me1Var3.P == null) {
            throw k3.g("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (me1Var3 != null) {
            me1Var3.Z0();
            return;
        }
        ax0 ax0VarU = u();
        if (ax0VarU != null) {
            ax0VarU.C();
            return;
        }
        aj1 aj1Var = this.r;
        if (aj1Var != null) {
            ((e5) aj1Var).invalidate();
        }
    }

    public final void D() {
        he1 he1Var = this.I;
        me1 me1Var = he1Var.d;
        bq0 bq0Var = he1Var.c;
        while (me1Var != bq0Var) {
            me1Var.getClass();
            uw0 uw0Var = (uw0) me1Var;
            zi1 zi1Var = uw0Var.P;
            if (zi1Var != null) {
                ((dl0) zi1Var).c();
            }
            me1Var = uw0Var.t;
        }
        zi1 zi1Var2 = bq0Var.P;
        if (zi1Var2 != null) {
            ((dl0) zi1Var2).c();
        }
    }

    public final void E() {
        if (this.e) {
            ax0 ax0VarU = u();
            if (ax0VarU != null) {
                ax0VarU.E();
                return;
            }
            return;
        }
        if (this.l != null) {
            T(this, false, 7);
        } else {
            V(this, false, 7);
        }
    }

    public final void F() {
        if (this.w) {
            return;
        }
        if (this.I.b.j != null || this.O != null) {
            this.u = true;
            return;
        }
        i02 i02Var = this.v;
        this.w = true;
        gs1 gs1Var = new gs1();
        gs1Var.e = new i02();
        cj1 snapshotObserver = ((e5) dx0.a(this)).getSnapshotObserver();
        v4 v4Var = new v4(6, this, gs1Var);
        snapshotObserver.getClass();
        snapshotObserver.a.c(this, je1.p, v4Var);
        this.w = false;
        this.v = (i02) gs1Var.e;
        this.u = false;
        e5 e5Var = (e5) dx0.a(this);
        e5Var.getSemanticsOwner().b(this, i02Var);
        e5Var.B();
    }

    public final void G() {
        ax0 ax0Var;
        if (this.m > 0) {
            this.p = true;
        }
        if (!this.e || (ax0Var = this.q) == null) {
            return;
        }
        ax0Var.G();
    }

    public final boolean H() {
        return this.r != null;
    }

    public final boolean I() {
        return this.J.p.w;
    }

    public final Boolean J() {
        d51 d51Var = this.J.q;
        if (d51Var != null) {
            return Boolean.valueOf(d51Var.u != b51.g);
        }
        return null;
    }

    public final void K() {
        ax0 ax0VarU;
        if (this.F == yw0.g) {
            f();
        }
        d51 d51Var = this.J.q;
        d51Var.getClass();
        boolean z = true;
        try {
            d51Var.k = true;
            if (!d51Var.p) {
                vp0.b("replace() called on item that was not placed");
            }
            d51Var.F = false;
            if (d51Var.u == b51.g) {
                z = false;
            }
            d51Var.y0(d51Var.s, d51Var.t);
            if (z && !d51Var.F && (ax0VarU = d51Var.j.a.u()) != null) {
                ax0VarU.S(false);
            }
        } finally {
            d51Var.k = false;
        }
    }

    public final void L(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            dq0 dq0Var = this.n;
            fa1 fa1Var = (fa1) dq0Var.f;
            h8 h8Var = (h8) dq0Var.g;
            Object objK = fa1Var.k(i5);
            h8Var.a();
            ((fa1) dq0Var.f).a(i6, (ax0) objK);
            h8Var.a();
        }
        O();
        G();
        E();
    }

    public final void M(ax0 ax0Var) {
        if (ax0Var.J.l > 0) {
            ex0 ex0Var = this.J;
            ex0Var.d(ex0Var.l - 1);
        }
        if (this.r != null) {
            ax0Var.h();
        }
        ax0Var.q = null;
        if (ax0Var.Q > 0) {
            a0(this.Q - 1);
        }
        ax0Var.I.d.u = null;
        if (ax0Var.e) {
            this.m--;
            fa1 fa1Var = (fa1) ax0Var.n.f;
            Object[] objArr = fa1Var.e;
            int i = fa1Var.g;
            for (int i2 = 0; i2 < i; i2++) {
                ((ax0) objArr[i2]).I.d.u = null;
            }
        }
        G();
        O();
    }

    public final void N(me1 me1Var) {
        aj1 aj1Var = this.r;
        as1 rectManager = aj1Var != null ? ((e5) aj1Var).getRectManager() : null;
        ex0 ex0Var = this.J;
        boolean z = ex0Var.d != ww0.i || q() || p();
        if (this.k && rectManager != null) {
            if (me1Var == this.I.d) {
                this.j = true;
                if (!z) {
                    rectManager.f(this);
                }
            } else {
                this.i = true;
                fa1 fa1VarZ = z();
                Object[] objArr = fa1VarZ.e;
                int i = fa1VarZ.g;
                for (int i2 = 0; i2 < i; i2++) {
                    ax0 ax0Var = (ax0) objArr[i2];
                    ax0Var.j = true;
                    if (!z) {
                        rectManager.f(ax0Var);
                    }
                }
                if (this.k) {
                    rectManager.e = true;
                    h7 h7Var = rectManager.b;
                    int i3 = this.f & 33554431;
                    long[] jArr = (long[]) h7Var.g;
                    int i4 = h7Var.f;
                    for (int i5 = 0; i5 < jArr.length - 2 && i5 < i4; i5 += 3) {
                        int i6 = i5 + 2;
                        long j = jArr[i6];
                        if ((((int) j) & 33554431) == i3) {
                            jArr[i6] = (((j >> 63) & 1) << 60) | j;
                            break;
                        }
                    }
                }
                rectManager.i();
            }
        }
        ex0Var.p.z0();
    }

    public final void O() {
        if (!this.e) {
            this.y = true;
            return;
        }
        ax0 ax0VarU = u();
        if (ax0VarU != null) {
            ax0VarU.O();
        }
    }

    public final void P() {
        dq0 dq0Var = this.n;
        int i = ((fa1) dq0Var.f).g;
        while (true) {
            i--;
            fa1 fa1Var = (fa1) dq0Var.f;
            if (-1 >= i) {
                fa1Var.g();
                ((h8) dq0Var.g).a();
                return;
            }
            M((ax0) fa1Var.e[i]);
        }
    }

    public final void Q(int i, int i2) {
        if (i2 < 0) {
            vp0.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            dq0 dq0Var = this.n;
            M((ax0) ((fa1) dq0Var.f).e[i3]);
            Object objK = ((fa1) dq0Var.f).k(i3);
            ((h8) dq0Var.g).a();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void R() {
        ax0 ax0VarU;
        if (this.F == yw0.g) {
            f();
        }
        v61 v61Var = this.J.p;
        ex0 ex0Var = v61Var.j;
        try {
            v61Var.k = true;
            if (!v61Var.o) {
                vp0.b("replace called on unplaced item");
            }
            boolean z = v61Var.w;
            v61Var.x0(v61Var.r, v61Var.t, v61Var.s);
            if (z && !v61Var.J && (ax0VarU = ex0Var.a.u()) != null) {
                ax0VarU.U(false);
            }
            v61Var.k = false;
        } catch (Throwable th) {
            try {
                ex0Var.a.Y(th);
                throw null;
            } catch (Throwable th2) {
                v61Var.k = false;
                throw th2;
            }
        }
    }

    public final void S(boolean z) {
        aj1 aj1Var;
        if (this.e || (aj1Var = this.r) == null) {
            return;
        }
        ((e5) aj1Var).A(this, true, z);
    }

    public final void U(boolean z) {
        aj1 aj1Var;
        if (this.e || (aj1Var = this.r) == null) {
            return;
        }
        ((e5) aj1Var).A(this, false, z);
    }

    public final void X() {
        fa1 fa1VarZ = z();
        Object[] objArr = fa1VarZ.e;
        int i = fa1VarZ.g;
        for (int i2 = 0; i2 < i; i2++) {
            ax0 ax0Var = (ax0) objArr[i2];
            yw0 yw0Var = ax0Var.G;
            ax0Var.F = yw0Var;
            if (yw0Var != yw0.g) {
                ax0Var.X();
            }
        }
    }

    public final void Y(Throwable th) throws Throwable {
        uv uvVar = this.E;
        a90 a90Var = pv.a;
        sl1 sl1Var = (sl1) uvVar;
        sl1Var.getClass();
        ov ovVar = (ov) vv.N(sl1Var, a90Var);
        if (ovVar == null) {
            throw th;
        }
        p61.r0(th, new n1(11, ovVar, this));
        throw th;
    }

    public final void Z(m40 m40Var) {
        if (ws0.j(this.B, m40Var)) {
            return;
        }
        this.B = m40Var;
        E();
        ax0 ax0VarU = u();
        if (ax0VarU != null) {
            ax0VarU.C();
        } else {
            aj1 aj1Var = this.r;
            if (aj1Var != null) {
                ((e5) aj1Var).invalidate();
            }
        }
        D();
        for (t71 t71Var = this.I.f; t71Var != null; t71Var = t71Var.j) {
            t71Var.a();
        }
    }

    @Override // defpackage.ju
    public final void a() {
        ox0 ox0Var = this.K;
        if (ox0Var != null) {
            ox0Var.a();
        }
        he1 he1Var = this.I;
        me1 me1Var = he1Var.c.t;
        for (me1 me1Var2 = he1Var.d; !ws0.j(me1Var2, me1Var) && me1Var2 != null; me1Var2 = me1Var2.t) {
            me1Var2.e1();
        }
    }

    public final void a0(int i) {
        ax0 ax0VarU;
        ax0 ax0VarU2;
        int i2 = this.Q;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (ax0VarU2 = u()) != null) {
                ax0VarU2.a0(ax0VarU2.Q + 1);
            }
            if (i == 0 && this.Q > 0 && (ax0VarU = u()) != null) {
                ax0VarU.a0(ax0VarU.Q - 1);
            }
            this.Q = i;
        }
    }

    @Override // defpackage.ju
    public final void b() {
        h4 h4Var;
        ox0 ox0Var = this.K;
        if (ox0Var != null) {
            ox0Var.i(true);
        }
        this.R = true;
        t71 t71Var = this.I.e;
        for (t71 t71Var2 = t71Var; t71Var2 != null; t71Var2 = t71Var2.i) {
            if (t71Var2.r) {
                t71Var2.A0();
            }
        }
        for (t71 t71Var3 = t71Var; t71Var3 != null; t71Var3 = t71Var3.i) {
            if (t71Var3.r) {
                t71Var3.C0();
            }
        }
        while (t71Var != null) {
            if (t71Var.r) {
                t71Var.w0();
            }
            t71Var = t71Var.i;
        }
        if (H()) {
            this.v = null;
            this.u = false;
        }
        aj1 aj1Var = this.r;
        if (aj1Var != null) {
            e5 e5Var = (e5) aj1Var;
            if (e5.f() && (h4Var = e5Var.Q) != null && h4Var.l.e(this.f)) {
                h4Var.e.B(h4Var.g, this.f, false);
            }
        }
    }

    public final void b0(ax0 ax0Var) {
        if (ws0.j(ax0Var, this.l)) {
            return;
        }
        this.l = ax0Var;
        ex0 ex0Var = this.J;
        if (ax0Var != null) {
            if (ex0Var.q == null) {
                ex0Var.q = new d51(ex0Var);
            }
            he1 he1Var = this.I;
            me1 me1Var = he1Var.c.t;
            for (me1 me1Var2 = he1Var.d; !ws0.j(me1Var2, me1Var) && me1Var2 != null; me1Var2 = me1Var2.t) {
                me1Var2.N0();
            }
        } else {
            ex0Var.q = null;
            ex0Var.f = false;
            ex0Var.e = false;
        }
        E();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 5321. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void c(defpackage.u71 r20) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ax0.c(u71):void");
    }

    public final void c0(w61 w61Var) {
        if (ws0.j(this.z, w61Var)) {
            return;
        }
        this.z = w61Var;
        dq0 dq0Var = this.A;
        if (dq0Var != null) {
            ((dk1) dq0Var.g).setValue(w61Var);
        }
        E();
    }

    public final void d(aj1 aj1Var) {
        ax0 ax0Var;
        h4 h4Var;
        i02 i02VarW;
        if (this.r != null) {
            vp0.b("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        ax0 ax0Var2 = this.q;
        if (ax0Var2 != null && !ws0.j(ax0Var2.r, aj1Var)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(aj1Var);
            sb.append(") than the parent's owner(");
            ax0 ax0VarU = u();
            sb.append(ax0VarU != null ? ax0VarU.r : null);
            sb.append("). This tree: ");
            sb.append(g(0));
            sb.append(" Parent tree: ");
            ax0 ax0Var3 = this.q;
            sb.append(ax0Var3 != null ? ax0Var3.g(0) : null);
            vp0.b(sb.toString());
        }
        ax0 ax0VarU2 = u();
        ex0 ex0Var = this.J;
        if (ax0VarU2 == null) {
            ex0Var.p.w = true;
            ((e5) aj1Var).getRectManager().f(this);
            d51 d51Var = ex0Var.q;
            if (d51Var != null) {
                d51Var.u = b51.e;
            }
        }
        he1 he1Var = this.I;
        he1Var.d.u = ax0VarU2 != null ? ax0VarU2.I.c : null;
        this.r = aj1Var;
        this.s = (ax0VarU2 != null ? ax0VarU2.s : -1) + 1;
        u71 u71Var = this.O;
        if (u71Var != null) {
            c(u71Var);
        }
        this.O = null;
        ((e5) aj1Var).m7getLayoutNodes().h(this.f, this);
        ax0 ax0Var4 = this.q;
        if (ax0Var4 == null || (ax0Var = ax0Var4.l) == null) {
            ax0Var = this.l;
        }
        b0(ax0Var);
        if (this.l == null && he1Var.c(512)) {
            b0(this);
        }
        if (!this.R) {
            for (t71 t71Var = he1Var.f; t71Var != null; t71Var = t71Var.j) {
                t71Var.v0();
            }
        }
        fa1 fa1Var = (fa1) this.n.f;
        Object[] objArr = fa1Var.e;
        int i = fa1Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((ax0) objArr[i2]).d(aj1Var);
        }
        if (!this.R) {
            he1Var.e();
        }
        E();
        if (ax0VarU2 != null) {
            ax0VarU2.E();
        }
        ex0Var.j();
        if (!this.R && he1Var.c(8)) {
            F();
        }
        e5 e5Var = (e5) aj1Var;
        if (!e5.f() || (h4Var = e5Var.Q) == null || (i02VarW = w()) == null || !i02VarW.e.b(u02.r)) {
            return;
        }
        h4Var.l.a(this.f);
        h4Var.e.B(h4Var.g, this.f, true);
    }

    public final void d0(u71 u71Var) {
        if (this.e && this.N != r71.a) {
            vp0.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.R) {
            vp0.a("modifier is updated when deactivated");
        }
        if (!H()) {
            this.O = u71Var;
            return;
        }
        c(u71Var);
        if (this.u) {
            F();
        }
    }

    public final void e() {
        this.G = this.F;
        yw0 yw0Var = yw0.g;
        this.F = yw0Var;
        fa1 fa1VarZ = z();
        Object[] objArr = fa1VarZ.e;
        int i = fa1VarZ.g;
        for (int i2 = 0; i2 < i; i2++) {
            ax0 ax0Var = (ax0) objArr[i2];
            if (ax0Var.F != yw0Var) {
                ax0Var.e();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [t71] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [t71] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [fa1] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [fa1] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void e0(on2 on2Var) {
        if (ws0.j(this.D, on2Var)) {
            return;
        }
        this.D = on2Var;
        t71 t71Var = this.I.f;
        if ((t71Var.h & 16) != 0) {
            while (t71Var != null) {
                if ((t71Var.g & 16) != 0) {
                    ?? P = t71Var;
                    ?? fa1Var = 0;
                    while (P != 0) {
                        if (P instanceof zn1) {
                            ((zn1) P).Z();
                        } else if ((P.g & 16) != 0 && (P instanceof c40)) {
                            t71 t71Var2 = ((c40) P).t;
                            int i = 0;
                            P = P;
                            fa1Var = fa1Var;
                            while (t71Var2 != null) {
                                if ((t71Var2.g & 16) != 0) {
                                    i++;
                                    if (i == 1) {
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
                                }
                                t71Var2 = t71Var2.j;
                                P = P;
                                fa1Var = fa1Var;
                            }
                            if (i == 1) {
                            }
                        }
                        P = qx.P(fa1Var);
                    }
                }
                if ((t71Var.h & 16) == 0) {
                    return;
                } else {
                    t71Var = t71Var.j;
                }
            }
        }
    }

    public final void f() {
        this.G = this.F;
        this.F = yw0.g;
        fa1 fa1VarZ = z();
        Object[] objArr = fa1VarZ.e;
        int i = fa1VarZ.g;
        for (int i2 = 0; i2 < i; i2++) {
            ax0 ax0Var = (ax0) objArr[i2];
            if (ax0Var.F == yw0.f) {
                ax0Var.f();
            }
        }
    }

    public final void f0() {
        if (this.m <= 0 || !this.p) {
            return;
        }
        this.p = false;
        fa1 fa1Var = this.o;
        if (fa1Var == null) {
            fa1Var = new fa1(new ax0[16]);
            this.o = fa1Var;
        }
        fa1Var.g();
        fa1 fa1Var2 = (fa1) this.n.f;
        Object[] objArr = fa1Var2.e;
        int i = fa1Var2.g;
        for (int i2 = 0; i2 < i; i2++) {
            ax0 ax0Var = (ax0) objArr[i2];
            if (ax0Var.e) {
                fa1Var.c(fa1Var.g, ax0Var.z());
            } else {
                fa1Var.b(ax0Var);
            }
        }
        ex0 ex0Var = this.J;
        ex0Var.p.D = true;
        d51 d51Var = ex0Var.q;
        if (d51Var != null) {
            d51Var.x = true;
        }
    }

    public final String g(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        fa1 fa1VarZ = z();
        Object[] objArr = fa1VarZ.e;
        int i3 = fa1VarZ.g;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((ax0) objArr[i4]).g(i + 1));
        }
        String string = sb.toString();
        return i == 0 ? string.substring(0, string.length() - 1) : string;
    }

    public final void h() {
        h4 h4Var;
        bx0 bx0Var;
        aj1 aj1Var = this.r;
        if (aj1Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            ax0 ax0VarU = u();
            sb.append(ax0VarU != null ? ax0VarU.g(0) : null);
            vp0.c(sb.toString());
            qj.e();
            return;
        }
        ax0 ax0VarU2 = u();
        ex0 ex0Var = this.J;
        if (ax0VarU2 != null) {
            ax0VarU2.C();
            ax0VarU2.E();
            v61 v61Var = ex0Var.p;
            yw0 yw0Var = yw0.g;
            v61Var.p = yw0Var;
            d51 d51Var = ex0Var.q;
            if (d51Var != null) {
                d51Var.n = yw0Var;
            }
        }
        bx0 bx0Var2 = ex0Var.p.B;
        bx0Var2.b = true;
        bx0Var2.c = false;
        bx0Var2.e = false;
        bx0Var2.d = false;
        bx0Var2.f = false;
        bx0Var2.g = false;
        bx0Var2.h = null;
        d51 d51Var2 = ex0Var.q;
        if (d51Var2 != null && (bx0Var = d51Var2.v) != null) {
            bx0Var.b = true;
            bx0Var.c = false;
            bx0Var.e = false;
            bx0Var.d = false;
            bx0Var.f = false;
            bx0Var.g = false;
            bx0Var.h = null;
        }
        he1 he1Var = this.I;
        t71 t71Var = he1Var.e;
        me1 me1Var = he1Var.c.t;
        for (me1 me1Var2 = he1Var.d; !ws0.j(me1Var2, me1Var) && me1Var2 != null; me1Var2 = me1Var2.t) {
            me1Var2.k1();
            if (me1Var2.s.I()) {
                me1Var2.f1();
            }
        }
        for (t71 t71Var2 = t71Var; t71Var2 != null; t71Var2 = t71Var2.i) {
            if (t71Var2.r) {
                t71Var2.C0();
            }
        }
        this.t = true;
        fa1 fa1Var = (fa1) this.n.f;
        Object[] objArr = fa1Var.e;
        int i = fa1Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((ax0) objArr[i2]).h();
        }
        this.t = false;
        while (t71Var != null) {
            if (t71Var.r) {
                t71Var.w0();
            }
            t71Var = t71Var.i;
        }
        e5 e5Var = (e5) aj1Var;
        e5Var.m7getLayoutNodes().g(this.f);
        t61 t61Var = e5Var.c0;
        ud udVar = (ud) t61Var.d;
        ((ao2) udVar.b).q(this);
        ((ao2) udVar.c).q(this);
        ((ao2) udVar.d).q(this);
        ((fa1) ((dq0) t61Var.e).f).j(this);
        e5Var.R = true;
        if (e5.f() && (h4Var = e5Var.Q) != null && h4Var.l.e(this.f)) {
            h4Var.e.B(h4Var.g, this.f, false);
        }
        e5Var.getRectManager().g(this);
        this.r = null;
        b0(null);
        this.s = 0;
        v61 v61Var2 = ex0Var.p;
        v61Var2.m = Integer.MAX_VALUE;
        v61Var2.l = Integer.MAX_VALUE;
        v61Var2.w = false;
        d51 d51Var3 = ex0Var.q;
        if (d51Var3 != null) {
            d51Var3.m = Integer.MAX_VALUE;
            d51Var3.l = Integer.MAX_VALUE;
            d51Var3.u = b51.g;
        }
        if (he1Var.c(8)) {
            i02 i02Var = this.v;
            this.v = null;
            this.u = false;
            e5Var.getSemanticsOwner().b(this, i02Var);
            e5Var.B();
        }
    }

    public final void i(sm smVar, al0 al0Var) throws Throwable {
        try {
            this.I.d.L0(smVar, al0Var);
        } catch (Throwable th) {
            Y(th);
            throw null;
        }
    }

    public final void k() {
        if (this.l != null) {
            T(this, false, 5);
        } else {
            V(this, false, 5);
        }
        v61 v61Var = this.J.p;
        sw swVar = v61Var.n ? new sw(v61Var.h) : null;
        aj1 aj1Var = this.r;
        if (swVar != null) {
            if (aj1Var != null) {
                ((e5) aj1Var).w(this, swVar.a);
            }
        } else if (aj1Var != null) {
            ((e5) aj1Var).v(true);
        }
    }

    public final List l() {
        d51 d51Var = this.J.q;
        d51Var.getClass();
        fa1 fa1Var = d51Var.w;
        ex0 ex0Var = d51Var.j;
        ex0Var.a.n();
        if (!d51Var.x) {
            return fa1Var.f();
        }
        ax0 ax0Var = ex0Var.a;
        fa1 fa1VarZ = ax0Var.z();
        Object[] objArr = fa1VarZ.e;
        int i = fa1VarZ.g;
        for (int i2 = 0; i2 < i; i2++) {
            ax0 ax0Var2 = (ax0) objArr[i2];
            if (fa1Var.g <= i2) {
                d51 d51Var2 = ax0Var2.J.q;
                d51Var2.getClass();
                fa1Var.b(d51Var2);
            } else {
                d51 d51Var3 = ax0Var2.J.q;
                d51Var3.getClass();
                Object[] objArr2 = fa1Var.e;
                Object obj = objArr2[i2];
                objArr2[i2] = d51Var3;
            }
        }
        fa1Var.l(((fa1) ((n91) ax0Var.n()).f).g, fa1Var.g);
        d51Var.x = false;
        return fa1Var.f();
    }

    public final List m() {
        return this.J.p.p0();
    }

    public final List n() {
        return z().f();
    }

    public final List o() {
        return ((fa1) this.n.f).f();
    }

    public final boolean p() {
        return this.J.p.z;
    }

    public final boolean q() {
        return this.J.p.y;
    }

    public final yw0 r() {
        return this.J.p.p;
    }

    public final yw0 s() {
        yw0 yw0Var;
        d51 d51Var = this.J.q;
        return (d51Var == null || (yw0Var = d51Var.n) == null) ? yw0.g : yw0Var;
    }

    public final dq0 t() {
        dq0 dq0Var = this.A;
        if (dq0Var != null) {
            return dq0Var;
        }
        dq0 dq0Var2 = new dq0(this, this.z);
        this.A = dq0Var2;
        return dq0Var2;
    }

    public final String toString() {
        return sv.V(this) + " children: " + ((fa1) ((n91) n()).f).g + " measurePolicy: " + this.z + " deactivated: " + this.R;
    }

    public final ax0 u() {
        ax0 ax0Var = this.q;
        while (ax0Var != null && ax0Var.e) {
            ax0Var = ax0Var.q;
        }
        return ax0Var;
    }

    public final int v() {
        return this.J.p.m;
    }

    public final i02 w() {
        if (H() && !this.R && this.I.c(8)) {
            return this.v;
        }
        return null;
    }

    public final fa1 x() {
        boolean z = this.y;
        fa1 fa1Var = this.x;
        if (z) {
            fa1Var.g();
            fa1Var.c(fa1Var.g, z());
            Arrays.sort(fa1Var.e, 0, fa1Var.g, U);
            this.y = false;
        }
        return fa1Var;
    }

    @Override // defpackage.bj1
    public final boolean y() {
        return H();
    }

    public final fa1 z() {
        f0();
        if (this.m == 0) {
            return (fa1) this.n.f;
        }
        fa1 fa1Var = this.o;
        fa1Var.getClass();
        return fa1Var;
    }

    public ax0(int i) {
        this(l02.a.addAndGet(1), (i & 1) == 0);
    }
}
