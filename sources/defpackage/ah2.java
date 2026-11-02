package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class ah2 extends y71 {
    public final boolean a;
    public final f91 b;
    public final boolean c;
    public final boolean d;
    public final wu1 e;
    public final ej0 f;

    public ah2(boolean z, f91 f91Var, boolean z2, boolean z3, wu1 wu1Var, ej0 ej0Var) {
        this.a = z;
        this.b = f91Var;
        this.c = z2;
        this.d = z3;
        this.e = wu1Var;
        this.f = ej0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ah2.class != obj.getClass()) {
            return false;
        }
        ah2 ah2Var = (ah2) obj;
        return this.a == ah2Var.a && ws0.j(this.b, ah2Var.b) && this.c == ah2Var.c && this.d == ah2Var.d && this.e.equals(ah2Var.e) && this.f == ah2Var.f;
    }

    @Override // defpackage.y71
    public final t71 f() {
        return new bh2(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        bh2 bh2Var = (bh2) t71Var;
        boolean z = bh2Var.Q;
        boolean z2 = this.a;
        if (z != z2) {
            bh2Var.Q = z2;
            n02.l(bh2Var);
        }
        bh2Var.R = this.f;
        bh2Var.O0(this.b, null, this.c, this.d, null, this.e, bh2Var.S);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        f91 f91Var = this.b;
        return this.f.hashCode() + k3.b(this.e.a, k3.f(k3.f((iHashCode + (f91Var != null ? f91Var.hashCode() : 0)) * 961, 31, this.c), 31, this.d), 31);
    }
}
