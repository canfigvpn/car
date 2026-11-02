package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rq1 {
    static {
        int i = i81.a;
    }

    public static final void a(final ti0 ti0Var, final u71 u71Var, final long j, final long j2, int i, float f, final ej0 ej0Var, ak0 ak0Var, final int i2) {
        final int i3;
        final float f2;
        float f3;
        int i4;
        Object obj;
        final int i5;
        final float f4;
        ak0Var.X(-339970038);
        int i6 = i2 | (ak0Var.h(ti0Var) ? 4 : 2) | (ak0Var.e(j) ? 256 : 128) | (ak0Var.e(j2) ? 2048 : 1024) | 221184;
        if (ak0Var.O(i6 & 1, (599187 & i6) != 599186)) {
            ak0Var.T();
            if ((i2 & 1) == 0 || ak0Var.y()) {
                f3 = 4.0f;
                i4 = 1;
            } else {
                ak0Var.R();
                i4 = i;
                f3 = f;
            }
            ak0Var.q();
            boolean z = (i6 & 14) == 4;
            Object objL = ak0Var.L();
            Object obj2 = cv.a;
            if (z || objL == obj2) {
                objL = new w8(23, ti0Var);
                ak0Var.g0(objL);
            }
            final ti0 ti0Var2 = (ti0) objL;
            u71 u71VarC = u71Var.c(u1.a);
            boolean zF = ak0Var.f(ti0Var2);
            Object objL2 = ak0Var.L();
            if (zF || objL2 == obj2) {
                objL2 = new lc(1, ti0Var2);
                ak0Var.g0(objL2);
            }
            u71 u71VarK = f52.k(l02.a(u71VarC, true, (ej0) objL2), 240.0f, 4.0f);
            boolean zF2 = ak0Var.f(ti0Var2) | ((((i6 & 7168) ^ 3072) > 2048 && ak0Var.e(j2)) || (i6 & 3072) == 2048) | ((((i6 & 896) ^ 384) > 256 && ak0Var.e(j)) || (i6 & 384) == 256);
            Object objL3 = ak0Var.L();
            if (zF2 || objL3 == obj2) {
                i5 = i4;
                f4 = f3;
                obj = new ej0() { // from class: pq1
                    @Override // defpackage.ej0
                    public final Object h(Object obj3) {
                        l80 l80Var = (l80) obj3;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (l80Var.d() & 4294967295L));
                        int i7 = i5;
                        float fQ0 = f4;
                        if (i7 != 0 && Float.intBitsToFloat((int) (l80Var.d() & 4294967295L)) <= Float.intBitsToFloat((int) (l80Var.d() >> 32))) {
                            fQ0 += l80Var.q0(fIntBitsToFloat);
                        }
                        float fQ1 = fQ0 / l80Var.q0(Float.intBitsToFloat((int) (l80Var.d() >> 32)));
                        float fFloatValue = ((Number) ti0Var2.a()).floatValue();
                        float fMin = Math.min(fFloatValue, fQ1) + fFloatValue;
                        if (fMin <= 1.0f) {
                            rq1.b(l80Var, fMin, 1.0f, j2, fIntBitsToFloat, i7);
                        }
                        rq1.b(l80Var, 0.0f, fFloatValue, j, fIntBitsToFloat, i7);
                        ej0Var.h(l80Var);
                        return ll2.a;
                    }
                };
                ak0Var.g0(obj);
            } else {
                obj = objL3;
                i5 = i4;
                f4 = f3;
            }
            nj2.b(u71VarK, (ej0) obj, ak0Var, 0);
            i3 = i5;
            f2 = f4;
        } else {
            ak0Var.R();
            i3 = i;
            f2 = f;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0(u71Var, j, j2, i3, f2, ej0Var, i2) { // from class: qq1
                public final /* synthetic */ u71 f;
                public final /* synthetic */ long g;
                public final /* synthetic */ long h;
                public final /* synthetic */ int i;
                public final /* synthetic */ float j;
                public final /* synthetic */ ej0 k;

                @Override // defpackage.ij0
                public final Object g(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iP = ei1.P(1572913);
                    rq1.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (ak0) obj3, iP);
                    return ll2.a;
                }
            };
        }
    }

    public static final void b(l80 l80Var, float f, float f2, long j, float f3, int i) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (l80Var.d() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (l80Var.d() & 4294967295L));
        float f4 = fIntBitsToFloat2 / 2.0f;
        boolean z = l80Var.getLayoutDirection() == kw0.e;
        float f5 = (z ? f : 1.0f - f2) * fIntBitsToFloat;
        float f6 = (z ? f2 : 1.0f - f) * fIntBitsToFloat;
        if (i == 0 || fIntBitsToFloat2 > fIntBitsToFloat) {
            l80.L(l80Var, j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, 0, 496);
            return;
        }
        float f7 = f3 / 2.0f;
        float f8 = fIntBitsToFloat - f7;
        if (f5 < f7) {
            f5 = f7;
        }
        if (f5 > f8) {
            f5 = f8;
        }
        if (f6 < f7) {
            f6 = f7;
        }
        if (f6 <= f8) {
            f8 = f6;
        }
        if (Math.abs(f2 - f) > 0.0f) {
            l80.L(l80Var, j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, i, 480);
        }
    }
}
