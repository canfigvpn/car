package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class jj1 extends y71 {
    public final gj1 a;

    public jj1(gj1 gj1Var) {
        this.a = gj1Var;
    }

    public final boolean equals(Object obj) {
        jj1 jj1Var = obj instanceof jj1 ? (jj1) obj : null;
        if (jj1Var == null) {
            return false;
        }
        return ws0.j(this.a, jj1Var.a);
    }

    @Override // defpackage.y71
    public final t71 f() {
        mj1 mj1Var = new mj1();
        mj1Var.s = this.a;
        return mj1Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        ((mj1) t71Var).s = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
