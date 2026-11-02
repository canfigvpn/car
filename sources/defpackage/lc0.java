package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class lc0 extends y71 {
    public final r9 a;

    public lc0(r9 r9Var) {
        this.a = r9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lc0) {
            return this.a == ((lc0) obj).a;
        }
        return false;
    }

    @Override // defpackage.y71
    public final t71 f() {
        mc0 mc0Var = new mc0();
        mc0Var.s = this.a;
        return mc0Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        ((mc0) t71Var).s = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
