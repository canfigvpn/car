package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class h51 extends t71 implements pk0, k80, m02, lf1 {
    public sm1 A;
    public View B;
    public m40 C;
    public rm1 D;
    public v40 F;
    public qr0 H;
    public zk I;
    public lc s;
    public pe2 t;
    public float u = Float.NaN;
    public boolean v = true;
    public long w = 9205357640488583168L;
    public float x = Float.NaN;
    public float y = Float.NaN;
    public boolean z = true;
    public final dk1 E = new dk1(null, q90.U);
    public long G = 9205357640488583168L;

    public h51(lc lcVar, pe2 pe2Var, sm1 sm1Var) {
        this.s = lcVar;
        this.t = pe2Var;
        this.A = sm1Var;
    }

    public final long F0() {
        v40 v40VarB = this.F;
        if (v40VarB == null) {
            v40VarB = e72.b(new g51(this, 2));
            this.F = v40VarB;
        }
        return ((uf1) v40VarB.getValue()).a;
    }

    public final void G0() {
        rm1 rm1Var = this.D;
        if (rm1Var != null) {
            ((tm1) rm1Var).b();
        }
        View viewE = this.B;
        if (viewE == null) {
            viewE = ux.E(this);
        }
        View view = viewE;
        this.B = view;
        m40 m40Var = this.C;
        if (m40Var == null) {
            m40Var = qx.V(this).B;
        }
        m40 m40Var2 = m40Var;
        this.C = m40Var2;
        this.D = this.A.b(view, this.v, this.w, this.x, this.y, this.z, m40Var2, this.u);
        I0();
    }

    public final void H0() {
        m40 m40Var = this.C;
        if (m40Var == null) {
            m40Var = qx.V(this).B;
            this.C = m40Var;
        }
        long j = ((uf1) this.s.h(m40Var)).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & F0()) == 9205357640488583168L) {
            this.G = 9205357640488583168L;
            rm1 rm1Var = this.D;
            if (rm1Var != null) {
                ((tm1) rm1Var).b();
                return;
            }
            return;
        }
        this.G = uf1.e(F0(), j);
        if (this.D == null) {
            G0();
        }
        rm1 rm1Var2 = this.D;
        if (rm1Var2 != null) {
            rm1Var2.a(this.G, 9205357640488583168L, this.u);
        }
        I0();
    }

    @Override // defpackage.lf1
    public final void I() {
        ux.C(this, new g51(this, 0));
    }

    public final void I0() {
        m40 m40Var;
        rm1 rm1Var = this.D;
        if (rm1Var == null || (m40Var = this.C) == null) {
            return;
        }
        tm1 tm1Var = (tm1) rm1Var;
        long jC = tm1Var.c();
        qr0 qr0Var = this.H;
        if (qr0Var != null && jC == qr0Var.a) {
            return;
        }
        pe2 pe2Var = this.t;
        if (pe2Var != null) {
            pe2Var.h(new z60(m40Var.w(ux.M(tm1Var.c()))));
        }
        this.H = new qr0(tm1Var.c());
    }

    @Override // defpackage.k80
    public final void K(cx0 cx0Var) {
        cx0Var.a();
        zk zkVar = this.I;
        if (zkVar != null) {
            zkVar.c(ll2.a);
        }
    }

    @Override // defpackage.m02
    public final void e0(z02 z02Var) {
        z02Var.a(i51.a, new g51(this, 1));
    }

    @Override // defpackage.pk0
    public final void t(me1 me1Var) {
        this.E.setValue(me1Var);
    }

    @Override // defpackage.t71
    public final void x0() {
        I();
        this.I = s5.d(0, 7, null);
        nj2.y(t0(), null, new ln(8, (sx) null, this), 1);
    }

    @Override // defpackage.t71
    public final void y0() {
        rm1 rm1Var = this.D;
        if (rm1Var != null) {
            ((tm1) rm1Var).b();
        }
        this.D = null;
    }
}
