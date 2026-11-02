package defpackage;

import android.os.Bundle;
import ir.alirezaivaz.mygarage.MainActivity;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xr1 implements w11 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ xr1(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.w11
    public final void j(y11 y11Var, q11 q11Var) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                tw1 tw1Var = (tw1) obj;
                if (q11Var != q11.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                y11Var.h().f(this);
                Bundle bundleG = tw1Var.c().g("androidx.savedstate.Restarter");
                if (bundleG == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleG.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    fu1.h("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = stringArrayList.get(i2);
                    i2++;
                    String str2 = str;
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str2, false, xr1.class.getClassLoader()).asSubclass(qw1.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                if (!(tw1Var instanceof co2)) {
                                    qj.u(tw1Var, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                LinkedHashMap linkedHashMap = ((co2) tw1Var).g().a;
                                ru1 ru1VarC = tw1Var.c();
                                Iterator it = vq.k0(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    un2 un2Var = (un2) linkedHashMap.get(it.next());
                                    if (un2Var != null) {
                                        ei1.e(un2Var, ru1VarC, tw1Var.h());
                                    }
                                }
                                if (!vq.k0(linkedHashMap.keySet()).isEmpty()) {
                                    ru1VarC.q();
                                }
                            } catch (Exception e) {
                                qj.m("Failed to instantiate ", str2, e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(k3.j("Class ", str2, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                MainActivity mainActivity = (MainActivity) obj;
                if (mainActivity.i == null) {
                    ws wsVar = (ws) mainActivity.getLastNonConfigurationInstance();
                    if (wsVar != null) {
                        mainActivity.i = wsVar.a;
                    }
                    if (mainActivity.i == null) {
                        mainActivity.i = new bo2();
                    }
                }
                mainActivity.e.f(this);
                return;
            case 2:
                new HashMap();
                jk0[] jk0VarArr = (jk0[]) obj;
                if (jk0VarArr.length > 0) {
                    jk0 jk0Var = jk0VarArr[0];
                    throw null;
                }
                if (jk0VarArr.length <= 0) {
                    return;
                }
                jk0 jk0Var2 = jk0VarArr[0];
                throw null;
            default:
                if (q11Var != q11.ON_CREATE) {
                    qj.u(q11Var, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    y11Var.h().f(this);
                    ((ow1) obj).b();
                    return;
                }
        }
    }
}
