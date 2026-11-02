package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class c3 extends y71 {
    public final nb1 a;

    public c3(nb1 nb1Var) {
        this.a = nb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c3) {
            return this.a == ((c3) obj).a;
        }
        return false;
    }

    @Override // defpackage.y71
    public final t71 f() {
        d3 d3Var = new d3();
        d3Var.u = this.a;
        m mVar = new m(2, d3Var);
        b3 b3Var = new b3();
        b3Var.s = mVar;
        d3Var.F0(b3Var);
        return d3Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        ((d3) t71Var).u = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
