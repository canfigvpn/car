package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import ir.alirezaivaz.mygarage.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class av {
    public final View a;
    public final lv b;
    public final y11 c;
    public final tw1 d;
    public final co2 e;
    public final mo0 f;
    public final lt1 g;
    public final Configuration h;
    public final da1 i;
    public final d4 j;
    public final is1 k;
    public final m4 l;
    public final l4 m;
    public final ig0 n;
    public final da1 o;
    public final yl0 p;
    public final ca q;
    public final cx0 r;
    public final x01 s;
    public final vm t;
    public int u;
    public final h8 v;
    public final zu w;

    public av(av avVar, View view, lv lvVar, y11 y11Var, tw1 tw1Var, co2 co2Var) {
        mo0 mo0Var;
        Configuration configuration;
        da1 da1VarS;
        d4 d4Var;
        is1 is1Var;
        m4 m4Var;
        l4 l4Var;
        ig0 is1Var2;
        da1 dk1Var;
        ca caVar;
        boolean zJ = ws0.j(avVar != null ? avVar.a.getContext() : null, view.getContext());
        this.a = view;
        this.b = lvVar;
        this.c = y11Var;
        this.d = tw1Var;
        this.e = co2Var;
        if (zJ) {
            avVar.getClass();
            mo0Var = avVar.f;
        } else {
            mo0Var = new mo0();
        }
        this.f = mo0Var;
        this.g = avVar != null ? avVar.g : new lt1();
        if (zJ) {
            avVar.getClass();
            configuration = avVar.h;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.h = configuration;
        if (zJ) {
            avVar.getClass();
            da1VarS = avVar.i;
        } else {
            da1VarS = y12.s(new Configuration(configuration));
        }
        this.i = da1VarS;
        if (zJ) {
            avVar.getClass();
            d4Var = avVar.j;
        } else {
            d4Var = new d4(view.getContext());
        }
        this.j = d4Var;
        if (zJ) {
            avVar.getClass();
            is1Var = avVar.k;
        } else {
            view.getContext();
            is1Var = new is1(16);
        }
        this.k = is1Var;
        if (zJ) {
            avVar.getClass();
            m4Var = avVar.l;
        } else {
            m4Var = new m4(view.getContext());
        }
        this.l = m4Var;
        if (zJ) {
            avVar.getClass();
            l4Var = avVar.m;
        } else {
            l4Var = new l4(m4Var);
        }
        this.m = l4Var;
        if (zJ) {
            avVar.getClass();
            is1Var2 = avVar.n;
        } else {
            view.getContext();
            is1Var2 = new is1(15);
        }
        this.n = is1Var2;
        if (zJ) {
            avVar.getClass();
            dk1Var = avVar.o;
        } else {
            dk1Var = new dk1(sv.x(view.getContext()), is1.f);
        }
        this.o = dk1Var;
        this.p = view == (avVar != null ? avVar.a : null) ? avVar.p : new om1(view);
        if (zJ) {
            avVar.getClass();
            caVar = avVar.q;
        } else {
            caVar = new ca(ViewConfiguration.get(view.getContext()));
        }
        this.q = caVar;
        this.r = avVar != null ? avVar.r : new cx0();
        this.s = new x01();
        this.t = avVar != null ? avVar.t : new vm();
        this.v = new h8(3, this);
        this.w = new zu(this);
    }

    public final void a(e5 e5Var, gt gtVar, ak0 ak0Var, int i) {
        boolean z;
        ak0Var.X(123858079);
        int i2 = (ak0Var.h(e5Var) ? 4 : 2) | i | (ak0Var.h(gtVar) ? 32 : 16) | (ak0Var.h(this) ? 256 : 128);
        int i3 = 1;
        if (ak0Var.O(i2 & 1, (i2 & 147) != 146)) {
            Object tag = e5Var.getTag(R.id.inspection_slot_table_set);
            LinkedHashMap linkedHashMap = null;
            Set set = (!(tag instanceof Set) || ((tag instanceof fv0) && !(tag instanceof iv0))) ? null : (Set) tag;
            if (set == null) {
                Object parent = e5Var.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof fv0) && !(tag2 instanceof iv0))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(ak0Var.w());
                ak0Var.q = true;
                ak0Var.C = true;
                ak0Var.c.b();
                ak0Var.H.b();
                o52 o52Var = ak0Var.I;
                l52 l52Var = o52Var.a;
                o52Var.e = l52Var.n;
                o52Var.f = l52Var.o;
            }
            Object objL = ak0Var.L();
            tw1 tw1Var = this.d;
            is1 is1Var = cv.a;
            if (objL == is1Var) {
                Object parent2 = e5Var.getParent();
                parent2.getClass();
                View view2 = (View) parent2;
                Object tag3 = view2.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag3 instanceof String ? (String) tag3 : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view2.getId());
                }
                String str = "SaveableStateRegistry:" + strValueOf;
                ru1 ru1VarC = tw1Var.c();
                Bundle bundleG = ru1VarC.g(str);
                if (bundleG != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleG.keySet()) {
                        ArrayList parcelableArrayList = bundleG.getParcelableArrayList(str2);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str2, parcelableArrayList);
                    }
                }
                x4 x4Var = x4.y;
                a90 a90Var = iw1.a;
                hw1 hw1Var = new hw1(linkedHashMap, x4Var);
                if (ru1VarC.k(str) != null) {
                    z = false;
                } else {
                    try {
                        ru1VarC.o(str, new us(i3, hw1Var));
                        z = true;
                    } catch (IllegalArgumentException unused) {
                        z = false;
                    }
                }
                f60 f60Var = new f60(hw1Var, new g60(z, ru1VarC, str));
                ak0Var.g0(f60Var);
                objL = f60Var;
            }
            f60 f60Var2 = (f60) objL;
            boolean zH = ak0Var.h(f60Var2);
            Object objL2 = ak0Var.L();
            if (zH || objL2 == is1Var) {
                objL2 = new y3(9, f60Var2);
                ak0Var.g0(objL2);
            }
            s5.e(ll2.a, (ej0) objL2, ak0Var);
            a90 a90Var2 = yv.w;
            boolean zBooleanValue = ((Boolean) ak0Var.j(a90Var2)).booleanValue() | e5Var.getScrollCaptureInProgress$ui();
            boolean zF = ak0Var.f(e5Var.getView());
            Object objL3 = ak0Var.L();
            if (zF || objL3 == is1Var) {
                objL3 = new eo2(e5Var.getView());
                ak0Var.g0(objL3);
            }
            sv.b(new vq1[]{j31.a.a(this.c), n31.a.a(tw1Var), u5.d.a(this.f), u5.e.a(this.g), u5.b.a(e5Var.getContext()), vq0.a.a(set), u5.a.a(e5Var.getConfiguration()), iw1.a.a(f60Var2), u5.f.a(e5Var.getView()), a90Var2.a(Boolean.valueOf(zBooleanValue)), yv.t.a(e5Var.getViewConfiguration()), un0.a.a((eo2) objL3)}, vs0.C(1317454175, new yu(e5Var, this, gtVar), ak0Var), ak0Var, 56);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new yu(this, e5Var, gtVar, i);
        }
    }

    public final void b() {
        int i = this.u - 1;
        this.u = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            i = 0;
            this.u = 0;
        }
        if (i == 0) {
            View view = this.a;
            Context context = view.getContext();
            zu zuVar = this.w;
            context.unregisterComponentCallbacks(zuVar);
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(zuVar);
        }
    }

    public final void c() {
        int i = this.u + 1;
        this.u = i;
        if (i == 1) {
            View view = this.a;
            Context context = view.getContext();
            zu zuVar = this.w;
            context.registerComponentCallbacks(zuVar);
            d(view.getResources().getConfiguration());
            this.s.a.setValue(Boolean.valueOf(view.hasWindowFocus()));
            view.getViewTreeObserver().addOnWindowFocusChangeListener(zuVar);
        }
    }

    public final void d(Configuration configuration) {
        int iUpdateFrom = this.h.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator it = this.f.a.entrySet().iterator();
            while (it.hasNext()) {
                ko0 ko0Var = (ko0) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (ko0Var == null || Configuration.needNewResources(iUpdateFrom, ko0Var.b)) {
                    it.remove();
                }
            }
            this.i.setValue(new Configuration(configuration));
            lt1 lt1Var = this.g;
            synchronized (lt1Var) {
                lt1Var.a.c();
            }
            if ((268435456 & iUpdateFrom) != 0) {
                this.o.setValue(sv.x(this.a.getContext()));
            }
        }
    }
}
