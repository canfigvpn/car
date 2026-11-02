package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t7 {
    public static final yo1 a = new yo1(true);

    public static final void a(final boolean z, final ti0 ti0Var, u71 u71Var, long j, zx1 zx1Var, yo1 yo1Var, u32 u32Var, long j2, float f, final gt gtVar, ak0 ak0Var, final int i) {
        final u71 u71Var2;
        final long j3;
        final zx1 zx1Var2;
        final yo1 yo1Var2;
        final u32 u32Var2;
        final long j4;
        final float f2;
        long jFloatToRawIntBits;
        yo1 yo1Var3;
        zx1 zx1Var3;
        u32 u32Var3;
        long j5;
        float f3;
        u71 u71Var3;
        ak0Var.X(1725609375);
        int i2 = i | (ak0Var.g(z) ? 4 : 2) | 910896512;
        int i3 = 0;
        if (ak0Var.O(i2 & 1, (306783379 & i2) != 306783378)) {
            ak0Var.T();
            if ((i & 1) == 0 || ak0Var.y()) {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32);
                zx1 zx1VarE = nj2.E(ak0Var);
                float f4 = c71.a;
                u32 u32VarA = j42.a(p61.A, ak0Var);
                long jE = lr.e(p61.y, ak0Var);
                float f5 = c71.a;
                r71 r71Var = r71.a;
                yo1Var3 = a;
                zx1Var3 = zx1VarE;
                u32Var3 = u32VarA;
                j5 = jE;
                f3 = f5;
                u71Var3 = r71Var;
            } else {
                ak0Var.R();
                u71Var3 = u71Var;
                jFloatToRawIntBits = j;
                zx1Var3 = zx1Var;
                yo1Var3 = yo1Var;
                u32Var3 = u32Var;
                j5 = j2;
                f3 = f;
            }
            ak0Var.q();
            Object objL = ak0Var.L();
            Object obj = cv.a;
            if (objL == obj) {
                objL = new ea1(Boolean.FALSE);
                ak0Var.g0(objL);
            }
            ea1 ea1Var = (ea1) objL;
            ea1Var.c.setValue(Boolean.valueOf(z));
            if (((Boolean) ea1Var.b.getValue()).booleanValue() || ((Boolean) ea1Var.c.getValue()).booleanValue()) {
                ak0Var.W(1165905588);
                Object objL2 = ak0Var.L();
                if (objL2 == obj) {
                    objL2 = y12.s(new ai2(ai2.b));
                    ak0Var.g0(objL2);
                }
                da1 da1Var = (da1) objL2;
                m40 m40Var = (m40) ak0Var.j(yv.h);
                boolean zF = ak0Var.f(m40Var);
                Object objL3 = ak0Var.L();
                if (zF || objL3 == obj) {
                    objL3 = new u80(jFloatToRawIntBits, m40Var, new p7(da1Var, i3));
                    ak0Var.g0(objL3);
                }
                s8.a((u80) objL3, ti0Var, yo1Var3, vs0.C(-917492520, new s7(u71Var3, ea1Var, da1Var, zx1Var3, u32Var3, j5, f3, gtVar), ak0Var), ak0Var, 3504, 0);
                ak0Var.p(false);
            } else {
                ak0Var.W(1166965571);
                ak0Var.p(false);
            }
            j3 = jFloatToRawIntBits;
            yo1Var2 = yo1Var3;
            u71Var2 = u71Var3;
            zx1Var2 = zx1Var3;
            u32Var2 = u32Var3;
            j4 = j5;
            f2 = f3;
        } else {
            ak0Var.R();
            u71Var2 = u71Var;
            j3 = j;
            zx1Var2 = zx1Var;
            yo1Var2 = yo1Var;
            u32Var2 = u32Var;
            j4 = j2;
            f2 = f;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0(z, ti0Var, u71Var2, j3, zx1Var2, yo1Var2, u32Var2, j4, f2, gtVar, i) { // from class: q7
                public final /* synthetic */ boolean e;
                public final /* synthetic */ ti0 f;
                public final /* synthetic */ u71 g;
                public final /* synthetic */ long h;
                public final /* synthetic */ zx1 i;
                public final /* synthetic */ yo1 j;
                public final /* synthetic */ u32 k;
                public final /* synthetic */ long l;
                public final /* synthetic */ float m;
                public final /* synthetic */ gt n;

                @Override // defpackage.ij0
                public final Object g(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = ei1.P(49);
                    t7.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (ak0) obj2, iP);
                    return ll2.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0075  */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public static final void b(gt gtVar, ti0 ti0Var, u71 u71Var, ij0 ij0Var, boolean z, d71 d71Var, gj1 gj1Var, ak0 ak0Var, int i, int i2) {
        int i3;
        ij0 ij0Var2;
        int i4;
        boolean z2;
        u71 u71Var2;
        boolean z3;
        d71 d71Var2;
        gj1 gj1Var2;
        ij0 ij0Var3;
        lr1 lr1VarR;
        jr jrVar;
        d71 d71Var3;
        d71 d71Var4;
        gj1 gj1Var3;
        d71 d71Var5;
        ij0 ij0Var4;
        int i5;
        u71 u71Var3;
        boolean z4;
        ak0Var.X(-532959117);
        if ((i & 48) == 0) {
            i3 = (ak0Var.h(ti0Var) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i6 = i3 | 384;
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                ij0Var2 = ij0Var;
                i6 |= ak0Var.h(ij0Var2) ? 2048 : 1024;
            }
            i4 = i6 | 113991680;
            if ((38347923 & i4) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ak0Var.O(i4 & 1, z2)) {
                ak0Var.T();
                if ((i & 1) != 0 || ak0Var.y()) {
                    if (i7 != 0) {
                        ij0Var2 = null;
                    }
                    float f = c71.a;
                    jrVar = (jr) ak0Var.j(lr.a);
                    d71Var3 = jrVar.d0;
                    if (d71Var3 == null) {
                        d71Var4 = new d71(lr.d(jrVar, j20.F), lr.d(jrVar, j20.G), lr.d(jrVar, j20.I), dr.b(j20.A, lr.d(jrVar, j20.z)), dr.b(j20.C, lr.d(jrVar, j20.B)), dr.b(j20.E, lr.d(jrVar, j20.D)));
                        jrVar.d0 = d71Var4;
                    } else {
                        d71Var4 = d71Var3;
                    }
                    gj1Var3 = c71.b;
                    d71Var5 = d71Var4;
                    ij0Var4 = ij0Var2;
                    i5 = i4 & (-3670017);
                    u71Var3 = r71.a;
                    z4 = true;
                } else {
                    ak0Var.R();
                    z4 = z;
                    d71Var5 = d71Var;
                    gj1Var3 = gj1Var;
                    ij0Var4 = ij0Var2;
                    i5 = i4 & (-3670017);
                    u71Var3 = u71Var;
                }
                ak0Var.q();
                sv0.H(gtVar, ti0Var, u71Var3, ij0Var4, z4, d71Var5, gj1Var3, ak0Var, 268435454 & i5);
                gj1Var2 = gj1Var3;
                d71Var2 = d71Var5;
                z3 = z4;
                ij0Var3 = ij0Var4;
                u71Var2 = u71Var3;
            } else {
                ak0Var.R();
                u71Var2 = u71Var;
                z3 = z;
                d71Var2 = d71Var;
                gj1Var2 = gj1Var;
                ij0Var3 = ij0Var2;
            }
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new r7(gtVar, ti0Var, u71Var2, ij0Var3, z3, d71Var2, gj1Var2, i, i2);
            }
        }
        i6 = i3 | 3456;
        ij0Var2 = ij0Var;
        i4 = i6 | 113991680;
        if ((38347923 & i4) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (ak0Var.O(i4 & 1, z2)) {
            ak0Var.T();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    ij0Var2 = null;
                }
                float f2 = c71.a;
                jrVar = (jr) ak0Var.j(lr.a);
                d71Var3 = jrVar.d0;
                if (d71Var3 == null) {
                    d71Var4 = new d71(lr.d(jrVar, j20.F), lr.d(jrVar, j20.G), lr.d(jrVar, j20.I), dr.b(j20.A, lr.d(jrVar, j20.z)), dr.b(j20.C, lr.d(jrVar, j20.B)), dr.b(j20.E, lr.d(jrVar, j20.D)));
                    jrVar.d0 = d71Var4;
                } else {
                    d71Var4 = d71Var3;
                }
                gj1Var3 = c71.b;
                d71Var5 = d71Var4;
                ij0Var4 = ij0Var2;
                i5 = i4 & (-3670017);
                u71Var3 = r71.a;
                z4 = true;
            } else {
                if (i7 != 0) {
                    ij0Var2 = null;
                }
                float f3 = c71.a;
                jrVar = (jr) ak0Var.j(lr.a);
                d71Var3 = jrVar.d0;
                if (d71Var3 == null) {
                    d71Var4 = new d71(lr.d(jrVar, j20.F), lr.d(jrVar, j20.G), lr.d(jrVar, j20.I), dr.b(j20.A, lr.d(jrVar, j20.z)), dr.b(j20.C, lr.d(jrVar, j20.B)), dr.b(j20.E, lr.d(jrVar, j20.D)));
                    jrVar.d0 = d71Var4;
                } else {
                    d71Var4 = d71Var3;
                }
                gj1Var3 = c71.b;
                d71Var5 = d71Var4;
                ij0Var4 = ij0Var2;
                i5 = i4 & (-3670017);
                u71Var3 = r71.a;
                z4 = true;
            }
            ak0Var.q();
            sv0.H(gtVar, ti0Var, u71Var3, ij0Var4, z4, d71Var5, gj1Var3, ak0Var, 268435454 & i5);
            gj1Var2 = gj1Var3;
            d71Var2 = d71Var5;
            z3 = z4;
            ij0Var3 = ij0Var4;
            u71Var2 = u71Var3;
        } else {
            ak0Var.R();
            u71Var2 = u71Var;
            z3 = z;
            d71Var2 = d71Var;
            gj1Var2 = gj1Var;
            ij0Var3 = ij0Var2;
        }
        lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new r7(gtVar, ti0Var, u71Var2, ij0Var3, z3, d71Var2, gj1Var2, i, i2);
        }
    }
}
