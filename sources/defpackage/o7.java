package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class o7 implements kn1 {
    public z01 a;
    public j82 b;
    public g11 c;
    public n42 d;

    @Override // defpackage.kn1
    public final void a(te2 te2Var, xf1 xf1Var, hf2 hf2Var, qk qkVar, yr1 yr1Var, yr1 yr1Var2) {
        g11 g11Var = this.c;
        if (g11Var != null) {
            b11 b11Var = g11Var.m;
            synchronized (b11Var.c) {
                try {
                    b11Var.j = te2Var;
                    b11Var.l = xf1Var;
                    b11Var.k = hf2Var;
                    b11Var.m = yr1Var;
                    b11Var.n = yr1Var2;
                    if (b11Var.e || b11Var.d) {
                        b11Var.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.kn1
    public final void b() {
        j(null);
    }

    @Override // defpackage.kn1
    public final void c(te2 te2Var, te2 te2Var2) {
        g11 g11Var = this.c;
        if (g11Var != null) {
            boolean z = (of2.b(g11Var.h.b, te2Var2.b) && ws0.j(g11Var.h.c, te2Var2.c)) ? false : true;
            g11Var.h = te2Var2;
            int size = g11Var.j.size();
            for (int i = 0; i < size; i++) {
                vr1 vr1Var = (vr1) ((WeakReference) g11Var.j.get(i)).get();
                if (vr1Var != null) {
                    vr1Var.g = te2Var2;
                }
            }
            b11 b11Var = g11Var.m;
            synchronized (b11Var.c) {
                b11Var.j = null;
                b11Var.l = null;
                b11Var.k = null;
                b11Var.m = null;
                b11Var.n = null;
            }
            if (ws0.j(te2Var, te2Var2)) {
                if (z) {
                    dq0 dq0Var = g11Var.b;
                    int iF = of2.f(te2Var2.b);
                    int iE = of2.e(te2Var2.b);
                    of2 of2Var = g11Var.h.c;
                    int iF2 = of2Var != null ? of2.f(of2Var.a) : -1;
                    of2 of2Var2 = g11Var.h.c;
                    dq0Var.q().updateSelection((View) dq0Var.f, iF, iE, iF2, of2Var2 != null ? of2.e(of2Var2.a) : -1);
                    return;
                }
                return;
            }
            if (te2Var != null && (!ws0.j(te2Var.a.f, te2Var2.a.f) || (of2.b(te2Var.b, te2Var2.b) && !ws0.j(te2Var.c, te2Var2.c)))) {
                dq0 dq0Var2 = g11Var.b;
                dq0Var2.q().restartInput((View) dq0Var2.f);
                return;
            }
            int size2 = g11Var.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                vr1 vr1Var2 = (vr1) ((WeakReference) g11Var.j.get(i2)).get();
                if (vr1Var2 != null) {
                    te2 te2Var3 = g11Var.h;
                    dq0 dq0Var3 = g11Var.b;
                    if (vr1Var2.k) {
                        vr1Var2.g = te2Var3;
                        if (vr1Var2.i) {
                            dq0Var3.q().updateExtractedText((View) dq0Var3.f, vr1Var2.h, qx.a0(te2Var3));
                        }
                        of2 of2Var3 = te2Var3.c;
                        long j = te2Var3.b;
                        int iF3 = of2Var3 != null ? of2.f(of2Var3.a) : -1;
                        of2 of2Var4 = te2Var3.c;
                        dq0Var3.q().updateSelection((View) dq0Var3.f, of2.f(j), of2.e(j), iF3, of2Var4 != null ? of2.e(of2Var4.a) : -1);
                    }
                }
            }
        }
    }

    @Override // defpackage.kn1
    public final void d() {
        l72 l72Var;
        z01 z01Var = this.a;
        if (z01Var == null || (l72Var = (l72) ir2.j(z01Var, yv.q)) == null) {
            return;
        }
        ((e40) l72Var).b();
    }

    @Override // defpackage.kn1
    public final void e() {
        l72 l72Var;
        z01 z01Var = this.a;
        if (z01Var == null || (l72Var = (l72) ir2.j(z01Var, yv.q)) == null) {
            return;
        }
        ((e40) l72Var).a();
    }

    @Override // defpackage.kn1
    public final void f() {
        j82 j82Var = this.b;
        if (j82Var != null) {
            j82Var.d(null);
        }
        this.b = null;
        aa1 aa1VarI = i();
        if (aa1VarI != null) {
            n42 n42Var = (n42) aa1VarI;
            synchronized (n42Var) {
                n42Var.u(n42Var.o() + ((long) n42Var.o), n42Var.n, n42Var.o() + ((long) n42Var.o), n42Var.o() + ((long) n42Var.o) + ((long) n42Var.p));
            }
        }
    }

    @Override // defpackage.kn1
    public final void g(yr1 yr1Var) {
        Rect rect;
        g11 g11Var = this.c;
        if (g11Var != null) {
            g11Var.l = new Rect(p61.j0(yr1Var.a), p61.j0(yr1Var.b), p61.j0(yr1Var.c), p61.j0(yr1Var.d));
            if (!g11Var.j.isEmpty() || (rect = g11Var.l) == null) {
                return;
            }
            g11Var.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // defpackage.kn1
    public final void h(te2 te2Var, oo0 oo0Var, o1 o1Var, ey eyVar) {
        j(new q2(te2Var, this, oo0Var, o1Var, eyVar, 1));
    }

    public final aa1 i() {
        n42 n42Var = this.d;
        if (n42Var != null) {
            return n42Var;
        }
        if (!t92.a) {
            return null;
        }
        n42 n42VarF = ws0.f(2, vk.g);
        this.d = n42VarF;
        return n42VarF;
    }

    public final void j(q2 q2Var) {
        z01 z01Var = this.a;
        if (z01Var == null) {
            return;
        }
        j82 j82Var = null;
        this.b = z01Var.r ? nj2.y(z01Var.t0(), null, new e(19, j82Var, z01Var, new n7(q2Var, this, z01Var, j82Var, 0)), 1) : null;
    }

    public final void k(z01 z01Var) {
        if (this.a != z01Var) {
            yp0.c("Expected textInputModifierNode to be " + z01Var + " but was " + this.a);
        }
        this.a = null;
    }
}
