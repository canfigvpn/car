package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class is1 implements d72, oq2, ig0, ge, ie, ty {
    public static final is1 f = new is1(0);
    public static final is1 g = new is1(1);
    public static final is1 h = new is1(2);
    public static final is1 i = new is1(3);
    public static final fu1 j = new fu1(4);
    public static final fu1 k = new fu1(5);
    public static final fu1 l = new fu1(6);
    public static final fu1 m = new fu1(7);
    public static final is1 n = new is1(5);
    public static final is1 o = new is1(6);
    public static final is1 p = new is1(7);
    public static final is1 q = new is1(8);
    public static final fu1 r = new fu1(12);
    public static final fu1 s = new fu1(13);
    public static final is1 t = new is1(10);
    public static final fu1 u = new fu1(17);
    public static final is1 v = new is1(12);
    public static final pq2 w = new pq2();
    public final /* synthetic */ int e;

    public /* synthetic */ is1(int i2) {
        this.e = i2;
    }

    @Override // defpackage.ge, defpackage.ie
    public float a() {
        switch (this.e) {
        }
        return 0.0f;
    }

    @Override // defpackage.oq2
    public kq2 b(ContextWrapper contextWrapper, n40 n40Var) {
        tj tjVar;
        Context baseContext = contextWrapper;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = contextWrapper;
                break;
            }
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper2 = (ContextWrapper) baseContext;
            if (contextWrapper2.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper2.getBaseContext();
            baseContext.getClass();
        }
        if (baseContext instanceof Activity) {
            Activity activity = (Activity) baseContext;
            tj.a.getClass();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                tjVar = uj.e;
            } else if (i2 >= 29) {
                tjVar = q90.w;
            } else {
                tjVar = i2 >= 28 ? q90.v : q90.u;
            }
            return new kq2(new rj(tjVar.a(activity)), n40Var.f(activity));
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            qj.r("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = contextWrapper.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new kq2(new Rect(0, 0, point.x, point.y), n40Var.f(contextWrapper));
    }

    @Override // defpackage.d72
    public boolean c(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return obj == obj2;
            default:
                return ws0.j(obj, obj2);
        }
    }

    @Override // defpackage.ge
    public void d(m40 m40Var, int i2, int[] iArr, kw0 kw0Var, int[] iArr2) {
        int i3 = this.e;
        kw0 kw0Var2 = kw0.e;
        switch (i3) {
            case 18:
                if (kw0Var != kw0Var2) {
                    ws0.K(i2, iArr, iArr2, true);
                } else {
                    ws0.K(i2, iArr, iArr2, false);
                }
                break;
            case 19:
                if (kw0Var != kw0Var2) {
                    ws0.L(i2, iArr, iArr2, true);
                } else {
                    ws0.L(i2, iArr, iArr2, false);
                }
                break;
            default:
                if (kw0Var != kw0Var2) {
                    ws0.M(i2, iArr, iArr2, true);
                } else {
                    ws0.M(i2, iArr, iArr2, false);
                }
                break;
        }
    }

    @Override // defpackage.ie
    public void e(m40 m40Var, int i2, int[] iArr, int[] iArr2) {
        switch (this.e) {
            case 18:
                ws0.K(i2, iArr, iArr2, false);
                break;
            case 19:
                ws0.L(i2, iArr, iArr2, false);
                break;
            default:
                ws0.M(i2, iArr, iArr2, false);
                break;
        }
    }

    public void f(Drawable drawable, ak0 ak0Var, int i2) {
        ak0Var.X(257732500);
        int i3 = (ak0Var.h(drawable) ? 4 : 2) | i2;
        if (ak0Var.O(i3 & 1, (i3 & 3) != 2)) {
            u71 u71VarJ = f52.j(ox.e);
            boolean zH = ak0Var.h(drawable);
            Object objL = ak0Var.L();
            if (zH || objL == cv.a) {
                objL = new tr1(12, drawable);
                ak0Var.g0(objL);
            }
            xj.a(ir2.l(u71VarJ, (ej0) objL), ak0Var, 0);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new nb1(this, drawable, i2, 5);
        }
    }

    public void g(final Icon icon, ak0 ak0Var, final int i2) {
        lr1 lr1VarR;
        ij0 ij0Var;
        ak0Var.X(2116504409);
        int i3 = (ak0Var.h(icon) ? 4 : 2) | i2;
        final int i4 = 0;
        final int i5 = 1;
        if (ak0Var.O(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) ak0Var.j(u5.b);
            boolean zF = ak0Var.f(icon) | ak0Var.f(context);
            Object objL = ak0Var.L();
            if (zF || objL == cv.a) {
                objL = icon.loadDrawable(context);
                ak0Var.g0(objL);
            }
            Drawable drawable = (Drawable) objL;
            if (drawable == null) {
                lr1VarR = ak0Var.r();
                if (lr1VarR == null) {
                    return;
                } else {
                    ij0Var = new ij0(this, icon, i2, i4) { // from class: tc2
                        public final /* synthetic */ int e;
                        public final /* synthetic */ is1 f;
                        public final /* synthetic */ Icon g;

                        {
                            this.e = i4;
                            this.f = this;
                        }

                        @Override // defpackage.ij0
                        public final Object g(Object obj, Object obj2) {
                            int i6 = this.e;
                            ll2 ll2Var = ll2.a;
                            Icon icon2 = this.g;
                            is1 is1Var = this.f;
                            ak0 ak0Var2 = (ak0) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    is1Var.g(icon2, ak0Var2, ei1.P(49));
                                    break;
                                default:
                                    is1Var.g(icon2, ak0Var2, ei1.P(49));
                                    break;
                            }
                            return ll2Var;
                        }
                    };
                }
            } else {
                f(drawable, ak0Var, 48);
            }
            lr1VarR.d = ij0Var;
        }
        ak0Var.R();
        lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            ij0Var = new ij0(this, icon, i2, i5) { // from class: tc2
                public final /* synthetic */ int e;
                public final /* synthetic */ is1 f;
                public final /* synthetic */ Icon g;

                {
                    this.e = i5;
                    this.f = this;
                }

                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    int i6 = this.e;
                    ll2 ll2Var = ll2.a;
                    Icon icon2 = this.g;
                    is1 is1Var = this.f;
                    ak0 ak0Var2 = (ak0) obj;
                    ((Integer) obj2).getClass();
                    switch (i6) {
                        case 0:
                            is1Var.g(icon2, ak0Var2, ei1.P(49));
                            break;
                        default:
                            is1Var.g(icon2, ak0Var2, ei1.P(49));
                            break;
                    }
                    return ll2Var;
                }
            };
            lr1VarR.d = ij0Var;
        }
    }

    public long h(long j2, long j3) {
        switch (this.e) {
            case 25:
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                int i2 = ix1.a;
                return jFloatToRawIntBits;
            case 26:
                float fK = ex.k(j2, j3);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fK)) << 32) | (((long) Float.floatToRawIntBits(fK)) & 4294967295L);
                int i3 = ix1.a;
                return jFloatToRawIntBits2;
            default:
                if (Float.intBitsToFloat((int) (j2 >> 32)) <= Float.intBitsToFloat((int) (j3 >> 32)) && Float.intBitsToFloat((int) (j2 & 4294967295L)) <= Float.intBitsToFloat((int) (j3 & 4294967295L))) {
                    long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i4 = ix1.a;
                    return jFloatToRawIntBits3;
                }
                float fK2 = ex.k(j2, j3);
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fK2)) << 32) | (((long) Float.floatToRawIntBits(fK2)) & 4294967295L);
                int i5 = ix1.a;
                return jFloatToRawIntBits4;
        }
    }

    public Signature[] i(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public String toString() {
        switch (this.e) {
            case 0:
                return "ReferentialEqualityPolicy";
            case 5:
                return "Center";
            case 6:
                return "StructuralEqualityPolicy";
            case 18:
                return "Arrangement#Center";
            case 19:
                return "Arrangement#SpaceBetween";
            case 20:
                return "Arrangement#SpaceEvenly";
            case 22:
                return "Empty";
            case 23:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }
}
