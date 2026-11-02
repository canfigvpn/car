package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class r22 {
    public final long a;
    public final long b;
    public final Integer c;
    public final Integer d;
    public final boolean e;

    public r22(long j, long j2, Integer num, Integer num2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = num;
        this.d = num2;
        this.e = z;
    }

    public static r22 a(r22 r22Var, Integer num, Integer num2, boolean z, int i) {
        long j = r22Var.a;
        long j2 = r22Var.b;
        if ((i & 4) != 0) {
            num = r22Var.c;
        }
        Integer num3 = num;
        if ((i & 8) != 0) {
            num2 = r22Var.d;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            z = r22Var.e;
        }
        return new r22(j, j2, num3, num4, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r22)) {
            return false;
        }
        r22 r22Var = (r22) obj;
        return this.a == r22Var.a && this.b == r22Var.b && ws0.j(this.c, r22Var.c) && ws0.j(this.d, r22Var.d) && this.e == r22Var.e;
    }

    public final int hashCode() {
        int iC = k3.c(Long.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ServiceSchedule(carId=" + this.a + ", serviceTypeId=" + this.b + ", intervalKm=" + this.c + ", intervalMonths=" + this.d + ", enabled=" + this.e + ")";
    }
}
