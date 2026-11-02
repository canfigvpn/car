package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class kb1 implements y11, co2, zl0, tw1 {
    public final b7 e;
    public zb1 f;
    public final Bundle g;
    public r11 h;
    public final sb1 i;
    public final String j;
    public final Bundle k;
    public final mb1 l = new mb1(this);

    public kb1(b7 b7Var, zb1 zb1Var, Bundle bundle, r11 r11Var, sb1 sb1Var, String str, Bundle bundle2) {
        this.e = b7Var;
        this.f = zb1Var;
        this.g = bundle;
        this.h = r11Var;
        this.i = sb1Var;
        this.j = str;
        this.k = bundle2;
        new hb2(new w8(16, this));
    }

    public final void a(r11 r11Var) {
        mb1 mb1Var = this.l;
        mb1Var.getClass();
        mb1Var.k = r11Var;
        mb1Var.b();
    }

    @Override // defpackage.tw1
    public final ru1 c() {
        return (ru1) this.l.h.c;
    }

    @Override // defpackage.zl0
    public final yn2 e() {
        return this.l.l;
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof kb1)) {
            kb1 kb1Var = (kb1) obj;
            Bundle bundle = kb1Var.g;
            if (!this.j.equals(kb1Var.j) || !ws0.j(this.f, kb1Var.f) || this.l.j != kb1Var.l.j || c() != kb1Var.c()) {
                return false;
            }
            Bundle bundle2 = this.g;
            if (ws0.j(bundle2, bundle)) {
                return true;
            }
            if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                Set<String> set = setKeySet;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return true;
                }
                for (String str : set) {
                    if (!ws0.j(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    @Override // defpackage.zl0
    public final a91 f() {
        Application application;
        mb1 mb1Var = this.l;
        mb1Var.getClass();
        a91 a91Var = new a91();
        iq1 iq1Var = sv0.e0;
        kb1 kb1Var = mb1Var.a;
        LinkedHashMap linkedHashMap = a91Var.a;
        linkedHashMap.put(iq1Var, kb1Var);
        linkedHashMap.put(sv0.f0, kb1Var);
        Bundle bundleA = mb1Var.a();
        if (bundleA != null) {
            linkedHashMap.put(sv0.g0, bundleA);
        }
        b7 b7Var = this.e;
        if (b7Var == null) {
            application = null;
        } else {
            Context context = b7Var.a;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
            } else {
                application = null;
            }
        }
        Application application2 = application != null ? application : null;
        if (application2 != null) {
            linkedHashMap.put(xn2.d, application2);
        }
        return a91Var;
    }

    @Override // defpackage.co2
    public final bo2 g() {
        mb1 mb1Var = this.l;
        if (!mb1Var.i) {
            fu1.h("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (mb1Var.j.h == r11.e) {
            fu1.h("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        sb1 sb1Var = mb1Var.e;
        if (sb1Var == null) {
            fu1.h("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        String str = mb1Var.f;
        LinkedHashMap linkedHashMap = sb1Var.b;
        bo2 bo2Var = (bo2) linkedHashMap.get(str);
        if (bo2Var != null) {
            return bo2Var;
        }
        bo2 bo2Var2 = new bo2();
        linkedHashMap.put(str, bo2Var2);
        return bo2Var2;
    }

    @Override // defpackage.y11
    public final b21 h() {
        return this.l.j;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.f.hashCode() + (this.j.hashCode() * 31);
        Bundle bundle = this.g;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return c().hashCode() + ((this.l.j.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return this.l.toString();
    }
}
