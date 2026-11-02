package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class lw0 extends y71 {
    public final jj0 a;

    public lw0(jj0 jj0Var) {
        this.a = jj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lw0) {
            return this.a == ((lw0) obj).a;
        }
        return false;
    }

    @Override // defpackage.y71
    public final t71 f() {
        rw0 rw0Var = new rw0();
        rw0Var.s = this.a;
        return rw0Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        ((rw0) t71Var).s = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
