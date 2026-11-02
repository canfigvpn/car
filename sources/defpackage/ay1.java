package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class ay1 extends y71 {
    public final oy1 a;
    public final di1 b;
    public final boolean c;
    public final pd0 d;
    public final f91 e;
    public final boolean f;
    public final v6 g;

    public ay1(v6 v6Var, pd0 pd0Var, f91 f91Var, di1 di1Var, oy1 oy1Var, boolean z, boolean z2) {
        this.a = oy1Var;
        this.b = di1Var;
        this.c = z;
        this.d = pd0Var;
        this.e = f91Var;
        this.f = z2;
        this.g = v6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ay1.class != obj.getClass()) {
            return false;
        }
        ay1 ay1Var = (ay1) obj;
        return this.a.equals(ay1Var.a) && this.b == ay1Var.b && this.c == ay1Var.c && ws0.j(this.d, ay1Var.d) && ws0.j(this.e, ay1Var.e) && this.f == ay1Var.f && ws0.j(this.g, ay1Var.g);
    }

    @Override // defpackage.y71
    public final t71 f() {
        by1 by1Var = new by1();
        by1Var.u = this.a;
        by1Var.v = this.b;
        by1Var.w = this.c;
        by1Var.x = this.d;
        by1Var.y = this.e;
        by1Var.z = this.f;
        by1Var.A = this.g;
        return by1Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        ((by1) t71Var).K0(this.g, this.d, this.e, this.b, this.a, this.f, this.c);
    }

    public final int hashCode() {
        int iF = k3.f(k3.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, false);
        pd0 pd0Var = this.d;
        int iHashCode = (iF + (pd0Var != null ? pd0Var.hashCode() : 0)) * 31;
        f91 f91Var = this.e;
        int iF2 = k3.f((iHashCode + (f91Var != null ? f91Var.hashCode() : 0)) * 961, 31, this.f);
        v6 v6Var = this.g;
        return iF2 + (v6Var != null ? v6Var.hashCode() : 0);
    }
}
