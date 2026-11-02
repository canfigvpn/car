package defpackage;

import android.app.Application;
import android.os.Bundle;
import ir.alirezaivaz.mygarage.MainActivity;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class uw1 implements yn2 {
    public final Application a;
    public final xn2 b;
    public final Bundle c;
    public final b21 d;
    public final ru1 e;

    public uw1(Application application, MainActivity mainActivity, Bundle bundle) {
        xn2 xn2Var;
        this.e = (ru1) mainActivity.h.c;
        this.d = mainActivity.e;
        this.c = bundle;
        this.a = application;
        if (application != null) {
            xn2Var = xn2.c;
            if (xn2Var == null) {
                xn2Var = new xn2(application);
                xn2.c = xn2Var;
            }
        } else {
            xn2Var = new xn2(null);
        }
        this.b = xn2Var;
    }

    @Override // defpackage.yn2
    public final un2 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        qj.r("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.yn2
    public final un2 b(Class cls, a91 a91Var) {
        LinkedHashMap linkedHashMap = a91Var.a;
        String str = (String) linkedHashMap.get(ao2.g);
        if (str == null) {
            fu1.h("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(sv0.e0) == null || linkedHashMap.get(sv0.f0) == null) {
            if (this.d != null) {
                return d(str, cls);
            }
            fu1.h("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(xn2.d);
        boolean zIsAssignableFrom = da.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? vw1.a(cls, vw1.b) : vw1.a(cls, vw1.a);
        if (constructorA == null) {
            return this.b.b(cls, a91Var);
        }
        return (!zIsAssignableFrom || application == null) ? vw1.b(cls, constructorA, sv0.W(a91Var)) : vw1.b(cls, constructorA, application, sv0.W(a91Var));
    }

    @Override // defpackage.yn2
    public final un2 c(aq aqVar, a91 a91Var) {
        return b(vv.q(aqVar), a91Var);
    }

    public final un2 d(String str, Class cls) {
        kw1 kw1Var;
        b21 b21Var = this.d;
        if (b21Var == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = da.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? vw1.a(cls, vw1.b) : vw1.a(cls, vw1.a);
        if (constructorA == null) {
            if (application != null) {
                return this.b.a(cls);
            }
            zn2 zn2Var = zn2.a;
            if (zn2Var == null) {
                zn2Var = new zn2();
                zn2.a = zn2Var;
            }
            return zn2Var.a(cls);
        }
        ru1 ru1Var = this.e;
        ru1Var.getClass();
        Bundle bundleG = ru1Var.g(str);
        if (bundleG == null) {
            bundleG = this.c;
        }
        if (bundleG == null) {
            kw1Var = new kw1();
        } else {
            ClassLoader classLoader = kw1.class.getClassLoader();
            classLoader.getClass();
            bundleG.setClassLoader(classLoader);
            x51 x51Var = new x51(bundleG.size());
            for (String str2 : bundleG.keySet()) {
                str2.getClass();
                x51Var.put(str2, bundleG.get(str2));
            }
            kw1Var = new kw1(x51Var.b());
        }
        lw1 lw1Var = new lw1(str, kw1Var);
        lw1Var.k(ru1Var, b21Var);
        r11 r11Var = b21Var.h;
        if (r11Var == r11.f || r11Var.compareTo(r11.h) >= 0) {
            ru1Var.q();
        } else {
            b21Var.a(new g30(1, b21Var, ru1Var));
        }
        un2 un2VarB = (!zIsAssignableFrom || application == null) ? vw1.b(cls, constructorA, kw1Var) : vw1.b(cls, constructorA, application, kw1Var);
        un2VarB.a("androidx.lifecycle.savedstate.vm.tag", lw1Var);
        return un2VarB;
    }

    public uw1() {
        this.b = new xn2(null);
    }
}
