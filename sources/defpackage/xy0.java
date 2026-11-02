package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class xy0 extends y71 {
    public final bz0 a;
    public final ck b;
    public final di1 c;

    public xy0(bz0 bz0Var, ck ckVar, di1 di1Var) {
        this.a = bz0Var;
        this.b = ckVar;
        this.c = di1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy0)) {
            return false;
        }
        xy0 xy0Var = (xy0) obj;
        return ws0.j(this.a, xy0Var.a) && ws0.j(this.b, xy0Var.b) && this.c == xy0Var.c;
    }

    @Override // defpackage.y71
    public final t71 f() {
        az0 az0Var = new az0();
        az0Var.s = this.a;
        az0Var.t = this.b;
        az0Var.u = this.c;
        return az0Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        az0 az0Var = (az0) t71Var;
        az0Var.s = this.a;
        az0Var.t = this.b;
        az0Var.u = this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k3.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, false);
    }
}
