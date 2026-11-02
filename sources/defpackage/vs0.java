package defpackage;

import android.R;
import android.graphics.Paint;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vs0 {
    public static final /* synthetic */ int F = 0;
    public static final /* synthetic */ int G = 0;
    public static jo0 H;
    public static final y2 a;
    public static final ee b;
    public static final ee c;
    public static final gt i;
    public static final gt j;
    public static final pa0 u;
    public static final pa0 v;
    public static final float[][] d = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] e = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] f = {95.047f, 100.0f, 108.883f};
    public static final double[][] g = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    public static final double[][] h = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};
    public static final Object k = new Object();
    public static final kr l = kr.p;
    public static final hk2 m = hk2.j;
    public static final kr n = kr.v;
    public static final y32 o = y32.e;
    public static final kr p = kr.l;
    public static final hk2 q = hk2.i;
    public static final kr r = kr.m;
    public static final hk2 s = hk2.f;
    public static final kr t = kr.r;
    public static final oo2 w = new oo2(0.31006f, 0.31616f);
    public static final oo2 x = new oo2(0.34567f, 0.3585f);
    public static final oo2 y = new oo2(0.32168f, 0.33767f);
    public static final oo2 z = new oo2(0.31271f, 0.32902f);
    public static final float[] A = {0.964212f, 1.0f, 0.825188f};
    public static final StackTraceElement[] B = new StackTraceElement[0];
    public static final tn0 C = new tn0(2);
    public static final iq1 D = new iq1(11);
    public static final a70 E = new a70();

    static {
        int i2 = 0;
        a = new y2(i2);
        b = new ee(i2);
        int i3 = 1;
        c = new ee(i3);
        i = new gt(new rt(i2), false, 636288403);
        j = new gt(new rt(i3), false, -1357803046);
        u = new pa0("REMOVED_TASK", i3);
        v = new pa0("CLOSED_EMPTY", i3);
    }

    public static final List A(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : u(list.get(0));
        }
        return cb0.e;
    }

    public static final void B(int i2, int i3) {
        if (i3 >= 0) {
            if (i3 <= i2) {
                return;
            }
            fu1.e(i3, i2, ") is greater than size (", "toIndex (");
        } else {
            throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + i3 + ").");
        }
    }

    public static final gt C(int i2, qj0 qj0Var, ak0 ak0Var) {
        Object objL = ak0Var.L();
        if (objL == cv.a) {
            objL = new gt(qj0Var, true, i2);
            ak0Var.g0(objL);
        }
        gt gtVar = (gt) objL;
        if (!ws0.j(gtVar.g, qj0Var)) {
            boolean z2 = gtVar.g == null;
            gtVar.g = qj0Var;
            if (!z2 && gtVar.f) {
                lr1 lr1Var = gtVar.h;
                if (lr1Var != null) {
                    qv qvVar = lr1Var.a;
                    if (qvVar != null) {
                        qvVar.s(lr1Var, null);
                    }
                    gtVar.h = null;
                }
                ArrayList arrayList = gtVar.i;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        lr1 lr1Var2 = (lr1) arrayList.get(i3);
                        qv qvVar2 = lr1Var2.a;
                        if (qvVar2 != null) {
                            qvVar2.s(lr1Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return gtVar;
    }

    public static void D() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static String E(int i2) {
        if (i2 == 0) {
            return "Clear";
        }
        if (i2 == 1) {
            return "Src";
        }
        if (i2 == 2) {
            return "Dst";
        }
        if (i2 == 3) {
            return "SrcOver";
        }
        if (i2 == 4) {
            return "DstOver";
        }
        if (i2 == 5) {
            return "SrcIn";
        }
        if (i2 == 6) {
            return "DstIn";
        }
        if (i2 == 7) {
            return "SrcOut";
        }
        if (i2 == 8) {
            return "DstOut";
        }
        if (i2 == 9) {
            return "SrcAtop";
        }
        if (i2 == 10) {
            return "DstAtop";
        }
        if (i2 == 11) {
            return "Xor";
        }
        if (i2 == 12) {
            return "Plus";
        }
        if (i2 == 13) {
            return "Modulate";
        }
        if (i2 == 14) {
            return "Screen";
        }
        if (i2 == 15) {
            return "Overlay";
        }
        if (i2 == 16) {
            return "Darken";
        }
        if (i2 == 17) {
            return "Lighten";
        }
        if (i2 == 18) {
            return "ColorDodge";
        }
        if (i2 == 19) {
            return "ColorBurn";
        }
        if (i2 == 20) {
            return "HardLight";
        }
        if (i2 == 21) {
            return "Softlight";
        }
        if (i2 == 22) {
            return "Difference";
        }
        if (i2 == 23) {
            return "Exclusion";
        }
        if (i2 == 24) {
            return "Multiply";
        }
        if (i2 == 25) {
            return "Hue";
        }
        if (i2 == 26) {
            return "Saturation";
        }
        if (i2 == 27) {
            return "Color";
        }
        return i2 == 28 ? "Luminosity" : "Unknown";
    }

    public static final u71 F(u71 u71Var, uo2 uo2Var) {
        return u71Var.c(new pq0(uo2Var));
    }

    public static final void a(js jsVar, ej0 ej0Var, ej0 ej0Var2, ak0 ak0Var, int i2) {
        boolean z2;
        ak0 ak0Var2 = ak0Var;
        ak0Var2.X(-166671907);
        int i3 = i2 | (ak0Var2.f(jsVar) ? 4 : 2) | (ak0Var2.h(ej0Var) ? 32 : 16) | (ak0Var2.h(ej0Var2) ? 256 : 128);
        int i4 = 1;
        if (ak0Var2.O(i3 & 1, (i3 & 147) != 146)) {
            wr wrVarA = ur.a(new he(8.0f, new ut(i4)), q90.r, ak0Var2, 6);
            int iHashCode = Long.hashCode(ak0Var2.T);
            sl1 sl1VarL = ak0Var2.l();
            u71 u71VarB = nj2.B(ak0Var2, r71.a);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var2.Z();
            if (ak0Var2.S) {
                ak0Var2.k(wvVar);
            } else {
                ak0Var2.j0();
            }
            p12.l(vu.f, ak0Var2, wrVarA);
            p12.l(vu.e, ak0Var2, sl1VarL);
            p12.f(ak0Var2, Integer.valueOf(iHashCode), vu.g);
            p12.k(ak0Var2, vu.h);
            p12.l(vu.d, ak0Var2, u71VarB);
            u22 u22Var = jsVar.a;
            ef2.b(u22Var.d + "  " + f22.d(u22Var, ak0Var2), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var2.j(ik2.a)).j, ak0Var2, 0, 0, 131070);
            gd0 gd0Var = f52.a;
            rw.k(gd0Var, 0.0f, C(-1662521614, new in(7, jsVar, ej0Var), ak0Var2), ak0Var2, 390);
            if (jsVar.b == is.f) {
                ak0Var2.W(-541201320);
                ux.f(jsVar.c, ej0Var2, gd0Var, false, false, null, nj2.w, null, null, null, false, mx.L(ak0Var), new aw0(3, 6, 115), null, true, 0, 0, null, null, null, ak0Var, ((i3 >> 3) & 112) | 1573248, 12779520, 0, 8208312);
                ak0Var2 = ak0Var;
                z2 = false;
            } else {
                ak0Var2 = ak0Var2;
                z2 = false;
                ak0Var2.W(-554468421);
            }
            ak0Var2.p(z2);
            ak0Var2.p(true);
        } else {
            ak0Var2.R();
        }
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new p1(jsVar, ej0Var, ej0Var2, i2, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x014f  */
    public static final void b(ti0 ti0Var, f41 f41Var, ak0 ak0Var, int i2) {
        f41 f41Var2;
        int i3;
        f41 f41Var3;
        is1 is1Var;
        boolean z2;
        boolean z3;
        da1 da1Var;
        da1 da1Var2;
        Object objL;
        ak0 ak0Var2 = ak0Var;
        ti0Var.getClass();
        ak0Var2.X(-19217998);
        int i4 = i2 | (ak0Var2.h(ti0Var) ? 4 : 2) | 16;
        int i5 = 1;
        if (ak0Var2.O(i4 & 1, (i4 & 19) != 18)) {
            ak0Var2.T();
            if ((i2 & 1) == 0 || ak0Var2.y()) {
                co2 co2VarA = o31.a(ak0Var2);
                if (co2VarA == null) {
                    fu1.h("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    f41 f41Var4 = (f41) p12.r(js1.a(f41.class), co2VarA, sv.y(co2VarA, ak0Var2), co2VarA instanceof zl0 ? ((zl0) co2VarA).f() : jz.b, ak0Var2);
                    i3 = i4 & (-113);
                    f41Var3 = f41Var4;
                }
            } else {
                ak0Var2.R();
                i3 = i4 & (-113);
                f41Var3 = f41Var;
            }
            ak0Var2.q();
            da1 da1VarR = qx.r(f41Var3.h, ak0Var2);
            Object objL2 = ak0Var2.L();
            is1 is1Var2 = cv.a;
            if (objL2 == is1Var2) {
                objL2 = y12.s(Boolean.FALSE);
                ak0Var2.g0(objL2);
            }
            da1 da1Var3 = (da1) objL2;
            Object objL3 = ak0Var2.L();
            if (objL3 == is1Var2) {
                objL3 = y12.s(Boolean.FALSE);
                ak0Var2.g0(objL3);
            }
            da1 da1Var4 = (da1) objL3;
            Boolean boolValueOf = Boolean.valueOf(((d41) da1VarR.getValue()).m);
            boolean zF = ((i3 & 14) == 4) | ak0Var2.f(da1VarR);
            Object objL4 = ak0Var2.L();
            if (zF || objL4 == is1Var2) {
                objL4 = new jn(ti0Var, da1VarR, null, i5);
                ak0Var2.g0(objL4);
            }
            s5.o((ij0) objL4, ak0Var2, boolValueOf);
            f41 f41Var5 = f41Var3;
            ix.f(null, C(1186954102, new p1(da1VarR, ti0Var, da1Var4), ak0Var2), null, null, null, 0, 0L, 0L, null, C(-417248255, new gn(f41Var3, da1VarR, da1Var3, 3), ak0Var2), ak0Var2, 805306416, 509);
            if (((Boolean) da1Var3.getValue()).booleanValue()) {
                ak0Var2.W(-1284652982);
                int i6 = ((d41) da1VarR.getValue()).d;
                boolean zH = ak0Var2.h(f41Var5);
                Object objL5 = ak0Var2.L();
                if (zH) {
                    is1Var = is1Var2;
                } else {
                    is1Var = is1Var2;
                    if (objL5 != is1Var) {
                        da1Var2 = da1Var3;
                    }
                    ej0 ej0Var = (ej0) objL5;
                    objL = ak0Var2.L();
                    if (objL == is1Var) {
                        objL = new r9(da1Var2, 22);
                        ak0Var2.g0(objL);
                    }
                    s5.a(i6, 384, (ti0) objL, ej0Var, ak0Var2);
                    z2 = false;
                }
                da1Var2 = da1Var3;
                objL5 = new d(26, f41Var5, da1Var2);
                ak0Var2.g0(objL5);
                ej0 ej0Var2 = (ej0) objL5;
                objL = ak0Var2.L();
                if (objL == is1Var) {
                    objL = new r9(da1Var2, 22);
                    ak0Var2.g0(objL);
                }
                s5.a(i6, 384, (ti0) objL, ej0Var2, ak0Var2);
                z2 = false;
            } else {
                is1Var = is1Var2;
                z2 = false;
                ak0Var2.W(-1295567152);
            }
            ak0Var2.p(z2);
            if (((Boolean) da1Var4.getValue()).booleanValue()) {
                ak0Var2.W(-1284353119);
                Object objL6 = ak0Var2.L();
                if (objL6 == is1Var) {
                    da1Var = da1Var4;
                    objL6 = new r9(da1Var, 23);
                    ak0Var2.g0(objL6);
                } else {
                    da1Var = da1Var4;
                }
                z3 = z2;
                ir2.a((ti0) objL6, C(-315752004, new jd(27, f41Var5, da1Var), ak0Var2), null, C(-1238919430, new p7(da1Var, 7), ak0Var2), nj2.v, null, null, 0L, 0L, 0L, 0L, null, ak0Var, 199734, 16340);
                ak0Var2 = ak0Var;
            } else {
                z3 = z2;
                ak0Var2.W(-1295567152);
            }
            ak0Var2.p(z3);
            f41Var2 = f41Var5;
        } else {
            ak0Var2.R();
            f41Var2 = f41Var;
        }
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new jd(ti0Var, f41Var2, i2, 28);
        }
    }

    public static final v7 c() {
        return new v7(new Paint(7));
    }

    public static final void d(d41 d41Var, ej0 ej0Var, ak0 ak0Var, int i2) {
        d41 d41Var2;
        ej0 ej0Var2;
        ak0 ak0Var2;
        ak0Var.X(1348396913);
        int i3 = (ak0Var.h(d41Var) ? 4 : 2) | i2 | (ak0Var.h(ej0Var) ? 32 : 16);
        if (ak0Var.O(i3 & 1, (i3 & 19) != 18)) {
            Object objL = ak0Var.L();
            is1 is1Var = cv.a;
            if (objL == is1Var) {
                objL = y12.s(Boolean.FALSE);
                ak0Var.g0(objL);
            }
            da1 da1Var = (da1) objL;
            u22 u22VarB = d41Var.b();
            boolean zBooleanValue = ((Boolean) da1Var.getValue()).booleanValue();
            Object objL2 = ak0Var.L();
            if (objL2 == is1Var) {
                objL2 = new s9(da1Var, 6);
                ak0Var.g0(objL2);
            }
            d41Var2 = d41Var;
            ej0Var2 = ej0Var;
            ak0Var2 = ak0Var;
            ex.b(zBooleanValue, (ej0) objL2, null, C(-1666043493, new kz0((Object) u22VarB, (Object) d41Var2, da1Var, (Object) ej0Var, 1), ak0Var), ak0Var2, 3120);
        } else {
            d41Var2 = d41Var;
            ej0Var2 = ej0Var;
            ak0Var2 = ak0Var;
            ak0Var2.R();
        }
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new jd(d41Var2, ej0Var2, i2, 29);
        }
    }

    public static final void e(k1 k1Var, p02 p02Var) {
        i02 i02Var = p02Var.d;
        w91 w91Var = i02Var.e;
        Object objG = i02Var.e.g(u02.z);
        if (objG == null) {
            objG = null;
        }
        wu1 wu1Var = (wu1) objG;
        if (ws0.r(p02Var)) {
            if (wu1Var != null && wu1Var.a == 8) {
                return;
            }
            Object objG2 = w91Var.g(h02.y);
            if (objG2 == null) {
                objG2 = null;
            }
            p0 p0Var = (p0) objG2;
            if (p0Var != null) {
                k1Var.a(new f1(p0Var.a, R.id.accessibilityActionPageUp));
            }
            Object objG3 = w91Var.g(h02.A);
            if (objG3 == null) {
                objG3 = null;
            }
            p0 p0Var2 = (p0) objG3;
            if (p0Var2 != null) {
                k1Var.a(new f1(p0Var2.a, R.id.accessibilityActionPageDown));
            }
            Object objG4 = w91Var.g(h02.z);
            if (objG4 == null) {
                objG4 = null;
            }
            p0 p0Var3 = (p0) objG4;
            if (p0Var3 != null) {
                k1Var.a(new f1(p0Var3.a, R.id.accessibilityActionPageLeft));
            }
            Object objG5 = w91Var.g(h02.B);
            p0 p0Var4 = (p0) (objG5 != null ? objG5 : null);
            if (p0Var4 != null) {
                k1Var.a(new f1(p0Var4.a, R.id.accessibilityActionPageRight));
            }
        }
    }

    public static int f(double d2) {
        double d3 = (d2 + 16.0d) / 116.0d;
        double d4 = d2 > 8.0d ? d3 * d3 * d3 : d2 / 903.2962962962963d;
        double d5 = d3 * d3 * d3;
        boolean z2 = d5 > 0.008856451679035631d;
        double d6 = z2 ? d5 : d2 / 903.2962962962963d;
        if (!z2) {
            d5 = d2 / 903.2962962962963d;
        }
        float[] fArr = f;
        double d7 = d6 * ((double) fArr[0]);
        double d8 = d4 * ((double) fArr[1]);
        double d9 = d5 * ((double) fArr[2]);
        double[][] dArr = h;
        double[] dArr2 = dArr[0];
        double d10 = (dArr2[2] * d9) + (dArr2[1] * d8) + (dArr2[0] * d7);
        double[] dArr3 = dArr[1];
        double d11 = (dArr3[2] * d9) + (dArr3[1] * d8) + (dArr3[0] * d7);
        double[] dArr4 = dArr[2];
        return ((m(d10) & 255) << 16) | (-16777216) | ((m(d11) & 255) << 8) | (m((dArr4[2] * d9) + (dArr4[1] * d8) + (dArr4[0] * d7)) & 255);
    }

    public static ArrayList g(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new je(objArr));
    }

    public static final int h(int i2, int i3) {
        return i2 << (((i3 % 10) * 3) + 1);
    }

    public static z21 i(z21 z21Var) {
        z21Var.f();
        z21Var.g = true;
        return z21Var.f > 0 ? z21Var : z21.h;
    }

    public static final u71 j(u71 u71Var, gj1 gj1Var) {
        return u71Var.c(new hj1(gj1Var));
    }

    public static final tb k(tb tbVar) {
        tb tbVarC = tbVar.c();
        int iB = tbVarC.b();
        for (int i2 = 0; i2 < iB; i2++) {
            tbVarC.e(i2, tbVar.a(i2));
        }
        return tbVarC;
    }

    public static z21 l() {
        return new z21(10);
    }

    public static int m(double d2) {
        double d3 = d2 / 100.0d;
        int iRound = (int) Math.round((d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d);
        if (iRound < 0) {
            return 0;
        }
        if (iRound > 255) {
            return 255;
        }
        return iRound;
    }

    public static DateTimeFormatter n(String str, Locale locale, LinkedHashMap linkedHashMap) {
        String str2 = "P:" + str + locale.toLanguageTag();
        Object objWithDecimalStyle = linkedHashMap.get(str2);
        if (objWithDecimalStyle == null) {
            objWithDecimalStyle = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
            linkedHashMap.put(str2, objWithDecimalStyle);
        }
        objWithDecimalStyle.getClass();
        return of.p(objWithDecimalStyle);
    }

    public static int o(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final Object p(r61 r61Var) {
        Object objJ = r61Var.j();
        ow0 ow0Var = objJ instanceof ow0 ? (ow0) objJ : null;
        if (ow0Var != null) {
            return ow0Var.s;
        }
        return null;
    }

    public static final Paint q(v7 v7Var) {
        if (v7Var == null) {
            up0.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + js1.a(v7Var.getClass()).b());
        }
        return (Paint) v7Var.b;
    }

    public static int r(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z2 = f5 > 0.008856452f;
        float f6 = z2 ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z2) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f;
        return tr.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static final u71 s(u71 u71Var, String str) {
        return u71Var.c(new nw0(str));
    }

    public static float t(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static List u(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static List v(Object... objArr) {
        if (objArr.length <= 0) {
            return cb0.e;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static ArrayList w(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new je(objArr));
    }

    public static final u71 x(u71 u71Var, ej0 ej0Var) {
        return u71Var.c(new uw(ej0Var));
    }

    public static final u71 y(u71 u71Var, ej0 ej0Var) {
        return u71Var.c(new jf0(ej0Var));
    }

    public static final u71 z(u71 u71Var, ej0 ej0Var) {
        return u71Var.c(new og1(ej0Var));
    }
}
