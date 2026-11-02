package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class hk1 extends y71 {
    public final ak1 a;

    public hk1(ak1 ak1Var) {
        this.a = ak1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hk1) && ws0.j(this.a, ((hk1) obj).a);
    }

    @Override // defpackage.y71
    public final t71 f() {
        ik1 ik1Var = new ik1();
        ik1Var.s = 1.0f;
        ik1Var.t = this.a;
        return ik1Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        ik1 ik1Var = (ik1) t71Var;
        ik1Var.s = 1.0f;
        ik1Var.t = this.a;
    }

    public final int hashCode() {
        ak1 ak1Var = this.a;
        return Float.hashCode(1.0f) + ((ak1Var != null ? ak1Var.hashCode() : 0) * 961);
    }
}
