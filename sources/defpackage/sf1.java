package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class sf1 {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final String e;
    public final Long f;

    public sf1(long j, long j2, int i, int i2, String str, Long l) {
        str.getClass();
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf1)) {
            return false;
        }
        sf1 sf1Var = (sf1) obj;
        return this.a == sf1Var.a && this.b == sf1Var.b && this.c == sf1Var.c && this.d == sf1Var.d && ws0.j(this.e, sf1Var.e) && ws0.j(this.f, sf1Var.f);
    }

    public final int hashCode() {
        int iE = k3.e(k3.b(this.d, k3.b(this.c, k3.c(Long.hashCode(this.a) * 31, 31, this.b), 31), 31), 31, this.e);
        Long l = this.f;
        return iE + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "OdometerReadingEntity(id=" + this.a + ", carId=" + this.b + ", epochDay=" + this.c + ", odometerKm=" + this.d + ", source=" + this.e + ", recordId=" + this.f + ")";
    }
}
