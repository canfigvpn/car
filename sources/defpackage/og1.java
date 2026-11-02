package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class og1 extends y71 {
    public final ej0 a;

    public og1(ej0 ej0Var) {
        this.a = ej0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof og1) {
            return this.a == ((og1) obj).a;
        }
        return false;
    }

    @Override // defpackage.y71
    public final t71 f() {
        pg1 pg1Var = new pg1();
        pg1Var.s = this.a;
        pg1Var.t = -9223372034707292160L;
        return pg1Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        pg1 pg1Var = (pg1) t71Var;
        pg1Var.s = this.a;
        pg1Var.t = -9223372034707292160L;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
