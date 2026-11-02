package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class hj1 extends y71 {
    public final gj1 a;

    public hj1(gj1 gj1Var) {
        this.a = gj1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hj1) {
            return ((hj1) obj).a.equals(this.a);
        }
        return false;
    }

    @Override // defpackage.y71
    public final t71 f() {
        ij1 ij1Var = new ij1();
        ij1Var.u = this.a;
        return ij1Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        ij1 ij1Var = (ij1) t71Var;
        gj1 gj1Var = ij1Var.u;
        gj1 gj1Var2 = this.a;
        if (gj1Var2.equals(gj1Var)) {
            return;
        }
        ij1Var.u = gj1Var2;
        ij1Var.G0();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
