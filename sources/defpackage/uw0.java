package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class uw0 extends me1 {
    public static final v7 X;
    public sw0 V;
    public tw0 W;

    static {
        v7 v7VarC = vs0.c();
        int i = dr.h;
        v7VarC.e(dr.e);
        v7VarC.k(1.0f);
        v7VarC.l(1);
        X = v7VarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public uw0(ax0 ax0Var, sw0 sw0Var) {
        super(ax0Var);
        this.V = sw0Var;
        this.W = ax0Var.l != null ? new tw0(this) : null;
        if ((((t71) sw0Var).e.g & 512) == 0) {
            return;
        }
        fu1.c();
        throw null;
    }

    @Override // defpackage.me1
    public final void N0() {
        if (this.W == null) {
            this.W = new tw0(this);
        }
    }

    @Override // defpackage.me1
    public final z41 Q0() {
        return this.W;
    }

    @Override // defpackage.me1
    public final t71 S0() {
        return ((t71) this.V).e;
    }

    @Override // defpackage.r61
    public final int U(int i) {
        sw0 sw0Var = this.V;
        me1 me1Var = this.t;
        me1Var.getClass();
        return sw0Var.P(this, me1Var, i);
    }

    @Override // defpackage.r61
    public final int a0(int i) {
        sw0 sw0Var = this.V;
        me1 me1Var = this.t;
        me1Var.getClass();
        return sw0Var.f(this, me1Var, i);
    }

    @Override // defpackage.r61
    public final jm1 e(long j) {
        o0(j);
        sw0 sw0Var = this.V;
        me1 me1Var = this.t;
        me1Var.getClass();
        l1(sw0Var.e(this, me1Var, j));
        c1();
        return this;
    }

    @Override // defpackage.r61
    public final int e0(int i) {
        sw0 sw0Var = this.V;
        me1 me1Var = this.t;
        me1Var.getClass();
        return sw0Var.A(this, me1Var, i);
    }

    @Override // defpackage.r61
    public final int f(int i) {
        sw0 sw0Var = this.V;
        me1 me1Var = this.t;
        me1Var.getClass();
        return sw0Var.n(this, me1Var, i);
    }

    @Override // defpackage.me1
    public final void h1(sm smVar, al0 al0Var) {
        me1 me1Var;
        me1 me1Var2 = this.t;
        me1Var2.getClass();
        me1Var2.L0(smVar, al0Var);
        if (!((e5) dx0.a(this.s)).getShowLayoutBounds() || (me1Var = this.t) == null) {
            return;
        }
        if (qr0.a(this.g, me1Var.g) && ir0.a(me1Var.D, 0L)) {
            return;
        }
        long j = this.g;
        smVar.p(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, X);
    }

    @Override // defpackage.jm1
    public final void l0(long j, float f, ej0 ej0Var) {
        i1(j, f, ej0Var);
        if (this.n) {
            return;
        }
        d1();
        me1 me1Var = this.t;
        me1Var.getClass();
        me1Var.o = this.o;
        A0().b();
        me1Var.o = false;
    }

    @Override // defpackage.x41
    public final int t0(u3 u3Var) {
        tw0 tw0Var = this.W;
        if (tw0Var == null) {
            return vv.h(this, u3Var);
        }
        l91 l91Var = tw0Var.x;
        int iD = l91Var.d(u3Var);
        if (iD >= 0) {
            return l91Var.c[iD];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u1(sw0 sw0Var) {
        if (sw0Var.equals(this.V) || (((t71) sw0Var).e.g & 512) == 0) {
            this.V = sw0Var;
        } else {
            fu1.c();
        }
    }
}
