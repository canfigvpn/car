package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class gc0 implements uo2 {
    public final uo2 a;
    public final uo2 b;

    public gc0(uo2 uo2Var, uo2 uo2Var2) {
        this.a = uo2Var;
        this.b = uo2Var2;
    }

    @Override // defpackage.uo2
    public final int a(m40 m40Var) {
        int iA = this.a.a(m40Var) - this.b.a(m40Var);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // defpackage.uo2
    public final int b(m40 m40Var) {
        int iB = this.a.b(m40Var) - this.b.b(m40Var);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // defpackage.uo2
    public final int c(m40 m40Var, kw0 kw0Var) {
        int iC = this.a.c(m40Var, kw0Var) - this.b.c(m40Var, kw0Var);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // defpackage.uo2
    public final int d(m40 m40Var, kw0 kw0Var) {
        int iD = this.a.d(m40Var, kw0Var) - this.b.d(m40Var, kw0Var);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc0)) {
            return false;
        }
        gc0 gc0Var = (gc0) obj;
        return ws0.j(gc0Var.a, this.a) && ws0.j(gc0Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}
