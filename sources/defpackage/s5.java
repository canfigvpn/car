package defpackage;

import android.content.res.Configuration;
import android.graphics.BlendMode;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s5 {
    public static final kr A;
    public static final float B;
    public static final kr C;
    public static final kr D;
    public static final kr E;
    public static final float F;
    public static final kr G;
    public static final kr H;
    public static final qj I;
    public static final pa0 J;
    public static final pa0 K;
    public static final StackTraceElement[] L;
    public static final byte[] M;
    public static final byte[] N;
    public static final byte[] O;
    public static final byte[] P;
    public static final byte[] Q;
    public static final byte[] R;
    public static final byte[] S;
    public static final Object T;
    public static final iq1 U;
    public static final gt g;
    public static final kr m;
    public static final float n;
    public static final float o;
    public static final kr p;
    public static final float q;
    public static final kr r;
    public static final float s;
    public static final kr t;
    public static final float u;
    public static final kr v;
    public static final float w;
    public static final hk2 x;
    public static final kr y;
    public static final kr z;
    public static final ti a = new ti(-1.0f);
    public static final ti b = new ti(1.0f);
    public static final si c = new si(-1.0f);
    public static final si d = new si(1.0f);
    public static final y32 e = y32.g;
    public static final float f = 8.0f;
    public static final gt h = new gt(new ut(19), false, -696292310);
    public static final gt i = new gt(new vt(0), false, 1729671878);
    public static final ln1 j = new ln1(null, new ym1());
    public static final c60 k = new c60();
    public static final y32 l = y32.j;

    static {
        int i2 = 18;
        g = new gt(new ut(i2), false, 1007624359);
        kr krVar = kr.l;
        m = krVar;
        n = 0.38f;
        o = 8.0f;
        p = krVar;
        q = 0.12f;
        r = krVar;
        s = 0.12f;
        t = kr.s;
        u = 1.0f;
        v = kr.o;
        w = 1.0f;
        x = hk2.j;
        kr krVar2 = kr.k;
        y = krVar2;
        kr krVar3 = kr.m;
        z = krVar3;
        A = krVar;
        B = 0.38f;
        C = krVar2;
        D = kr.p;
        E = krVar;
        F = 0.38f;
        G = krVar2;
        H = krVar3;
        I = new qj(i2);
        int i3 = 1;
        J = new pa0("NULL", i3);
        K = new pa0("UNINITIALIZED", i3);
        L = new StackTraceElement[0];
        M = new byte[]{48, 49, 53, 0};
        N = new byte[]{48, 49, 48, 0};
        O = new byte[]{48, 48, 57, 0};
        P = new byte[]{48, 48, 53, 0};
        Q = new byte[]{48, 48, 49, 0};
        R = new byte[]{48, 48, 49, 0};
        S = new byte[]{48, 48, 50, 0};
        T = new Object();
        U = new iq1(17);
    }

    public static final void A(Closeable closeable, Throwable th) throws IllegalAccessException, IOException, InvocationTargetException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                vv.e(th, th2);
            }
        }
    }

    public static final Object B(v72 v72Var, int i2) {
        Object obj;
        v72Var.getClass();
        int iM = sv0.M(v72Var.h, i2, v72Var.f);
        if (iM < 0 || (obj = v72Var.g[iM]) == T) {
            return null;
        }
        return obj;
    }

    public static ks C(ej0... ej0VarArr) {
        if (ej0VarArr.length > 0) {
            return new ks(0, ej0VarArr);
        }
        qj.r("Failed requirement.");
        return null;
    }

    public static int D(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final ez E(ak0 ak0Var) {
        return new vs1(ak0Var.R);
    }

    public static final float F(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    public static final void G(v72 v72Var) {
        int i2 = v72Var.h;
        int[] iArr = v72Var.f;
        Object[] objArr = v72Var.g;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != T) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        v72Var.e = false;
        v72Var.h = i3;
    }

    public static final oq H(un2 un2Var) {
        oq oqVar;
        un2Var.getClass();
        synchronized (U) {
            oqVar = (oq) un2Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (oqVar == null) {
                uy uyVar = ab0.e;
                try {
                    j30 j30Var = u50.a;
                    uyVar = o51.a.j;
                } catch (IllegalStateException | we1 unused) {
                }
                oq oqVar2 = new oq(uyVar.k(new ga2(null)));
                un2Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", oqVar2);
                oqVar = oqVar2;
            }
        }
        return oqVar;
    }

    public static final u71 I(ej0 ej0Var) {
        return new uv0(ej0Var, null);
    }

    public static final u71 J(u71 u71Var, ej0 ej0Var) {
        return u71Var.c(new uv0(null, ej0Var));
    }

    public static final void K(float[] fArr, float[] fArr2) {
        float F2 = F(fArr2, 0, fArr, 0);
        float F3 = F(fArr2, 0, fArr, 1);
        float F4 = F(fArr2, 0, fArr, 2);
        float F5 = F(fArr2, 0, fArr, 3);
        float F6 = F(fArr2, 1, fArr, 0);
        float F7 = F(fArr2, 1, fArr, 1);
        float F8 = F(fArr2, 1, fArr, 2);
        float F9 = F(fArr2, 1, fArr, 3);
        float F10 = F(fArr2, 2, fArr, 0);
        float F11 = F(fArr2, 2, fArr, 1);
        float F12 = F(fArr2, 2, fArr, 2);
        float F13 = F(fArr2, 2, fArr, 3);
        float F14 = F(fArr2, 3, fArr, 0);
        float F15 = F(fArr2, 3, fArr, 1);
        float F16 = F(fArr2, 3, fArr, 2);
        float F17 = F(fArr2, 3, fArr, 3);
        fArr[0] = F2;
        fArr[1] = F3;
        fArr[2] = F4;
        fArr[3] = F5;
        fArr[4] = F6;
        fArr[5] = F7;
        fArr[6] = F8;
        fArr[7] = F9;
        fArr[8] = F10;
        fArr[9] = F11;
        fArr[10] = F12;
        fArr[11] = F13;
        fArr[12] = F14;
        fArr[13] = F15;
        fArr[14] = F16;
        fArr[15] = F17;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a1 A[PHI: r0
  0x00a1: PHI (r0v11 int) = (r0v5 int), (r0v6 int), (r0v7 int), (r0v8 int) binds: [B:54:0x009f, B:57:0x00a4, B:60:0x00a8, B:63:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Object N(cg0 cg0Var, int i2, ej0 ej0Var) {
        int i3;
        int i4;
        Object objH;
        t71 t71VarP;
        az0 az0VarJ0;
        he1 he1Var;
        if (!cg0Var.e.r) {
            vp0.b("visitAncestors called on an unattached node");
        }
        t71 t71Var = cg0Var.e.i;
        ax0 ax0VarV = qx.V(cg0Var);
        loop0: while (true) {
            i3 = 0;
            i4 = 1;
            objH = null;
            if (ax0VarV == null) {
                t71VarP = null;
                break;
            }
            if ((ax0VarV.I.f.h & 1024) != 0) {
                while (t71Var != null) {
                    if ((t71Var.g & 1024) != 0) {
                        t71VarP = t71Var;
                        fa1 fa1Var = null;
                        while (t71VarP != null) {
                            if (t71VarP instanceof cg0) {
                                break loop0;
                            }
                            if ((t71VarP.g & 1024) != 0 && (t71VarP instanceof c40)) {
                                int i5 = 0;
                                for (t71 t71Var2 = ((c40) t71VarP).t; t71Var2 != null; t71Var2 = t71Var2.j) {
                                    if ((t71Var2.g & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
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
                                if (i5 == 1) {
                                }
                            }
                            t71VarP = qx.P(fa1Var);
                        }
                    }
                    t71Var = t71Var.i;
                }
            }
            ax0VarV = ax0VarV.u();
            t71Var = (ax0VarV == null || (he1Var = ax0VarV.I) == null) ? null : he1Var.e;
        }
        cg0 cg0Var2 = (cg0) t71VarP;
        if ((cg0Var2 == null || !ws0.j(cg0Var2.J0(), cg0Var.J0())) && (az0VarJ0 = cg0Var.J0()) != null) {
            int i6 = 5;
            if (i2 == 5) {
                i4 = i6;
            } else {
                i6 = 6;
                if (i2 == 6) {
                    i4 = i6;
                } else {
                    i6 = 3;
                    if (i2 == 3) {
                        i4 = i6;
                    } else {
                        i6 = 4;
                        if (i2 == 4) {
                            i4 = i6;
                        } else if (i2 == 1) {
                            i4 = 2;
                        } else if (i2 != 2) {
                            fu1.h("Unsupported direction for beyond bounds layout");
                        }
                    }
                }
            }
            if (az0VarJ0.s.a() <= 0 || !az0VarJ0.s.c() || !az0VarJ0.r) {
                return ej0Var.h(az0.v);
            }
            boolean zG0 = az0VarJ0.G0(i4);
            bz0 bz0Var = az0VarJ0.s;
            int iB = zG0 ? bz0Var.b() : bz0Var.e();
            gs1 gs1Var = new gs1();
            ck ckVar = az0VarJ0.t;
            ckVar.getClass();
            wy0 wy0Var = new wy0(iB, iB);
            ckVar.a.b(wy0Var);
            gs1Var.e = wy0Var;
            int iD = az0VarJ0.s.d() * 2;
            int iA = az0VarJ0.s.a();
            if (iD > iA) {
                iD = iA;
            }
            while (objH == null && az0VarJ0.F0((wy0) gs1Var.e, i4) && i3 < iD) {
                wy0 wy0Var2 = (wy0) gs1Var.e;
                int i7 = wy0Var2.a;
                int i8 = wy0Var2.b;
                if (az0VarJ0.G0(i4)) {
                    i8++;
                } else {
                    i7--;
                }
                ck ckVar2 = az0VarJ0.t;
                ckVar2.getClass();
                wy0 wy0Var3 = new wy0(i7, i8);
                ckVar2.a.b(wy0Var3);
                az0VarJ0.t.a.j((wy0) gs1Var.e);
                gs1Var.e = wy0Var3;
                i3++;
                qx.V(az0VarJ0).k();
                objH = ej0Var.h(new zy0(az0VarJ0, gs1Var, i4));
            }
            az0VarJ0.t.a.j((wy0) gs1Var.e);
            qx.V(az0VarJ0).k();
            return objH;
        }
        return null;
    }

    public static final u71 O(u71 u71Var, boolean z2, f91 f91Var, vu1 vu1Var, boolean z3, wu1 wu1Var, ti0 ti0Var) {
        u71 u71VarC;
        if (vu1Var != null) {
            u71VarC = new pz1(z2, f91Var, vu1Var, false, z3, wu1Var, ti0Var);
        } else if (vu1Var == null) {
            u71VarC = new pz1(z2, f91Var, null, false, z3, wu1Var, ti0Var);
        } else {
            r71 r71Var = r71.a;
            u71VarC = f91Var != null ? yo0.a(r71Var, f91Var, vu1Var).c(new pz1(z2, f91Var, null, false, z3, wu1Var, ti0Var)) : nj2.n(r71Var, new qz1(vu1Var, z2, z3, wu1Var, ti0Var));
        }
        return u71Var.c(u71VarC);
    }

    public static u71 P(u71 u71Var, boolean z2, wu1 wu1Var, ti0 ti0Var) {
        return u71Var.c(new pz1(z2, null, null, true, true, wu1Var, ti0Var));
    }

    public static final void Q(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static final void R(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    public static final u71 S(ee2 ee2Var) {
        return new pc2(ee2Var);
    }

    public static g82 T(float f2, float f3, Object obj, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new g82(f2, f3, obj);
    }

    public static final BlendMode U(int i2) {
        if (i2 == 0) {
            return BlendMode.CLEAR;
        }
        if (i2 == 1) {
            return BlendMode.SRC;
        }
        if (i2 == 2) {
            return BlendMode.DST;
        }
        if (i2 == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i2 == 4) {
            return BlendMode.DST_OVER;
        }
        if (i2 == 5) {
            return BlendMode.SRC_IN;
        }
        if (i2 == 6) {
            return BlendMode.DST_IN;
        }
        if (i2 == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i2 == 8) {
            return BlendMode.DST_OUT;
        }
        if (i2 == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i2 == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i2 == 11) {
            return BlendMode.XOR;
        }
        if (i2 == 12) {
            return BlendMode.PLUS;
        }
        if (i2 == 13) {
            return BlendMode.MODULATE;
        }
        if (i2 == 14) {
            return BlendMode.SCREEN;
        }
        if (i2 == 15) {
            return BlendMode.OVERLAY;
        }
        if (i2 == 16) {
            return BlendMode.DARKEN;
        }
        if (i2 == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i2 == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i2 == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i2 == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i2 == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i2 == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i2 == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i2 == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i2 == 25) {
            return BlendMode.HUE;
        }
        if (i2 == 26) {
            return BlendMode.SATURATION;
        }
        if (i2 == 27) {
            return BlendMode.COLOR;
        }
        return i2 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode V(int i2) {
        if (i2 == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i2 == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i2 == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i2 == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i2 == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i2 == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i2 == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i2 == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i2 == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i2 == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i2 == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i2 == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return i2 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static lj2 W(int i2, int i3, c90 c90Var) {
        if ((i3 & 1) != 0) {
            i2 = 300;
        }
        int i4 = (i3 & 2) != 0 ? 0 : 90;
        if ((i3 & 4) != 0) {
            c90Var = d90.a;
        }
        return new lj2(i2, i4, c90Var);
    }

    public static final void a(int i2, int i3, ti0 ti0Var, ej0 ej0Var, ak0 ak0Var) {
        ej0Var.getClass();
        ti0Var.getClass();
        ak0Var.X(-567865748);
        int i4 = (ak0Var.d(i2) ? 4 : 2) | i3 | (ak0Var.h(ej0Var) ? 32 : 16);
        if (!ak0Var.O(i4 & 1, (i4 & 147) != 146)) {
            ak0Var.R();
        } else if (dv1.z(ak0Var)) {
            ak0Var.W(587825606);
            k(i2, i4 & 1022, ti0Var, ej0Var, ak0Var);
            ak0Var.p(false);
        } else {
            ak0Var.W(587942755);
            h(i2, i4 & 1022, ti0Var, ej0Var, ak0Var);
            ak0Var.p(false);
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new od(i2, ej0Var, ti0Var, i3, 0);
        }
    }

    public static final void b(boolean z2, ti0 ti0Var, ak0 ak0Var, int i2) {
        int i3;
        ak0Var.X(-361453782);
        int i4 = 4;
        if ((i2 & 6) == 0) {
            i3 = (ak0Var.g(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ak0Var.h(ti0Var) ? 32 : 16;
        }
        int i5 = 0;
        if (ak0Var.O(i3 & 1, (i3 & 19) != 18)) {
            Object objA = k31.a(ak0Var);
            if (objA == null) {
                ak0Var.W(535274673);
                objA = l31.a(ak0Var);
            } else {
                ak0Var.W(535271790);
            }
            ak0Var.p(false);
            if (objA == null) {
                fu1.h("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zF = ak0Var.f(objA);
            Object objL = ak0Var.L();
            Object obj = cv.a;
            if (zF || objL == obj) {
                id1 id1Var = objA instanceof id1 ? (id1) objA : null;
                e4 e4VarA = id1Var != null ? id1Var.a() : null;
                jg1 jg1Var = objA instanceof jg1 ? (jg1) objA : null;
                objL = new bg(e4VarA, jg1Var != null ? jg1Var.b() : null);
                ak0Var.g0(objL);
            }
            Object obj2 = (bg) objL;
            long j2 = ak0Var.T;
            boolean zF2 = ak0Var.f(obj2) | ak0Var.e(j2);
            Object objL2 = ak0Var.L();
            Object obj3 = objL2;
            if (zF2 || objL2 == obj) {
                cu cuVar = new cu(new cg(j2, objA));
                cuVar.c = new m2(11);
                ak0Var.g0(cuVar);
                obj3 = cuVar;
            }
            Object obj4 = (cu) obj3;
            ak0Var.W(-585307852);
            boolean zH = ((i3 & 112) == 32) | ak0Var.h(obj4);
            Object objL3 = ak0Var.L();
            if (zH || objL3 == obj) {
                objL3 = new n1(6, obj4, ti0Var);
                ak0Var.g0(objL3);
            }
            v((ti0) objL3, ak0Var);
            int i6 = i3;
            Boolean boolValueOf = Boolean.valueOf(z2);
            int i7 = i6 & 14;
            boolean zH2 = ak0Var.h(obj4) | (i7 == 4);
            Object objL4 = ak0Var.L();
            if (zH2 || objL4 == obj) {
                objL4 = new dg(obj4, z2, i5);
                ak0Var.g0(objL4);
            }
            mx.h(boolValueOf, obj4, null, (ej0) objL4, ak0Var, i7);
            boolean zH3 = ak0Var.h(obj2) | ak0Var.h(obj4);
            Object objL5 = ak0Var.L();
            if (zH3 || objL5 == obj) {
                objL5 = new d(i4, obj2, obj4);
                ak0Var.g0(objL5);
            }
            f(obj2, obj4, (ej0) objL5, ak0Var);
            ak0Var.p(false);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new eg(z2, ti0Var, i2, i5);
        }
    }

    public static final void c(ti0 ti0Var, mn mnVar, ak0 ak0Var, int i2) {
        mn mnVar2;
        int i3;
        mn mnVar3;
        ti0Var.getClass();
        ak0Var.X(1529393450);
        int i4 = i2 | (ak0Var.h(ti0Var) ? 4 : 2) | 16;
        int i5 = 0;
        if (ak0Var.O(i4 & 1, (i4 & 19) != 18)) {
            ak0Var.T();
            if ((i2 & 1) == 0 || ak0Var.y()) {
                co2 co2VarA = o31.a(ak0Var);
                if (co2VarA == null) {
                    fu1.h("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    mn mnVar4 = (mn) p12.r(js1.a(mn.class), co2VarA, sv.y(co2VarA, ak0Var), co2VarA instanceof zl0 ? ((zl0) co2VarA).f() : jz.b, ak0Var);
                    i3 = i4 & (-113);
                    mnVar3 = mnVar4;
                }
            } else {
                ak0Var.R();
                i3 = i4 & (-113);
                mnVar3 = mnVar;
            }
            ak0Var.q();
            da1 da1VarR = qx.r(mnVar3.f, ak0Var);
            Boolean boolValueOf = Boolean.valueOf(((kn) da1VarR.getValue()).k);
            boolean zF = ak0Var.f(da1VarR) | ((i3 & 14) == 4);
            Object objL = ak0Var.L();
            if (zF || objL == cv.a) {
                objL = new jn(ti0Var, da1VarR, null, i5);
                ak0Var.g0(objL);
            }
            o((ij0) objL, ak0Var, boolValueOf);
            ix.f(null, vs0.C(-1161467674, new jd(3, da1VarR, ti0Var), ak0Var), null, null, null, 0, 0L, 0L, null, vs0.C(136614523, new in(i5, mnVar3, da1VarR), ak0Var), ak0Var, 805306416, 509);
            mnVar2 = mnVar3;
        } else {
            ak0Var.R();
            mnVar2 = mnVar;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new jd(ti0Var, mnVar2, i2, 4);
        }
    }

    public static zk d(int i2, int i3, vk vkVar) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        int i4 = i3 & 2;
        vk vkVar2 = vk.e;
        if (i4 != 0) {
            vkVar = vkVar2;
        }
        if (i2 == -2) {
            if (vkVar != vkVar2) {
                return new ew(1, vkVar);
            }
            lo.b.getClass();
            return new zk(ko.b);
        }
        if (i2 == -1) {
            if (vkVar == vkVar2) {
                return new ew(1, vk.f);
            }
            qj.r("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i2 == 0) {
            return vkVar == vkVar2 ? new zk(0) : new ew(1, vkVar);
        }
        if (i2 != Integer.MAX_VALUE) {
            return vkVar == vkVar2 ? new zk(i2) : new ew(i2, vkVar);
        }
        return new zk(Integer.MAX_VALUE);
    }

    public static final void e(Object obj, ej0 ej0Var, ak0 ak0Var) {
        boolean zF = ak0Var.f(obj);
        Object objL = ak0Var.L();
        if (zF || objL == cv.a) {
            objL = new a60(ej0Var);
            ak0Var.g0(objL);
        }
    }

    public static final void f(Object obj, Object obj2, ej0 ej0Var, ak0 ak0Var) {
        boolean zF = ak0Var.f(obj) | ak0Var.f(obj2);
        Object objL = ak0Var.L();
        if (zF || objL == cv.a) {
            objL = new a60(ej0Var);
            ak0Var.g0(objL);
        }
    }

    public static final void g(ni0 ni0Var, ej0 ej0Var, ak0 ak0Var, int i2) {
        ak0 ak0Var2;
        ak0Var.X(2130057966);
        int i3 = 2;
        int i4 = (ak0Var.d(ni0Var.ordinal()) ? 4 : 2) | i2 | (ak0Var.h(ej0Var) ? 32 : 16);
        int i5 = 0;
        if (ak0Var.O(i4 & 1, (i4 & 19) != 18)) {
            Object objL = ak0Var.L();
            is1 is1Var = cv.a;
            if (objL == is1Var) {
                objL = y12.s(Boolean.FALSE);
                ak0Var.g0(objL);
            }
            da1 da1Var = (da1) objL;
            boolean zBooleanValue = ((Boolean) da1Var.getValue()).booleanValue();
            Object objL2 = ak0Var.L();
            if (objL2 == is1Var) {
                objL2 = new s9(da1Var, 3);
                ak0Var.g0(objL2);
            }
            ak0Var2 = ak0Var;
            ex.b(zBooleanValue, (ej0) objL2, null, vs0.C(195820804, new gn(ni0Var, da1Var, ej0Var, i5), ak0Var), ak0Var2, 3120);
        } else {
            ak0Var2 = ak0Var;
            ak0Var2.R();
        }
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new jd(ni0Var, ej0Var, i2, i3);
        }
    }

    public static final void h(int i2, int i3, ti0 ti0Var, ej0 ej0Var, ak0 ak0Var) {
        ak0Var.X(1916644167);
        int i4 = 2;
        int i5 = i3 | (ak0Var.d(i2) ? 4 : 2) | (ak0Var.h(ej0Var) ? 32 : 16);
        int i6 = 0;
        int i7 = 1;
        if (ak0Var.O(i5 & 1, (i5 & 147) != 146)) {
            Long lValueOf = Long.valueOf(((long) i2) * 86400000);
            kj1 kj1Var = e20.a;
            lr0 lr0Var = o00.b;
            n00 n00Var = o00.c;
            ak0Var.W(2088426481);
            Locale locale = ((Configuration) ak0Var.j(u5.a)).getLocales().get(0);
            ak0Var.p(false);
            Object[] objArr = new Object[0];
            ru1 ru1VarH = vv.H(new d(12, n00Var, locale), new vy(i7));
            boolean zF = ak0Var.f(lValueOf) | ak0Var.f(lValueOf) | ak0Var.h(lr0Var) | ak0Var.d(0) | ak0Var.f(n00Var) | ak0Var.h(locale);
            Object objL = ak0Var.L();
            if (zF || objL == cv.a) {
                Object f00Var = new f00(lValueOf, lValueOf, lr0Var, n00Var, locale);
                ak0Var.g0(f00Var);
                objL = f00Var;
            }
            f20 f20Var = (f20) ex.I(objArr, ru1VarH, (ti0) objL, ak0Var, 0);
            f20Var.d.setValue(n00Var);
            q00.a(ti0Var, vs0.C(2084040949, new jd(i6, f20Var, ej0Var), ak0Var), null, vs0.C(760862003, new pd(i6, ti0Var), ak0Var), null, null, null, vs0.C(-1389608386, new ji0(i4, f20Var), ak0Var), ak0Var, 100666422);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new od(i2, ej0Var, ti0Var, i3, 1);
        }
    }

    public static final void i(lm0 lm0Var, ti0 ti0Var, ak0 ak0Var, int i2) {
        ak0Var.X(530307547);
        int i3 = 16;
        int i4 = (ak0Var.f(lm0Var) ? 4 : 2) | i2 | (ak0Var.h(ti0Var) ? 32 : 16);
        int i5 = 1;
        if (ak0Var.O(i4 & 1, (i4 & 19) != 18)) {
            nj2.c(ti0Var, f52.a, false, null, null, null, vs0.C(623771408, new ji0(i5, lm0Var), ak0Var), ak0Var, ((i4 >> 3) & 14) | 100663344);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new jd(lm0Var, ti0Var, i2, i3);
        }
    }

    public static final void j(ti0 ti0Var, ij0 ij0Var, rm0 rm0Var, ak0 ak0Var, int i2) {
        rm0 rm0Var2;
        rm0 rm0Var3;
        ti0Var.getClass();
        ij0Var.getClass();
        ak0Var.X(1370045161);
        int i3 = i2 | (ak0Var.h(ti0Var) ? 4 : 2) | (ak0Var.h(ij0Var) ? 32 : 16) | 128;
        int i4 = 1;
        if (ak0Var.O(i3 & 1, (i3 & 147) != 146)) {
            ak0Var.T();
            if ((i2 & 1) == 0 || ak0Var.y()) {
                co2 co2VarA = o31.a(ak0Var);
                if (co2VarA == null) {
                    fu1.h("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                rm0Var3 = (rm0) p12.r(js1.a(rm0.class), co2VarA, sv.y(co2VarA, ak0Var), co2VarA instanceof zl0 ? ((zl0) co2VarA).f() : jz.b, ak0Var);
            } else {
                ak0Var.R();
                rm0Var3 = rm0Var;
            }
            ak0Var.q();
            da1 da1VarR = qx.r(rm0Var3.c, ak0Var);
            WeakHashMap weakHashMap = fq2.v;
            ix.f(null, vs0.C(106674597, new pd(5, ti0Var), ak0Var), null, null, null, 0, 0L, 0L, new h21(new kl2(p12.b(ak0Var).g, p12.b(ak0Var).b), v12.f), vs0.C(1916009082, new gn(da1VarR, rm0Var3, ij0Var, i4), ak0Var), ak0Var, 805306416, 253);
            rm0Var2 = rm0Var3;
        } else {
            ak0Var.R();
            rm0Var2 = rm0Var;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new p1(ti0Var, (Object) ij0Var, (un2) rm0Var2, i2, 5);
        }
    }

    public static final void k(int i2, int i3, ti0 ti0Var, ej0 ej0Var, ak0 ak0Var) {
        ak0Var.X(-238213624);
        int i4 = i3 | (ak0Var.d(i2) ? 4 : 2) | (ak0Var.h(ej0Var) ? 32 : 16);
        if (ak0Var.O(i4 & 1, (i4 & 147) != 146)) {
            Object objL = ak0Var.L();
            is1 is1Var = cv.a;
            if (objL == is1Var) {
                objL = y12.s(ei1.r(i2));
                ak0Var.g0(objL);
            }
            da1 da1Var = (da1) objL;
            Object objL2 = ak0Var.L();
            if (objL2 == is1Var) {
                ak1 ak1Var = new ak1(((nt0) da1Var.getValue()).a);
                ak0Var.g0(ak1Var);
                objL2 = ak1Var;
            }
            ak1 ak1Var2 = (ak1) objL2;
            Object objL3 = ak0Var.L();
            if (objL3 == is1Var) {
                ak1 ak1Var3 = new ak1(((nt0) da1Var.getValue()).b);
                ak0Var.g0(ak1Var3);
                objL3 = ak1Var3;
            }
            ak1 ak1Var4 = (ak1) objL3;
            Object objL4 = ak0Var.L();
            if (objL4 == is1Var) {
                objL4 = y12.s(Boolean.FALSE);
                ak0Var.g0(objL4);
            }
            da1 da1Var2 = (da1) objL4;
            Object objL5 = ak0Var.L();
            if (objL5 == is1Var) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                objL5 = ei1.r((int) Math.floorDiv(jCurrentTimeMillis + ((long) TimeZone.getDefault().getOffset(jCurrentTimeMillis)), 86400000L));
                ak0Var.g0(objL5);
            }
            p61.d(ti0Var, null, vs0.C(754923999, new qd((nt0) objL5, da1Var, ak1Var2, ak1Var4, da1Var2, ti0Var, ej0Var, 1), ak0Var), ak0Var, 390, 2);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new od(i2, ej0Var, ti0Var, i3, 2);
        }
    }

    public static final void l(ak1 ak1Var, ak1 ak1Var2, int i2) {
        int iH = (ak1Var2.h() - 1) + (ak1Var.h() * 12) + i2;
        ak1Var.i(Math.floorDiv(iH, 12));
        ak1Var2.i(Math.floorMod(iH, 12) + 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean, int] */
    public static final void m(int i2, int i3, nt0 nt0Var, nt0 nt0Var2, ej0 ej0Var, ak0 ak0Var, int i4) {
        ak0 ak0Var2;
        float f2;
        float f3;
        int i5;
        boolean z2;
        ee eeVar;
        float f4;
        vi viVar;
        float f5;
        boolean z3;
        int i6;
        ak0 ak0Var3;
        long j2;
        u71 njVar;
        Object obj;
        long j3;
        int i7 = i2;
        int i8 = i3;
        Object obj2 = nt0Var;
        ak0 ak0Var4 = ak0Var;
        wi wiVar = q90.j;
        vi viVar2 = q90.o;
        ee eeVar2 = ws0.e;
        ak0Var4.X(703278301);
        int i9 = i4 | (ak0Var4.d(i7) ? 4 : 2) | (ak0Var4.d(i8) ? 32 : 16) | (ak0Var4.f(obj2) ? 256 : 128);
        if (ak0Var4.O(i9 & 1, (i9 & 9363) != 9362)) {
            mt0 mt0VarI = ei1.i(i7);
            int i10 = 31;
            int iFloorMod = Math.floorMod(((((i8 - 1) * 31) + ei1.w(mt0VarI.b, mt0VarI.c)) - ((i8 - 7) * (i8 / 7))) - 2440583, 7);
            if (i8 > 6) {
                i10 = (i8 > 11 && ei1.i(i7).a != 0) ? 29 : 30;
            }
            r71 r71Var = r71.a;
            u71 u71VarE0 = p61.e0(r71Var, 12.0f, 0.0f, 2);
            wr wrVarA = ur.a(ws0.g, q90.r, ak0Var4, 0);
            r71 r71Var2 = r71Var;
            int iHashCode = Long.hashCode(ak0Var4.T);
            sl1 sl1VarL = ak0Var4.l();
            u71 u71VarB = nj2.B(ak0Var4, u71VarE0);
            wu.c.getClass();
            ti0 ti0Var = vu.b;
            ak0Var4.Z();
            if (ak0Var4.S) {
                ak0Var4.k(ti0Var);
            } else {
                ak0Var4.j0();
            }
            ra raVar = vu.f;
            p12.l(raVar, ak0Var4, wrVarA);
            ra raVar2 = vu.e;
            p12.l(raVar2, ak0Var4, sl1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            ra raVar3 = vu.g;
            p12.f(ak0Var4, numValueOf, raVar3);
            x4 x4Var = vu.h;
            p12.k(ak0Var4, x4Var);
            ra raVar4 = vu.d;
            p12.l(raVar4, ak0Var4, u71VarB);
            gd0 gd0Var = f52.a;
            int i11 = i10;
            sv1 sv1VarA = rv1.a(eeVar2, viVar2, ak0Var4, 0);
            ee eeVar3 = eeVar2;
            int iHashCode2 = Long.hashCode(ak0Var4.T);
            sl1 sl1VarL2 = ak0Var4.l();
            u71 u71VarB2 = nj2.B(ak0Var4, gd0Var);
            ak0Var4.Z();
            vi viVar3 = viVar2;
            if (ak0Var4.S) {
                ak0Var4.k(ti0Var);
            } else {
                ak0Var4.j0();
            }
            p12.l(raVar, ak0Var4, sv1VarA);
            p12.l(raVar2, ak0Var4, sl1VarL2);
            k3.q(iHashCode2, ak0Var4, raVar3, ak0Var4, x4Var);
            p12.l(raVar4, ak0Var4, u71VarB2);
            ak0Var4.W(-986601803);
            int i12 = 0;
            while (true) {
                f2 = 36.0f;
                f3 = 1.0f;
                if (i12 >= 7) {
                    break;
                }
                String str = nt0.f[i12];
                u71 u71VarC = f52.c(new px0(1.0f, true), 36.0f);
                w61 w61VarC = xj.c(wiVar, false);
                int iHashCode3 = Long.hashCode(ak0Var4.T);
                sl1 sl1VarL3 = ak0Var4.l();
                u71 u71VarB3 = nj2.B(ak0Var4, u71VarC);
                wu.c.getClass();
                ti0 ti0Var2 = vu.b;
                ak0Var4.Z();
                if (ak0Var4.S) {
                    ak0Var4.k(ti0Var2);
                } else {
                    ak0Var4.j0();
                }
                p12.l(vu.f, ak0Var4, w61VarC);
                p12.l(vu.e, ak0Var4, sl1VarL3);
                p12.f(ak0Var4, Integer.valueOf(iHashCode3), vu.g);
                p12.k(ak0Var4, vu.h);
                p12.l(vu.d, ak0Var4, u71VarB3);
                ak0 ak0Var5 = ak0Var4;
                ef2.b(str, null, ((jr) ak0Var4.j(lr.a)).s, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var4.j(ik2.a)).l, ak0Var5, 0, 0, 131066);
                ak0Var5.p(true);
                ak0Var4 = ak0Var5;
                i12++;
                r71Var2 = r71Var2;
                wiVar = wiVar;
                viVar3 = viVar3;
                eeVar3 = eeVar3;
                i11 = i11;
            }
            wi wiVar2 = wiVar;
            r71 r71Var3 = r71Var2;
            int i13 = i11;
            ee eeVar4 = eeVar3;
            vi viVar4 = viVar3;
            int i14 = 6;
            ?? r12 = 0;
            ak0 ak0Var6 = ak0Var4;
            boolean z4 = true;
            ak0Var6.p(false);
            ak0Var6.p(true);
            ak0Var6.W(-1785015418);
            int i15 = 0;
            ak0 ak0Var7 = ak0Var6;
            while (i15 < i14) {
                gd0 gd0Var2 = f52.a;
                vi viVar5 = viVar4;
                ee eeVar5 = eeVar4;
                sv1 sv1VarA2 = rv1.a(eeVar5, viVar5, ak0Var7, r12);
                int iHashCode4 = Long.hashCode(ak0Var7.T);
                sl1 sl1VarL4 = ak0Var7.l();
                u71 u71VarB4 = nj2.B(ak0Var7, gd0Var2);
                wu.c.getClass();
                wv wvVar = vu.b;
                ak0Var7.Z();
                if (ak0Var7.S) {
                    ak0Var7.k(wvVar);
                } else {
                    ak0Var7.j0();
                }
                p12.l(vu.f, ak0Var7, sv1VarA2);
                p12.l(vu.e, ak0Var7, sl1VarL4);
                p12.f(ak0Var7, Integer.valueOf(iHashCode4), vu.g);
                p12.k(ak0Var7, vu.h);
                p12.l(vu.d, ak0Var7, u71VarB4);
                ak0Var7.W(-938294936);
                int i16 = 0;
                int i17 = 7;
                ?? r0 = z4;
                ak0 ak0Var8 = ak0Var7;
                while (i16 < i17) {
                    int i18 = (((i15 * 7) + i16) - iFloorMod) + r0;
                    u71 u71VarC2 = f52.c(new px0(f3, r0), 40.0f);
                    float f6 = f2;
                    wiVar2 = wiVar2;
                    w61 w61VarC2 = xj.c(wiVar2, false);
                    vi viVar6 = viVar5;
                    int iHashCode5 = Long.hashCode(ak0Var8.T);
                    sl1 sl1VarL5 = ak0Var8.l();
                    u71 u71VarB5 = nj2.B(ak0Var8, u71VarC2);
                    wu.c.getClass();
                    ti0 ti0Var3 = vu.b;
                    ak0Var8.Z();
                    if (ak0Var8.S) {
                        ak0Var8.k(ti0Var3);
                    } else {
                        ak0Var8.j0();
                    }
                    ra raVar5 = vu.f;
                    p12.l(raVar5, ak0Var8, w61VarC2);
                    ra raVar6 = vu.e;
                    p12.l(raVar6, ak0Var8, sl1VarL5);
                    Integer numValueOf2 = Integer.valueOf(iHashCode5);
                    ra raVar7 = vu.g;
                    p12.f(ak0Var8, numValueOf2, raVar7);
                    x4 x4Var2 = vu.h;
                    p12.k(ak0Var8, x4Var2);
                    int i19 = i16;
                    ra raVar8 = vu.d;
                    p12.l(raVar8, ak0Var8, u71VarB5);
                    if (r0 <= i18) {
                        int i20 = i13;
                        if (i18 <= i20) {
                            ak0Var8.W(-2025145044);
                            nt0 nt0Var3 = new nt0(i7, i8, i18);
                            boolean zEquals = nt0Var3.equals(obj2);
                            u71 u71VarJ = f52.j(f6);
                            jv1 jv1Var = kv1.a;
                            u71 u71VarK = nj2.k(u71VarJ, jv1Var);
                            if (zEquals) {
                                ak0Var8.W(1597255372);
                                j2 = vv.m(ak0Var8).a;
                                ak0Var8.p(false);
                            } else {
                                ak0Var8.W(1597257913);
                                j2 = vv.m(ak0Var8).G;
                                ak0Var8.p(false);
                            }
                            u71 u71VarS = p61.s(u71VarK, j2, vs0.C);
                            if (!nt0Var3.equals(nt0Var2) || zEquals) {
                                ak0Var8.W(-2024060323);
                                ak0Var8.p(false);
                                njVar = r71Var3;
                            } else {
                                ak0Var8.W(-2024426743);
                                njVar = new nj(1.0f, new o72(vv.m(ak0Var8).a), jv1Var);
                                ak0Var8.p(false);
                            }
                            u71 u71VarC3 = u71VarS.c(njVar);
                            boolean zF = ak0Var8.f(nt0Var3);
                            Object objL = ak0Var8.L();
                            if (zF || objL == cv.a) {
                                Object n1Var = new n1(4, ej0Var, nt0Var3);
                                ak0Var8.g0(n1Var);
                                obj = n1Var;
                            } else {
                                obj = objL;
                            }
                            u71 u71VarT = sv0.T(u71VarC3, false, null, null, (ti0) obj, 15);
                            w61 w61VarC3 = xj.c(wiVar2, false);
                            int iHashCode6 = Long.hashCode(ak0Var8.T);
                            sl1 sl1VarL6 = ak0Var8.l();
                            u71 u71VarB6 = nj2.B(ak0Var8, u71VarT);
                            ak0Var8.Z();
                            if (ak0Var8.S) {
                                ak0Var8.k(ti0Var3);
                            } else {
                                ak0Var8.j0();
                            }
                            p12.l(raVar5, ak0Var8, w61VarC3);
                            p12.l(raVar6, ak0Var8, sl1VarL6);
                            k3.q(iHashCode6, ak0Var8, raVar7, ak0Var8, x4Var2);
                            p12.l(raVar8, ak0Var8, u71VarB6);
                            String strN = dv1.N(String.valueOf(i18));
                            vf2 vf2Var = vv.z(ak0Var8).k;
                            if (zEquals) {
                                ak0Var8.W(-1770705491);
                                j3 = vv.m(ak0Var8).b;
                                ak0Var8.p(false);
                            } else if (nt0Var3.equals(nt0Var2)) {
                                ak0Var8.W(-1770702517);
                                j3 = vv.m(ak0Var8).a;
                                ak0Var8.p(false);
                            } else {
                                ak0Var8.W(-1770699891);
                                j3 = vv.m(ak0Var8).q;
                                ak0Var8.p(false);
                            }
                            eeVar = eeVar5;
                            viVar = viVar6;
                            i6 = 7;
                            i5 = i20;
                            f4 = f6;
                            ak0 ak0Var9 = ak0Var8;
                            f5 = 1.0f;
                            ef2.b(strN, null, j3, 0L, 0L, null, 0L, 0, false, 0, 0, vf2Var, ak0Var9, 0, 0, 131066);
                            ak0 ak0Var10 = ak0Var9;
                            z2 = 1;
                            ak0Var10.p(true);
                            z3 = false;
                            ak0Var3 = ak0Var10;
                        } else {
                            i5 = i20;
                        }
                        ak0Var3.p(z3);
                        ak0Var3.p(z2);
                        i7 = i2;
                        obj2 = nt0Var;
                        i15 = i15;
                        f3 = f5;
                        i16 = i19 + 1;
                        r0 = z2;
                        eeVar5 = eeVar;
                        i17 = i6;
                        i13 = i5;
                        viVar5 = viVar;
                        f2 = f4;
                        i8 = i3;
                        ak0Var8 = ak0Var3;
                    } else {
                        i5 = i13;
                    }
                    z2 = r0;
                    eeVar = eeVar5;
                    f4 = f6;
                    viVar = viVar6;
                    f5 = 1.0f;
                    z3 = false;
                    i6 = 7;
                    ak0Var8.W(-2035035811);
                    ak0Var3 = ak0Var8;
                    ak0Var3.p(z3);
                    ak0Var3.p(z2);
                    i7 = i2;
                    obj2 = nt0Var;
                    i15 = i15;
                    f3 = f5;
                    i16 = i19 + 1;
                    r0 = z2;
                    eeVar5 = eeVar;
                    i17 = i6;
                    i13 = i5;
                    viVar5 = viVar;
                    f2 = f4;
                    i8 = i3;
                    ak0Var8 = ak0Var3;
                }
                viVar4 = viVar5;
                r12 = 0;
                boolean z5 = r0;
                ak0Var8.p(false);
                ak0Var8.p(z5);
                i15++;
                i7 = i2;
                obj2 = nt0Var;
                z4 = z5 ? 1 : 0;
                eeVar4 = eeVar5;
                i14 = 6;
                i8 = i3;
                ak0Var7 = ak0Var8;
            }
            boolean z6 = z4 ? 1 : 0;
            ak0Var7.p(r12);
            ak0Var7.p(z6);
            ak0Var2 = ak0Var7;
        } else {
            ak0 ak0Var11 = ak0Var4;
            ak0Var11.R();
            ak0Var2 = ak0Var11;
        }
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ld(i2, i3, nt0Var, nt0Var2, ej0Var, i4);
        }
    }

    public static final void n(final int i2, final int i3, final ej0 ej0Var, ak0 ak0Var, final int i4) {
        ak0Var.X(823558674);
        int i5 = i4 | (ak0Var.d(i2) ? 4 : 2);
        int i6 = 0;
        if (ak0Var.O(i5 & 1, (i5 & 147) != 146)) {
            Object objL = ak0Var.L();
            Object obj = cv.a;
            if (objL == obj) {
                objL = vq.h0(new lr0(i3 - 60, i3 + 5, 1));
                ak0Var.g0(objL);
            }
            List list = (List) objL;
            ry0 ry0VarA = uy0.a(ex.h(i2 - ((Number) vq.Q(list)).intValue(), 0, list.size() - 1), 2, ak0Var);
            kl0 kl0Var = new kl0();
            u71 u71VarE0 = p61.e0(f52.c(r71.a, 292.0f), 12.0f, 0.0f, 2);
            boolean zH = ak0Var.h(list) | ((i5 & 14) == 4);
            Object objL2 = ak0Var.L();
            if (zH || objL2 == obj) {
                objL2 = new md(list, i2, ej0Var, i6);
                ak0Var.g0(objL2);
            }
            qx.e(kl0Var, u71VarE0, ry0VarA, null, null, null, null, false, null, (ej0) objL2, ak0Var, 48, 1016);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0(i2, i3, ej0Var, i4) { // from class: nd
                public final /* synthetic */ int e;
                public final /* synthetic */ int f;
                public final /* synthetic */ ej0 g;

                @Override // defpackage.ij0
                public final Object g(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = ei1.P(433);
                    s5.n(this.e, this.f, this.g, (ak0) obj2, iP);
                    return ll2.a;
                }
            };
        }
    }

    public static final void o(ij0 ij0Var, ak0 ak0Var, Object obj) {
        uy uyVar = ak0Var.R;
        boolean zF = ak0Var.f(obj);
        Object objL = ak0Var.L();
        if (zF || objL == cv.a) {
            objL = new fw0(uyVar, ij0Var);
            ak0Var.g0(objL);
        }
    }

    public static final void p(Object obj, Object obj2, ij0 ij0Var, ak0 ak0Var) {
        uy uyVar = ak0Var.R;
        boolean zF = ak0Var.f(obj) | ak0Var.f(obj2);
        Object objL = ak0Var.L();
        if (zF || objL == cv.a) {
            objL = new fw0(uyVar, ij0Var);
            ak0Var.g0(objL);
        }
    }

    public static final void q(j11 j11Var, u71 u71Var, ak0 ak0Var, int i2) {
        ak0 ak0Var2;
        ak0Var.X(1080290886);
        int i3 = (ak0Var.f(j11Var) ? 4 : 2) | i2 | 48;
        if (!ak0Var.O(i3 & 1, (i3 & 19) != 18)) {
            ak0Var2 = ak0Var;
            ak0Var2.R();
        } else {
            if (h92.I(j11Var.a) && h92.I(j11Var.b) && h92.I(j11Var.c) && h92.I(j11Var.d)) {
                lr1 lr1VarR = ak0Var.r();
                if (lr1VarR != null) {
                    lr1VarR.d = new x7(i2, 13, j11Var);
                    return;
                }
                return;
            }
            gt gtVarC = vs0.C(565790040, new ji0(8, j11Var), ak0Var);
            r71 r71Var = r71.a;
            ak0Var2 = ak0Var;
            s(r71Var, 6.0f, gtVarC, ak0Var2, 438, 0);
            u71Var = r71Var;
        }
        lr1 lr1VarR2 = ak0Var2.r();
        if (lr1VarR2 != null) {
            lr1VarR2.d = new jd(j11Var, u71Var, i2, 26);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:49:0x0100  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    public static final void r(final String str, final ej0 ej0Var, final int i2, u71 u71Var, boolean z2, ak0 ak0Var, final int i3, final int i4) {
        u71 u71Var2;
        int i5;
        boolean z3;
        boolean z4;
        final u71 u71Var3;
        final boolean z5;
        lr1 lr1VarR;
        u71 u71Var4;
        final boolean z6;
        io2 io2Var;
        ak0Var.X(-1135174265);
        int i6 = (ak0Var.f(str) ? 4 : 2) | i3 | (ak0Var.h(ej0Var) ? 32 : 16);
        int i7 = i4 & 8;
        if (i7 != 0) {
            i5 = i6 | 3072;
            u71Var2 = u71Var;
        } else {
            u71Var2 = u71Var;
            i5 = i6 | (ak0Var.f(u71Var2) ? 2048 : 1024);
        }
        int i8 = i4 & 16;
        if (i8 == 0) {
            if ((i3 & 24576) == 0) {
                z3 = z2;
                i5 |= ak0Var.g(z3) ? 16384 : 8192;
            }
            if ((i5 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ak0Var.O(i5 & 1, z4)) {
                if (i7 != 0) {
                    u71Var4 = r71.a;
                } else {
                    u71Var4 = u71Var2;
                }
                if (i8 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                if (dv1.z(ak0Var)) {
                    io2Var = I;
                } else {
                    io2Var = is1.u;
                }
                vf2 vf2Var = ((gk2) ak0Var.j(ik2.a)).h;
                a90 a90Var = lr.a;
                bi.b(str, ej0Var, u71Var4, false, false, vf2.a(vf2Var, ((jr) ak0Var.j(a90Var)).q, 0L, null, null, 0L, 0L, null, 16744446), new aw0(3, 0, 123), null, true, 0, 0, io2Var, null, null, new o72(((jr) ak0Var.j(a90Var)).a), vs0.C(799320426, new jj0() { // from class: m11
                    @Override // defpackage.jj0
                    public final Object d(Object obj, Object obj2, Object obj3) {
                        boolean z7;
                        ak0 ak0Var2;
                        ij0 ij0Var = (ij0) obj;
                        ak0 ak0Var3 = (ak0) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ij0Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= ak0Var3.h(ij0Var) ? 4 : 2;
                        }
                        int i9 = iIntValue;
                        if (ak0Var3.O(i9 & 1, (i9 & 19) != 18)) {
                            wi wiVar = q90.j;
                            u71 u71VarE0 = p61.e0(r71.a, 0.0f, z6 ? 2.0f : 16.0f, 1);
                            w61 w61VarC = xj.c(wiVar, false);
                            int iHashCode = Long.hashCode(ak0Var3.T);
                            sl1 sl1VarL = ak0Var3.l();
                            u71 u71VarB = nj2.B(ak0Var3, u71VarE0);
                            wu.c.getClass();
                            ti0 ti0Var = vu.b;
                            ak0Var3.Z();
                            if (ak0Var3.S) {
                                ak0Var3.k(ti0Var);
                            } else {
                                ak0Var3.j0();
                            }
                            p12.l(vu.f, ak0Var3, w61VarC);
                            p12.l(vu.e, ak0Var3, sl1VarL);
                            p12.f(ak0Var3, Integer.valueOf(iHashCode), vu.g);
                            p12.k(ak0Var3, vu.h);
                            p12.l(vu.d, ak0Var3, u71VarB);
                            if (str.length() == 0) {
                                ak0Var3.W(-1435431201);
                                z7 = false;
                                ef2.b(o92.x("–", i2), null, ((jr) ak0Var3.j(lr.a)).A, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var3.j(ik2.a)).h, ak0Var3, 0, 0, 131066);
                                ak0Var2 = ak0Var3;
                            } else {
                                z7 = false;
                                ak0Var3.W(-1443423714);
                                ak0Var2 = ak0Var3;
                            }
                            ak0Var2.p(z7);
                            ij0Var.g(ak0Var2, Integer.valueOf(i9 & 14));
                            ak0Var2.p(true);
                        } else {
                            ak0Var3.R();
                        }
                        return ll2.a;
                    }
                }, ak0Var), ak0Var, (i5 & 14) | 102236160 | (i5 & 112) | ((i5 >> 3) & 896), 13976);
                u71Var3 = u71Var4;
                z5 = z6;
            } else {
                ak0Var.R();
                u71Var3 = u71Var2;
                z5 = z3;
            }
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new ij0() { // from class: n11
                    @Override // defpackage.ij0
                    public final Object g(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        s5.r(str, ej0Var, i2, u71Var3, z5, (ak0) obj, ei1.P(i3 | 1), i4);
                        return ll2.a;
                    }
                };
            }
        }
        i5 |= 24576;
        z3 = z2;
        if ((i5 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (ak0Var.O(i5 & 1, z4)) {
            if (i7 != 0) {
                u71Var4 = r71.a;
            } else {
                u71Var4 = u71Var2;
            }
            if (i8 != 0) {
                z6 = false;
            } else {
                z6 = z3;
            }
            if (dv1.z(ak0Var)) {
                io2Var = I;
            } else {
                io2Var = is1.u;
            }
            vf2 vf2Var2 = ((gk2) ak0Var.j(ik2.a)).h;
            a90 a90Var2 = lr.a;
            bi.b(str, ej0Var, u71Var4, false, false, vf2.a(vf2Var2, ((jr) ak0Var.j(a90Var2)).q, 0L, null, null, 0L, 0L, null, 16744446), new aw0(3, 0, 123), null, true, 0, 0, io2Var, null, null, new o72(((jr) ak0Var.j(a90Var2)).a), vs0.C(799320426, new jj0() { // from class: m11
                @Override // defpackage.jj0
                public final Object d(Object obj, Object obj2, Object obj3) {
                    boolean z7;
                    ak0 ak0Var2;
                    ij0 ij0Var = (ij0) obj;
                    ak0 ak0Var3 = (ak0) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ij0Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ak0Var3.h(ij0Var) ? 4 : 2;
                    }
                    int i9 = iIntValue;
                    if (ak0Var3.O(i9 & 1, (i9 & 19) != 18)) {
                        wi wiVar = q90.j;
                        u71 u71VarE0 = p61.e0(r71.a, 0.0f, z6 ? 2.0f : 16.0f, 1);
                        w61 w61VarC = xj.c(wiVar, false);
                        int iHashCode = Long.hashCode(ak0Var3.T);
                        sl1 sl1VarL = ak0Var3.l();
                        u71 u71VarB = nj2.B(ak0Var3, u71VarE0);
                        wu.c.getClass();
                        ti0 ti0Var = vu.b;
                        ak0Var3.Z();
                        if (ak0Var3.S) {
                            ak0Var3.k(ti0Var);
                        } else {
                            ak0Var3.j0();
                        }
                        p12.l(vu.f, ak0Var3, w61VarC);
                        p12.l(vu.e, ak0Var3, sl1VarL);
                        p12.f(ak0Var3, Integer.valueOf(iHashCode), vu.g);
                        p12.k(ak0Var3, vu.h);
                        p12.l(vu.d, ak0Var3, u71VarB);
                        if (str.length() == 0) {
                            ak0Var3.W(-1435431201);
                            z7 = false;
                            ef2.b(o92.x("–", i2), null, ((jr) ak0Var3.j(lr.a)).A, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var3.j(ik2.a)).h, ak0Var3, 0, 0, 131066);
                            ak0Var2 = ak0Var3;
                        } else {
                            z7 = false;
                            ak0Var3.W(-1443423714);
                            ak0Var2 = ak0Var3;
                        }
                        ak0Var2.p(z7);
                        ij0Var.g(ak0Var2, Integer.valueOf(i9 & 14));
                        ak0Var2.p(true);
                    } else {
                        ak0Var3.R();
                    }
                    return ll2.a;
                }
            }, ak0Var), ak0Var, (i5 & 14) | 102236160 | (i5 & 112) | ((i5 >> 3) & 896), 13976);
            u71Var3 = u71Var4;
            z5 = z6;
        } else {
            ak0Var.R();
            u71Var3 = u71Var2;
            z5 = z3;
        }
        lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: n11
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s5.r(str, ej0Var, i2, u71Var3, z5, (ak0) obj, ei1.P(i3 | 1), i4);
                    return ll2.a;
                }
            };
        }
    }

    public static final void s(final u71 u71Var, float f2, final gt gtVar, ak0 ak0Var, final int i2, final int i3) {
        int i4;
        ak0Var.X(1584756035);
        if ((i2 & 6) == 0) {
            i4 = (ak0Var.f(u71Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= ak0Var.c(f2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ak0Var.h(gtVar) ? 256 : 128;
        }
        if (ak0Var.O(i4 & 1, (i4 & 147) != 146)) {
            if (i5 != 0) {
                f2 = 8.0f;
            }
            sv.a(yv.n.a(kw0.e), vs0.C(103712899, new k11(f2, u71Var, gtVar), ak0Var), ak0Var, 56);
        } else {
            ak0Var.R();
        }
        final float f3 = f2;
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: l11
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s5.s(u71Var, f3, gtVar, (ak0) obj, ei1.P(i2 | 1), i3);
                    return ll2.a;
                }
            };
        }
    }

    public static final void t(j11 j11Var, ej0 ej0Var, ej0 ej0Var2, ej0 ej0Var3, ej0 ej0Var4, u71 u71Var, ak0 ak0Var, int i2) {
        j11 j11Var2;
        ej0 ej0Var5;
        ej0 ej0Var6;
        ej0 ej0Var7;
        ej0 ej0Var8;
        ak0 ak0Var2;
        ej0Var.getClass();
        ej0Var2.getClass();
        ej0Var3.getClass();
        ej0Var4.getClass();
        ak0Var.X(-1208966727);
        int i3 = (ak0Var.f(j11Var) ? 4 : 2) | i2 | (ak0Var.h(ej0Var) ? 32 : 16) | (ak0Var.h(ej0Var2) ? 256 : 128) | (ak0Var.h(ej0Var3) ? 2048 : 1024) | (ak0Var.h(ej0Var4) ? 16384 : 8192) | 196608;
        if (ak0Var.O(i3 & 1, (74899 & i3) != 74898)) {
            j11Var2 = j11Var;
            ej0Var5 = ej0Var;
            ej0Var6 = ej0Var2;
            ej0Var7 = ej0Var3;
            ej0Var8 = ej0Var4;
            ak0Var2 = ak0Var;
            s(f52.a, 0.0f, vs0.C(841350859, new en0(j11Var2, ej0Var5, ej0Var6, ej0Var7, ej0Var8), ak0Var), ak0Var2, 384, 2);
            u71Var = r71.a;
        } else {
            j11Var2 = j11Var;
            ej0Var5 = ej0Var;
            ej0Var6 = ej0Var2;
            ej0Var7 = ej0Var3;
            ej0Var8 = ej0Var4;
            ak0Var2 = ak0Var;
            ak0Var2.R();
        }
        u71 u71Var2 = u71Var;
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new cn0(j11Var2, ej0Var5, ej0Var6, ej0Var7, ej0Var8, u71Var2, i2);
        }
    }

    public static final void u(String str, ej0 ej0Var, u71 u71Var, ak0 ak0Var, int i2) {
        long j2;
        ak0 ak0Var2 = ak0Var;
        ak0Var2.X(1919480942);
        int i3 = i2 | (ak0Var2.f(str) ? 4 : 2) | (ak0Var2.h(ej0Var) ? 32 : 16) | (ak0Var2.f(u71Var) ? 256 : 128);
        if (ak0Var2.O(i3 & 1, (i3 & 147) != 146)) {
            Object objL = ak0Var2.L();
            is1 is1Var = cv.a;
            if (objL == is1Var) {
                objL = y12.s(Boolean.FALSE);
                ak0Var2.g0(objL);
            }
            da1 da1Var = (da1) objL;
            w61 w61VarC = xj.c(q90.j, false);
            int iHashCode = Long.hashCode(ak0Var2.T);
            sl1 sl1VarL = ak0Var2.l();
            u71 u71VarB = nj2.B(ak0Var2, u71Var);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var2.Z();
            if (ak0Var2.S) {
                ak0Var2.k(wvVar);
            } else {
                ak0Var2.j0();
            }
            p12.l(vu.f, ak0Var2, w61VarC);
            p12.l(vu.e, ak0Var2, sl1VarL);
            p12.f(ak0Var2, Integer.valueOf(iHashCode), vu.g);
            p12.k(ak0Var2, vu.h);
            p12.l(vu.d, ak0Var2, u71VarB);
            String str2 = ws0.j(str, "ژ") ? "♿" : str;
            if (h92.I(str2)) {
                str2 = "–";
            }
            vf2 vf2Var = ((gk2) ak0Var2.j(ik2.a)).h;
            if (h92.I(str)) {
                ak0Var2.W(80853209);
                j2 = ((jr) ak0Var2.j(lr.a)).A;
                ak0Var2.p(false);
            } else {
                ak0Var2.W(80923703);
                j2 = ((jr) ak0Var2.j(lr.a)).q;
                ak0Var2.p(false);
            }
            gd0 gd0Var = f52.a;
            Object objL2 = ak0Var2.L();
            if (objL2 == is1Var) {
                objL2 = new r9(da1Var, 19);
                ak0Var2.g0(objL2);
            }
            ef2.b(str2, p61.e0(sv0.T(gd0Var, false, null, null, (ti0) objL2, 15), 0.0f, 16.0f, 1), j2, 0L, 0L, new gc2(3), 0L, 0, false, 0, 0, vf2Var, ak0Var2, 0, 0, 130040);
            boolean zBooleanValue = ((Boolean) da1Var.getValue()).booleanValue();
            Object objL3 = ak0Var2.L();
            if (objL3 == is1Var) {
                objL3 = new r9(da1Var, 20);
                ak0Var2.g0(objL3);
            }
            t7.a(zBooleanValue, (ti0) objL3, null, 0L, null, null, null, 0L, 0.0f, vs0.C(-1695836637, new hn(1, ej0Var, da1Var), ak0Var2), ak0Var, 48);
            ak0Var2 = ak0Var;
            ak0Var2.p(true);
        } else {
            ak0Var2.R();
        }
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new p1(str, ej0Var, u71Var, i2, 6);
        }
    }

    public static final void v(ti0 ti0Var, ak0 ak0Var) {
        bi1 bi1Var = ak0Var.M.b.d;
        bi1Var.Z(rh1.c);
        ex.O(bi1Var, 0, ti0Var);
    }

    public static final Bundle w(qj1... qj1VarArr) {
        Bundle bundle = new Bundle(qj1VarArr.length);
        for (qj1 qj1Var : qj1VarArr) {
            String str = (String) qj1Var.e;
            Object obj = qj1Var.f;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + "\"");
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + "\"");
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public abstract void L(k0 k0Var, k0 k0Var2);

    public abstract void M(k0 k0Var, Thread thread);

    public abstract boolean x(l0 l0Var, h0 h0Var);

    public abstract boolean y(l0 l0Var, Object obj, Object obj2);

    public abstract boolean z(l0 l0Var, k0 k0Var, k0 k0Var2);
}
