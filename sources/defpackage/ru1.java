package defpackage;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsetsAnimation;
import ir.alirezaivaz.mygarage.MainActivity;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class ru1 implements ww1, hz1 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public ru1(int i) {
        this.a = i;
        switch (i) {
            case 7:
                break;
            case 8:
                this.b = new iq1(20);
                this.c = new e51(16);
                break;
            case 9:
            default:
                this.b = new LinkedHashMap();
                this.c = new LinkedHashMap();
                break;
            case 10:
                this.b = new fa1(new Reference[16]);
                this.c = new ReferenceQueue();
                break;
        }
    }

    @Override // defpackage.hz1
    public int a(int i) {
        do {
            i = ((uc) this.c).m(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i)));
        return i;
    }

    @Override // defpackage.hz1
    public int b(int i) {
        do {
            i = ((uc) this.c).j(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.ww1
    public Object c(Object obj) {
        return ((ej0) this.c).h(obj);
    }

    @Override // defpackage.hz1
    public int d(int i) {
        CharSequence charSequence = (CharSequence) this.b;
        do {
            i = ((uc) this.c).j(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.hz1
    public int e(int i) {
        do {
            i = ((uc) this.c).m(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.ww1
    public Object f(dw1 dw1Var, Object obj) {
        return ((ij0) this.b).g(dw1Var, obj);
    }

    public Bundle g(String str) {
        Bundle bundle;
        sw1 sw1Var = (sw1) this.b;
        if (!sw1Var.g) {
            fu1.h("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle2 = sw1Var.f;
        if (bundle2 == null) {
            return null;
        }
        if (bundle2.containsKey(str)) {
            bundle = bundle2.getBundle(str);
            if (bundle == null) {
                rw.C(str);
                throw null;
            }
        } else {
            bundle = null;
        }
        bundle2.remove(str);
        if (bundle2.isEmpty()) {
            sw1Var.f = null;
        }
        return bundle;
    }

    public void h() {
        View rootView = ((ViewGroup) ((MainActivity) this.b).findViewById(R.id.content)).getRootView();
        ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
        if (viewGroup != null) {
            viewGroup.addView((ViewGroup) ((hb2) this.c).getValue());
        }
    }

    public Object i(String str) {
        qj1[] qj1VarArr;
        str.getClass();
        kw1 kw1Var = (kw1) this.c;
        Map mapSingletonMap = Collections.singletonMap(str, kw1Var.a(str));
        mapSingletonMap.getClass();
        if (mapSingletonMap.isEmpty()) {
            qj1VarArr = new qj1[0];
        } else {
            ArrayList arrayList = new ArrayList(mapSingletonMap.size());
            for (Map.Entry entry : mapSingletonMap.entrySet()) {
                arrayList.add(new qj1((String) entry.getKey(), entry.getValue()));
            }
            qj1VarArr = (qj1[]) arrayList.toArray(new qj1[0]);
        }
        Bundle bundleW = s5.w((qj1[]) Arrays.copyOf(qj1VarArr, qj1VarArr.length));
        Object obj = ((LinkedHashMap) this.b).get(str);
        if (obj != null) {
            return ((xc1) obj).a(str, bundleW);
        }
        qj.s("Failed to find type for ", str, " when decoding ", kw1Var);
        return null;
    }

    public View j() {
        View viewFindViewById = l().findViewById(ir.alirezaivaz.mygarage.R.id.splashscreen_icon_view);
        viewFindViewById.getClass();
        return viewFindViewById;
    }

    public rw1 k(String str) {
        rw1 rw1Var;
        sw1 sw1Var = (sw1) this.b;
        synchronized (sw1Var.c) {
            Iterator it = sw1Var.d.entrySet().iterator();
            do {
                rw1Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                rw1 rw1Var2 = (rw1) entry.getValue();
                if (ws0.j(str2, str)) {
                    rw1Var = rw1Var2;
                }
            } while (rw1Var == null);
        }
        return rw1Var;
    }

    public ViewGroup l() {
        return (ViewGroup) ((hb2) this.c).getValue();
    }

    public void m(Bundle bundle) {
        sw1 sw1Var = (sw1) this.b;
        tw1 tw1Var = sw1Var.a;
        if (!sw1Var.e) {
            sw1Var.a();
        }
        if (tw1Var.h().h.compareTo(r11.h) >= 0) {
            qj.u(tw1Var.h().h, "performRestore cannot be called when owner is ");
            return;
        }
        if (sw1Var.g) {
            fu1.h("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle3 == null) {
                rw.C("androidx.lifecycle.BundlableSavedStateRegistry.key");
                throw null;
            }
            bundle2 = bundle3;
        }
        sw1Var.f = bundle2;
        sw1Var.g = true;
    }

    public void n(Bundle bundle) {
        sw1 sw1Var = (sw1) this.b;
        Bundle bundleW = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
        Bundle bundle2 = sw1Var.f;
        if (bundle2 != null) {
            bundleW.putAll(bundle2);
        }
        synchronized (sw1Var.c) {
            for (Map.Entry entry : sw1Var.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleA = ((rw1) entry.getValue()).a();
                str.getClass();
                bundleW.putBundle(str, bundleA);
            }
        }
        if (bundleW.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleW);
    }

    public void o(String str, rw1 rw1Var) {
        sw1 sw1Var = (sw1) this.b;
        synchronized (sw1Var.c) {
            if (sw1Var.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            sw1Var.d.put(str, rw1Var);
        }
    }

    public void p() {
        ViewParent parent = l().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(l());
        }
    }

    public void q() {
        if (!((sw1) this.b).h) {
            fu1.h("Can not perform this action after onSaveInstanceState");
            return;
        }
        wr1 wr1Var = (wr1) this.c;
        if (wr1Var == null) {
            wr1Var = new wr1(this);
        }
        this.c = wr1Var;
        try {
            e11.class.getDeclaredConstructor(null);
            wr1 wr1Var2 = (wr1) this.c;
            if (wr1Var2 != null) {
                wr1Var2.a.add(e11.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + e11.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public String toString() {
        switch (this.a) {
            case 11:
                return "Bounds{lower=" + ((kq0) this.b) + " upper=" + ((kq0) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public ru1(sw1 sw1Var, int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = sw1Var;
                this.c = new ru1(sw1Var, 2);
                break;
            default:
                this.b = sw1Var;
                break;
        }
    }

    public ru1(MainActivity mainActivity) {
        this.a = 6;
        this.b = mainActivity;
        this.c = new hb2(new r12(6, this));
    }

    public ru1(kw1 kw1Var, LinkedHashMap linkedHashMap) {
        this.a = 1;
        kw1Var.getClass();
        this.c = kw1Var;
        this.b = linkedHashMap;
    }

    public /* synthetic */ ru1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public ru1(WindowInsetsAnimation.Bounds bounds) {
        this.a = 11;
        this.b = kq0.c(bounds.getLowerBound());
        this.c = kq0.c(bounds.getUpperBound());
    }
}
