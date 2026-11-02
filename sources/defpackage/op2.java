package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class op2 extends xp2 {
    public static boolean m = false;
    public static Method n;
    public static Class o;
    public static Field p;
    public static Field q;
    public final WindowInsets c;
    public kq0[] d;
    public kq0 e;
    public aq2 f;
    public kq0 g;
    public int h;
    public int i;
    public int j;
    public Rect[][] k;
    public Rect[][] l;

    public op2(aq2 aq2Var, WindowInsets windowInsets) {
        super(aq2Var);
        this.e = null;
        this.k = new Rect[10][];
        this.l = new Rect[10][];
        this.c = windowInsets;
    }

    private z50 B(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.s()) {
            return z50.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        iv1 iv1VarF = ix.F(display, 0);
        iv1 iv1VarF2 = ix.F(display, 1);
        iv1 iv1VarF3 = ix.F(display, 2);
        iv1 iv1VarF4 = ix.F(display, 3);
        return z50.a(point.x, point.y, false, iv1VarF != null ? iv1VarF.b : 0, iv1VarF2 != null ? iv1VarF2.b : 0, iv1VarF3 != null ? iv1VarF3.b : 0, iv1VarF4 != null ? iv1VarF4.b : 0);
    }

    private static List<Rect> C(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[c12.n(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] D(kq0 kq0Var) {
        ArrayList arrayList = new ArrayList();
        int i = kq0Var.a;
        int i2 = kq0Var.d;
        int i3 = kq0Var.c;
        int i4 = kq0Var.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, kq0Var.a, this.i));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.j, i4));
        }
        if (i3 != 0) {
            int i5 = this.j;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.i));
        }
        if (i2 != 0) {
            int i6 = this.i;
            arrayList.add(new Rect(0, i6 - i2, this.j, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private kq0 E(int i, boolean z) {
        kq0 kq0VarA = kq0.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                kq0VarA = kq0.a(kq0VarA, F(i2, z));
            }
        }
        return kq0VarA;
    }

    private kq0 G() {
        aq2 aq2Var = this.f;
        return aq2Var != null ? aq2Var.a.k() : kq0.e;
    }

    private kq0 H(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!m) {
            J();
        }
        Method method = n;
        if (method != null && o != null && p != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) p.get(q.get(objInvoke));
                if (rect != null) {
                    return kq0.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static void J() {
        try {
            n = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            o = cls;
            p = cls.getDeclaredField("mVisibleInsets");
            q = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            p.setAccessible(true);
            q.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        m = true;
    }

    public static boolean L(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // defpackage.xp2
    public void A(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    public kq0 F(int i, boolean z) {
        kq0 kq0VarK;
        int i2;
        kq0 kq0Var = kq0.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    kq0[] kq0VarArr = this.d;
                    kq0VarK = kq0VarArr != null ? kq0VarArr[c12.n(8)] : null;
                    if (kq0VarK != null) {
                        return kq0VarK;
                    }
                    kq0 kq0VarM = m();
                    kq0 kq0VarG = G();
                    int i3 = kq0VarM.d;
                    if (i3 > kq0VarG.d) {
                        return kq0.b(0, 0, 0, i3);
                    }
                    kq0 kq0Var2 = this.g;
                    if (kq0Var2 != null && !kq0Var2.equals(kq0Var) && (i2 = this.g.d) > kq0VarG.d) {
                        return kq0.b(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return l();
                    }
                    if (i == 32) {
                        return j();
                    }
                    if (i == 64) {
                        return n();
                    }
                    if (i == 128) {
                        aq2 aq2Var = this.f;
                        w50 w50VarG = aq2Var != null ? aq2Var.a.g() : g();
                        if (w50VarG != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return kq0.b(i4 >= 28 ? v50.g(w50VarG.a) : 0, i4 >= 28 ? v50.i(w50VarG.a) : 0, i4 >= 28 ? v50.h(w50VarG.a) : 0, i4 >= 28 ? v50.f(w50VarG.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    kq0 kq0VarG2 = G();
                    kq0 kq0VarK2 = k();
                    return kq0.b(Math.max(kq0VarG2.a, kq0VarK2.a), 0, Math.max(kq0VarG2.c, kq0VarK2.c), Math.max(kq0VarG2.d, kq0VarK2.d));
                }
                if ((this.h & 2) == 0) {
                    kq0 kq0VarM2 = m();
                    aq2 aq2Var2 = this.f;
                    kq0VarK = aq2Var2 != null ? aq2Var2.a.k() : null;
                    int iMin = kq0VarM2.d;
                    if (kq0VarK != null) {
                        iMin = Math.min(iMin, kq0VarK.d);
                    }
                    return kq0.b(kq0VarM2.a, 0, kq0VarM2.c, iMin);
                }
            }
        } else {
            if (z) {
                return kq0.b(0, Math.max(G().b, m().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return kq0.b(0, m().b, 0, 0);
            }
        }
        return kq0Var;
    }

    public boolean I(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !F(i, false).equals(kq0.e);
    }

    public void K(kq0 kq0Var) {
        this.g = kq0Var;
    }

    @Override // defpackage.xp2
    public void d(View view) {
        this.j = view.getWidth();
        this.i = view.getHeight();
        kq0 kq0VarH = H(view);
        if (kq0VarH == null) {
            kq0VarH = kq0.e;
        }
        K(kq0VarH);
    }

    @Override // defpackage.xp2
    public List<Rect> e(int i) {
        return C(this.k, i);
    }

    @Override // defpackage.xp2
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        op2 op2Var = (op2) obj;
        return Objects.equals(this.g, op2Var.g) && L(this.h, op2Var.h);
    }

    @Override // defpackage.xp2
    public List<Rect> f(int i) {
        return C(this.l, i);
    }

    @Override // defpackage.xp2
    public kq0 h(int i) {
        return E(i, false);
    }

    @Override // defpackage.xp2
    public kq0 i(int i) {
        return E(i, true);
    }

    @Override // defpackage.xp2
    public final kq0 m() {
        kq0 kq0Var = this.e;
        if (kq0Var != null) {
            return kq0Var;
        }
        WindowInsets windowInsets = this.c;
        kq0 kq0VarB = kq0.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.e = kq0VarB;
        return kq0VarB;
    }

    @Override // defpackage.xp2
    public void o(View view) {
        B(view);
    }

    @Override // defpackage.xp2
    public void p() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iN = c12.n(i);
            this.k[iN] = D(h(i));
            if (i != 8) {
                this.l[iN] = D(i(i));
            }
        }
    }

    @Override // defpackage.xp2
    public aq2 q(int i, int i2, int i3, int i4) {
        np2 hp2Var;
        aq2 aq2VarC = aq2.c(this.c, null);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            hp2Var = new mp2(aq2VarC);
        } else if (i5 >= 35) {
            hp2Var = new lp2(aq2VarC);
        } else if (i5 >= 34) {
            hp2Var = new kp2(aq2VarC);
        } else if (i5 >= 31) {
            hp2Var = new jp2(aq2VarC);
        } else if (i5 >= 30) {
            hp2Var = new ip2(aq2VarC);
        } else {
            hp2Var = i5 >= 29 ? new hp2(aq2VarC) : new gp2(aq2VarC);
        }
        hp2Var.h(aq2.a(m(), i, i2, i3, i4));
        hp2Var.f(aq2.a(k(), i, i2, i3, i4));
        return hp2Var.b();
    }

    @Override // defpackage.xp2
    public boolean s() {
        return this.c.isRound();
    }

    @Override // defpackage.xp2
    public boolean t(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !I(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.xp2
    public void v(kq0[] kq0VarArr) {
        this.d = kq0VarArr;
    }

    @Override // defpackage.xp2
    public void w(aq2 aq2Var) {
        this.f = aq2Var;
    }

    @Override // defpackage.xp2
    public void y(int i) {
        this.h = i;
    }

    @Override // defpackage.xp2
    public void z(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.k = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.xp2
    public void u(z50 z50Var) {
    }
}
