package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r3 {
    public static final kj1 a = new kj1(24.0f, 24.0f, 24.0f, 24.0f);
    public static final kj1 b;
    public static final kj1 c;
    public static final a90 d;

    static {
        p61.l(0.0f, 0.0f, 0.0f, 16.0f, 7);
        b = p61.l(0.0f, 0.0f, 0.0f, 16.0f, 7);
        c = p61.l(0.0f, 0.0f, 0.0f, 24.0f, 7);
        d = new a90(0, new m2(2));
    }

    public static final void a(final gt gtVar, u71 u71Var, final ij0 ij0Var, final ij0 ij0Var2, final u32 u32Var, final long j, final long j2, final long j3, final long j4, final long j5, ak0 ak0Var, final int i) {
        final u71 u71Var2;
        ak0Var.X(1378716401);
        int i2 = i | 48 | (ak0Var.h(null) ? 256 : 128) | (ak0Var.h(ij0Var) ? 2048 : 1024) | (ak0Var.h(ij0Var2) ? 16384 : 8192) | (ak0Var.f(u32Var) ? 131072 : 65536) | (ak0Var.e(j) ? 1048576 : 524288) | (ak0Var.c(0.0f) ? 8388608 : 4194304) | (ak0Var.e(j2) ? 67108864 : 33554432) | (ak0Var.e(j3) ? 536870912 : 268435456);
        if (ak0Var.O(i2 & 1, ((306783379 & i2) == 306783378 && (((ak0Var.e(j4) ? (char) 4 : (char) 2) | (ak0Var.e(j5) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            gt gtVarC = vs0.C(-652798794, new m3(ij0Var, ij0Var2, j3, j4, j5, j2, gtVar), ak0Var);
            int i3 = i2 >> 12;
            int i4 = (i3 & 896) | (i3 & 112) | 12582918 | ((i2 >> 9) & 57344);
            r71 r71Var = r71.a;
            ra2.a(r71Var, u32Var, j, 0L, 0.0f, gtVarC, ak0Var, i4, 104);
            u71Var2 = r71Var;
        } else {
            ak0Var.R();
            u71Var2 = u71Var;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0(u71Var2, ij0Var, ij0Var2, u32Var, j, j2, j3, j4, j5, i) { // from class: h3
                public final /* synthetic */ u71 f;
                public final /* synthetic */ ij0 g;
                public final /* synthetic */ ij0 h;
                public final /* synthetic */ u32 i;
                public final /* synthetic */ long j;
                public final /* synthetic */ long k;
                public final /* synthetic */ long l;
                public final /* synthetic */ long m;
                public final /* synthetic */ long n;

                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(7);
                    r3.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (ak0) obj, iP);
                    return ll2.a;
                }
            };
        }
    }

    public static final void b(final float f, final float f2, final gt gtVar, ak0 ak0Var, final int i) {
        ak0Var.X(-917637668);
        if (ak0Var.O(i & 1, (i & 147) != 146)) {
            Object objL = ak0Var.L();
            if (objL == cv.a) {
                objL = new o3(f, f2);
                ak0Var.g0(objL);
            }
            w61 w61Var = (w61) objL;
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, r71.a);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(vu.f, ak0Var, w61Var);
            p12.l(vu.e, ak0Var, sl1VarL);
            ra raVar = vu.g;
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX))) {
                k3.p(iX, ak0Var, iX, raVar);
            }
            p12.l(vu.d, ak0Var, u71VarB);
            k3.o(6, gtVar, ak0Var, true);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0(f, f2, gtVar, i) { // from class: j3
                public final /* synthetic */ float e;
                public final /* synthetic */ float f;
                public final /* synthetic */ gt g;

                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(439);
                    r3.b(this.e, this.f, this.g, (ak0) obj, iP);
                    return ll2.a;
                }
            };
        }
    }

    public static final void c(ti0 ti0Var, gt gtVar, u71 u71Var, ij0 ij0Var, ij0 ij0Var2, ij0 ij0Var3, u32 u32Var, long j, long j2, long j3, long j4, i50 i50Var, ak0 ak0Var, int i, int i2) {
        int i3;
        gt gtVar2;
        ij0 ij0Var4;
        int i4;
        ak0Var.X(-867616355);
        if ((i & 6) == 0) {
            i3 = (ak0Var.h(ti0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            gtVar2 = gtVar;
            i3 |= ak0Var.h(gtVar2) ? 32 : 16;
        } else {
            gtVar2 = gtVar;
        }
        if ((i & 384) == 0) {
            i3 |= ak0Var.f(u71Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            ij0Var4 = ij0Var;
            i3 |= ak0Var.h(ij0Var4) ? 2048 : 1024;
        } else {
            ij0Var4 = ij0Var;
        }
        if ((i & 24576) == 0) {
            i3 |= ak0Var.h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= ak0Var.h(ij0Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= ak0Var.h(ij0Var3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= ak0Var.f(u32Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= ak0Var.e(j) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= ak0Var.e(j2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (ak0Var.e(j3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ak0Var.e(j4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ak0Var.c(0.0f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ak0Var.f(i50Var) ? 2048 : 1024;
        }
        int i5 = i4;
        if (ak0Var.O(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            d(ti0Var, u71Var, i50Var, vs0.C(527420759, new q3(ij0Var2, ij0Var3, u32Var, j, j2, j3, j4, ij0Var4, gtVar2), ak0Var), ak0Var, (i3 & 14) | 3072 | ((i3 >> 3) & 112) | ((i5 >> 3) & 896));
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new g3(ti0Var, gtVar, u71Var, ij0Var, ij0Var2, ij0Var3, u32Var, j, j2, j3, j4, i50Var, i, i2, 0);
        }
    }

    public static final void d(ti0 ti0Var, u71 u71Var, i50 i50Var, gt gtVar, ak0 ak0Var, int i) {
        int i2;
        ak0Var.X(24925658);
        if ((i & 6) == 0) {
            i2 = (ak0Var.h(ti0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.f(u71Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ak0Var.f(i50Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ak0Var.h(gtVar) ? 2048 : 1024;
        }
        if (ak0Var.O(i2 & 1, (i2 & 1171) != 1170)) {
            p20 p20Var = (p20) ak0Var.j(d);
            e4 e4Var = new e4();
            e4Var.e = ti0Var;
            e4Var.f = u71Var;
            e4Var.g = i50Var;
            e4Var.h = gtVar;
            p20Var.a(e4Var, ak0Var, 0);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new i3(ti0Var, u71Var, i50Var, gtVar, i, 0);
        }
    }
}
