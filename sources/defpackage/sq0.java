package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class sq0 implements gj1 {
    public final uo2 a;
    public final ba2 b;

    public sq0(uo2 uo2Var, ba2 ba2Var) {
        this.a = uo2Var;
        this.b = ba2Var;
    }

    @Override // defpackage.gj1
    public final float a(kw0 kw0Var) {
        uo2 uo2Var = this.a;
        ba2 ba2Var = this.b;
        return ba2Var.n0(uo2Var.d(ba2Var, kw0Var));
    }

    @Override // defpackage.gj1
    public final float b(kw0 kw0Var) {
        uo2 uo2Var = this.a;
        ba2 ba2Var = this.b;
        return ba2Var.n0(uo2Var.c(ba2Var, kw0Var));
    }

    @Override // defpackage.gj1
    public final float c() {
        uo2 uo2Var = this.a;
        ba2 ba2Var = this.b;
        return ba2Var.n0(uo2Var.a(ba2Var));
    }

    @Override // defpackage.gj1
    public final float d() {
        uo2 uo2Var = this.a;
        ba2 ba2Var = this.b;
        return ba2Var.n0(uo2Var.b(ba2Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq0)) {
            return false;
        }
        sq0 sq0Var = (sq0) obj;
        return ws0.j(this.a, sq0Var.a) && this.b.equals(sq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ')';
    }
}
