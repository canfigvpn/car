package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z41 extends x41 implements r61 {
    public final me1 s;
    public LinkedHashMap u;
    public x61 w;
    public final l91 x;
    public long t = 0;
    public final a51 v = new a51(this);

    public z41(me1 me1Var) {
        this.s = me1Var;
        l91 l91Var = ef1.a;
        this.x = new l91();
    }

    @Override // defpackage.x41
    public final x61 A0() {
        x61 x61Var = this.w;
        if (x61Var != null) {
            return x61Var;
        }
        throw k3.g("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.x41
    public final x41 B0() {
        me1 me1Var = this.s.u;
        if (me1Var != null) {
            return me1Var.Q0();
        }
        return null;
    }

    @Override // defpackage.x41
    public final long C0() {
        return this.t;
    }

    @Override // defpackage.x41
    public final void G0() {
        l0(this.t, 0.0f, null);
    }

    public void H0() {
        A0().b();
    }

    public final void I0(long j) {
        if (!ir0.a(this.t, j)) {
            this.t = j;
            me1 me1Var = this.s;
            d51 d51Var = me1Var.s.J.q;
            if (d51Var != null) {
                d51Var.v0();
            }
            x41.E0(me1Var);
        }
        if (this.o) {
            return;
        }
        v0(A0());
    }

    public final long J0(z41 z41Var, boolean z) {
        long jC = 0;
        while (!this.equals(z41Var)) {
            if (!this.m || !z) {
                jC = ir0.c(jC, this.t);
            }
            me1 me1Var = this.s.u;
            me1Var.getClass();
            this = me1Var.Q0();
            this.getClass();
        }
        return jC;
    }

    public final void K0(x61 x61Var) {
        LinkedHashMap linkedHashMap;
        if (x61Var != null) {
            m0((((long) x61Var.c()) & 4294967295L) | (((long) x61Var.e()) << 32));
        } else {
            m0(0L);
        }
        if (!ws0.j(this.w, x61Var) && x61Var != null && ((((linkedHashMap = this.u) != null && !linkedHashMap.isEmpty()) || !x61Var.a().isEmpty()) && !ws0.j(x61Var.a(), this.u))) {
            d51 d51Var = this.s.s.J.q;
            d51Var.getClass();
            d51Var.v.f();
            LinkedHashMap linkedHashMap2 = this.u;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.u = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(x61Var.a());
        }
        this.w = x61Var;
    }

    @Override // defpackage.m40
    public final float b() {
        return this.s.b();
    }

    @Override // defpackage.os0
    public final kw0 getLayoutDirection() {
        return this.s.s.C;
    }

    @Override // defpackage.jm1, defpackage.r61
    public final Object j() {
        return this.s.j();
    }

    @Override // defpackage.m40
    public final float l() {
        return this.s.l();
    }

    @Override // defpackage.jm1
    public final void l0(long j, float f, ej0 ej0Var) {
        I0(j);
        if (this.n) {
            return;
        }
        H0();
    }

    @Override // defpackage.x41, defpackage.os0
    public final boolean r() {
        return true;
    }

    @Override // defpackage.x41
    public final x41 w0() {
        me1 me1Var = this.s.t;
        if (me1Var != null) {
            return me1Var.Q0();
        }
        return null;
    }

    @Override // defpackage.x41
    public final jw0 x0() {
        return this.v;
    }

    @Override // defpackage.x41
    public final boolean y0() {
        return this.w != null;
    }

    @Override // defpackage.x41
    public final ax0 z0() {
        return this.s.s;
    }
}
