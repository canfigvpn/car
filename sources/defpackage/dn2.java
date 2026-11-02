package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class dn2 implements qw0 {
    public final de2 a;
    public final int b;
    public final bi2 c;
    public final ti0 d;

    public dn2(de2 de2Var, int i, bi2 bi2Var, ti0 ti0Var) {
        this.a = de2Var;
        this.b = i;
        this.c = bi2Var;
        this.d = ti0Var;
    }

    @Override // defpackage.qw0
    public final x61 e(y61 y61Var, r61 r61Var, long j) {
        jm1 jm1VarE = r61Var.e(sw.a(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(jm1VarE.f, sw.g(j));
        return y61Var.d0(jm1VarE.e, iMin, db0.e, new md(this, jm1VarE, iMin));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dn2) {
            dn2 dn2Var = (dn2) obj;
            if (this.a == dn2Var.a && this.b == dn2Var.b && this.c.equals(dn2Var.c) && ws0.j(this.d, dn2Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + k3.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}
