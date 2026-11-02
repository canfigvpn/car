package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class d51 extends jm1 implements r61, z3, f81 {
    public Object B;
    public boolean F;
    public final ex0 j;
    public boolean k;
    public boolean o;
    public boolean p;
    public boolean q;
    public sw r;
    public ej0 t;
    public boolean y;
    public int l = Integer.MAX_VALUE;
    public int m = Integer.MAX_VALUE;
    public yw0 n = yw0.g;
    public long s = 0;
    public b51 u = b51.g;
    public final bx0 v = new bx0(this, 1);
    public final fa1 w = new fa1(new d51[16]);
    public boolean x = true;
    public final c51 z = new c51(this, 0);
    public boolean A = true;
    public long C = tw.b(0, 0, 15);
    public final c51 D = new c51(this, 2);
    public final c51 E = new c51(this, 1);

    public d51(ex0 ex0Var) {
        this.j = ex0Var;
        this.B = ex0Var.p.v;
    }

    @Override // defpackage.r61
    public final int U(int i) {
        w0();
        z41 z41VarQ0 = this.j.a().Q0();
        z41VarQ0.getClass();
        return z41VarQ0.U(i);
    }

    @Override // defpackage.z3
    public final int X() {
        return this.m;
    }

    @Override // defpackage.z3
    public final void Z() {
        ax0.T(this.j.a, false, 7);
    }

    @Override // defpackage.z3
    public final bx0 a() {
        return this.v;
    }

    @Override // defpackage.r61
    public final int a0(int i) {
        w0();
        z41 z41VarQ0 = this.j.a().Q0();
        z41VarQ0.getClass();
        return z41VarQ0.a0(i);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    @Override // defpackage.r61
    public final jm1 e(long j) throws Throwable {
        yw0 yw0Var;
        ex0 ex0Var = this.j;
        ax0 ax0Var = ex0Var.a;
        ax0 ax0Var2 = ex0Var.a;
        ax0 ax0VarU = ax0Var.u();
        if ((ax0VarU != null ? ax0VarU.J.d : null) == ww0.f) {
            ex0Var.b = false;
        } else {
            ax0 ax0VarU2 = ax0Var2.u();
            if ((ax0VarU2 != null ? ax0VarU2.J.d : null) == ww0.h) {
                ex0Var.b = false;
            }
        }
        ax0 ax0VarU3 = ax0Var2.u();
        yw0 yw0Var2 = yw0.g;
        if (ax0VarU3 != null) {
            ex0 ex0Var2 = ax0VarU3.J;
            if (this.n != yw0Var2 && !ax0Var2.H) {
                vp0.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = ex0Var2.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                yw0Var = yw0.e;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    qj.q(ex0Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                yw0Var = yw0.f;
            }
            this.n = yw0Var;
        } else {
            this.n = yw0Var2;
        }
        if (ax0Var2.F == yw0Var2) {
            ax0Var2.e();
        }
        z0(j);
        return this;
    }

    @Override // defpackage.r61
    public final int e0(int i) {
        w0();
        z41 z41VarQ0 = this.j.a().Q0();
        z41VarQ0.getClass();
        return z41VarQ0.e0(i);
    }

    @Override // defpackage.r61
    public final int f(int i) {
        w0();
        z41 z41VarQ0 = this.j.a().Q0();
        z41VarQ0.getClass();
        return z41VarQ0.f(i);
    }

    @Override // defpackage.jm1
    public final int f0(u3 u3Var) {
        ex0 ex0Var = this.j;
        ax0 ax0VarU = ex0Var.a.u();
        ww0 ww0Var = ax0VarU != null ? ax0VarU.J.d : null;
        ww0 ww0Var2 = ww0.f;
        bx0 bx0Var = this.v;
        if (ww0Var == ww0Var2) {
            bx0Var.c = true;
        } else {
            ax0 ax0VarU2 = ex0Var.a.u();
            if ((ax0VarU2 != null ? ax0VarU2.J.d : null) == ww0.h) {
                bx0Var.d = true;
            }
        }
        this.o = true;
        z41 z41VarQ0 = ex0Var.a().Q0();
        z41VarQ0.getClass();
        int iF0 = z41VarQ0.f0(u3Var);
        this.o = false;
        return iF0;
    }

    @Override // defpackage.jm1, defpackage.r61
    public final Object j() {
        return this.B;
    }

    @Override // defpackage.jm1
    public final void l0(long j, float f, ej0 ej0Var) throws Throwable {
        y0(j, ej0Var);
    }

    @Override // defpackage.z3
    public final void m(y3 y3Var) {
        fa1 fa1VarZ = this.j.a.z();
        Object[] objArr = fa1VarZ.e;
        int i = fa1VarZ.g;
        for (int i2 = 0; i2 < i; i2++) {
            d51 d51Var = ((ax0) objArr[i2]).J.q;
            d51Var.getClass();
            y3Var.h(d51Var);
        }
    }

    @Override // defpackage.f81
    public final void n(boolean z) {
        z41 z41VarQ0;
        ex0 ex0Var = this.j;
        z41 z41VarQ1 = ex0Var.a().Q0();
        if (Boolean.valueOf(z).equals(z41VarQ1 != null ? Boolean.valueOf(z41VarQ1.m) : null) || (z41VarQ0 = ex0Var.a().Q0()) == null) {
            return;
        }
        z41VarQ0.m = z;
    }

    @Override // defpackage.z3
    public final bq0 o() {
        return this.j.a.I.c;
    }

    @Override // defpackage.z3
    public final z3 p() {
        ex0 ex0Var;
        ax0 ax0VarU = this.j.a.u();
        if (ax0VarU == null || (ex0Var = ax0VarU.J) == null) {
            return null;
        }
        return ex0Var.q;
    }

    public final boolean p0() {
        ex0 ex0Var = this.j;
        return ex.B(ex0Var.a) || ex0Var.c;
    }

    @Override // defpackage.z3
    public final void q() {
        this.y = true;
        bx0 bx0Var = this.v;
        bx0Var.h();
        ex0 ex0Var = this.j;
        boolean z = ex0Var.f;
        ax0 ax0Var = ex0Var.a;
        if (z) {
            fa1 fa1VarZ = ax0Var.z();
            Object[] objArr = fa1VarZ.e;
            int i = fa1VarZ.g;
            for (int i2 = 0; i2 < i; i2++) {
                ax0 ax0Var2 = (ax0) objArr[i2];
                ex0 ex0Var2 = ax0Var2.J;
                if (ex0Var2.e && ax0Var2.s() == yw0.e) {
                    d51 d51Var = ex0Var2.q;
                    d51Var.getClass();
                    d51 d51Var2 = ex0Var2.q;
                    sw swVar = d51Var2 != null ? d51Var2.r : null;
                    swVar.getClass();
                    if (d51Var.z0(swVar.a)) {
                        ax0.T(ax0Var, false, 7);
                    }
                }
            }
        }
        aq0 aq0Var = o().W;
        aq0Var.getClass();
        if (ex0Var.g || (!this.o && !aq0Var.o && ex0Var.f)) {
            ex0Var.f = false;
            ww0 ww0Var = ex0Var.d;
            ex0Var.d = ww0.h;
            ex0Var.i(false);
            cj1 snapshotObserver = ((e5) dx0.a(ax0Var)).getSnapshotObserver();
            snapshotObserver.getClass();
            snapshotObserver.a.c(ax0Var, je1.m, this.z);
            ex0Var.d = ww0Var;
            if (ex0Var.m && aq0Var.o) {
                requestLayout();
            }
            ex0Var.g = false;
        }
        if (bx0Var.d) {
            bx0Var.e = true;
        }
        if (bx0Var.b && bx0Var.e()) {
            bx0Var.g();
        }
        this.y = false;
    }

    @Override // defpackage.z3
    public final void requestLayout() {
        this.j.a.S(false);
    }

    public final void t0(boolean z) {
        if (z && p0()) {
            return;
        }
        if (z || p0()) {
            this.u = b51.g;
            fa1 fa1VarZ = this.j.a.z();
            Object[] objArr = fa1VarZ.e;
            int i = fa1VarZ.g;
            for (int i2 = 0; i2 < i; i2++) {
                d51 d51Var = ((ax0) objArr[i2]).J.q;
                d51Var.getClass();
                d51Var.t0(true);
            }
        }
    }

    public final void u0() {
        b51 b51Var = this.u;
        ex0 ex0Var = this.j;
        boolean z = ex0Var.c;
        ax0 ax0Var = ex0Var.a;
        b51 b51Var2 = b51.e;
        if (z) {
            this.u = b51.f;
        } else {
            this.u = b51Var2;
        }
        if (b51Var != b51Var2 && ex0Var.e) {
            ax0.T(ax0Var, true, 6);
        }
        fa1 fa1VarZ = ax0Var.z();
        Object[] objArr = fa1VarZ.e;
        int i = fa1VarZ.g;
        for (int i2 = 0; i2 < i; i2++) {
            ax0 ax0Var2 = (ax0) objArr[i2];
            d51 d51Var = ax0Var2.J.q;
            if (d51Var == null) {
                qj.r("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (d51Var.m != Integer.MAX_VALUE) {
                d51Var.u0();
                ax0.W(ax0Var2);
            }
        }
    }

    public final void v0() {
        ex0 ex0Var = this.j;
        if (ex0Var.o > 0) {
            fa1 fa1VarZ = ex0Var.a.z();
            Object[] objArr = fa1VarZ.e;
            int i = fa1VarZ.g;
            for (int i2 = 0; i2 < i; i2++) {
                ax0 ax0Var = (ax0) objArr[i2];
                ex0 ex0Var2 = ax0Var.J;
                if ((ex0Var2.m || ex0Var2.n) && !ex0Var2.f) {
                    ax0Var.S(false);
                }
                d51 d51Var = ex0Var2.q;
                if (d51Var != null) {
                    d51Var.v0();
                }
            }
        }
    }

    public final void w0() {
        yw0 yw0Var;
        ex0 ex0Var = this.j;
        ax0.T(ex0Var.a, false, 7);
        ax0 ax0Var = ex0Var.a;
        ax0 ax0VarU = ax0Var.u();
        if (ax0VarU == null || ax0Var.F != yw0.g) {
            return;
        }
        int iOrdinal = ax0VarU.J.d.ordinal();
        if (iOrdinal != 0) {
            yw0Var = iOrdinal != 2 ? ax0VarU.F : yw0.f;
        } else {
            yw0Var = yw0.e;
        }
        ax0Var.F = yw0Var;
    }

    public final void x0() {
        ww0 ww0Var;
        this.F = true;
        ex0 ex0Var = this.j;
        ax0 ax0VarU = ex0Var.a.u();
        b51 b51Var = this.u;
        if ((b51Var != b51.e && !ex0Var.c) || (b51Var != b51.f && ex0Var.c)) {
            u0();
            if (this.k && ax0VarU != null) {
                ax0VarU.S(false);
            }
        }
        if (ax0VarU != null) {
            ex0 ex0Var2 = ax0VarU.J;
            if (!this.k && ((ww0Var = ex0Var2.d) == ww0.g || ww0Var == ww0.h)) {
                if (this.m != Integer.MAX_VALUE) {
                    vp0.b("Place was called on a node which was placed already");
                }
                int i = ex0Var2.h;
                this.m = i;
                ex0Var2.h = i + 1;
            }
        } else {
            this.m = 0;
        }
        q();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006f A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001e, B:14:0x0022, B:15:0x0027, B:17:0x0036, B:19:0x003a, B:22:0x0040, B:21:0x003e, B:23:0x0043, B:25:0x004d, B:30:0x0057, B:32:0x0088, B:31:0x006f), top: B:36:0x0007 }] */
    public final void y0(long j, ej0 ej0Var) throws Throwable {
        ex0 ex0Var = this.j;
        ax0 ax0Var = ex0Var.a;
        ax0 ax0Var2 = ex0Var.a;
        try {
            ax0 ax0VarU = ax0Var.u();
            ww0 ww0Var = ax0VarU != null ? ax0VarU.J.d : null;
            ww0 ww0Var2 = ww0.h;
            if (ww0Var == ww0Var2) {
                ex0Var.c = false;
            }
            if (ax0Var2.R) {
                vp0.a("place is called on a deactivated node");
            }
            ex0Var.d = ww0Var2;
            boolean z = true;
            this.p = true;
            this.F = false;
            if (!ir0.a(j, this.s)) {
                if (ex0Var.n || ex0Var.m) {
                    ex0Var.f = true;
                }
                v0();
            }
            aj1 aj1VarA = dx0.a(ax0Var2);
            this.s = j;
            if (ex0Var.f) {
                ex0Var.h(false);
                this.v.g = false;
                cj1 snapshotObserver = ((e5) aj1VarA).getSnapshotObserver();
                c51 c51Var = this.E;
                snapshotObserver.getClass();
                snapshotObserver.a.c(ax0Var2, je1.l, c51Var);
            } else {
                if (this.u == b51.g) {
                    z = false;
                }
                if (z) {
                    z41 z41VarQ0 = ex0Var.a().Q0();
                    z41VarQ0.getClass();
                    z41VarQ0.I0(ir0.c(j, z41VarQ0.i));
                    x0();
                } else {
                    ex0Var.h(false);
                    this.v.g = false;
                    cj1 snapshotObserver2 = ((e5) aj1VarA).getSnapshotObserver();
                    c51 c51Var2 = this.E;
                    snapshotObserver2.getClass();
                    snapshotObserver2.a.c(ax0Var2, je1.l, c51Var2);
                }
            }
            this.t = ej0Var;
            ex0Var.d = ww0.i;
        } catch (Throwable th) {
            ax0Var.Y(th);
            throw null;
        }
    }

    public final boolean z0(long j) throws Throwable {
        ex0 ex0Var = this.j;
        ax0 ax0Var = ex0Var.a;
        ax0 ax0Var2 = ex0Var.a;
        try {
            if (ax0Var.R) {
                vp0.a("measure is called on a deactivated node");
            }
            ax0 ax0VarU = ax0Var2.u();
            ax0Var2.H = ax0Var2.H || (ax0VarU != null && ax0VarU.H);
            if (!ax0Var2.J.e) {
                sw swVar = this.r;
                if (swVar == null ? false : sw.b(swVar.a, j)) {
                    aj1 aj1Var = ax0Var2.r;
                    if (aj1Var != null) {
                        ((e5) aj1Var).l(ax0Var2, true);
                    }
                    ax0Var2.X();
                    return false;
                }
            }
            this.r = new sw(j);
            o0(j);
            this.v.f = false;
            fa1 fa1VarZ = ax0Var2.z();
            Object[] objArr = fa1VarZ.e;
            int i = fa1VarZ.g;
            for (int i2 = 0; i2 < i; i2++) {
                d51 d51Var = ((ax0) objArr[i2]).J.q;
                d51Var.getClass();
                d51Var.v.c = false;
            }
            long j2 = this.q ? this.g : -9223372034707292160L;
            this.q = true;
            z41 z41VarQ0 = ex0Var.a().Q0();
            if (z41VarQ0 == null) {
                vp0.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            ex0Var.c(j);
            m0((((long) z41VarQ0.e) << 32) | (((long) z41VarQ0.f) & 4294967295L));
            return (((int) (j2 >> 32)) == z41VarQ0.e && ((int) (j2 & 4294967295L)) == z41VarQ0.f) ? false : true;
        } catch (Throwable th) {
            ax0Var.Y(th);
            throw null;
        }
    }
}
