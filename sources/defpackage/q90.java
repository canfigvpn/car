package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class q90 implements tj, ty, n40, el, zt1, d72, da2 {
    public final /* synthetic */ int e;
    public static final wi f = new wi(-1.0f, -1.0f);
    public static final wi g = new wi(0.0f, -1.0f);
    public static final wi h = new wi(1.0f, -1.0f);
    public static final wi i = new wi(-1.0f, 0.0f);
    public static final wi j = new wi(0.0f, 0.0f);
    public static final wi k = new wi(1.0f, 0.0f);
    public static final wi l = new wi(-1.0f, 1.0f);
    public static final wi m = new wi(0.0f, 1.0f);
    public static final wi n = new wi(1.0f, 1.0f);
    public static final vi o = new vi(-1.0f);
    public static final vi p = new vi(0.0f);
    public static final vi q = new vi(1.0f);
    public static final ui r = new ui(-1.0f);
    public static final ui s = new ui(0.0f);
    public static final ui t = new ui(1.0f);
    public static final q90 u = new q90(2);
    public static final q90 v = new q90(3);
    public static final q90 w = new q90(4);
    public static final qj x = new qj(1);
    public static final b6 y = new b6(1);
    public static final b6 z = new b6(2);
    public static final /* synthetic */ q90 A = new q90(7);
    public static final /* synthetic */ q90 B = new q90(8);
    public static final q90 C = new q90(9);
    public static final q90 D = new q90(10);
    public static final q90 E = new q90(11);
    public static final q90 F = new q90(12);
    public static final kw0 G = kw0.e;
    public static final p40 H = new p40(1.0f, 1.0f);
    public static final q90 I = new q90(13);
    public static final q90 J = new q90(14);
    public static final q90 K = new q90(15);
    public static final yr1 L = new yr1(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final q90 M = new q90(17);
    public static final /* synthetic */ q90 N = new q90(18);
    public static final /* synthetic */ q90 O = new q90(19);
    public static final /* synthetic */ q90 P = new q90(20);
    public static final q90 Q = new q90(21);
    public static final /* synthetic */ q90 R = new q90(22);
    public static final /* synthetic */ q90 S = new q90(23);
    public static final q90 T = new q90(24);
    public static final q90 U = new q90(25);
    public static final q90 V = new q90(26);
    public static final q90 W = new q90(27);
    public static final q90 X = new q90(28);
    public static final /* synthetic */ q90 Y = new q90(29);

    public /* synthetic */ q90(int i2) {
        this.e = i2;
    }

    public static jd2 k(int i2, ak0 ak0Var) {
        return l((jr) ak0Var.j(lr.a), ak0Var);
    }

    public static jd2 l(jr jrVar, ak0 ak0Var) {
        jd2 jd2Var = jrVar.i0;
        boolean z2 = false;
        if (jd2Var == null) {
            ak0Var.W(390452338);
            ak0Var.p(false);
            jd2Var = null;
        } else {
            pf2 pf2Var = jd2Var.k;
            ak0Var.W(390452339);
            pf2 pf2Var2 = (pf2) ak0Var.j(qf2.a);
            if (!ws0.j(pf2Var, pf2Var2)) {
                jd2 jd2Var2 = new jd2(jd2Var.a, jd2Var.b, jd2Var.c, jd2Var.d, jd2Var.e, jd2Var.f, jd2Var.g, jd2Var.h, jd2Var.i, jd2Var.j, pf2Var2 == null ? pf2Var : pf2Var2, jd2Var.l, jd2Var.m, jd2Var.n, jd2Var.o, jd2Var.p, jd2Var.q, jd2Var.r, jd2Var.s, jd2Var.t, jd2Var.u, jd2Var.v, jd2Var.w, jd2Var.x, jd2Var.y, jd2Var.z, jd2Var.A, jd2Var.B, jd2Var.C, jd2Var.D, jd2Var.E, jd2Var.F, jd2Var.G, jd2Var.H, jd2Var.I, jd2Var.J, jd2Var.K, jd2Var.L, jd2Var.M, jd2Var.N, jd2Var.O, jd2Var.P, jd2Var.Q);
                jrVar.i0 = jd2Var2;
                jd2Var = jd2Var2;
                z2 = false;
            }
            ak0Var.p(z2);
        }
        if (jd2Var != null) {
            ak0Var.W(-1788515437);
            ak0Var.p(false);
            return jd2Var;
        }
        ak0Var.W(-1788321191);
        long jD = lr.d(jrVar, sv0.O);
        long jD2 = lr.d(jrVar, sv0.U);
        kr krVar = sv0.B;
        long jB = dr.b(0.38f, lr.d(jrVar, krVar));
        long jD3 = lr.d(jrVar, sv0.I);
        long j2 = dr.f;
        long jD4 = lr.d(jrVar, sv0.z);
        long jD5 = lr.d(jrVar, sv0.H);
        pf2 pf2Var3 = (pf2) ak0Var.j(qf2.a);
        long jD6 = lr.d(jrVar, sv0.R);
        long jD7 = lr.d(jrVar, sv0.a0);
        long jB2 = dr.b(0.12f, lr.d(jrVar, sv0.E));
        long jD8 = lr.d(jrVar, sv0.L);
        long jD9 = lr.d(jrVar, sv0.Q);
        long jD10 = lr.d(jrVar, sv0.Z);
        long jB3 = dr.b(0.38f, lr.d(jrVar, sv0.D));
        long jD11 = lr.d(jrVar, sv0.K);
        long jD12 = lr.d(jrVar, sv0.T);
        long jD13 = lr.d(jrVar, sv0.c0);
        long jB4 = dr.b(0.38f, lr.d(jrVar, sv0.G));
        long jD14 = lr.d(jrVar, sv0.N);
        long jD15 = lr.d(jrVar, sv0.P);
        long jD16 = lr.d(jrVar, sv0.Y);
        long jB5 = dr.b(0.38f, lr.d(jrVar, sv0.C));
        long jD17 = lr.d(jrVar, sv0.J);
        kr krVar2 = sv0.V;
        long jD18 = lr.d(jrVar, krVar2);
        long jD19 = lr.d(jrVar, krVar2);
        long jB6 = dr.b(0.38f, lr.d(jrVar, krVar));
        long jD20 = lr.d(jrVar, krVar2);
        long jD21 = lr.d(jrVar, sv0.S);
        long jD22 = lr.d(jrVar, sv0.b0);
        long jB7 = dr.b(0.38f, lr.d(jrVar, sv0.F));
        long jD23 = lr.d(jrVar, sv0.M);
        kr krVar3 = sv0.W;
        long jD24 = lr.d(jrVar, krVar3);
        long jD25 = lr.d(jrVar, krVar3);
        long jB8 = dr.b(0.38f, lr.d(jrVar, krVar3));
        long jD26 = lr.d(jrVar, krVar3);
        kr krVar4 = sv0.X;
        jd2 jd2Var3 = new jd2(jD, jD2, jB, jD3, j2, j2, j2, j2, jD4, jD5, pf2Var3, jD6, jD7, jB2, jD8, jD9, jD10, jB3, jD11, jD12, jD13, jB4, jD14, jD15, jD16, jB5, jD17, jD18, jD19, jB6, jD20, jD21, jD22, jB7, jD23, jD24, jD25, jB8, jD26, lr.d(jrVar, krVar4), lr.d(jrVar, krVar4), dr.b(0.38f, lr.d(jrVar, krVar4)), lr.d(jrVar, krVar4));
        jrVar.i0 = jd2Var3;
        ak0Var.p(false);
        return jd2Var3;
    }

    @Override // defpackage.tj
    public Rect a(Activity activity) throws Exception {
        int i2 = this.e;
        sj sjVar = tj.a;
        DisplayCutout displayCutoutG = null;
        switch (i2) {
            case 2:
                Rect rect = new Rect();
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect);
                if (!activity.isInMultiWindowMode()) {
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i3 = rect.bottom + dimensionPixelSize;
                    if (i3 == point.y) {
                        rect.bottom = i3;
                    } else {
                        int i4 = rect.right + dimensionPixelSize;
                        if (i4 == point.x) {
                            rect.right = i4;
                        }
                    }
                }
                return rect;
            case 3:
                Rect rect2 = new Rect();
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    if (activity.isInMultiWindowMode()) {
                        Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                        objInvoke.getClass();
                        rect2.set((Rect) objInvoke);
                    } else {
                        Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                        objInvoke2.getClass();
                        rect2.set((Rect) objInvoke2);
                    }
                    break;
                } catch (Exception e) {
                    if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                        throw e;
                    }
                    sjVar.getClass();
                    Log.w(sj.b, e);
                    activity.getWindowManager().getDefaultDisplay().getRectSize(rect2);
                }
                Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
                Point point2 = new Point();
                defaultDisplay2.getRealSize(point2);
                if (!activity.isInMultiWindowMode()) {
                    Resources resources2 = activity.getResources();
                    int identifier2 = resources2.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize2 = identifier2 > 0 ? resources2.getDimensionPixelSize(identifier2) : 0;
                    int i5 = rect2.bottom + dimensionPixelSize2;
                    if (i5 == point2.y) {
                        rect2.bottom = i5;
                    } else {
                        int i6 = rect2.right + dimensionPixelSize2;
                        if (i6 == point2.x) {
                            rect2.right = i6;
                        } else if (rect2.left == dimensionPixelSize2) {
                            rect2.left = 0;
                        }
                    }
                }
                if ((rect2.width() < point2.x || rect2.height() < point2.y) && !activity.isInMultiWindowMode()) {
                    try {
                        Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                        constructor.setAccessible(true);
                        Object objNewInstance = constructor.newInstance(null);
                        Method declaredMethod = defaultDisplay2.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(defaultDisplay2, objNewInstance);
                        Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(objNewInstance);
                        if (z0.q(obj2)) {
                            displayCutoutG = z0.g(obj2);
                        }
                    } catch (Exception e2) {
                        if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                            throw e2;
                        }
                        sjVar.getClass();
                        Log.w(sj.b, e2);
                    }
                    if (displayCutoutG != null) {
                        if (rect2.left == displayCutoutG.getSafeInsetLeft()) {
                            rect2.left = 0;
                        }
                        if (point2.x - rect2.right == displayCutoutG.getSafeInsetRight()) {
                            rect2.right = displayCutoutG.getSafeInsetRight() + rect2.right;
                        }
                        if (rect2.top == displayCutoutG.getSafeInsetTop()) {
                            rect2.top = 0;
                        }
                        if (point2.y - rect2.bottom == displayCutoutG.getSafeInsetBottom()) {
                            rect2.bottom = displayCutoutG.getSafeInsetBottom() + rect2.bottom;
                        }
                    }
                    break;
                }
                return rect2;
            default:
                Configuration configuration2 = activity.getResources().getConfiguration();
                try {
                    Field declaredField3 = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField3.setAccessible(true);
                    Object obj3 = declaredField3.get(configuration2);
                    Object objInvoke3 = obj3.getClass().getDeclaredMethod("getBounds", null).invoke(obj3, null);
                    objInvoke3.getClass();
                    return new Rect((Rect) objInvoke3);
                } catch (Exception e3) {
                    if (!(e3 instanceof NoSuchFieldException) && !(e3 instanceof NoSuchMethodException) && !(e3 instanceof IllegalAccessException) && !(e3 instanceof InvocationTargetException)) {
                        throw e3;
                    }
                    sjVar.getClass();
                    Log.w(sj.b, e3);
                    return v.a(activity);
                }
        }
    }

    @Override // defpackage.el
    public m40 b() {
        return H;
    }

    @Override // defpackage.d72
    public boolean c(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.el
    public long d() {
        return 9205357640488583168L;
    }

    @Override // defpackage.da2
    public void e(ca2 ca2Var) {
        ca2Var.clear();
    }

    @Override // defpackage.n40
    public float f(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.da2
    public boolean g(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.el
    public kw0 getLayoutDirection() {
        return G;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015a  */
    /* JADX WARN: Code duplicated, block: B:102:0x0163  */
    /* JADX WARN: Code duplicated, block: B:105:0x018f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0194  */
    /* JADX WARN: Code duplicated, block: B:108:0x0197 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0199  */
    /* JADX WARN: Code duplicated, block: B:110:0x019c  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00de  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x010b  */
    /* JADX WARN: Code duplicated, block: B:86:0x010e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0110  */
    /* JADX WARN: Code duplicated, block: B:88:0x0113 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0115  */
    /* JADX WARN: Code duplicated, block: B:90:0x0118  */
    /* JADX WARN: Code duplicated, block: B:93:0x0122  */
    /* JADX WARN: Code duplicated, block: B:94:0x0133  */
    /* JADX WARN: Code duplicated, block: B:97:0x0150  */
    /* JADX WARN: Code duplicated, block: B:99:0x0158  */
    public void h(final boolean z2, final boolean z3, final ur0 ur0Var, u71 u71Var, final jd2 jd2Var, final u32 u32Var, float f2, float f3, ak0 ak0Var, final int i2, final int i3) {
        u71 u71Var2;
        int i4;
        int i5;
        int i6;
        float f4;
        float f5;
        boolean z4;
        final u71 u71Var3;
        final float f6;
        final float f7;
        lr1 lr1VarR;
        boolean zBooleanValue;
        long j2;
        g82 g82VarQ;
        boolean z5;
        p82 p82VarT;
        g82 g82VarQ2;
        p82 p82VarT2;
        long j3;
        float f8;
        ak0Var.X(1035477640);
        int i7 = (ak0Var.g(z2) ? 4 : 2) | i2 | (ak0Var.g(z3) ? 32 : 16) | (ak0Var.f(ur0Var) ? 256 : 128);
        int i8 = i3 & 8;
        if (i8 == 0) {
            if ((i2 & 3072) == 0) {
                u71Var2 = u71Var;
                i7 |= ak0Var.f(u71Var2) ? 2048 : 1024;
            }
            if (ak0Var.f(jd2Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            int i9 = i7 | i4;
            if (ak0Var.f(u32Var)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i6 = i9 | i5;
            if ((1572864 & i2) == 0) {
                if ((i3 & 64) == 0) {
                    f4 = f2;
                    int i10 = ak0Var.c(f4) ? 1048576 : 524288;
                    i6 |= i10;
                } else {
                    f4 = f2;
                }
                i6 |= i10;
            } else {
                f4 = f2;
            }
            if ((12582912 & i2) == 0) {
                if ((i3 & 128) == 0) {
                    f5 = f3;
                    int i11 = ak0Var.c(f5) ? 8388608 : 4194304;
                    i6 |= i11;
                } else {
                    f5 = f3;
                }
                i6 |= i11;
            } else {
                f5 = f3;
            }
            if ((38347923 & i6) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ak0Var.O(i6 & 1, z4)) {
                ak0Var.T();
                if ((i2 & 1) != 0 || ak0Var.y()) {
                    if (i8 != 0) {
                        u71Var3 = r71.a;
                    } else {
                        u71Var3 = u71Var2;
                    }
                    if ((i3 & 64) != 0) {
                        i6 &= -3670017;
                        f6 = 2.0f;
                    } else {
                        f6 = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i6 &= -29360129;
                        f5 = 1.0f;
                    }
                } else {
                    ak0Var.R();
                    if ((i3 & 64) != 0) {
                        i6 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        i6 &= -29360129;
                    }
                    u71Var3 = u71Var2;
                    f6 = f4;
                }
                ak0Var.q();
                zBooleanValue = ((Boolean) mx.r(ur0Var, ak0Var, (i6 >> 6) & 14).getValue()).booleanValue();
                if (!z2) {
                    j2 = jd2Var.n;
                } else if (z3) {
                    j2 = jd2Var.o;
                } else if (zBooleanValue) {
                    j2 = jd2Var.l;
                } else {
                    j2 = jd2Var.m;
                }
                h81 h81Var = h81.h;
                g82VarQ = rw.Q(h81Var, ak0Var);
                if (z2) {
                    ak0Var.W(-1674507999);
                    p82VarT = c52.a(j2, g82VarQ, ak0Var);
                    z5 = false;
                    ak0Var.p(false);
                } else {
                    z5 = false;
                    ak0Var.W(-1674427244);
                    p82VarT = y12.t(new dr(j2), ak0Var);
                    ak0Var.p(false);
                }
                g82VarQ2 = rw.Q(h81.f, ak0Var);
                if (z2) {
                    ak0Var.W(-1674245832);
                    if (zBooleanValue) {
                        f8 = f6;
                    } else {
                        f8 = f5;
                    }
                    p82VarT2 = ka.a(f8, g82VarQ2, ak0Var);
                    ak0Var.p(z5);
                } else {
                    ak0Var.W(-1674063769);
                    p82VarT2 = y12.t(new w60(f5), ak0Var);
                    ak0Var.p(z5);
                }
                da1 da1VarT = y12.t(sv0.E(((w60) p82VarT2.getValue()).e, ((dr) p82VarT.getValue()).a), ak0Var);
                if (!z2) {
                    j3 = jd2Var.g;
                } else if (z3) {
                    j3 = jd2Var.h;
                } else if (zBooleanValue != 0) {
                    j3 = jd2Var.e;
                } else {
                    j3 = jd2Var.f;
                }
                p82 p82VarA = c52.a(j3, rw.Q(h81Var, ak0Var), ak0Var);
                oj ojVar = (oj) da1VarT.getValue();
                xj.a(ir2.m(u71Var3.c(new nj(ojVar.a, ojVar.b, u32Var)), new kc1(15, u32Var, new kd2(new ay0(0, 3, p82.class, p82VarA, "value", "getValue()Ljava/lang/Object;")))), ak0Var, 0);
            } else {
                ak0Var.R();
                u71Var3 = u71Var2;
                f6 = f4;
            }
            f7 = f5;
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new ij0() { // from class: ji1
                    @Override // defpackage.ij0
                    public final Object g(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        this.e.h(z2, z3, ur0Var, u71Var3, jd2Var, u32Var, f6, f7, (ak0) obj, ei1.P(i2 | 1), i3);
                        return ll2.a;
                    }
                };
            }
        }
        i7 |= 3072;
        u71Var2 = u71Var;
        if (ak0Var.f(jd2Var)) {
            i4 = 16384;
        } else {
            i4 = 8192;
        }
        int i12 = i7 | i4;
        if (ak0Var.f(u32Var)) {
            i5 = 131072;
        } else {
            i5 = 65536;
        }
        i6 = i12 | i5;
        if ((1572864 & i2) == 0) {
            if ((i3 & 64) == 0) {
                f4 = f2;
                if (ak0Var.c(f4)) {
                }
                i6 |= i10;
            } else {
                f4 = f2;
            }
            i6 |= i10;
        } else {
            f4 = f2;
        }
        if ((12582912 & i2) == 0) {
            if ((i3 & 128) == 0) {
                f5 = f3;
                if (ak0Var.c(f5)) {
                }
                i6 |= i11;
            } else {
                f5 = f3;
            }
            i6 |= i11;
        } else {
            f5 = f3;
        }
        if ((38347923 & i6) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (ak0Var.O(i6 & 1, z4)) {
            ak0Var.T();
            if ((i2 & 1) != 0) {
                if (i8 != 0) {
                    u71Var3 = r71.a;
                } else {
                    u71Var3 = u71Var2;
                }
                if ((i3 & 64) != 0) {
                    i6 &= -3670017;
                    f6 = 2.0f;
                } else {
                    f6 = f4;
                }
                if ((i3 & 128) != 0) {
                    i6 &= -29360129;
                    f5 = 1.0f;
                }
            } else {
                if (i8 != 0) {
                    u71Var3 = r71.a;
                } else {
                    u71Var3 = u71Var2;
                }
                if ((i3 & 64) != 0) {
                    i6 &= -3670017;
                    f6 = 2.0f;
                } else {
                    f6 = f4;
                }
                if ((i3 & 128) != 0) {
                    i6 &= -29360129;
                    f5 = 1.0f;
                }
            }
            ak0Var.q();
            zBooleanValue = ((Boolean) mx.r(ur0Var, ak0Var, (i6 >> 6) & 14).getValue()).booleanValue();
            if (!z2) {
                j2 = jd2Var.n;
            } else if (z3) {
                j2 = jd2Var.o;
            } else if (zBooleanValue) {
                j2 = jd2Var.l;
            } else {
                j2 = jd2Var.m;
            }
            h81 h81Var2 = h81.h;
            g82VarQ = rw.Q(h81Var2, ak0Var);
            if (z2) {
                ak0Var.W(-1674507999);
                p82VarT = c52.a(j2, g82VarQ, ak0Var);
                z5 = false;
                ak0Var.p(false);
            } else {
                z5 = false;
                ak0Var.W(-1674427244);
                p82VarT = y12.t(new dr(j2), ak0Var);
                ak0Var.p(false);
            }
            g82VarQ2 = rw.Q(h81.f, ak0Var);
            if (z2) {
                ak0Var.W(-1674245832);
                if (zBooleanValue) {
                    f8 = f6;
                } else {
                    f8 = f5;
                }
                p82VarT2 = ka.a(f8, g82VarQ2, ak0Var);
                ak0Var.p(z5);
            } else {
                ak0Var.W(-1674063769);
                p82VarT2 = y12.t(new w60(f5), ak0Var);
                ak0Var.p(z5);
            }
            da1 da1VarT2 = y12.t(sv0.E(((w60) p82VarT2.getValue()).e, ((dr) p82VarT.getValue()).a), ak0Var);
            if (!z2) {
                j3 = jd2Var.g;
            } else if (z3) {
                j3 = jd2Var.h;
            } else if (zBooleanValue != 0) {
                j3 = jd2Var.e;
            } else {
                j3 = jd2Var.f;
            }
            p82 p82VarA2 = c52.a(j3, rw.Q(h81Var2, ak0Var), ak0Var);
            oj ojVar2 = (oj) da1VarT2.getValue();
            xj.a(ir2.m(u71Var3.c(new nj(ojVar2.a, ojVar2.b, u32Var)), new kc1(15, u32Var, new kd2(new ay0(0, 3, p82.class, p82VarA2, "value", "getValue()Ljava/lang/Object;")))), ak0Var, 0);
        } else {
            ak0Var.R();
            u71Var3 = u71Var2;
            f6 = f4;
        }
        f7 = f5;
        lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: ji1
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.e.h(z2, z3, ur0Var, u71Var3, jd2Var, u32Var, f6, f7, (ak0) obj, ei1.P(i2 | 1), i3);
                    return ll2.a;
                }
            };
        }
    }

    public void i(final String str, final ij0 ij0Var, final boolean z2, final boolean z3, final io2 io2Var, final ur0 ur0Var, final boolean z4, final ij0 ij0Var2, final ij0 ij0Var3, final ij0 ij0Var4, final ij0 ij0Var5, final jd2 jd2Var, gj1 gj1Var, final gt gtVar, ak0 ak0Var, final int i2) {
        int i3;
        boolean z5;
        boolean z6;
        final gj1 gj1Var2;
        gj1 kj1Var;
        int i4;
        gt gtVar2;
        ak0Var.X(-1732281618);
        if ((i2 & 6) == 0) {
            i3 = (ak0Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ak0Var.h(ij0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z5 = z2;
            i3 |= ak0Var.g(z5) ? 256 : 128;
        } else {
            z5 = z2;
        }
        if ((i2 & 3072) == 0) {
            z6 = z3;
            i3 |= ak0Var.g(z6) ? 2048 : 1024;
        } else {
            z6 = z3;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ak0Var.f(io2Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= ak0Var.f(ur0Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= ak0Var.g(z4) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= ak0Var.h(ij0Var2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= ak0Var.h(ij0Var3) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= ak0Var.h(null) ? 536870912 : 268435456;
        }
        int i5 = 14155776 | (ak0Var.h(ij0Var4) ? 4 : 2) | (ak0Var.h(null) ? 32 : 16) | (ak0Var.h(null) ? 256 : 128) | (ak0Var.h(ij0Var5) ? 2048 : 1024) | (ak0Var.f(jd2Var) ? 16384 : 8192) | 65536;
        if (ak0Var.O(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 4793491) == 4793490) ? false : true)) {
            ak0Var.T();
            if ((i2 & 1) == 0 || ak0Var.y()) {
                kj1Var = new kj1(16.0f, 16.0f, 16.0f, 16.0f);
                i4 = i5 & (-458753);
            } else {
                ak0Var.R();
                i4 = i5 & (-458753);
                kj1Var = gj1Var;
            }
            ak0Var.q();
            int i6 = i4;
            boolean z7 = ((i3 & 14) == 4) | ((i3 & 57344) == 16384);
            Object objL = ak0Var.L();
            if (z7 || objL == cv.a) {
                objL = io2Var.a(new yb(str));
                ak0Var.g0(objL);
            }
            String str2 = ((bi2) objL).a.f;
            xd2 xd2Var = new xd2();
            int i7 = 3;
            if (ij0Var2 == null) {
                ak0Var.W(1927058812);
                ak0Var.p(false);
                gtVar2 = null;
            } else {
                ak0Var.W(1927058813);
                gt gtVarC = vs0.C(-1459717586, new v10(i7, ij0Var2), ak0Var);
                ak0Var.p(false);
                gtVar2 = gtVarC;
            }
            int i8 = i3 >> 9;
            int i9 = i6 << 21;
            j12.a(str2, ij0Var, xd2Var, gtVar2, ij0Var3, ij0Var4, ij0Var5, z6, z5, z4, ur0Var, kj1Var, jd2Var, gtVar, ak0Var, ((i3 << 3) & 896) | 6 | (i8 & 458752) | (i8 & 3670016) | (i9 & 29360128) | (i9 & 234881024) | (i9 & 1879048192), (i3 & 896) | ((i6 >> 9) & 14) | ((i3 >> 6) & 112) | (i8 & 7168) | ((i3 >> 3) & 57344) | ((i6 << 6) & 3670016) | 12582912);
            gj1Var2 = kj1Var;
        } else {
            ak0Var.R();
            gj1Var2 = gj1Var;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: ki1
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(i2 | 1);
                    this.e.i(str, ij0Var, z2, z3, io2Var, ur0Var, z4, ij0Var2, ij0Var3, ij0Var4, ij0Var5, jd2Var, gj1Var2, gtVar, (ak0) obj, iP);
                    return ll2.a;
                }
            };
        }
    }

    public void j(boolean z2, u71 u71Var, ak0 ak0Var, int i2) {
        ak0 ak0Var2;
        ak0Var.X(-1732824199);
        int i3 = (ak0Var.g(z2) ? 4 : 2) | i2 | 48;
        if (ak0Var.O(i3 & 1, (i3 & 19) != 18)) {
            ak0Var2 = ak0Var;
            fo0.a(qx.z(), null, qx.X(z2 ? 180.0f : 0.0f), 0L, ak0Var2, 48, 8);
            u71Var = r71.a;
        } else {
            ak0Var2 = ak0Var;
            ak0Var2.R();
        }
        u71 u71Var2 = u71Var;
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new qc0(this, z2, u71Var2, i2, 0);
        }
    }

    public String toString() {
        switch (this.e) {
            case 25:
                return "NeverEqualPolicy";
            default:
                return super.toString();
        }
    }
}
