package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import ir.alirezaivaz.mygarage.R;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fq2 {
    public static final WeakHashMap v = new WeakHashMap();
    public final fa a;
    public final fa b;
    public final fa c;
    public final fa d;
    public final fa e;
    public final fa f;
    public final fa g;
    public final fa h;
    public final fa i;
    public final dm2 j;
    public final dk1 k;
    public final dm2 l;
    public final dm2 m;
    public final dm2 n;
    public final dm2 o;
    public final dm2 p;
    public final dm2 q;
    public final dm2 r;
    public final boolean s;
    public int t;
    public final oq0 u;

    public fq2(View view) {
        fa faVar = new fa("captionBar", 4);
        this.a = faVar;
        fa faVar2 = new fa("displayCutout", 128);
        this.b = faVar2;
        fa faVar3 = new fa("ime", 8);
        this.c = faVar3;
        fa faVar4 = new fa("mandatorySystemGestures", 32);
        this.d = faVar4;
        fa faVar5 = new fa("navigationBars", 2);
        this.e = faVar5;
        fa faVar6 = new fa("statusBars", 1);
        this.f = faVar6;
        fa faVar7 = new fa("systemBars", 519);
        this.g = faVar7;
        fa faVar8 = new fa("systemGestures", 16);
        this.h = faVar8;
        fa faVar9 = new fa("tappableElement", 64);
        this.i = faVar9;
        dm2 dm2Var = new dm2(new tq0(0, 0, 0, 0), "waterfall");
        this.j = dm2Var;
        this.k = y12.s(null);
        new kl2(new kl2(faVar7, faVar3), faVar2);
        new kl2(new kl2(new kl2(faVar9, faVar4), faVar8), dm2Var);
        this.l = p12.q("captionBarIgnoringVisibility", 4);
        this.m = p12.q("navigationBarsIgnoringVisibility", 2);
        this.n = p12.q("statusBarsIgnoringVisibility", 1);
        this.o = p12.q("systemBarsIgnoringVisibility", 519);
        this.p = p12.q("tappableElementIgnoringVisibility", 64);
        this.q = new dm2(new tq0(0, 0, 0, 0), "imeAnimationTarget");
        this.r = new dm2(new tq0(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.s = bool != null ? bool.booleanValue() : false;
        this.u = new oq0(this);
        Field field = ln2.a;
        aq2 aq2VarA = gn2.a(view);
        if (aq2VarA != null) {
            xp2 xp2Var = aq2VarA.a;
            faVar.f(xp2Var.t(4));
            faVar2.f(xp2Var.t(128));
            faVar3.f(xp2Var.t(8));
            faVar4.f(xp2Var.t(32));
            faVar5.f(xp2Var.t(2));
            faVar6.f(xp2Var.t(1));
            faVar7.f(xp2Var.t(519));
            faVar8.f(xp2Var.t(16));
            faVar9.f(xp2Var.t(64));
        }
    }

    public static void b(fq2 fq2Var, aq2 aq2Var) {
        boolean z = false;
        fq2Var.a.g(aq2Var, 0);
        fq2Var.c.g(aq2Var, 0);
        fq2Var.b.g(aq2Var, 0);
        fq2Var.e.g(aq2Var, 0);
        fq2Var.f.g(aq2Var, 0);
        fq2Var.g.g(aq2Var, 0);
        fq2Var.h.g(aq2Var, 0);
        fq2Var.i.g(aq2Var, 0);
        fq2Var.d.g(aq2Var, 0);
        fq2Var.l.f(y12.v(aq2Var.a.i(4)));
        fq2Var.m.f(y12.v(aq2Var.a.i(2)));
        fq2Var.n.f(y12.v(aq2Var.a.i(1)));
        fq2Var.o.f(y12.v(aq2Var.a.i(519)));
        fq2Var.p.f(y12.v(aq2Var.a.i(64)));
        w50 w50VarG = aq2Var.a.g();
        fq2Var.j.f(y12.v(w50VarG != null ? w50VarG.a() : kq0.e));
        d8 d8Var = null;
        if (w50VarG != null) {
            Path pathC = Build.VERSION.SDK_INT >= 31 ? x5.c(w50VarG.a) : null;
            if (pathC != null) {
                d8Var = new d8(pathC);
            }
        }
        fq2Var.k.setValue(d8Var);
        synchronized (x62.c) {
            x91 x91Var = x62.j.h;
            if (x91Var != null && x91Var.h()) {
                z = true;
            }
        }
        if (z) {
            x62.c();
        }
    }

    public final void a(View view) {
        if (this.t == 0) {
            Field field = ln2.a;
            oq0 oq0Var = this.u;
            fn2.b(view, oq0Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(oq0Var);
            fp2.a(view, oq0Var);
        }
        this.t++;
    }
}
