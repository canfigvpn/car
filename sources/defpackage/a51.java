package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class a51 implements jw0 {
    public final z41 e;

    public a51(z41 z41Var) {
        this.e = z41Var;
    }

    @Override // defpackage.jw0
    public final boolean A() {
        return this.e.s.S0().r;
    }

    @Override // defpackage.jw0
    public final void D(float[] fArr) {
        this.e.s.D(fArr);
    }

    @Override // defpackage.jw0
    public final long G(jw0 jw0Var, long j) {
        boolean z = jw0Var instanceof a51;
        z41 z41Var = this.e;
        if (!z) {
            z41 z41VarE = ix.E(z41Var);
            me1 me1Var = z41VarE.s;
            long jG = G(z41VarE.v, j);
            long j2 = z41VarE.t;
            long jD = uf1.d(jG, (4294967295L & ((long) Float.floatToRawIntBits((int) (j2 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
            if (!me1Var.S0().r) {
                vp0.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            me1Var.b1();
            me1 me1Var2 = me1Var.u;
            if (me1Var2 != null) {
                me1Var = me1Var2;
            }
            return uf1.e(jD, me1Var.G(jw0Var, 0L));
        }
        z41 z41Var2 = ((a51) jw0Var).e;
        me1 me1Var3 = z41Var2.s;
        me1Var3.b1();
        z41 z41VarQ0 = z41Var.s.O0(me1Var3).Q0();
        if (z41VarQ0 != null) {
            long jB = ir0.b(ir0.c(z41Var2.J0(z41VarQ0, false), mx.N(j)), z41Var.J0(z41VarQ0, false));
            return (((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L);
        }
        z41 z41VarE2 = ix.E(z41Var2);
        long jC = ir0.c(ir0.c(z41Var2.J0(z41VarE2, false), z41VarE2.t), mx.N(j));
        z41 z41VarE3 = ix.E(z41Var);
        long jB2 = ir0.b(jC, ir0.c(z41Var.J0(z41VarE3, false), z41VarE3.t));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jB2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jB2 & 4294967295L))) & 4294967295L;
        me1 me1Var4 = z41VarE3.s.u;
        me1Var4.getClass();
        me1 me1Var5 = z41VarE2.s.u;
        me1Var5.getClass();
        return me1Var4.G(me1Var5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // defpackage.jw0
    public final void I(jw0 jw0Var, float[] fArr) {
        this.e.s.I(jw0Var, fArr);
    }

    @Override // defpackage.jw0
    public final yr1 K(jw0 jw0Var, boolean z) {
        return this.e.s.K(jw0Var, z);
    }

    @Override // defpackage.jw0
    public final long P() {
        z41 z41Var = this.e;
        return (((long) z41Var.e) << 32) | (((long) z41Var.f) & 4294967295L);
    }

    @Override // defpackage.jw0
    public final long R(long j) {
        return this.e.s.R(uf1.e(j, a()));
    }

    public final long a() {
        z41 z41Var = this.e;
        z41 z41VarE = ix.E(z41Var);
        return uf1.d(G(z41VarE.v, 0L), z41Var.s.G(z41VarE.s, 0L));
    }

    @Override // defpackage.jw0
    public final long c(long j) {
        return this.e.s.c(uf1.e(0L, a()));
    }

    @Override // defpackage.jw0
    public final long h(long j) {
        return uf1.e(this.e.s.h(j), a());
    }

    @Override // defpackage.jw0
    public final long i(long j) {
        return this.e.s.i(uf1.e(j, a()));
    }

    @Override // defpackage.jw0
    public final jw0 k() {
        z41 z41VarQ0;
        if (!A()) {
            vp0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        me1 me1Var = this.e.s.s.I.d.u;
        if (me1Var == null || (z41VarQ0 = me1Var.Q0()) == null) {
            return null;
        }
        return z41VarQ0.v;
    }

    @Override // defpackage.jw0
    public final long t(jw0 jw0Var, long j) {
        return G(jw0Var, j);
    }

    @Override // defpackage.jw0
    public final long z(long j) {
        return uf1.e(this.e.s.z(j), a());
    }
}
