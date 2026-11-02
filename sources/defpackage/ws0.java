package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ws0 {
    public static final float A;
    public static final float B;
    public static final hk2 C;
    public static final kr D;
    public static final float E;
    public static final kr F;
    public static final kr G;
    public static final y32 H;
    public static final kr I;
    public static final float J;
    public static final s12[] K;
    public static final ou1 L;
    public static final pa0 M;
    public static final iq1 N;
    public static final Object O;
    public static final /* synthetic */ int P = 0;
    public static final ee e;
    public static final is1 i;
    public static final pa0 k;
    public static final gt l;
    public static final pa0 o;
    public static final pa0 p;
    public static final pa0 q;
    public static final hk2 s;
    public static final int[] t;
    public static final int[] u;
    public static final int[] v;
    public static final int[] w;
    public static final t8 x;
    public static final Object y;
    public static final kr z;
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData};
    public static final ee f = new ee(2);
    public static final fe g = new fe();
    public static final is1 h = new is1(18);
    public static final is1 j = new is1(19);
    public static final gt m = new gt(new ut(21), false, -348284306);
    public static final gt n = new gt(new qt(11), false, -1471076760);
    public static final y32 r = y32.h;

    static {
        int i2 = 3;
        e = new ee(i2);
        int i3 = 20;
        i = new is1(i3);
        int i4 = 1;
        k = new pa0("RESUME_TOKEN", i4);
        l = new gt(new ut(i3), false, -1498116593);
        o = new pa0("CLOSED", i4);
        p = new pa0("UNDEFINED", i4);
        q = new pa0("REUSABLE_CLAIMED", i4);
        hk2 hk2Var = hk2.j;
        s = hk2Var;
        t = new int[]{1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        u = new int[]{1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
        v = new int[]{3, 6};
        w = new int[]{1, 2, 4, 5, 7, 8};
        x = new t8(i2);
        y = new Object();
        kr krVar = kr.l;
        z = krVar;
        A = 0.38f;
        B = 0.12f;
        C = hk2Var;
        D = kr.n;
        E = 1.0f;
        F = kr.s;
        G = kr.k;
        H = y32.g;
        I = krVar;
        J = 18.0f;
        K = new s12[0];
        L = new ou1();
        M = new pa0("NO_VALUE", i4);
        N = new iq1(16);
        O = new Object();
    }

    public static final boolean A(p02 p02Var) {
        Object objG = p02Var.d.e.g(u02.K);
        if (objG == null) {
            objG = null;
        }
        ch2 ch2Var = (ch2) objG;
        w91 w91Var = p02Var.d.e;
        Object objG2 = w91Var.g(u02.z);
        if (objG2 == null) {
            objG2 = null;
        }
        wu1 wu1Var = (wu1) objG2;
        boolean z2 = ch2Var != null;
        Object objG3 = w91Var.g(u02.J);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (wu1Var != null && wu1Var.a == 4)) {
            return z2;
        }
        return true;
    }

    public static final String B(p02 p02Var, Resources resources) {
        int iH;
        i02 i02Var = p02Var.d;
        i02 i02Var2 = p02Var.d;
        Object objG = i02Var.e.g(u02.b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        w91 w91Var = i02Var2.e;
        Object objG2 = w91Var.g(u02.K);
        if (objG2 == null) {
            objG2 = null;
        }
        ch2 ch2Var = (ch2) objG2;
        Object objG3 = w91Var.g(u02.z);
        if (objG3 == null) {
            objG3 = null;
        }
        wu1 wu1Var = (wu1) objG3;
        if (ch2Var != null) {
            int iOrdinal = ch2Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        qj.p();
                        return null;
                    }
                    if (objG == null) {
                        objG = resources.getString(ir.alirezaivaz.mygarage.R.string.indeterminate);
                    }
                } else if (wu1Var != null && wu1Var.a == 2 && objG == null) {
                    objG = resources.getString(ir.alirezaivaz.mygarage.R.string.state_off);
                }
            } else if (wu1Var != null && wu1Var.a == 2 && objG == null) {
                objG = resources.getString(ir.alirezaivaz.mygarage.R.string.state_on);
            }
        }
        Object objG4 = w91Var.g(u02.J);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((wu1Var == null || wu1Var.a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(ir.alirezaivaz.mygarage.R.string.selected) : resources.getString(ir.alirezaivaz.mygarage.R.string.not_selected);
            }
        }
        Object objG5 = w91Var.g(u02.c);
        if (objG5 == null) {
            objG5 = null;
        }
        oq1 oq1Var = (oq1) objG5;
        if (oq1Var != null) {
            if (oq1Var != oq1.c) {
                if (objG == null) {
                    float f2 = oq1Var.b.a;
                    float f3 = f2 - 0.0f == 0.0f ? 0.0f : (oq1Var.a - 0.0f) / (f2 - 0.0f);
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    }
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                    if (f3 == 0.0f) {
                        iH = 0;
                    } else {
                        iH = f3 == 1.0f ? 100 : ex.h(Math.round(f3 * 100.0f), 1, 99);
                    }
                    objG = resources.getString(ir.alirezaivaz.mygarage.R.string.template_percent, Integer.valueOf(iH));
                }
            } else if (objG == null) {
                objG = resources.getString(ir.alirezaivaz.mygarage.R.string.in_progress);
            }
        }
        y02 y02Var = u02.G;
        if (w91Var.c(y02Var)) {
            w91 w91Var2 = new p02(p02Var.a, true, p02Var.c, i02Var2).k().e;
            Object objG6 = w91Var2.g(u02.a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = w91Var2.g(u02.C);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = w91Var2.g(y02Var);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(ir.alirezaivaz.mygarage.R.string.state_empty);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    public static final yb C(p02 p02Var) {
        Object objG = p02Var.d.e.g(u02.G);
        if (objG == null) {
            objG = null;
        }
        yb ybVar = (yb) objG;
        Object objG2 = p02Var.d.e.g(u02.C);
        if (objG2 == null) {
            objG2 = null;
        }
        List list = (List) objG2;
        return ybVar == null ? list != null ? (yb) vq.R(list) : null : ybVar;
    }

    public static final u71 D(u71 u71Var) {
        return u71Var.c(new lb2(new gm2(8)));
    }

    public static final boolean E(p02 p02Var, Resources resources) {
        Object objG = p02Var.d.e.g(u02.a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !j20.v(p02Var) && (p02Var.d.g || (p02Var.p() && ((list != null ? (String) vq.R(list) : null) != null || C(p02Var) != null || B(p02Var, resources) != null || A(p02Var))));
    }

    public static final aq F(nv0 nv0Var) {
        aq aqVarB = nv0Var.a.a.b();
        if (aqVarB instanceof aq) {
            return aqVarB;
        }
        throw new IllegalArgumentException("Only KClass supported as classifier, got " + aqVarB);
    }

    public static final long G(long j2, long j3, float f2) {
        zf1 zf1Var = qr.x;
        long jA = dr.a(j2, zf1Var);
        long jA2 = dr.a(j3, zf1Var);
        float fC = dr.c(jA);
        float fG = dr.g(jA);
        float f3 = dr.f(jA);
        float fD = dr.d(jA);
        float fC2 = dr.c(jA2);
        float fG2 = dr.g(jA2);
        float f4 = dr.f(jA2);
        float fD2 = dr.d(jA2);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return dr.a(i(rw.D(fG, fG2, f2), rw.D(f3, f4, f2), rw.D(fD, fD2, f2), rw.D(fC, fC2, f2), zf1Var), dr.e(j3));
    }

    public static final dq0 H(String str, String str2, int i2, ej0 ej0Var) {
        char cCharAt = str.charAt(i2);
        if (((Boolean) ej0Var.h(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return I(str, "Expected " + str2 + ", but got '" + cCharAt + "' at position " + i2);
    }

    public static final dq0 I(String str, String str2) {
        return new dq0(16, str2 + " when parsing an Instant from \"" + W(str, 64) + '\"', str);
    }

    public static final int J(String str, int i2) {
        return (str.charAt(i2 + 1) - '0') + ((str.charAt(i2) - '0') * 10);
    }

    public static void K(int i2, int[] iArr, int[] iArr2, boolean z2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2.0f;
        if (!z2) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i8;
        }
    }

    public static void L(int i2, int[] iArr, int[] iArr2, boolean z2) {
        if (iArr.length == 0) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float fMax = (i2 - i4) / Math.max(iArr.length - 1, 1);
        float f2 = (z2 && iArr.length == 1) ? fMax : 0.0f;
        if (z2) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                iArr2[length] = Math.round(f2);
                f2 += i6 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i7 = 0;
        while (i3 < length2) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f2);
            f2 += i8 + fMax;
            i3++;
            i7++;
        }
    }

    public static void M(int i2, int[] iArr, int[] iArr2, boolean z2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = (i2 - i4) / (iArr.length + 1);
        if (z2) {
            float f2 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i6 = iArr[length2];
                iArr2[length2] = Math.round(f2);
                f2 += i6 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f3 = length;
        int i7 = 0;
        while (i3 < length3) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f3);
            f3 += i8 + length;
            i3++;
            i7++;
        }
    }

    public static final yj0 N(ak0 ak0Var) {
        ak0 ak0Var2;
        ak0Var.U(206, hv.e);
        if (ak0Var.S) {
            o52.y(ak0Var.I);
        }
        Object objD = ak0Var.D();
        ek0 au1Var = objD instanceof ek0 ? (ek0) objD : null;
        if (au1Var == null) {
            ak0Var2 = ak0Var;
            au1Var = new au1(new xj0(new yj0(ak0Var2, ak0Var.T, ak0Var.q, ak0Var.C, ak0Var.h.x)), -1);
            ak0Var2.h0(au1Var);
        } else {
            ak0Var2 = ak0Var;
        }
        yj0 yj0Var = ((xj0) au1Var.a).e;
        yj0Var.f.setValue(ak0Var2.l());
        ak0Var2.p(false);
        return yj0Var;
    }

    public static final void O(sx sxVar, Object obj) {
        if (!(sxVar instanceof p50)) {
            sxVar.i(obj);
            return;
        }
        p50 p50Var = (p50) sxVar;
        xy xyVar = p50Var.h;
        tx txVar = p50Var.i;
        Throwable thA = vt1.a(obj);
        Object osVar = thA == null ? obj : new os(thA, false);
        if (xyVar.G(txVar.f())) {
            p50Var.j = osVar;
            p50Var.g = 1;
            xyVar.E(txVar.f(), p50Var);
            return;
        }
        ac0 ac0VarA = ig2.a();
        if (ac0VarA.g >= 4294967296L) {
            p50Var.j = osVar;
            p50Var.g = 1;
            ac0VarA.J(p50Var);
            return;
        }
        ac0VarA.K(true);
        try {
            ot0 ot0Var = (ot0) txVar.f().p(q90.P);
            if (ot0Var == null || ot0Var.b()) {
                Object obj2 = p50Var.k;
                uy uyVarF = txVar.f();
                Object objS0 = p61.s0(uyVarF, obj2);
                il2 il2VarT = objS0 != p61.j0 ? ix.T(txVar, uyVarF, objS0) : null;
                try {
                    txVar.i(obj);
                    if (il2VarT == null || il2VarT.k0()) {
                        p61.h0(uyVarF, objS0);
                    }
                } catch (Throwable th) {
                    if (il2VarT == null || il2VarT.k0()) {
                        p61.h0(uyVarF, objS0);
                    }
                    throw th;
                }
            } else {
                p50Var.i(ix.q(ot0Var.r()));
            }
            while (ac0VarA.M()) {
            }
        } catch (Throwable th2) {
            try {
                p50Var.h(th2);
            } finally {
                ac0VarA.I(true);
            }
        }
    }

    public static void P(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static final void Q(aq aqVar) {
        aqVar.getClass();
        String strC = aqVar.c();
        if (strC == null) {
            strC = "<local class name not available>";
        }
        throw new a22(k3.j("Serializer for class '", strC, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static final void R(Object[] objArr, long j2, Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }

    public static final long S(float f2, long j2) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j2 >> 32)) - f2);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static final u71 T(u71 u71Var, ru1 ru1Var, fe2 fe2Var, ge2 ge2Var, wx wxVar) {
        return u71Var.c(new cd2(ru1Var, fe2Var, ge2Var, wxVar));
    }

    public static void U(String str) {
        ps psVar = new ps(k3.j("lateinit property ", str, " has not been initialized"));
        P(psVar, ws0.class.getName());
        throw psVar;
    }

    public static final int V(long j2) {
        float[] fArr = qr.a;
        return (int) (dr.a(j2, qr.e) >>> 32);
    }

    public static final String W(String str, int i2) {
        if (str.length() <= i2) {
            return str.toString();
        }
        return str.subSequence(0, i2).toString() + "...";
    }

    public static final void a(ti0 ti0Var, u71 u71Var, ao aoVar, ak0 ak0Var, int i2) {
        u71 u71Var2;
        ao aoVar2;
        ao aoVar3;
        u71 u71Var3;
        da1 da1Var;
        ti0Var.getClass();
        ak0Var.X(1366151004);
        int i3 = 4;
        int i4 = i2 | (ak0Var.h(ti0Var) ? 4 : 2) | 176;
        if (ak0Var.O(i4 & 1, (i4 & 147) != 146)) {
            ak0Var.T();
            if ((i2 & 1) == 0 || ak0Var.y()) {
                co2 co2VarA = o31.a(ak0Var);
                if (co2VarA == null) {
                    fu1.h("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    aoVar3 = (ao) p12.r(js1.a(ao.class), co2VarA, sv.y(co2VarA, ak0Var), co2VarA instanceof zl0 ? ((zl0) co2VarA).f() : jz.b, ak0Var);
                    u71Var3 = r71.a;
                }
            } else {
                ak0Var.R();
                u71Var3 = u71Var;
                aoVar3 = aoVar;
            }
            ak0Var.q();
            da1 da1VarR = qx.r(aoVar3.c, ak0Var);
            Object objL = ak0Var.L();
            is1 is1Var = cv.a;
            if (objL == is1Var) {
                objL = y12.s(Boolean.FALSE);
                ak0Var.g0(objL);
            }
            da1 da1Var2 = (da1) objL;
            Object objL2 = ak0Var.L();
            if (objL2 == is1Var) {
                objL2 = new r9(da1Var2, i3);
                ak0Var.g0(objL2);
            }
            u71 u71VarT = sv0.T(u71Var3, false, null, null, (ti0) objL2, 15);
            u71 u71Var4 = u71Var3;
            sv1 sv1VarA = rv1.a(e, q90.p, ak0Var, 48);
            int iHashCode = Long.hashCode(ak0Var.T);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71VarT);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(vu.f, ak0Var, sv1VarA);
            p12.l(vu.e, ak0Var, sl1VarL);
            p12.f(ak0Var, Integer.valueOf(iHashCode), vu.g);
            p12.k(ak0Var, vu.h);
            p12.l(vu.d, ak0Var, u71VarB);
            wm wmVar = ((yn) da1VarR.getValue()).b;
            String strR = wmVar != null ? wmVar.b : null;
            if (strR == null) {
                ak0Var.W(34761529);
                strR = j02.r(ir.alirezaivaz.mygarage.R.string.app_name, ak0Var);
            } else {
                ak0Var.W(34760816);
            }
            ak0Var.p(false);
            ao aoVar4 = aoVar3;
            ef2.b(strR, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var, 0, 0, 262142);
            fo0.a(nj2.q(), j02.r(ir.alirezaivaz.mygarage.R.string.home_switch_car, ak0Var), null, 0L, ak0Var, 0, 12);
            ak0Var.p(true);
            boolean zBooleanValue = ((Boolean) da1Var2.getValue()).booleanValue();
            Object objL3 = ak0Var.L();
            if (objL3 == is1Var) {
                da1Var = da1Var2;
                objL3 = new r9(da1Var, 5);
                ak0Var.g0(objL3);
            } else {
                da1Var = da1Var2;
            }
            t7.a(zBooleanValue, (ti0) objL3, null, 0L, null, null, null, 0L, 0.0f, vs0.C(-604555049, new kz0(ti0Var, da1VarR, aoVar4, da1Var), ak0Var), ak0Var, 48);
            u71Var2 = u71Var4;
            aoVar2 = aoVar4;
        } else {
            ak0Var.R();
            u71Var2 = u71Var;
            aoVar2 = aoVar;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new p1(ti0Var, (Object) u71Var2, (un2) aoVar2, i2, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0145  */
    /* JADX WARN: Code duplicated, block: B:106:0x015c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0163  */
    /* JADX WARN: Code duplicated, block: B:113:0x0170 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0172  */
    /* JADX WARN: Code duplicated, block: B:116:0x0177  */
    /* JADX WARN: Code duplicated, block: B:118:0x017b  */
    /* JADX WARN: Code duplicated, block: B:119:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0181 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0183  */
    /* JADX WARN: Code duplicated, block: B:123:0x018c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0191  */
    /* JADX WARN: Code duplicated, block: B:126:0x0193  */
    /* JADX WARN: Code duplicated, block: B:128:0x0199  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:80:0x0101  */
    /* JADX WARN: Code duplicated, block: B:83:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0111  */
    /* JADX WARN: Code duplicated, block: B:85:0x0114  */
    /* JADX WARN: Code duplicated, block: B:87:0x0117  */
    /* JADX WARN: Code duplicated, block: B:89:0x011b  */
    /* JADX WARN: Code duplicated, block: B:90:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0123  */
    /* JADX WARN: Code duplicated, block: B:94:0x012c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0132  */
    /* JADX WARN: Code duplicated, block: B:97:0x0135  */
    /* JADX WARN: Code duplicated, block: B:99:0x013b  */
    public static final long b(float f2, float f3, float f4, float f5, mr mrVar) {
        int i2;
        int i3;
        int i4;
        float fB;
        float fA;
        int iFloatToRawIntBits;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float fB2;
        float fA2;
        int iFloatToRawIntBits2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float f6;
        if (mrVar.c()) {
            float f7 = f5 < 0.0f ? 0.0f : f5;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i21 = ((int) ((f7 * 255.0f) + 0.5f)) << 24;
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i22 = i21 | (((int) ((f8 * 255.0f) + 0.5f)) << 16);
            float f9 = f3 < 0.0f ? 0.0f : f3;
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            int i23 = i22 | (((int) ((f9 * 255.0f) + 0.5f)) << 8);
            f6 = f4 >= 0.0f ? f4 : 0.0f;
            long j2 = ((long) (i23 | ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i24 = dr.h;
            return j2;
        }
        if (((int) (mrVar.b >> 32)) != 3) {
            up0.a("Color only works with ColorSpaces with 3 components");
        }
        int i25 = mrVar.c;
        if (i25 == -1) {
            up0.a("Unknown color space, please use a color space in ColorSpaces");
        }
        int i26 = 0;
        float fB3 = mrVar.b(0);
        float fA3 = mrVar.a(0);
        if (f2 >= fB3) {
            fB3 = f2;
        }
        if (fB3 <= fA3) {
            fA3 = fB3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fA3);
        int i27 = iFloatToRawIntBits3 >>> 31;
        int i28 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i29 = iFloatToRawIntBits3 & 8388607;
        if (i28 == 255) {
            i3 = i29 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i28 - 112;
            if (i2 >= 31) {
                i3 = 0;
                i2 = 49;
            } else {
                if (i2 > 0) {
                    int i30 = i29 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i4 = (((i2 << 10) | i30) + 1) | (i27 << 15);
                    } else {
                        i3 = i30;
                    }
                    short s2 = (short) i4;
                    fB = mrVar.b(1);
                    fA = mrVar.a(1);
                    if (f3 >= fB) {
                        fB = f3;
                    }
                    if (fB <= fA) {
                        fA = fB;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fA);
                    i5 = iFloatToRawIntBits >>> 31;
                    i6 = (iFloatToRawIntBits >>> 23) & 255;
                    i7 = iFloatToRawIntBits & 8388607;
                    if (i6 == 255) {
                        if (i7 != 0) {
                            i10 = 512;
                        } else {
                            i10 = 0;
                        }
                        i8 = 31;
                    } else {
                        i8 = i6 - 112;
                        if (i8 >= 31) {
                            i10 = 0;
                            i8 = 49;
                        } else {
                            if (i8 <= 0) {
                                i9 = i7 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                                } else {
                                    i10 = i9;
                                }
                                short s3 = (short) i11;
                                fB2 = mrVar.b(2);
                                fA2 = mrVar.a(2);
                                if (f4 >= fB2) {
                                    fB2 = f4;
                                }
                                if (fB2 <= fA2) {
                                    fA2 = fB2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                                i13 = iFloatToRawIntBits2 >>> 31;
                                i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i15 = 8388607 & iFloatToRawIntBits2;
                                if (i14 == 255) {
                                    i18 = i15 != 0 ? 512 : 0;
                                    i26 = 31;
                                } else {
                                    i16 = i14 - 112;
                                    if (i16 >= 31) {
                                        i18 = 0;
                                        i26 = 49;
                                    } else {
                                        if (i16 <= 0) {
                                            i17 = i15 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                            } else {
                                                i18 = i17;
                                                i26 = i16;
                                            }
                                            short s4 = (short) i19;
                                            f6 = f5 >= 0.0f ? f5 : 0.0f;
                                            long j3 = (((long) i25) & 63) | ((((long) s2) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((65535 & ((long) s4)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i31 = dr.h;
                                            return j3;
                                        }
                                        if (i16 >= -10) {
                                            i20 = (i15 | 8388608) >> (1 - i16);
                                            if ((i20 & 4096) != 0) {
                                                i20 += 8192;
                                            }
                                            i18 = i20 >> 13;
                                        } else {
                                            i18 = 0;
                                        }
                                    }
                                }
                                i19 = i18 | (i13 << 15) | (i26 << 10);
                                short s5 = (short) i19;
                                if (f5 >= 0.0f) {
                                }
                                long j4 = (((long) i25) & 63) | ((((long) s2) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((65535 & ((long) s5)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i32 = dr.h;
                                return j4;
                            }
                            if (i8 >= -10) {
                                i12 = (i7 | 8388608) >> (1 - i8);
                                if ((i12 & 4096) != 0) {
                                    i12 += 8192;
                                }
                                i10 = i12 >> 13;
                                i8 = 0;
                            } else {
                                i10 = 0;
                                i8 = 0;
                            }
                        }
                    }
                    i11 = i10 | (i5 << 15) | (i8 << 10);
                    short s6 = (short) i11;
                    fB2 = mrVar.b(2);
                    fA2 = mrVar.a(2);
                    if (f4 >= fB2) {
                        fB2 = f4;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i18 = i15 != 0 ? 512 : 0;
                        i26 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i18 = 0;
                            i26 = 49;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                    i26 = i16;
                                }
                                short s7 = (short) i19;
                                if (f5 >= 0.0f) {
                                }
                                long j5 = (((long) i25) & 63) | ((((long) s2) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((65535 & ((long) s7)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i33 = dr.h;
                                return j5;
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i18 = i20 >> 13;
                            } else {
                                i18 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i26 << 10);
                    short s8 = (short) i19;
                    if (f5 >= 0.0f) {
                    }
                    long j6 = (((long) i25) & 63) | ((((long) s2) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((65535 & ((long) s8)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i34 = dr.h;
                    return j6;
                }
                if (i2 >= -10) {
                    int i35 = (i29 | 8388608) >> (1 - i2);
                    if ((i35 & 4096) != 0) {
                        i35 += 8192;
                    }
                    i3 = i35 >> 13;
                    i2 = 0;
                } else {
                    i3 = 0;
                    i2 = 0;
                }
            }
        }
        i4 = i3 | (i27 << 15) | (i2 << 10);
        short s9 = (short) i4;
        fB = mrVar.b(1);
        fA = mrVar.a(1);
        if (f3 >= fB) {
            fB = f3;
        }
        if (fB <= fA) {
            fA = fB;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fA);
        i5 = iFloatToRawIntBits >>> 31;
        i6 = (iFloatToRawIntBits >>> 23) & 255;
        i7 = iFloatToRawIntBits & 8388607;
        if (i6 == 255) {
            if (i7 != 0) {
                i10 = 512;
            } else {
                i10 = 0;
            }
            i8 = 31;
        } else {
            i8 = i6 - 112;
            if (i8 >= 31) {
                i10 = 0;
                i8 = 49;
            } else {
                if (i8 <= 0) {
                    i9 = i7 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                    } else {
                        i10 = i9;
                    }
                    short s10 = (short) i11;
                    fB2 = mrVar.b(2);
                    fA2 = mrVar.a(2);
                    if (f4 >= fB2) {
                        fB2 = f4;
                    }
                    if (fB2 <= fA2) {
                        fA2 = fB2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i18 = i15 != 0 ? 512 : 0;
                        i26 = 31;
                    } else {
                        i16 = i14 - 112;
                        if (i16 >= 31) {
                            i18 = 0;
                            i26 = 49;
                        } else {
                            if (i16 <= 0) {
                                i17 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                                } else {
                                    i18 = i17;
                                    i26 = i16;
                                }
                                short s11 = (short) i19;
                                if (f5 >= 0.0f) {
                                }
                                long j7 = (((long) i25) & 63) | ((((long) s9) & 65535) << 48) | ((((long) s10) & 65535) << 32) | ((65535 & ((long) s11)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i36 = dr.h;
                                return j7;
                            }
                            if (i16 >= -10) {
                                i20 = (i15 | 8388608) >> (1 - i16);
                                if ((i20 & 4096) != 0) {
                                    i20 += 8192;
                                }
                                i18 = i20 >> 13;
                            } else {
                                i18 = 0;
                            }
                        }
                    }
                    i19 = i18 | (i13 << 15) | (i26 << 10);
                    short s12 = (short) i19;
                    if (f5 >= 0.0f) {
                    }
                    long j8 = (((long) i25) & 63) | ((((long) s9) & 65535) << 48) | ((((long) s10) & 65535) << 32) | ((65535 & ((long) s12)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i37 = dr.h;
                    return j8;
                }
                if (i8 >= -10) {
                    i12 = (i7 | 8388608) >> (1 - i8);
                    if ((i12 & 4096) != 0) {
                        i12 += 8192;
                    }
                    i10 = i12 >> 13;
                    i8 = 0;
                } else {
                    i10 = 0;
                    i8 = 0;
                }
            }
        }
        i11 = i10 | (i5 << 15) | (i8 << 10);
        short s13 = (short) i11;
        fB2 = mrVar.b(2);
        fA2 = mrVar.a(2);
        if (f4 >= fB2) {
            fB2 = f4;
        }
        if (fB2 <= fA2) {
            fA2 = fB2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
        i13 = iFloatToRawIntBits2 >>> 31;
        i14 = (iFloatToRawIntBits2 >>> 23) & 255;
        i15 = 8388607 & iFloatToRawIntBits2;
        if (i14 == 255) {
            i18 = i15 != 0 ? 512 : 0;
            i26 = 31;
        } else {
            i16 = i14 - 112;
            if (i16 >= 31) {
                i18 = 0;
                i26 = 49;
            } else {
                if (i16 <= 0) {
                    i17 = i15 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i19 = (((i16 << 10) | i17) + 1) | (i13 << 15);
                    } else {
                        i18 = i17;
                        i26 = i16;
                    }
                    short s14 = (short) i19;
                    if (f5 >= 0.0f) {
                    }
                    long j9 = (((long) i25) & 63) | ((((long) s9) & 65535) << 48) | ((((long) s13) & 65535) << 32) | ((65535 & ((long) s14)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i38 = dr.h;
                    return j9;
                }
                if (i16 >= -10) {
                    i20 = (i15 | 8388608) >> (1 - i16);
                    if ((i20 & 4096) != 0) {
                        i20 += 8192;
                    }
                    i18 = i20 >> 13;
                } else {
                    i18 = 0;
                }
            }
        }
        i19 = i18 | (i13 << 15) | (i26 << 10);
        short s15 = (short) i19;
        if (f5 >= 0.0f) {
        }
        long j10 = (((long) i25) & 63) | ((((long) s9) & 65535) << 48) | ((((long) s13) & 65535) << 32) | ((65535 & ((long) s15)) << 16) | ((((long) ((int) (((f6 <= 1.0f ? f6 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i39 = dr.h;
        return j10;
    }

    public static final long c(int i2) {
        long j2 = ((long) i2) << 32;
        int i3 = dr.h;
        return j2;
    }

    public static final long d(long j2) {
        long j3 = j2 << 32;
        int i2 = dr.h;
        return j3;
    }

    public static long e(int i2, int i3, int i4) {
        return c(((i2 & 255) << 16) | (-16777216) | ((i3 & 255) << 8) | (i4 & 255));
    }

    public static n42 f(int i2, vk vkVar) {
        int i3 = (i2 & 1) != 0 ? 0 : 1;
        int i4 = (i2 & 2) == 0 ? 16 : 0;
        if (i3 <= 0 && i4 <= 0 && vkVar != vk.e) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + vkVar).toString());
        }
        int i5 = i4 + i3;
        if (i5 < 0) {
            i5 = Integer.MAX_VALUE;
        }
        return new n42(i3, i5, vkVar);
    }

    public static final void g(u71 u71Var, ij0 ij0Var, ak0 ak0Var, int i2) {
        ak0Var.X(-1298353104);
        int i3 = i2 | 6 | (ak0Var.h(ij0Var) ? 32 : 16);
        int i4 = 1;
        if (ak0Var.O(i3 & 1, (i3 & 19) != 18)) {
            Object objL = ak0Var.L();
            if (objL == cv.a) {
                objL = new aa2(q90.V);
                ak0Var.g0(objL);
            }
            r71 r71Var = r71.a;
            h((aa2) objL, r71Var, ij0Var, ak0Var, (i3 << 3) & 1008);
            u71Var = r71Var;
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new o6(u71Var, ij0Var, i2, i4);
        }
    }

    public static final void h(aa2 aa2Var, u71 u71Var, ij0 ij0Var, ak0 ak0Var, int i2) {
        int i3;
        ak0Var.X(-511989831);
        if ((i2 & 6) == 0) {
            i3 = (ak0Var.h(aa2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ak0Var.f(u71Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ak0Var.h(ij0Var) ? 256 : 128;
        }
        if (ak0Var.O(i3 & 1, (i3 & 147) != 146)) {
            int iHashCode = Long.hashCode(ak0Var.T);
            yj0 yj0VarN = N(ak0Var);
            u71 u71VarB = nj2.B(ak0Var, u71Var);
            sl1 sl1VarL = ak0Var.l();
            wv wvVar = wv.o;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(aa2Var.c, ak0Var, aa2Var);
            p12.l(aa2Var.d, ak0Var, yj0VarN);
            p12.l(aa2Var.e, ak0Var, ij0Var);
            wu.c.getClass();
            p12.l(vu.e, ak0Var, sl1VarL);
            p12.k(ak0Var, vu.h);
            p12.l(vu.d, ak0Var, u71VarB);
            p12.l(vu.g, ak0Var, Integer.valueOf(iHashCode));
            ak0Var.p(true);
            if (ak0Var.A()) {
                ak0Var.W(-1259187287);
                ak0Var.p(false);
            } else {
                ak0Var.W(-1259245908);
                boolean zH = ak0Var.h(aa2Var);
                Object objL = ak0Var.L();
                if (zH || objL == cv.a) {
                    objL = new h8(13, aa2Var);
                    ak0Var.g0(objL);
                }
                s5.v((ti0) objL, ak0Var);
                ak0Var.p(false);
            }
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new x92(aa2Var, u71Var, ij0Var, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    public static final long i(float f2, float f3, float f4, float f5, mr mrVar) {
        int i2;
        int i3;
        int i4;
        int iFloatToRawIntBits;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iFloatToRawIntBits2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (mrVar.c()) {
            long j2 = ((long) ((((((int) ((f5 * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16)) | (((int) ((f3 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f4) + 0.5f)))) << 32;
            int i19 = dr.h;
            return j2;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f2);
        int i20 = iFloatToRawIntBits3 >>> 31;
        int i21 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i22 = iFloatToRawIntBits3 & 8388607;
        int i23 = 49;
        int i24 = 0;
        if (i21 == 255) {
            i3 = i22 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i21 - 112;
            if (i2 >= 31) {
                i2 = 49;
                i3 = 0;
            } else {
                if (i2 > 0) {
                    int i25 = i22 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i4 = (((i2 << 10) | i25) + 1) | (i20 << 15);
                    } else {
                        i3 = i25;
                    }
                    short s2 = (short) i4;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f3);
                    i5 = iFloatToRawIntBits >>> 31;
                    i6 = (iFloatToRawIntBits >>> 23) & 255;
                    i7 = iFloatToRawIntBits & 8388607;
                    if (i6 == 255) {
                        if (i7 != 0) {
                            i10 = 512;
                        } else {
                            i10 = 0;
                        }
                        i8 = 31;
                    } else {
                        i8 = i6 - 112;
                        if (i8 >= 31) {
                            i8 = 49;
                            i10 = 0;
                        } else {
                            if (i8 <= 0) {
                                i9 = i7 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                                } else {
                                    i10 = i9;
                                }
                                short s3 = (short) i11;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                                i13 = iFloatToRawIntBits2 >>> 31;
                                i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i15 = 8388607 & iFloatToRawIntBits2;
                                if (i14 == 255) {
                                    i16 = i14 - 112;
                                    if (i16 < 31) {
                                        if (i16 <= 0) {
                                            i24 = i15 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i17 = (((i16 << 10) | i24) + 1) | (i13 << 15);
                                            } else {
                                                i23 = i16;
                                            }
                                        } else if (i16 >= -10) {
                                            i18 = (i15 | 8388608) >> (1 - i16);
                                            if ((i18 & 4096) != 0) {
                                                i18 += 8192;
                                            }
                                            i23 = 0;
                                            i24 = i18 >> 13;
                                        } else {
                                            i23 = 0;
                                        }
                                    }
                                    long jMax = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s2) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) mrVar.c) & 63);
                                    int i26 = dr.h;
                                    return jMax;
                                }
                                i24 = i15 == 0 ? 0 : 512;
                                i23 = 31;
                                i17 = (i13 << 15) | (i23 << 10) | i24;
                                long jMax2 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s2) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) mrVar.c) & 63);
                                int i27 = dr.h;
                                return jMax2;
                            }
                            if (i8 >= -10) {
                                i12 = (i7 | 8388608) >> (1 - i8);
                                if ((i12 & 4096) != 0) {
                                    i12 += 8192;
                                }
                                i10 = i12 >> 13;
                                i8 = 0;
                            } else {
                                i10 = 0;
                                i8 = 0;
                            }
                        }
                    }
                    i11 = i10 | (i5 << 15) | (i8 << 10);
                    short s4 = (short) i11;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i16 = i14 - 112;
                        if (i16 < 31) {
                            if (i16 <= 0) {
                                i24 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i17 = (((i16 << 10) | i24) + 1) | (i13 << 15);
                                } else {
                                    i23 = i16;
                                }
                            } else if (i16 >= -10) {
                                i18 = (i15 | 8388608) >> (1 - i16);
                                if ((i18 & 4096) != 0) {
                                    i18 += 8192;
                                }
                                i23 = 0;
                                i24 = i18 >> 13;
                            } else {
                                i23 = 0;
                            }
                        }
                        long jMax3 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s2) & 65535) << 48) | ((((long) s4) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) mrVar.c) & 63);
                        int i28 = dr.h;
                        return jMax3;
                    }
                    i24 = i15 == 0 ? 0 : 512;
                    i23 = 31;
                    i17 = (i13 << 15) | (i23 << 10) | i24;
                    long jMax4 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s2) & 65535) << 48) | ((((long) s4) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) mrVar.c) & 63);
                    int i29 = dr.h;
                    return jMax4;
                }
                if (i2 >= -10) {
                    int i30 = (i22 | 8388608) >> (1 - i2);
                    if ((i30 & 4096) != 0) {
                        i30 += 8192;
                    }
                    i3 = i30 >> 13;
                    i2 = 0;
                } else {
                    i3 = 0;
                    i2 = 0;
                }
            }
        }
        i4 = i3 | (i20 << 15) | (i2 << 10);
        short s5 = (short) i4;
        iFloatToRawIntBits = Float.floatToRawIntBits(f3);
        i5 = iFloatToRawIntBits >>> 31;
        i6 = (iFloatToRawIntBits >>> 23) & 255;
        i7 = iFloatToRawIntBits & 8388607;
        if (i6 == 255) {
            if (i7 != 0) {
                i10 = 512;
            } else {
                i10 = 0;
            }
            i8 = 31;
        } else {
            i8 = i6 - 112;
            if (i8 >= 31) {
                i8 = 49;
                i10 = 0;
            } else {
                if (i8 <= 0) {
                    i9 = i7 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i11 = (((i8 << 10) | i9) + 1) | (i5 << 15);
                    } else {
                        i10 = i9;
                    }
                    short s6 = (short) i11;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                    i13 = iFloatToRawIntBits2 >>> 31;
                    i14 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i15 = 8388607 & iFloatToRawIntBits2;
                    if (i14 == 255) {
                        i16 = i14 - 112;
                        if (i16 < 31) {
                            if (i16 <= 0) {
                                i24 = i15 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i17 = (((i16 << 10) | i24) + 1) | (i13 << 15);
                                } else {
                                    i23 = i16;
                                }
                            } else if (i16 >= -10) {
                                i18 = (i15 | 8388608) >> (1 - i16);
                                if ((i18 & 4096) != 0) {
                                    i18 += 8192;
                                }
                                i23 = 0;
                                i24 = i18 >> 13;
                            } else {
                                i23 = 0;
                            }
                        }
                        long jMax5 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s5) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) mrVar.c) & 63);
                        int i210 = dr.h;
                        return jMax5;
                    }
                    i24 = i15 == 0 ? 0 : 512;
                    i23 = 31;
                    i17 = (i13 << 15) | (i23 << 10) | i24;
                    long jMax6 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s5) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) mrVar.c) & 63);
                    int i211 = dr.h;
                    return jMax6;
                }
                if (i8 >= -10) {
                    i12 = (i7 | 8388608) >> (1 - i8);
                    if ((i12 & 4096) != 0) {
                        i12 += 8192;
                    }
                    i10 = i12 >> 13;
                    i8 = 0;
                } else {
                    i10 = 0;
                    i8 = 0;
                }
            }
        }
        i11 = i10 | (i5 << 15) | (i8 << 10);
        short s7 = (short) i11;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
        i13 = iFloatToRawIntBits2 >>> 31;
        i14 = (iFloatToRawIntBits2 >>> 23) & 255;
        i15 = 8388607 & iFloatToRawIntBits2;
        if (i14 == 255) {
            i16 = i14 - 112;
            if (i16 < 31) {
                if (i16 <= 0) {
                    i24 = i15 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i17 = (((i16 << 10) | i24) + 1) | (i13 << 15);
                    } else {
                        i23 = i16;
                    }
                } else if (i16 >= -10) {
                    i18 = (i15 | 8388608) >> (1 - i16);
                    if ((i18 & 4096) != 0) {
                        i18 += 8192;
                    }
                    i23 = 0;
                    i24 = i18 >> 13;
                } else {
                    i23 = 0;
                }
            }
            long jMax7 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s5) & 65535) << 48) | ((((long) s7) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) mrVar.c) & 63);
            int i212 = dr.h;
            return jMax7;
        }
        i24 = i15 == 0 ? 0 : 512;
        i23 = 31;
        i17 = (i13 << 15) | (i23 << 10) | i24;
        long jMax8 = ((((long) ((short) i17)) & 65535) << 16) | ((((long) s5) & 65535) << 48) | ((((long) s7) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f5, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) mrVar.c) & 63);
        int i213 = dr.h;
        return jMax8;
    }

    public static boolean j(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static final Set k(s12 s12Var) {
        s12Var.getClass();
        if (s12Var instanceof ul) {
            return ((ul) s12Var).g();
        }
        HashSet hashSet = new HashSet(s12Var.d());
        int iD = s12Var.d();
        for (int i2 = 0; i2 < iD; i2++) {
            hashSet.add(s12Var.e(i2));
        }
        return hashSet;
    }

    public static final void l(long j2, di1 di1Var) {
        if (di1Var == di1.e) {
            if (sw.g(j2) != Integer.MAX_VALUE) {
                return;
            }
            yp0.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (sw.h(j2) != Integer.MAX_VALUE) {
                return;
            }
            yp0.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final s12[] m(List list) {
        s12[] s12VarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (s12VarArr = (s12[]) list.toArray(new s12[0])) == null) ? K : s12VarArr;
    }

    public static int n(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static int o(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static final long p(long j2, long j3) {
        float f2;
        float f3;
        long jA = dr.a(j2, dr.e(j3));
        float fC = dr.c(j3);
        float fC2 = dr.c(jA);
        float f4 = 1.0f - fC2;
        float f5 = (fC * f4) + fC2;
        float fG = dr.g(jA);
        float fG2 = dr.g(j3);
        float f6 = 0.0f;
        if (f5 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fG2 * fC) * f4) + (fG * fC2)) / f5;
        }
        float f7 = dr.f(jA);
        float f8 = dr.f(j3);
        if (f5 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = (((f8 * fC) * f4) + (f7 * fC2)) / f5;
        }
        float fD = dr.d(jA);
        float fD2 = dr.d(j3);
        if (f5 != 0.0f) {
            f6 = (((fD2 * fC) * f4) + (fD * fC2)) / f5;
        }
        return i(f2, f3, f6, f5, dr.e(j3));
    }

    public static final d00 q(String str) {
        Pattern patternCompile = Pattern.compile("[^dMy/\\-.]");
        patternCompile.getClass();
        str.getClass();
        String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        strReplaceAll.getClass();
        Pattern patternCompile2 = Pattern.compile("d{1,2}");
        patternCompile2.getClass();
        String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("dd");
        strReplaceAll2.getClass();
        Pattern patternCompile3 = Pattern.compile("M{1,2}");
        patternCompile3.getClass();
        String strReplaceAll3 = patternCompile3.matcher(strReplaceAll2).replaceAll("MM");
        strReplaceAll3.getClass();
        Pattern patternCompile4 = Pattern.compile("y{1,4}");
        patternCompile4.getClass();
        String strReplaceAll4 = patternCompile4.matcher(strReplaceAll3).replaceAll("yyyy");
        strReplaceAll4.getClass();
        String strY = o92.y(strReplaceAll4, "My", "M/y");
        if (h92.E(strY, ".")) {
            strY = strY.substring(0, strY.length() - 1);
        }
        Pattern patternCompile5 = Pattern.compile("[/\\-.]");
        patternCompile5.getClass();
        Matcher matcher = patternCompile5.matcher(strY);
        matcher.getClass();
        ud udVarT = rw.t(matcher, 0, strY);
        udVarT.getClass();
        j61 j61VarB = ((k61) udVarT.d).b(0);
        j61VarB.getClass();
        return new d00(strY, j61VarB.a.charAt(0));
    }

    public static final boolean r(p02 p02Var) {
        return !p02Var.k().e.c(u02.j);
    }

    public static final Object s(gz1 gz1Var, long j2, ij0 ij0Var) {
        Unsafe unsafe;
        long j3;
        while (true) {
            gz1 gz1Var2 = gz1Var;
            while (true) {
                if (gz1Var2.d >= j2 && !gz1Var2.c()) {
                    return gz1Var2;
                }
                Object objectVolatile = we.a.getObjectVolatile(gz1Var2, dw.a);
                pa0 pa0Var = o;
                if (objectVolatile == pa0Var) {
                    return pa0Var;
                }
                gz1Var = (gz1) ((dw) objectVolatile);
                if (gz1Var != null) {
                    break;
                }
                gz1 gz1Var3 = (gz1) ij0Var.g(Long.valueOf(gz1Var2.d + 1), gz1Var2);
                do {
                    unsafe = we.a;
                    j3 = dw.a;
                    if (unsafe.compareAndSwapObject(gz1Var2, j3, (Object) null, gz1Var3)) {
                        if (gz1Var2.c()) {
                            gz1Var2.d();
                        }
                        gz1Var2 = gz1Var3;
                        break;
                    }
                } while (unsafe.getObjectVolatile(gz1Var2, j3) == null);
            }
        }
    }

    public static final u71 t(u71 u71Var, xf0 xf0Var) {
        return u71Var.c(new yf0(xf0Var));
    }

    public static final void u(StringBuilder sb, StringBuilder sb2, int i2) {
        if (i2 < 10) {
            sb.append('0');
        }
        sb2.append(i2);
    }

    public static final pe0 v(k42 k42Var, uy uyVar, int i2, vk vkVar) {
        return ((i2 == 0 || i2 == -3) && vkVar == vk.e) ? k42Var : new po(k42Var, uyVar, i2, vkVar);
    }

    public static ColorStateList w(Context context, int i2) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        ot1 ot1Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        pt1 pt1Var = new pt1(resources, theme);
        synchronized (qt1.c) {
            try {
                SparseArray sparseArray = (SparseArray) qt1.b.get(pt1Var);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (ot1Var = (ot1) sparseArray.get(i2)) == null) {
                    colorStateList = null;
                } else {
                    if (ot1Var.b.equals(resources.getConfiguration())) {
                        if (theme != null || ot1Var.c != 0) {
                            if (theme == null || ot1Var.c != theme.hashCode()) {
                            }
                        }
                        colorStateList = ot1Var.a;
                    }
                    sparseArray.remove(i2);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = qt1.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateListA = rr.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i2, theme);
        }
        synchronized (qt1.c) {
            try {
                WeakHashMap weakHashMap = qt1.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(pt1Var);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(pt1Var, sparseArray2);
                }
                sparseArray2.append(i2, new ot1(colorStateListA, pt1Var.a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListA;
    }

    public static final int x(ak0 ak0Var) {
        ak0Var.getClass();
        return Long.hashCode(ak0Var.T);
    }

    public static Drawable y(Context context, int i2) {
        return nt1.c().d(context, i2);
    }

    public static final boolean z(vf2 vf2Var) {
        ym1 ym1Var;
        ln1 ln1Var = vf2Var.c;
        ra0 ra0Var = (ln1Var == null || (ym1Var = ln1Var.b) == null) ? null : new ra0(ym1Var.b);
        boolean z2 = false;
        if (ra0Var != null && ra0Var.a == 1) {
            z2 = true;
        }
        return !z2;
    }
}
