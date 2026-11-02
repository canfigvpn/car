package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xn {
    public final long a;
    public final long b;
    public final Integer c;
    public final Integer d;
    public final boolean e;

    public xn(long j, long j2, Integer num, Integer num2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = num;
        this.d = num2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn)) {
            return false;
        }
        xn xnVar = (xn) obj;
        return this.a == xnVar.a && this.b == xnVar.b && ws0.j(this.c, xnVar.c) && ws0.j(this.d, xnVar.d) && this.e == xnVar.e;
    }

    public final int hashCode() {
        int iC = k3.c(Long.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CarServiceScheduleEntity(carId=" + this.a + ", serviceTypeId=" + this.b + ", intervalKm=" + this.c + ", intervalMonths=" + this.d + ", enabled=" + this.e + ")";
    }
}
