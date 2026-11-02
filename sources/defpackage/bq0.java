package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bq0 extends me1 {
    public static final v7 X;
    public final sb2 V;
    public aq0 W;

    static {
        v7 v7VarC = vs0.c();
        int i = dr.h;
        v7VarC.e(dr.d);
        v7VarC.k(1.0f);
        v7VarC.l(1);
        X = v7VarC;
    }

    public bq0(ax0 ax0Var) {
        super(ax0Var);
        sb2 sb2Var = new sb2();
        sb2Var.h = 0;
        this.V = sb2Var;
        sb2Var.l = this;
        this.W = ax0Var.l != null ? new aq0(this) : null;
    }

    @Override // defpackage.me1
    public final void N0() {
        if (this.W == null) {
            this.W = new aq0(this);
        }
    }

    @Override // defpackage.me1
    public final z41 Q0() {
        return this.W;
    }

    @Override // defpackage.me1
    public final t71 S0() {
        return this.V;
    }

    @Override // defpackage.r61
    public final int U(int i) {
        dq0 dq0VarT = this.s.t();
        w61 w61VarR = dq0VarT.r();
        ax0 ax0Var = (ax0) dq0VarT.f;
        return w61VarR.j(ax0Var.I.d, ax0Var.m(), i);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0073 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.me1
    public final void Y0(ke1 ke1Var, long j, vm0 vm0Var, int i, boolean z) {
        int i2;
        boolean z2;
        Object[] objArr;
        int i3;
        ax0 ax0Var;
        long jA;
        ax0 ax0Var2 = this.s;
        boolean z3 = false;
        if (ke1Var.f(ax0Var2)) {
            if (!t1(j)) {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(K0(j, R0())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                }
                if (z3) {
                    int i4 = vm0Var.g;
                    fa1 fa1VarX = ax0Var2.x();
                    objArr = fa1VarX.e;
                    i3 = fa1VarX.g - 1;
                    while (i3 >= 0) {
                        ax0Var = (ax0) objArr[i3];
                        if (ax0Var.I()) {
                            ke1Var.d(ax0Var, j, vm0Var, i2, z2);
                            jA = vm0Var.a();
                            if (ei1.u(jA) >= 0.0f && ei1.A(jA) && !ei1.z(jA) && !ke1Var.e(vm0Var, ax0Var)) {
                                break;
                            }
                        }
                        i3--;
                        i2 = i;
                    }
                    vm0Var.g = i4;
                }
            }
            i2 = i;
            z2 = z;
            z3 = true;
            if (z3) {
                int i5 = vm0Var.g;
                fa1 fa1VarX2 = ax0Var2.x();
                objArr = fa1VarX2.e;
                i3 = fa1VarX2.g - 1;
                while (i3 >= 0) {
                    ax0Var = (ax0) objArr[i3];
                    if (ax0Var.I()) {
                        ke1Var.d(ax0Var, j, vm0Var, i2, z2);
                        jA = vm0Var.a();
                        if (ei1.u(jA) >= 0.0f) {
                            continue;
                        }
                    }
                    i3--;
                    i2 = i;
                }
                vm0Var.g = i5;
            }
        }
        i2 = i;
        z2 = z;
        if (z3) {
            int i6 = vm0Var.g;
            fa1 fa1VarX3 = ax0Var2.x();
            objArr = fa1VarX3.e;
            i3 = fa1VarX3.g - 1;
            while (i3 >= 0) {
                ax0Var = (ax0) objArr[i3];
                if (ax0Var.I()) {
                    ke1Var.d(ax0Var, j, vm0Var, i2, z2);
                    jA = vm0Var.a();
                    if (ei1.u(jA) >= 0.0f) {
                        continue;
                    }
                }
                i3--;
                i2 = i;
            }
            vm0Var.g = i6;
        }
    }

    @Override // defpackage.r61
    public final int a0(int i) {
        dq0 dq0VarT = this.s.t();
        w61 w61VarR = dq0VarT.r();
        ax0 ax0Var = (ax0) dq0VarT.f;
        return w61VarR.c(ax0Var.I.d, ax0Var.m(), i);
    }

    @Override // defpackage.r61
    public final jm1 e(long j) {
        o0(j);
        ax0 ax0Var = this.s;
        fa1 fa1VarZ = ax0Var.z();
        Object[] objArr = fa1VarZ.e;
        int i = fa1VarZ.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((ax0) objArr[i2]).J.p.p = yw0.g;
        }
        l1(ax0Var.z.g(this, ax0Var.m(), j));
        c1();
        return this;
    }

    @Override // defpackage.r61
    public final int e0(int i) {
        dq0 dq0VarT = this.s.t();
        w61 w61VarR = dq0VarT.r();
        ax0 ax0Var = (ax0) dq0VarT.f;
        return w61VarR.h(ax0Var.I.d, ax0Var.m(), i);
    }

    @Override // defpackage.r61
    public final int f(int i) {
        dq0 dq0VarT = this.s.t();
        w61 w61VarR = dq0VarT.r();
        ax0 ax0Var = (ax0) dq0VarT.f;
        return w61VarR.b(ax0Var.I.d, ax0Var.m(), i);
    }

    @Override // defpackage.me1
    public final void h1(sm smVar, al0 al0Var) throws Throwable {
        ax0 ax0Var = this.s;
        aj1 aj1VarA = dx0.a(ax0Var);
        fa1 fa1VarX = ax0Var.x();
        Object[] objArr = fa1VarX.e;
        int i = fa1VarX.g;
        for (int i2 = 0; i2 < i; i2++) {
            ax0 ax0Var2 = (ax0) objArr[i2];
            if (ax0Var2.I()) {
                ax0Var2.i(smVar, al0Var);
            }
        }
        if (((e5) aj1VarA).getShowLayoutBounds()) {
            long j = this.g;
            smVar.p(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, X);
        }
    }

    @Override // defpackage.jm1
    public final void l0(long j, float f, ej0 ej0Var) {
        i1(j, f, ej0Var);
        if (this.n) {
            return;
        }
        this.s.J.p.w0();
    }

    @Override // defpackage.x41
    public final int t0(u3 u3Var) {
        aq0 aq0Var = this.W;
        if (aq0Var != null) {
            return aq0Var.t0(u3Var);
        }
        v61 v61Var = this.s.J.p;
        bx0 bx0Var = v61Var.B;
        if (!v61Var.q) {
            if (v61Var.j.d == ww0.e) {
                bx0Var.f = true;
                if (bx0Var.b) {
                    v61Var.z = true;
                    v61Var.A = true;
                }
            } else {
                bx0Var.g = true;
            }
        }
        bq0 bq0VarO = v61Var.o();
        boolean z = bq0VarO.o;
        bq0VarO.o = true;
        v61Var.q();
        bq0VarO.o = z;
        Integer num = (Integer) bx0Var.i.get(u3Var);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
