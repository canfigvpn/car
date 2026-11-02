package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class lm0 {
    public final g22 a;
    public final u22 b;

    public lm0(g22 g22Var, u22 u22Var) {
        this.a = g22Var;
        this.b = u22Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm0)) {
            return false;
        }
        lm0 lm0Var = (lm0) obj;
        return this.a.equals(lm0Var.a) && ws0.j(this.b, lm0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        u22 u22Var = this.b;
        return iHashCode + (u22Var == null ? 0 : u22Var.hashCode());
    }

    public final String toString() {
        return "HistoryEntry(record=" + this.a + ", serviceType=" + this.b + ")";
    }
}
