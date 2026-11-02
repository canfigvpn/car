package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class f51 extends y71 {
    public final lc a;
    public final pe2 b;
    public final sm1 c;

    public f51(lc lcVar, pe2 pe2Var, sm1 sm1Var) {
        this.a = lcVar;
        this.b = pe2Var;
        this.c = sm1Var;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.y71
    public final t71 f() {
        return new h51(this.a, this.b, this.c);
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        h51 h51Var = (h51) t71Var;
        float f = h51Var.u;
        long j = h51Var.w;
        float f2 = h51Var.x;
        boolean z = h51Var.v;
        float f3 = h51Var.y;
        boolean z2 = h51Var.z;
        sm1 sm1Var = h51Var.A;
        View view = h51Var.B;
        m40 m40Var = h51Var.C;
        h51Var.s = this.a;
        h51Var.u = Float.NaN;
        h51Var.v = true;
        h51Var.w = 9205357640488583168L;
        h51Var.x = Float.NaN;
        h51Var.y = Float.NaN;
        h51Var.z = true;
        h51Var.t = this.b;
        sm1 sm1Var2 = this.c;
        h51Var.A = sm1Var2;
        View viewE = ux.E(h51Var);
        m40 m40Var2 = qx.V(h51Var).B;
        if (h51Var.D != null) {
            y02 y02Var = i51.a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(f)) && Float.NaN != f && !sm1Var2.a()) || 9205357640488583168L != j || !w60.b(Float.NaN, f2) || !w60.b(Float.NaN, f3) || true != z || true != z2 || !sm1Var2.equals(sm1Var) || !viewE.equals(view) || !ws0.j(m40Var2, m40Var)) {
                h51Var.G0();
            }
        }
        h51Var.H0();
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + k3.f(k3.a(Float.NaN, k3.a(Float.NaN, k3.c(k3.f(k3.a(Float.NaN, this.a.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true)) * 31);
    }
}
