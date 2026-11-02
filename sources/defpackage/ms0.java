package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class ms0 extends y71 {
    public final qs0 a;

    public ms0(qs0 qs0Var) {
        this.a = qs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ms0 ms0Var = obj instanceof ms0 ? (ms0) obj : null;
        return ms0Var != null && this.a == ms0Var.a;
    }

    @Override // defpackage.y71
    public final t71 f() {
        ns0 ns0Var = new ns0(0);
        ns0Var.t = this.a;
        ns0Var.u = true;
        return ns0Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        ns0 ns0Var = (ns0) t71Var;
        ns0Var.t = this.a;
        ns0Var.u = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }
}
