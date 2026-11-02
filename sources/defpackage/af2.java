package defpackage;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class af2 implements kn1 {
    public final View a;
    public final ud b;
    public final bf2 c;
    public boolean d;
    public ej0 e;
    public ej0 f;
    public te2 g;
    public oo0 h;
    public final ArrayList i;
    public final rx0 j;
    public Rect k;
    public final pz l;
    public final fa1 m;
    public p n;

    public af2(View view, e5 e5Var) {
        ud udVar = new ud(view);
        bf2 bf2Var = new bf2(Choreographer.getInstance());
        this.a = view;
        this.b = udVar;
        this.c = bf2Var;
        this.e = je1.v;
        this.f = je1.w;
        this.g = new te2("", of2.b, 4);
        this.h = oo0.g;
        this.i = new ArrayList();
        this.j = vv.F(v01.f, new h8(14, this));
        this.l = new pz(e5Var, udVar);
        this.m = new fa1(new ze2[16]);
    }

    @Override // defpackage.kn1
    public final void a(te2 te2Var, xf1 xf1Var, hf2 hf2Var, qk qkVar, yr1 yr1Var, yr1 yr1Var2) {
        pz pzVar = this.l;
        synchronized (pzVar.c) {
            try {
                pzVar.j = te2Var;
                pzVar.l = xf1Var;
                pzVar.k = hf2Var;
                pzVar.m = qkVar;
                pzVar.n = yr1Var;
                pzVar.o = yr1Var2;
                if (pzVar.e || pzVar.d) {
                    pzVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kn1
    public final void b() {
        i(ze2.e);
    }

    @Override // defpackage.kn1
    public final void c(te2 te2Var, te2 te2Var2) {
        boolean z = (of2.b(this.g.b, te2Var2.b) && ws0.j(this.g.c, te2Var2.c)) ? false : true;
        this.g = te2Var2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            ur1 ur1Var = (ur1) ((WeakReference) this.i.get(i)).get();
            if (ur1Var != null) {
                ur1Var.d = te2Var2;
            }
        }
        pz pzVar = this.l;
        synchronized (pzVar.c) {
            pzVar.j = null;
            pzVar.l = null;
            pzVar.k = null;
            pzVar.m = x4.w;
            pzVar.n = null;
            pzVar.o = null;
        }
        if (ws0.j(te2Var, te2Var2)) {
            if (z) {
                ud udVar = this.b;
                int iF = of2.f(te2Var2.b);
                int iE = of2.e(te2Var2.b);
                of2 of2Var = this.g.c;
                int iF2 = of2Var != null ? of2.f(of2Var.a) : -1;
                of2 of2Var2 = this.g.c;
                ((InputMethodManager) ((rx0) udVar.c).getValue()).updateSelection((View) udVar.b, iF, iE, iF2, of2Var2 != null ? of2.e(of2Var2.a) : -1);
                return;
            }
            return;
        }
        if (te2Var != null && (!ws0.j(te2Var.a.f, te2Var2.a.f) || (of2.b(te2Var.b, te2Var2.b) && !ws0.j(te2Var.c, te2Var2.c)))) {
            ud udVar2 = this.b;
            ((InputMethodManager) ((rx0) udVar2.c).getValue()).restartInput((View) udVar2.b);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ur1 ur1Var2 = (ur1) ((WeakReference) this.i.get(i2)).get();
            if (ur1Var2 != null) {
                te2 te2Var3 = this.g;
                ud udVar3 = this.b;
                if (ur1Var2.h) {
                    ur1Var2.d = te2Var3;
                    if (ur1Var2.f) {
                        ((InputMethodManager) ((rx0) udVar3.c).getValue()).updateExtractedText((View) udVar3.b, ur1Var2.e, ei1.M(te2Var3));
                    }
                    of2 of2Var3 = te2Var3.c;
                    long j = te2Var3.b;
                    int iF3 = of2Var3 != null ? of2.f(of2Var3.a) : -1;
                    of2 of2Var4 = te2Var3.c;
                    ((InputMethodManager) ((rx0) udVar3.c).getValue()).updateSelection((View) udVar3.b, of2.f(j), of2.e(j), iF3, of2Var4 != null ? of2.e(of2Var4.a) : -1);
                }
            }
        }
    }

    @Override // defpackage.kn1
    public final void d() {
        i(ze2.g);
    }

    @Override // defpackage.kn1
    public final void e() {
        i(ze2.h);
    }

    @Override // defpackage.kn1
    public final void f() {
        this.d = false;
        this.e = je1.x;
        this.f = je1.y;
        this.k = null;
        i(ze2.f);
    }

    @Override // defpackage.kn1
    public final void g(yr1 yr1Var) {
        Rect rect;
        this.k = new Rect(p61.j0(yr1Var.a), p61.j0(yr1Var.b), p61.j0(yr1Var.c), p61.j0(yr1Var.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // defpackage.kn1
    public final void h(te2 te2Var, oo0 oo0Var, o1 o1Var, ey eyVar) {
        this.d = true;
        this.g = te2Var;
        this.h = oo0Var;
        this.e = o1Var;
        this.f = eyVar;
        i(ze2.e);
    }

    public final void i(ze2 ze2Var) {
        this.m.b(ze2Var);
        if (this.n == null) {
            p pVar = new p(12, this);
            this.c.execute(pVar);
            this.n = pVar;
        }
    }
}
