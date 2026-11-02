package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ln1 {
    public final gn1 a;
    public final ym1 b;

    public ln1(gn1 gn1Var, ym1 ym1Var) {
        this.a = gn1Var;
        this.b = ym1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln1)) {
            return false;
        }
        ln1 ln1Var = (ln1) obj;
        return ws0.j(this.b, ln1Var.b) && ws0.j(this.a, ln1Var.a);
    }

    public final int hashCode() {
        gn1 gn1Var = this.a;
        int iHashCode = (gn1Var != null ? gn1Var.hashCode() : 0) * 31;
        ym1 ym1Var = this.b;
        return iHashCode + (ym1Var != null ? ym1Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }
}
