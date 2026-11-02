package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class zz0 extends y71 {
    public final ti0 a;
    public final xz0 b;
    public final di1 c;
    public final boolean d;

    public zz0(ti0 ti0Var, xz0 xz0Var, di1 di1Var, boolean z) {
        this.a = ti0Var;
        this.b = xz0Var;
        this.c = di1Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz0)) {
            return false;
        }
        zz0 zz0Var = (zz0) obj;
        return this.a == zz0Var.a && ws0.j(this.b, zz0Var.b) && this.c == zz0Var.c && this.d == zz0Var.d;
    }

    @Override // defpackage.y71
    public final t71 f() {
        return new c01(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        c01 c01Var = (c01) t71Var;
        c01Var.s = this.a;
        c01Var.t = this.b;
        di1 di1Var = c01Var.u;
        di1 di1Var2 = this.c;
        if (di1Var != di1Var2) {
            c01Var.u = di1Var2;
            n02.l(c01Var);
        }
        boolean z = c01Var.v;
        boolean z2 = this.d;
        if (z == z2) {
            return;
        }
        c01Var.v = z2;
        c01Var.F0();
        n02.l(c01Var);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + k3.f((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }
}
