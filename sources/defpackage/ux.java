package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.DragEvent;
import android.view.View;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ux {
    public static final /* synthetic */ int a = 0;

    public static final boolean A(hv1 hv1Var) {
        long j = hv1Var.e;
        return (j >>> 32) == (4294967295L & j) && j == hv1Var.f && j == hv1Var.g && j == hv1Var.h;
    }

    public static final CharSequence B(CharSequence charSequence, int i) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sb = new StringBuilder(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sb.append(charSequence.subSequence(i2, i3).toString());
                sb.append(str2);
                return sb.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void C(t71 t71Var, ti0 ti0Var) {
        mf1 mf1Var = t71Var.k;
        if (mf1Var == null) {
            mf1Var = new mf1((lf1) t71Var);
            t71Var.k = mf1Var;
        }
        cj1 snapshotObserver = ((e5) qx.W(t71Var)).getSnapshotObserver();
        snapshotObserver.a.c(mf1Var, je1.i, ti0Var);
    }

    public static final fw1 D(ak0 ak0Var) {
        ak0Var.W(1967007413);
        Object[] objArr = new Object[0];
        Object objL = ak0Var.L();
        if (objL == cv.a) {
            objL = new vr0(22);
            ak0Var.g0(objL);
        }
        fw1 fw1Var = (fw1) ex.I(objArr, fw1.i, (ti0) objL, ak0Var, 384);
        fw1Var.g = (gw1) ak0Var.j(iw1.a);
        ak0Var.p(false);
        return fw1Var;
    }

    public static final View E(b40 b40Var) {
        if (!((t71) b40Var).e.r) {
            vp0.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) dx0.a(qx.V(b40Var));
    }

    public static final void F(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final String G(Object[] objArr, int i, int i2, a0 a0Var) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == a0Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final int H(c91 c91Var) {
        int iB;
        int i = c91Var.b;
        int iB2 = c91Var.b(0);
        while (c91Var.b != 0 && c91Var.b(0) == iB2) {
            int i2 = c91Var.b;
            if (i2 == 0) {
                fu1.k("IntList is empty.");
                return 0;
            }
            c91Var.d(0, c91Var.a[i2 - 1]);
            c91Var.c(c91Var.b - 1);
            int i3 = c91Var.b;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int iB3 = c91Var.b(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int iB4 = c91Var.b(i7);
                if (i6 < i3 && (iB = c91Var.b(i6)) > iB4) {
                    if (iB <= iB3) {
                        break;
                    }
                    c91Var.d(i5, iB);
                    c91Var.d(i6, iB3);
                    i5 = i6;
                } else {
                    if (iB4 <= iB3) {
                        break;
                    }
                    c91Var.d(i5, iB4);
                    c91Var.d(i7, iB3);
                    i5 = i7;
                }
            }
        }
        return iB2;
    }

    public static final void I(fc1 fc1Var, Number number) {
        fc1.l(fc1Var, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final Rect J(mr0 mr0Var) {
        return new Rect(mr0Var.a, mr0Var.b, mr0Var.c, mr0Var.d);
    }

    public static final RectF K(yr1 yr1Var) {
        return new RectF(yr1Var.a, yr1Var.b, yr1Var.c, yr1Var.d);
    }

    public static final yr1 L(RectF rectF) {
        return new yr1(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final long M(long j) {
        return (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static final String N(s12 s12Var) {
        return vq.V(ex.S(0, s12Var.d()), ", ", s12Var.b() + '(', ")", new m(26, s12Var), 24);
    }

    public static final long O(long j, long j2) {
        int iD;
        int iF = of2.f(j);
        int iE = of2.e(j);
        if ((of2.f(j2) < of2.e(j)) && (of2.f(j) < of2.e(j2))) {
            if ((of2.f(j2) <= of2.f(j)) && (of2.e(j) <= of2.e(j2))) {
                iF = of2.f(j2);
                iE = iF;
            } else {
                if ((of2.f(j) <= of2.f(j2)) && (of2.e(j2) <= of2.e(j))) {
                    iD = of2.d(j2);
                } else {
                    int iF2 = of2.f(j2);
                    if (iF >= of2.e(j2) || iF2 > iF) {
                        iE = of2.f(j2);
                    } else {
                        iF = of2.f(j2);
                        iD = of2.d(j2);
                    }
                }
                iE -= iD;
            }
        } else if (iE > of2.f(j2)) {
            iF -= of2.d(j2);
            iD = of2.d(j2);
            iE -= iD;
        }
        return j02.c(iF, iE);
    }

    public static final void P(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            yp0.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        yp0.a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    public static final yr1 Q(jw0 jw0Var) {
        yr1 yr1VarM = sv.m(jw0Var, true);
        long jH = jw0Var.h(yr1VarM.d());
        float f = yr1VarM.c;
        float f2 = yr1VarM.d;
        long jH2 = jw0Var.h((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        return new yr1(Float.intBitsToFloat((int) (jH >> 32)), Float.intBitsToFloat((int) (jH & 4294967295L)), Float.intBitsToFloat((int) (jH2 >> 32)), Float.intBitsToFloat((int) (jH2 & 4294967295L)));
    }

    public static final void R(p02 p02Var, int i, ox1 ox1Var) {
        fa1 fa1Var = new fa1(new p02[16]);
        List listI = p02Var.i(false, false);
        while (true) {
            fa1Var.d(fa1Var.g, listI);
            while (true) {
                int i2 = fa1Var.g;
                if (i2 == 0) {
                    return;
                }
                p02 p02Var2 = (p02) fa1Var.k(i2 - 1);
                boolean zV = j20.v(p02Var2);
                i02 i02Var = p02Var2.d;
                w91 w91Var = i02Var.e;
                if (!zV && !w91Var.c(u02.j)) {
                    me1 me1VarD = p02Var2.d();
                    if (me1VarD == null) {
                        throw k3.g("Expected semantics node to have a coordinator.");
                    }
                    mr0 mr0VarY = qx.Y(sv.m(me1VarD, true));
                    if (mr0VarY.a < mr0VarY.c && mr0VarY.b < mr0VarY.d) {
                        Object objG = i02Var.e.g(h02.e);
                        if (objG == null) {
                            objG = null;
                        }
                        ij0 ij0Var = (ij0) objG;
                        Object objG2 = w91Var.g(u02.w);
                        nx1 nx1Var = (nx1) (objG2 != null ? objG2 : null);
                        if (ij0Var == null || nx1Var == null || ((Number) nx1Var.b.a()).floatValue() <= 0.0f) {
                            listI = p02Var2.i(false, false);
                        } else {
                            int i3 = 1 + i;
                            ox1Var.h(new qx1(p02Var2, i3, mr0VarY, me1VarD));
                            R(p02Var2, i3, ox1Var);
                        }
                    }
                }
            }
        }
    }

    public static g7 a(int i, int i2, int i3) {
        Bitmap bitmapCreateBitmap;
        ju1 ju1Var = qr.e;
        Bitmap.Config configF = ir2.F(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, ir2.F(i3), true, pr.a(ju1Var));
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, configF);
            bitmapCreateBitmap.setHasAlpha(true);
        }
        return new g7(bitmapCreateBitmap);
    }

    public static final gu0 b(Number number, String str) {
        return new gu0("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) B(str, -1)));
    }

    public static final gu0 c(int i, String str, CharSequence charSequence) {
        charSequence.getClass();
        String str2 = str + "\nJSON input: " + ((Object) B(charSequence, i));
        if (i >= 0) {
            str2 = "Unexpected JSON token at offset " + i + ": " + str2;
        }
        return new gu0(str2);
    }

    /* JADX WARN: Code duplicated, block: B:177:0x0274  */
    public static final void d(u71 u71Var, ry0 ry0Var, ml0 ml0Var, gj1 gj1Var, pd0 pd0Var, boolean z, v6 v6Var, ie ieVar, ge geVar, ej0 ej0Var, ak0 ak0Var, int i, int i2) {
        int i3;
        int i4;
        ry0 ry0Var2;
        boolean z2;
        Object ey0Var;
        ry0 ry0Var3;
        boolean z3;
        boolean z4;
        jv0 jv0Var;
        u71 u71VarA0;
        ak0Var.X(708740370);
        if ((i & 6) == 0) {
            i3 = (ak0Var.f(u71Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ak0Var.f(ry0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? ak0Var.f(ml0Var) : ak0Var.h(ml0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ak0Var.f(gj1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ak0Var.g(false) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= ak0Var.g(true) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= ak0Var.f(pd0Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= ak0Var.g(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= ak0Var.f(v6Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= ak0Var.f(ieVar) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (ak0Var.f(geVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ak0Var.h(ej0Var) ? 32 : 16;
        }
        if (ak0Var.O(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            ak0Var.T();
            if ((i & 1) != 0 && !ak0Var.y()) {
                ak0Var.R();
            }
            ak0Var.q();
            int i5 = i3 >> 3;
            int i6 = i5 & 14;
            int i7 = i6 | (i4 & 112);
            da1 da1VarT = y12.t(ej0Var, ak0Var);
            int i8 = i3;
            boolean z5 = (((i7 & 14) ^ 6) > 4 && ak0Var.f(ry0Var)) || (i7 & 6) == 4;
            Object objL = ak0Var.L();
            Object obj = cv.a;
            if (z5 || objL == obj) {
                is1 is1Var = is1.f;
                r9 r9Var = new r9(da1VarT, 16);
                ud udVar = e72.a;
                objL = new ay0(0, 0, p82.class, new v40(new n1(22, new v40(r9Var, is1Var), ry0Var), is1Var), "value", "getValue()Ljava/lang/Object;");
                ak0Var.g0(objL);
            }
            jv0 jv0Var2 = (jv0) objL;
            int i9 = i6 | ((i8 >> 9) & 112);
            boolean z6 = ((((i9 & 14) ^ 6) > 4 && ak0Var.f(ry0Var)) || (i9 & 6) == 4) | ((((i9 & 112) ^ 48) > 32 && ak0Var.g(false)) || (i9 & 48) == 32);
            Object objL2 = ak0Var.L();
            if (z6 || objL2 == obj) {
                objL2 = new t01(ry0Var);
                ak0Var.g0(objL2);
            }
            t01 t01Var = (t01) objL2;
            Object objL3 = ak0Var.L();
            if (objL3 == obj) {
                objL3 = s5.E(ak0Var);
                ak0Var.g0(objL3);
            }
            ez ezVar = (ez) objL3;
            zk0 zk0Var = (zk0) ak0Var.j(yv.g);
            iq1 iq1Var = !((Boolean) ak0Var.j(yv.w)).booleanValue() ? a92.a : null;
            int i10 = (i8 & 524272) | ((i4 << 18) & 3670016) | ((i8 >> 6) & 29360128);
            boolean z7 = ((((i10 & 896) ^ 384) > 256 && ak0Var.f(ml0Var)) || (i10 & 384) == 256) | ((((i10 & 112) ^ 48) > 32 && ak0Var.f(ry0Var)) || (i10 & 48) == 32) | ((((i10 & 7168) ^ 3072) > 2048 && ak0Var.f(gj1Var)) || (i10 & 3072) == 2048);
            if (((57344 & i10) ^ 24576) > 16384 && ak0Var.g(false)) {
                z2 = true;
            } else if ((i10 & 24576) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zF = ((((i10 & 29360128) ^ 12582912) > 8388608 && ak0Var.f(ieVar)) || (i10 & 12582912) == 8388608) | z7 | z2 | ((((458752 & i10) ^ 196608) > 131072 && ak0Var.g(true)) || (i10 & 196608) == 131072) | ((((i10 & 3670016) ^ 1572864) > 1048576 && ak0Var.f(geVar)) || (i10 & 1572864) == 1048576) | ak0Var.f(zk0Var);
            Object objL4 = ak0Var.L();
            if (zF || objL4 == obj) {
                ry0Var3 = ry0Var;
                z3 = false;
                z4 = true;
                ey0Var = new ey0(ry0Var3, gj1Var, jv0Var2, ml0Var, ieVar, geVar, ezVar, zk0Var, iq1Var);
                jv0Var = jv0Var2;
                ak0Var.g0(ey0Var);
            } else {
                ey0Var = objL4;
                jv0Var = jv0Var2;
                z3 = false;
                z4 = true;
                ry0Var3 = ry0Var;
            }
            lz0 lz0Var = (lz0) ey0Var;
            di1 di1Var = di1.e;
            if (z) {
                ak0Var.W(27281635);
                boolean z8 = (((i6 ^ 6) <= 4 || !ak0Var.f(ry0Var3)) && (i5 & 6) != 4) ? z3 : z4;
                Object objL5 = ak0Var.L();
                if (z8 || objL5 == obj) {
                    objL5 = new vx0(ry0Var3);
                    ak0Var.g0(objL5);
                }
                u71VarA0 = p61.a0((vx0) objL5, ry0Var3.n, di1Var);
                ak0Var.p(z3);
            } else {
                ak0Var.W(27577840);
                ak0Var.p(z3);
                u71VarA0 = r71.a;
            }
            ry0Var2 = ry0Var3;
            mx.f(jv0Var, ir2.D(nj2.z(u71Var.c(ry0Var3.k).c(ry0Var3.l), jv0Var, t01Var, di1Var, z).c(u71VarA0).c(ry0Var3.m.i), ry0Var3, di1Var, v6Var, z, pd0Var, ry0Var3.f), ry0Var2.o, lz0Var, ak0Var, 0);
        } else {
            ry0Var2 = ry0Var;
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new wx0(u71Var, ry0Var2, ml0Var, gj1Var, pd0Var, z, v6Var, ieVar, geVar, ej0Var, i, i2);
        }
    }

    public static final void e(final te2 te2Var, final ej0 ej0Var, final u71 u71Var, boolean z, vf2 vf2Var, final ij0 ij0Var, final ij0 ij0Var2, final ij0 ij0Var3, final boolean z2, final io2 io2Var, final aw0 aw0Var, zv0 zv0Var, final boolean z3, int i, int i2, u32 u32Var, final jd2 jd2Var, ak0 ak0Var, final int i3) {
        int i4;
        ej0 ej0Var2;
        u71 u71Var2;
        ij0 ij0Var4;
        ak0 ak0Var2;
        final boolean z4;
        final vf2 vf2Var2;
        final zv0 zv0Var2;
        final int i5;
        final int i6;
        final u32 u32Var2;
        vf2 vf2Var3;
        u32 u32VarA;
        int i7;
        zv0 zv0Var3;
        int i8;
        long j;
        ak0Var.X(2057288437);
        if ((i3 & 6) == 0) {
            i4 = (ak0Var.f(te2Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            ej0Var2 = ej0Var;
            i4 |= ak0Var.h(ej0Var2) ? 32 : 16;
        } else {
            ej0Var2 = ej0Var;
        }
        if ((i3 & 384) == 0) {
            u71Var2 = u71Var;
            i4 |= ak0Var.f(u71Var2) ? 256 : 128;
        } else {
            u71Var2 = u71Var;
        }
        int i9 = i4 | 27648;
        if ((196608 & i3) == 0) {
            i9 = 93184 | i4;
        }
        if ((1572864 & i3) == 0) {
            i9 |= ak0Var.h(ij0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            ij0Var4 = ij0Var2;
            i9 |= ak0Var.h(ij0Var4) ? 8388608 : 4194304;
        } else {
            ij0Var4 = ij0Var2;
        }
        int i10 = i9 | 905969664;
        boolean z5 = true;
        if (ak0Var.O(i10 & 1, ((i10 & 306783379) == 306783378 && (((((ak0Var.g(z2) ? (char) 2048 : (char) 1024) | 438) | (ak0Var.f(io2Var) ? 16384 : 8192)) | 840433664) & 306783379) == 306783378 && (((ak0Var.f(jd2Var) ? (char) 256 : (char) 128) | 22) & 147) == 146) ? false : true)) {
            ak0Var.T();
            if ((i3 & 1) == 0 || ak0Var.y()) {
                vf2Var3 = (vf2) ak0Var.j(ef2.a);
                int i11 = z3 ? 1 : Integer.MAX_VALUE;
                u32VarA = j42.a(sv0.A, ak0Var);
                i7 = i11;
                zv0Var3 = zv0.a;
                i8 = 1;
            } else {
                ak0Var.R();
                z5 = z;
                vf2Var3 = vf2Var;
                zv0Var3 = zv0Var;
                i7 = i;
                i8 = i2;
                u32VarA = u32Var;
            }
            ak0Var.q();
            ak0Var.W(-502250010);
            Object objL = ak0Var.L();
            if (objL == cv.a) {
                objL = new f91();
                ak0Var.g0(objL);
            }
            f91 f91Var = (f91) objL;
            ak0Var.p(false);
            ak0Var.W(1369277167);
            long jB = vf2Var3.b();
            if (jB == 16) {
                boolean zBooleanValue = ((Boolean) mx.r(f91Var, ak0Var, 0).getValue()).booleanValue();
                if (!z5) {
                    j = jd2Var.c;
                } else if (z2) {
                    j = jd2Var.d;
                } else {
                    j = zBooleanValue ? jd2Var.a : jd2Var.b;
                }
                jB = j;
            }
            long j2 = jB;
            ak0Var.p(false);
            u71 u71Var3 = u71Var2;
            boolean z6 = z5;
            ak0Var2 = ak0Var;
            sv.a(qf2.a.a(jd2Var.k), vs0.C(-2094276683, new si1(u71Var3, ij0Var, z2, jd2Var, te2Var, ej0Var2, z6, vf2Var3.d(new vf2(j2, 0L, null, 0L, 0, 0L, 16777214)), aw0Var, zv0Var3, z3, i7, i8, io2Var, f91Var, ij0Var4, ij0Var3, u32VarA), ak0Var2), ak0Var2, 56);
            z4 = z6;
            i5 = i7;
            i6 = i8;
            u32Var2 = u32VarA;
            vf2Var2 = vf2Var3;
            zv0Var2 = zv0Var3;
        } else {
            ak0Var2 = ak0Var;
            ak0Var2.R();
            z4 = z;
            vf2Var2 = vf2Var;
            zv0Var2 = zv0Var;
            i5 = i;
            i6 = i2;
            u32Var2 = u32Var;
        }
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: mi1
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(i3 | 1);
                    ux.e(te2Var, ej0Var, u71Var, z4, vf2Var2, ij0Var, ij0Var2, ij0Var3, z2, io2Var, aw0Var, zv0Var2, z3, i5, i6, u32Var2, jd2Var, (ak0) obj, iP);
                    return ll2.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0135  */
    /* JADX WARN: Code duplicated, block: B:104:0x013c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0146  */
    /* JADX WARN: Code duplicated, block: B:110:0x0153  */
    /* JADX WARN: Code duplicated, block: B:111:0x0158  */
    /* JADX WARN: Code duplicated, block: B:113:0x015e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0164  */
    /* JADX WARN: Code duplicated, block: B:119:0x016e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0175  */
    /* JADX WARN: Code duplicated, block: B:122:0x017b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0182  */
    /* JADX WARN: Code duplicated, block: B:129:0x018e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0190  */
    /* JADX WARN: Code duplicated, block: B:132:0x0196  */
    /* JADX WARN: Code duplicated, block: B:134:0x019c  */
    /* JADX WARN: Code duplicated, block: B:135:0x019f  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:149:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:155:0x0200 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x0202  */
    /* JADX WARN: Code duplicated, block: B:158:0x0207  */
    /* JADX WARN: Code duplicated, block: B:160:0x020b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0217  */
    /* JADX WARN: Code duplicated, block: B:165:0x021a  */
    /* JADX WARN: Code duplicated, block: B:166:0x021c  */
    /* JADX WARN: Code duplicated, block: B:168:0x0220  */
    /* JADX WARN: Code duplicated, block: B:169:0x0222  */
    /* JADX WARN: Code duplicated, block: B:171:0x0226  */
    /* JADX WARN: Code duplicated, block: B:172:0x0228  */
    /* JADX WARN: Code duplicated, block: B:174:0x022c  */
    /* JADX WARN: Code duplicated, block: B:175:0x022f  */
    /* JADX WARN: Code duplicated, block: B:177:0x0233  */
    /* JADX WARN: Code duplicated, block: B:178:0x0236  */
    /* JADX WARN: Code duplicated, block: B:180:0x023a  */
    /* JADX WARN: Code duplicated, block: B:181:0x023d  */
    /* JADX WARN: Code duplicated, block: B:183:0x0241  */
    /* JADX WARN: Code duplicated, block: B:184:0x0244  */
    /* JADX WARN: Code duplicated, block: B:187:0x024a  */
    /* JADX WARN: Code duplicated, block: B:191:0x0275  */
    /* JADX WARN: Code duplicated, block: B:193:0x0283  */
    /* JADX WARN: Code duplicated, block: B:195:0x0292  */
    /* JADX WARN: Code duplicated, block: B:199:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:201:0x02be  */
    /* JADX WARN: Code duplicated, block: B:203:0x02c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:204:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:205:0x02c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:206:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:207:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:210:0x033e  */
    /* JADX WARN: Code duplicated, block: B:213:0x0365  */
    /* JADX WARN: Code duplicated, block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00db  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:86:0x0100  */
    /* JADX WARN: Code duplicated, block: B:88:0x0108  */
    /* JADX WARN: Code duplicated, block: B:89:0x010b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0112  */
    /* JADX WARN: Code duplicated, block: B:95:0x0119  */
    /* JADX WARN: Code duplicated, block: B:96:0x011c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0126  */
    /* JADX WARN: Code duplicated, block: B:99:0x0129  */
    public static final void f(final String str, final ej0 ej0Var, u71 u71Var, boolean z, boolean z2, vf2 vf2Var, final ij0 ij0Var, ij0 ij0Var2, ij0 ij0Var3, ij0 ij0Var4, boolean z3, io2 io2Var, aw0 aw0Var, zv0 zv0Var, boolean z4, int i, int i2, f91 f91Var, u32 u32Var, jd2 jd2Var, ak0 ak0Var, final int i3, final int i4, final int i5, final int i6) {
        int i7;
        u71 u71Var2;
        int i8;
        boolean z5;
        int i9;
        int i10;
        boolean z6;
        int i11;
        int i12;
        ij0 ij0Var5;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean z7;
        final ij0 ij0Var6;
        final boolean z8;
        final io2 io2Var2;
        final aw0 aw0Var2;
        final boolean z9;
        final int i32;
        final int i33;
        final f91 f91Var2;
        final u32 u32Var2;
        final jd2 jd2Var2;
        final boolean z10;
        final boolean z11;
        final u71 u71Var3;
        final ij0 ij0Var7;
        final vf2 vf2Var2;
        final ij0 ij0Var8;
        final zv0 zv0Var2;
        lr1 lr1VarR;
        ij0 ij0Var9;
        ij0 ij0Var10;
        boolean z12;
        io2 io2Var3;
        aw0 aw0Var3;
        boolean z13;
        int i34;
        f91 f91Var3;
        zv0 zv0Var3;
        u32 u32Var3;
        ij0 ij0Var11;
        io2 io2Var4;
        int i35;
        int i36;
        jd2 jd2Var3;
        ij0 ij0Var12;
        aw0 aw0Var4;
        vf2 vf2Var3;
        ij0 ij0Var13;
        boolean z14;
        boolean z15;
        boolean z16;
        f91 f91Var4;
        long jB;
        boolean zBooleanValue;
        long j;
        Object objL;
        int i37;
        ak0Var.X(1901501544);
        if ((i3 & 6) == 0) {
            i7 = (ak0Var.f(str) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= ak0Var.h(ej0Var) ? 32 : 16;
        }
        int i38 = i6 & 4;
        if (i38 == 0) {
            if ((i3 & 384) == 0) {
                u71Var2 = u71Var;
                i7 |= ak0Var.f(u71Var2) ? 256 : 128;
            }
            i8 = i6 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    z5 = z;
                    if (ak0Var.g(z5)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i7 |= i9;
                }
                i10 = i6 & 16;
                if (i10 != 0) {
                    if ((i3 & 24576) == 0) {
                        z6 = z2;
                        if (ak0Var.g(z6)) {
                            i11 = 16384;
                        } else {
                            i11 = 8192;
                        }
                        i7 |= i11;
                    }
                    if ((i3 & 196608) == 0) {
                        i7 |= 65536;
                    }
                    if ((i3 & 1572864) == 0) {
                        if (ak0Var.h(ij0Var)) {
                            i37 = 1048576;
                        } else {
                            i37 = 524288;
                        }
                        i7 |= i37;
                    }
                    i12 = i6 & 128;
                    if (i12 != 0) {
                        i7 |= 12582912;
                        ij0Var5 = ij0Var2;
                    } else {
                        ij0Var5 = ij0Var2;
                        if ((i3 & 12582912) == 0) {
                            if (ak0Var.h(ij0Var5)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i7 |= i13;
                        }
                    }
                    i14 = i7 | 100663296;
                    i15 = i6 & 512;
                    if (i15 != 0) {
                        if ((805306368 & i3) == 0) {
                            if (ak0Var.h(ij0Var3)) {
                                i16 = 536870912;
                            } else {
                                i16 = 268435456;
                            }
                            i14 |= i16;
                        }
                        i17 = i4 | 54;
                        i18 = i6 & 4096;
                        if (i18 != 0) {
                            i19 = i4 | 438;
                        } else {
                            if ((i4 & 384) != 0) {
                                if (ak0Var.h(ij0Var4)) {
                                    i20 = 256;
                                } else {
                                    i20 = 128;
                                }
                                i17 |= i20;
                            }
                            i19 = i17;
                        }
                        i21 = i6 & 8192;
                        if (i21 != 0) {
                            i23 = i19 | 3072;
                        } else {
                            int i39 = i19;
                            if (ak0Var.g(z3)) {
                                i22 = 2048;
                            } else {
                                i22 = 1024;
                            }
                            i23 = i39 | i22;
                        }
                        i24 = i6 & 16384;
                        if (i24 != 0) {
                            i25 = i23 | 24576;
                        } else {
                            i25 = i23 | (ak0Var.f(io2Var) ? 16384 : 8192);
                        }
                        i26 = i6 & 32768;
                        if (i26 != 0) {
                            i25 |= 196608;
                        } else if ((i4 & 196608) == 0) {
                            i25 |= ak0Var.f(aw0Var) ? 131072 : 65536;
                        }
                        i27 = i25 | 1572864;
                        i28 = i6 & 131072;
                        if (i28 != 0) {
                            i27 = i25 | 14155776;
                        } else if ((i4 & 12582912) == 0) {
                            i27 |= ak0Var.g(z4) ? 8388608 : 4194304;
                        }
                        int i40 = i27 | 838860800;
                        i29 = i6 & 1048576;
                        if (i29 != 0) {
                            i30 = 6;
                        } else if ((i5 & 6) == 0) {
                            if (ak0Var.f(f91Var)) {
                                i31 = 4;
                            } else {
                                i31 = 2;
                            }
                            i30 = i5 | i31;
                        } else {
                            i30 = i5;
                        }
                        int i41 = i30 | 144;
                        if ((i14 & 306783379) != 306783378 && (i40 & 306783379) == 306783378 && (i41 & 147) == 146) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        if (ak0Var.O(i14 & 1, z7)) {
                            ak0Var.T();
                            if ((i3 & 1) != 0 || ak0Var.y()) {
                                if (i38 != 0) {
                                    u71Var2 = r71.a;
                                }
                                if (i8 != 0) {
                                    z5 = true;
                                }
                                if (i10 != 0) {
                                    z6 = false;
                                }
                                vf2 vf2Var4 = (vf2) ak0Var.j(ef2.a);
                                if (i12 != 0) {
                                    ij0Var5 = null;
                                }
                                if (i15 != 0) {
                                    ij0Var9 = null;
                                } else {
                                    ij0Var9 = ij0Var3;
                                }
                                if (i18 != 0) {
                                    ij0Var10 = null;
                                } else {
                                    ij0Var10 = ij0Var4;
                                }
                                if (i21 != 0) {
                                    z12 = false;
                                } else {
                                    z12 = z3;
                                }
                                if (i24 != 0) {
                                    io2Var3 = is1.u;
                                } else {
                                    io2Var3 = io2Var;
                                }
                                if (i26 != 0) {
                                    aw0Var3 = aw0.d;
                                } else {
                                    aw0Var3 = aw0Var;
                                }
                                if (i28 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z4;
                                }
                                if (z13) {
                                    i34 = 1;
                                } else {
                                    i34 = Integer.MAX_VALUE;
                                }
                                f91Var3 = i29 == 0 ? f91Var : null;
                                u32 u32VarA = j42.a(sv0.A, ak0Var);
                                jd2 jd2VarK = q90.k(6, ak0Var);
                                zv0Var3 = zv0.a;
                                u32Var3 = u32VarA;
                                ij0Var11 = ij0Var10;
                                io2Var4 = io2Var3;
                                i35 = i34;
                                i36 = 1;
                                jd2Var3 = jd2VarK;
                                ij0Var12 = ij0Var9;
                                aw0Var4 = aw0Var3;
                                vf2Var3 = vf2Var4;
                                ij0Var13 = ij0Var5;
                                z14 = z5;
                                z15 = z6;
                            } else {
                                ak0Var.R();
                                vf2Var3 = vf2Var;
                                ij0Var12 = ij0Var3;
                                ij0Var11 = ij0Var4;
                                z12 = z3;
                                io2Var4 = io2Var;
                                aw0Var4 = aw0Var;
                                zv0Var3 = zv0Var;
                                z13 = z4;
                                i35 = i;
                                i36 = i2;
                                f91Var3 = f91Var;
                                u32Var3 = u32Var;
                                jd2Var3 = jd2Var;
                                z15 = z6;
                                ij0Var13 = ij0Var5;
                                z14 = z5;
                            }
                            ak0Var.q();
                            if (f91Var3 == null) {
                                ak0Var.W(1310051731);
                                objL = ak0Var.L();
                                if (objL == cv.a) {
                                    objL = new f91();
                                    ak0Var.g0(objL);
                                }
                                f91Var4 = (f91) objL;
                                z16 = false;
                                ak0Var.p(false);
                            } else {
                                z16 = false;
                                ak0Var.W(1981921732);
                                ak0Var.p(false);
                                f91Var4 = f91Var3;
                            }
                            ak0Var.W(1981927842);
                            jB = vf2Var3.b();
                            if (jB == 16) {
                                zBooleanValue = ((Boolean) mx.r(f91Var4, ak0Var, z16 ? 1 : 0).getValue()).booleanValue();
                                if (!z14) {
                                    j = jd2Var3.c;
                                } else if (z12) {
                                    j = jd2Var3.d;
                                } else if (zBooleanValue) {
                                    j = jd2Var3.a;
                                } else {
                                    j = jd2Var3.b;
                                }
                                jB = j;
                                z16 = false;
                            }
                            ak0Var.p(z16);
                            boolean z17 = z12;
                            u71 u71Var4 = u71Var2;
                            zv0 zv0Var4 = zv0Var3;
                            boolean z18 = z13;
                            sv.a(qf2.a.a(jd2Var3.k), vs0.C(1874034984, new qi1(u71Var4, ij0Var, z17, jd2Var3, str, ej0Var, z14, z15, vf2Var3.d(new vf2(jB, 0L, null, 0L, 0, 0L, 16777214)), aw0Var4, zv0Var4, z18, i35, i36, io2Var4, f91Var4, ij0Var13, ij0Var12, ij0Var11, u32Var3), ak0Var), ak0Var, 56);
                            vf2Var2 = vf2Var3;
                            u71Var3 = u71Var4;
                            z10 = z14;
                            z11 = z15;
                            aw0Var2 = aw0Var4;
                            zv0Var2 = zv0Var4;
                            z9 = z18;
                            i32 = i35;
                            i33 = i36;
                            io2Var2 = io2Var4;
                            ij0Var7 = ij0Var13;
                            ij0Var6 = ij0Var12;
                            u32Var2 = u32Var3;
                            f91Var2 = f91Var3;
                            jd2Var2 = jd2Var3;
                            z8 = z17;
                            ij0Var8 = ij0Var11;
                        } else {
                            ak0Var.R();
                            ij0Var6 = ij0Var3;
                            z8 = z3;
                            io2Var2 = io2Var;
                            aw0Var2 = aw0Var;
                            z9 = z4;
                            i32 = i;
                            i33 = i2;
                            f91Var2 = f91Var;
                            u32Var2 = u32Var;
                            jd2Var2 = jd2Var;
                            z10 = z5;
                            z11 = z6;
                            u71Var3 = u71Var2;
                            ij0Var7 = ij0Var5;
                            vf2Var2 = vf2Var;
                            ij0Var8 = ij0Var4;
                            zv0Var2 = zv0Var;
                        }
                        lr1VarR = ak0Var.r();
                        if (lr1VarR != null) {
                            lr1VarR.d = new ij0() { // from class: ni1
                                @Override // defpackage.ij0
                                public final Object g(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iP = ei1.P(i3 | 1);
                                    int iP2 = ei1.P(i4);
                                    int iP3 = ei1.P(i5);
                                    ux.f(str, ej0Var, u71Var3, z10, z11, vf2Var2, ij0Var, ij0Var7, ij0Var6, ij0Var8, z8, io2Var2, aw0Var2, zv0Var2, z9, i32, i33, f91Var2, u32Var2, jd2Var2, (ak0) obj, iP, iP2, iP3, i6);
                                    return ll2.a;
                                }
                            };
                        }
                    }
                    i14 = i7 | 905969664;
                    i17 = i4 | 54;
                    i18 = i6 & 4096;
                    if (i18 != 0) {
                        i19 = i4 | 438;
                    } else {
                        if ((i4 & 384) != 0) {
                            if (ak0Var.h(ij0Var4)) {
                                i20 = 256;
                            } else {
                                i20 = 128;
                            }
                            i17 |= i20;
                        }
                        i19 = i17;
                    }
                    i21 = i6 & 8192;
                    if (i21 != 0) {
                        i23 = i19 | 3072;
                    } else {
                        int i310 = i19;
                        if (ak0Var.g(z3)) {
                            i22 = 2048;
                        } else {
                            i22 = 1024;
                        }
                        i23 = i310 | i22;
                    }
                    i24 = i6 & 16384;
                    if (i24 != 0) {
                        i25 = i23 | 24576;
                    } else {
                        i25 = i23 | (ak0Var.f(io2Var) ? 16384 : 8192);
                    }
                    i26 = i6 & 32768;
                    if (i26 != 0) {
                        i25 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        i25 |= ak0Var.f(aw0Var) ? 131072 : 65536;
                    }
                    i27 = i25 | 1572864;
                    i28 = i6 & 131072;
                    if (i28 != 0) {
                        i27 = i25 | 14155776;
                    } else if ((i4 & 12582912) == 0) {
                        i27 |= ak0Var.g(z4) ? 8388608 : 4194304;
                    }
                    int i42 = i27 | 838860800;
                    i29 = i6 & 1048576;
                    if (i29 != 0) {
                        i30 = 6;
                    } else if ((i5 & 6) == 0) {
                        if (ak0Var.f(f91Var)) {
                            i31 = 4;
                        } else {
                            i31 = 2;
                        }
                        i30 = i5 | i31;
                    } else {
                        i30 = i5;
                    }
                    int i43 = i30 | 144;
                    if ((i14 & 306783379) != 306783378) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (ak0Var.O(i14 & 1, z7)) {
                        ak0Var.T();
                        if ((i3 & 1) != 0) {
                            if (i38 != 0) {
                                u71Var2 = r71.a;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            }
                            if (i10 != 0) {
                                z6 = false;
                            }
                            vf2 vf2Var5 = (vf2) ak0Var.j(ef2.a);
                            if (i12 != 0) {
                                ij0Var5 = null;
                            }
                            if (i15 != 0) {
                                ij0Var9 = null;
                            } else {
                                ij0Var9 = ij0Var3;
                            }
                            if (i18 != 0) {
                                ij0Var10 = null;
                            } else {
                                ij0Var10 = ij0Var4;
                            }
                            if (i21 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i24 != 0) {
                                io2Var3 = is1.u;
                            } else {
                                io2Var3 = io2Var;
                            }
                            if (i26 != 0) {
                                aw0Var3 = aw0.d;
                            } else {
                                aw0Var3 = aw0Var;
                            }
                            if (i28 != 0) {
                                z13 = false;
                            } else {
                                z13 = z4;
                            }
                            if (z13) {
                                i34 = 1;
                            } else {
                                i34 = Integer.MAX_VALUE;
                            }
                            if (i29 == 0) {
                            }
                            u32 u32VarA2 = j42.a(sv0.A, ak0Var);
                            jd2 jd2VarK2 = q90.k(6, ak0Var);
                            zv0Var3 = zv0.a;
                            u32Var3 = u32VarA2;
                            ij0Var11 = ij0Var10;
                            io2Var4 = io2Var3;
                            i35 = i34;
                            i36 = 1;
                            jd2Var3 = jd2VarK2;
                            ij0Var12 = ij0Var9;
                            aw0Var4 = aw0Var3;
                            vf2Var3 = vf2Var5;
                            ij0Var13 = ij0Var5;
                            z14 = z5;
                            z15 = z6;
                        } else {
                            if (i38 != 0) {
                                u71Var2 = r71.a;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            }
                            if (i10 != 0) {
                                z6 = false;
                            }
                            vf2 vf2Var6 = (vf2) ak0Var.j(ef2.a);
                            if (i12 != 0) {
                                ij0Var5 = null;
                            }
                            if (i15 != 0) {
                                ij0Var9 = null;
                            } else {
                                ij0Var9 = ij0Var3;
                            }
                            if (i18 != 0) {
                                ij0Var10 = null;
                            } else {
                                ij0Var10 = ij0Var4;
                            }
                            if (i21 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i24 != 0) {
                                io2Var3 = is1.u;
                            } else {
                                io2Var3 = io2Var;
                            }
                            if (i26 != 0) {
                                aw0Var3 = aw0.d;
                            } else {
                                aw0Var3 = aw0Var;
                            }
                            if (i28 != 0) {
                                z13 = false;
                            } else {
                                z13 = z4;
                            }
                            if (z13) {
                                i34 = 1;
                            } else {
                                i34 = Integer.MAX_VALUE;
                            }
                            if (i29 == 0) {
                            }
                            u32 u32VarA3 = j42.a(sv0.A, ak0Var);
                            jd2 jd2VarK3 = q90.k(6, ak0Var);
                            zv0Var3 = zv0.a;
                            u32Var3 = u32VarA3;
                            ij0Var11 = ij0Var10;
                            io2Var4 = io2Var3;
                            i35 = i34;
                            i36 = 1;
                            jd2Var3 = jd2VarK3;
                            ij0Var12 = ij0Var9;
                            aw0Var4 = aw0Var3;
                            vf2Var3 = vf2Var6;
                            ij0Var13 = ij0Var5;
                            z14 = z5;
                            z15 = z6;
                        }
                        ak0Var.q();
                        if (f91Var3 == null) {
                            ak0Var.W(1310051731);
                            objL = ak0Var.L();
                            if (objL == cv.a) {
                                objL = new f91();
                                ak0Var.g0(objL);
                            }
                            f91Var4 = (f91) objL;
                            z16 = false;
                            ak0Var.p(false);
                        } else {
                            z16 = false;
                            ak0Var.W(1981921732);
                            ak0Var.p(false);
                            f91Var4 = f91Var3;
                        }
                        ak0Var.W(1981927842);
                        jB = vf2Var3.b();
                        if (jB == 16) {
                            zBooleanValue = ((Boolean) mx.r(f91Var4, ak0Var, z16 ? 1 : 0).getValue()).booleanValue();
                            if (!z14) {
                                j = jd2Var3.c;
                            } else if (z12) {
                                j = jd2Var3.d;
                            } else if (zBooleanValue) {
                                j = jd2Var3.a;
                            } else {
                                j = jd2Var3.b;
                            }
                            jB = j;
                            z16 = false;
                        }
                        ak0Var.p(z16);
                        boolean z19 = z12;
                        u71 u71Var5 = u71Var2;
                        zv0 zv0Var5 = zv0Var3;
                        boolean z110 = z13;
                        sv.a(qf2.a.a(jd2Var3.k), vs0.C(1874034984, new qi1(u71Var5, ij0Var, z19, jd2Var3, str, ej0Var, z14, z15, vf2Var3.d(new vf2(jB, 0L, null, 0L, 0, 0L, 16777214)), aw0Var4, zv0Var5, z110, i35, i36, io2Var4, f91Var4, ij0Var13, ij0Var12, ij0Var11, u32Var3), ak0Var), ak0Var, 56);
                        vf2Var2 = vf2Var3;
                        u71Var3 = u71Var5;
                        z10 = z14;
                        z11 = z15;
                        aw0Var2 = aw0Var4;
                        zv0Var2 = zv0Var5;
                        z9 = z110;
                        i32 = i35;
                        i33 = i36;
                        io2Var2 = io2Var4;
                        ij0Var7 = ij0Var13;
                        ij0Var6 = ij0Var12;
                        u32Var2 = u32Var3;
                        f91Var2 = f91Var3;
                        jd2Var2 = jd2Var3;
                        z8 = z19;
                        ij0Var8 = ij0Var11;
                    } else {
                        ak0Var.R();
                        ij0Var6 = ij0Var3;
                        z8 = z3;
                        io2Var2 = io2Var;
                        aw0Var2 = aw0Var;
                        z9 = z4;
                        i32 = i;
                        i33 = i2;
                        f91Var2 = f91Var;
                        u32Var2 = u32Var;
                        jd2Var2 = jd2Var;
                        z10 = z5;
                        z11 = z6;
                        u71Var3 = u71Var2;
                        ij0Var7 = ij0Var5;
                        vf2Var2 = vf2Var;
                        ij0Var8 = ij0Var4;
                        zv0Var2 = zv0Var;
                    }
                    lr1VarR = ak0Var.r();
                    if (lr1VarR != null) {
                        lr1VarR.d = new ij0() { // from class: ni1
                            @Override // defpackage.ij0
                            public final Object g(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = ei1.P(i3 | 1);
                                int iP2 = ei1.P(i4);
                                int iP3 = ei1.P(i5);
                                ux.f(str, ej0Var, u71Var3, z10, z11, vf2Var2, ij0Var, ij0Var7, ij0Var6, ij0Var8, z8, io2Var2, aw0Var2, zv0Var2, z9, i32, i33, f91Var2, u32Var2, jd2Var2, (ak0) obj, iP, iP2, iP3, i6);
                                return ll2.a;
                            }
                        };
                    }
                }
                i7 |= 24576;
                z6 = z2;
                if ((i3 & 196608) == 0) {
                    i7 |= 65536;
                }
                if ((i3 & 1572864) == 0) {
                    if (ak0Var.h(ij0Var)) {
                        i37 = 1048576;
                    } else {
                        i37 = 524288;
                    }
                    i7 |= i37;
                }
                i12 = i6 & 128;
                if (i12 != 0) {
                    i7 |= 12582912;
                    ij0Var5 = ij0Var2;
                } else {
                    ij0Var5 = ij0Var2;
                    if ((i3 & 12582912) == 0) {
                        if (ak0Var.h(ij0Var5)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i7 |= i13;
                    }
                }
                i14 = i7 | 100663296;
                i15 = i6 & 512;
                if (i15 != 0) {
                    if ((805306368 & i3) == 0) {
                        if (ak0Var.h(ij0Var3)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i14 |= i16;
                    }
                    i17 = i4 | 54;
                    i18 = i6 & 4096;
                    if (i18 != 0) {
                        i19 = i4 | 438;
                    } else {
                        if ((i4 & 384) != 0) {
                            if (ak0Var.h(ij0Var4)) {
                                i20 = 256;
                            } else {
                                i20 = 128;
                            }
                            i17 |= i20;
                        }
                        i19 = i17;
                    }
                    i21 = i6 & 8192;
                    if (i21 != 0) {
                        i23 = i19 | 3072;
                    } else {
                        int i311 = i19;
                        if (ak0Var.g(z3)) {
                            i22 = 2048;
                        } else {
                            i22 = 1024;
                        }
                        i23 = i311 | i22;
                    }
                    i24 = i6 & 16384;
                    if (i24 != 0) {
                        i25 = i23 | 24576;
                    } else {
                        i25 = i23 | (ak0Var.f(io2Var) ? 16384 : 8192);
                    }
                    i26 = i6 & 32768;
                    if (i26 != 0) {
                        i25 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        i25 |= ak0Var.f(aw0Var) ? 131072 : 65536;
                    }
                    i27 = i25 | 1572864;
                    i28 = i6 & 131072;
                    if (i28 != 0) {
                        i27 = i25 | 14155776;
                    } else if ((i4 & 12582912) == 0) {
                        i27 |= ak0Var.g(z4) ? 8388608 : 4194304;
                    }
                    int i44 = i27 | 838860800;
                    i29 = i6 & 1048576;
                    if (i29 != 0) {
                        i30 = 6;
                    } else if ((i5 & 6) == 0) {
                        if (ak0Var.f(f91Var)) {
                            i31 = 4;
                        } else {
                            i31 = 2;
                        }
                        i30 = i5 | i31;
                    } else {
                        i30 = i5;
                    }
                    int i45 = i30 | 144;
                    if ((i14 & 306783379) != 306783378) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (ak0Var.O(i14 & 1, z7)) {
                        ak0Var.T();
                        if ((i3 & 1) != 0) {
                            if (i38 != 0) {
                                u71Var2 = r71.a;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            }
                            if (i10 != 0) {
                                z6 = false;
                            }
                            vf2 vf2Var7 = (vf2) ak0Var.j(ef2.a);
                            if (i12 != 0) {
                                ij0Var5 = null;
                            }
                            if (i15 != 0) {
                                ij0Var9 = null;
                            } else {
                                ij0Var9 = ij0Var3;
                            }
                            if (i18 != 0) {
                                ij0Var10 = null;
                            } else {
                                ij0Var10 = ij0Var4;
                            }
                            if (i21 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i24 != 0) {
                                io2Var3 = is1.u;
                            } else {
                                io2Var3 = io2Var;
                            }
                            if (i26 != 0) {
                                aw0Var3 = aw0.d;
                            } else {
                                aw0Var3 = aw0Var;
                            }
                            if (i28 != 0) {
                                z13 = false;
                            } else {
                                z13 = z4;
                            }
                            if (z13) {
                                i34 = 1;
                            } else {
                                i34 = Integer.MAX_VALUE;
                            }
                            if (i29 == 0) {
                            }
                            u32 u32VarA4 = j42.a(sv0.A, ak0Var);
                            jd2 jd2VarK4 = q90.k(6, ak0Var);
                            zv0Var3 = zv0.a;
                            u32Var3 = u32VarA4;
                            ij0Var11 = ij0Var10;
                            io2Var4 = io2Var3;
                            i35 = i34;
                            i36 = 1;
                            jd2Var3 = jd2VarK4;
                            ij0Var12 = ij0Var9;
                            aw0Var4 = aw0Var3;
                            vf2Var3 = vf2Var7;
                            ij0Var13 = ij0Var5;
                            z14 = z5;
                            z15 = z6;
                        } else {
                            if (i38 != 0) {
                                u71Var2 = r71.a;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            }
                            if (i10 != 0) {
                                z6 = false;
                            }
                            vf2 vf2Var8 = (vf2) ak0Var.j(ef2.a);
                            if (i12 != 0) {
                                ij0Var5 = null;
                            }
                            if (i15 != 0) {
                                ij0Var9 = null;
                            } else {
                                ij0Var9 = ij0Var3;
                            }
                            if (i18 != 0) {
                                ij0Var10 = null;
                            } else {
                                ij0Var10 = ij0Var4;
                            }
                            if (i21 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i24 != 0) {
                                io2Var3 = is1.u;
                            } else {
                                io2Var3 = io2Var;
                            }
                            if (i26 != 0) {
                                aw0Var3 = aw0.d;
                            } else {
                                aw0Var3 = aw0Var;
                            }
                            if (i28 != 0) {
                                z13 = false;
                            } else {
                                z13 = z4;
                            }
                            if (z13) {
                                i34 = 1;
                            } else {
                                i34 = Integer.MAX_VALUE;
                            }
                            if (i29 == 0) {
                            }
                            u32 u32VarA5 = j42.a(sv0.A, ak0Var);
                            jd2 jd2VarK5 = q90.k(6, ak0Var);
                            zv0Var3 = zv0.a;
                            u32Var3 = u32VarA5;
                            ij0Var11 = ij0Var10;
                            io2Var4 = io2Var3;
                            i35 = i34;
                            i36 = 1;
                            jd2Var3 = jd2VarK5;
                            ij0Var12 = ij0Var9;
                            aw0Var4 = aw0Var3;
                            vf2Var3 = vf2Var8;
                            ij0Var13 = ij0Var5;
                            z14 = z5;
                            z15 = z6;
                        }
                        ak0Var.q();
                        if (f91Var3 == null) {
                            ak0Var.W(1310051731);
                            objL = ak0Var.L();
                            if (objL == cv.a) {
                                objL = new f91();
                                ak0Var.g0(objL);
                            }
                            f91Var4 = (f91) objL;
                            z16 = false;
                            ak0Var.p(false);
                        } else {
                            z16 = false;
                            ak0Var.W(1981921732);
                            ak0Var.p(false);
                            f91Var4 = f91Var3;
                        }
                        ak0Var.W(1981927842);
                        jB = vf2Var3.b();
                        if (jB == 16) {
                            zBooleanValue = ((Boolean) mx.r(f91Var4, ak0Var, z16 ? 1 : 0).getValue()).booleanValue();
                            if (!z14) {
                                j = jd2Var3.c;
                            } else if (z12) {
                                j = jd2Var3.d;
                            } else if (zBooleanValue) {
                                j = jd2Var3.a;
                            } else {
                                j = jd2Var3.b;
                            }
                            jB = j;
                            z16 = false;
                        }
                        ak0Var.p(z16);
                        boolean z111 = z12;
                        u71 u71Var6 = u71Var2;
                        zv0 zv0Var6 = zv0Var3;
                        boolean z112 = z13;
                        sv.a(qf2.a.a(jd2Var3.k), vs0.C(1874034984, new qi1(u71Var6, ij0Var, z111, jd2Var3, str, ej0Var, z14, z15, vf2Var3.d(new vf2(jB, 0L, null, 0L, 0, 0L, 16777214)), aw0Var4, zv0Var6, z112, i35, i36, io2Var4, f91Var4, ij0Var13, ij0Var12, ij0Var11, u32Var3), ak0Var), ak0Var, 56);
                        vf2Var2 = vf2Var3;
                        u71Var3 = u71Var6;
                        z10 = z14;
                        z11 = z15;
                        aw0Var2 = aw0Var4;
                        zv0Var2 = zv0Var6;
                        z9 = z112;
                        i32 = i35;
                        i33 = i36;
                        io2Var2 = io2Var4;
                        ij0Var7 = ij0Var13;
                        ij0Var6 = ij0Var12;
                        u32Var2 = u32Var3;
                        f91Var2 = f91Var3;
                        jd2Var2 = jd2Var3;
                        z8 = z111;
                        ij0Var8 = ij0Var11;
                    } else {
                        ak0Var.R();
                        ij0Var6 = ij0Var3;
                        z8 = z3;
                        io2Var2 = io2Var;
                        aw0Var2 = aw0Var;
                        z9 = z4;
                        i32 = i;
                        i33 = i2;
                        f91Var2 = f91Var;
                        u32Var2 = u32Var;
                        jd2Var2 = jd2Var;
                        z10 = z5;
                        z11 = z6;
                        u71Var3 = u71Var2;
                        ij0Var7 = ij0Var5;
                        vf2Var2 = vf2Var;
                        ij0Var8 = ij0Var4;
                        zv0Var2 = zv0Var;
                    }
                    lr1VarR = ak0Var.r();
                    if (lr1VarR != null) {
                        lr1VarR.d = new ij0() { // from class: ni1
                            @Override // defpackage.ij0
                            public final Object g(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = ei1.P(i3 | 1);
                                int iP2 = ei1.P(i4);
                                int iP3 = ei1.P(i5);
                                ux.f(str, ej0Var, u71Var3, z10, z11, vf2Var2, ij0Var, ij0Var7, ij0Var6, ij0Var8, z8, io2Var2, aw0Var2, zv0Var2, z9, i32, i33, f91Var2, u32Var2, jd2Var2, (ak0) obj, iP, iP2, iP3, i6);
                                return ll2.a;
                            }
                        };
                    }
                }
                i14 = i7 | 905969664;
                i17 = i4 | 54;
                i18 = i6 & 4096;
                if (i18 != 0) {
                    i19 = i4 | 438;
                } else {
                    if ((i4 & 384) != 0) {
                        if (ak0Var.h(ij0Var4)) {
                            i20 = 256;
                        } else {
                            i20 = 128;
                        }
                        i17 |= i20;
                    }
                    i19 = i17;
                }
                i21 = i6 & 8192;
                if (i21 != 0) {
                    i23 = i19 | 3072;
                } else {
                    int i312 = i19;
                    if (ak0Var.g(z3)) {
                        i22 = 2048;
                    } else {
                        i22 = 1024;
                    }
                    i23 = i312 | i22;
                }
                i24 = i6 & 16384;
                if (i24 != 0) {
                    i25 = i23 | 24576;
                } else {
                    i25 = i23 | (ak0Var.f(io2Var) ? 16384 : 8192);
                }
                i26 = i6 & 32768;
                if (i26 != 0) {
                    i25 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i25 |= ak0Var.f(aw0Var) ? 131072 : 65536;
                }
                i27 = i25 | 1572864;
                i28 = i6 & 131072;
                if (i28 != 0) {
                    i27 = i25 | 14155776;
                } else if ((i4 & 12582912) == 0) {
                    i27 |= ak0Var.g(z4) ? 8388608 : 4194304;
                }
                int i46 = i27 | 838860800;
                i29 = i6 & 1048576;
                if (i29 != 0) {
                    i30 = 6;
                } else if ((i5 & 6) == 0) {
                    if (ak0Var.f(f91Var)) {
                        i31 = 4;
                    } else {
                        i31 = 2;
                    }
                    i30 = i5 | i31;
                } else {
                    i30 = i5;
                }
                int i47 = i30 | 144;
                if ((i14 & 306783379) != 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (ak0Var.O(i14 & 1, z7)) {
                    ak0Var.T();
                    if ((i3 & 1) != 0) {
                        if (i38 != 0) {
                            u71Var2 = r71.a;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        }
                        vf2 vf2Var9 = (vf2) ak0Var.j(ef2.a);
                        if (i12 != 0) {
                            ij0Var5 = null;
                        }
                        if (i15 != 0) {
                            ij0Var9 = null;
                        } else {
                            ij0Var9 = ij0Var3;
                        }
                        if (i18 != 0) {
                            ij0Var10 = null;
                        } else {
                            ij0Var10 = ij0Var4;
                        }
                        if (i21 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i24 != 0) {
                            io2Var3 = is1.u;
                        } else {
                            io2Var3 = io2Var;
                        }
                        if (i26 != 0) {
                            aw0Var3 = aw0.d;
                        } else {
                            aw0Var3 = aw0Var;
                        }
                        if (i28 != 0) {
                            z13 = false;
                        } else {
                            z13 = z4;
                        }
                        if (z13) {
                            i34 = 1;
                        } else {
                            i34 = Integer.MAX_VALUE;
                        }
                        if (i29 == 0) {
                        }
                        u32 u32VarA6 = j42.a(sv0.A, ak0Var);
                        jd2 jd2VarK6 = q90.k(6, ak0Var);
                        zv0Var3 = zv0.a;
                        u32Var3 = u32VarA6;
                        ij0Var11 = ij0Var10;
                        io2Var4 = io2Var3;
                        i35 = i34;
                        i36 = 1;
                        jd2Var3 = jd2VarK6;
                        ij0Var12 = ij0Var9;
                        aw0Var4 = aw0Var3;
                        vf2Var3 = vf2Var9;
                        ij0Var13 = ij0Var5;
                        z14 = z5;
                        z15 = z6;
                    } else {
                        if (i38 != 0) {
                            u71Var2 = r71.a;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        }
                        vf2 vf2Var10 = (vf2) ak0Var.j(ef2.a);
                        if (i12 != 0) {
                            ij0Var5 = null;
                        }
                        if (i15 != 0) {
                            ij0Var9 = null;
                        } else {
                            ij0Var9 = ij0Var3;
                        }
                        if (i18 != 0) {
                            ij0Var10 = null;
                        } else {
                            ij0Var10 = ij0Var4;
                        }
                        if (i21 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i24 != 0) {
                            io2Var3 = is1.u;
                        } else {
                            io2Var3 = io2Var;
                        }
                        if (i26 != 0) {
                            aw0Var3 = aw0.d;
                        } else {
                            aw0Var3 = aw0Var;
                        }
                        if (i28 != 0) {
                            z13 = false;
                        } else {
                            z13 = z4;
                        }
                        if (z13) {
                            i34 = 1;
                        } else {
                            i34 = Integer.MAX_VALUE;
                        }
                        if (i29 == 0) {
                        }
                        u32 u32VarA7 = j42.a(sv0.A, ak0Var);
                        jd2 jd2VarK7 = q90.k(6, ak0Var);
                        zv0Var3 = zv0.a;
                        u32Var3 = u32VarA7;
                        ij0Var11 = ij0Var10;
                        io2Var4 = io2Var3;
                        i35 = i34;
                        i36 = 1;
                        jd2Var3 = jd2VarK7;
                        ij0Var12 = ij0Var9;
                        aw0Var4 = aw0Var3;
                        vf2Var3 = vf2Var10;
                        ij0Var13 = ij0Var5;
                        z14 = z5;
                        z15 = z6;
                    }
                    ak0Var.q();
                    if (f91Var3 == null) {
                        ak0Var.W(1310051731);
                        objL = ak0Var.L();
                        if (objL == cv.a) {
                            objL = new f91();
                            ak0Var.g0(objL);
                        }
                        f91Var4 = (f91) objL;
                        z16 = false;
                        ak0Var.p(false);
                    } else {
                        z16 = false;
                        ak0Var.W(1981921732);
                        ak0Var.p(false);
                        f91Var4 = f91Var3;
                    }
                    ak0Var.W(1981927842);
                    jB = vf2Var3.b();
                    if (jB == 16) {
                        zBooleanValue = ((Boolean) mx.r(f91Var4, ak0Var, z16 ? 1 : 0).getValue()).booleanValue();
                        if (!z14) {
                            j = jd2Var3.c;
                        } else if (z12) {
                            j = jd2Var3.d;
                        } else if (zBooleanValue) {
                            j = jd2Var3.a;
                        } else {
                            j = jd2Var3.b;
                        }
                        jB = j;
                        z16 = false;
                    }
                    ak0Var.p(z16);
                    boolean z113 = z12;
                    u71 u71Var7 = u71Var2;
                    zv0 zv0Var7 = zv0Var3;
                    boolean z114 = z13;
                    sv.a(qf2.a.a(jd2Var3.k), vs0.C(1874034984, new qi1(u71Var7, ij0Var, z113, jd2Var3, str, ej0Var, z14, z15, vf2Var3.d(new vf2(jB, 0L, null, 0L, 0, 0L, 16777214)), aw0Var4, zv0Var7, z114, i35, i36, io2Var4, f91Var4, ij0Var13, ij0Var12, ij0Var11, u32Var3), ak0Var), ak0Var, 56);
                    vf2Var2 = vf2Var3;
                    u71Var3 = u71Var7;
                    z10 = z14;
                    z11 = z15;
                    aw0Var2 = aw0Var4;
                    zv0Var2 = zv0Var7;
                    z9 = z114;
                    i32 = i35;
                    i33 = i36;
                    io2Var2 = io2Var4;
                    ij0Var7 = ij0Var13;
                    ij0Var6 = ij0Var12;
                    u32Var2 = u32Var3;
                    f91Var2 = f91Var3;
                    jd2Var2 = jd2Var3;
                    z8 = z113;
                    ij0Var8 = ij0Var11;
                } else {
                    ak0Var.R();
                    ij0Var6 = ij0Var3;
                    z8 = z3;
                    io2Var2 = io2Var;
                    aw0Var2 = aw0Var;
                    z9 = z4;
                    i32 = i;
                    i33 = i2;
                    f91Var2 = f91Var;
                    u32Var2 = u32Var;
                    jd2Var2 = jd2Var;
                    z10 = z5;
                    z11 = z6;
                    u71Var3 = u71Var2;
                    ij0Var7 = ij0Var5;
                    vf2Var2 = vf2Var;
                    ij0Var8 = ij0Var4;
                    zv0Var2 = zv0Var;
                }
                lr1VarR = ak0Var.r();
                if (lr1VarR != null) {
                    lr1VarR.d = new ij0() { // from class: ni1
                        @Override // defpackage.ij0
                        public final Object g(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = ei1.P(i3 | 1);
                            int iP2 = ei1.P(i4);
                            int iP3 = ei1.P(i5);
                            ux.f(str, ej0Var, u71Var3, z10, z11, vf2Var2, ij0Var, ij0Var7, ij0Var6, ij0Var8, z8, io2Var2, aw0Var2, zv0Var2, z9, i32, i33, f91Var2, u32Var2, jd2Var2, (ak0) obj, iP, iP2, iP3, i6);
                            return ll2.a;
                        }
                    };
                }
            }
            i7 |= 3072;
            z5 = z;
            i10 = i6 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    z6 = z2;
                    if (ak0Var.g(z6)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i7 |= i11;
                }
                if ((i3 & 196608) == 0) {
                    i7 |= 65536;
                }
                if ((i3 & 1572864) == 0) {
                    if (ak0Var.h(ij0Var)) {
                        i37 = 1048576;
                    } else {
                        i37 = 524288;
                    }
                    i7 |= i37;
                }
                i12 = i6 & 128;
                if (i12 != 0) {
                    i7 |= 12582912;
                    ij0Var5 = ij0Var2;
                } else {
                    ij0Var5 = ij0Var2;
                    if ((i3 & 12582912) == 0) {
                        if (ak0Var.h(ij0Var5)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i7 |= i13;
                    }
                }
                i14 = i7 | 100663296;
                i15 = i6 & 512;
                if (i15 != 0) {
                    if ((805306368 & i3) == 0) {
                        if (ak0Var.h(ij0Var3)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i14 |= i16;
                    }
                    i17 = i4 | 54;
                    i18 = i6 & 4096;
                    if (i18 != 0) {
                        i19 = i4 | 438;
                    } else {
                        if ((i4 & 384) != 0) {
                            if (ak0Var.h(ij0Var4)) {
                                i20 = 256;
                            } else {
                                i20 = 128;
                            }
                            i17 |= i20;
                        }
                        i19 = i17;
                    }
                    i21 = i6 & 8192;
                    if (i21 != 0) {
                        i23 = i19 | 3072;
                    } else {
                        int i313 = i19;
                        if (ak0Var.g(z3)) {
                            i22 = 2048;
                        } else {
                            i22 = 1024;
                        }
                        i23 = i313 | i22;
                    }
                    i24 = i6 & 16384;
                    if (i24 != 0) {
                        i25 = i23 | 24576;
                    } else {
                        i25 = i23 | (ak0Var.f(io2Var) ? 16384 : 8192);
                    }
                    i26 = i6 & 32768;
                    if (i26 != 0) {
                        i25 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        i25 |= ak0Var.f(aw0Var) ? 131072 : 65536;
                    }
                    i27 = i25 | 1572864;
                    i28 = i6 & 131072;
                    if (i28 != 0) {
                        i27 = i25 | 14155776;
                    } else if ((i4 & 12582912) == 0) {
                        i27 |= ak0Var.g(z4) ? 8388608 : 4194304;
                    }
                    int i48 = i27 | 838860800;
                    i29 = i6 & 1048576;
                    if (i29 != 0) {
                        i30 = 6;
                    } else if ((i5 & 6) == 0) {
                        if (ak0Var.f(f91Var)) {
                            i31 = 4;
                        } else {
                            i31 = 2;
                        }
                        i30 = i5 | i31;
                    } else {
                        i30 = i5;
                    }
                    int i49 = i30 | 144;
                    if ((i14 & 306783379) != 306783378) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (ak0Var.O(i14 & 1, z7)) {
                        ak0Var.T();
                        if ((i3 & 1) != 0) {
                            if (i38 != 0) {
                                u71Var2 = r71.a;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            }
                            if (i10 != 0) {
                                z6 = false;
                            }
                            vf2 vf2Var11 = (vf2) ak0Var.j(ef2.a);
                            if (i12 != 0) {
                                ij0Var5 = null;
                            }
                            if (i15 != 0) {
                                ij0Var9 = null;
                            } else {
                                ij0Var9 = ij0Var3;
                            }
                            if (i18 != 0) {
                                ij0Var10 = null;
                            } else {
                                ij0Var10 = ij0Var4;
                            }
                            if (i21 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i24 != 0) {
                                io2Var3 = is1.u;
                            } else {
                                io2Var3 = io2Var;
                            }
                            if (i26 != 0) {
                                aw0Var3 = aw0.d;
                            } else {
                                aw0Var3 = aw0Var;
                            }
                            if (i28 != 0) {
                                z13 = false;
                            } else {
                                z13 = z4;
                            }
                            if (z13) {
                                i34 = 1;
                            } else {
                                i34 = Integer.MAX_VALUE;
                            }
                            if (i29 == 0) {
                            }
                            u32 u32VarA8 = j42.a(sv0.A, ak0Var);
                            jd2 jd2VarK8 = q90.k(6, ak0Var);
                            zv0Var3 = zv0.a;
                            u32Var3 = u32VarA8;
                            ij0Var11 = ij0Var10;
                            io2Var4 = io2Var3;
                            i35 = i34;
                            i36 = 1;
                            jd2Var3 = jd2VarK8;
                            ij0Var12 = ij0Var9;
                            aw0Var4 = aw0Var3;
                            vf2Var3 = vf2Var11;
                            ij0Var13 = ij0Var5;
                            z14 = z5;
                            z15 = z6;
                        } else {
                            if (i38 != 0) {
                                u71Var2 = r71.a;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            }
                            if (i10 != 0) {
                                z6 = false;
                            }
                            vf2 vf2Var12 = (vf2) ak0Var.j(ef2.a);
                            if (i12 != 0) {
                                ij0Var5 = null;
                            }
                            if (i15 != 0) {
                                ij0Var9 = null;
                            } else {
                                ij0Var9 = ij0Var3;
                            }
                            if (i18 != 0) {
                                ij0Var10 = null;
                            } else {
                                ij0Var10 = ij0Var4;
                            }
                            if (i21 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i24 != 0) {
                                io2Var3 = is1.u;
                            } else {
                                io2Var3 = io2Var;
                            }
                            if (i26 != 0) {
                                aw0Var3 = aw0.d;
                            } else {
                                aw0Var3 = aw0Var;
                            }
                            if (i28 != 0) {
                                z13 = false;
                            } else {
                                z13 = z4;
                            }
                            if (z13) {
                                i34 = 1;
                            } else {
                                i34 = Integer.MAX_VALUE;
                            }
                            if (i29 == 0) {
                            }
                            u32 u32VarA9 = j42.a(sv0.A, ak0Var);
                            jd2 jd2VarK9 = q90.k(6, ak0Var);
                            zv0Var3 = zv0.a;
                            u32Var3 = u32VarA9;
                            ij0Var11 = ij0Var10;
                            io2Var4 = io2Var3;
                            i35 = i34;
                            i36 = 1;
                            jd2Var3 = jd2VarK9;
                            ij0Var12 = ij0Var9;
                            aw0Var4 = aw0Var3;
                            vf2Var3 = vf2Var12;
                            ij0Var13 = ij0Var5;
                            z14 = z5;
                            z15 = z6;
                        }
                        ak0Var.q();
                        if (f91Var3 == null) {
                            ak0Var.W(1310051731);
                            objL = ak0Var.L();
                            if (objL == cv.a) {
                                objL = new f91();
                                ak0Var.g0(objL);
                            }
                            f91Var4 = (f91) objL;
                            z16 = false;
                            ak0Var.p(false);
                        } else {
                            z16 = false;
                            ak0Var.W(1981921732);
                            ak0Var.p(false);
                            f91Var4 = f91Var3;
                        }
                        ak0Var.W(1981927842);
                        jB = vf2Var3.b();
                        if (jB == 16) {
                            zBooleanValue = ((Boolean) mx.r(f91Var4, ak0Var, z16 ? 1 : 0).getValue()).booleanValue();
                            if (!z14) {
                                j = jd2Var3.c;
                            } else if (z12) {
                                j = jd2Var3.d;
                            } else if (zBooleanValue) {
                                j = jd2Var3.a;
                            } else {
                                j = jd2Var3.b;
                            }
                            jB = j;
                            z16 = false;
                        }
                        ak0Var.p(z16);
                        boolean z115 = z12;
                        u71 u71Var8 = u71Var2;
                        zv0 zv0Var8 = zv0Var3;
                        boolean z116 = z13;
                        sv.a(qf2.a.a(jd2Var3.k), vs0.C(1874034984, new qi1(u71Var8, ij0Var, z115, jd2Var3, str, ej0Var, z14, z15, vf2Var3.d(new vf2(jB, 0L, null, 0L, 0, 0L, 16777214)), aw0Var4, zv0Var8, z116, i35, i36, io2Var4, f91Var4, ij0Var13, ij0Var12, ij0Var11, u32Var3), ak0Var), ak0Var, 56);
                        vf2Var2 = vf2Var3;
                        u71Var3 = u71Var8;
                        z10 = z14;
                        z11 = z15;
                        aw0Var2 = aw0Var4;
                        zv0Var2 = zv0Var8;
                        z9 = z116;
                        i32 = i35;
                        i33 = i36;
                        io2Var2 = io2Var4;
                        ij0Var7 = ij0Var13;
                        ij0Var6 = ij0Var12;
                        u32Var2 = u32Var3;
                        f91Var2 = f91Var3;
                        jd2Var2 = jd2Var3;
                        z8 = z115;
                        ij0Var8 = ij0Var11;
                    } else {
                        ak0Var.R();
                        ij0Var6 = ij0Var3;
                        z8 = z3;
                        io2Var2 = io2Var;
                        aw0Var2 = aw0Var;
                        z9 = z4;
                        i32 = i;
                        i33 = i2;
                        f91Var2 = f91Var;
                        u32Var2 = u32Var;
                        jd2Var2 = jd2Var;
                        z10 = z5;
                        z11 = z6;
                        u71Var3 = u71Var2;
                        ij0Var7 = ij0Var5;
                        vf2Var2 = vf2Var;
                        ij0Var8 = ij0Var4;
                        zv0Var2 = zv0Var;
                    }
                    lr1VarR = ak0Var.r();
                    if (lr1VarR != null) {
                        lr1VarR.d = new ij0() { // from class: ni1
                            @Override // defpackage.ij0
                            public final Object g(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = ei1.P(i3 | 1);
                                int iP2 = ei1.P(i4);
                                int iP3 = ei1.P(i5);
                                ux.f(str, ej0Var, u71Var3, z10, z11, vf2Var2, ij0Var, ij0Var7, ij0Var6, ij0Var8, z8, io2Var2, aw0Var2, zv0Var2, z9, i32, i33, f91Var2, u32Var2, jd2Var2, (ak0) obj, iP, iP2, iP3, i6);
                                return ll2.a;
                            }
                        };
                    }
                }
                i14 = i7 | 905969664;
                i17 = i4 | 54;
                i18 = i6 & 4096;
                if (i18 != 0) {
                    i19 = i4 | 438;
                } else {
                    if ((i4 & 384) != 0) {
                        if (ak0Var.h(ij0Var4)) {
                            i20 = 256;
                        } else {
                            i20 = 128;
                        }
                        i17 |= i20;
                    }
                    i19 = i17;
                }
                i21 = i6 & 8192;
                if (i21 != 0) {
                    i23 = i19 | 3072;
                } else {
                    int i314 = i19;
                    if (ak0Var.g(z3)) {
                        i22 = 2048;
                    } else {
                        i22 = 1024;
                    }
                    i23 = i314 | i22;
                }
                i24 = i6 & 16384;
                if (i24 != 0) {
                    i25 = i23 | 24576;
                } else {
                    i25 = i23 | (ak0Var.f(io2Var) ? 16384 : 8192);
                }
                i26 = i6 & 32768;
                if (i26 != 0) {
                    i25 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i25 |= ak0Var.f(aw0Var) ? 131072 : 65536;
                }
                i27 = i25 | 1572864;
                i28 = i6 & 131072;
                if (i28 != 0) {
                    i27 = i25 | 14155776;
                } else if ((i4 & 12582912) == 0) {
                    i27 |= ak0Var.g(z4) ? 8388608 : 4194304;
                }
                int i410 = i27 | 838860800;
                i29 = i6 & 1048576;
                if (i29 != 0) {
                    i30 = 6;
                } else if ((i5 & 6) == 0) {
                    if (ak0Var.f(f91Var)) {
                        i31 = 4;
                    } else {
                        i31 = 2;
                    }
                    i30 = i5 | i31;
                } else {
                    i30 = i5;
                }
                int i411 = i30 | 144;
                if ((i14 & 306783379) != 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (ak0Var.O(i14 & 1, z7)) {
                    ak0Var.T();
                    if ((i3 & 1) != 0) {
                        if (i38 != 0) {
                            u71Var2 = r71.a;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        }
                        vf2 vf2Var13 = (vf2) ak0Var.j(ef2.a);
                        if (i12 != 0) {
                            ij0Var5 = null;
                        }
                        if (i15 != 0) {
                            ij0Var9 = null;
                        } else {
                            ij0Var9 = ij0Var3;
                        }
                        if (i18 != 0) {
                            ij0Var10 = null;
                        } else {
                            ij0Var10 = ij0Var4;
                        }
                        if (i21 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i24 != 0) {
                            io2Var3 = is1.u;
                        } else {
                            io2Var3 = io2Var;
                        }
                        if (i26 != 0) {
                            aw0Var3 = aw0.d;
                        } else {
                            aw0Var3 = aw0Var;
                        }
                        if (i28 != 0) {
                            z13 = false;
                        } else {
                            z13 = z4;
                        }
                        if (z13) {
                            i34 = 1;
                        } else {
                            i34 = Integer.MAX_VALUE;
                        }
                        if (i29 == 0) {
                        }
                        u32 u32VarA10 = j42.a(sv0.A, ak0Var);
                        jd2 jd2VarK10 = q90.k(6, ak0Var);
                        zv0Var3 = zv0.a;
                        u32Var3 = u32VarA10;
                        ij0Var11 = ij0Var10;
                        io2Var4 = io2Var3;
                        i35 = i34;
                        i36 = 1;
                        jd2Var3 = jd2VarK10;
                        ij0Var12 = ij0Var9;
                        aw0Var4 = aw0Var3;
                        vf2Var3 = vf2Var13;
                        ij0Var13 = ij0Var5;
                        z14 = z5;
                        z15 = z6;
                    } else {
                        if (i38 != 0) {
                            u71Var2 = r71.a;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        }
                        vf2 vf2Var14 = (vf2) ak0Var.j(ef2.a);
                        if (i12 != 0) {
                            ij0Var5 = null;
                        }
                        if (i15 != 0) {
                            ij0Var9 = null;
                        } else {
                            ij0Var9 = ij0Var3;
                        }
                        if (i18 != 0) {
                            ij0Var10 = null;
                        } else {
                            ij0Var10 = ij0Var4;
                        }
                        if (i21 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i24 != 0) {
                            io2Var3 = is1.u;
                        } else {
                            io2Var3 = io2Var;
                        }
                        if (i26 != 0) {
                            aw0Var3 = aw0.d;
                        } else {
                            aw0Var3 = aw0Var;
                        }
                        if (i28 != 0) {
                            z13 = false;
                        } else {
                            z13 = z4;
                        }
                        if (z13) {
                            i34 = 1;
                        } else {
                            i34 = Integer.MAX_VALUE;
                        }
                        if (i29 == 0) {
                        }
                        u32 u32VarA11 = j42.a(sv0.A, ak0Var);
                        jd2 jd2VarK11 = q90.k(6, ak0Var);
                        zv0Var3 = zv0.a;
                        u32Var3 = u32VarA11;
                        ij0Var11 = ij0Var10;
                        io2Var4 = io2Var3;
                        i35 = i34;
                        i36 = 1;
                        jd2Var3 = jd2VarK11;
                        ij0Var12 = ij0Var9;
                        aw0Var4 = aw0Var3;
                        vf2Var3 = vf2Var14;
                        ij0Var13 = ij0Var5;
                        z14 = z5;
                        z15 = z6;
                    }
                    ak0Var.q();
                    if (f91Var3 == null) {
                        ak0Var.W(1310051731);
                        objL = ak0Var.L();
                        if (objL == cv.a) {
                            objL = new f91();
                            ak0Var.g0(objL);
                        }
                        f91Var4 = (f91) objL;
                        z16 = false;
                        ak0Var.p(false);
                    } else {
                        z16 = false;
                        ak0Var.W(1981921732);
                        ak0Var.p(false);
                        f91Var4 = f91Var3;
                    }
                    ak0Var.W(1981927842);
                    jB = vf2Var3.b();
                    if (jB == 16) {
                        zBooleanValue = ((Boolean) mx.r(f91Var4, ak0Var, z16 ? 1 : 0).getValue()).booleanValue();
                        if (!z14) {
                            j = jd2Var3.c;
                        } else if (z12) {
                            j = jd2Var3.d;
                        } else if (zBooleanValue) {
                            j = jd2Var3.a;
                        } else {
                            j = jd2Var3.b;
                        }
                        jB = j;
                        z16 = false;
                    }
                    ak0Var.p(z16);
                    boolean z117 = z12;
                    u71 u71Var9 = u71Var2;
                    zv0 zv0Var9 = zv0Var3;
                    boolean z118 = z13;
                    sv.a(qf2.a.a(jd2Var3.k), vs0.C(1874034984, new qi1(u71Var9, ij0Var, z117, jd2Var3, str, ej0Var, z14, z15, vf2Var3.d(new vf2(jB, 0L, null, 0L, 0, 0L, 16777214)), aw0Var4, zv0Var9, z118, i35, i36, io2Var4, f91Var4, ij0Var13, ij0Var12, ij0Var11, u32Var3), ak0Var), ak0Var, 56);
                    vf2Var2 = vf2Var3;
                    u71Var3 = u71Var9;
                    z10 = z14;
                    z11 = z15;
                    aw0Var2 = aw0Var4;
                    zv0Var2 = zv0Var9;
                    z9 = z118;
                    i32 = i35;
                    i33 = i36;
                    io2Var2 = io2Var4;
                    ij0Var7 = ij0Var13;
                    ij0Var6 = ij0Var12;
                    u32Var2 = u32Var3;
                    f91Var2 = f91Var3;
                    jd2Var2 = jd2Var3;
                    z8 = z117;
                    ij0Var8 = ij0Var11;
                } else {
                    ak0Var.R();
                    ij0Var6 = ij0Var3;
                    z8 = z3;
                    io2Var2 = io2Var;
                    aw0Var2 = aw0Var;
                    z9 = z4;
                    i32 = i;
                    i33 = i2;
                    f91Var2 = f91Var;
                    u32Var2 = u32Var;
                    jd2Var2 = jd2Var;
                    z10 = z5;
                    z11 = z6;
                    u71Var3 = u71Var2;
                    ij0Var7 = ij0Var5;
                    vf2Var2 = vf2Var;
                    ij0Var8 = ij0Var4;
                    zv0Var2 = zv0Var;
                }
                lr1VarR = ak0Var.r();
                if (lr1VarR != null) {
                    lr1VarR.d = new ij0() { // from class: ni1
                        @Override // defpackage.ij0
                        public final Object g(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = ei1.P(i3 | 1);
                            int iP2 = ei1.P(i4);
                            int iP3 = ei1.P(i5);
                            ux.f(str, ej0Var, u71Var3, z10, z11, vf2Var2, ij0Var, ij0Var7, ij0Var6, ij0Var8, z8, io2Var2, aw0Var2, zv0Var2, z9, i32, i33, f91Var2, u32Var2, jd2Var2, (ak0) obj, iP, iP2, iP3, i6);
                            return ll2.a;
                        }
                    };
                }
            }
            i7 |= 24576;
            z6 = z2;
            if ((i3 & 196608) == 0) {
                i7 |= 65536;
            }
            if ((i3 & 1572864) == 0) {
                if (ak0Var.h(ij0Var)) {
                    i37 = 1048576;
                } else {
                    i37 = 524288;
                }
                i7 |= i37;
            }
            i12 = i6 & 128;
            if (i12 != 0) {
                i7 |= 12582912;
                ij0Var5 = ij0Var2;
            } else {
                ij0Var5 = ij0Var2;
                if ((i3 & 12582912) == 0) {
                    if (ak0Var.h(ij0Var5)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i7 |= i13;
                }
            }
            i14 = i7 | 100663296;
            i15 = i6 & 512;
            if (i15 != 0) {
                if ((805306368 & i3) == 0) {
                    if (ak0Var.h(ij0Var3)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i14 |= i16;
                }
                i17 = i4 | 54;
                i18 = i6 & 4096;
                if (i18 != 0) {
                    i19 = i4 | 438;
                } else {
                    if ((i4 & 384) != 0) {
                        if (ak0Var.h(ij0Var4)) {
                            i20 = 256;
                        } else {
                            i20 = 128;
                        }
                        i17 |= i20;
                    }
                    i19 = i17;
                }
                i21 = i6 & 8192;
                if (i21 != 0) {
                    i23 = i19 | 3072;
                } else {
                    int i315 = i19;
                    if (ak0Var.g(z3)) {
                        i22 = 2048;
                    } else {
                        i22 = 1024;
                    }
                    i23 = i315 | i22;
                }
                i24 = i6 & 16384;
                if (i24 != 0) {
                    i25 = i23 | 24576;
                } else {
                    i25 = i23 | (ak0Var.f(io2Var) ? 16384 : 8192);
                }
                i26 = i6 & 32768;
                if (i26 != 0) {
                    i25 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i25 |= ak0Var.f(aw0Var) ? 131072 : 65536;
                }
                i27 = i25 | 1572864;
                i28 = i6 & 131072;
                if (i28 != 0) {
                    i27 = i25 | 14155776;
                } else if ((i4 & 12582912) == 0) {
                    i27 |= ak0Var.g(z4) ? 8388608 : 4194304;
                }
                int i412 = i27 | 838860800;
                i29 = i6 & 1048576;
                if (i29 != 0) {
                    i30 = 6;
                } else if ((i5 & 6) == 0) {
                    if (ak0Var.f(f91Var)) {
                        i31 = 4;
                    } else {
                        i31 = 2;
                    }
                    i30 = i5 | i31;
                } else {
                    i30 = i5;
                }
                int i413 = i30 | 144;
                if ((i14 & 306783379) != 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (ak0Var.O(i14 & 1, z7)) {
                    ak0Var.T();
                    if ((i3 & 1) != 0) {
                        if (i38 != 0) {
                            u71Var2 = r71.a;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        }
                        vf2 vf2Var15 = (vf2) ak0Var.j(ef2.a);
                        if (i12 != 0) {
                            ij0Var5 = null;
                        }
                        if (i15 != 0) {
                            ij0Var9 = null;
                        } else {
                            ij0Var9 = ij0Var3;
                        }
                        if (i18 != 0) {
                            ij0Var10 = null;
                        } else {
                            ij0Var10 = ij0Var4;
                        }
                        if (i21 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i24 != 0) {
                            io2Var3 = is1.u;
                        } else {
                            io2Var3 = io2Var;
                        }
                        if (i26 != 0) {
                            aw0Var3 = aw0.d;
                        } else {
                            aw0Var3 = aw0Var;
                        }
                        if (i28 != 0) {
                            z13 = false;
                        } else {
                            z13 = z4;
                        }
                        if (z13) {
                            i34 = 1;
                        } else {
                            i34 = Integer.MAX_VALUE;
                        }
                        if (i29 == 0) {
                        }
                        u32 u32VarA12 = j42.a(sv0.A, ak0Var);
                        jd2 jd2VarK12 = q90.k(6, ak0Var);
                        zv0Var3 = zv0.a;
                        u32Var3 = u32VarA12;
                        ij0Var11 = ij0Var10;
                        io2Var4 = io2Var3;
                        i35 = i34;
                        i36 = 1;
                        jd2Var3 = jd2VarK12;
                        ij0Var12 = ij0Var9;
                        aw0Var4 = aw0Var3;
                        vf2Var3 = vf2Var15;
                        ij0Var13 = ij0Var5;
                        z14 = z5;
                        z15 = z6;
                    } else {
                        if (i38 != 0) {
                            u71Var2 = r71.a;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        }
                        vf2 vf2Var16 = (vf2) ak0Var.j(ef2.a);
                        if (i12 != 0) {
                            ij0Var5 = null;
                        }
                        if (i15 != 0) {
                            ij0Var9 = null;
                        } else {
                            ij0Var9 = ij0Var3;
                        }
                        if (i18 != 0) {
                            ij0Var10 = null;
                        } else {
                            ij0Var10 = ij0Var4;
                        }
                        if (i21 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i24 != 0) {
                            io2Var3 = is1.u;
                        } else {
                            io2Var3 = io2Var;
                        }
                        if (i26 != 0) {
                            aw0Var3 = aw0.d;
                        } else {
                            aw0Var3 = aw0Var;
                        }
                        if (i28 != 0) {
                            z13 = false;
                        } else {
                            z13 = z4;
                        }
                        if (z13) {
                            i34 = 1;
                        } else {
                            i34 = Integer.MAX_VALUE;
                        }
                        if (i29 == 0) {
                        }
                        u32 u32VarA13 = j42.a(sv0.A, ak0Var);
                        jd2 jd2VarK13 = q90.k(6, ak0Var);
                        zv0Var3 = zv0.a;
                        u32Var3 = u32VarA13;
                        ij0Var11 = ij0Var10;
                        io2Var4 = io2Var3;
                        i35 = i34;
                        i36 = 1;
                        jd2Var3 = jd2VarK13;
                        ij0Var12 = ij0Var9;
                        aw0Var4 = aw0Var3;
                        vf2Var3 = vf2Var16;
                        ij0Var13 = ij0Var5;
                        z14 = z5;
                        z15 = z6;
                    }
                    ak0Var.q();
                    if (f91Var3 == null) {
                        ak0Var.W(1310051731);
                        objL = ak0Var.L();
                        if (objL == cv.a) {
                            objL = new f91();
                            ak0Var.g0(objL);
                        }
                        f91Var4 = (f91) objL;
                        z16 = false;
                        ak0Var.p(false);
                    } else {
                        z16 = false;
                        ak0Var.W(1981921732);
                        ak0Var.p(false);
                        f91Var4 = f91Var3;
                    }
                    ak0Var.W(1981927842);
                    jB = vf2Var3.b();
                    if (jB == 16) {
                        zBooleanValue = ((Boolean) mx.r(f91Var4, ak0Var, z16 ? 1 : 0).getValue()).booleanValue();
                        if (!z14) {
                            j = jd2Var3.c;
                        } else if (z12) {
                            j = jd2Var3.d;
                        } else if (zBooleanValue) {
                            j = jd2Var3.a;
                        } else {
                            j = jd2Var3.b;
                        }
                        jB = j;
                        z16 = false;
                    }
                    ak0Var.p(z16);
                    boolean z119 = z12;
                    u71 u71Var10 = u71Var2;
                    zv0 zv0Var10 = zv0Var3;
                    boolean z1110 = z13;
                    sv.a(qf2.a.a(jd2Var3.k), vs0.C(1874034984, new qi1(u71Var10, ij0Var, z119, jd2Var3, str, ej0Var, z14, z15, vf2Var3.d(new vf2(jB, 0L, null, 0L, 0, 0L, 16777214)), aw0Var4, zv0Var10, z1110, i35, i36, io2Var4, f91Var4, ij0Var13, ij0Var12, ij0Var11, u32Var3), ak0Var), ak0Var, 56);
                    vf2Var2 = vf2Var3;
                    u71Var3 = u71Var10;
                    z10 = z14;
                    z11 = z15;
                    aw0Var2 = aw0Var4;
                    zv0Var2 = zv0Var10;
                    z9 = z1110;
                    i32 = i35;
                    i33 = i36;
                    io2Var2 = io2Var4;
                    ij0Var7 = ij0Var13;
                    ij0Var6 = ij0Var12;
                    u32Var2 = u32Var3;
                    f91Var2 = f91Var3;
                    jd2Var2 = jd2Var3;
                    z8 = z119;
                    ij0Var8 = ij0Var11;
                } else {
                    ak0Var.R();
                    ij0Var6 = ij0Var3;
                    z8 = z3;
                    io2Var2 = io2Var;
                    aw0Var2 = aw0Var;
                    z9 = z4;
                    i32 = i;
                    i33 = i2;
                    f91Var2 = f91Var;
                    u32Var2 = u32Var;
                    jd2Var2 = jd2Var;
                    z10 = z5;
                    z11 = z6;
                    u71Var3 = u71Var2;
                    ij0Var7 = ij0Var5;
                    vf2Var2 = vf2Var;
                    ij0Var8 = ij0Var4;
                    zv0Var2 = zv0Var;
                }
                lr1VarR = ak0Var.r();
                if (lr1VarR != null) {
                    lr1VarR.d = new ij0() { // from class: ni1
                        @Override // defpackage.ij0
                        public final Object g(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = ei1.P(i3 | 1);
                            int iP2 = ei1.P(i4);
                            int iP3 = ei1.P(i5);
                            ux.f(str, ej0Var, u71Var3, z10, z11, vf2Var2, ij0Var, ij0Var7, ij0Var6, ij0Var8, z8, io2Var2, aw0Var2, zv0Var2, z9, i32, i33, f91Var2, u32Var2, jd2Var2, (ak0) obj, iP, iP2, iP3, i6);
                            return ll2.a;
                        }
                    };
                }
            }
            i14 = i7 | 905969664;
            i17 = i4 | 54;
            i18 = i6 & 4096;
            if (i18 != 0) {
                i19 = i4 | 438;
            } else {
                if ((i4 & 384) != 0) {
                    if (ak0Var.h(ij0Var4)) {
                        i20 = 256;
                    } else {
                        i20 = 128;
                    }
                    i17 |= i20;
                }
                i19 = i17;
            }
            i21 = i6 & 8192;
            if (i21 != 0) {
                i23 = i19 | 3072;
            } else {
                int i316 = i19;
                if (ak0Var.g(z3)) {
                    i22 = 2048;
                } else {
                    i22 = 1024;
                }
                i23 = i316 | i22;
            }
            i24 = i6 & 16384;
            if (i24 != 0) {
                i25 = i23 | 24576;
            } else {
                i25 = i23 | (ak0Var.f(io2Var) ? 16384 : 8192);
            }
            i26 = i6 & 32768;
            if (i26 != 0) {
                i25 |= 196608;
            } else if ((i4 & 196608) == 0) {
                i25 |= ak0Var.f(aw0Var) ? 131072 : 65536;
            }
            i27 = i25 | 1572864;
            i28 = i6 & 131072;
            if (i28 != 0) {
                i27 = i25 | 14155776;
            } else if ((i4 & 12582912) == 0) {
                i27 |= ak0Var.g(z4) ? 8388608 : 4194304;
            }
            int i414 = i27 | 838860800;
            i29 = i6 & 1048576;
            if (i29 != 0) {
                i30 = 6;
            } else if ((i5 & 6) == 0) {
                if (ak0Var.f(f91Var)) {
                    i31 = 4;
                } else {
                    i31 = 2;
                }
                i30 = i5 | i31;
            } else {
                i30 = i5;
            }
            int i415 = i30 | 144;
            if ((i14 & 306783379) != 306783378) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (ak0Var.O(i14 & 1, z7)) {
                ak0Var.T();
                if ((i3 & 1) != 0) {
                    if (i38 != 0) {
                        u71Var2 = r71.a;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    }
                    vf2 vf2Var17 = (vf2) ak0Var.j(ef2.a);
                    if (i12 != 0) {
                        ij0Var5 = null;
                    }
                    if (i15 != 0) {
                        ij0Var9 = null;
                    } else {
                        ij0Var9 = ij0Var3;
                    }
                    if (i18 != 0) {
                        ij0Var10 = null;
                    } else {
                        ij0Var10 = ij0Var4;
                    }
                    if (i21 != 0) {
                        z12 = false;
                    } else {
                        z12 = z3;
                    }
                    if (i24 != 0) {
                        io2Var3 = is1.u;
                    } else {
                        io2Var3 = io2Var;
                    }
                    if (i26 != 0) {
                        aw0Var3 = aw0.d;
                    } else {
                        aw0Var3 = aw0Var;
                    }
                    if (i28 != 0) {
                        z13 = false;
                    } else {
                        z13 = z4;
                    }
                    if (z13) {
                        i34 = 1;
                    } else {
                        i34 = Integer.MAX_VALUE;
                    }
                    if (i29 == 0) {
                    }
                    u32 u32VarA14 = j42.a(sv0.A, ak0Var);
                    jd2 jd2VarK14 = q90.k(6, ak0Var);
                    zv0Var3 = zv0.a;
                    u32Var3 = u32VarA14;
                    ij0Var11 = ij0Var10;
                    io2Var4 = io2Var3;
                    i35 = i34;
                    i36 = 1;
                    jd2Var3 = jd2VarK14;
                    ij0Var12 = ij0Var9;
                    aw0Var4 = aw0Var3;
                    vf2Var3 = vf2Var17;
                    ij0Var13 = ij0Var5;
                    z14 = z5;
                    z15 = z6;
                } else {
                    if (i38 != 0) {
                        u71Var2 = r71.a;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    }
                    vf2 vf2Var18 = (vf2) ak0Var.j(ef2.a);
                    if (i12 != 0) {
                        ij0Var5 = null;
                    }
                    if (i15 != 0) {
                        ij0Var9 = null;
                    } else {
                        ij0Var9 = ij0Var3;
                    }
                    if (i18 != 0) {
                        ij0Var10 = null;
                    } else {
                        ij0Var10 = ij0Var4;
                    }
                    if (i21 != 0) {
                        z12 = false;
                    } else {
                        z12 = z3;
                    }
                    if (i24 != 0) {
                        io2Var3 = is1.u;
                    } else {
                        io2Var3 = io2Var;
                    }
                    if (i26 != 0) {
                        aw0Var3 = aw0.d;
                    } else {
                        aw0Var3 = aw0Var;
                    }
                    if (i28 != 0) {
                        z13 = false;
                    } else {
                        z13 = z4;
                    }
                    if (z13) {
                        i34 = 1;
                    } else {
                        i34 = Integer.MAX_VALUE;
                    }
                    if (i29 == 0) {
                    }
                    u32 u32VarA15 = j42.a(sv0.A, ak0Var);
                    jd2 jd2VarK15 = q90.k(6, ak0Var);
                    zv0Var3 = zv0.a;
                    u32Var3 = u32VarA15;
                    ij0Var11 = ij0Var10;
                    io2Var4 = io2Var3;
                    i35 = i34;
                    i36 = 1;
                    jd2Var3 = jd2VarK15;
                    ij0Var12 = ij0Var9;
                    aw0Var4 = aw0Var3;
                    vf2Var3 = vf2Var18;
                    ij0Var13 = ij0Var5;
                    z14 = z5;
                    z15 = z6;
                }
                ak0Var.q();
                if (f91Var3 == null) {
                    ak0Var.W(1310051731);
                    objL = ak0Var.L();
                    if (objL == cv.a) {
                        objL = new f91();
                        ak0Var.g0(objL);
                    }
                    f91Var4 = (f91) objL;
                    z16 = false;
                    ak0Var.p(false);
                } else {
                    z16 = false;
                    ak0Var.W(1981921732);
                    ak0Var.p(false);
                    f91Var4 = f91Var3;
                }
                ak0Var.W(1981927842);
                jB = vf2Var3.b();
                if (jB == 16) {
                    zBooleanValue = ((Boolean) mx.r(f91Var4, ak0Var, z16 ? 1 : 0).getValue()).booleanValue();
                    if (!z14) {
                        j = jd2Var3.c;
                    } else if (z12) {
                        j = jd2Var3.d;
                    } else if (zBooleanValue) {
                        j = jd2Var3.a;
                    } else {
                        j = jd2Var3.b;
                    }
                    jB = j;
                    z16 = false;
                }
                ak0Var.p(z16);
                boolean z1111 = z12;
                u71 u71Var11 = u71Var2;
                zv0 zv0Var11 = zv0Var3;
                boolean z1112 = z13;
                sv.a(qf2.a.a(jd2Var3.k), vs0.C(1874034984, new qi1(u71Var11, ij0Var, z1111, jd2Var3, str, ej0Var, z14, z15, vf2Var3.d(new vf2(jB, 0L, null, 0L, 0, 0L, 16777214)), aw0Var4, zv0Var11, z1112, i35, i36, io2Var4, f91Var4, ij0Var13, ij0Var12, ij0Var11, u32Var3), ak0Var), ak0Var, 56);
                vf2Var2 = vf2Var3;
                u71Var3 = u71Var11;
                z10 = z14;
                z11 = z15;
                aw0Var2 = aw0Var4;
                zv0Var2 = zv0Var11;
                z9 = z1112;
                i32 = i35;
                i33 = i36;
                io2Var2 = io2Var4;
                ij0Var7 = ij0Var13;
                ij0Var6 = ij0Var12;
                u32Var2 = u32Var3;
                f91Var2 = f91Var3;
                jd2Var2 = jd2Var3;
                z8 = z1111;
                ij0Var8 = ij0Var11;
            } else {
                ak0Var.R();
                ij0Var6 = ij0Var3;
                z8 = z3;
                io2Var2 = io2Var;
                aw0Var2 = aw0Var;
                z9 = z4;
                i32 = i;
                i33 = i2;
                f91Var2 = f91Var;
                u32Var2 = u32Var;
                jd2Var2 = jd2Var;
                z10 = z5;
                z11 = z6;
                u71Var3 = u71Var2;
                ij0Var7 = ij0Var5;
                vf2Var2 = vf2Var;
                ij0Var8 = ij0Var4;
                zv0Var2 = zv0Var;
            }
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new ij0() { // from class: ni1
                    @Override // defpackage.ij0
                    public final Object g(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = ei1.P(i3 | 1);
                        int iP2 = ei1.P(i4);
                        int iP3 = ei1.P(i5);
                        ux.f(str, ej0Var, u71Var3, z10, z11, vf2Var2, ij0Var, ij0Var7, ij0Var6, ij0Var8, z8, io2Var2, aw0Var2, zv0Var2, z9, i32, i33, f91Var2, u32Var2, jd2Var2, (ak0) obj, iP, iP2, iP3, i6);
                        return ll2.a;
                    }
                };
            }
        }
        i7 |= 384;
        u71Var2 = u71Var;
        i8 = i6 & 8;
        if (i8 != 0) {
            if ((i3 & 3072) == 0) {
                z5 = z;
                if (ak0Var.g(z5)) {
                    i9 = 2048;
                } else {
                    i9 = 1024;
                }
                i7 |= i9;
            }
            i10 = i6 & 16;
            if (i10 != 0) {
                if ((i3 & 24576) == 0) {
                    z6 = z2;
                    if (ak0Var.g(z6)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i7 |= i11;
                }
                if ((i3 & 196608) == 0) {
                    i7 |= 65536;
                }
                if ((i3 & 1572864) == 0) {
                    if (ak0Var.h(ij0Var)) {
                        i37 = 1048576;
                    } else {
                        i37 = 524288;
                    }
                    i7 |= i37;
                }
                i12 = i6 & 128;
                if (i12 != 0) {
                    i7 |= 12582912;
                    ij0Var5 = ij0Var2;
                } else {
                    ij0Var5 = ij0Var2;
                    if ((i3 & 12582912) == 0) {
                        if (ak0Var.h(ij0Var5)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i7 |= i13;
                    }
                }
                i14 = i7 | 100663296;
                i15 = i6 & 512;
                if (i15 != 0) {
                    if ((805306368 & i3) == 0) {
                        if (ak0Var.h(ij0Var3)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i14 |= i16;
                    }
                    i17 = i4 | 54;
                    i18 = i6 & 4096;
                    if (i18 != 0) {
                        i19 = i4 | 438;
                    } else {
                        if ((i4 & 384) != 0) {
                            if (ak0Var.h(ij0Var4)) {
                                i20 = 256;
                            } else {
                                i20 = 128;
                            }
                            i17 |= i20;
                        }
                        i19 = i17;
                    }
                    i21 = i6 & 8192;
                    if (i21 != 0) {
                        i23 = i19 | 3072;
                    } else {
                        int i317 = i19;
                        if (ak0Var.g(z3)) {
                            i22 = 2048;
                        } else {
                            i22 = 1024;
                        }
                        i23 = i317 | i22;
                    }
                    i24 = i6 & 16384;
                    if (i24 != 0) {
                        i25 = i23 | 24576;
                    } else {
                        i25 = i23 | (ak0Var.f(io2Var) ? 16384 : 8192);
                    }
                    i26 = i6 & 32768;
                    if (i26 != 0) {
                        i25 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        i25 |= ak0Var.f(aw0Var) ? 131072 : 65536;
                    }
                    i27 = i25 | 1572864;
                    i28 = i6 & 131072;
                    if (i28 != 0) {
                        i27 = i25 | 14155776;
                    } else if ((i4 & 12582912) == 0) {
                        i27 |= ak0Var.g(z4) ? 8388608 : 4194304;
                    }
                    int i416 = i27 | 838860800;
                    i29 = i6 & 1048576;
                    if (i29 != 0) {
                        i30 = 6;
                    } else if ((i5 & 6) == 0) {
                        if (ak0Var.f(f91Var)) {
                            i31 = 4;
                        } else {
                            i31 = 2;
                        }
                        i30 = i5 | i31;
                    } else {
                        i30 = i5;
                    }
                    int i417 = i30 | 144;
                    if ((i14 & 306783379) != 306783378) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (ak0Var.O(i14 & 1, z7)) {
                        ak0Var.T();
                        if ((i3 & 1) != 0) {
                            if (i38 != 0) {
                                u71Var2 = r71.a;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            }
                            if (i10 != 0) {
                                z6 = false;
                            }
                            vf2 vf2Var19 = (vf2) ak0Var.j(ef2.a);
                            if (i12 != 0) {
                                ij0Var5 = null;
                            }
                            if (i15 != 0) {
                                ij0Var9 = null;
                            } else {
                                ij0Var9 = ij0Var3;
                            }
                            if (i18 != 0) {
                                ij0Var10 = null;
                            } else {
                                ij0Var10 = ij0Var4;
                            }
                            if (i21 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i24 != 0) {
                                io2Var3 = is1.u;
                            } else {
                                io2Var3 = io2Var;
                            }
                            if (i26 != 0) {
                                aw0Var3 = aw0.d;
                            } else {
                                aw0Var3 = aw0Var;
                            }
                            if (i28 != 0) {
                                z13 = false;
                            } else {
                                z13 = z4;
                            }
                            if (z13) {
                                i34 = 1;
                            } else {
                                i34 = Integer.MAX_VALUE;
                            }
                            if (i29 == 0) {
                            }
                            u32 u32VarA16 = j42.a(sv0.A, ak0Var);
                            jd2 jd2VarK16 = q90.k(6, ak0Var);
                            zv0Var3 = zv0.a;
                            u32Var3 = u32VarA16;
                            ij0Var11 = ij0Var10;
                            io2Var4 = io2Var3;
                            i35 = i34;
                            i36 = 1;
                            jd2Var3 = jd2VarK16;
                            ij0Var12 = ij0Var9;
                            aw0Var4 = aw0Var3;
                            vf2Var3 = vf2Var19;
                            ij0Var13 = ij0Var5;
                            z14 = z5;
                            z15 = z6;
                        } else {
                            if (i38 != 0) {
                                u71Var2 = r71.a;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            }
                            if (i10 != 0) {
                                z6 = false;
                            }
                            vf2 vf2Var110 = (vf2) ak0Var.j(ef2.a);
                            if (i12 != 0) {
                                ij0Var5 = null;
                            }
                            if (i15 != 0) {
                                ij0Var9 = null;
                            } else {
                                ij0Var9 = ij0Var3;
                            }
                            if (i18 != 0) {
                                ij0Var10 = null;
                            } else {
                                ij0Var10 = ij0Var4;
                            }
                            if (i21 != 0) {
                                z12 = false;
                            } else {
                                z12 = z3;
                            }
                            if (i24 != 0) {
                                io2Var3 = is1.u;
                            } else {
                                io2Var3 = io2Var;
                            }
                            if (i26 != 0) {
                                aw0Var3 = aw0.d;
                            } else {
                                aw0Var3 = aw0Var;
                            }
                            if (i28 != 0) {
                                z13 = false;
                            } else {
                                z13 = z4;
                            }
                            if (z13) {
                                i34 = 1;
                            } else {
                                i34 = Integer.MAX_VALUE;
                            }
                            if (i29 == 0) {
                            }
                            u32 u32VarA17 = j42.a(sv0.A, ak0Var);
                            jd2 jd2VarK17 = q90.k(6, ak0Var);
                            zv0Var3 = zv0.a;
                            u32Var3 = u32VarA17;
                            ij0Var11 = ij0Var10;
                            io2Var4 = io2Var3;
                            i35 = i34;
                            i36 = 1;
                            jd2Var3 = jd2VarK17;
                            ij0Var12 = ij0Var9;
                            aw0Var4 = aw0Var3;
                            vf2Var3 = vf2Var110;
                            ij0Var13 = ij0Var5;
                            z14 = z5;
                            z15 = z6;
                        }
                        ak0Var.q();
                        if (f91Var3 == null) {
                            ak0Var.W(1310051731);
                            objL = ak0Var.L();
                            if (objL == cv.a) {
                                objL = new f91();
                                ak0Var.g0(objL);
                            }
                            f91Var4 = (f91) objL;
                            z16 = false;
                            ak0Var.p(false);
                        } else {
                            z16 = false;
                            ak0Var.W(1981921732);
                            ak0Var.p(false);
                            f91Var4 = f91Var3;
                        }
                        ak0Var.W(1981927842);
                        jB = vf2Var3.b();
                        if (jB == 16) {
                            zBooleanValue = ((Boolean) mx.r(f91Var4, ak0Var, z16 ? 1 : 0).getValue()).booleanValue();
                            if (!z14) {
                                j = jd2Var3.c;
                            } else if (z12) {
                                j = jd2Var3.d;
                            } else if (zBooleanValue) {
                                j = jd2Var3.a;
                            } else {
                                j = jd2Var3.b;
                            }
                            jB = j;
                            z16 = false;
                        }
                        ak0Var.p(z16);
                        boolean z1113 = z12;
                        u71 u71Var12 = u71Var2;
                        zv0 zv0Var12 = zv0Var3;
                        boolean z1114 = z13;
                        sv.a(qf2.a.a(jd2Var3.k), vs0.C(1874034984, new qi1(u71Var12, ij0Var, z1113, jd2Var3, str, ej0Var, z14, z15, vf2Var3.d(new vf2(jB, 0L, null, 0L, 0, 0L, 16777214)), aw0Var4, zv0Var12, z1114, i35, i36, io2Var4, f91Var4, ij0Var13, ij0Var12, ij0Var11, u32Var3), ak0Var), ak0Var, 56);
                        vf2Var2 = vf2Var3;
                        u71Var3 = u71Var12;
                        z10 = z14;
                        z11 = z15;
                        aw0Var2 = aw0Var4;
                        zv0Var2 = zv0Var12;
                        z9 = z1114;
                        i32 = i35;
                        i33 = i36;
                        io2Var2 = io2Var4;
                        ij0Var7 = ij0Var13;
                        ij0Var6 = ij0Var12;
                        u32Var2 = u32Var3;
                        f91Var2 = f91Var3;
                        jd2Var2 = jd2Var3;
                        z8 = z1113;
                        ij0Var8 = ij0Var11;
                    } else {
                        ak0Var.R();
                        ij0Var6 = ij0Var3;
                        z8 = z3;
                        io2Var2 = io2Var;
                        aw0Var2 = aw0Var;
                        z9 = z4;
                        i32 = i;
                        i33 = i2;
                        f91Var2 = f91Var;
                        u32Var2 = u32Var;
                        jd2Var2 = jd2Var;
                        z10 = z5;
                        z11 = z6;
                        u71Var3 = u71Var2;
                        ij0Var7 = ij0Var5;
                        vf2Var2 = vf2Var;
                        ij0Var8 = ij0Var4;
                        zv0Var2 = zv0Var;
                    }
                    lr1VarR = ak0Var.r();
                    if (lr1VarR != null) {
                        lr1VarR.d = new ij0() { // from class: ni1
                            @Override // defpackage.ij0
                            public final Object g(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = ei1.P(i3 | 1);
                                int iP2 = ei1.P(i4);
                                int iP3 = ei1.P(i5);
                                ux.f(str, ej0Var, u71Var3, z10, z11, vf2Var2, ij0Var, ij0Var7, ij0Var6, ij0Var8, z8, io2Var2, aw0Var2, zv0Var2, z9, i32, i33, f91Var2, u32Var2, jd2Var2, (ak0) obj, iP, iP2, iP3, i6);
                                return ll2.a;
                            }
                        };
                    }
                }
                i14 = i7 | 905969664;
                i17 = i4 | 54;
                i18 = i6 & 4096;
                if (i18 != 0) {
                    i19 = i4 | 438;
                } else {
                    if ((i4 & 384) != 0) {
                        if (ak0Var.h(ij0Var4)) {
                            i20 = 256;
                        } else {
                            i20 = 128;
                        }
                        i17 |= i20;
                    }
                    i19 = i17;
                }
                i21 = i6 & 8192;
                if (i21 != 0) {
                    i23 = i19 | 3072;
                } else {
                    int i318 = i19;
                    if (ak0Var.g(z3)) {
                        i22 = 2048;
                    } else {
                        i22 = 1024;
                    }
                    i23 = i318 | i22;
                }
                i24 = i6 & 16384;
                if (i24 != 0) {
                    i25 = i23 | 24576;
                } else {
                    i25 = i23 | (ak0Var.f(io2Var) ? 16384 : 8192);
                }
                i26 = i6 & 32768;
                if (i26 != 0) {
                    i25 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i25 |= ak0Var.f(aw0Var) ? 131072 : 65536;
                }
                i27 = i25 | 1572864;
                i28 = i6 & 131072;
                if (i28 != 0) {
                    i27 = i25 | 14155776;
                } else if ((i4 & 12582912) == 0) {
                    i27 |= ak0Var.g(z4) ? 8388608 : 4194304;
                }
                int i418 = i27 | 838860800;
                i29 = i6 & 1048576;
                if (i29 != 0) {
                    i30 = 6;
                } else if ((i5 & 6) == 0) {
                    if (ak0Var.f(f91Var)) {
                        i31 = 4;
                    } else {
                        i31 = 2;
                    }
                    i30 = i5 | i31;
                } else {
                    i30 = i5;
                }
                int i419 = i30 | 144;
                if ((i14 & 306783379) != 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (ak0Var.O(i14 & 1, z7)) {
                    ak0Var.T();
                    if ((i3 & 1) != 0) {
                        if (i38 != 0) {
                            u71Var2 = r71.a;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        }
                        vf2 vf2Var111 = (vf2) ak0Var.j(ef2.a);
                        if (i12 != 0) {
                            ij0Var5 = null;
                        }
                        if (i15 != 0) {
                            ij0Var9 = null;
                        } else {
                            ij0Var9 = ij0Var3;
                        }
                        if (i18 != 0) {
                            ij0Var10 = null;
                        } else {
                            ij0Var10 = ij0Var4;
                        }
                        if (i21 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i24 != 0) {
                            io2Var3 = is1.u;
                        } else {
                            io2Var3 = io2Var;
                        }
                        if (i26 != 0) {
                            aw0Var3 = aw0.d;
                        } else {
                            aw0Var3 = aw0Var;
                        }
                        if (i28 != 0) {
                            z13 = false;
                        } else {
                            z13 = z4;
                        }
                        if (z13) {
                            i34 = 1;
                        } else {
                            i34 = Integer.MAX_VALUE;
                        }
                        if (i29 == 0) {
                        }
                        u32 u32VarA18 = j42.a(sv0.A, ak0Var);
                        jd2 jd2VarK18 = q90.k(6, ak0Var);
                        zv0Var3 = zv0.a;
                        u32Var3 = u32VarA18;
                        ij0Var11 = ij0Var10;
                        io2Var4 = io2Var3;
                        i35 = i34;
                        i36 = 1;
                        jd2Var3 = jd2VarK18;
                        ij0Var12 = ij0Var9;
                        aw0Var4 = aw0Var3;
                        vf2Var3 = vf2Var111;
                        ij0Var13 = ij0Var5;
                        z14 = z5;
                        z15 = z6;
                    } else {
                        if (i38 != 0) {
                            u71Var2 = r71.a;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        }
                        vf2 vf2Var112 = (vf2) ak0Var.j(ef2.a);
                        if (i12 != 0) {
                            ij0Var5 = null;
                        }
                        if (i15 != 0) {
                            ij0Var9 = null;
                        } else {
                            ij0Var9 = ij0Var3;
                        }
                        if (i18 != 0) {
                            ij0Var10 = null;
                        } else {
                            ij0Var10 = ij0Var4;
                        }
                        if (i21 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i24 != 0) {
                            io2Var3 = is1.u;
                        } else {
                            io2Var3 = io2Var;
                        }
                        if (i26 != 0) {
                            aw0Var3 = aw0.d;
                        } else {
                            aw0Var3 = aw0Var;
                        }
                        if (i28 != 0) {
                            z13 = false;
                        } else {
                            z13 = z4;
                        }
                        if (z13) {
                            i34 = 1;
                        } else {
                            i34 = Integer.MAX_VALUE;
                        }
                        if (i29 == 0) {
                        }
                        u32 u32VarA19 = j42.a(sv0.A, ak0Var);
                        jd2 jd2VarK19 = q90.k(6, ak0Var);
                        zv0Var3 = zv0.a;
                        u32Var3 = u32VarA19;
                        ij0Var11 = ij0Var10;
                        io2Var4 = io2Var3;
                        i35 = i34;
                        i36 = 1;
                        jd2Var3 = jd2VarK19;
                        ij0Var12 = ij0Var9;
                        aw0Var4 = aw0Var3;
                        vf2Var3 = vf2Var112;
                        ij0Var13 = ij0Var5;
                        z14 = z5;
                        z15 = z6;
                    }
                    ak0Var.q();
                    if (f91Var3 == null) {
                        ak0Var.W(1310051731);
                        objL = ak0Var.L();
                        if (objL == cv.a) {
                            objL = new f91();
                            ak0Var.g0(objL);
                        }
                        f91Var4 = (f91) objL;
                        z16 = false;
                        ak0Var.p(false);
                    } else {
                        z16 = false;
                        ak0Var.W(1981921732);
                        ak0Var.p(false);
                        f91Var4 = f91Var3;
                    }
                    ak0Var.W(1981927842);
                    jB = vf2Var3.b();
                    if (jB == 16) {
                        zBooleanValue = ((Boolean) mx.r(f91Var4, ak0Var, z16 ? 1 : 0).getValue()).booleanValue();
                        if (!z14) {
                            j = jd2Var3.c;
                        } else if (z12) {
                            j = jd2Var3.d;
                        } else if (zBooleanValue) {
                            j = jd2Var3.a;
                        } else {
                            j = jd2Var3.b;
                        }
                        jB = j;
                        z16 = false;
                    }
                    ak0Var.p(z16);
                    boolean z1115 = z12;
                    u71 u71Var13 = u71Var2;
                    zv0 zv0Var13 = zv0Var3;
                    boolean z1116 = z13;
                    sv.a(qf2.a.a(jd2Var3.k), vs0.C(1874034984, new qi1(u71Var13, ij0Var, z1115, jd2Var3, str, ej0Var, z14, z15, vf2Var3.d(new vf2(jB, 0L, null, 0L, 0, 0L, 16777214)), aw0Var4, zv0Var13, z1116, i35, i36, io2Var4, f91Var4, ij0Var13, ij0Var12, ij0Var11, u32Var3), ak0Var), ak0Var, 56);
                    vf2Var2 = vf2Var3;
                    u71Var3 = u71Var13;
                    z10 = z14;
                    z11 = z15;
                    aw0Var2 = aw0Var4;
                    zv0Var2 = zv0Var13;
                    z9 = z1116;
                    i32 = i35;
                    i33 = i36;
                    io2Var2 = io2Var4;
                    ij0Var7 = ij0Var13;
                    ij0Var6 = ij0Var12;
                    u32Var2 = u32Var3;
                    f91Var2 = f91Var3;
                    jd2Var2 = jd2Var3;
                    z8 = z1115;
                    ij0Var8 = ij0Var11;
                } else {
                    ak0Var.R();
                    ij0Var6 = ij0Var3;
                    z8 = z3;
                    io2Var2 = io2Var;
                    aw0Var2 = aw0Var;
                    z9 = z4;
                    i32 = i;
                    i33 = i2;
                    f91Var2 = f91Var;
                    u32Var2 = u32Var;
                    jd2Var2 = jd2Var;
                    z10 = z5;
                    z11 = z6;
                    u71Var3 = u71Var2;
                    ij0Var7 = ij0Var5;
                    vf2Var2 = vf2Var;
                    ij0Var8 = ij0Var4;
                    zv0Var2 = zv0Var;
                }
                lr1VarR = ak0Var.r();
                if (lr1VarR != null) {
                    lr1VarR.d = new ij0() { // from class: ni1
                        @Override // defpackage.ij0
                        public final Object g(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = ei1.P(i3 | 1);
                            int iP2 = ei1.P(i4);
                            int iP3 = ei1.P(i5);
                            ux.f(str, ej0Var, u71Var3, z10, z11, vf2Var2, ij0Var, ij0Var7, ij0Var6, ij0Var8, z8, io2Var2, aw0Var2, zv0Var2, z9, i32, i33, f91Var2, u32Var2, jd2Var2, (ak0) obj, iP, iP2, iP3, i6);
                            return ll2.a;
                        }
                    };
                }
            }
            i7 |= 24576;
            z6 = z2;
            if ((i3 & 196608) == 0) {
                i7 |= 65536;
            }
            if ((i3 & 1572864) == 0) {
                if (ak0Var.h(ij0Var)) {
                    i37 = 1048576;
                } else {
                    i37 = 524288;
                }
                i7 |= i37;
            }
            i12 = i6 & 128;
            if (i12 != 0) {
                i7 |= 12582912;
                ij0Var5 = ij0Var2;
            } else {
                ij0Var5 = ij0Var2;
                if ((i3 & 12582912) == 0) {
                    if (ak0Var.h(ij0Var5)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i7 |= i13;
                }
            }
            i14 = i7 | 100663296;
            i15 = i6 & 512;
            if (i15 != 0) {
                if ((805306368 & i3) == 0) {
                    if (ak0Var.h(ij0Var3)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i14 |= i16;
                }
                i17 = i4 | 54;
                i18 = i6 & 4096;
                if (i18 != 0) {
                    i19 = i4 | 438;
                } else {
                    if ((i4 & 384) != 0) {
                        if (ak0Var.h(ij0Var4)) {
                            i20 = 256;
                        } else {
                            i20 = 128;
                        }
                        i17 |= i20;
                    }
                    i19 = i17;
                }
                i21 = i6 & 8192;
                if (i21 != 0) {
                    i23 = i19 | 3072;
                } else {
                    int i319 = i19;
                    if (ak0Var.g(z3)) {
                        i22 = 2048;
                    } else {
                        i22 = 1024;
                    }
                    i23 = i319 | i22;
                }
                i24 = i6 & 16384;
                if (i24 != 0) {
                    i25 = i23 | 24576;
                } else {
                    i25 = i23 | (ak0Var.f(io2Var) ? 16384 : 8192);
                }
                i26 = i6 & 32768;
                if (i26 != 0) {
                    i25 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i25 |= ak0Var.f(aw0Var) ? 131072 : 65536;
                }
                i27 = i25 | 1572864;
                i28 = i6 & 131072;
                if (i28 != 0) {
                    i27 = i25 | 14155776;
                } else if ((i4 & 12582912) == 0) {
                    i27 |= ak0Var.g(z4) ? 8388608 : 4194304;
                }
                int i4110 = i27 | 838860800;
                i29 = i6 & 1048576;
                if (i29 != 0) {
                    i30 = 6;
                } else if ((i5 & 6) == 0) {
                    if (ak0Var.f(f91Var)) {
                        i31 = 4;
                    } else {
                        i31 = 2;
                    }
                    i30 = i5 | i31;
                } else {
                    i30 = i5;
                }
                int i4111 = i30 | 144;
                if ((i14 & 306783379) != 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (ak0Var.O(i14 & 1, z7)) {
                    ak0Var.T();
                    if ((i3 & 1) != 0) {
                        if (i38 != 0) {
                            u71Var2 = r71.a;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        }
                        vf2 vf2Var113 = (vf2) ak0Var.j(ef2.a);
                        if (i12 != 0) {
                            ij0Var5 = null;
                        }
                        if (i15 != 0) {
                            ij0Var9 = null;
                        } else {
                            ij0Var9 = ij0Var3;
                        }
                        if (i18 != 0) {
                            ij0Var10 = null;
                        } else {
                            ij0Var10 = ij0Var4;
                        }
                        if (i21 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i24 != 0) {
                            io2Var3 = is1.u;
                        } else {
                            io2Var3 = io2Var;
                        }
                        if (i26 != 0) {
                            aw0Var3 = aw0.d;
                        } else {
                            aw0Var3 = aw0Var;
                        }
                        if (i28 != 0) {
                            z13 = false;
                        } else {
                            z13 = z4;
                        }
                        if (z13) {
                            i34 = 1;
                        } else {
                            i34 = Integer.MAX_VALUE;
                        }
                        if (i29 == 0) {
                        }
                        u32 u32VarA110 = j42.a(sv0.A, ak0Var);
                        jd2 jd2VarK110 = q90.k(6, ak0Var);
                        zv0Var3 = zv0.a;
                        u32Var3 = u32VarA110;
                        ij0Var11 = ij0Var10;
                        io2Var4 = io2Var3;
                        i35 = i34;
                        i36 = 1;
                        jd2Var3 = jd2VarK110;
                        ij0Var12 = ij0Var9;
                        aw0Var4 = aw0Var3;
                        vf2Var3 = vf2Var113;
                        ij0Var13 = ij0Var5;
                        z14 = z5;
                        z15 = z6;
                    } else {
                        if (i38 != 0) {
                            u71Var2 = r71.a;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        }
                        vf2 vf2Var114 = (vf2) ak0Var.j(ef2.a);
                        if (i12 != 0) {
                            ij0Var5 = null;
                        }
                        if (i15 != 0) {
                            ij0Var9 = null;
                        } else {
                            ij0Var9 = ij0Var3;
                        }
                        if (i18 != 0) {
                            ij0Var10 = null;
                        } else {
                            ij0Var10 = ij0Var4;
                        }
                        if (i21 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i24 != 0) {
                            io2Var3 = is1.u;
                        } else {
                            io2Var3 = io2Var;
                        }
                        if (i26 != 0) {
                            aw0Var3 = aw0.d;
                        } else {
                            aw0Var3 = aw0Var;
                        }
                        if (i28 != 0) {
                            z13 = false;
                        } else {
                            z13 = z4;
                        }
                        if (z13) {
                            i34 = 1;
                        } else {
                            i34 = Integer.MAX_VALUE;
                        }
                        if (i29 == 0) {
                        }
                        u32 u32VarA111 = j42.a(sv0.A, ak0Var);
                        jd2 jd2VarK111 = q90.k(6, ak0Var);
                        zv0Var3 = zv0.a;
                        u32Var3 = u32VarA111;
                        ij0Var11 = ij0Var10;
                        io2Var4 = io2Var3;
                        i35 = i34;
                        i36 = 1;
                        jd2Var3 = jd2VarK111;
                        ij0Var12 = ij0Var9;
                        aw0Var4 = aw0Var3;
                        vf2Var3 = vf2Var114;
                        ij0Var13 = ij0Var5;
                        z14 = z5;
                        z15 = z6;
                    }
                    ak0Var.q();
                    if (f91Var3 == null) {
                        ak0Var.W(1310051731);
                        objL = ak0Var.L();
                        if (objL == cv.a) {
                            objL = new f91();
                            ak0Var.g0(objL);
                        }
                        f91Var4 = (f91) objL;
                        z16 = false;
                        ak0Var.p(false);
                    } else {
                        z16 = false;
                        ak0Var.W(1981921732);
                        ak0Var.p(false);
                        f91Var4 = f91Var3;
                    }
                    ak0Var.W(1981927842);
                    jB = vf2Var3.b();
                    if (jB == 16) {
                        zBooleanValue = ((Boolean) mx.r(f91Var4, ak0Var, z16 ? 1 : 0).getValue()).booleanValue();
                        if (!z14) {
                            j = jd2Var3.c;
                        } else if (z12) {
                            j = jd2Var3.d;
                        } else if (zBooleanValue) {
                            j = jd2Var3.a;
                        } else {
                            j = jd2Var3.b;
                        }
                        jB = j;
                        z16 = false;
                    }
                    ak0Var.p(z16);
                    boolean z1117 = z12;
                    u71 u71Var14 = u71Var2;
                    zv0 zv0Var14 = zv0Var3;
                    boolean z1118 = z13;
                    sv.a(qf2.a.a(jd2Var3.k), vs0.C(1874034984, new qi1(u71Var14, ij0Var, z1117, jd2Var3, str, ej0Var, z14, z15, vf2Var3.d(new vf2(jB, 0L, null, 0L, 0, 0L, 16777214)), aw0Var4, zv0Var14, z1118, i35, i36, io2Var4, f91Var4, ij0Var13, ij0Var12, ij0Var11, u32Var3), ak0Var), ak0Var, 56);
                    vf2Var2 = vf2Var3;
                    u71Var3 = u71Var14;
                    z10 = z14;
                    z11 = z15;
                    aw0Var2 = aw0Var4;
                    zv0Var2 = zv0Var14;
                    z9 = z1118;
                    i32 = i35;
                    i33 = i36;
                    io2Var2 = io2Var4;
                    ij0Var7 = ij0Var13;
                    ij0Var6 = ij0Var12;
                    u32Var2 = u32Var3;
                    f91Var2 = f91Var3;
                    jd2Var2 = jd2Var3;
                    z8 = z1117;
                    ij0Var8 = ij0Var11;
                } else {
                    ak0Var.R();
                    ij0Var6 = ij0Var3;
                    z8 = z3;
                    io2Var2 = io2Var;
                    aw0Var2 = aw0Var;
                    z9 = z4;
                    i32 = i;
                    i33 = i2;
                    f91Var2 = f91Var;
                    u32Var2 = u32Var;
                    jd2Var2 = jd2Var;
                    z10 = z5;
                    z11 = z6;
                    u71Var3 = u71Var2;
                    ij0Var7 = ij0Var5;
                    vf2Var2 = vf2Var;
                    ij0Var8 = ij0Var4;
                    zv0Var2 = zv0Var;
                }
                lr1VarR = ak0Var.r();
                if (lr1VarR != null) {
                    lr1VarR.d = new ij0() { // from class: ni1
                        @Override // defpackage.ij0
                        public final Object g(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = ei1.P(i3 | 1);
                            int iP2 = ei1.P(i4);
                            int iP3 = ei1.P(i5);
                            ux.f(str, ej0Var, u71Var3, z10, z11, vf2Var2, ij0Var, ij0Var7, ij0Var6, ij0Var8, z8, io2Var2, aw0Var2, zv0Var2, z9, i32, i33, f91Var2, u32Var2, jd2Var2, (ak0) obj, iP, iP2, iP3, i6);
                            return ll2.a;
                        }
                    };
                }
            }
            i14 = i7 | 905969664;
            i17 = i4 | 54;
            i18 = i6 & 4096;
            if (i18 != 0) {
                i19 = i4 | 438;
            } else {
                if ((i4 & 384) != 0) {
                    if (ak0Var.h(ij0Var4)) {
                        i20 = 256;
                    } else {
                        i20 = 128;
                    }
                    i17 |= i20;
                }
                i19 = i17;
            }
            i21 = i6 & 8192;
            if (i21 != 0) {
                i23 = i19 | 3072;
            } else {
                int i3110 = i19;
                if (ak0Var.g(z3)) {
                    i22 = 2048;
                } else {
                    i22 = 1024;
                }
                i23 = i3110 | i22;
            }
            i24 = i6 & 16384;
            if (i24 != 0) {
                i25 = i23 | 24576;
            } else {
                i25 = i23 | (ak0Var.f(io2Var) ? 16384 : 8192);
            }
            i26 = i6 & 32768;
            if (i26 != 0) {
                i25 |= 196608;
            } else if ((i4 & 196608) == 0) {
                i25 |= ak0Var.f(aw0Var) ? 131072 : 65536;
            }
            i27 = i25 | 1572864;
            i28 = i6 & 131072;
            if (i28 != 0) {
                i27 = i25 | 14155776;
            } else if ((i4 & 12582912) == 0) {
                i27 |= ak0Var.g(z4) ? 8388608 : 4194304;
            }
            int i4112 = i27 | 838860800;
            i29 = i6 & 1048576;
            if (i29 != 0) {
                i30 = 6;
            } else if ((i5 & 6) == 0) {
                if (ak0Var.f(f91Var)) {
                    i31 = 4;
                } else {
                    i31 = 2;
                }
                i30 = i5 | i31;
            } else {
                i30 = i5;
            }
            int i4113 = i30 | 144;
            if ((i14 & 306783379) != 306783378) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (ak0Var.O(i14 & 1, z7)) {
                ak0Var.T();
                if ((i3 & 1) != 0) {
                    if (i38 != 0) {
                        u71Var2 = r71.a;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    }
                    vf2 vf2Var115 = (vf2) ak0Var.j(ef2.a);
                    if (i12 != 0) {
                        ij0Var5 = null;
                    }
                    if (i15 != 0) {
                        ij0Var9 = null;
                    } else {
                        ij0Var9 = ij0Var3;
                    }
                    if (i18 != 0) {
                        ij0Var10 = null;
                    } else {
                        ij0Var10 = ij0Var4;
                    }
                    if (i21 != 0) {
                        z12 = false;
                    } else {
                        z12 = z3;
                    }
                    if (i24 != 0) {
                        io2Var3 = is1.u;
                    } else {
                        io2Var3 = io2Var;
                    }
                    if (i26 != 0) {
                        aw0Var3 = aw0.d;
                    } else {
                        aw0Var3 = aw0Var;
                    }
                    if (i28 != 0) {
                        z13 = false;
                    } else {
                        z13 = z4;
                    }
                    if (z13) {
                        i34 = 1;
                    } else {
                        i34 = Integer.MAX_VALUE;
                    }
                    if (i29 == 0) {
                    }
                    u32 u32VarA112 = j42.a(sv0.A, ak0Var);
                    jd2 jd2VarK112 = q90.k(6, ak0Var);
                    zv0Var3 = zv0.a;
                    u32Var3 = u32VarA112;
                    ij0Var11 = ij0Var10;
                    io2Var4 = io2Var3;
                    i35 = i34;
                    i36 = 1;
                    jd2Var3 = jd2VarK112;
                    ij0Var12 = ij0Var9;
                    aw0Var4 = aw0Var3;
                    vf2Var3 = vf2Var115;
                    ij0Var13 = ij0Var5;
                    z14 = z5;
                    z15 = z6;
                } else {
                    if (i38 != 0) {
                        u71Var2 = r71.a;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    }
                    vf2 vf2Var116 = (vf2) ak0Var.j(ef2.a);
                    if (i12 != 0) {
                        ij0Var5 = null;
                    }
                    if (i15 != 0) {
                        ij0Var9 = null;
                    } else {
                        ij0Var9 = ij0Var3;
                    }
                    if (i18 != 0) {
                        ij0Var10 = null;
                    } else {
                        ij0Var10 = ij0Var4;
                    }
                    if (i21 != 0) {
                        z12 = false;
                    } else {
                        z12 = z3;
                    }
                    if (i24 != 0) {
                        io2Var3 = is1.u;
                    } else {
                        io2Var3 = io2Var;
                    }
                    if (i26 != 0) {
                        aw0Var3 = aw0.d;
                    } else {
                        aw0Var3 = aw0Var;
                    }
                    if (i28 != 0) {
                        z13 = false;
                    } else {
                        z13 = z4;
                    }
                    if (z13) {
                        i34 = 1;
                    } else {
                        i34 = Integer.MAX_VALUE;
                    }
                    if (i29 == 0) {
                    }
                    u32 u32VarA113 = j42.a(sv0.A, ak0Var);
                    jd2 jd2VarK113 = q90.k(6, ak0Var);
                    zv0Var3 = zv0.a;
                    u32Var3 = u32VarA113;
                    ij0Var11 = ij0Var10;
                    io2Var4 = io2Var3;
                    i35 = i34;
                    i36 = 1;
                    jd2Var3 = jd2VarK113;
                    ij0Var12 = ij0Var9;
                    aw0Var4 = aw0Var3;
                    vf2Var3 = vf2Var116;
                    ij0Var13 = ij0Var5;
                    z14 = z5;
                    z15 = z6;
                }
                ak0Var.q();
                if (f91Var3 == null) {
                    ak0Var.W(1310051731);
                    objL = ak0Var.L();
                    if (objL == cv.a) {
                        objL = new f91();
                        ak0Var.g0(objL);
                    }
                    f91Var4 = (f91) objL;
                    z16 = false;
                    ak0Var.p(false);
                } else {
                    z16 = false;
                    ak0Var.W(1981921732);
                    ak0Var.p(false);
                    f91Var4 = f91Var3;
                }
                ak0Var.W(1981927842);
                jB = vf2Var3.b();
                if (jB == 16) {
                    zBooleanValue = ((Boolean) mx.r(f91Var4, ak0Var, z16 ? 1 : 0).getValue()).booleanValue();
                    if (!z14) {
                        j = jd2Var3.c;
                    } else if (z12) {
                        j = jd2Var3.d;
                    } else if (zBooleanValue) {
                        j = jd2Var3.a;
                    } else {
                        j = jd2Var3.b;
                    }
                    jB = j;
                    z16 = false;
                }
                ak0Var.p(z16);
                boolean z1119 = z12;
                u71 u71Var15 = u71Var2;
                zv0 zv0Var15 = zv0Var3;
                boolean z11110 = z13;
                sv.a(qf2.a.a(jd2Var3.k), vs0.C(1874034984, new qi1(u71Var15, ij0Var, z1119, jd2Var3, str, ej0Var, z14, z15, vf2Var3.d(new vf2(jB, 0L, null, 0L, 0, 0L, 16777214)), aw0Var4, zv0Var15, z11110, i35, i36, io2Var4, f91Var4, ij0Var13, ij0Var12, ij0Var11, u32Var3), ak0Var), ak0Var, 56);
                vf2Var2 = vf2Var3;
                u71Var3 = u71Var15;
                z10 = z14;
                z11 = z15;
                aw0Var2 = aw0Var4;
                zv0Var2 = zv0Var15;
                z9 = z11110;
                i32 = i35;
                i33 = i36;
                io2Var2 = io2Var4;
                ij0Var7 = ij0Var13;
                ij0Var6 = ij0Var12;
                u32Var2 = u32Var3;
                f91Var2 = f91Var3;
                jd2Var2 = jd2Var3;
                z8 = z1119;
                ij0Var8 = ij0Var11;
            } else {
                ak0Var.R();
                ij0Var6 = ij0Var3;
                z8 = z3;
                io2Var2 = io2Var;
                aw0Var2 = aw0Var;
                z9 = z4;
                i32 = i;
                i33 = i2;
                f91Var2 = f91Var;
                u32Var2 = u32Var;
                jd2Var2 = jd2Var;
                z10 = z5;
                z11 = z6;
                u71Var3 = u71Var2;
                ij0Var7 = ij0Var5;
                vf2Var2 = vf2Var;
                ij0Var8 = ij0Var4;
                zv0Var2 = zv0Var;
            }
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new ij0() { // from class: ni1
                    @Override // defpackage.ij0
                    public final Object g(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = ei1.P(i3 | 1);
                        int iP2 = ei1.P(i4);
                        int iP3 = ei1.P(i5);
                        ux.f(str, ej0Var, u71Var3, z10, z11, vf2Var2, ij0Var, ij0Var7, ij0Var6, ij0Var8, z8, io2Var2, aw0Var2, zv0Var2, z9, i32, i33, f91Var2, u32Var2, jd2Var2, (ak0) obj, iP, iP2, iP3, i6);
                        return ll2.a;
                    }
                };
            }
        }
        i7 |= 3072;
        z5 = z;
        i10 = i6 & 16;
        if (i10 != 0) {
            if ((i3 & 24576) == 0) {
                z6 = z2;
                if (ak0Var.g(z6)) {
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i7 |= i11;
            }
            if ((i3 & 196608) == 0) {
                i7 |= 65536;
            }
            if ((i3 & 1572864) == 0) {
                if (ak0Var.h(ij0Var)) {
                    i37 = 1048576;
                } else {
                    i37 = 524288;
                }
                i7 |= i37;
            }
            i12 = i6 & 128;
            if (i12 != 0) {
                i7 |= 12582912;
                ij0Var5 = ij0Var2;
            } else {
                ij0Var5 = ij0Var2;
                if ((i3 & 12582912) == 0) {
                    if (ak0Var.h(ij0Var5)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i7 |= i13;
                }
            }
            i14 = i7 | 100663296;
            i15 = i6 & 512;
            if (i15 != 0) {
                if ((805306368 & i3) == 0) {
                    if (ak0Var.h(ij0Var3)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i14 |= i16;
                }
                i17 = i4 | 54;
                i18 = i6 & 4096;
                if (i18 != 0) {
                    i19 = i4 | 438;
                } else {
                    if ((i4 & 384) != 0) {
                        if (ak0Var.h(ij0Var4)) {
                            i20 = 256;
                        } else {
                            i20 = 128;
                        }
                        i17 |= i20;
                    }
                    i19 = i17;
                }
                i21 = i6 & 8192;
                if (i21 != 0) {
                    i23 = i19 | 3072;
                } else {
                    int i3111 = i19;
                    if (ak0Var.g(z3)) {
                        i22 = 2048;
                    } else {
                        i22 = 1024;
                    }
                    i23 = i3111 | i22;
                }
                i24 = i6 & 16384;
                if (i24 != 0) {
                    i25 = i23 | 24576;
                } else {
                    i25 = i23 | (ak0Var.f(io2Var) ? 16384 : 8192);
                }
                i26 = i6 & 32768;
                if (i26 != 0) {
                    i25 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i25 |= ak0Var.f(aw0Var) ? 131072 : 65536;
                }
                i27 = i25 | 1572864;
                i28 = i6 & 131072;
                if (i28 != 0) {
                    i27 = i25 | 14155776;
                } else if ((i4 & 12582912) == 0) {
                    i27 |= ak0Var.g(z4) ? 8388608 : 4194304;
                }
                int i4114 = i27 | 838860800;
                i29 = i6 & 1048576;
                if (i29 != 0) {
                    i30 = 6;
                } else if ((i5 & 6) == 0) {
                    if (ak0Var.f(f91Var)) {
                        i31 = 4;
                    } else {
                        i31 = 2;
                    }
                    i30 = i5 | i31;
                } else {
                    i30 = i5;
                }
                int i4115 = i30 | 144;
                if ((i14 & 306783379) != 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (ak0Var.O(i14 & 1, z7)) {
                    ak0Var.T();
                    if ((i3 & 1) != 0) {
                        if (i38 != 0) {
                            u71Var2 = r71.a;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        }
                        vf2 vf2Var117 = (vf2) ak0Var.j(ef2.a);
                        if (i12 != 0) {
                            ij0Var5 = null;
                        }
                        if (i15 != 0) {
                            ij0Var9 = null;
                        } else {
                            ij0Var9 = ij0Var3;
                        }
                        if (i18 != 0) {
                            ij0Var10 = null;
                        } else {
                            ij0Var10 = ij0Var4;
                        }
                        if (i21 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i24 != 0) {
                            io2Var3 = is1.u;
                        } else {
                            io2Var3 = io2Var;
                        }
                        if (i26 != 0) {
                            aw0Var3 = aw0.d;
                        } else {
                            aw0Var3 = aw0Var;
                        }
                        if (i28 != 0) {
                            z13 = false;
                        } else {
                            z13 = z4;
                        }
                        if (z13) {
                            i34 = 1;
                        } else {
                            i34 = Integer.MAX_VALUE;
                        }
                        if (i29 == 0) {
                        }
                        u32 u32VarA114 = j42.a(sv0.A, ak0Var);
                        jd2 jd2VarK114 = q90.k(6, ak0Var);
                        zv0Var3 = zv0.a;
                        u32Var3 = u32VarA114;
                        ij0Var11 = ij0Var10;
                        io2Var4 = io2Var3;
                        i35 = i34;
                        i36 = 1;
                        jd2Var3 = jd2VarK114;
                        ij0Var12 = ij0Var9;
                        aw0Var4 = aw0Var3;
                        vf2Var3 = vf2Var117;
                        ij0Var13 = ij0Var5;
                        z14 = z5;
                        z15 = z6;
                    } else {
                        if (i38 != 0) {
                            u71Var2 = r71.a;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        }
                        if (i10 != 0) {
                            z6 = false;
                        }
                        vf2 vf2Var118 = (vf2) ak0Var.j(ef2.a);
                        if (i12 != 0) {
                            ij0Var5 = null;
                        }
                        if (i15 != 0) {
                            ij0Var9 = null;
                        } else {
                            ij0Var9 = ij0Var3;
                        }
                        if (i18 != 0) {
                            ij0Var10 = null;
                        } else {
                            ij0Var10 = ij0Var4;
                        }
                        if (i21 != 0) {
                            z12 = false;
                        } else {
                            z12 = z3;
                        }
                        if (i24 != 0) {
                            io2Var3 = is1.u;
                        } else {
                            io2Var3 = io2Var;
                        }
                        if (i26 != 0) {
                            aw0Var3 = aw0.d;
                        } else {
                            aw0Var3 = aw0Var;
                        }
                        if (i28 != 0) {
                            z13 = false;
                        } else {
                            z13 = z4;
                        }
                        if (z13) {
                            i34 = 1;
                        } else {
                            i34 = Integer.MAX_VALUE;
                        }
                        if (i29 == 0) {
                        }
                        u32 u32VarA115 = j42.a(sv0.A, ak0Var);
                        jd2 jd2VarK115 = q90.k(6, ak0Var);
                        zv0Var3 = zv0.a;
                        u32Var3 = u32VarA115;
                        ij0Var11 = ij0Var10;
                        io2Var4 = io2Var3;
                        i35 = i34;
                        i36 = 1;
                        jd2Var3 = jd2VarK115;
                        ij0Var12 = ij0Var9;
                        aw0Var4 = aw0Var3;
                        vf2Var3 = vf2Var118;
                        ij0Var13 = ij0Var5;
                        z14 = z5;
                        z15 = z6;
                    }
                    ak0Var.q();
                    if (f91Var3 == null) {
                        ak0Var.W(1310051731);
                        objL = ak0Var.L();
                        if (objL == cv.a) {
                            objL = new f91();
                            ak0Var.g0(objL);
                        }
                        f91Var4 = (f91) objL;
                        z16 = false;
                        ak0Var.p(false);
                    } else {
                        z16 = false;
                        ak0Var.W(1981921732);
                        ak0Var.p(false);
                        f91Var4 = f91Var3;
                    }
                    ak0Var.W(1981927842);
                    jB = vf2Var3.b();
                    if (jB == 16) {
                        zBooleanValue = ((Boolean) mx.r(f91Var4, ak0Var, z16 ? 1 : 0).getValue()).booleanValue();
                        if (!z14) {
                            j = jd2Var3.c;
                        } else if (z12) {
                            j = jd2Var3.d;
                        } else if (zBooleanValue) {
                            j = jd2Var3.a;
                        } else {
                            j = jd2Var3.b;
                        }
                        jB = j;
                        z16 = false;
                    }
                    ak0Var.p(z16);
                    boolean z11111 = z12;
                    u71 u71Var16 = u71Var2;
                    zv0 zv0Var16 = zv0Var3;
                    boolean z11112 = z13;
                    sv.a(qf2.a.a(jd2Var3.k), vs0.C(1874034984, new qi1(u71Var16, ij0Var, z11111, jd2Var3, str, ej0Var, z14, z15, vf2Var3.d(new vf2(jB, 0L, null, 0L, 0, 0L, 16777214)), aw0Var4, zv0Var16, z11112, i35, i36, io2Var4, f91Var4, ij0Var13, ij0Var12, ij0Var11, u32Var3), ak0Var), ak0Var, 56);
                    vf2Var2 = vf2Var3;
                    u71Var3 = u71Var16;
                    z10 = z14;
                    z11 = z15;
                    aw0Var2 = aw0Var4;
                    zv0Var2 = zv0Var16;
                    z9 = z11112;
                    i32 = i35;
                    i33 = i36;
                    io2Var2 = io2Var4;
                    ij0Var7 = ij0Var13;
                    ij0Var6 = ij0Var12;
                    u32Var2 = u32Var3;
                    f91Var2 = f91Var3;
                    jd2Var2 = jd2Var3;
                    z8 = z11111;
                    ij0Var8 = ij0Var11;
                } else {
                    ak0Var.R();
                    ij0Var6 = ij0Var3;
                    z8 = z3;
                    io2Var2 = io2Var;
                    aw0Var2 = aw0Var;
                    z9 = z4;
                    i32 = i;
                    i33 = i2;
                    f91Var2 = f91Var;
                    u32Var2 = u32Var;
                    jd2Var2 = jd2Var;
                    z10 = z5;
                    z11 = z6;
                    u71Var3 = u71Var2;
                    ij0Var7 = ij0Var5;
                    vf2Var2 = vf2Var;
                    ij0Var8 = ij0Var4;
                    zv0Var2 = zv0Var;
                }
                lr1VarR = ak0Var.r();
                if (lr1VarR != null) {
                    lr1VarR.d = new ij0() { // from class: ni1
                        @Override // defpackage.ij0
                        public final Object g(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = ei1.P(i3 | 1);
                            int iP2 = ei1.P(i4);
                            int iP3 = ei1.P(i5);
                            ux.f(str, ej0Var, u71Var3, z10, z11, vf2Var2, ij0Var, ij0Var7, ij0Var6, ij0Var8, z8, io2Var2, aw0Var2, zv0Var2, z9, i32, i33, f91Var2, u32Var2, jd2Var2, (ak0) obj, iP, iP2, iP3, i6);
                            return ll2.a;
                        }
                    };
                }
            }
            i14 = i7 | 905969664;
            i17 = i4 | 54;
            i18 = i6 & 4096;
            if (i18 != 0) {
                i19 = i4 | 438;
            } else {
                if ((i4 & 384) != 0) {
                    if (ak0Var.h(ij0Var4)) {
                        i20 = 256;
                    } else {
                        i20 = 128;
                    }
                    i17 |= i20;
                }
                i19 = i17;
            }
            i21 = i6 & 8192;
            if (i21 != 0) {
                i23 = i19 | 3072;
            } else {
                int i3112 = i19;
                if (ak0Var.g(z3)) {
                    i22 = 2048;
                } else {
                    i22 = 1024;
                }
                i23 = i3112 | i22;
            }
            i24 = i6 & 16384;
            if (i24 != 0) {
                i25 = i23 | 24576;
            } else {
                i25 = i23 | (ak0Var.f(io2Var) ? 16384 : 8192);
            }
            i26 = i6 & 32768;
            if (i26 != 0) {
                i25 |= 196608;
            } else if ((i4 & 196608) == 0) {
                i25 |= ak0Var.f(aw0Var) ? 131072 : 65536;
            }
            i27 = i25 | 1572864;
            i28 = i6 & 131072;
            if (i28 != 0) {
                i27 = i25 | 14155776;
            } else if ((i4 & 12582912) == 0) {
                i27 |= ak0Var.g(z4) ? 8388608 : 4194304;
            }
            int i4116 = i27 | 838860800;
            i29 = i6 & 1048576;
            if (i29 != 0) {
                i30 = 6;
            } else if ((i5 & 6) == 0) {
                if (ak0Var.f(f91Var)) {
                    i31 = 4;
                } else {
                    i31 = 2;
                }
                i30 = i5 | i31;
            } else {
                i30 = i5;
            }
            int i4117 = i30 | 144;
            if ((i14 & 306783379) != 306783378) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (ak0Var.O(i14 & 1, z7)) {
                ak0Var.T();
                if ((i3 & 1) != 0) {
                    if (i38 != 0) {
                        u71Var2 = r71.a;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    }
                    vf2 vf2Var119 = (vf2) ak0Var.j(ef2.a);
                    if (i12 != 0) {
                        ij0Var5 = null;
                    }
                    if (i15 != 0) {
                        ij0Var9 = null;
                    } else {
                        ij0Var9 = ij0Var3;
                    }
                    if (i18 != 0) {
                        ij0Var10 = null;
                    } else {
                        ij0Var10 = ij0Var4;
                    }
                    if (i21 != 0) {
                        z12 = false;
                    } else {
                        z12 = z3;
                    }
                    if (i24 != 0) {
                        io2Var3 = is1.u;
                    } else {
                        io2Var3 = io2Var;
                    }
                    if (i26 != 0) {
                        aw0Var3 = aw0.d;
                    } else {
                        aw0Var3 = aw0Var;
                    }
                    if (i28 != 0) {
                        z13 = false;
                    } else {
                        z13 = z4;
                    }
                    if (z13) {
                        i34 = 1;
                    } else {
                        i34 = Integer.MAX_VALUE;
                    }
                    if (i29 == 0) {
                    }
                    u32 u32VarA116 = j42.a(sv0.A, ak0Var);
                    jd2 jd2VarK116 = q90.k(6, ak0Var);
                    zv0Var3 = zv0.a;
                    u32Var3 = u32VarA116;
                    ij0Var11 = ij0Var10;
                    io2Var4 = io2Var3;
                    i35 = i34;
                    i36 = 1;
                    jd2Var3 = jd2VarK116;
                    ij0Var12 = ij0Var9;
                    aw0Var4 = aw0Var3;
                    vf2Var3 = vf2Var119;
                    ij0Var13 = ij0Var5;
                    z14 = z5;
                    z15 = z6;
                } else {
                    if (i38 != 0) {
                        u71Var2 = r71.a;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    }
                    vf2 vf2Var1110 = (vf2) ak0Var.j(ef2.a);
                    if (i12 != 0) {
                        ij0Var5 = null;
                    }
                    if (i15 != 0) {
                        ij0Var9 = null;
                    } else {
                        ij0Var9 = ij0Var3;
                    }
                    if (i18 != 0) {
                        ij0Var10 = null;
                    } else {
                        ij0Var10 = ij0Var4;
                    }
                    if (i21 != 0) {
                        z12 = false;
                    } else {
                        z12 = z3;
                    }
                    if (i24 != 0) {
                        io2Var3 = is1.u;
                    } else {
                        io2Var3 = io2Var;
                    }
                    if (i26 != 0) {
                        aw0Var3 = aw0.d;
                    } else {
                        aw0Var3 = aw0Var;
                    }
                    if (i28 != 0) {
                        z13 = false;
                    } else {
                        z13 = z4;
                    }
                    if (z13) {
                        i34 = 1;
                    } else {
                        i34 = Integer.MAX_VALUE;
                    }
                    if (i29 == 0) {
                    }
                    u32 u32VarA117 = j42.a(sv0.A, ak0Var);
                    jd2 jd2VarK117 = q90.k(6, ak0Var);
                    zv0Var3 = zv0.a;
                    u32Var3 = u32VarA117;
                    ij0Var11 = ij0Var10;
                    io2Var4 = io2Var3;
                    i35 = i34;
                    i36 = 1;
                    jd2Var3 = jd2VarK117;
                    ij0Var12 = ij0Var9;
                    aw0Var4 = aw0Var3;
                    vf2Var3 = vf2Var1110;
                    ij0Var13 = ij0Var5;
                    z14 = z5;
                    z15 = z6;
                }
                ak0Var.q();
                if (f91Var3 == null) {
                    ak0Var.W(1310051731);
                    objL = ak0Var.L();
                    if (objL == cv.a) {
                        objL = new f91();
                        ak0Var.g0(objL);
                    }
                    f91Var4 = (f91) objL;
                    z16 = false;
                    ak0Var.p(false);
                } else {
                    z16 = false;
                    ak0Var.W(1981921732);
                    ak0Var.p(false);
                    f91Var4 = f91Var3;
                }
                ak0Var.W(1981927842);
                jB = vf2Var3.b();
                if (jB == 16) {
                    zBooleanValue = ((Boolean) mx.r(f91Var4, ak0Var, z16 ? 1 : 0).getValue()).booleanValue();
                    if (!z14) {
                        j = jd2Var3.c;
                    } else if (z12) {
                        j = jd2Var3.d;
                    } else if (zBooleanValue) {
                        j = jd2Var3.a;
                    } else {
                        j = jd2Var3.b;
                    }
                    jB = j;
                    z16 = false;
                }
                ak0Var.p(z16);
                boolean z11113 = z12;
                u71 u71Var17 = u71Var2;
                zv0 zv0Var17 = zv0Var3;
                boolean z11114 = z13;
                sv.a(qf2.a.a(jd2Var3.k), vs0.C(1874034984, new qi1(u71Var17, ij0Var, z11113, jd2Var3, str, ej0Var, z14, z15, vf2Var3.d(new vf2(jB, 0L, null, 0L, 0, 0L, 16777214)), aw0Var4, zv0Var17, z11114, i35, i36, io2Var4, f91Var4, ij0Var13, ij0Var12, ij0Var11, u32Var3), ak0Var), ak0Var, 56);
                vf2Var2 = vf2Var3;
                u71Var3 = u71Var17;
                z10 = z14;
                z11 = z15;
                aw0Var2 = aw0Var4;
                zv0Var2 = zv0Var17;
                z9 = z11114;
                i32 = i35;
                i33 = i36;
                io2Var2 = io2Var4;
                ij0Var7 = ij0Var13;
                ij0Var6 = ij0Var12;
                u32Var2 = u32Var3;
                f91Var2 = f91Var3;
                jd2Var2 = jd2Var3;
                z8 = z11113;
                ij0Var8 = ij0Var11;
            } else {
                ak0Var.R();
                ij0Var6 = ij0Var3;
                z8 = z3;
                io2Var2 = io2Var;
                aw0Var2 = aw0Var;
                z9 = z4;
                i32 = i;
                i33 = i2;
                f91Var2 = f91Var;
                u32Var2 = u32Var;
                jd2Var2 = jd2Var;
                z10 = z5;
                z11 = z6;
                u71Var3 = u71Var2;
                ij0Var7 = ij0Var5;
                vf2Var2 = vf2Var;
                ij0Var8 = ij0Var4;
                zv0Var2 = zv0Var;
            }
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new ij0() { // from class: ni1
                    @Override // defpackage.ij0
                    public final Object g(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = ei1.P(i3 | 1);
                        int iP2 = ei1.P(i4);
                        int iP3 = ei1.P(i5);
                        ux.f(str, ej0Var, u71Var3, z10, z11, vf2Var2, ij0Var, ij0Var7, ij0Var6, ij0Var8, z8, io2Var2, aw0Var2, zv0Var2, z9, i32, i33, f91Var2, u32Var2, jd2Var2, (ak0) obj, iP, iP2, iP3, i6);
                        return ll2.a;
                    }
                };
            }
        }
        i7 |= 24576;
        z6 = z2;
        if ((i3 & 196608) == 0) {
            i7 |= 65536;
        }
        if ((i3 & 1572864) == 0) {
            if (ak0Var.h(ij0Var)) {
                i37 = 1048576;
            } else {
                i37 = 524288;
            }
            i7 |= i37;
        }
        i12 = i6 & 128;
        if (i12 != 0) {
            i7 |= 12582912;
            ij0Var5 = ij0Var2;
        } else {
            ij0Var5 = ij0Var2;
            if ((i3 & 12582912) == 0) {
                if (ak0Var.h(ij0Var5)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i7 |= i13;
            }
        }
        i14 = i7 | 100663296;
        i15 = i6 & 512;
        if (i15 != 0) {
            if ((805306368 & i3) == 0) {
                if (ak0Var.h(ij0Var3)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i14 |= i16;
            }
            i17 = i4 | 54;
            i18 = i6 & 4096;
            if (i18 != 0) {
                i19 = i4 | 438;
            } else {
                if ((i4 & 384) != 0) {
                    if (ak0Var.h(ij0Var4)) {
                        i20 = 256;
                    } else {
                        i20 = 128;
                    }
                    i17 |= i20;
                }
                i19 = i17;
            }
            i21 = i6 & 8192;
            if (i21 != 0) {
                i23 = i19 | 3072;
            } else {
                int i3113 = i19;
                if (ak0Var.g(z3)) {
                    i22 = 2048;
                } else {
                    i22 = 1024;
                }
                i23 = i3113 | i22;
            }
            i24 = i6 & 16384;
            if (i24 != 0) {
                i25 = i23 | 24576;
            } else {
                i25 = i23 | (ak0Var.f(io2Var) ? 16384 : 8192);
            }
            i26 = i6 & 32768;
            if (i26 != 0) {
                i25 |= 196608;
            } else if ((i4 & 196608) == 0) {
                i25 |= ak0Var.f(aw0Var) ? 131072 : 65536;
            }
            i27 = i25 | 1572864;
            i28 = i6 & 131072;
            if (i28 != 0) {
                i27 = i25 | 14155776;
            } else if ((i4 & 12582912) == 0) {
                i27 |= ak0Var.g(z4) ? 8388608 : 4194304;
            }
            int i4118 = i27 | 838860800;
            i29 = i6 & 1048576;
            if (i29 != 0) {
                i30 = 6;
            } else if ((i5 & 6) == 0) {
                if (ak0Var.f(f91Var)) {
                    i31 = 4;
                } else {
                    i31 = 2;
                }
                i30 = i5 | i31;
            } else {
                i30 = i5;
            }
            int i4119 = i30 | 144;
            if ((i14 & 306783379) != 306783378) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (ak0Var.O(i14 & 1, z7)) {
                ak0Var.T();
                if ((i3 & 1) != 0) {
                    if (i38 != 0) {
                        u71Var2 = r71.a;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    }
                    vf2 vf2Var1111 = (vf2) ak0Var.j(ef2.a);
                    if (i12 != 0) {
                        ij0Var5 = null;
                    }
                    if (i15 != 0) {
                        ij0Var9 = null;
                    } else {
                        ij0Var9 = ij0Var3;
                    }
                    if (i18 != 0) {
                        ij0Var10 = null;
                    } else {
                        ij0Var10 = ij0Var4;
                    }
                    if (i21 != 0) {
                        z12 = false;
                    } else {
                        z12 = z3;
                    }
                    if (i24 != 0) {
                        io2Var3 = is1.u;
                    } else {
                        io2Var3 = io2Var;
                    }
                    if (i26 != 0) {
                        aw0Var3 = aw0.d;
                    } else {
                        aw0Var3 = aw0Var;
                    }
                    if (i28 != 0) {
                        z13 = false;
                    } else {
                        z13 = z4;
                    }
                    if (z13) {
                        i34 = 1;
                    } else {
                        i34 = Integer.MAX_VALUE;
                    }
                    if (i29 == 0) {
                    }
                    u32 u32VarA118 = j42.a(sv0.A, ak0Var);
                    jd2 jd2VarK118 = q90.k(6, ak0Var);
                    zv0Var3 = zv0.a;
                    u32Var3 = u32VarA118;
                    ij0Var11 = ij0Var10;
                    io2Var4 = io2Var3;
                    i35 = i34;
                    i36 = 1;
                    jd2Var3 = jd2VarK118;
                    ij0Var12 = ij0Var9;
                    aw0Var4 = aw0Var3;
                    vf2Var3 = vf2Var1111;
                    ij0Var13 = ij0Var5;
                    z14 = z5;
                    z15 = z6;
                } else {
                    if (i38 != 0) {
                        u71Var2 = r71.a;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    }
                    if (i10 != 0) {
                        z6 = false;
                    }
                    vf2 vf2Var1112 = (vf2) ak0Var.j(ef2.a);
                    if (i12 != 0) {
                        ij0Var5 = null;
                    }
                    if (i15 != 0) {
                        ij0Var9 = null;
                    } else {
                        ij0Var9 = ij0Var3;
                    }
                    if (i18 != 0) {
                        ij0Var10 = null;
                    } else {
                        ij0Var10 = ij0Var4;
                    }
                    if (i21 != 0) {
                        z12 = false;
                    } else {
                        z12 = z3;
                    }
                    if (i24 != 0) {
                        io2Var3 = is1.u;
                    } else {
                        io2Var3 = io2Var;
                    }
                    if (i26 != 0) {
                        aw0Var3 = aw0.d;
                    } else {
                        aw0Var3 = aw0Var;
                    }
                    if (i28 != 0) {
                        z13 = false;
                    } else {
                        z13 = z4;
                    }
                    if (z13) {
                        i34 = 1;
                    } else {
                        i34 = Integer.MAX_VALUE;
                    }
                    if (i29 == 0) {
                    }
                    u32 u32VarA119 = j42.a(sv0.A, ak0Var);
                    jd2 jd2VarK119 = q90.k(6, ak0Var);
                    zv0Var3 = zv0.a;
                    u32Var3 = u32VarA119;
                    ij0Var11 = ij0Var10;
                    io2Var4 = io2Var3;
                    i35 = i34;
                    i36 = 1;
                    jd2Var3 = jd2VarK119;
                    ij0Var12 = ij0Var9;
                    aw0Var4 = aw0Var3;
                    vf2Var3 = vf2Var1112;
                    ij0Var13 = ij0Var5;
                    z14 = z5;
                    z15 = z6;
                }
                ak0Var.q();
                if (f91Var3 == null) {
                    ak0Var.W(1310051731);
                    objL = ak0Var.L();
                    if (objL == cv.a) {
                        objL = new f91();
                        ak0Var.g0(objL);
                    }
                    f91Var4 = (f91) objL;
                    z16 = false;
                    ak0Var.p(false);
                } else {
                    z16 = false;
                    ak0Var.W(1981921732);
                    ak0Var.p(false);
                    f91Var4 = f91Var3;
                }
                ak0Var.W(1981927842);
                jB = vf2Var3.b();
                if (jB == 16) {
                    zBooleanValue = ((Boolean) mx.r(f91Var4, ak0Var, z16 ? 1 : 0).getValue()).booleanValue();
                    if (!z14) {
                        j = jd2Var3.c;
                    } else if (z12) {
                        j = jd2Var3.d;
                    } else if (zBooleanValue) {
                        j = jd2Var3.a;
                    } else {
                        j = jd2Var3.b;
                    }
                    jB = j;
                    z16 = false;
                }
                ak0Var.p(z16);
                boolean z11115 = z12;
                u71 u71Var18 = u71Var2;
                zv0 zv0Var18 = zv0Var3;
                boolean z11116 = z13;
                sv.a(qf2.a.a(jd2Var3.k), vs0.C(1874034984, new qi1(u71Var18, ij0Var, z11115, jd2Var3, str, ej0Var, z14, z15, vf2Var3.d(new vf2(jB, 0L, null, 0L, 0, 0L, 16777214)), aw0Var4, zv0Var18, z11116, i35, i36, io2Var4, f91Var4, ij0Var13, ij0Var12, ij0Var11, u32Var3), ak0Var), ak0Var, 56);
                vf2Var2 = vf2Var3;
                u71Var3 = u71Var18;
                z10 = z14;
                z11 = z15;
                aw0Var2 = aw0Var4;
                zv0Var2 = zv0Var18;
                z9 = z11116;
                i32 = i35;
                i33 = i36;
                io2Var2 = io2Var4;
                ij0Var7 = ij0Var13;
                ij0Var6 = ij0Var12;
                u32Var2 = u32Var3;
                f91Var2 = f91Var3;
                jd2Var2 = jd2Var3;
                z8 = z11115;
                ij0Var8 = ij0Var11;
            } else {
                ak0Var.R();
                ij0Var6 = ij0Var3;
                z8 = z3;
                io2Var2 = io2Var;
                aw0Var2 = aw0Var;
                z9 = z4;
                i32 = i;
                i33 = i2;
                f91Var2 = f91Var;
                u32Var2 = u32Var;
                jd2Var2 = jd2Var;
                z10 = z5;
                z11 = z6;
                u71Var3 = u71Var2;
                ij0Var7 = ij0Var5;
                vf2Var2 = vf2Var;
                ij0Var8 = ij0Var4;
                zv0Var2 = zv0Var;
            }
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new ij0() { // from class: ni1
                    @Override // defpackage.ij0
                    public final Object g(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = ei1.P(i3 | 1);
                        int iP2 = ei1.P(i4);
                        int iP3 = ei1.P(i5);
                        ux.f(str, ej0Var, u71Var3, z10, z11, vf2Var2, ij0Var, ij0Var7, ij0Var6, ij0Var8, z8, io2Var2, aw0Var2, zv0Var2, z9, i32, i33, f91Var2, u32Var2, jd2Var2, (ak0) obj, iP, iP2, iP3, i6);
                        return ll2.a;
                    }
                };
            }
        }
        i14 = i7 | 905969664;
        i17 = i4 | 54;
        i18 = i6 & 4096;
        if (i18 != 0) {
            i19 = i4 | 438;
        } else {
            if ((i4 & 384) != 0) {
                if (ak0Var.h(ij0Var4)) {
                    i20 = 256;
                } else {
                    i20 = 128;
                }
                i17 |= i20;
            }
            i19 = i17;
        }
        i21 = i6 & 8192;
        if (i21 != 0) {
            i23 = i19 | 3072;
        } else {
            int i3114 = i19;
            if (ak0Var.g(z3)) {
                i22 = 2048;
            } else {
                i22 = 1024;
            }
            i23 = i3114 | i22;
        }
        i24 = i6 & 16384;
        if (i24 != 0) {
            i25 = i23 | 24576;
        } else {
            i25 = i23 | (ak0Var.f(io2Var) ? 16384 : 8192);
        }
        i26 = i6 & 32768;
        if (i26 != 0) {
            i25 |= 196608;
        } else if ((i4 & 196608) == 0) {
            i25 |= ak0Var.f(aw0Var) ? 131072 : 65536;
        }
        i27 = i25 | 1572864;
        i28 = i6 & 131072;
        if (i28 != 0) {
            i27 = i25 | 14155776;
        } else if ((i4 & 12582912) == 0) {
            i27 |= ak0Var.g(z4) ? 8388608 : 4194304;
        }
        int i41110 = i27 | 838860800;
        i29 = i6 & 1048576;
        if (i29 != 0) {
            i30 = 6;
        } else if ((i5 & 6) == 0) {
            if (ak0Var.f(f91Var)) {
                i31 = 4;
            } else {
                i31 = 2;
            }
            i30 = i5 | i31;
        } else {
            i30 = i5;
        }
        int i41111 = i30 | 144;
        if ((i14 & 306783379) != 306783378) {
            z7 = true;
        } else {
            z7 = true;
        }
        if (ak0Var.O(i14 & 1, z7)) {
            ak0Var.T();
            if ((i3 & 1) != 0) {
                if (i38 != 0) {
                    u71Var2 = r71.a;
                }
                if (i8 != 0) {
                    z5 = true;
                }
                if (i10 != 0) {
                    z6 = false;
                }
                vf2 vf2Var1113 = (vf2) ak0Var.j(ef2.a);
                if (i12 != 0) {
                    ij0Var5 = null;
                }
                if (i15 != 0) {
                    ij0Var9 = null;
                } else {
                    ij0Var9 = ij0Var3;
                }
                if (i18 != 0) {
                    ij0Var10 = null;
                } else {
                    ij0Var10 = ij0Var4;
                }
                if (i21 != 0) {
                    z12 = false;
                } else {
                    z12 = z3;
                }
                if (i24 != 0) {
                    io2Var3 = is1.u;
                } else {
                    io2Var3 = io2Var;
                }
                if (i26 != 0) {
                    aw0Var3 = aw0.d;
                } else {
                    aw0Var3 = aw0Var;
                }
                if (i28 != 0) {
                    z13 = false;
                } else {
                    z13 = z4;
                }
                if (z13) {
                    i34 = 1;
                } else {
                    i34 = Integer.MAX_VALUE;
                }
                if (i29 == 0) {
                }
                u32 u32VarA1110 = j42.a(sv0.A, ak0Var);
                jd2 jd2VarK1110 = q90.k(6, ak0Var);
                zv0Var3 = zv0.a;
                u32Var3 = u32VarA1110;
                ij0Var11 = ij0Var10;
                io2Var4 = io2Var3;
                i35 = i34;
                i36 = 1;
                jd2Var3 = jd2VarK1110;
                ij0Var12 = ij0Var9;
                aw0Var4 = aw0Var3;
                vf2Var3 = vf2Var1113;
                ij0Var13 = ij0Var5;
                z14 = z5;
                z15 = z6;
            } else {
                if (i38 != 0) {
                    u71Var2 = r71.a;
                }
                if (i8 != 0) {
                    z5 = true;
                }
                if (i10 != 0) {
                    z6 = false;
                }
                vf2 vf2Var1114 = (vf2) ak0Var.j(ef2.a);
                if (i12 != 0) {
                    ij0Var5 = null;
                }
                if (i15 != 0) {
                    ij0Var9 = null;
                } else {
                    ij0Var9 = ij0Var3;
                }
                if (i18 != 0) {
                    ij0Var10 = null;
                } else {
                    ij0Var10 = ij0Var4;
                }
                if (i21 != 0) {
                    z12 = false;
                } else {
                    z12 = z3;
                }
                if (i24 != 0) {
                    io2Var3 = is1.u;
                } else {
                    io2Var3 = io2Var;
                }
                if (i26 != 0) {
                    aw0Var3 = aw0.d;
                } else {
                    aw0Var3 = aw0Var;
                }
                if (i28 != 0) {
                    z13 = false;
                } else {
                    z13 = z4;
                }
                if (z13) {
                    i34 = 1;
                } else {
                    i34 = Integer.MAX_VALUE;
                }
                if (i29 == 0) {
                }
                u32 u32VarA1111 = j42.a(sv0.A, ak0Var);
                jd2 jd2VarK1111 = q90.k(6, ak0Var);
                zv0Var3 = zv0.a;
                u32Var3 = u32VarA1111;
                ij0Var11 = ij0Var10;
                io2Var4 = io2Var3;
                i35 = i34;
                i36 = 1;
                jd2Var3 = jd2VarK1111;
                ij0Var12 = ij0Var9;
                aw0Var4 = aw0Var3;
                vf2Var3 = vf2Var1114;
                ij0Var13 = ij0Var5;
                z14 = z5;
                z15 = z6;
            }
            ak0Var.q();
            if (f91Var3 == null) {
                ak0Var.W(1310051731);
                objL = ak0Var.L();
                if (objL == cv.a) {
                    objL = new f91();
                    ak0Var.g0(objL);
                }
                f91Var4 = (f91) objL;
                z16 = false;
                ak0Var.p(false);
            } else {
                z16 = false;
                ak0Var.W(1981921732);
                ak0Var.p(false);
                f91Var4 = f91Var3;
            }
            ak0Var.W(1981927842);
            jB = vf2Var3.b();
            if (jB == 16) {
                zBooleanValue = ((Boolean) mx.r(f91Var4, ak0Var, z16 ? 1 : 0).getValue()).booleanValue();
                if (!z14) {
                    j = jd2Var3.c;
                } else if (z12) {
                    j = jd2Var3.d;
                } else if (zBooleanValue) {
                    j = jd2Var3.a;
                } else {
                    j = jd2Var3.b;
                }
                jB = j;
                z16 = false;
            }
            ak0Var.p(z16);
            boolean z11117 = z12;
            u71 u71Var19 = u71Var2;
            zv0 zv0Var19 = zv0Var3;
            boolean z11118 = z13;
            sv.a(qf2.a.a(jd2Var3.k), vs0.C(1874034984, new qi1(u71Var19, ij0Var, z11117, jd2Var3, str, ej0Var, z14, z15, vf2Var3.d(new vf2(jB, 0L, null, 0L, 0, 0L, 16777214)), aw0Var4, zv0Var19, z11118, i35, i36, io2Var4, f91Var4, ij0Var13, ij0Var12, ij0Var11, u32Var3), ak0Var), ak0Var, 56);
            vf2Var2 = vf2Var3;
            u71Var3 = u71Var19;
            z10 = z14;
            z11 = z15;
            aw0Var2 = aw0Var4;
            zv0Var2 = zv0Var19;
            z9 = z11118;
            i32 = i35;
            i33 = i36;
            io2Var2 = io2Var4;
            ij0Var7 = ij0Var13;
            ij0Var6 = ij0Var12;
            u32Var2 = u32Var3;
            f91Var2 = f91Var3;
            jd2Var2 = jd2Var3;
            z8 = z11117;
            ij0Var8 = ij0Var11;
        } else {
            ak0Var.R();
            ij0Var6 = ij0Var3;
            z8 = z3;
            io2Var2 = io2Var;
            aw0Var2 = aw0Var;
            z9 = z4;
            i32 = i;
            i33 = i2;
            f91Var2 = f91Var;
            u32Var2 = u32Var;
            jd2Var2 = jd2Var;
            z10 = z5;
            z11 = z6;
            u71Var3 = u71Var2;
            ij0Var7 = ij0Var5;
            vf2Var2 = vf2Var;
            ij0Var8 = ij0Var4;
            zv0Var2 = zv0Var;
        }
        lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: ni1
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(i3 | 1);
                    int iP2 = ei1.P(i4);
                    int iP3 = ei1.P(i5);
                    ux.f(str, ej0Var, u71Var3, z10, z11, vf2Var2, ij0Var, ij0Var7, ij0Var6, ij0Var8, z8, io2Var2, aw0Var2, zv0Var2, z9, i32, i33, f91Var2, u32Var2, jd2Var2, (ak0) obj, iP, iP2, iP3, i6);
                    return ll2.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:168:0x027c  */
    /* JADX WARN: Code duplicated, block: B:170:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:171:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:176:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:178:0x02df  */
    /* JADX WARN: Code duplicated, block: B:180:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:182:0x0314  */
    /* JADX WARN: Code duplicated, block: B:183:0x0318  */
    /* JADX WARN: Code duplicated, block: B:188:0x0333  */
    /* JADX WARN: Code duplicated, block: B:191:0x0351  */
    /* JADX WARN: Code duplicated, block: B:194:0x0365  */
    /* JADX WARN: Code duplicated, block: B:196:0x036b  */
    /* JADX WARN: Code duplicated, block: B:199:0x0371  */
    /* JADX WARN: Code duplicated, block: B:201:0x0377  */
    /* JADX WARN: Code duplicated, block: B:203:0x037c  */
    /* JADX WARN: Code duplicated, block: B:206:0x0382  */
    /* JADX WARN: Code duplicated, block: B:208:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:209:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:214:0x03de  */
    /* JADX WARN: Code duplicated, block: B:216:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:218:0x040a  */
    /* JADX WARN: Code duplicated, block: B:220:0x0446  */
    /* JADX WARN: Code duplicated, block: B:221:0x044a  */
    /* JADX WARN: Code duplicated, block: B:226:0x0465  */
    /* JADX WARN: Code duplicated, block: B:229:0x0485  */
    /* JADX WARN: Code duplicated, block: B:232:0x049c  */
    /* JADX WARN: Code duplicated, block: B:233:0x049f  */
    /* JADX WARN: Code duplicated, block: B:235:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:236:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:239:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:240:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:243:0x0504  */
    /* JADX WARN: Code duplicated, block: B:244:0x0508  */
    /* JADX WARN: Code duplicated, block: B:249:0x0523  */
    /* JADX WARN: Code duplicated, block: B:252:0x053c  */
    /* JADX WARN: Code duplicated, block: B:254:0x0547  */
    /* JADX WARN: Code duplicated, block: B:256:0x054b  */
    /* JADX WARN: Code duplicated, block: B:259:0x0554  */
    /* JADX WARN: Code duplicated, block: B:261:0x0558  */
    /* JADX WARN: Code duplicated, block: B:265:0x0561  */
    /* JADX WARN: Code duplicated, block: B:267:0x0565  */
    /* JADX WARN: Code duplicated, block: B:270:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:271:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:274:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:276:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:278:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:280:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:282:0x0626  */
    /* JADX WARN: Code duplicated, block: B:283:0x062a  */
    /* JADX WARN: Code duplicated, block: B:288:0x0645  */
    /* JADX WARN: Code duplicated, block: B:290:0x0661  */
    public static final void g(final ij0 ij0Var, jj0 jj0Var, ij0 ij0Var2, final ij0 ij0Var3, final ij0 ij0Var4, ij0 ij0Var5, final ij0 ij0Var6, final boolean z, final xd2 xd2Var, final ud2 ud2Var, final ej0 ej0Var, final gt gtVar, ij0 ij0Var7, gj1 gj1Var, ak0 ak0Var, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        ij0 ij0Var8;
        jj0 jj0Var2;
        ij0 ij0Var9;
        final ij0 ij0Var10;
        ak0 ak0Var2;
        wi wiVar;
        float f;
        ak0 ak0Var3;
        wi wiVar2;
        ra raVar;
        o71 o71Var;
        boolean z3;
        float fX;
        float fW;
        float f2;
        float f3;
        ij0 ij0Var11;
        wi wiVar3;
        ij0 ij0Var12;
        float f4;
        float f5;
        u71 u71VarF0;
        jj0 jj0Var3;
        int iX;
        ij0 ij0Var13;
        ij0 ij0Var14;
        boolean z4;
        int iX2;
        Object obj;
        boolean z5;
        Object objL;
        int iX3;
        int iX4;
        int iX5;
        float f6;
        int iX6;
        int iX7;
        ij0 ij0Var15 = ij0Var5;
        gj1 gj1Var2 = gj1Var;
        wi wiVar4 = q90.j;
        wi wiVar5 = q90.f;
        ak0Var.X(753699262);
        int i5 = i & 6;
        r71 r71Var = r71.a;
        if (i5 == 0) {
            i3 = i | (ak0Var.f(r71Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ak0Var.h(ij0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ak0Var.h(jj0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ak0Var.h(ij0Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ak0Var.h(ij0Var3) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= ak0Var.h(ij0Var4) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= ak0Var.h(ij0Var15) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= ak0Var.h(ij0Var6) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            z2 = z;
            i3 |= ak0Var.g(z2) ? 67108864 : 33554432;
        } else {
            z2 = z;
        }
        if ((i & 805306368) == 0) {
            i3 |= ak0Var.f(xd2Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? ak0Var.f(ud2Var) : ak0Var.h(ud2Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ak0Var.h(ej0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ak0Var.h(gtVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ak0Var.h(ij0Var7) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= ak0Var.f(gj1Var2) ? 16384 : 8192;
        }
        int i6 = i4;
        if (ak0Var.O(i3 & 1, ((i3 & 306783379) == 306783378 && (i6 & 9363) == 9362) ? false : true)) {
            float f7 = ((w60) ak0Var.j(yr0.c)).e;
            if (Float.isNaN(f7)) {
                f7 = 0.0f;
            }
            float f8 = (f7 - p61.G) / 2.0f;
            if (f8 < 0.0f) {
                f8 = 0.0f;
            }
            int i7 = i6 & 14;
            boolean zC = ((i3 & 234881024) == 67108864) | ((i6 & 112) == 32) | ((i3 & 1879048192) == 536870912) | (i7 == 4 || ((i6 & 8) != 0 && ak0Var.f(ud2Var))) | ((i6 & 57344) == 16384) | ak0Var.c(f8);
            Object objL2 = ak0Var.L();
            is1 is1Var = cv.a;
            if (zC || objL2 == is1Var) {
                wiVar = wiVar4;
                boolean z6 = z2;
                ak0 ak0Var4 = ak0Var;
                f = f8;
                ui1 ui1Var = new ui1(ej0Var, z6, xd2Var, ud2Var, gj1Var2, f);
                ak0Var4.g0(ui1Var);
                objL2 = ui1Var;
                ak0Var3 = ak0Var4;
            } else {
                wiVar = wiVar4;
                ak0Var3 = ak0Var;
                f = f8;
            }
            ui1 ui1Var2 = (ui1) objL2;
            kw0 kw0Var = (kw0) ak0Var3.j(yv.n);
            int iX8 = ws0.x(ak0Var3);
            sl1 sl1VarL = ak0Var3.l();
            u71 u71VarB = nj2.B(ak0Var3, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0227: INVOKE (r7v3 'u71VarB' u71) = (r3v6 'ak0Var3' ak0), (r21v2 u71) STATIC call: nj2.B(ak0, u71):u71 A[DECLARE_VAR, MD:(ak0, u71):u71 (m)] (LINE:21) in method: ux.g(ij0, jj0, ij0, ij0, ij0, ij0, ij0, boolean, xd2, ud2, ej0, gt, ij0, gj1, ak0, int, int):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v2 u71
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1703
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ux.g(ij0, jj0, ij0, ij0, ij0, ij0, ij0, boolean, xd2, ud2, ej0, gt, ij0, gj1, ak0, int, int):void");
        }

        public static final void h(boolean z, ij0 ij0Var, ak0 ak0Var, int i) {
            ak0Var.X(1818896922);
            int i2 = (ak0Var.g(z) ? 4 : 2) | i | (ak0Var.h(ij0Var) ? 32 : 16);
            if ((i2 & 19) == 18 && ak0Var.A()) {
                ak0Var.R();
            } else {
                qx.g(z, ij0Var, ak0Var, i2 & 126);
            }
            lr1 lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new cy(z, ij0Var, i);
            }
        }

        public static final hv1 i(float f, float f2, float f3, float f4, long j) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
            return new hv1(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
        }

        public static final void j(c91 c91Var, int i) {
            if (c91Var.b == 0 || !(c91Var.b(0) == i || c91Var.b(c91Var.b - 1) == i)) {
                int i2 = c91Var.b;
                c91Var.a(i);
                while (i2 > 0) {
                    int i3 = ((i2 + 1) >>> 1) - 1;
                    int iB = c91Var.b(i3);
                    if (i <= iB) {
                        break;
                    }
                    c91Var.d(i2, iB);
                    i2 = i3;
                }
                c91Var.d(i2, i);
            }
        }

        /* JADX WARN: Code duplicated, block: B:101:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:39:0x00cf A[Catch: jt0 -> 0x0193, TRY_ENTER, TRY_LEAVE, TryCatch #7 {jt0 -> 0x0193, blocks: (B:35:0x00bf, B:39:0x00cf, B:53:0x00f4, B:55:0x0108, B:59:0x011d, B:63:0x0125), top: B:112:0x00bf }] */
        /* JADX WARN: Code duplicated, block: B:42:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:46:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:50:0x00ef A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:51:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:52:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:57:0x011a  */
        /* JADX WARN: Code duplicated, block: B:58:0x011c  */
        /* JADX WARN: Code duplicated, block: B:61:0x0120  */
        /* JADX WARN: Code duplicated, block: B:62:0x0123  */
        /* JADX WARN: Code duplicated, block: B:72:0x016e  */
        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x016e -> B:73:0x0177). Please report as a decompilation issue!!! */
        /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
            java.lang.StackOverflowError
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
            */
        public static final java.lang.Object k(defpackage.m01 r27, int r28, int r29, defpackage.m40 r30, defpackage.tx r31) {
            /*
                Method dump skipped, instruction units count: 525
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ux.k(m01, int, int, m40, tx):java.lang.Object");
        }

        public static final boolean l(boolean z, m01 m01Var, int i) {
            q01 q01Var = (q01) m01Var.c;
            if (z) {
                if (q01Var.h() > i) {
                    return true;
                }
                return q01Var.h() == i && q01Var.i() > 0;
            }
            if (q01Var.h() < i) {
                return true;
            }
            return q01Var.h() == i && q01Var.i() < 0;
        }

        public static final boolean m(yr1 yr1Var, float f, float f2) {
            float f3 = yr1Var.a;
            if (f > yr1Var.c || f3 > f) {
                return false;
            }
            return f2 <= yr1Var.d && yr1Var.b <= f2;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0064  */
        /* JADX WARN: Code duplicated, block: B:28:0x0065  */
        /* JADX WARN: Code duplicated, block: B:31:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0054, B:29:0x0069, B:31:0x0071, B:20:0x0045, B:24:0x0050), top: B:50:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x0086 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:35:0x0088  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
        
            if (r1.k(r10, r0) == r5) goto L33;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:14:0x0032). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final java.lang.Object n(defpackage.qe0 r7, defpackage.lo r8, boolean r9, defpackage.sx r10) throws java.lang.Throwable {
            /*
                boolean r0 = r10 instanceof defpackage.ve0
                if (r0 == 0) goto L13
                r0 = r10
                ve0 r0 = (defpackage.ve0) r0
                int r1 = r0.m
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.m = r1
                goto L18
            L13:
                ve0 r0 = new ve0
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.l
                int r1 = r0.m
                r2 = 0
                r3 = 2
                r4 = 1
                fz r5 = defpackage.fz.e
                if (r1 == 0) goto L49
                if (r1 == r4) goto L3d
                if (r1 != r3) goto L37
                boolean r9 = r0.k
                wk r7 = r0.j
                lo r8 = r0.i
                qe0 r1 = r0.h
                defpackage.ix.Q(r10)     // Catch: java.lang.Throwable -> L35
            L32:
                r10 = r7
                r7 = r1
                goto L54
            L35:
                r7 = move-exception
                goto L8e
            L37:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.fu1.h(r7)
                return r2
            L3d:
                boolean r9 = r0.k
                wk r7 = r0.j
                lo r8 = r0.i
                qe0 r1 = r0.h
                defpackage.ix.Q(r10)     // Catch: java.lang.Throwable -> L35
                goto L69
            L49:
                defpackage.ix.Q(r10)
                boolean r10 = r7 instanceof defpackage.qg2
                if (r10 != 0) goto La9
                wk r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
            L54:
                r0.h = r7     // Catch: java.lang.Throwable -> L35
                r0.i = r8     // Catch: java.lang.Throwable -> L35
                r0.j = r10     // Catch: java.lang.Throwable -> L35
                r0.k = r9     // Catch: java.lang.Throwable -> L35
                r0.m = r4     // Catch: java.lang.Throwable -> L35
                java.lang.Object r1 = r10.b(r0)     // Catch: java.lang.Throwable -> L35
                if (r1 != r5) goto L65
                goto L85
            L65:
                r6 = r1
                r1 = r7
                r7 = r10
                r10 = r6
            L69:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
                if (r10 == 0) goto L86
                java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
                r0.h = r1     // Catch: java.lang.Throwable -> L35
                r0.i = r8     // Catch: java.lang.Throwable -> L35
                r0.j = r7     // Catch: java.lang.Throwable -> L35
                r0.k = r9     // Catch: java.lang.Throwable -> L35
                r0.m = r3     // Catch: java.lang.Throwable -> L35
                java.lang.Object r10 = r1.k(r10, r0)     // Catch: java.lang.Throwable -> L35
                if (r10 != r5) goto L32
            L85:
                return r5
            L86:
                if (r9 == 0) goto L8b
                r8.d(r2)
            L8b:
                ll2 r7 = defpackage.ll2.a
                return r7
            L8e:
                throw r7     // Catch: java.lang.Throwable -> L8f
            L8f:
                r10 = move-exception
                if (r9 == 0) goto La8
                boolean r9 = r7 instanceof java.util.concurrent.CancellationException
                if (r9 == 0) goto L99
                r2 = r7
                java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
            L99:
                if (r2 != 0) goto La5
                java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
                java.lang.String r9 = "Channel was consumed, consumer had failed"
                r2.<init>(r9)
                r2.initCause(r7)
            La5:
                r8.d(r2)
            La8:
                throw r10
            La9:
                qg2 r7 = (defpackage.qg2) r7
                java.lang.Throwable r7 = r7.e
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ux.n(qe0, lo, boolean, sx):java.lang.Object");
        }

        public static final cg0 o(cg0 cg0Var) {
            cg0 cg0VarF = ((vf0) ((e5) qx.W(cg0Var)).getFocusOwner()).f();
            if (cg0VarF == null || !cg0VarF.r) {
                return null;
            }
            return cg0VarF;
        }

        public static final yr1 p(cg0 cg0Var) {
            me1 me1Var;
            if (cg0Var.r && (me1Var = cg0Var.l) != null) {
                jw0 jw0VarA = sv.A(me1Var);
                if (!jw0VarA.A()) {
                    jw0VarA = null;
                }
                if (jw0VarA != null) {
                    return cg0Var.I0(jw0VarA);
                }
            }
            return yr1.e;
        }

        public static Object q(Object obj, Class cls) {
            if (obj instanceof kk0) {
                return cls.cast(obj);
            }
            if (obj instanceof lk0) {
                return q(((lk0) obj).d(), cls);
            }
            throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + kk0.class + " or " + lk0.class);
        }

        public static final cg0 r(cg0 cg0Var) {
            boolean z = cg0Var.e.r;
            if (z) {
                if (!z) {
                    vp0.b("visitChildren called on an unattached node");
                }
                fa1 fa1Var = new fa1(new t71[16]);
                t71 t71Var = cg0Var.e;
                t71 t71Var2 = t71Var.j;
                if (t71Var2 == null) {
                    qx.j(fa1Var, t71Var);
                } else {
                    fa1Var.b(t71Var2);
                }
                while (true) {
                    int i = fa1Var.g;
                    if (i == 0) {
                        break;
                    }
                    t71 t71VarP = (t71) fa1Var.k(i - 1);
                    if ((t71VarP.h & 1024) == 0) {
                        qx.j(fa1Var, t71VarP);
                    } else {
                        while (t71VarP != null) {
                            if ((t71VarP.g & 1024) != 0) {
                                fa1 fa1Var2 = null;
                                while (t71VarP != null) {
                                    if (t71VarP instanceof cg0) {
                                        cg0 cg0Var2 = (cg0) t71VarP;
                                        if (cg0Var2.e.r) {
                                            int iOrdinal = cg0Var2.K0().ordinal();
                                            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                                return cg0Var2;
                                            }
                                            if (iOrdinal != 3) {
                                                qj.p();
                                                return null;
                                            }
                                        }
                                    } else if ((t71VarP.g & 1024) != 0 && (t71VarP instanceof c40)) {
                                        int i2 = 0;
                                        for (t71 t71Var3 = ((c40) t71VarP).t; t71Var3 != null; t71Var3 = t71Var3.j) {
                                            if ((t71Var3.g & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    t71VarP = t71Var3;
                                                } else {
                                                    if (fa1Var2 == null) {
                                                        fa1Var2 = new fa1(new t71[16]);
                                                    }
                                                    if (t71VarP != null) {
                                                        fa1Var2.b(t71VarP);
                                                        t71VarP = null;
                                                    }
                                                    fa1Var2.b(t71Var3);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    t71VarP = qx.P(fa1Var2);
                                }
                                break;
                            }
                            t71VarP = t71VarP.j;
                        }
                    }
                }
            }
            return null;
        }

        public static final Class s(s12 s12Var) {
            String strY = o92.y(s12Var.b(), "?", "");
            try {
                return Class.forName(strY);
            } catch (ClassNotFoundException unused) {
                if (h92.C(strY, ".", false)) {
                    Pattern patternCompile = Pattern.compile("(\\.+)(?!.*\\.)");
                    patternCompile.getClass();
                    String strReplaceAll = patternCompile.matcher(strY).replaceAll("\\$");
                    strReplaceAll.getClass();
                    return Class.forName(strReplaceAll);
                }
                String strConcat = "Cannot find class with name \"" + s12Var.b() + "\". Ensure that the serialName for this argument is the default fully qualified name";
                if (s12Var.c() instanceof x12) {
                    strConcat = strConcat.concat(".\nIf the build is minified, try annotating the Enum class with \"androidx.annotation.Keep\" to ensure the Enum is not removed.");
                }
                qj.r(strConcat);
                return null;
            }
        }

        public static int t(Context context, int i) {
            TypedValue typedValue = new TypedValue();
            Integer numValueOf = null;
            if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
                typedValue = null;
            }
            if (typedValue != null) {
                int i2 = typedValue.resourceId;
                numValueOf = Integer.valueOf(i2 != 0 ? context.getColor(i2) : typedValue.data);
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            return 0;
        }

        public static final int u(Layout layout, int i, boolean z) {
            if (i <= 0) {
                return 0;
            }
            if (i >= layout.getText().length()) {
                return layout.getLineCount() - 1;
            }
            int lineForOffset = layout.getLineForOffset(i);
            int lineStart = layout.getLineStart(lineForOffset);
            int lineEnd = layout.getLineEnd(lineForOffset);
            if (lineStart == i || lineEnd == i) {
                if (lineStart == i) {
                    if (z) {
                        return lineForOffset - 1;
                    }
                } else if (!z) {
                    return lineForOffset + 1;
                }
            }
            return lineForOffset;
        }

        public static final long v(ao2 ao2Var) {
            DragEvent dragEvent = (DragEvent) ao2Var.f;
            float x = dragEvent.getX();
            float y = dragEvent.getY();
            return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
        }

        public static final int w(s12 s12Var, s12[] s12VarArr) {
            s12VarArr.getClass();
            int iHashCode = (s12Var.b().hashCode() * 31) + Arrays.hashCode(s12VarArr);
            int iD = s12Var.d();
            int i = 1;
            while (true) {
                int iHashCode2 = 0;
                if (!(iD > 0)) {
                    break;
                }
                int i2 = iD - 1;
                int i3 = i * 31;
                String strB = s12Var.j(s12Var.d() - iD).b();
                if (strB != null) {
                    iHashCode2 = strB.hashCode();
                }
                i = i3 + iHashCode2;
                iD = i2;
            }
            int iD2 = s12Var.d();
            int iHashCode3 = 1;
            while (true) {
                if (!(iD2 > 0)) {
                    return (((iHashCode * 31) + i) * 31) + iHashCode3;
                }
                int i4 = iD2 - 1;
                int i5 = iHashCode3 * 31;
                y12 y12VarC = s12Var.j(s12Var.d() - iD2).c();
                iHashCode3 = i5 + (y12VarC != null ? y12VarC.hashCode() : 0);
                iD2 = i4;
            }
        }

        public static final void x(fc1 fc1Var, String str) {
            fc1Var.k(fc1Var.b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
            throw null;
        }

        public static final boolean y(cg0 cg0Var) {
            ax0 ax0Var;
            me1 me1Var;
            ax0 ax0Var2;
            me1 me1Var2 = cg0Var.l;
            return (me1Var2 == null || (ax0Var = me1Var2.s) == null || !ax0Var.I() || (me1Var = cg0Var.l) == null || (ax0Var2 = me1Var.s) == null || !ax0Var2.H()) ? false : true;
        }

        public static final boolean z(m01 m01Var, int i) {
            return i <= m01Var.c() && ((q01) m01Var.c).h() <= i;
        }
    }
