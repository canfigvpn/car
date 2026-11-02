package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qf1 {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final tf1 e;
    public final Long f;

    public qf1(long j, long j2, int i, int i2, tf1 tf1Var, Long l) {
        tf1Var.getClass();
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = tf1Var;
        this.f = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf1)) {
            return false;
        }
        qf1 qf1Var = (qf1) obj;
        return this.a == qf1Var.a && this.b == qf1Var.b && this.c == qf1Var.c && this.d == qf1Var.d && this.e == qf1Var.e && ws0.j(this.f, qf1Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + k3.b(this.d, k3.b(this.c, k3.c(Long.hashCode(this.a) * 31, 31, this.b), 31), 31)) * 31;
        Long l = this.f;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "OdometerReading(id=" + this.a + ", carId=" + this.b + ", epochDay=" + this.c + ", odometerKm=" + this.d + ", source=" + this.e + ", recordId=" + this.f + ")";
    }
}
