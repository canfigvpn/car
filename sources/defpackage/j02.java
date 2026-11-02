package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Typeface;
import android.view.View;
import ir.alirezaivaz.mygarage.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j02 {
    public static final float a = 64.0f;

    public j02() {
        new ConcurrentHashMap();
    }

    public static final void a(u52 u52Var, u71 u71Var, ak0 ak0Var, int i) {
        Object obj;
        Object obj2 = zt.a;
        ak0Var.X(-977568115);
        int i2 = (i & 6) == 0 ? (ak0Var.f(u52Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= ak0Var.f(u71Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ak0Var.h(obj2) ? 256 : 128;
        }
        if (ak0Var.O(i2 & 1, (i2 & 147) != 146)) {
            String strL = r02.l(R.string.m3c_snackbar_pane_title, ak0Var);
            Object objL = ak0Var.L();
            if (objL == cv.a) {
                obj = objL;
                bd0 bd0Var = new bd0();
                bd0Var.a = new Object();
                bd0Var.b = new ArrayList();
                ak0Var.g0(bd0Var);
                obj = bd0Var;
            }
            obj = objL;
            bd0 bd0Var2 = (bd0) obj;
            Object obj3 = bd0Var2.a;
            ArrayList arrayList = bd0Var2.b;
            if (ws0.j(u52Var, obj3)) {
                ak0Var.W(1443908949);
                ak0Var.p(false);
            } else {
                ak0Var.W(1154891761);
                bd0Var2.a = u52Var;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add((u52) ((ad0) arrayList.get(i3)).a);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(u52Var)) {
                    arrayList3.add(u52Var);
                }
                arrayList.clear();
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Object obj4 = arrayList3.get(i4);
                    if (obj4 != null) {
                        arrayList4.add(obj4);
                    }
                }
                int size3 = arrayList4.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    u52 u52Var2 = (u52) arrayList4.get(i5);
                    arrayList.add(new ad0(u52Var2, vs0.C(-1952400805, new r52(u52Var2, u52Var, bd0Var2, strL), ak0Var)));
                }
                ak0Var.p(false);
            }
            w61 w61VarC = xj.c(q90.f, false);
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71Var);
            wu.c.getClass();
            ti0 ti0Var = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(ti0Var);
            } else {
                ak0Var.j0();
            }
            p12.l(vu.f, ak0Var, w61VarC);
            p12.l(vu.e, ak0Var, sl1VarL);
            ra raVar = vu.g;
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX))) {
                k3.p(iX, ak0Var, iX, raVar);
            }
            p12.l(vu.d, ak0Var, u71VarB);
            lr1 lr1VarX = ak0Var.x();
            if (lr1VarX == null) {
                fu1.h("no recompose scope found");
                return;
            }
            lr1VarX.b |= 1;
            bd0Var2.c = lr1VarX;
            ak0Var.W(-1888182177);
            int size4 = arrayList.size();
            for (int i6 = 0; i6 < size4; i6++) {
                ad0 ad0Var = (ad0) arrayList.get(i6);
                u52 u52Var3 = (u52) ad0Var.a;
                gt gtVar = ad0Var.b;
                ak0Var.S(u52Var3, 1325010085, null, 0);
                gtVar.d(vs0.C(-1893791890, new s52(u52Var3, 0), ak0Var), ak0Var, 6);
                ak0Var.p(false);
            }
            ak0Var.p(false);
            ak0Var.p(true);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new et(u52Var, u71Var, i);
        }
    }

    public static final void b(x52 x52Var, u71 u71Var, jj0 jj0Var, ak0 ak0Var, int i) {
        u71 u71Var2;
        ak0Var.X(-1077081618);
        int i2 = i | 432;
        if (ak0Var.O(i2 & 1, (i2 & 147) != 146)) {
            jj0Var = zt.a;
            u52 u52Var = (u52) x52Var.b.getValue();
            y0 y0Var = (y0) ak0Var.j(yv.a);
            boolean zF = ak0Var.f(u52Var) | ak0Var.h(y0Var);
            Object objL = ak0Var.L();
            if (zF || objL == cv.a) {
                objL = new cv1(3, null, u52Var, y0Var);
                ak0Var.g0(objL);
            }
            s5.o((ij0) objL, ak0Var, u52Var);
            u52 u52Var2 = (u52) x52Var.b.getValue();
            r71 r71Var = r71.a;
            a(u52Var2, r71Var, ak0Var, 432);
            u71Var2 = r71Var;
        } else {
            ak0Var.R();
            u71Var2 = u71Var;
        }
        jj0 jj0Var2 = jj0Var;
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new p1(x52Var, u71Var2, jj0Var2, i, 14);
        }
    }

    public static final long c(int i, int i2) {
        if (i < 0 || i2 < 0) {
            wp0.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = of2.c;
        return j;
    }

    public static final s12 d(s12 s12Var, iq1 iq1Var) {
        s12Var.getClass();
        iq1Var.getClass();
        if (!ws0.j(s12Var.c(), w12.b)) {
            return s12Var.f() ? d(s12Var.j(0), iq1Var) : s12Var;
        }
        ei1.s(s12Var);
        return s12Var;
    }

    public static final int e(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static final long f(int i, long j) {
        int i2 = of2.c;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : c(i4, i);
    }

    public static final z82 g(t22 t22Var, ak0 ak0Var) {
        t22Var.getClass();
        boolean zE = vv.E(ak0Var);
        int iOrdinal = t22Var.ordinal();
        if (iOrdinal == 0) {
            ak0Var.W(-1408976338);
            ak0Var.p(false);
            return zE ? new z82(fr.u0, fr.v0) : new z82(fr.s0, fr.t0);
        }
        if (iOrdinal == 1) {
            ak0Var.W(-1408969618);
            ak0Var.p(false);
            return zE ? new z82(fr.y0, fr.z0) : new z82(fr.w0, fr.x0);
        }
        if (iOrdinal == 2) {
            ak0Var.W(-1408963110);
            ak0Var.p(false);
            return zE ? new z82(fr.C0, fr.D0) : new z82(fr.A0, fr.B0);
        }
        if (iOrdinal != 3 && iOrdinal != 4) {
            ak0Var.W(-1408977178);
            ak0Var.p(false);
            qj.p();
            return null;
        }
        ak0Var.W(-1408955515);
        a90 a90Var = lr.a;
        z82 z82Var = new z82(((jr) ak0Var.j(a90Var)).r, ((jr) ak0Var.j(a90Var)).s);
        ak0Var.p(false);
        return z82Var;
    }

    public static final void l(nl0 nl0Var, im2 im2Var) {
        ArrayList arrayList = im2Var.n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            km2 km2Var = (km2) arrayList.get(i);
            if (km2Var instanceof mm2) {
                rk1 rk1Var = new rk1();
                mm2 mm2Var = (mm2) km2Var;
                rk1Var.d = mm2Var.f;
                rk1Var.n = true;
                rk1Var.c();
                rk1Var.s.a.setFillType(mm2Var.g == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                rk1Var.c();
                rk1Var.c();
                rk1Var.b = mm2Var.h;
                rk1Var.c();
                rk1Var.c = mm2Var.i;
                rk1Var.c();
                rk1Var.g = mm2Var.j;
                rk1Var.c();
                rk1Var.e = mm2Var.k;
                rk1Var.c();
                rk1Var.f = mm2Var.l;
                rk1Var.o = true;
                rk1Var.c();
                rk1Var.h = mm2Var.m;
                rk1Var.o = true;
                rk1Var.c();
                rk1Var.i = mm2Var.n;
                rk1Var.o = true;
                rk1Var.c();
                rk1Var.j = mm2Var.o;
                rk1Var.o = true;
                rk1Var.c();
                rk1Var.k = mm2Var.p;
                rk1Var.p = true;
                rk1Var.c();
                rk1Var.l = mm2Var.q;
                rk1Var.p = true;
                rk1Var.c();
                rk1Var.m = mm2Var.r;
                rk1Var.p = true;
                rk1Var.c();
                nl0Var.e(i, rk1Var);
            } else if (km2Var instanceof im2) {
                nl0 nl0Var2 = new nl0();
                im2 im2Var2 = (im2) km2Var;
                nl0Var2.k = im2Var2.e;
                nl0Var2.c();
                nl0Var2.l = im2Var2.f;
                nl0Var2.s = true;
                nl0Var2.c();
                nl0Var2.o = im2Var2.i;
                nl0Var2.s = true;
                nl0Var2.c();
                nl0Var2.p = im2Var2.j;
                nl0Var2.s = true;
                nl0Var2.c();
                nl0Var2.q = im2Var2.k;
                nl0Var2.s = true;
                nl0Var2.c();
                nl0Var2.r = im2Var2.l;
                nl0Var2.s = true;
                nl0Var2.c();
                nl0Var2.m = im2Var2.g;
                nl0Var2.s = true;
                nl0Var2.c();
                nl0Var2.n = im2Var2.h;
                nl0Var2.s = true;
                nl0Var2.c();
                nl0Var2.f = im2Var2.m;
                nl0Var2.g = true;
                nl0Var2.c();
                l(nl0Var2, im2Var2);
                nl0Var.e(i, nl0Var2);
            }
        }
    }

    public static oh0 m(oh0[] oh0VarArr, int i) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        oh0 oh0Var = null;
        int i3 = Integer.MAX_VALUE;
        for (oh0 oh0Var2 : oh0VarArr) {
            int iAbs = (Math.abs(oh0Var2.c - i2) * 2) + (oh0Var2.d == z ? 0 : 1);
            if (oh0Var == null || i3 > iAbs) {
                oh0Var = oh0Var2;
                i3 = iAbs;
            }
        }
        return oh0Var;
    }

    public static final tw1 n(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            tw1 tw1Var = tag instanceof tw1 ? (tw1) tag : null;
            if (tw1Var != null) {
                return tw1Var;
            }
            Object objL = y12.l(view);
            view = objL instanceof View ? (View) objL : null;
        }
        return null;
    }

    public static final Object o(i02 i02Var, y02 y02Var) {
        Object objG = i02Var.e.g(y02Var);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static final String p(t22 t22Var, ak0 ak0Var) {
        int i;
        t22Var.getClass();
        int iOrdinal = t22Var.ordinal();
        if (iOrdinal == 0) {
            i = R.string.status_overdue;
        } else if (iOrdinal == 1) {
            i = R.string.status_due_soon;
        } else if (iOrdinal == 2) {
            i = R.string.status_ok;
        } else if (iOrdinal == 3) {
            i = R.string.status_never_logged;
        } else {
            if (iOrdinal != 4) {
                qj.p();
                return null;
            }
            i = R.string.status_no_interval;
        }
        return r(i, ak0Var);
    }

    public static final lm2 q(jo0 jo0Var, ak0 ak0Var) {
        m40 m40Var = (m40) ak0Var.j(yv.h);
        boolean zE = ak0Var.e((((long) Float.floatToRawIntBits(m40Var.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(jo0Var.j)) << 32));
        Object objL = ak0Var.L();
        if (zE || objL == cv.a) {
            nl0 nl0Var = new nl0();
            l(nl0Var, jo0Var.f);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(m40Var.x(jo0Var.b))) << 32) | (((long) Float.floatToRawIntBits(m40Var.x(jo0Var.c))) & 4294967295L);
            float fIntBitsToFloat = jo0Var.d;
            float fIntBitsToFloat2 = jo0Var.e;
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            }
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
            lm2 lm2Var = new lm2(nl0Var);
            String str = jo0Var.a;
            long j = jo0Var.g;
            yi yiVar = j != 16 ? new yi(jo0Var.h, j) : null;
            boolean z = jo0Var.i;
            lm2Var.e.setValue(new d52(jFloatToRawIntBits));
            lm2Var.f.setValue(Boolean.valueOf(z));
            fm2 fm2Var = lm2Var.g;
            fm2Var.g.setValue(yiVar);
            fm2Var.i.setValue(new d52(jFloatToRawIntBits2));
            fm2Var.c = str;
            ak0Var.g0(lm2Var);
            objL = lm2Var;
        }
        return (lm2) objL;
    }

    public static final String r(int i, ak0 ak0Var) {
        return ((Resources) ak0Var.j(u5.c)).getString(i);
    }

    public static final String s(int i, Object[] objArr, ak0 ak0Var) {
        return ((Resources) ak0Var.j(u5.c)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public static final gr2 t(yt0 yt0Var, s12 s12Var) {
        s12Var.getClass();
        y12 y12VarC = s12Var.c();
        if (y12VarC instanceof eo1) {
            return gr2.POLY_OBJ;
        }
        if (ws0.j(y12VarC, q92.c)) {
            return gr2.LIST;
        }
        if (!ws0.j(y12VarC, q92.d)) {
            return gr2.OBJ;
        }
        s12 s12VarD = d(s12Var.j(0), yt0Var.b);
        y12 y12VarC2 = s12VarD.c();
        if ((y12VarC2 instanceof xp1) || ws0.j(y12VarC2, x12.b)) {
            return gr2.MAP;
        }
        throw new gu0("Value of type '" + s12VarD.b() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + s12VarD.c() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public abstract Typeface h(Context context, bh0 bh0Var, Resources resources, int i);

    public abstract Typeface i(Context context, oh0[] oh0VarArr, int i);

    public Typeface j(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface k(Context context, Resources resources, int i, String str, int i2) {
        File fileK = n02.k(context);
        if (fileK == null) {
            return null;
        }
        try {
            if (n02.g(fileK, resources, i)) {
                return Typeface.createFromFile(fileK.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileK.delete();
        }
    }
}
