package ir.alirezaivaz.mygarage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a91;
import defpackage.ao2;
import defpackage.aq;
import defpackage.b82;
import defpackage.bo2;
import defpackage.bt;
import defpackage.c22;
import defpackage.ct;
import defpackage.dv;
import defpackage.e4;
import defpackage.f2;
import defpackage.fu1;
import defpackage.gt;
import defpackage.hm0;
import defpackage.i90;
import defpackage.ib2;
import defpackage.j02;
import defpackage.jm0;
import defpackage.js1;
import defpackage.jx;
import defpackage.l51;
import defpackage.lk0;
import defpackage.lz;
import defpackage.n02;
import defpackage.o32;
import defpackage.p2;
import defpackage.q51;
import defpackage.qj;
import defpackage.sx0;
import defpackage.t2;
import defpackage.ux;
import defpackage.v12;
import defpackage.v2;
import defpackage.v22;
import defpackage.vd;
import defpackage.ws0;
import defpackage.x2;
import defpackage.x30;
import defpackage.x40;
import defpackage.x7;
import defpackage.xf;
import defpackage.xu;
import defpackage.xz;
import defpackage.yn2;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends bt implements lk0 {
    public static final /* synthetic */ int D = 0;
    public final xf B;
    public final xf C;
    public volatile f2 y;
    public final Object z = new Object();
    public boolean A = false;

    public MainActivity() {
        int i = 0;
        jm0 jm0Var = new jm0(this);
        jx jxVar = this.f;
        jxVar.getClass();
        bt btVar = jxVar.b;
        if (btVar != null) {
            jm0Var.a(btVar);
        }
        jxVar.a.add(jm0Var);
        this.B = new xf(js1.a(q51.class), new l51(this, 1), new l51(this, i), new l51(this, 2));
        this.C = new xf(js1.a(o32.class), new l51(this, 4), new l51(this, 3), new l51(this, 5));
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Locale localeForLanguageTag;
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("mygarage_ui_prefs", 0);
        sharedPreferences.getClass();
        Object obj = null;
        String string = sharedPreferences.getString("language", null);
        for (Object obj2 : vd.h) {
            if (ws0.j(((vd) obj2).name(), string)) {
                obj = obj2;
                break;
            }
        }
        vd vdVar = (vd) obj;
        if (vdVar == null) {
            vdVar = vd.f;
        }
        String str = vdVar.e;
        if (str == null || (localeForLanguageTag = Locale.forLanguageTag(str)) == null) {
            localeForLanguageTag = Resources.getSystem().getConfiguration().getLocales().get(0);
            localeForLanguageTag.getClass();
        }
        Locale.setDefault(localeForLanguageTag);
        if (str != null) {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocale(localeForLanguageTag);
            configuration.setLayoutDirection(localeForLanguageTag);
            context = context.createConfigurationContext(configuration);
            context.getClass();
        }
        super.attachBaseContext(context);
    }

    @Override // defpackage.lk0
    public final Object d() {
        return k().d();
    }

    @Override // defpackage.zl0
    public final yn2 e() {
        yn2 yn2Var = (yn2) this.w.getValue();
        xz xzVar = (xz) ((x30) ux.q(this, x30.class));
        sx0 sx0VarA = xzVar.a();
        ao2 ao2Var = new ao2(xzVar.a, xzVar.b);
        yn2Var.getClass();
        return new hm0(sx0VarA, yn2Var, ao2Var);
    }

    public final f2 k() {
        if (this.y == null) {
            synchronized (this.z) {
                try {
                    if (this.y == null) {
                        this.y = new f2(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.y;
    }

    public final void l(Bundle bundle) {
        super.onCreate(bundle);
        f2 f2VarK = k();
        x2 x2Var = f2VarK.h;
        MainActivity mainActivity = x2Var.e;
        t2 t2Var = new t2(0, x2Var.f);
        bo2 bo2VarG = mainActivity.g();
        lz lzVarJ = v12.j(mainActivity);
        lzVarJ.getClass();
        e4 e4Var = new e4(bo2VarG, t2Var, lzVarJ);
        aq aqVarA = js1.a(v2.class);
        String strB = aqVarA.b();
        if (strB == null) {
            qj.r("Local and anonymous classes can not be ViewModels");
            return;
        }
        dv dvVar = ((v2) e4Var.j(aqVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB))).c;
        f2VarK.i = dvVar;
        if (((a91) dvVar.b) == null) {
            a91 a91VarF = f2VarK.g.f();
            if (dvVar.a) {
                dvVar.b = a91VarF;
            } else {
                fu1.h("setExtras should only be called for an Activity that extends ComponentActivity");
            }
        }
    }

    @Override // defpackage.bt, defpackage.at, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x40 b82Var = Build.VERSION.SDK_INT >= 31 ? new b82(this) : new x40(this);
        b82Var.d();
        b82Var.h(new p2(this));
        int i = 20;
        b82Var.i(new qj(i));
        l(bundle);
        int i2 = 5;
        i90.a(this, new ib2(0, 0, new v22(i2)), new ib2(i90.a, i90.b, new v22(i2)));
        gt gtVar = new gt(new x7(i, this), true, -332371632);
        ViewGroup.LayoutParams layoutParams = ct.a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        xu xuVar = childAt instanceof xu ? (xu) childAt : null;
        if (xuVar != null) {
            xuVar.setParentCompositionContext(null);
            xuVar.setContent(gtVar);
            return;
        }
        xu xuVar2 = new xu(this);
        xuVar2.setParentCompositionContext(null);
        xuVar2.setContent(gtVar);
        View decorView = getWindow().getDecorView();
        if (c22.e(decorView) == null) {
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        }
        if (n02.j(decorView) == null) {
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        }
        if (j02.n(decorView) == null) {
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(xuVar2, ct.a);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dv dvVar = k().i;
        if (dvVar != null) {
            dvVar.b = null;
        }
    }
}
