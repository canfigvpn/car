package defpackage;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vc0 {
    public final /* synthetic */ xf0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ da1 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ l72 g;
    public final /* synthetic */ da1 h;
    public final /* synthetic */ ej0 i;
    public final /* synthetic */ ak1 j;
    public final /* synthetic */ ak1 k;

    public vc0(xf0 xf0Var, boolean z, da1 da1Var, String str, String str2, String str3, l72 l72Var, da1 da1Var2, ej0 ej0Var, ak1 ak1Var, ak1 ak1Var2) {
        this.a = xf0Var;
        this.b = z;
        this.c = da1Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = l72Var;
        this.h = da1Var2;
        this.i = ej0Var;
        this.j = ak1Var;
        this.k = ak1Var2;
    }

    public static u71 b(vc0 vc0Var, u71 u71Var) {
        u71 u71VarT = ws0.t(u71Var, vc0Var.a);
        da1 da1Var = vc0Var.h;
        u71 u71VarC = u71VarT.c(new lc0(new r9(da1Var, 9)));
        boolean z = vc0Var.b;
        tc0 tc0Var = new tc0(da1Var, vc0Var.i, z);
        da1 da1Var2 = vc0Var.c;
        String str = vc0Var.d;
        String str2 = vc0Var.e;
        String str3 = vc0Var.f;
        l72 l72Var = vc0Var.g;
        return u71VarC.c(l02.a(s5.J(ya2.a(r71.a, tc0Var, new u6(2, tc0Var)), new qi(tc0Var, z, da1Var2)), false, new d(z, str, str2, str3, tc0Var, l72Var)));
    }

    public final void a(final boolean z, final ti0 ti0Var, u71 u71Var, zx1 zx1Var, boolean z2, u32 u32Var, long j, float f, final gt gtVar, ak0 ak0Var, final int i, final int i2) {
        int i3;
        final u71 u71Var2;
        final zx1 zx1Var2;
        final boolean z3;
        final u32 u32Var2;
        final long j2;
        final float f2;
        u71 u71Var3;
        boolean z4;
        zx1 zx1Var3;
        u71 u71Var4;
        boolean z5;
        ak0Var.X(-126848451);
        int i4 = i | (ak0Var.g(z) ? 4 : 2) | 919168384;
        if ((i2 & 6) == 0) {
            i3 = i2 | (ak0Var.h(gtVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ak0Var.f(this) ? 32 : 16;
        }
        if (ak0Var.O(i4 & 1, ((306783379 & i4) == 306783378 && (i3 & 19) == 18) ? false : true)) {
            ak0Var.T();
            if ((i & 1) == 0 || ak0Var.y()) {
                zx1 zx1VarE = nj2.E(ak0Var);
                float f3 = c71.a;
                u32 u32VarA = j42.a(p61.A, ak0Var);
                long jE = lr.e(p61.y, ak0Var);
                float f4 = c71.a;
                u32Var2 = u32VarA;
                u71Var3 = r71.a;
                j2 = jE;
                z4 = true;
                f2 = f4;
                zx1Var3 = zx1VarE;
            } else {
                ak0Var.R();
                u71Var3 = u71Var;
                zx1Var3 = zx1Var;
                z4 = z2;
                u32Var2 = u32Var;
                j2 = j;
                f2 = f;
            }
            ak0Var.q();
            Object objL = ak0Var.L();
            Object obj = cv.a;
            if (objL == obj) {
                Object dk1Var = new dk1(ll2.a, q90.U);
                ak0Var.g0(dk1Var);
                objL = dk1Var;
            }
            da1 da1Var = (da1) objL;
            m40 m40Var = (m40) ak0Var.j(yv.h);
            WeakHashMap weakHashMap = fq2.v;
            int i5 = p12.b(ak0Var).f.e().b;
            if (z) {
                ak0Var.W(629991660);
                Object objL2 = ak0Var.L();
                if (objL2 == obj) {
                    objL2 = new r9(da1Var, 8);
                    ak0Var.g0(objL2);
                }
                ix.c((ti0) objL2, ak0Var, 6);
                ak0Var.p(false);
            } else {
                u71Var3 = u71Var3;
                ak0Var.W(630077189);
                ak0Var.p(false);
            }
            Object objL3 = ak0Var.L();
            if (objL3 == obj) {
                objL3 = new ea1(Boolean.FALSE);
                ak0Var.g0(objL3);
            }
            ea1 ea1Var = (ea1) objL3;
            boolean z6 = z4;
            ea1Var.c.setValue(Boolean.valueOf(z));
            if (((Boolean) ea1Var.b.getValue()).booleanValue() || ((Boolean) ea1Var.c.getValue()).booleanValue()) {
                ak0Var.W(630396489);
                Object objL4 = ak0Var.L();
                if (objL4 == obj) {
                    objL4 = y12.s(new ai2(ai2.b));
                    ak0Var.g0(objL4);
                }
                da1 da1Var2 = (da1) objL4;
                boolean zF = ak0Var.f(m40Var) | ak0Var.d(i5);
                Object objL5 = ak0Var.L();
                if (zF || objL5 == obj) {
                    objL5 = new wc0(m40Var, i5, da1Var, new p7(da1Var2, 3));
                    ak0Var.g0(objL5);
                }
                wc0 wc0Var = (wc0) objL5;
                ((nc0) this.h.getValue()).getClass();
                ((Boolean) this.c.getValue()).getClass();
                u71Var4 = u71Var3;
                z5 = z6;
                s8.a(wc0Var, ti0Var, new yo1(!((Boolean) j20.B(0, 7, ak0Var).getValue()).booleanValue() ? 393248 : 393216, true), vs0.C(2063119149, new pc0(this, u71Var4, z5, ea1Var, da1Var2, zx1Var3, u32Var2, j2, f2, gtVar), ak0Var), ak0Var, 3120, 0);
                ak0Var.p(false);
            } else {
                ak0Var.W(631807237);
                ak0Var.p(false);
                u71Var4 = u71Var3;
                z5 = z6;
            }
            u71Var2 = u71Var4;
            zx1Var2 = zx1Var3;
            z3 = z5;
        } else {
            ak0Var.R();
            u71Var2 = u71Var;
            zx1Var2 = zx1Var;
            z3 = z2;
            u32Var2 = u32Var;
            j2 = j;
            f2 = f;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0(z, ti0Var, u71Var2, zx1Var2, z3, u32Var2, j2, f2, gtVar, i, i2) { // from class: oc0
                public final /* synthetic */ boolean f;
                public final /* synthetic */ ti0 g;
                public final /* synthetic */ u71 h;
                public final /* synthetic */ zx1 i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ u32 k;
                public final /* synthetic */ long l;
                public final /* synthetic */ float m;
                public final /* synthetic */ gt n;
                public final /* synthetic */ int o;

                {
                    this.o = i2;
                }

                @Override // defpackage.ij0
                public final Object g(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = ei1.P(49);
                    int iP2 = ei1.P(this.o);
                    this.e.a(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (ak0) obj2, iP, iP2);
                    return ll2.a;
                }
            };
        }
    }
}
