package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class yq2 extends y71 {
    public final n50 a;
    public final ij0 b;
    public final Object c;

    public yq2(n50 n50Var, ij0 ij0Var, Object obj) {
        this.a = n50Var;
        this.b = ij0Var;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yq2.class != obj.getClass()) {
            return false;
        }
        yq2 yq2Var = (yq2) obj;
        return this.a == yq2Var.a && ws0.j(this.c, yq2Var.c);
    }

    @Override // defpackage.y71
    public final t71 f() {
        ar2 ar2Var = new ar2();
        ar2Var.s = this.a;
        ar2Var.t = this.b;
        return ar2Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        ar2 ar2Var = (ar2) t71Var;
        ar2Var.s = this.a;
        ar2Var.t = this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + k3.f(this.a.hashCode() * 31, 31, false);
    }
}
