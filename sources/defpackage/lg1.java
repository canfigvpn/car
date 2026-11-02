package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class lg1 extends y71 {
    public final ej0 a;

    public lg1(ej0 ej0Var) {
        this.a = ej0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lg1) {
            return this.a == ((lg1) obj).a;
        }
        return false;
    }

    @Override // defpackage.y71
    public final t71 f() {
        mg1 mg1Var = new mg1();
        mg1Var.s = this.a;
        return mg1Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        ((mg1) t71Var).s = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
