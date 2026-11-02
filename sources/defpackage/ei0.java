package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ei0 {
    public final long a;
    public final int b;
    public final double c;

    public ei0(long j, int i, double d) {
        this.a = j;
        this.b = i;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei0)) {
            return false;
        }
        ei0 ei0Var = (ei0) obj;
        return this.a == ei0Var.a && this.b == ei0Var.b && Double.compare(this.c, ei0Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + k3.b(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "FuelLeg(endRecordId=" + this.a + ", distanceKm=" + this.b + ", litres=" + this.c + ")";
    }
}
