package defpackage;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import ir.alirezaivaz.mygarage.MainActivity;
import ir.alirezaivaz.mygarage.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class x40 {
    public boolean a;
    public final Object b;
    public Object c;
    public Serializable d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Serializable] */
    public x40(AssetManager assetManager, Executor executor, jq1 jq1Var, String str, File file) {
        ?? r1;
        this.a = false;
        this.b = executor;
        this.c = jq1Var;
        this.g = str;
        this.f = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case 25:
                    r1 = s5.Q;
                    break;
                case 26:
                    r1 = s5.P;
                    break;
                case 27:
                    r1 = s5.O;
                    break;
                case 28:
                case 29:
                case 30:
                    r1 = s5.N;
                    break;
                default:
                    r1 = 0;
                    break;
            }
        } else {
            r1 = s5.M;
        }
        this.d = r1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object c(x40 x40Var, gs1 gs1Var, ds1 ds1Var, uy1 uy1Var, gs1 gs1Var2, long j, tx txVar) {
        m81 m81Var;
        ds1 ds1Var2;
        uy1 uy1Var2;
        gs1 gs1Var3;
        boolean z;
        if (txVar instanceof m81) {
            m81Var = (m81) txVar;
            int i = m81Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                m81Var.n = i - Integer.MIN_VALUE;
            } else {
                m81Var = new m81(txVar);
            }
        } else {
            m81Var = new m81(txVar);
        }
        Object objT = m81Var.m;
        int i2 = m81Var.n;
        sx sxVar = null;
        if (i2 == 0) {
            ix.Q(objT);
            if (j < 0) {
                return Boolean.FALSE;
            }
            ln lnVar = new ln(10, sxVar, x40Var);
            m81Var.h = x40Var;
            m81Var.i = gs1Var;
            m81Var.j = ds1Var;
            m81Var.k = uy1Var;
            m81Var.l = gs1Var2;
            m81Var.n = 1;
            objT = c22.t(j, lnVar, m81Var);
            fz fzVar = fz.e;
            if (objT == fzVar) {
                return fzVar;
            }
            ds1Var2 = ds1Var;
            uy1Var2 = uy1Var;
            gs1Var3 = gs1Var2;
        } else {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gs1 gs1Var4 = m81Var.l;
            uy1 uy1Var3 = m81Var.k;
            ds1Var2 = m81Var.j;
            gs1 gs1Var5 = m81Var.i;
            x40 x40Var2 = m81Var.h;
            ix.Q(objT);
            gs1Var3 = gs1Var4;
            uy1Var2 = uy1Var3;
            gs1Var = gs1Var5;
            x40Var = x40Var2;
        }
        j81 j81Var = (j81) objT;
        if (j81Var != null) {
            boolean z2 = ((j81) gs1Var.e).c;
            long j2 = j81Var.a;
            gs1Var.e = new j81(j2, j81Var.b, z2);
            ds1Var2.e = uy1Var2.i(uy1Var2.e(j2));
            gs1Var3.e = j20.a(0.0f, 0.0f, 30);
            x40Var.k(j81Var);
            z = !ex.A(ds1Var2.e);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static j81 j(zk zkVar) {
        j81 j81Var = null;
        n12 n12VarI = p12.i(new qh0(2, (sx) (0 == true ? 1 : 0), (Object) new w8(15, zkVar)));
        while (n12VarI.hasNext()) {
            j81 j81VarA = (j81) n12VarI.next();
            if (j81Var != null) {
                j81VarA = j81Var.a(j81VarA);
            }
            j81Var = j81VarA;
        }
        return j81Var;
    }

    public float a(sy1 sy1Var, float f) {
        uy1 uy1Var = (uy1) this.b;
        long jH = uy1Var.h(uy1Var.d(f));
        uy1 uy1Var2 = sy1Var.a;
        return uy1Var.g(uy1Var.e(uy1Var2.c(uy1Var2.k, jH, 1)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public Object b(uy1 uy1Var, j81 j81Var, float f, float f2, tx txVar) {
        k81 k81Var;
        ds1 ds1Var;
        float f3;
        uy1 uy1Var2;
        if (txVar instanceof k81) {
            k81Var = (k81) txVar;
            int i = k81Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                k81Var.m = i - Integer.MIN_VALUE;
            } else {
                k81Var = new k81(this, txVar);
            }
        } else {
            k81Var = new k81(this, txVar);
        }
        k81 k81Var2 = k81Var;
        Object obj = k81Var2.k;
        int i2 = k81Var2.m;
        ez ezVar = null;
        Object obj2 = ll2.a;
        Object obj3 = fz.e;
        if (i2 == 0) {
            ix.Q(obj);
            gs1 gs1Var = new gs1();
            gs1Var.e = j81Var;
            k(j81Var);
            j81 j81VarJ = j((zk) this.f);
            if (j81VarJ != null) {
                k(j81VarJ);
                gs1Var.e = ((j81) gs1Var.e).a(j81VarJ);
            }
            ds1 ds1Var2 = new ds1();
            float fG = uy1Var.g(uy1Var.e(((j81) gs1Var.e).a));
            ds1Var2.e = fG;
            if (!ex.A(fG)) {
                gs1 gs1Var2 = new gs1();
                gs1Var2.e = j20.a(0.0f, 0.0f, 30);
                l81 l81Var = new l81(ds1Var2, gs1Var2, gs1Var, f, this, f2, uy1Var, null);
                k81Var2.h = uy1Var;
                k81Var2.i = ds1Var2;
                k81Var2.j = f2;
                k81Var2.m = 1;
                if (l(uy1Var, l81Var, k81Var2) != obj3) {
                    ds1Var = ds1Var2;
                    f3 = f2;
                    uy1Var2 = uy1Var;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ix.Q(obj);
                return obj2;
            }
            fu1.h("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f3 = k81Var2.j;
        ds1Var = k81Var2.i;
        uy1Var2 = k81Var2.h;
        ix.Q(obj);
        dq0 dq0Var = (dq0) this.h;
        long jD = n02.d(((um2) dq0Var.f).b(Float.MAX_VALUE), ((um2) dq0Var.g).b(Float.MAX_VALUE));
        if (jD == 0) {
            float fD = uy1Var2.d(Math.signum(ds1Var.e)) * Math.min(Math.abs(ds1Var.e) / 100.0f, f3) * 1000.0f;
            if (fD == 0.0f) {
                jD = 0;
            } else {
                jD = uy1Var2.d == di1.f ? n02.d(fD, 0.0f) : n02.d(0.0f, fD);
            }
        }
        long j = jD;
        ft ftVar = (ft) this.d;
        sx sxVar = null;
        k81Var2.h = null;
        k81Var2.i = null;
        k81Var2.m = 2;
        ny1 ny1Var = (ny1) ftVar.e;
        ez ezVar2 = (ez) ((ti0) ny1Var.O.g).a();
        if (ezVar2 != null) {
            ezVar = ezVar2;
        } else {
            fu1.h("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        nj2.y(ezVar, null, new ly1(ny1Var, j, sxVar, 1), 3);
        return obj2 == obj3 ? obj3 : obj2;
    }

    public void d() {
        int i;
        TypedValue typedValue = new TypedValue();
        MainActivity mainActivity = (MainActivity) this.b;
        Resources.Theme theme = mainActivity.getTheme();
        if (theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true)) {
            this.c = Integer.valueOf(typedValue.resourceId);
            this.d = Integer.valueOf(typedValue.data);
        }
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            this.e = ws0.y(mainActivity, typedValue.resourceId);
        }
        if (theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true)) {
            this.a = typedValue.resourceId == R.dimen.splashscreen_icon_size_with_background;
        }
        if (!theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) || (i = typedValue.resourceId) == 0) {
            return;
        }
        mainActivity.setTheme(i);
    }

    public boolean e(pn1 pn1Var) {
        long j;
        ao2 ao2Var = (ao2) this.c;
        m40 m40Var = (m40) this.e;
        ViewConfiguration viewConfiguration = (ViewConfiguration) ao2Var.f;
        int i = Build.VERSION.SDK_INT;
        float f = -(i > 26 ? pr.f(viewConfiguration) : m40Var.x(64.0f));
        float f2 = -(i > 26 ? pr.c(viewConfiguration) : m40Var.x(64.0f));
        List list = pn1Var.a;
        uf1 uf1Var = new uf1(0L);
        int size = list.size();
        boolean zC = false;
        int i2 = 0;
        while (true) {
            j = uf1Var.a;
            if (i2 >= size) {
                break;
            }
            uf1Var = new uf1(uf1.e(j, ((wn1) list.get(i2)).j));
            i2++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
        uy1 uy1Var = (uy1) this.b;
        float fI = uy1Var.i(uy1Var.e(jFloatToRawIntBits));
        if (fI != 0.0f) {
            oy1 oy1Var = uy1Var.a;
            zC = fI > 0.0f ? oy1Var.c() : oy1Var.a();
        }
        return zC ? !(((zk) this.f).c(new j81(jFloatToRawIntBits, ((wn1) vq.Q(pn1Var.a)).b, false)) instanceof vo) : this.a;
    }

    public FileInputStream f(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((jq1) this.c).h();
            return null;
        }
    }

    public void g(int i, Serializable serializable) {
        ((Executor) this.b).execute(new ys(this, i, serializable, 1));
    }

    public void h(p2 p2Var) {
        this.f = p2Var;
        View viewFindViewById = ((MainActivity) this.b).findViewById(android.R.id.content);
        viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new x72(this, viewFindViewById, 0));
    }

    public void i(qj qjVar) {
        float dimension;
        this.g = qjVar;
        MainActivity mainActivity = (MainActivity) this.b;
        qk1 qk1Var = new qk1(mainActivity);
        Integer num = (Integer) this.c;
        Integer num2 = (Integer) this.d;
        ViewGroup viewGroupL = ((ru1) qk1Var.f).l();
        if (num != null && num.intValue() != 0) {
            viewGroupL.setBackgroundResource(num.intValue());
        } else if (num2 != null) {
            viewGroupL.setBackgroundColor(num2.intValue());
        } else {
            viewGroupL.setBackground(mainActivity.getWindow().getDecorView().getBackground());
        }
        Drawable drawable = (Drawable) this.e;
        if (drawable != null) {
            ImageView imageView = (ImageView) viewGroupL.findViewById(R.id.splashscreen_icon_view);
            if (this.a) {
                Drawable drawableY = ws0.y(imageView.getContext(), R.drawable.icon_background);
                dimension = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_with_background) * 0.6666667f;
                if (drawableY != null) {
                    imageView.setBackground(new i61(drawableY, dimension));
                }
            } else {
                dimension = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_no_background) * 0.6666667f;
            }
            imageView.setImageDrawable(new i61(drawable, dimension));
        }
        viewGroupL.addOnLayoutChangeListener(new y72(this, qk1Var));
    }

    public void k(j81 j81Var) {
        dq0 dq0Var = (dq0) this.h;
        long j = j81Var.b;
        long j2 = j81Var.a;
        ((um2) dq0Var.f).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((um2) dq0Var.g).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(uy1 uy1Var, l81 l81Var, tx txVar) throws Throwable {
        n81 n81Var;
        if (txVar instanceof n81) {
            n81Var = (n81) txVar;
            int i = n81Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                n81Var.j = i - Integer.MIN_VALUE;
            } else {
                n81Var = new n81(this, txVar);
            }
        } else {
            n81Var = new n81(this, txVar);
        }
        Object obj = n81Var.h;
        int i2 = n81Var.j;
        sx sxVar = null;
        if (i2 == 0) {
            ix.Q(obj);
            this.a = true;
            e eVar = new e(25, sxVar, uy1Var, l81Var);
            n81Var.j = 1;
            uy uyVar = n81Var.f;
            uyVar.getClass();
            fa2 fa2Var = new fa2(n81Var, uyVar);
            Object objA = c12.A(fa2Var, fa2Var, eVar);
            fz fzVar = fz.e;
            if (objA == fzVar) {
                return fzVar;
            }
        } else {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ix.Q(obj);
        }
        this.a = false;
        return ll2.a;
    }

    public x40(uy1 uy1Var, ao2 ao2Var, ft ftVar, m40 m40Var) {
        this.b = uy1Var;
        this.c = ao2Var;
        this.d = ftVar;
        this.e = m40Var;
        this.f = s5.d(Integer.MAX_VALUE, 6, null);
        this.h = new dq0(23);
    }

    public x40(MainActivity mainActivity) {
        this.b = mainActivity;
        this.f = new fu1(8);
    }
}
