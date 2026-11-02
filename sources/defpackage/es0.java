package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class es0 {
    public final u22 a;
    public final r22 b;

    public es0(u22 u22Var, r22 r22Var) {
        this.a = u22Var;
        this.b = r22Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es0)) {
            return false;
        }
        es0 es0Var = (es0) obj;
        return this.a.equals(es0Var.a) && this.b.equals(es0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IntervalRow(serviceType=" + this.a + ", schedule=" + this.b + ")";
    }
}
