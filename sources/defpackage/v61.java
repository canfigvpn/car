package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class v61 extends jm1 implements r61, z3, f81 {
    public boolean A;
    public boolean E;
    public float I;
    public boolean J;
    public ej0 K;
    public float M;
    public boolean O;
    public final ex0 j;
    public boolean k;
    public boolean n;
    public boolean o;
    public boolean q;
    public ej0 s;
    public float t;
    public Object v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public int l = Integer.MAX_VALUE;
    public int m = Integer.MAX_VALUE;
    public yw0 p = yw0.g;
    public long r = 0;
    public boolean u = true;
    public final bx0 B = new bx0(this, 0);
    public final fa1 C = new fa1(new v61[16]);
    public boolean D = true;
    public long F = tw.b(0, 0, 15);
    public final u61 G = new u61(this, 1);
    public final u61 H = new u61(this, 0);
    public long L = 0;
    public final u61 N = new u61(this, 2);

    public v61(ex0 ex0Var) {
        this.j = ex0Var;
    }

    @Override // defpackage.r61
    public final int U(int i) {
        ex0 ex0Var = this.j;
        if (!ex.B(ex0Var.a)) {
            v0();
            return ex0Var.a().U(i);
        }
        d51 d51Var = ex0Var.q;
        d51Var.getClass();
        return d51Var.U(i);
    }

    @Override // defpackage.z3
    public final int X() {
        return this.m;
    }

    @Override // defpackage.z3
    public final void Z() {
        ax0.V(this.j.a, false, 7);
    }

    @Override // defpackage.z3
    public final bx0 a() {
        return this.B;
    }

    @Override // defpackage.r61
    public final int a0(int i) {
        ex0 ex0Var = this.j;
        if (!ex.B(ex0Var.a)) {
            v0();
            return ex0Var.a().a0(i);
        }
        d51 d51Var = ex0Var.q;
        d51Var.getClass();
        return d51Var.a0(i);
    }

    @Override // defpackage.r61
    public final jm1 e(long j) throws Throwable {
        yw0 yw0Var;
        ex0 ex0Var = this.j;
        ax0 ax0Var = ex0Var.a;
        ax0 ax0Var2 = ex0Var.a;
        yw0 yw0Var2 = ax0Var.F;
        yw0 yw0Var3 = yw0.g;
        if (yw0Var2 == yw0Var3) {
            ax0Var.e();
        }
        if (ex.B(ax0Var2)) {
            d51 d51Var = ex0Var.q;
            d51Var.getClass();
            d51Var.n = yw0Var3;
            d51Var.e(j);
        }
        ax0 ax0VarU = ax0Var2.u();
        if (ax0VarU != null) {
            ex0 ex0Var2 = ax0VarU.J;
            if (this.p != yw0Var3 && !ax0Var2.H) {
                vp0.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = ex0Var2.d.ordinal();
            if (iOrdinal == 0) {
                yw0Var = yw0.e;
            } else {
                if (iOrdinal != 2) {
                    qj.q(ex0Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                yw0Var = yw0.f;
            }
            this.p = yw0Var;
        } else {
            this.p = yw0Var3;
        }
        y0(j);
        return this;
    }

    @Override // defpackage.r61
    public final int e0(int i) {
        ex0 ex0Var = this.j;
        if (!ex.B(ex0Var.a)) {
            v0();
            return ex0Var.a().e0(i);
        }
        d51 d51Var = ex0Var.q;
        d51Var.getClass();
        return d51Var.e0(i);
    }

    @Override // defpackage.r61
    public final int f(int i) {
        ex0 ex0Var = this.j;
        if (!ex.B(ex0Var.a)) {
            v0();
            return ex0Var.a().f(i);
        }
        d51 d51Var = ex0Var.q;
        d51Var.getClass();
        return d51Var.f(i);
    }

    @Override // defpackage.jm1
    public final int f0(u3 u3Var) {
        ex0 ex0Var = this.j;
        ax0 ax0VarU = ex0Var.a.u();
        ww0 ww0Var = ax0VarU != null ? ax0VarU.J.d : null;
        ww0 ww0Var2 = ww0.e;
        bx0 bx0Var = this.B;
        if (ww0Var == ww0Var2) {
            bx0Var.c = true;
        } else {
            ax0 ax0VarU2 = ex0Var.a.u();
            if ((ax0VarU2 != null ? ax0VarU2.J.d : null) == ww0.g) {
                bx0Var.d = true;
            }
        }
        this.q = true;
        int iF0 = ex0Var.a().f0(u3Var);
        this.q = false;
        return iF0;
    }

    @Override // defpackage.jm1
    public final int g0() {
        return this.j.a().g0();
    }

    @Override // defpackage.jm1
    public final int h0() {
        return this.j.a().h0();
    }

    @Override // defpackage.jm1, defpackage.r61
    public final Object j() {
        return this.v;
    }

    @Override // defpackage.jm1
    public final void l0(long j, float f, ej0 ej0Var) throws Throwable {
        ex0 ex0Var = this.j;
        ax0 ax0Var = ex0Var.a;
        ax0 ax0Var2 = ex0Var.a;
        try {
            this.x = true;
            if (!ir0.a(j, this.r) || ej0Var != this.s || this.O) {
                if (ex0Var.k || ex0Var.j || this.O) {
                    this.z = true;
                    this.O = false;
                }
            }
            d51 d51Var = ex0Var.q;
            if (d51Var != null) {
                ex0 ex0Var2 = d51Var.j;
                if (d51Var.u == b51.g && !ex.B(ex0Var2.a)) {
                    ex0Var2.c = true;
                }
            }
            d51 d51Var2 = ex0Var.q;
            if (d51Var2 != null && d51Var2.p0()) {
                me1 me1Var = ex0Var.a().u;
                im1 placementScope = me1Var != null ? me1Var.p : ((e5) dx0.a(ax0Var2)).getPlacementScope();
                d51 d51Var3 = ex0Var.q;
                d51Var3.getClass();
                ax0 ax0VarU = ax0Var2.u();
                if (ax0VarU != null) {
                    ax0VarU.J.h = 0;
                }
                d51Var3.m = Integer.MAX_VALUE;
                placementScope.h(d51Var3, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
            }
            d51 d51Var4 = ex0Var.q;
            if (d51Var4 != null && !d51Var4.p) {
                vp0.b("Error: Placement happened before lookahead.");
            }
            x0(j, f, ej0Var);
        } catch (Throwable th) {
            ax0Var.Y(th);
            throw null;
        }
    }

    @Override // defpackage.z3
    public final void m(y3 y3Var) {
        fa1 fa1VarZ = this.j.a.z();
        Object[] objArr = fa1VarZ.e;
        int i = fa1VarZ.g;
        for (int i2 = 0; i2 < i; i2++) {
            y3Var.h(((ax0) objArr[i2]).J.p);
        }
    }

    @Override // defpackage.f81
    public final void n(boolean z) {
        ex0 ex0Var = this.j;
        if (z != ex0Var.a().m) {
            ex0Var.a().m = z;
            this.O = true;
        }
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
        return ex0Var.p;
    }

    public final List p0() {
        ex0 ex0Var = this.j;
        ex0Var.a.f0();
        boolean z = this.D;
        fa1 fa1Var = this.C;
        if (!z) {
            return fa1Var.f();
        }
        ax0 ax0Var = ex0Var.a;
        fa1 fa1VarZ = ax0Var.z();
        Object[] objArr = fa1VarZ.e;
        int i = fa1VarZ.g;
        for (int i2 = 0; i2 < i; i2++) {
            ax0 ax0Var2 = (ax0) objArr[i2];
            if (fa1Var.g <= i2) {
                fa1Var.b(ax0Var2.J.p);
            } else {
                v61 v61Var = ax0Var2.J.p;
                Object[] objArr2 = fa1Var.e;
                Object obj = objArr2[i2];
                objArr2[i2] = v61Var;
            }
        }
        fa1Var.l(((fa1) ((n91) ax0Var.n()).f).g, fa1Var.g);
        this.D = false;
        return fa1Var.f();
    }

    @Override // defpackage.z3
    public final void q() {
        boolean zY0;
        this.E = true;
        bx0 bx0Var = this.B;
        bx0Var.h();
        boolean z = this.z;
        ex0 ex0Var = this.j;
        if (z) {
            fa1 fa1VarZ = ex0Var.a.z();
            Object[] objArr = fa1VarZ.e;
            int i = fa1VarZ.g;
            for (int i2 = 0; i2 < i; i2++) {
                ax0 ax0Var = (ax0) objArr[i2];
                boolean zQ = ax0Var.q();
                ex0 ex0Var2 = ax0Var.J;
                if (zQ && ax0Var.r() == yw0.e) {
                    v61 v61Var = ex0Var2.p;
                    sw swVar = v61Var.n ? new sw(v61Var.h) : null;
                    if (swVar != null) {
                        if (ax0Var.F == yw0.g) {
                            ax0Var.e();
                        }
                        zY0 = ex0Var2.p.y0(swVar.a);
                    } else {
                        zY0 = false;
                    }
                    if (zY0) {
                        ax0.V(ex0Var.a, false, 7);
                    }
                }
            }
        }
        if (this.A || (!this.q && !o().o && this.z)) {
            this.z = false;
            ww0 ww0Var = ex0Var.d;
            ex0Var.d = ww0.g;
            ex0Var.g(false);
            ax0 ax0Var2 = ex0Var.a;
            cj1 snapshotObserver = ((e5) dx0.a(ax0Var2)).getSnapshotObserver();
            snapshotObserver.getClass();
            snapshotObserver.a.c(ax0Var2, je1.j, this.H);
            ex0Var.d = ww0Var;
            this.A = false;
        }
        if (bx0Var.d) {
            bx0Var.e = true;
        }
        if (bx0Var.b && bx0Var.e()) {
            bx0Var.g();
        }
        this.E = false;
    }

    @Override // defpackage.z3
    public final void requestLayout() {
        this.j.a.U(false);
    }

    public final void t0() {
        boolean z = this.w;
        this.w = true;
        ex0 ex0Var = this.j;
        ax0 ax0Var = ex0Var.a;
        he1 he1Var = ax0Var.I;
        if (!z) {
            he1Var.c.d1();
            ((e5) dx0.a(ax0Var)).getRectManager().f(ex0Var.a);
            if (ax0Var.q()) {
                ax0.V(ax0Var, true, 6);
            } else if (ax0Var.J.e) {
                ax0.T(ax0Var, true, 6);
            }
        }
        me1 me1Var = he1Var.c.t;
        for (me1 me1Var2 = he1Var.d; !ws0.j(me1Var2, me1Var) && me1Var2 != null; me1Var2 = me1Var2.t) {
            if (me1Var2.O) {
                me1Var2.Z0();
            }
        }
        fa1 fa1VarZ = ax0Var.z();
        Object[] objArr = fa1VarZ.e;
        int i = fa1VarZ.g;
        for (int i2 = 0; i2 < i; i2++) {
            ax0 ax0Var2 = (ax0) objArr[i2];
            if (ax0Var2.v() != Integer.MAX_VALUE) {
                ax0Var2.J.p.t0();
                ax0.W(ax0Var2);
            }
        }
    }

    public final void u0() {
        if (this.w) {
            this.w = false;
            ex0 ex0Var = this.j;
            ax0 ax0Var = ex0Var.a;
            ax0 ax0Var2 = ex0Var.a;
            ((e5) dx0.a(ax0Var)).getRectManager().g(ax0Var2);
            he1 he1Var = ax0Var2.I;
            me1 me1Var = he1Var.c.t;
            for (me1 me1Var2 = he1Var.d; !ws0.j(me1Var2, me1Var) && me1Var2 != null; me1Var2 = me1Var2.t) {
                me1Var2.f1();
                me1Var2.k1();
            }
            fa1 fa1VarZ = ax0Var2.z();
            Object[] objArr = fa1VarZ.e;
            int i = fa1VarZ.g;
            for (int i2 = 0; i2 < i; i2++) {
                ((ax0) objArr[i2]).J.p.u0();
            }
        }
    }

    public final void v0() {
        yw0 yw0Var;
        ex0 ex0Var = this.j;
        ax0.V(ex0Var.a, false, 7);
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

    public final void w0() {
        this.J = true;
        ex0 ex0Var = this.j;
        ax0 ax0VarU = ex0Var.a.u();
        float f = o().E;
        ax0 ax0Var = ex0Var.a;
        he1 he1Var = ax0Var.I;
        me1 me1Var = he1Var.d;
        bq0 bq0Var = he1Var.c;
        while (me1Var != bq0Var) {
            me1Var.getClass();
            uw0 uw0Var = (uw0) me1Var;
            f += uw0Var.E;
            me1Var = uw0Var.t;
        }
        if (f != this.I) {
            this.I = f;
            if (ax0VarU != null) {
                ax0VarU.O();
            }
            if (ax0VarU != null) {
                ax0VarU.C();
            }
        }
        if (!o().o) {
            boolean z = this.w;
            if (!z || this.B.d()) {
                t0();
            }
            if (z) {
                ax0Var.I.c.d1();
            } else {
                if (ax0VarU != null) {
                    ax0VarU.C();
                }
                if (this.k && ax0VarU != null) {
                    ax0VarU.U(false);
                }
            }
        }
        if (ax0VarU != null) {
            ex0 ex0Var2 = ax0VarU.J;
            if (!this.k && ex0Var2.d == ww0.g) {
                if (this.m != Integer.MAX_VALUE) {
                    vp0.b("Place was called on a node which was placed already");
                }
                int i = ex0Var2.i;
                this.m = i;
                ex0Var2.i = i + 1;
            }
        } else {
            this.m = 0;
        }
        q();
    }

    public final void x0(long j, float f, ej0 ej0Var) {
        ex0 ex0Var = this.j;
        ax0 ax0Var = ex0Var.a;
        ax0 ax0Var2 = ex0Var.a;
        if (ax0Var.R) {
            vp0.a("place is called on a deactivated node");
        }
        ex0Var.d = ww0.g;
        this.r = j;
        this.t = f;
        this.s = ej0Var;
        this.J = false;
        aj1 aj1VarA = dx0.a(ax0Var2);
        if (this.z || !this.w) {
            this.B.g = false;
            ex0Var.f(false);
            this.K = ej0Var;
            this.L = j;
            this.M = f;
            cj1 snapshotObserver = ((e5) aj1VarA).getSnapshotObserver();
            snapshotObserver.getClass();
            snapshotObserver.a.c(ax0Var2, je1.k, this.N);
        } else {
            me1 me1VarA = ex0Var.a();
            me1VarA.i1(ir0.c(j, me1VarA.i), f, ej0Var);
            w0();
        }
        ex0Var.d = ww0.i;
        if (ex0Var.a().o && (ex0Var.k || ex0Var.j)) {
            requestLayout();
        }
        this.o = true;
    }

    public final boolean y0(long j) throws Throwable {
        ex0 ex0Var = this.j;
        ax0 ax0Var = ex0Var.a;
        ax0 ax0Var2 = ex0Var.a;
        try {
            if (ax0Var.R) {
                vp0.a("measure is called on a deactivated node");
            }
            aj1 aj1VarA = dx0.a(ax0Var2);
            ax0 ax0VarU = ax0Var2.u();
            boolean z = true;
            ax0Var2.H = ax0Var2.H || (ax0VarU != null && ax0VarU.H);
            if (!ax0Var2.q() && sw.b(this.h, j)) {
                ((e5) aj1VarA).l(ax0Var2, false);
                ax0Var2.X();
                return false;
            }
            this.B.f = false;
            fa1 fa1VarZ = ax0Var2.z();
            Object[] objArr = fa1VarZ.e;
            int i = fa1VarZ.g;
            for (int i2 = 0; i2 < i; i2++) {
                ((ax0) objArr[i2]).J.p.B.c = false;
            }
            this.n = true;
            long j2 = ex0Var.a().g;
            o0(j);
            ww0 ww0Var = ex0Var.d;
            ww0 ww0Var2 = ww0.i;
            if (ww0Var != ww0Var2) {
                vp0.b("layout state is not idle before measure starts");
            }
            this.F = j;
            ww0 ww0Var3 = ww0.e;
            ex0Var.d = ww0Var3;
            this.y = false;
            cj1 snapshotObserver = ((e5) dx0.a(ax0Var2)).getSnapshotObserver();
            u61 u61Var = this.G;
            snapshotObserver.getClass();
            snapshotObserver.a.c(ax0Var2, je1.o, u61Var);
            if (ex0Var.d == ww0Var3) {
                this.z = true;
                this.A = true;
                ex0Var.d = ww0Var2;
            }
            if (qr0.a(ex0Var.a().g, j2) && ex0Var.a().e == this.e && ex0Var.a().f == this.f) {
                z = false;
            }
            m0((((long) ex0Var.a().f) & 4294967295L) | (((long) ex0Var.a().e) << 32));
            return z;
        } catch (Throwable th) {
            ax0Var.Y(th);
            throw null;
        }
    }

    public final void z0() {
        ex0 ex0Var = this.j;
        ax0 ax0Var = ex0Var.a;
        ax0 ax0Var2 = ex0Var.a;
        if (!ax0Var.I() || ex0Var.l <= 0) {
            return;
        }
        ex0 ex0Var2 = ax0Var2.J;
        if ((ex0Var2.j || ex0Var2.k) && !ex0Var2.p.z) {
            ax0Var2.U(false);
        }
        fa1 fa1VarZ = ax0Var2.z();
        Object[] objArr = fa1VarZ.e;
        int i = fa1VarZ.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((ax0) objArr[i2]).J.p.z0();
        }
    }
}
