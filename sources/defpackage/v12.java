package defpackage;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v12 {
    public static Thread a = null;
    public static final int b = 9;
    public static final int c = 6;
    public static final int d = 10;
    public static final int e = 5;
    public static final int f = 15;

    public static final void a(u71 u71Var, gt gtVar, ak0 ak0Var, int i) {
        ak0Var.X(-1854833411);
        int i2 = 4;
        int i3 = (ak0Var.f(u71Var) ? 4 : 2) | i;
        if (ak0Var.O(i3 & 1, (i3 & 19) != 18)) {
            Object objL = ak0Var.L();
            if (objL == cv.a) {
                objL = n6.g;
                ak0Var.g0(objL);
            }
            w61 w61Var = (w61) objL;
            int iHashCode = Long.hashCode(ak0Var.T);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71Var);
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
            p12.f(ak0Var, Integer.valueOf(iHashCode), vu.g);
            p12.k(ak0Var, vu.h);
            p12.l(vu.d, ak0Var, u71VarB);
            k3.o(6, gtVar, ak0Var, true);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new nb1(u71Var, gtVar, i, i2);
        }
    }

    public static final void b(boolean z, jt1 jt1Var, me2 me2Var, ak0 ak0Var, int i) {
        int i2;
        if2 if2VarD;
        ak0Var.X(-1344558920);
        if ((i & 6) == 0) {
            i2 = (ak0Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.d(jt1Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ak0Var.h(me2Var) ? 256 : 128;
        }
        if (ak0Var.O(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean zF = (i3 == 4) | ak0Var.f(me2Var);
            Object objL = ak0Var.L();
            is1 is1Var = cv.a;
            if (zF || objL == is1Var) {
                objL = new je2(me2Var, z);
                ak0Var.g0(objL);
            }
            id2 id2Var = (id2) objL;
            boolean zH = (i3 == 4) | ak0Var.h(me2Var);
            Object objL2 = ak0Var.L();
            if (zH || objL2 == is1Var) {
                objL2 = new ne2(me2Var, z);
                ak0Var.g0(objL2);
            }
            yf1 yf1Var = (yf1) objL2;
            boolean zG = of2.g(me2Var.l().b);
            int i4 = (int) (z ? me2Var.l().b >> 32 : me2Var.l().b & 4294967295L);
            f11 f11Var = me2Var.d;
            float fE = 0.0f;
            if (f11Var != null && (if2VarD = f11Var.d()) != null) {
                hf2 hf2Var = if2VarD.a;
                if (i4 >= 0) {
                    gf2 gf2Var = hf2Var.a;
                    t81 t81Var = hf2Var.b;
                    if (gf2Var.a.f.length() != 0) {
                        int iMin = Math.min(t81Var.d(i4), Math.min(t81Var.b - 1, t81Var.f - 1));
                        if (i4 <= t81Var.c(iMin, false)) {
                            t81Var.l(iMin);
                            ArrayList arrayList = t81Var.h;
                            sj1 sj1Var = (sj1) arrayList.get(ix.v(iMin, arrayList));
                            y7 y7Var = sj1Var.a;
                            int i5 = iMin - sj1Var.d;
                            ff2 ff2Var = y7Var.d;
                            fE = ff2Var.e(i5) - ff2Var.g(i5);
                        }
                    }
                }
            }
            float f2 = fE;
            boolean zH2 = ak0Var.h(id2Var);
            Object objL3 = ak0Var.L();
            if (zH2 || objL3 == is1Var) {
                objL3 = new u6(6, id2Var);
                ak0Var.g0(objL3);
            }
            sv0.J(yf1Var, z, jt1Var, zG, 0L, f2, ya2.a(r71.a, id2Var, (PointerInputEventHandler) objL3), ak0Var, (i2 << 3) & 1008);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new f9(z, jt1Var, me2Var, i);
        }
    }

    public static final u12 c(String str, s12[] s12VarArr, ej0 ej0Var) {
        if (h92.I(str)) {
            qj.r("Blank serial names are prohibited");
            return null;
        }
        bq bqVar = new bq(str);
        ej0Var.h(bqVar);
        return new u12(str, q92.b, bqVar.c.size(), ve.M0(s12VarArr), bqVar);
    }

    public static final u12 d(String str, y12 y12Var, s12[] s12VarArr, ej0 ej0Var) {
        if (h92.I(str)) {
            qj.r("Blank serial names are prohibited");
            return null;
        }
        if (y12Var.equals(q92.b)) {
            qj.r("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        bq bqVar = new bq(str);
        ej0Var.h(bqVar);
        return new u12(str, y12Var, bqVar.c.size(), ve.M0(s12VarArr), bqVar);
    }

    public static u12 e(String str, y12 y12Var, s12[] s12VarArr) {
        if (h92.I(str)) {
            qj.r("Blank serial names are prohibited");
            return null;
        }
        if (y12Var.equals(q92.b)) {
            qj.r("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        bq bqVar = new bq(str);
        return new u12(str, y12Var, bqVar.c.size(), ve.M0(s12VarArr), bqVar);
    }

    public static final da1 f(pe0 pe0Var, Object obj, ak0 ak0Var, int i, int i2) {
        Object obj2 = ab0.e;
        boolean zH = ak0Var.h(obj2) | ak0Var.h(pe0Var);
        Object objL = ak0Var.L();
        sx sxVar = null;
        Object obj3 = cv.a;
        if (zH || objL == obj3) {
            objL = new g(23, sxVar, obj2, pe0Var);
            ak0Var.g0(objL);
        }
        ij0 ij0Var = (ij0) objL;
        Object objL2 = ak0Var.L();
        if (objL2 == obj3) {
            objL2 = y12.s(obj);
            ak0Var.g0(objL2);
        }
        da1 da1Var = (da1) objL2;
        boolean zH2 = ak0Var.h(ij0Var);
        Object objL3 = ak0Var.L();
        if (zH2 || objL3 == obj3) {
            objL3 = new f72(ij0Var, da1Var, sxVar, 1);
            ak0Var.g0(objL3);
        }
        s5.p(pe0Var, obj2, (ij0) objL3, ak0Var);
        return da1Var;
    }

    public static StaticLayout g(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            wp0.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            wp0.a("invalid end value");
        }
        if (i3 < 0) {
            wp0.a("invalid maxLines value");
        }
        if (i < 0) {
            wp0.a("invalid width value");
        }
        if (i4 < 0) {
            wp0.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i3);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i4);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i6);
        builderObtain.setHyphenationFrequency(i9);
        builderObtain.setIndents(null, null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            builderObtain.setJustificationMode(i5);
        }
        if (i10 >= 28) {
            builderObtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i10 >= 33) {
            h1.l(builderObtain, i7, i8);
        }
        if (i10 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }

    public static final boolean h(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                int i4 = i3 + 1;
                if (i3 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && (i2 = i2 - 1) == 0 && i3 != str.length() - 1) {
                    }
                    i++;
                    i3 = i4;
                }
            }
            if (i2 == 0) {
                return ws0.j(h92.Q(str.substring(1, str.length() - 1)).toString(), str2);
            }
        }
        return false;
    }

    public static final String i(Collection collection) {
        return !collection.isEmpty() ? i92.r(vq.V(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    public static final lz j(co2 co2Var) {
        return co2Var instanceof zl0 ? ((zl0) co2Var).f() : jz.b;
    }

    public static final int k(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final int l(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final Object[] m(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        ve.y0(objArr, objArr2, 0, i, 6);
        ve.w0(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final boolean n(me2 me2Var, boolean z) {
        jw0 jw0VarC;
        f11 f11Var = me2Var.d;
        if (f11Var == null || (jw0VarC = f11Var.c()) == null) {
            return false;
        }
        yr1 yr1VarQ = ux.Q(jw0VarC);
        long j = me2Var.j(z);
        float f2 = yr1VarQ.a;
        float f3 = yr1VarQ.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f2 > fIntBitsToFloat || fIntBitsToFloat > f3) {
            return false;
        }
        float f4 = yr1VarQ.b;
        float f5 = yr1VarQ.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return f4 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f5;
    }

    public static final Object[] o(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        ve.y0(objArr, objArr2, 0, i, 6);
        ve.w0(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] p(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        ve.y0(objArr, objArr2, 0, i, 6);
        ve.w0(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    public static final void q(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }
}
