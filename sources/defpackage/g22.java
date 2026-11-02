package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class g22 {
    public final long a;
    public final long b;
    public final long c;
    public final int d;
    public final Integer e;
    public final Long f;
    public final Double g;
    public final String h;
    public final d22 i;

    public g22(long j, long j2, long j3, int i, Integer num, Long l, Double d, String str, d22 d22Var) {
        d22Var.getClass();
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = i;
        this.e = num;
        this.f = l;
        this.g = d;
        this.h = str;
        this.i = d22Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g22)) {
            return false;
        }
        g22 g22Var = (g22) obj;
        return this.a == g22Var.a && this.b == g22Var.b && this.c == g22Var.c && this.d == g22Var.d && ws0.j(this.e, g22Var.e) && ws0.j(this.f, g22Var.f) && ws0.j(this.g, g22Var.g) && ws0.j(this.h, g22Var.h) && this.i == g22Var.i;
    }

    public final int hashCode() {
        int iB = k3.b(this.d, k3.c(k3.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
        Integer num = this.e;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.f;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Double d = this.g;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.h;
        return this.i.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ServiceRecord(id=" + this.a + ", carId=" + this.b + ", serviceTypeId=" + this.c + ", epochDay=" + this.d + ", odometerKm=" + this.e + ", cost=" + this.f + ", quantity=" + this.g + ", note=" + this.h + ", action=" + this.i + ")";
    }
}
