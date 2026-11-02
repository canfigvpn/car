package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class aq0 extends z41 {
    @Override // defpackage.z41
    public final void H0() {
        d51 d51Var = this.s.s.J.q;
        d51Var.getClass();
        d51Var.x0();
    }

    @Override // defpackage.r61
    public final int U(int i) {
        dq0 dq0VarT = this.s.s.t();
        w61 w61VarR = dq0VarT.r();
        ax0 ax0Var = (ax0) dq0VarT.f;
        return w61VarR.j(ax0Var.I.d, ax0Var.l(), i);
    }

    @Override // defpackage.r61
    public final int a0(int i) {
        dq0 dq0VarT = this.s.s.t();
        w61 w61VarR = dq0VarT.r();
        ax0 ax0Var = (ax0) dq0VarT.f;
        return w61VarR.c(ax0Var.I.d, ax0Var.l(), i);
    }

    @Override // defpackage.r61
    public final jm1 e(long j) {
        o0(j);
        me1 me1Var = this.s;
        fa1 fa1VarZ = me1Var.s.z();
        Object[] objArr = fa1VarZ.e;
        int i = fa1VarZ.g;
        for (int i2 = 0; i2 < i; i2++) {
            d51 d51Var = ((ax0) objArr[i2]).J.q;
            d51Var.getClass();
            d51Var.n = yw0.g;
        }
        ax0 ax0Var = me1Var.s;
        K0(ax0Var.z.g(this, ax0Var.l(), j));
        return this;
    }

    @Override // defpackage.r61
    public final int e0(int i) {
        dq0 dq0VarT = this.s.s.t();
        w61 w61VarR = dq0VarT.r();
        ax0 ax0Var = (ax0) dq0VarT.f;
        return w61VarR.h(ax0Var.I.d, ax0Var.l(), i);
    }

    @Override // defpackage.r61
    public final int f(int i) {
        dq0 dq0VarT = this.s.s.t();
        w61 w61VarR = dq0VarT.r();
        ax0 ax0Var = (ax0) dq0VarT.f;
        return w61VarR.b(ax0Var.I.d, ax0Var.l(), i);
    }

    @Override // defpackage.x41
    public final int t0(u3 u3Var) {
        d51 d51Var = this.s.s.J.q;
        d51Var.getClass();
        bx0 bx0Var = d51Var.v;
        if (!d51Var.o) {
            ex0 ex0Var = d51Var.j;
            if (ex0Var.d == ww0.f) {
                bx0Var.f = true;
                if (bx0Var.b) {
                    ex0Var.f = true;
                    ex0Var.g = true;
                }
            } else {
                bx0Var.g = true;
            }
        }
        aq0 aq0Var = d51Var.o().W;
        if (aq0Var != null) {
            aq0Var.o = true;
        }
        d51Var.q();
        aq0 aq0Var2 = d51Var.o().W;
        if (aq0Var2 != null) {
            aq0Var2.o = false;
        }
        Integer num = (Integer) bx0Var.i.get(u3Var);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.x.g(iIntValue, u3Var);
        return iIntValue;
    }
}
