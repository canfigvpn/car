package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class e3 implements uo2 {
    public final uo2 a;
    public final lj1 b;

    public e3(uo2 uo2Var, lj1 lj1Var) {
        this.a = uo2Var;
        this.b = lj1Var;
    }

    @Override // defpackage.uo2
    public final int a(m40 m40Var) {
        return this.b.a(m40Var) + this.a.a(m40Var);
    }

    @Override // defpackage.uo2
    public final int b(m40 m40Var) {
        return this.b.b(m40Var) + this.a.b(m40Var);
    }

    @Override // defpackage.uo2
    public final int c(m40 m40Var, kw0 kw0Var) {
        return this.b.c(m40Var, kw0Var) + this.a.c(m40Var, kw0Var);
    }

    @Override // defpackage.uo2
    public final int d(m40 m40Var, kw0 kw0Var) {
        return this.b.d(m40Var, kw0Var) + this.a.d(m40Var, kw0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj;
        return ws0.j(e3Var.a, this.a) && e3Var.b.equals(this.b);
    }

    public final int hashCode() {
        return (this.b.a.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " + " + this.b + ')';
    }
}
