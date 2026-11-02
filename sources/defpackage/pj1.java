package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pj1 extends t71 implements sw0, k80 {
    public nj1 s;
    public boolean t;
    public wi u;
    public is1 v;
    public float w;
    public yi x;

    public static boolean G0(long j) {
        return !d52.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean H0(long j) {
        return !d52.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // defpackage.sw0
    public final int A(x41 x41Var, r61 r61Var, int i) {
        if (!F0()) {
            return r61Var.e0(i);
        }
        long jI0 = I0(tw.b(i, 0, 13));
        return Math.max(sw.i(jI0), r61Var.e0(i));
    }

    public final boolean F0() {
        return this.t && this.s.d() != 9205357640488583168L;
    }

    public final long I0(long j) {
        boolean z = false;
        boolean z2 = sw.d(j) && sw.c(j);
        if (sw.f(j) && sw.e(j)) {
            z = true;
        }
        if ((!F0() && z2) || z) {
            return sw.a(j, sw.h(j), 0, sw.g(j), 0, 10);
        }
        long jD = this.s.d();
        int iRound = H0(jD) ? Math.round(Float.intBitsToFloat((int) (jD >> 32))) : sw.j(j);
        int iRound2 = G0(jD) ? Math.round(Float.intBitsToFloat((int) (jD & 4294967295L))) : sw.i(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(tw.f(iRound2, j))) & 4294967295L) | (((long) Float.floatToRawIntBits(tw.g(iRound, j))) << 32);
        if (F0()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!H0(this.s.d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.s.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!G0(this.s.d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.s.d() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : ei1.H(jFloatToRawIntBits2, this.v.h(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return sw.a(j, tw.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, tw.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    @Override // defpackage.k80
    public final void K(cx0 cx0Var) {
        um umVar = cx0Var.e;
        long jD = this.s.d();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(H0(jD) ? Float.intBitsToFloat((int) (jD >> 32)) : Float.intBitsToFloat((int) (umVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(G0(jD) ? Float.intBitsToFloat((int) (jD & 4294967295L)) : Float.intBitsToFloat((int) (umVar.d() & 4294967295L)))) & 4294967295L);
        long jH = (Float.intBitsToFloat((int) (umVar.d() >> 32)) == 0.0f || Float.intBitsToFloat((int) (umVar.d() & 4294967295L)) == 0.0f) ? 0L : ei1.H(jFloatToRawIntBits, this.v.h(jFloatToRawIntBits, umVar.d()));
        long jA = this.u.a((((long) Math.round(Float.intBitsToFloat((int) (jH >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jH & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (umVar.d() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (umVar.d() & 4294967295L)))) & 4294967295L), cx0Var.getLayoutDirection());
        float f = (int) (jA >> 32);
        float f2 = (int) (jA & 4294967295L);
        ((ao2) umVar.f.b).w(f, f2);
        try {
            this.s.c(cx0Var, jH, this.w, this.x);
            ((ao2) umVar.f.b).w(-f, -f2);
            cx0Var.a();
        } catch (Throwable th) {
            ((ao2) umVar.f.b).w(-f, -f2);
            throw th;
        }
    }

    @Override // defpackage.sw0
    public final int P(x41 x41Var, r61 r61Var, int i) {
        if (!F0()) {
            return r61Var.U(i);
        }
        long jI0 = I0(tw.b(0, i, 7));
        return Math.max(sw.j(jI0), r61Var.U(i));
    }

    @Override // defpackage.sw0
    public final x61 e(y61 y61Var, r61 r61Var, long j) {
        jm1 jm1VarE = r61Var.e(I0(j));
        return y61Var.d0(jm1VarE.e, jm1VarE.f, db0.e, new q4(jm1VarE, 5));
    }

    @Override // defpackage.sw0
    public final int f(x41 x41Var, r61 r61Var, int i) {
        if (!F0()) {
            return r61Var.a0(i);
        }
        long jI0 = I0(tw.b(0, i, 7));
        return Math.max(sw.j(jI0), r61Var.a0(i));
    }

    @Override // defpackage.sw0
    public final int n(x41 x41Var, r61 r61Var, int i) {
        if (!F0()) {
            return r61Var.f(i);
        }
        long jI0 = I0(tw.b(i, 0, 13));
        return Math.max(sw.i(jI0), r61Var.f(i));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.s + ", sizeToIntrinsics=" + this.t + ", alignment=" + this.u + ", alpha=" + this.w + ", colorFilter=" + this.x + ')';
    }

    @Override // defpackage.t71
    public final boolean u0() {
        return false;
    }
}
