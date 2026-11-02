package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p12 {
    public static final float a = 0.38f;

    public static final int a(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static fq2 b(ak0 ak0Var) {
        View view = (View) ak0Var.j(u5.f);
        fq2 fq2VarE = e(view);
        boolean zH = ak0Var.h(fq2VarE) | ak0Var.h(view);
        Object objL = ak0Var.L();
        if (zH || objL == cv.a) {
            objL = new kc1(25, fq2VarE, view);
            ak0Var.g0(objL);
        }
        s5.e(fq2VarE, (ej0) objL, ak0Var);
        return fq2VarE;
    }

    public static final long c() {
        return Thread.currentThread().getId();
    }

    public static final yr1 d(im1 im1Var, int i, bi2 bi2Var, hf2 hf2Var, boolean z, int i2) {
        yr1 yr1VarC = hf2Var != null ? hf2Var.c(bi2Var.b.r(i)) : yr1.e;
        int iO = im1Var.O(2.0f);
        float f = yr1VarC.a;
        return new yr1(z ? (i2 - f) - iO : f, yr1VarC.b, z ? i2 - f : iO + f, yr1VarC.d);
    }

    public static fq2 e(View view) {
        fq2 fq2Var;
        WeakHashMap weakHashMap = fq2.v;
        synchronized (weakHashMap) {
            try {
                Object fq2Var2 = weakHashMap.get(view);
                if (fq2Var2 == null) {
                    fq2Var2 = new fq2(view);
                    weakHashMap.put(view, fq2Var2);
                }
                fq2Var = (fq2) fq2Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fq2Var;
    }

    public static final void f(ak0 ak0Var, Integer num, ij0 ij0Var) {
        if (ak0Var.S) {
            ak0Var.b(ij0Var, num);
        }
    }

    public static final boolean g(float f, float f2, d8 d8Var) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        d8 d8VarA = f8.a();
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            f8.b("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = d8VarA.b;
        if (rectF == null) {
            rectF = new RectF();
            d8VarA.b = rectF;
        }
        rectF.set(f3, f4, f5, f6);
        Path path = d8VarA.a;
        RectF rectF2 = d8VarA.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        d8 d8VarA2 = f8.a();
        d8VarA2.d(d8Var, d8VarA, 1);
        boolean zIsEmpty = d8VarA2.a.isEmpty();
        d8VarA2.e();
        d8VarA.e();
        return !zIsEmpty;
    }

    public static final boolean h(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static n12 i(ij0 ij0Var) {
        n12 n12Var = new n12();
        n12Var.g = ex.m(n12Var, n12Var, ij0Var);
        return n12Var;
    }

    public static rb2 j(vv1 vv1Var, String str) {
        long j;
        Map mapB;
        z22 z22Var;
        vv1Var.getClass();
        xv1 xv1VarC = vv1Var.C("PRAGMA table_info(`" + str + "`)");
        try {
            long j2 = 0;
            if (xv1VarC.y()) {
                int iS = qx.s(xv1VarC, "name");
                int iS2 = qx.s(xv1VarC, "type");
                int iS3 = qx.s(xv1VarC, "notnull");
                int iS4 = qx.s(xv1VarC, "pk");
                int iS5 = qx.s(xv1VarC, "dflt_value");
                x51 x51Var = new x51();
                while (true) {
                    String strF = xv1VarC.f(iS);
                    j = j2;
                    x51Var.put(strF, new ob2(strF, xv1VarC.f(iS2), xv1VarC.getLong(iS3) != j2, (int) xv1VarC.getLong(iS4), xv1VarC.isNull(iS5) ? null : xv1VarC.f(iS5), 2));
                    if (!xv1VarC.y()) {
                        break;
                    }
                    j2 = j;
                }
                mapB = x51Var.b();
                ir2.h(xv1VarC, null);
            } else {
                mapB = db0.e;
                ir2.h(xv1VarC, null);
                j = 0;
            }
            xv1 xv1VarC2 = vv1Var.C("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int iS6 = qx.s(xv1VarC2, "id");
                int iS7 = qx.s(xv1VarC2, "seq");
                int iS8 = qx.s(xv1VarC2, "table");
                int iS9 = qx.s(xv1VarC2, "on_delete");
                int iS10 = qx.s(xv1VarC2, "on_update");
                List listJ = mx.J(xv1VarC2);
                xv1VarC2.D();
                z22 z22Var2 = new z22();
                while (xv1VarC2.y()) {
                    if (xv1VarC2.getLong(iS7) == j) {
                        int i = (int) xv1VarC2.getLong(iS6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = iS6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : listJ) {
                            int i3 = iS7;
                            List list = listJ;
                            if (((rh0) obj).e == i) {
                                arrayList3.add(obj);
                            }
                            iS7 = i3;
                            listJ = list;
                        }
                        int i4 = iS7;
                        List list2 = listJ;
                        int size = arrayList3.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj2 = arrayList3.get(i5);
                            i5++;
                            rh0 rh0Var = (rh0) obj2;
                            arrayList.add(rh0Var.g);
                            arrayList2.add(rh0Var.h);
                            arrayList3 = arrayList3;
                        }
                        z22Var2.add(new pb2(xv1VarC2.f(iS8), xv1VarC2.f(iS9), xv1VarC2.f(iS10), arrayList, arrayList2));
                        iS6 = i2;
                        iS7 = i4;
                        listJ = list2;
                    }
                }
                z22 z22VarF = n02.f(z22Var2);
                ir2.h(xv1VarC2, null);
                xv1 xv1VarC3 = vv1Var.C("PRAGMA index_list(`" + str + "`)");
                try {
                    int iS11 = qx.s(xv1VarC3, "name");
                    int iS12 = qx.s(xv1VarC3, "origin");
                    int iS13 = qx.s(xv1VarC3, "unique");
                    if (iS11 == -1 || iS12 == -1 || iS13 == -1) {
                        ir2.h(xv1VarC3, null);
                        z22Var = null;
                    } else {
                        z22 z22Var3 = new z22();
                        while (xv1VarC3.y()) {
                            if ("c".equals(xv1VarC3.f(iS12))) {
                                qb2 qb2VarK = mx.K(vv1Var, xv1VarC3.f(iS11), xv1VarC3.getLong(iS13) == 1);
                                if (qb2VarK == null) {
                                    ir2.h(xv1VarC3, null);
                                    z22Var = null;
                                } else {
                                    z22Var3.add(qb2VarK);
                                }
                            }
                        }
                        z22 z22VarF2 = n02.f(z22Var3);
                        ir2.h(xv1VarC3, null);
                        z22Var = z22VarF2;
                    }
                    return new rb2(str, mapB, z22VarF, z22Var);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ir2.h(xv1VarC3, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    ir2.h(xv1VarC2, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                ir2.h(xv1VarC, th5);
                throw th6;
            }
        }
    }

    public static final void k(ak0 ak0Var, ej0 ej0Var) {
        ak0Var.b(new i72(3, ej0Var), ll2.a);
    }

    public static final void l(ij0 ij0Var, ak0 ak0Var, Object obj) {
        if (ak0Var.S || !ws0.j(ak0Var.L(), obj)) {
            ak0Var.g0(obj);
            ak0Var.b(ij0Var, obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [ej0] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [t71] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [t71] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [fa1] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [fa1] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static final void m(b40 b40Var, Object obj, ej0 ej0Var) {
        he1 he1Var;
        if (!((t71) b40Var).e.r) {
            vp0.b("visitAncestors called on an unattached node");
        }
        t71 t71Var = ((t71) b40Var).e.i;
        ax0 ax0VarV = qx.V(b40Var);
        while (ax0VarV != null) {
            if ((ax0VarV.I.f.h & 262144) != 0) {
                while (t71Var != null) {
                    if ((t71Var.g & 262144) != 0) {
                        ?? P = t71Var;
                        ?? fa1Var = 0;
                        while (P != 0) {
                            if (P instanceof si2) {
                                si2 si2Var = (si2) P;
                                if (!(obj.equals(si2Var.p()) ? ((Boolean) ej0Var.h(si2Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((P.g & 262144) != 0 && (P instanceof c40)) {
                                t71 t71Var2 = ((c40) P).t;
                                int i = 0;
                                while (t71Var2 != null) {
                                    if ((t71Var2.g & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            P = P;
                                            fa1Var = fa1Var;
                                            fa1Var = fa1Var;
                                            P = t71Var2;
                                        } else {
                                            if (fa1Var == 0) {
                                                fa1Var = new fa1(new t71[16]);
                                            }
                                            if (P != 0) {
                                                fa1Var.b(P);
                                                P = 0;
                                            }
                                            fa1Var.b(t71Var2);
                                        }
                                    } else {
                                        P = P;
                                        fa1Var = fa1Var;
                                    }
                                    t71Var2 = t71Var2.j;
                                    P = P;
                                    fa1Var = fa1Var;
                                }
                                if (i == 1) {
                                    P = P;
                                    fa1Var = fa1Var;
                                } else {
                                    P = P;
                                    fa1Var = fa1Var;
                                }
                            }
                            P = qx.P(fa1Var);
                        }
                    }
                    t71Var = t71Var.i;
                }
            }
            ax0VarV = ax0VarV.u();
            t71Var = (ax0VarV == null || (he1Var = ax0VarV.I) == null) ? null : he1Var.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [b40, java.lang.Object, si2] */
    /* JADX WARN: Type inference failed for: r11v0, types: [ej0] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [t71] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [t71] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [fa1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [fa1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final void n(si2 si2Var, ej0 ej0Var) {
        he1 he1Var;
        t71 t71Var = (t71) si2Var;
        if (!t71Var.e.r) {
            vp0.b("visitAncestors called on an unattached node");
        }
        t71 t71Var2 = t71Var.e.i;
        ax0 ax0VarV = qx.V(si2Var);
        while (ax0VarV != null) {
            if ((ax0VarV.I.f.h & 262144) != 0) {
                while (t71Var2 != null) {
                    if ((t71Var2.g & 262144) != 0) {
                        ?? P = t71Var2;
                        ?? fa1Var = 0;
                        while (P != 0) {
                            boolean zBooleanValue = true;
                            if (P instanceof si2) {
                                si2 si2Var2 = (si2) P;
                                if (ws0.j(si2Var.p(), si2Var2.p()) && si2Var.getClass() == si2Var2.getClass()) {
                                    zBooleanValue = ((Boolean) ej0Var.h(si2Var2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else if ((P.g & 262144) != 0 && (P instanceof c40)) {
                                t71 t71Var3 = ((c40) P).t;
                                int i = 0;
                                while (t71Var3 != null) {
                                    if ((t71Var3.g & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            P = P;
                                            fa1Var = fa1Var;
                                            fa1Var = fa1Var;
                                            P = t71Var3;
                                        } else {
                                            if (fa1Var == 0) {
                                                fa1Var = new fa1(new t71[16]);
                                            }
                                            if (P != 0) {
                                                fa1Var.b(P);
                                                P = 0;
                                            }
                                            fa1Var.b(t71Var3);
                                        }
                                    } else {
                                        P = P;
                                        fa1Var = fa1Var;
                                    }
                                    t71Var3 = t71Var3.j;
                                    P = P;
                                    fa1Var = fa1Var;
                                }
                                if (i == 1) {
                                    P = P;
                                    fa1Var = fa1Var;
                                } else {
                                    P = P;
                                    fa1Var = fa1Var;
                                }
                            }
                            P = qx.P(fa1Var);
                        }
                    }
                    t71Var2 = t71Var2.i;
                }
            }
            ax0VarV = ax0VarV.u();
            t71Var2 = (ax0VarV == null || (he1Var = ax0VarV.I) == null) ? null : he1Var.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [ej0] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [t71] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [t71] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [fa1] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [fa1] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public static final void o(t71 t71Var, String str, ej0 ej0Var) {
        if (!t71Var.e.r) {
            vp0.b("visitSubtreeIf called on an unattached node");
        }
        fa1 fa1Var = new fa1(new t71[16]);
        t71 t71Var2 = t71Var.e;
        t71 t71Var3 = t71Var2.j;
        if (t71Var3 == null) {
            qx.j(fa1Var, t71Var2);
        } else {
            fa1Var.b(t71Var3);
        }
        while (true) {
            int i = fa1Var.g;
            if (i == 0) {
                return;
            }
            t71 t71Var4 = (t71) fa1Var.k(i - 1);
            if ((t71Var4.h & 262144) != 0) {
                t71 t71Var5 = t71Var4;
                while (true) {
                    if (t71Var5 != null && t71Var5.r) {
                        if ((t71Var5.g & 262144) != 0) {
                            ?? P = t71Var5;
                            ?? fa1Var2 = 0;
                            while (P != 0) {
                                if (P instanceof si2) {
                                    si2 si2Var = (si2) P;
                                    ri2 ri2Var = str.equals(si2Var.p()) ? (ri2) ej0Var.h(si2Var) : ri2.e;
                                    if (ri2Var != ri2.g) {
                                        if (ri2Var == ri2.f) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((P.g & 262144) != 0 && (P instanceof c40)) {
                                    t71 t71Var6 = ((c40) P).t;
                                    int i2 = 0;
                                    P = P;
                                    fa1Var2 = fa1Var2;
                                    while (t71Var6 != null) {
                                        if ((t71Var6.g & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                fa1Var2 = fa1Var2;
                                                P = t71Var6;
                                            } else {
                                                if (fa1Var2 == 0) {
                                                    fa1Var2 = new fa1(new t71[16]);
                                                }
                                                if (P != 0) {
                                                    fa1Var2.b(P);
                                                    P = 0;
                                                }
                                                fa1Var2.b(t71Var6);
                                            }
                                        }
                                        t71Var6 = t71Var6.j;
                                        P = P;
                                        fa1Var2 = fa1Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                P = qx.P(fa1Var2);
                            }
                        }
                        t71Var5 = t71Var5.j;
                    }
                }
            }
            qx.j(fa1Var, t71Var4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, si2] */
    /* JADX WARN: Type inference failed for: r13v0, types: [ej0] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [t71] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [t71] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [fa1] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [fa1] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void p(si2 si2Var, ej0 ej0Var) {
        t71 t71Var = (t71) si2Var;
        if (!t71Var.e.r) {
            vp0.b("visitSubtreeIf called on an unattached node");
        }
        fa1 fa1Var = new fa1(new t71[16]);
        t71 t71Var2 = t71Var.e;
        t71 t71Var3 = t71Var2.j;
        if (t71Var3 == null) {
            qx.j(fa1Var, t71Var2);
        } else {
            fa1Var.b(t71Var3);
        }
        while (true) {
            int i = fa1Var.g;
            if (i == 0) {
                return;
            }
            t71 t71Var4 = (t71) fa1Var.k(i - 1);
            if ((t71Var4.h & 262144) != 0) {
                t71 t71Var5 = t71Var4;
                while (true) {
                    if (t71Var5 != null && t71Var5.r) {
                        if ((t71Var5.g & 262144) != 0) {
                            ?? P = t71Var5;
                            ?? fa1Var2 = 0;
                            while (P != 0) {
                                if (P instanceof si2) {
                                    si2 si2Var2 = (si2) P;
                                    ri2 ri2Var = (ws0.j(si2Var.p(), si2Var2.p()) && si2Var.getClass() == si2Var2.getClass()) ? (ri2) ej0Var.h(si2Var2) : ri2.e;
                                    if (ri2Var != ri2.g) {
                                        if (ri2Var == ri2.f) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((P.g & 262144) != 0 && (P instanceof c40)) {
                                    t71 t71Var6 = ((c40) P).t;
                                    int i2 = 0;
                                    P = P;
                                    fa1Var2 = fa1Var2;
                                    while (t71Var6 != null) {
                                        if ((t71Var6.g & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                fa1Var2 = fa1Var2;
                                                P = t71Var6;
                                            } else {
                                                if (fa1Var2 == 0) {
                                                    fa1Var2 = new fa1(new t71[16]);
                                                }
                                                if (P != 0) {
                                                    fa1Var2.b(P);
                                                    P = 0;
                                                }
                                                fa1Var2.b(t71Var6);
                                            }
                                        }
                                        t71Var6 = t71Var6.j;
                                        P = P;
                                        fa1Var2 = fa1Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                P = qx.P(fa1Var2);
                            }
                        }
                        t71Var5 = t71Var5.j;
                    }
                }
            }
            qx.j(fa1Var, t71Var4);
        }
    }

    public static dm2 q(String str, int i) {
        return new dm2(new tq0(0, 0, 0, 0), str);
    }

    public static final un2 r(aq aqVar, co2 co2Var, yn2 yn2Var, lz lzVar, ak0 ak0Var) {
        if (yn2Var == null) {
            yn2Var = co2Var instanceof zl0 ? ((zl0) co2Var).e() : y30.a;
        }
        yn2Var.getClass();
        lzVar.getClass();
        e4 e4Var = (e4) new ao2(co2Var.g(), yn2Var, lzVar).f;
        String strB = aqVar.b();
        if (strB != null) {
            return e4Var.j(aqVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        }
        qj.r("Local and anonymous classes can not be ViewModels");
        return null;
    }
}
