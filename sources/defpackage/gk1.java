package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class gk1 extends y71 {
    public final o1 a;

    public gk1(o1 o1Var) {
        this.a = o1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gk1) {
            return this.a == ((gk1) obj).a;
        }
        return false;
    }

    @Override // defpackage.y71
    public final t71 f() {
        fk1 fk1Var = new fk1();
        fk1Var.s = this.a;
        return fk1Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        fk1 fk1Var = (fk1) t71Var;
        fk1Var.s = this.a;
        n02.l(fk1Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
