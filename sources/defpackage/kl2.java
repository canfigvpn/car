package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class kl2 implements uo2 {
    public final uo2 a;
    public final uo2 b;

    public kl2(uo2 uo2Var, uo2 uo2Var2) {
        this.a = uo2Var;
        this.b = uo2Var2;
    }

    @Override // defpackage.uo2
    public final int a(m40 m40Var) {
        return Math.max(this.a.a(m40Var), this.b.a(m40Var));
    }

    @Override // defpackage.uo2
    public final int b(m40 m40Var) {
        return Math.max(this.a.b(m40Var), this.b.b(m40Var));
    }

    @Override // defpackage.uo2
    public final int c(m40 m40Var, kw0 kw0Var) {
        return Math.max(this.a.c(m40Var, kw0Var), this.b.c(m40Var, kw0Var));
    }

    @Override // defpackage.uo2
    public final int d(m40 m40Var, kw0 kw0Var) {
        return Math.max(this.a.d(m40Var, kw0Var), this.b.d(m40Var, kw0Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl2)) {
            return false;
        }
        kl2 kl2Var = (kl2) obj;
        return ws0.j(kl2Var.a, this.a) && ws0.j(kl2Var.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}
