package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class j22 {
    public final long a;
    public final long b;
    public final long c;
    public final int d;
    public final Integer e;
    public final Long f;
    public final Double g;
    public final String h;
    public final String i;

    public j22(long j, long j2, long j3, int i, Integer num, Long l, Double d, String str, String str2) {
        str2.getClass();
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = i;
        this.e = num;
        this.f = l;
        this.g = d;
        this.h = str;
        this.i = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j22)) {
            return false;
        }
        j22 j22Var = (j22) obj;
        return this.a == j22Var.a && this.b == j22Var.b && this.c == j22Var.c && this.d == j22Var.d && ws0.j(this.e, j22Var.e) && ws0.j(this.f, j22Var.f) && ws0.j(this.g, j22Var.g) && ws0.j(this.h, j22Var.h) && ws0.j(this.i, j22Var.i);
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
        return "ServiceRecordEntity(id=" + this.a + ", carId=" + this.b + ", serviceTypeId=" + this.c + ", epochDay=" + this.d + ", odometerKm=" + this.e + ", cost=" + this.f + ", quantity=" + this.g + ", note=" + this.h + ", action=" + this.i + ")";
    }
}
