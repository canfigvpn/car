package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jh2 {
    public static final kj1 a = new kj1(8.0f, 4.0f, 8.0f, 4.0f);

    public static final void a(final lh2 lh2Var, u71 u71Var, float f, u32 u32Var, long j, long j2, final gt gtVar, ak0 ak0Var, final int i) {
        int i2;
        u71 u71Var2;
        final float f2;
        final u32 u32Var2;
        final long j3;
        final long j4;
        float f3;
        long jE;
        int i3;
        u32 u32Var3;
        long j5;
        ak0Var.X(-343758958);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ak0Var.f(lh2Var) : ak0Var.h(lh2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 3504;
        if ((i & 24576) == 0) {
            i4 = i2 | 11696;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        int i5 = 113246208 | i4;
        if ((805306368 & i) == 0) {
            i5 |= ak0Var.h(gtVar) ? 536870912 : 268435456;
        }
        if (ak0Var.O(i5 & 1, (306783379 & i5) != 306783378)) {
            ak0Var.T();
            if ((i & 1) == 0 || ak0Var.y()) {
                f3 = fh2.a;
                u32 u32VarA = j42.a(nj2.w0, ak0Var);
                long jE2 = lr.e(nj2.x0, ak0Var);
                jE = lr.e(nj2.v0, ak0Var);
                i3 = i5 & (-4186113);
                u32Var3 = u32VarA;
                j5 = jE2;
                u71Var2 = r71.a;
            } else {
                ak0Var.R();
                i3 = i5 & (-4186113);
                u71Var2 = u71Var;
                f3 = f;
                u32Var3 = u32Var;
                j5 = j;
                jE = j2;
            }
            ak0Var.q();
            ak0Var.W(-1719831991);
            ak0Var.p(false);
            int i6 = i3 >> 9;
            ra2.a(u71Var2, u32Var3, jE, 0L, 0.0f, vs0.C(-1573998995, new ih2(f3, j5, gtVar), ak0Var), ak0Var, (57344 & i6) | 12582912 | (i6 & 458752), 72);
            f2 = f3;
            j3 = j5;
            u32Var2 = u32Var3;
            j4 = jE;
        } else {
            ak0Var.R();
            u71Var2 = u71Var;
            f2 = f;
            u32Var2 = u32Var;
            j3 = j;
            j4 = j2;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            final u71 u71Var3 = u71Var2;
            lr1VarR.d = new ij0() { // from class: gh2
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jh2.a(lh2Var, u71Var3, f2, u32Var2, j3, j4, gtVar, (ak0) obj, ei1.P(i | 1));
                    return ll2.a;
                }
            };
        }
    }

    public static final void b(final xo1 xo1Var, final gt gtVar, final mh2 mh2Var, u71 u71Var, boolean z, gt gtVar2, ak0 ak0Var, final int i) {
        gt gtVar3;
        final u71 u71Var2;
        final boolean z2;
        ak0Var.X(-293753984);
        int i2 = i | (ak0Var.f(xo1Var) ? 4 : 2) | (ak0Var.f(mh2Var) ? 256 : 128) | 14380032;
        if (ak0Var.O(i2 & 1, (38347923 & i2) != 38347922)) {
            ki2 ki2VarD = oi2.d(mh2Var.b, "tooltip transition", ak0Var, 48);
            Object objL = ak0Var.L();
            is1 is1Var = cv.a;
            if (objL == is1Var) {
                objL = y12.s(null);
                ak0Var.g0(objL);
            }
            da1 da1Var = (da1) objL;
            Object objL2 = ak0Var.L();
            if (objL2 == is1Var) {
                new r9(da1Var, 29);
                objL2 = new lh2();
                ak0Var.g0(objL2);
            }
            gtVar3 = gtVar2;
            nj2.a(xo1Var, vs0.C(-527401546, new p00(ki2VarD, gtVar, (lh2) objL2), ak0Var), mh2Var, vs0.C(-23901870, new ji(11, da1Var, gtVar3), ak0Var), ak0Var, (i2 & 896) | (i2 & 14) | 100663344 | 14380032);
            u71Var2 = r71.a;
            z2 = true;
        } else {
            gtVar3 = gtVar2;
            ak0Var.R();
            u71Var2 = u71Var;
            z2 = z;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            final gt gtVar4 = gtVar3;
            lr1VarR.d = new ij0(gtVar, mh2Var, u71Var2, z2, gtVar4, i) { // from class: hh2
                public final /* synthetic */ gt f;
                public final /* synthetic */ mh2 g;
                public final /* synthetic */ u71 h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ gt j;

                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(100663345);
                    jh2.b(this.e, this.f, this.g, this.h, this.i, this.j, (ak0) obj, iP);
                    return ll2.a;
                }
            };
        }
    }
}
