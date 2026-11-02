package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class gl2 implements ae {
    public final Object e;
    public final ArrayList f = new ArrayList();
    public Object g;

    public gl2(ax0 ax0Var) {
        this.e = ax0Var;
        this.g = ax0Var;
    }

    public final void a() {
        this.f.clear();
        this.g = this.e;
        ((ax0) this.e).P();
    }

    @Override // defpackage.ae
    public final void c(int i, Object obj) {
        ((ax0) this.g).B(i, (ax0) obj);
    }

    @Override // defpackage.ae
    public final void d(Object obj) {
        this.f.add(this.g);
        this.g = obj;
    }

    @Override // defpackage.ae
    public final void e() {
        as1 rectManager;
        h4 h4Var;
        as1 rectManager2;
        ax0 ax0Var = (ax0) this.g;
        he1 he1Var = ax0Var.I;
        if (!ax0Var.H()) {
            vp0.a("onReuse is only expected on attached node");
        }
        ox0 ox0Var = ax0Var.K;
        if (ox0Var != null) {
            ox0Var.i(false);
        }
        ax0Var.w = false;
        if (ax0Var.R) {
            ax0Var.R = false;
        } else {
            t71 t71Var = ax0Var.I.e;
            for (t71 t71Var2 = t71Var; t71Var2 != null; t71Var2 = t71Var2.i) {
                if (t71Var2.r) {
                    t71Var2.A0();
                }
            }
            for (t71 t71Var3 = t71Var; t71Var3 != null; t71Var3 = t71Var3.i) {
                if (t71Var3.r) {
                    t71Var3.C0();
                }
            }
            while (t71Var != null) {
                if (t71Var.r) {
                    t71Var.w0();
                }
                t71Var = t71Var.i;
            }
        }
        int i = ax0Var.f;
        aj1 aj1Var = ax0Var.r;
        if (aj1Var != null && (rectManager2 = ((e5) aj1Var).getRectManager()) != null) {
            rectManager2.g(ax0Var);
        }
        ax0Var.f = l02.a.addAndGet(1);
        aj1 aj1Var2 = ax0Var.r;
        if (aj1Var2 != null) {
            e5 e5Var = (e5) aj1Var2;
            e5Var.m7getLayoutNodes().g(i);
            e5Var.m7getLayoutNodes().h(ax0Var.f, ax0Var);
        }
        for (t71 t71Var4 = he1Var.f; t71Var4 != null; t71Var4 = t71Var4.j) {
            t71Var4.v0();
        }
        he1Var.e();
        if (he1Var.c(8)) {
            ax0Var.F();
        }
        ax0.W(ax0Var);
        aj1 aj1Var3 = ax0Var.r;
        if (aj1Var3 != null) {
            e5 e5Var2 = (e5) aj1Var3;
            if (e5.f() && (h4Var = e5Var2.Q) != null) {
                e5 e5Var3 = h4Var.g;
                qk1 qk1Var = h4Var.e;
                e91 e91Var = h4Var.l;
                if (e91Var.e(i)) {
                    qk1Var.B(e5Var3, i, false);
                }
                i02 i02VarW = ax0Var.w();
                if (i02VarW != null && i02VarW.e.b(u02.r)) {
                    e91Var.a(ax0Var.f);
                    qk1Var.B(e5Var3, ax0Var.f, true);
                }
            }
        }
        aj1 aj1Var4 = ax0Var.r;
        if (aj1Var4 == null || (rectManager = ((e5) aj1Var4).getRectManager()) == null) {
            return;
        }
        rectManager.f(ax0Var);
    }

    @Override // defpackage.ae
    public final void f(int i, Object obj) {
    }

    @Override // defpackage.ae
    public final void g() {
        aj1 aj1Var = ((ax0) this.e).r;
        if (aj1Var != null) {
            ((e5) aj1Var).x();
        }
    }

    @Override // defpackage.ae
    public final void h(int i, int i2, int i3) {
        ((ax0) this.g).L(i, i2, i3);
    }

    @Override // defpackage.ae
    public final Object i() {
        return this.g;
    }

    @Override // defpackage.ae
    public final void j(int i, int i2) {
        ((ax0) this.g).Q(i, i2);
    }

    @Override // defpackage.ae
    public final void s() {
        ArrayList arrayList = this.f;
        this.g = arrayList.remove(arrayList.size() - 1);
    }
}
