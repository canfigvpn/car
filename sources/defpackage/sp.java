package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sp {
    public static final kj1 a;

    static {
        p61.k(2);
        a = p61.k(2);
        p61.k(2);
    }

    public static final void a(final gt gtVar, final vf2 vf2Var, final long j, final long j2, final long j3, final float f, final gj1 gj1Var, ak0 ak0Var, final int i) {
        ak0Var.X(-2070754602);
        int i2 = i | (ak0Var.h(gtVar) ? 4 : 2) | (ak0Var.f(vf2Var) ? 32 : 16) | (ak0Var.e(j) ? 256 : 128) | (ak0Var.h(null) ? 2048 : 1024) | (ak0Var.h(null) ? 16384 : 8192) | (ak0Var.h(null) ? 131072 : 65536) | (ak0Var.e(j2) ? 1048576 : 524288) | (ak0Var.e(j3) ? 8388608 : 4194304) | (ak0Var.c(f) ? 67108864 : 33554432) | (ak0Var.f(gj1Var) ? 536870912 : 268435456);
        if (ak0Var.O(i2 & 1, (306783379 & i2) != 306783378)) {
            sv.b(new vq1[]{yw.a.a(new dr(j)), ef2.a.a(vf2Var)}, vs0.C(-668234218, new qp(f, gj1Var, j2, gtVar, j3), ak0Var), ak0Var, 56);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0(vf2Var, j, j2, j3, f, gj1Var, i) { // from class: pp
                public final /* synthetic */ vf2 f;
                public final /* synthetic */ long g;
                public final /* synthetic */ long h;
                public final /* synthetic */ long i;
                public final /* synthetic */ float j;
                public final /* synthetic */ gj1 k;

                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(1);
                    sp.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (ak0) obj, iP);
                    return ll2.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final ti0 ti0Var, final gt gtVar, u71 u71Var, boolean z2, u32 u32Var, nz1 nz1Var, oz1 oz1Var, oj ojVar, ak0 ak0Var, final int i) {
        final u71 u71Var2;
        final boolean z3;
        final u32 u32Var2;
        final nz1 nz1Var2;
        final oz1 oz1Var2;
        final oj ojVarE;
        boolean z4;
        int i2;
        u71 u71Var3;
        ak0Var.X(-1385473344);
        int i3 = i | (ak0Var.g(z) ? 4 : 2) | (ak0Var.h(ti0Var) ? 32 : 16) | 307981312;
        if (ak0Var.O(i3 & 1, (306783379 & i3) != 306783378)) {
            ak0Var.T();
            if ((i & 1) == 0 || ak0Var.y()) {
                u32 u32VarA = j42.a(s5.l, ak0Var);
                jr jrVar = (jr) ak0Var.j(lr.a);
                nz1Var2 = jrVar.Z;
                if (nz1Var2 == null) {
                    long j = dr.f;
                    nz1 nz1Var3 = new nz1(j, lr.d(jrVar, s5.z), lr.d(jrVar, s5.D), lr.d(jrVar, s5.H), j, dr.b(s5.n, lr.d(jrVar, s5.m)), dr.b(s5.B, lr.d(jrVar, s5.A)), dr.b(s5.F, lr.d(jrVar, s5.E)), lr.d(jrVar, s5.t), dr.b(s5.q, lr.d(jrVar, s5.p)), lr.d(jrVar, s5.y), lr.d(jrVar, s5.C), lr.d(jrVar, s5.G));
                    jrVar.Z = nz1Var3;
                    nz1Var2 = nz1Var3;
                }
                oz1 oz1Var3 = new oz1(s5.u, s5.o);
                int i4 = i3 & (-2143289345);
                long jE = lr.e(s5.v, ak0Var);
                long j2 = dr.f;
                dr.b(s5.s, lr.e(s5.r, ak0Var));
                float f = s5.w;
                if (z) {
                    jE = j2;
                }
                if (z) {
                    f = 0.0f;
                }
                u32Var2 = u32VarA;
                oz1Var2 = oz1Var3;
                z4 = true;
                ojVarE = sv0.E(f, jE);
                i2 = i4;
                u71Var3 = r71.a;
            } else {
                ak0Var.R();
                z4 = z2;
                u32Var2 = u32Var;
                nz1Var2 = nz1Var;
                oz1Var2 = oz1Var;
                ojVarE = ojVar;
                i2 = i3 & (-2143289345);
                u71Var3 = u71Var;
            }
            ak0Var.q();
            c(z, u71Var3, ti0Var, z4, gtVar, ik2.a(s5.x, ak0Var), u32Var2, nz1Var2, oz1Var2, ojVarE, 32.0f, a, ak0Var, ((i2 << 3) & 896) | (i2 & 14) | 12582960 | 102263808, 224256);
            u71Var2 = u71Var3;
            z3 = z4;
        } else {
            ak0Var.R();
            u71Var2 = u71Var;
            z3 = z2;
            u32Var2 = u32Var;
            nz1Var2 = nz1Var;
            oz1Var2 = oz1Var;
            ojVarE = ojVar;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0(z, ti0Var, gtVar, u71Var2, z3, u32Var2, nz1Var2, oz1Var2, ojVarE, i) { // from class: np
                public final /* synthetic */ boolean e;
                public final /* synthetic */ ti0 f;
                public final /* synthetic */ gt g;
                public final /* synthetic */ u71 h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ u32 j;
                public final /* synthetic */ nz1 k;
                public final /* synthetic */ oz1 l;
                public final /* synthetic */ oj m;

                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(385);
                    sp.b(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (ak0) obj, iP);
                    return ll2.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x022e  */
    public static final void c(final boolean z, final u71 u71Var, final ti0 ti0Var, final boolean z2, final gt gtVar, final vf2 vf2Var, final u32 u32Var, final nz1 nz1Var, final oz1 oz1Var, final oj ojVar, final float f, final gj1 gj1Var, ak0 ak0Var, final int i, final int i2) {
        int i3;
        int i4;
        long j;
        float f2;
        ia iaVar;
        boolean z3;
        ob obVar;
        ak0Var.X(1786844928);
        if ((i & 6) == 0) {
            i3 = (ak0Var.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ak0Var.f(u71Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ak0Var.h(ti0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ak0Var.g(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ak0Var.h(gtVar) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= ak0Var.f(vf2Var) ? 131072 : 65536;
        }
        sx sxVar = null;
        if ((i & 1572864) == 0) {
            i3 |= ak0Var.h(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= ak0Var.h(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= ak0Var.h(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= ak0Var.f(u32Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (ak0Var.f(nz1Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ak0Var.f(oz1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ak0Var.f(ojVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ak0Var.c(f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= ak0Var.f(gj1Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= ak0Var.f(null) ? 131072 : 65536;
        }
        boolean z4 = true;
        if (ak0Var.O(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 74899) == 74898) ? false : true)) {
            ak0Var.W(73215547);
            Object objL = ak0Var.L();
            Object obj = cv.a;
            if (objL == obj) {
                objL = new f91();
                ak0Var.g0(objL);
            }
            f91 f91Var = (f91) objL;
            ak0Var.p(false);
            Object objL2 = ak0Var.L();
            if (objL2 == obj) {
                objL2 = new s1(19);
                ak0Var.g0(objL2);
            }
            u71 u71VarA = l02.a(u71Var, false, (ej0) objL2);
            if (z2) {
                j = !z ? nz1Var.a : nz1Var.i;
            } else {
                j = z ? nz1Var.j : nz1Var.e;
            }
            long j2 = j;
            if (oz1Var == null) {
                ak0Var.W(73531126);
                ak0Var.p(false);
                f91Var = f91Var;
                i3 = i3;
                obVar = null;
            } else {
                ak0Var.W(-828912021);
                int i5 = ((i4 << 3) & 896) | ((i3 >> 9) & 14);
                Object objL3 = ak0Var.L();
                if (objL3 == obj) {
                    objL3 = new h72();
                    ak0Var.g0(objL3);
                }
                h72 h72Var = (h72) objL3;
                Object objL4 = ak0Var.L();
                if (objL4 == obj) {
                    objL4 = y12.s(null);
                    ak0Var.g0(objL4);
                }
                da1 da1Var = (da1) objL4;
                boolean zF = ak0Var.f(f91Var);
                Object objL5 = ak0Var.L();
                if (zF || objL5 == obj) {
                    objL5 = new jl(f91Var, h72Var, sxVar, 2);
                    ak0Var.g0(objL5);
                }
                s5.o((ij0) objL5, ak0Var, f91Var);
                tr0 tr0Var = (tr0) vq.X(h72Var);
                if (!z2 || (tr0Var instanceof rp1)) {
                    f2 = 0.0f;
                } else if (tr0Var instanceof wn0) {
                    f2 = oz1Var.a;
                } else if (!(tr0Var instanceof nf0) && (tr0Var instanceof b80)) {
                    f2 = oz1Var.b;
                } else {
                    f2 = 0.0f;
                }
                Object objL6 = ak0Var.L();
                if (objL6 == obj) {
                    objL6 = new ia(new w60(f2), ir2.X, null, 12);
                    ak0Var.g0(objL6);
                }
                ia iaVar2 = (ia) objL6;
                w60 w60Var = new w60(f2);
                boolean zH = ak0Var.h(iaVar2) | ak0Var.c(f2);
                if ((((i5 & 14) ^ 6) <= 4 || !ak0Var.g(z2)) && (i5 & 6) != 4) {
                    z4 = false;
                }
                boolean zH2 = zH | z4 | ak0Var.h(tr0Var);
                Object objL7 = ak0Var.L();
                if (zH2 || objL7 == obj) {
                    float f3 = f2;
                    iaVar = iaVar2;
                    z3 = false;
                    Object klVar = new kl(iaVar, f3, z2, tr0Var, da1Var, null);
                    ak0Var.g0(klVar);
                    objL7 = klVar;
                } else {
                    iaVar = iaVar2;
                    z3 = false;
                }
                s5.o((ij0) objL7, ak0Var, w60Var);
                obVar = iaVar.c;
                ak0Var.p(z3);
            }
            int i6 = i3;
            ra2.b(z, ti0Var, u71VarA, z2, u32Var, j2, 0L, obVar != null ? ((w60) obVar.f.getValue()).e : 0.0f, ojVar, f91Var, vs0.C(-990050154, new rp(nz1Var, z2, z, gtVar, vf2Var, f, gj1Var), ak0Var), ak0Var, (i6 & 14) | ((i6 >> 3) & 112) | (i6 & 7168) | ((i6 >> 15) & 57344) | ((i4 << 21) & 1879048192), 192);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: op
                @Override // defpackage.ij0
                public final Object g(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = ei1.P(i | 1);
                    int iP2 = ei1.P(i2);
                    sp.c(z, u71Var, ti0Var, z2, gtVar, vf2Var, u32Var, nz1Var, oz1Var, ojVar, f, gj1Var, (ak0) obj2, iP, iP2);
                    return ll2.a;
                }
            };
        }
    }
}
