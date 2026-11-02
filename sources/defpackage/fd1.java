package defpackage;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fd1 {
    public static final float a = ir2.N;
    public static final float b = 8.0f;
    public static final float c = 4.0f;
    public static final float d = 16.0f;
    public static final float e = 4.0f;
    public static final float f = 12.0f;
    public static final float g = 44.0f;
    public static final a90 h = new a90(0, new vr0(18));

    public static final void a(u71 u71Var, long j, long j2, uo2 uo2Var, final gt gtVar, ak0 ak0Var, final int i) {
        final u71 u71Var2;
        final long j3;
        final long j4;
        final uo2 uo2Var2;
        long j5;
        u71 u71Var3;
        long j6;
        uo2 uo2Var3;
        ak0Var.X(1054099326);
        int i2 = i | 11414;
        if (ak0Var.O(i2 & 1, (74899 & i2) != 74898)) {
            ak0Var.T();
            if ((i & 1) == 0 || ak0Var.y()) {
                long jE = lr.e(ir2.G, ak0Var);
                long jA = lr.a((jr) ak0Var.j(lr.a), jE);
                WeakHashMap weakHashMap = fq2.v;
                h21 h21Var = new h21(new kl2(p12.b(ak0Var).g, p12.b(ak0Var).b), 15 | 32);
                j5 = jE;
                u71Var3 = r71.a;
                j6 = jA;
                uo2Var3 = h21Var;
            } else {
                ak0Var.R();
                u71Var3 = u71Var;
                j5 = j;
                j6 = j2;
                uo2Var3 = uo2Var;
            }
            ak0Var.q();
            ((i30) ak0Var.j(h)).a(new gd1(u71Var3, j5, j6, uo2Var3, gtVar), ak0Var, 0);
            u71Var2 = u71Var3;
            j3 = j5;
            j4 = j6;
            uo2Var2 = uo2Var3;
        } else {
            ak0Var.R();
            u71Var2 = u71Var;
            j3 = j;
            j4 = j2;
            uo2Var2 = uo2Var;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0(j3, j4, uo2Var2, gtVar, i) { // from class: zc1
                public final /* synthetic */ long f;
                public final /* synthetic */ long g;
                public final /* synthetic */ uo2 h;
                public final /* synthetic */ gt i;

                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(196609);
                    fd1.a(this.e, this.f, this.g, this.h, this.i, (ak0) obj, iP);
                    return ll2.a;
                }
            };
        }
    }

    public static final void b(final tv1 tv1Var, final boolean z, final ti0 ti0Var, final gt gtVar, u71 u71Var, boolean z2, final ij0 ij0Var, boolean z3, yc1 yc1Var, ak0 ak0Var, final int i) {
        int i2;
        final u71 u71Var2;
        final boolean z4;
        final boolean z5;
        final yc1 yc1Var2;
        yc1 yc1Var3;
        int i3;
        u71 u71Var3;
        yc1 yc1Var4;
        boolean z6;
        boolean z7;
        gt gtVarC;
        boolean z8;
        ak0Var.X(974293026);
        if ((i & 6) == 0) {
            i2 = (ak0Var.f(tv1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ak0Var.h(ti0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ak0Var.h(gtVar) ? 2048 : 1024;
        }
        int i4 = i2 | 221184;
        if ((1572864 & i) == 0) {
            i4 |= ak0Var.h(ij0Var) ? 1048576 : 524288;
        }
        int i5 = 12582912 | i4;
        if ((100663296 & i) == 0) {
            i5 = 46137344 | i4;
        }
        int i6 = 805306368 | i5;
        if (ak0Var.O(i6 & 1, (306783379 & i6) != 306783378)) {
            ak0Var.T();
            if ((i & 1) == 0 || ak0Var.y()) {
                jr jrVar = (jr) ak0Var.j(lr.a);
                yc1 yc1Var5 = jrVar.e0;
                if (yc1Var5 == null) {
                    long jD = lr.d(jrVar, ir2.H);
                    long jD2 = lr.d(jrVar, ir2.K);
                    long jD3 = lr.d(jrVar, ir2.I);
                    kr krVar = ir2.L;
                    long jD4 = lr.d(jrVar, krVar);
                    kr krVar2 = ir2.M;
                    yc1Var3 = new yc1(jD, jD2, jD3, jD4, lr.d(jrVar, krVar2), dr.b(0.38f, lr.d(jrVar, krVar)), dr.b(0.38f, lr.d(jrVar, krVar2)));
                    jrVar.e0 = yc1Var3;
                } else {
                    yc1Var3 = yc1Var5;
                }
                i3 = i6 & (-234881025);
                u71Var3 = r71.a;
                yc1Var4 = yc1Var3;
                z6 = true;
                z7 = true;
            } else {
                ak0Var.R();
                i3 = i6 & (-234881025);
                u71Var3 = u71Var;
                z6 = z2;
                z7 = z3;
                yc1Var4 = yc1Var;
            }
            int i7 = i3;
            ak0Var.q();
            ak0Var.W(-224963495);
            Object objL = ak0Var.L();
            Object obj = cv.a;
            if (objL == obj) {
                objL = new f91();
                ak0Var.g0(objL);
            }
            f91 f91Var = (f91) objL;
            ak0Var.p(false);
            h81 h81Var = h81.g;
            boolean z9 = z7;
            g82 g82VarQ = rw.Q(h81Var, ak0Var);
            gt gtVarC2 = vs0.C(-876637252, new dd1(yc1Var4, z, z6, g82VarQ, ij0Var, z9, gtVar), ak0Var);
            if (ij0Var == null) {
                ak0Var.W(-224036658);
                ak0Var.p(false);
                gtVarC = null;
            } else {
                ak0Var.W(-224036657);
                gtVarC = vs0.C(802208206, new oi1(yc1Var4, z, z6, g82VarQ, ij0Var), ak0Var);
                ak0Var.p(false);
            }
            gt gtVar2 = gtVarC;
            Object objL2 = ak0Var.L();
            if (objL2 == obj) {
                objL2 = new ak1(0);
                ak0Var.g0(objL2);
            }
            ak1 ak1Var = (ak1) objL2;
            boolean z10 = z6;
            yc1 yc1Var6 = yc1Var4;
            u71 u71VarA = tv1Var.a(f52.b(s5.O(u71Var3, z, f91Var, null, z10, new wu1(4), ti0Var), 0.0f, a, 1), 1.0f);
            Object objL3 = ak0Var.L();
            if (objL3 == obj) {
                objL3 = new m(23, ak1Var);
                ak0Var.g0(objL3);
            }
            u71 u71VarZ = vs0.z(u71VarA, (ej0) objL3);
            w61 w61VarC = xj.c(q90.j, true);
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71VarZ);
            wu.c.getClass();
            ti0 ti0Var2 = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(ti0Var2);
            } else {
                ak0Var.j0();
            }
            p12.l(vu.f, ak0Var, w61VarC);
            p12.l(vu.e, ak0Var, sl1VarL);
            ra raVar = vu.g;
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX))) {
                k3.p(iX, ak0Var, iX, raVar);
            }
            p12.l(vu.d, ak0Var, u71VarB);
            p82 p82VarB = ka.b(z ? 1.0f : 0.0f, rw.Q(h81Var, ak0Var), ak0Var);
            p82 p82VarB2 = ka.b(z ? 1.0f : 0.0f, rw.Q(h81.f, ak0Var), ak0Var);
            m40 m40Var = (m40) ak0Var.j(yv.h);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((ak1Var.h() - m40Var.O(56.0f)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(m40Var.x(f))) & 4294967295L);
            boolean zF = ak0Var.f(f91Var) | ak0Var.e(jFloatToRawIntBits);
            Object objL4 = ak0Var.L();
            if (zF || objL4 == obj) {
                objL4 = new g61(f91Var, jFloatToRawIntBits);
                ak0Var.g0(objL4);
            }
            gt gtVarC3 = vs0.C(-2082182507, new h30(6, (g61) objL4), ak0Var);
            gt gtVarC4 = vs0.C(-799524251, new ji(8, p82VarB, yc1Var6), ak0Var);
            boolean zF2 = ak0Var.f(p82VarB);
            Object objL5 = ak0Var.L();
            if (zF2 || objL5 == obj) {
                z8 = true;
                objL5 = new nc1(p82VarB, 1);
                ak0Var.g0(objL5);
            } else {
                z8 = true;
            }
            ti0 ti0Var3 = (ti0) objL5;
            boolean zF3 = ak0Var.f(p82VarB2);
            Object objL6 = ak0Var.L();
            if (zF3 || objL6 == obj) {
                objL6 = new nc1(p82VarB2, 2);
                ak0Var.g0(objL6);
            }
            boolean z11 = z8;
            c(gtVarC3, gtVarC4, gtVarC2, gtVar2, z9, ti0Var3, (ti0) objL6, ak0Var, ((i7 >> 9) & 57344) | 438);
            z5 = z9;
            ak0Var.p(z11);
            yc1Var2 = yc1Var6;
            z4 = z10;
            u71Var2 = u71Var3;
        } else {
            ak0Var.R();
            u71Var2 = u71Var;
            z4 = z2;
            z5 = z3;
            yc1Var2 = yc1Var;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: ad1
                @Override // defpackage.ij0
                public final Object g(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    fd1.b(tv1Var, z, ti0Var, gtVar, u71Var2, z4, ij0Var, z5, yc1Var2, (ak0) obj2, ei1.P(i | 1));
                    return ll2.a;
                }
            };
        }
    }

    public static final void c(gt gtVar, gt gtVar2, gt gtVar3, ij0 ij0Var, boolean z, ti0 ti0Var, ti0 ti0Var2, ak0 ak0Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        ij0 ij0Var2 = ij0Var;
        ak0Var.X(-1019541078);
        if ((i & 6) == 0) {
            i2 = (ak0Var.h(gtVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.h(gtVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ak0Var.h(gtVar3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ak0Var.h(ij0Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ak0Var.g(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ak0Var.h(ti0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ak0Var.h(ti0Var2) ? 1048576 : 524288;
        }
        if (ak0Var.O(i2 & 1, (599187 & i2) != 599186)) {
            qt qtVar = new qt(5);
            r71 r71Var = r71.a;
            u71 u71VarK0 = sv0.k0(r71Var, qtVar);
            int i3 = 57344 & i2;
            boolean z4 = ((i2 & 7168) == 2048) | ((i2 & 3670016) == 1048576) | (i3 == 16384);
            Object objL = ak0Var.L();
            is1 is1Var = cv.a;
            if (z4 || objL == is1Var) {
                objL = new ed1(ti0Var2, ij0Var2, z);
                ak0Var.g0(objL);
            }
            w61 w61Var = (w61) objL;
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71VarK0);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var.Z();
            int i4 = i2;
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            ra raVar = vu.f;
            p12.l(raVar, ak0Var, w61Var);
            ra raVar2 = vu.e;
            p12.l(raVar2, ak0Var, sl1VarL);
            ra raVar3 = vu.g;
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX))) {
                k3.p(iX, ak0Var, iX, raVar3);
            }
            ra raVar4 = vu.d;
            p12.l(raVar4, ak0Var, u71VarB);
            gtVar.g(ak0Var, Integer.valueOf(i4 & 14));
            gtVar2.g(ak0Var, Integer.valueOf((i4 >> 3) & 14));
            u71 u71VarS = vs0.s(r71Var, "icon");
            wi wiVar = q90.f;
            w61 w61VarC = xj.c(wiVar, false);
            int iX2 = ws0.x(ak0Var);
            sl1 sl1VarL2 = ak0Var.l();
            u71 u71VarB2 = nj2.B(ak0Var, u71VarS);
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(raVar, ak0Var, w61VarC);
            p12.l(raVar2, ak0Var, sl1VarL2);
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX2))) {
                k3.p(iX2, ak0Var, iX2, raVar3);
            }
            p12.l(raVar4, ak0Var, u71VarB2);
            k3.o((i4 >> 6) & 14, gtVar3, ak0Var, true);
            if (ij0Var != null) {
                ak0Var.W(-660471321);
                u71 u71VarS2 = vs0.s(r71Var, "label");
                boolean z5 = (i3 == 16384) | ((i4 & 458752) == 131072);
                Object objL2 = ak0Var.L();
                if (z5 || objL2 == is1Var) {
                    z2 = z;
                    objL2 = new dg(z2, ti0Var);
                    ak0Var.g0(objL2);
                } else {
                    z2 = z;
                }
                u71 u71VarT = nj2.t(u71VarS2, (ej0) objL2);
                w61 w61VarC2 = xj.c(wiVar, false);
                int iX3 = ws0.x(ak0Var);
                sl1 sl1VarL3 = ak0Var.l();
                u71 u71VarB3 = nj2.B(ak0Var, u71VarT);
                ak0Var.Z();
                if (ak0Var.S) {
                    ak0Var.k(wvVar);
                } else {
                    ak0Var.j0();
                }
                p12.l(raVar, ak0Var, w61VarC2);
                p12.l(raVar2, ak0Var, sl1VarL3);
                if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX3))) {
                    k3.p(iX3, ak0Var, iX3, raVar3);
                }
                p12.l(raVar4, ak0Var, u71VarB3);
                ij0Var2 = ij0Var;
                ij0Var2.g(ak0Var, Integer.valueOf((i4 >> 9) & 14));
                z3 = true;
                ak0Var.p(true);
                ak0Var.p(false);
            } else {
                ij0Var2 = ij0Var;
                z2 = z;
                z3 = true;
                ak0Var.W(-660200319);
                ak0Var.p(false);
            }
            ak0Var.p(z3);
        } else {
            z2 = z;
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new fo(gtVar, gtVar2, gtVar3, ij0Var2, z2, ti0Var, ti0Var2, i);
        }
    }
}
