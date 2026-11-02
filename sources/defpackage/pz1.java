package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class pz1 extends y71 {
    public final boolean a;
    public final f91 b;
    public final bp0 c;
    public final boolean d;
    public final boolean e;
    public final wu1 f;
    public final ti0 g;

    public pz1(boolean z, f91 f91Var, bp0 bp0Var, boolean z2, boolean z3, wu1 wu1Var, ti0 ti0Var) {
        this.a = z;
        this.b = f91Var;
        this.c = bp0Var;
        this.d = z2;
        this.e = z3;
        this.f = wu1Var;
        this.g = ti0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pz1.class != obj.getClass()) {
            return false;
        }
        pz1 pz1Var = (pz1) obj;
        return this.a == pz1Var.a && ws0.j(this.b, pz1Var.b) && ws0.j(this.c, pz1Var.c) && this.d == pz1Var.d && this.e == pz1Var.e && ws0.j(this.f, pz1Var.f) && this.g == pz1Var.g;
    }

    @Override // defpackage.y71
    public final t71 f() {
        rz1 rz1Var = new rz1(this.b, this.c, this.d, this.e, null, this.f, this.g);
        rz1Var.Q = this.a;
        return rz1Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        rz1 rz1Var = (rz1) t71Var;
        boolean z = rz1Var.Q;
        boolean z2 = this.a;
        if (z != z2) {
            rz1Var.Q = z2;
            n02.l(rz1Var);
        }
        rz1Var.O0(this.b, this.c, this.d, this.e, null, this.f, this.g);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        f91 f91Var = this.b;
        int iHashCode2 = (iHashCode + (f91Var != null ? f91Var.hashCode() : 0)) * 31;
        bp0 bp0Var = this.c;
        int iF = k3.f(k3.f((iHashCode2 + (bp0Var != null ? bp0Var.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
        wu1 wu1Var = this.f;
        return this.g.hashCode() + ((iF + (wu1Var != null ? Integer.hashCode(wu1Var.a) : 0)) * 31);
    }
}
