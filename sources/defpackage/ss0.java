package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class ss0 extends y71 {
    public final qs0 a;

    public ss0(qs0 qs0Var) {
        this.a = qs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ss0 ss0Var = obj instanceof ss0 ? (ss0) obj : null;
        return ss0Var != null && this.a == ss0Var.a;
    }

    @Override // defpackage.y71
    public final t71 f() {
        us0 us0Var = new us0(0);
        us0Var.t = this.a;
        us0Var.u = true;
        return us0Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        us0 us0Var = (us0) t71Var;
        us0Var.t = this.a;
        us0Var.u = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }
}
