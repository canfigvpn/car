package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class sn0 implements qw0 {
    public final de2 a;
    public final int b;
    public final bi2 c;
    public final ti0 d;

    public sn0(de2 de2Var, int i, bi2 bi2Var, ti0 ti0Var) {
        this.a = de2Var;
        this.b = i;
        this.c = bi2Var;
        this.d = ti0Var;
    }

    @Override // defpackage.qw0
    public final x61 e(y61 y61Var, r61 r61Var, long j) {
        long j2;
        if (r61Var.a0(sw.g(j)) < sw.h(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = sw.a(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        jm1 jm1VarE = r61Var.e(j);
        int iMin = Math.min(jm1VarE.e, sw.h(j2));
        return y61Var.d0(iMin, jm1VarE.f, db0.e, new t40(this, y61Var, jm1VarE, iMin, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sn0) {
            sn0 sn0Var = (sn0) obj;
            if (this.a == sn0Var.a && this.b == sn0Var.b && this.c.equals(sn0Var.c) && ws0.j(this.d, sn0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + k3.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}
