package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cg2 {
    public static final jr a;
    public static final jr b;

    static {
        long j = fr.a;
        long j2 = fr.b;
        long j3 = fr.c;
        long j4 = fr.d;
        long j5 = fr.e;
        long j6 = fr.f;
        long j7 = fr.g;
        long j8 = fr.h;
        long j9 = fr.i;
        long j10 = fr.j;
        long j11 = fr.k;
        long j12 = fr.l;
        long j13 = fr.m;
        long j14 = fr.n;
        long j15 = fr.o;
        long j16 = fr.p;
        long j17 = fr.q;
        long j18 = fr.r;
        long j19 = fr.s;
        long j20 = fr.t;
        long j21 = fr.u;
        long j22 = fr.v;
        long j23 = fr.w;
        long j24 = fr.x;
        long j25 = fr.y;
        long j26 = fr.z;
        long j27 = fr.A;
        long j28 = fr.B;
        long j29 = fr.C;
        long j30 = fr.D;
        long j31 = fr.E;
        a = lr.f(j, j2, j3, j4, j28, j5, j6, j7, j8, j9, j10, j11, j12, j17, j18, j19, j20, j21, j22, 0L, j26, j27, j13, j14, j15, j16, j23, j24, j25, j30, fr.G, fr.H, fr.I, fr.F, j31, j29, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 524288, 65520);
        long j32 = fr.J;
        long j33 = fr.K;
        long j34 = fr.L;
        long j35 = fr.M;
        long j36 = fr.N;
        long j37 = fr.O;
        long j38 = fr.P;
        long j39 = fr.Q;
        long j40 = fr.R;
        long j41 = fr.S;
        long j42 = fr.T;
        long j43 = fr.U;
        long j44 = fr.V;
        long j45 = fr.W;
        long j46 = fr.X;
        long j47 = fr.Y;
        long j48 = fr.Z;
        long j49 = fr.a0;
        long j50 = fr.b0;
        long j51 = fr.c0;
        long j52 = fr.d0;
        long j53 = fr.e0;
        long j54 = fr.f0;
        long j55 = fr.g0;
        long j56 = fr.h0;
        long j57 = fr.i0;
        long j58 = fr.j0;
        long j59 = fr.k0;
        long j60 = fr.l0;
        long j61 = fr.m0;
        long j62 = fr.n0;
        b = lr.c(j32, j33, j34, j35, j59, j36, j37, j38, j39, j40, j41, j42, j43, j48, j49, j50, j51, j52, j53, 0L, j57, j58, j44, j45, j46, j47, j54, j55, j56, j61, fr.p0, fr.q0, fr.r0, fr.o0, j62, j60, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 524288, 65520);
    }

    public static final void a(final boolean z, final boolean z2, ak0 ak0Var, final int i) {
        int i2;
        jr jrVarF;
        int i3;
        ak0Var.X(989093515);
        int i4 = (ak0Var.g(z) ? 4 : 2) | i | (ak0Var.g(z2) ? 32 : 16);
        if (ak0Var.O(i4 & 1, (i4 & 147) != 146)) {
            ak0Var.T();
            if ((i & 1) != 0 && !ak0Var.y()) {
                ak0Var.R();
            }
            ak0Var.q();
            if (!z2 || (i3 = Build.VERSION.SDK_INT) < 31) {
                i2 = 0;
                if (z) {
                    ak0Var.W(1331110970);
                    ak0Var.p(false);
                    jrVarF = b;
                } else {
                    ak0Var.W(1331111995);
                    ak0Var.p(false);
                    jrVarF = a;
                }
            } else {
                ak0Var.W(-1685405124);
                Context context = (Context) ak0Var.j(u5.b);
                if (z) {
                    if (i3 >= 34) {
                        jrVarF = lr.c(p61.Y(context, R.color.system_primary_dark), p61.Y(context, R.color.system_on_primary_dark), p61.Y(context, R.color.system_primary_container_dark), p61.Y(context, R.color.system_on_primary_container_dark), p61.Y(context, R.color.system_primary_light), p61.Y(context, R.color.system_secondary_dark), p61.Y(context, R.color.system_on_secondary_dark), p61.Y(context, R.color.system_secondary_container_dark), p61.Y(context, R.color.system_on_secondary_container_dark), p61.Y(context, R.color.system_tertiary_dark), p61.Y(context, R.color.system_on_tertiary_dark), p61.Y(context, R.color.system_tertiary_container_dark), p61.Y(context, R.color.system_on_tertiary_container_dark), p61.Y(context, R.color.system_background_dark), p61.Y(context, R.color.system_on_background_dark), p61.Y(context, R.color.system_surface_dark), p61.Y(context, R.color.system_on_surface_dark), p61.Y(context, R.color.system_surface_variant_dark), p61.Y(context, R.color.system_on_surface_variant_dark), p61.Y(context, R.color.system_primary_dark), p61.Y(context, R.color.system_surface_light), p61.Y(context, R.color.system_on_surface_light), 0L, 0L, 0L, 0L, p61.Y(context, R.color.system_outline_dark), p61.Y(context, R.color.system_outline_variant_dark), 0L, p61.Y(context, R.color.system_surface_bright_dark), p61.Y(context, R.color.system_surface_container_dark), p61.Y(context, R.color.system_surface_container_high_dark), p61.Y(context, R.color.system_surface_container_highest_dark), p61.Y(context, R.color.system_surface_container_low_dark), p61.Y(context, R.color.system_surface_container_lowest_dark), p61.Y(context, R.color.system_surface_dim_dark), p61.Y(context, R.color.system_primary_fixed), p61.Y(context, R.color.system_primary_fixed_dim), p61.Y(context, R.color.system_on_primary_fixed), p61.Y(context, R.color.system_on_primary_fixed_variant), p61.Y(context, R.color.system_secondary_fixed), p61.Y(context, R.color.system_secondary_fixed_dim), p61.Y(context, R.color.system_on_secondary_fixed), p61.Y(context, R.color.system_on_secondary_fixed_variant), p61.Y(context, R.color.system_tertiary_fixed), p61.Y(context, R.color.system_tertiary_fixed_dim), p61.Y(context, R.color.system_on_tertiary_fixed), p61.Y(context, R.color.system_on_tertiary_fixed_variant), 331350016, 0);
                    } else {
                        dh2 dh2VarS = ix.s(context);
                        long j = dh2VarS.x;
                        long j2 = dh2VarS.A;
                        long j3 = dh2VarS.z;
                        long j4 = dh2VarS.w;
                        long j5 = dh2VarS.y;
                        long j6 = dh2VarS.E;
                        long j7 = dh2VarS.H;
                        long j8 = dh2VarS.G;
                        long j9 = dh2VarS.D;
                        long j10 = dh2VarS.L;
                        long j11 = dh2VarS.O;
                        long j12 = dh2VarS.N;
                        long j13 = dh2VarS.K;
                        long j14 = dh2VarS.s;
                        long j15 = dh2VarS.g;
                        long j16 = dh2VarS.l;
                        jrVarF = lr.c(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j14, j15, j16, dh2VarS.i, j, j15, dh2VarS.o, 0L, 0L, 0L, 0L, dh2VarS.j, j16, dh2VarS.u, dh2VarS.m, dh2VarS.q, dh2VarS.p, dh2VarS.n, dh2VarS.r, dh2VarS.t, j14, j4, j, dh2VarS.B, j3, j9, j6, dh2VarS.I, j8, j13, j10, dh2VarS.P, j12, 62914560, 0);
                    }
                } else if (i3 >= 34) {
                    jrVarF = lr.f(p61.Y(context, R.color.system_primary_light), p61.Y(context, R.color.system_on_primary_light), p61.Y(context, R.color.system_primary_container_light), p61.Y(context, R.color.system_on_primary_container_light), p61.Y(context, R.color.system_primary_dark), p61.Y(context, R.color.system_secondary_light), p61.Y(context, R.color.system_on_secondary_light), p61.Y(context, R.color.system_secondary_container_light), p61.Y(context, R.color.system_on_secondary_container_light), p61.Y(context, R.color.system_tertiary_light), p61.Y(context, R.color.system_on_tertiary_light), p61.Y(context, R.color.system_tertiary_container_light), p61.Y(context, R.color.system_on_tertiary_container_light), p61.Y(context, R.color.system_background_light), p61.Y(context, R.color.system_on_background_light), p61.Y(context, R.color.system_surface_light), p61.Y(context, R.color.system_on_surface_light), p61.Y(context, R.color.system_surface_variant_light), p61.Y(context, R.color.system_on_surface_variant_light), p61.Y(context, R.color.system_primary_light), p61.Y(context, R.color.system_surface_dark), p61.Y(context, R.color.system_on_surface_dark), 0L, 0L, 0L, 0L, p61.Y(context, R.color.system_outline_light), p61.Y(context, R.color.system_outline_variant_light), 0L, p61.Y(context, R.color.system_surface_bright_light), p61.Y(context, R.color.system_surface_container_light), p61.Y(context, R.color.system_surface_container_high_light), p61.Y(context, R.color.system_surface_container_highest_light), p61.Y(context, R.color.system_surface_container_low_light), p61.Y(context, R.color.system_surface_container_lowest_light), p61.Y(context, R.color.system_surface_dim_light), p61.Y(context, R.color.system_primary_fixed), p61.Y(context, R.color.system_primary_fixed_dim), p61.Y(context, R.color.system_on_primary_fixed), p61.Y(context, R.color.system_on_primary_fixed_variant), p61.Y(context, R.color.system_secondary_fixed), p61.Y(context, R.color.system_secondary_fixed_dim), p61.Y(context, R.color.system_on_secondary_fixed), p61.Y(context, R.color.system_on_secondary_fixed_variant), p61.Y(context, R.color.system_tertiary_fixed), p61.Y(context, R.color.system_tertiary_fixed_dim), p61.Y(context, R.color.system_on_tertiary_fixed), p61.Y(context, R.color.system_on_tertiary_fixed_variant), 331350016, 0);
                } else {
                    dh2 dh2VarS2 = ix.s(context);
                    long j17 = dh2VarS2.y;
                    long j18 = dh2VarS2.v;
                    long j19 = dh2VarS2.w;
                    long j20 = dh2VarS2.B;
                    long j21 = dh2VarS2.x;
                    long j22 = dh2VarS2.F;
                    long j23 = dh2VarS2.C;
                    long j24 = dh2VarS2.D;
                    long j25 = dh2VarS2.I;
                    long j26 = dh2VarS2.M;
                    long j27 = dh2VarS2.J;
                    long j28 = dh2VarS2.K;
                    long j29 = dh2VarS2.P;
                    long j30 = dh2VarS2.b;
                    long j31 = dh2VarS2.r;
                    long j32 = dh2VarS2.g;
                    jrVarF = lr.f(j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j30, j31, j32, dh2VarS2.l, j17, dh2VarS2.o, dh2VarS2.d, 0L, 0L, 0L, 0L, dh2VarS2.k, dh2VarS2.i, dh2VarS2.u, j30, dh2VarS2.e, dh2VarS2.f, j32, dh2VarS2.c, dh2VarS2.a, dh2VarS2.h, j19, j21, j20, dh2VarS2.z, j24, dh2VarS2.E, j25, dh2VarS2.G, j28, dh2VarS2.L, j29, dh2VarS2.N, 62914560, 0);
                }
                i2 = 0;
                ak0Var.p(false);
            }
            og0 og0Var = ws0.j(((Configuration) ak0Var.j(u5.a)).getLocales().get(i2).getLanguage(), "fa") ? oj2.a : oj2.b;
            og0Var.getClass();
            vf2 vf2Var = jk2.d;
            vf2 vf2Var2 = jk2.e;
            vf2 vf2Var3 = jk2.f;
            vf2 vf2Var4 = jk2.g;
            vf2 vf2Var5 = jk2.h;
            vf2 vf2Var6 = jk2.i;
            vf2 vf2Var7 = jk2.m;
            vf2 vf2Var8 = jk2.n;
            vf2 vf2Var9 = jk2.o;
            vf2 vf2Var10 = jk2.a;
            vf2 vf2Var11 = jk2.b;
            vf2 vf2Var12 = jk2.c;
            vf2 vf2Var13 = jk2.j;
            vf2 vf2Var14 = jk2.k;
            vf2 vf2Var15 = jk2.l;
            vf2 vf2VarA = vf2.a(vf2Var, 0L, 0L, null, og0Var, 0L, 0L, null, 16777183);
            vf2 vf2VarA2 = vf2.a(vf2Var2, 0L, 0L, null, og0Var, 0L, 0L, null, 16777183);
            vf2 vf2VarA3 = vf2.a(vf2Var3, 0L, 0L, null, og0Var, 0L, 0L, null, 16777183);
            vf2 vf2VarA4 = vf2.a(vf2Var4, 0L, 0L, null, og0Var, 0L, 0L, null, 16777183);
            vf2 vf2VarA5 = vf2.a(vf2Var5, 0L, 0L, null, og0Var, 0L, 0L, null, 16777183);
            vf2 vf2VarA6 = vf2.a(vf2Var6, 0L, 0L, null, og0Var, 0L, 0L, null, 16777183);
            vf2 vf2VarA7 = vf2.a(vf2Var7, 0L, 0L, null, og0Var, 0L, 0L, null, 16777183);
            vf2 vf2VarA8 = vf2.a(vf2Var8, 0L, 0L, null, og0Var, 0L, 0L, null, 16777183);
            vf2 vf2VarA9 = vf2.a(vf2Var9, 0L, 0L, null, og0Var, 0L, 0L, null, 16777183);
            vf2 vf2VarA10 = vf2.a(vf2Var10, 0L, 0L, null, og0Var, 0L, 0L, null, 16777183);
            vf2 vf2VarA11 = vf2.a(vf2Var11, 0L, 0L, null, og0Var, 0L, 0L, null, 16777183);
            vf2 vf2VarA12 = vf2.a(vf2Var12, 0L, 0L, null, og0Var, 0L, 0L, null, 16777183);
            vf2 vf2VarA13 = vf2.a(vf2Var13, 0L, 0L, null, og0Var, 0L, 0L, null, 16777183);
            vf2 vf2VarA14 = vf2.a(vf2Var14, 0L, 0L, null, og0Var, 0L, 0L, null, 16777183);
            vf2 vf2VarA15 = vf2.a(vf2Var15, 0L, 0L, null, og0Var, 0L, 0L, null, 16777183);
            o61.b(jrVarF, null, new gk2(vf2VarA, vf2VarA2, vf2VarA3, vf2VarA4, vf2VarA5, vf2VarA6, vf2VarA7, vf2VarA8, vf2VarA9, vf2VarA10, vf2VarA11, vf2VarA12, vf2VarA13, vf2VarA14, vf2VarA15, vf2VarA, vf2VarA2, vf2VarA3, vf2VarA4, vf2VarA5, vf2VarA6, vf2VarA7, vf2VarA8, vf2VarA9, vf2VarA10, vf2VarA11, vf2VarA12, vf2VarA13, vf2VarA14, vf2VarA15), ak0Var, 3072);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0(i, z, z2) { // from class: bg2
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;

                {
                    this.e = z;
                    this.f = z2;
                }

                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(385);
                    cg2.a(this.e, this.f, (ak0) obj, iP);
                    return ll2.a;
                }
            };
        }
    }
}
