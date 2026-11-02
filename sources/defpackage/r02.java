package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.Window;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r02 {
    public static final /* synthetic */ int a = 0;
    public static long b;
    public static Method c;

    /* JADX WARN: Code duplicated, block: B:35:0x0061 A[LOOP:0: B:4:0x000b->B:35:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0064 A[EDGE_INSN: B:43:0x0064->B:36:0x0064 BREAK  A[LOOP:0: B:4:0x000b->B:35:0x0061], SYNTHETIC] */
    public static final p02 a(ax0 ax0Var, boolean z) {
        t71 t71Var = ax0Var.I.f;
        Object obj = null;
        if ((t71Var.h & 8) != 0) {
            loop0: while (t71Var != null) {
                if ((t71Var.g & 8) == 0) {
                    if ((t71Var.h & 8) != 0) {
                        break;
                        break;
                    }
                    t71Var = t71Var.j;
                } else {
                    t71 t71VarP = t71Var;
                    fa1 fa1Var = null;
                    while (t71VarP != null) {
                        if (t71VarP instanceof m02) {
                            obj = t71VarP;
                            break loop0;
                        }
                        if ((t71VarP.g & 8) != 0 && (t71VarP instanceof c40)) {
                            int i = 0;
                            for (t71 t71Var2 = ((c40) t71VarP).t; t71Var2 != null; t71Var2 = t71Var2.j) {
                                if ((t71Var2.g & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        t71VarP = t71Var2;
                                    } else {
                                        if (fa1Var == null) {
                                            fa1Var = new fa1(new t71[16]);
                                        }
                                        if (t71VarP != null) {
                                            fa1Var.b(t71VarP);
                                            t71VarP = null;
                                        }
                                        fa1Var.b(t71Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        t71VarP = qx.P(fa1Var);
                    }
                    if ((t71Var.h & 8) != 0) {
                        break;
                    }
                    t71Var = t71Var.j;
                }
            }
        }
        obj.getClass();
        t71 t71Var3 = ((t71) ((m02) obj)).e;
        i02 i02VarW = ax0Var.w();
        if (i02VarW == null) {
            i02VarW = new i02();
        }
        return new p02(t71Var3, z, ax0Var, i02VarW);
    }

    public static final void b(ak0 ak0Var, u71 u71Var) {
        n6 n6Var = n6.h;
        int iHashCode = Long.hashCode(ak0Var.T);
        u71 u71VarB = nj2.B(ak0Var, u71Var);
        sl1 sl1VarL = ak0Var.l();
        wu.c.getClass();
        wv wvVar = vu.b;
        ak0Var.Z();
        if (ak0Var.S) {
            ak0Var.k(wvVar);
        } else {
            ak0Var.j0();
        }
        p12.l(vu.f, ak0Var, n6Var);
        p12.l(vu.e, ak0Var, sl1VarL);
        p12.k(ak0Var, vu.h);
        p12.l(vu.d, ak0Var, u71VarB);
        p12.f(ak0Var, Integer.valueOf(iHashCode), vu.g);
        ak0Var.p(true);
    }

    public static final void c(qk1 qk1Var, wn1 wn1Var, long j) {
        w30 w30Var = (w30) qk1Var.f;
        um2 um2Var = w30Var.b;
        um2 um2Var2 = w30Var.a;
        boolean zO = sv.o(wn1Var);
        long j2 = wn1Var.b;
        if (zO) {
            b00[] b00VarArr = um2Var2.d;
            ve.B0(0, b00VarArr.length, null, b00VarArr);
            um2Var2.e = 0;
            b00[] b00VarArr2 = um2Var.d;
            ve.B0(0, b00VarArr2.length, null, b00VarArr2);
            um2Var.e = 0;
            w30Var.c = 0L;
        }
        if (!sv.q(wn1Var)) {
            List list = wn1Var.m;
            if (list == null) {
                list = cb0.e;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                km0 km0Var = (km0) list.get(i);
                w30Var.a(km0Var.a, uf1.e(km0Var.e, j));
            }
            w30Var.a(j2, uf1.e(wn1Var.n, j));
        }
        if (sv.q(wn1Var) && j2 - w30Var.c > 40) {
            b00[] b00VarArr3 = um2Var2.d;
            ve.B0(0, b00VarArr3.length, null, b00VarArr3);
            um2Var2.e = 0;
            b00[] b00VarArr4 = um2Var.d;
            ve.B0(0, b00VarArr4.length, null, b00VarArr4);
            um2Var.e = 0;
            w30Var.c = 0L;
        }
        w30Var.c = j2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(xx1 xx1Var, float f, ob obVar, l20 l20Var, ej0 ej0Var, tx txVar) {
        l62 l62Var;
        float f2;
        ds1 ds1Var;
        if (txVar instanceof l62) {
            l62Var = (l62) txVar;
            int i = l62Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                l62Var.l = i - Integer.MIN_VALUE;
            } else {
                l62Var = new l62(txVar);
            }
        } else {
            l62Var = new l62(txVar);
        }
        Object obj = l62Var.k;
        int i2 = l62Var.l;
        if (i2 == 0) {
            ix.Q(obj);
            ds1 ds1Var2 = new ds1();
            boolean z = ((Number) obVar.a()).floatValue() == 0.0f;
            k62 k62Var = new k62(f, ds1Var2, xx1Var, ej0Var, 0);
            l62Var.i = obVar;
            l62Var.j = ds1Var2;
            l62Var.h = f;
            l62Var.l = 1;
            Object objC = c12.c(obVar, l20Var, !z, k62Var, l62Var);
            fz fzVar = fz.e;
            if (objC == fzVar) {
                return fzVar;
            }
            f2 = f;
            ds1Var = ds1Var2;
        } else {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f2 = l62Var.h;
            ds1Var = l62Var.j;
            obVar = l62Var.i;
            ix.Q(obj);
        }
        return new kb(new Float(f2 - ds1Var.e), obVar);
    }

    public static final void e(mb mbVar, xx1 xx1Var, ej0 ej0Var, float f) {
        float fA;
        try {
            fA = xx1Var.a(f);
        } catch (CancellationException unused) {
            mbVar.a();
            fA = 0.0f;
        }
        ej0Var.h(Float.valueOf(fA));
        if (Math.abs(f - fA) > 0.5f) {
            mbVar.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object f(xx1 xx1Var, float f, float f2, ob obVar, g82 g82Var, ej0 ej0Var, tx txVar) {
        m62 m62Var;
        float fFloatValue;
        ob obVar2;
        ds1 ds1Var;
        float f3 = f;
        if (txVar instanceof m62) {
            m62Var = (m62) txVar;
            int i = m62Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                m62Var.m = i - Integer.MIN_VALUE;
            } else {
                m62Var = new m62(txVar);
            }
        } else {
            m62Var = new m62(txVar);
        }
        m62 m62Var2 = m62Var;
        Object obj = m62Var2.l;
        int i2 = m62Var2.m;
        if (i2 == 0) {
            ix.Q(obj);
            ds1 ds1Var2 = new ds1();
            fFloatValue = ((Number) obVar.a()).floatValue();
            Float f4 = new Float(f3);
            boolean z = ((Number) obVar.a()).floatValue() == 0.0f;
            k62 k62Var = new k62(f2, ds1Var2, xx1Var, ej0Var, 1);
            m62Var2.j = obVar;
            m62Var2.k = ds1Var2;
            m62Var2.h = f3;
            m62Var2.i = fFloatValue;
            m62Var2.m = 1;
            Object objD = c12.d(obVar, f4, g82Var, !z, k62Var, m62Var2);
            fz fzVar = fz.e;
            if (objD == fzVar) {
                return fzVar;
            }
            obVar2 = obVar;
            ds1Var = ds1Var2;
        } else {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            float f5 = m62Var2.i;
            float f6 = m62Var2.h;
            ds1Var = m62Var2.k;
            obVar2 = m62Var2.j;
            ix.Q(obj);
            fFloatValue = f5;
            f3 = f6;
        }
        return new kb(new Float(f3 - ds1Var.e), j20.k(obVar2, 0.0f, h(((Number) obVar2.a()).floatValue(), fFloatValue), 29));
    }

    public static void g(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static final float h(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 <= 0.0f ? f >= f2 : f <= f2) ? f : f2;
    }

    public static final float i(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final long j(double d) {
        return o((float) d, 4294967296L);
    }

    public static final long k(int i) {
        return o(i, 4294967296L);
    }

    public static final String l(int i, ak0 ak0Var) {
        ak0Var.j(u5.a);
        return ((Context) ak0Var.j(u5.b)).getResources().getString(i);
    }

    public static boolean m() {
        if (Build.VERSION.SDK_INT >= 29) {
            return th2.a();
        }
        try {
            Method method = c;
            if (method == null) {
                b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                method = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                c = method;
            }
            return ((Boolean) method.invoke(null, Long.valueOf(b))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static void n(te2 te2Var, gd2 gd2Var, hf2 hf2Var, jw0 jw0Var, cf2 cf2Var, boolean z, xf1 xf1Var) {
        yr1 yr1VarB;
        if (z) {
            int iR = xf1Var.r(of2.e(te2Var.b));
            String str = ld2.a;
            if (iR < hf2Var.a.a.f.length()) {
                yr1VarB = hf2Var.b(iR);
            } else {
                yr1VarB = iR != 0 ? hf2Var.b(iR - 1) : new yr1(0.0f, 0.0f, 1.0f, (int) (ld2.a(gd2Var.b, gd2Var.g, gd2Var.h, ld2.a, 1) & 4294967295L));
            }
            float f = yr1VarB.b;
            float f2 = yr1VarB.a;
            long jR = jw0Var.R((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            yr1 yr1VarE = sv.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jR & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jR >> 32)))) << 32), (((long) Float.floatToRawIntBits(yr1VarB.c - f2)) << 32) | (((long) Float.floatToRawIntBits(yr1VarB.d - f)) & 4294967295L));
            if (ws0.j((cf2) cf2Var.a.b.get(), cf2Var)) {
                cf2Var.b.g(yr1VarE);
            }
        }
    }

    public static final long o(float f, long j) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        zf2[] zf2VarArr = yf2.b;
        return jFloatToRawIntBits;
    }

    public static final void p(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            vp0.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float fI = i(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * fI);
                }
            }
            float fSqrt = (float) Math.sqrt(i(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : i(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fI2 = i(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fI2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fI2 / fArr11[i14];
        }
    }

    public static void q(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            g1.e(window, z);
        } else {
            if (i >= 30) {
                g1.d(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final qk2 r(String str) {
        int i;
        j20.j(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (ws0.n(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int i3 = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            int i4 = i2 ^ Integer.MIN_VALUE;
            if (Integer.compare(i4, i3 ^ Integer.MIN_VALUE) > 0) {
                if (i3 != 119304647 || Integer.compare(i4, -1717986919) > 0) {
                    return null;
                }
                i3 = 429496729;
            }
            int i5 = i2 * 10;
            int i6 = iDigit + i5;
            if (Integer.compare(i6 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i++;
            i2 = i6;
        }
        return new qk2(i2);
    }

    public static final vk2 s(String str) {
        str.getClass();
        int i = 10;
        j20.j(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (ws0.n(cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j = 0;
        long j2 = 512409557603043100L;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), i);
            if (iDigit < 0) {
                return null;
            }
            long j3 = j ^ Long.MIN_VALUE;
            int i3 = length;
            if (Long.compare(j3, j2 ^ Long.MIN_VALUE) > 0) {
                if (j2 != 512409557603043100L || Long.compare(j3, -7378697629483820647L) > 0) {
                    return null;
                }
                j2 = 1844674407370955161L;
            }
            long j4 = j * 10;
            long j5 = (((long) iDigit) & 4294967295L) + j4;
            if (Long.compare(j5 ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            j = j5;
            length = i3;
            i = 10;
        }
        return new vk2(j);
    }
}
