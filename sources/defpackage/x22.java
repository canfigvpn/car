package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class x22 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final Integer f;
    public final boolean g;
    public final boolean h;
    public final int i;

    public x22(long j, String str, String str2, String str3, Integer num, Integer num2, boolean z, boolean z2, int i) {
        str.getClass();
        str3.getClass();
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = num;
        this.f = num2;
        this.g = z;
        this.h = z2;
        this.i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x22)) {
            return false;
        }
        x22 x22Var = (x22) obj;
        return this.a == x22Var.a && ws0.j(this.b, x22Var.b) && ws0.j(this.c, x22Var.c) && ws0.j(this.d, x22Var.d) && ws0.j(this.e, x22Var.e) && ws0.j(this.f, x22Var.f) && this.g == x22Var.g && this.h == x22Var.h && this.i == x22Var.i;
    }

    public final int hashCode() {
        int iE = k3.e(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iE2 = k3.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        Integer num = this.e;
        int iHashCode = (iE2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        return Integer.hashCode(this.i) + k3.f(k3.f((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        return "ServiceTypeEntity(id=" + this.a + ", key=" + this.b + ", customName=" + this.c + ", icon=" + this.d + ", defaultIntervalKm=" + this.e + ", defaultIntervalMonths=" + this.f + ", tracksQuantity=" + this.g + ", isBuiltIn=" + this.h + ", sortOrder=" + this.i + ")";
    }
}
