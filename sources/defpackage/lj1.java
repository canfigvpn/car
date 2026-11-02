package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class lj1 implements uo2 {
    public final gj1 a;

    public lj1(gj1 gj1Var) {
        this.a = gj1Var;
    }

    @Override // defpackage.uo2
    public final int a(m40 m40Var) {
        return m40Var.O(this.a.c());
    }

    @Override // defpackage.uo2
    public final int b(m40 m40Var) {
        return m40Var.O(this.a.d());
    }

    @Override // defpackage.uo2
    public final int c(m40 m40Var, kw0 kw0Var) {
        return m40Var.O(this.a.b(kw0Var));
    }

    @Override // defpackage.uo2
    public final int d(m40 m40Var, kw0 kw0Var) {
        return m40Var.O(this.a.a(kw0Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lj1) {
            return ws0.j(((lj1) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        gj1 gj1Var = this.a;
        kw0 kw0Var = kw0.e;
        return "PaddingValues(" + ((Object) w60.c(gj1Var.a(kw0Var))) + ", " + ((Object) w60.c(gj1Var.d())) + ", " + ((Object) w60.c(gj1Var.b(kw0Var))) + ", " + ((Object) w60.c(gj1Var.c())) + ')';
    }
}
