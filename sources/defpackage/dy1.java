package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class dy1 extends y71 {
    public final oy1 a;
    public final di1 b;
    public final boolean c;
    public final boolean d;
    public final f91 e;

    public dy1(oy1 oy1Var, di1 di1Var, boolean z, boolean z2, f91 f91Var) {
        this.a = oy1Var;
        this.b = di1Var;
        this.c = z;
        this.d = z2;
        this.e = f91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy1)) {
            return false;
        }
        dy1 dy1Var = (dy1) obj;
        return ws0.j(this.a, dy1Var.a) && this.b == dy1Var.b && this.c == dy1Var.c && this.d == dy1Var.d && ws0.j(this.e, dy1Var.e);
    }

    @Override // defpackage.y71
    public final t71 f() {
        return new ny1(null, null, this.e, this.b, this.a, this.c, this.d);
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        ((ny1) t71Var).Y0(null, null, this.e, this.b, this.a, this.c, this.d);
    }

    public final int hashCode() {
        int iF = k3.f(k3.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 961, 31, this.c), 961, this.d);
        f91 f91Var = this.e;
        return (iF + (f91Var != null ? f91Var.hashCode() : 0)) * 31;
    }
}
