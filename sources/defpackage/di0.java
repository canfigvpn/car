package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class di0 {
    public final g22 a;
    public final Double b;

    public di0(g22 g22Var, Double d) {
        this.a = g22Var;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di0)) {
            return false;
        }
        di0 di0Var = (di0) obj;
        return this.a.equals(di0Var.a) && ws0.j(this.b, di0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Double d = this.b;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }

    public final String toString() {
        return "FuelEntry(record=" + this.a + ", litresPer100Km=" + this.b + ")";
    }
}
