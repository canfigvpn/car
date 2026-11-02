package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gb2 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final n62 f;

    static {
        float f2 = p61.W;
        a = f2;
        b = p61.g0;
        c = p61.d0;
        float f3 = p61.a0;
        d = f3;
        e = (f3 - f2) / 2.0f;
        f = new n62();
    }

    public static final void a(final boolean z, final ej0 ej0Var, u71 u71Var, boolean z2, db2 db2Var, ak0 ak0Var, final int i) {
        int i2;
        final u71 u71Var2;
        final boolean z3;
        final db2 db2Var2;
        int i3;
        u71 u71Var3;
        db2 db2Var3;
        boolean z4;
        int i4;
        ak0Var.X(-263339167);
        if ((i & 6) == 0) {
            i2 = i | (ak0Var.g(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.h(ej0Var) ? 32 : 16;
        }
        int i5 = i2 | 28032;
        if ((i & 196608) == 0) {
            i5 = 93568 | i2;
        }
        int i6 = 1572864 | i5;
        if (ak0Var.O(i6 & 1, (599187 & i6) != 599186)) {
            ak0Var.T();
            int i7 = i & 1;
            u71 u71VarO = r71.a;
            if (i7 == 0 || ak0Var.y()) {
                jr jrVar = (jr) ak0Var.j(lr.a);
                db2 db2Var4 = jrVar.h0;
                long j = jrVar.p;
                if (db2Var4 == null) {
                    long jD = lr.d(jrVar, p61.V);
                    long jD2 = lr.d(jrVar, p61.Y);
                    long j2 = dr.f;
                    long jD3 = lr.d(jrVar, p61.X);
                    long jD4 = lr.d(jrVar, p61.f0);
                    long jD5 = lr.d(jrVar, p61.i0);
                    long jD6 = lr.d(jrVar, p61.e0);
                    long jD7 = lr.d(jrVar, p61.h0);
                    long jP = ws0.p(dr.b(p61.I, lr.d(jrVar, p61.H)), j);
                    long jD8 = lr.d(jrVar, p61.L);
                    float f2 = p61.M;
                    db2 db2Var5 = new db2(jD, jD2, j2, jD3, jD4, jD5, jD6, jD7, jP, ws0.p(dr.b(f2, jD8), j), j2, ws0.p(dr.b(p61.K, lr.d(jrVar, p61.J)), j), ws0.p(dr.b(p61.O, lr.d(jrVar, p61.N)), j), ws0.p(dr.b(f2, lr.d(jrVar, p61.R)), j), ws0.p(dr.b(f2, lr.d(jrVar, p61.S)), j), ws0.p(dr.b(p61.Q, lr.d(jrVar, p61.P)), j));
                    jrVar.h0 = db2Var5;
                    db2Var4 = db2Var5;
                }
                i3 = i6 & (-458753);
                u71Var3 = u71VarO;
                db2Var3 = db2Var4;
                z4 = true;
            } else {
                ak0Var.R();
                i3 = i6 & (-458753);
                u71Var3 = u71Var;
                z4 = z2;
                db2Var3 = db2Var;
            }
            ak0Var.q();
            ak0Var.W(1768604058);
            Object objL = ak0Var.L();
            if (objL == cv.a) {
                objL = new f91();
                ak0Var.g0(objL);
            }
            f91 f91Var = (f91) objL;
            ak0Var.p(false);
            if (ej0Var != null) {
                on0 on0Var = yr0.a;
                i4 = 2;
                u71VarO = dv1.O(z, f91Var, z4, new wu1(2), ej0Var);
            } else {
                i4 = 2;
            }
            int i8 = i3 << 3;
            b(f52.g(f52.p(u71Var3.c(u71VarO), i4), c, d), z, z4, db2Var3, f91Var, j42.a(p61.T, ak0Var), ak0Var, ((i3 >> 6) & 896) | (i8 & 112) | (i8 & 57344));
            z3 = z4;
            db2Var2 = db2Var3;
            u71Var2 = u71Var3;
        } else {
            ak0Var.R();
            u71Var2 = u71Var;
            z3 = z2;
            db2Var2 = db2Var;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: eb2
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gb2.a(z, ej0Var, u71Var2, z3, db2Var2, (ak0) obj, ei1.P(i | 1));
                    return ll2.a;
                }
            };
        }
    }

    public static final void b(final u71 u71Var, final boolean z, final boolean z2, final db2 db2Var, final ur0 ur0Var, final u32 u32Var, ak0 ak0Var, final int i) {
        int i2;
        long j;
        long j2;
        long j3;
        long j4;
        ak0Var.X(-670917213);
        if ((i & 6) == 0) {
            i2 = (ak0Var.f(u71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ak0Var.g(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ak0Var.f(db2Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ak0Var.h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ak0Var.f(ur0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ak0Var.f(u32Var) ? 1048576 : 524288;
        }
        if (ak0Var.O(i2 & 1, (599187 & i2) != 599186)) {
            if (z2) {
                j = z ? db2Var.b : db2Var.f;
            } else {
                j = z ? db2Var.j : db2Var.n;
            }
            if (z2) {
                j2 = z ? db2Var.a : db2Var.e;
            } else {
                j2 = z ? db2Var.i : db2Var.m;
            }
            u32 u32VarA = j42.a(p61.c0, ak0Var);
            float f2 = p61.b0;
            if (z2) {
                j3 = j2;
                j4 = z ? db2Var.c : db2Var.g;
            } else {
                j3 = j2;
                j4 = z ? db2Var.k : db2Var.o;
            }
            u71 u71VarS = p61.s(u71Var.c(new nj(f2, new o72(j4), u32VarA)), j, u32VarA);
            w61 w61VarC = xj.c(q90.f, false);
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71VarS);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            ra raVar = vu.f;
            p12.l(raVar, ak0Var, w61VarC);
            ra raVar2 = vu.e;
            p12.l(raVar2, ak0Var, sl1VarL);
            ra raVar3 = vu.g;
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX))) {
                k3.p(iX, ak0Var, iX, raVar3);
            }
            ra raVar4 = vu.d;
            p12.l(raVar4, ak0Var, u71VarB);
            u71 u71VarS2 = p61.s(yo0.a(new vj().c(new rg2(ur0Var, z, rw.Q(h81.f, ak0Var))), ur0Var, tu1.a(false, p61.Z / 2.0f, 4)), j3, u32Var);
            w61 w61VarC2 = xj.c(q90.j, false);
            int iX2 = ws0.x(ak0Var);
            sl1 sl1VarL2 = ak0Var.l();
            u71 u71VarB2 = nj2.B(ak0Var, u71VarS2);
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(raVar, ak0Var, w61VarC2);
            p12.l(raVar2, ak0Var, sl1VarL2);
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX2))) {
                k3.p(iX2, ak0Var, iX2, raVar3);
            }
            p12.l(raVar4, ak0Var, u71VarB2);
            ak0Var.W(1236071411);
            ak0Var.p(false);
            ak0Var.p(true);
            ak0Var.p(true);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: fb2
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gb2.b(u71Var, z, z2, db2Var, ur0Var, u32Var, (ak0) obj, ei1.P(i | 1));
                    return ll2.a;
                }
            };
        }
    }
}
