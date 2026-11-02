package defpackage;

import ir.alirezaivaz.mygarage.R;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j00 {
    public static final kj1 a = p61.l(24.0f, 10.0f, 24.0f, 0.0f, 8);
    public static final float b = 16.0f;

    public static final void a(final Long l, final ej0 ej0Var, final bm bmVar, final lr0 lr0Var, final r00 r00Var, final n00 n00Var, final l00 l00Var, final xf0 xf0Var, ak0 ak0Var, final int i) {
        d00 d00Var;
        int i2;
        ak0Var.X(-432341251);
        int i3 = 2;
        int i4 = i | (ak0Var.f(l) ? 4 : 2) | (ak0Var.h(ej0Var) ? 32 : 16) | (ak0Var.h(bmVar) ? 256 : 128) | (ak0Var.h(lr0Var) ? 2048 : 1024) | (ak0Var.f(r00Var) ? 16384 : 8192) | (ak0Var.f(n00Var) ? 131072 : 65536) | (ak0Var.f(l00Var) ? 1048576 : 524288) | (ak0Var.f(xf0Var) ? 8388608 : 4194304);
        if (ak0Var.O(i4 & 1, (4793491 & i4) != 4793490)) {
            boolean zF = ak0Var.f(bmVar.a);
            Object objL = ak0Var.L();
            is1 is1Var = cv.a;
            if (zF || objL == is1Var) {
                objL = bmVar.c(bmVar.a);
                ak0Var.g0(objL);
            }
            d00 d00Var2 = (d00) objL;
            String strL = r02.l(R.string.m3c_date_input_invalid_for_pattern, ak0Var);
            String strL2 = r02.l(R.string.m3c_date_input_invalid_year_range, ak0Var);
            String strL3 = r02.l(R.string.m3c_date_input_invalid_not_allowed, ak0Var);
            boolean zF2 = ak0Var.f(d00Var2) | ((i4 & 57344) == 16384);
            Object objL2 = ak0Var.L();
            if (zF2 || objL2 == is1Var) {
                d00Var = d00Var2;
                i2 = 0;
                k00 k00Var = new k00(lr0Var, n00Var, d00Var, r00Var, strL, strL2, strL3);
                ak0Var.g0(k00Var);
                objL2 = k00Var;
            } else {
                d00Var = d00Var2;
                i2 = 0;
            }
            k00 k00Var2 = (k00) objL2;
            String upperCase = d00Var.a.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            String strL4 = r02.l(R.string.m3c_date_input_label, ak0Var);
            u71 u71VarB0 = p61.b0(f52.a, a);
            k00Var2.getClass();
            Locale locale = bmVar.a;
            gt gtVarC = vs0.C(-752164549, new ji(i3, strL4, upperCase), ak0Var);
            gt gtVarC2 = vs0.C(-1179434278, new i00(upperCase, i2), ak0Var);
            int i5 = i4 << 3;
            b(u71VarB0, l, ej0Var, bmVar, gtVarC, gtVarC2, k00Var2, d00Var, locale, l00Var, xf0Var, ak0Var, (i5 & 112) | 1794054 | (i5 & 896) | (i5 & 7168), (i4 >> 18) & 126);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0(l, ej0Var, bmVar, lr0Var, r00Var, n00Var, l00Var, xf0Var, i) { // from class: e00
                public final /* synthetic */ Long e;
                public final /* synthetic */ ej0 f;
                public final /* synthetic */ bm g;
                public final /* synthetic */ lr0 h;
                public final /* synthetic */ r00 i;
                public final /* synthetic */ n00 j;
                public final /* synthetic */ l00 k;
                public final /* synthetic */ xf0 l;

                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(1);
                    j00.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (ak0) obj, iP);
                    return ll2.a;
                }
            };
        }
    }

    public static final void b(final u71 u71Var, Long l, final ej0 ej0Var, final bm bmVar, final gt gtVar, final gt gtVar2, final k00 k00Var, final d00 d00Var, final Locale locale, final l00 l00Var, final xf0 xf0Var, ak0 ak0Var, final int i, final int i2) {
        int i3;
        int i4;
        final Long l2;
        ak0 ak0Var2;
        da1 da1Var;
        int i5;
        d00 d00Var2;
        da1 da1Var2;
        boolean z;
        Object ikVar;
        bm bmVar2 = bmVar;
        Locale locale2 = locale;
        ak0Var.X(1456309913);
        if ((i & 6) == 0) {
            i3 = (ak0Var.f(u71Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ak0Var.f(l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ak0Var.h(ej0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ak0Var.h(bmVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ak0Var.h(gtVar) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= ak0Var.h(gtVar2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= ak0Var.d(0) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= ak0Var.f(k00Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= ak0Var.f(d00Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= ak0Var.h(locale2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (ak0Var.f(l00Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ak0Var.f(xf0Var) ? 32 : 16;
        }
        int i6 = i4;
        if (ak0Var.O(i3 & 1, ((306783379 & i3) == 306783378 && (i6 & 19) == 18) ? false : true)) {
            Object[] objArr = new Object[0];
            Object objL = ak0Var.L();
            is1 is1Var = cv.a;
            if (objL == is1Var) {
                objL = new m2(14);
                ak0Var.g0(objL);
            }
            da1 da1Var3 = (da1) ex.J(Arrays.copyOf(objArr, 0), new ru1(4, new vy(12), new xi1(3)), (ti0) objL, ak0Var, 3456, 0);
            Object[] objArr2 = {(te2) da1Var3.getValue()};
            int i7 = i3 & 29360128;
            int i8 = i3 & 234881024;
            int i9 = i3 & 3670016;
            boolean zF = ak0Var.f(da1Var3) | (i7 == 8388608) | ak0Var.h(bmVar2) | (i8 == 67108864) | ak0Var.h(locale2) | (i9 == 1048576);
            Object objL2 = ak0Var.L();
            if (zF || objL2 == is1Var) {
                objL2 = new f00(k00Var, bmVar2, d00Var, locale2, da1Var3);
                bmVar2 = bmVar2;
                da1Var = da1Var3;
                ak0Var.g0(objL2);
            } else {
                da1Var = da1Var3;
            }
            da1 da1Var4 = (da1) ex.H(objArr2, (ti0) objL2, ak0Var, 0);
            boolean zI = h92.I((CharSequence) da1Var4.getValue());
            float f = b;
            if (!zI) {
                if (!((16.0f >= 0.0f) & (4.0f >= 0.0f) & (16.0f >= 0.0f) & (0.0f >= 0.0f))) {
                    tp0.a("Padding must be non-negative");
                }
                f -= 0.0f + 4.0f;
            }
            float f2 = f;
            te2 te2Var = (te2) da1Var.getValue();
            boolean zF2 = (i7 == 8388608) | ((i3 & 896) == 256) | (i8 == 67108864) | ak0Var.f(da1Var) | ak0Var.f(da1Var4) | ak0Var.h(bmVar2) | ak0Var.h(locale2) | (i9 == 1048576);
            Object objL3 = ak0Var.L();
            if (zF2 || objL3 == is1Var) {
                da1 da1Var5 = da1Var;
                i5 = 4;
                bm bmVar3 = bmVar2;
                objL3 = new g00(d00Var, da1Var4, ej0Var, bmVar3, locale2, k00Var, da1Var5);
                d00Var2 = d00Var;
                bmVar2 = bmVar3;
                locale2 = locale2;
                da1Var2 = da1Var4;
                da1Var = da1Var5;
                ak0Var.g0(objL3);
            } else {
                d00Var2 = d00Var;
                da1Var2 = da1Var4;
                i5 = 4;
            }
            ej0 ej0Var2 = (ej0) objL3;
            ak0Var2 = ak0Var;
            int i10 = i3;
            u71 u71VarF0 = p61.f0(u71Var, 0.0f, 0.0f, 0.0f, f2, 7);
            boolean zF3 = ak0Var2.f(da1Var2);
            Object objL4 = ak0Var2.L();
            if (zF3 || objL4 == is1Var) {
                objL4 = new s9(da1Var2, i5);
                ak0Var2.g0(objL4);
            }
            u71 u71VarA = l02.a(u71VarF0, false, (ej0) objL4);
            u71 u71VarT = r71.a;
            if (xf0Var != null) {
                u71VarT = ws0.t(u71VarT, xf0Var);
            }
            ux.e(te2Var, ej0Var2, u71VarA.c(u71VarT), false, null, gtVar, gtVar2, vs0.C(-357881838, new h30(1, da1Var2), ak0Var2), !h92.I((CharSequence) da1Var2.getValue()), new g20(d00Var2), new aw0(3, 7, 113), null, true, 0, 0, null, l00Var.y, ak0Var2, (i10 << 6) & 33030144);
            boolean z2 = (i6 & 112) == 32;
            Object objL5 = ak0Var2.L();
            if (z2 || objL5 == is1Var) {
                z = true;
                objL5 = new ln(1, (sx) null, xf0Var);
                ak0Var2.g0(objL5);
            } else {
                z = true;
            }
            s5.o((ij0) objL5, ak0Var2, ll2.a);
            boolean zH = ak0Var2.h(bmVar2) | ((i10 & 112) == 32 ? z : false);
            if (i8 != 67108864) {
                z = false;
            }
            boolean zH2 = zH | z | ak0Var2.h(locale2) | ak0Var2.f(da1Var);
            Object objL6 = ak0Var2.L();
            if (zH2 || objL6 == is1Var) {
                ikVar = new ik(l, bmVar2, d00Var, locale2, da1Var, null);
                l2 = l;
                ak0Var2.g0(ikVar);
            } else {
                ikVar = objL6;
                l2 = l;
            }
            s5.o((ij0) ikVar, ak0Var2, l2);
        } else {
            l2 = l;
            ak0Var2 = ak0Var;
            ak0Var2.R();
        }
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: h00
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(i | 1);
                    int iP2 = ei1.P(i2);
                    j00.b(u71Var, l2, ej0Var, bmVar, gtVar, gtVar2, k00Var, d00Var, locale, l00Var, xf0Var, (ak0) obj, iP, iP2);
                    return ll2.a;
                }
            };
        }
    }
}
