package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cn {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final int k;
    public final int l;
    public final Integer m;
    public final int n;

    public cn(long j, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, int i, int i2, Integer num2, int i3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = num;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = i;
        this.l = i2;
        this.m = num2;
        this.n = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn)) {
            return false;
        }
        cn cnVar = (cn) obj;
        return this.a == cnVar.a && ws0.j(this.b, cnVar.b) && ws0.j(this.c, cnVar.c) && ws0.j(this.d, cnVar.d) && ws0.j(this.e, cnVar.e) && ws0.j(this.f, cnVar.f) && ws0.j(this.g, cnVar.g) && ws0.j(this.h, cnVar.h) && ws0.j(this.i, cnVar.i) && ws0.j(this.j, cnVar.j) && this.k == cnVar.k && this.l == cnVar.l && ws0.j(this.m, cnVar.m) && this.n == cnVar.n;
    }

    public final int hashCode() {
        int iE = k3.e(k3.e(k3.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        Integer num = this.e;
        int iB = k3.b(this.l, k3.b(this.k, k3.e(k3.e(k3.e(k3.e(k3.e((iE + (num == null ? 0 : num.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31);
        Integer num2 = this.m;
        return Integer.hashCode(this.n) + ((iB + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CarEntity(id=" + this.a + ", name=" + this.b + ", make=" + this.c + ", model=" + this.d + ", year=" + this.e + ", plateTwoDigits=" + this.f + ", plateLetter=" + this.g + ", plateThreeDigits=" + this.h + ", plateRegion=" + this.i + ", fuelType=" + this.j + ", currentOdometerKm=" + this.k + ", odometerUpdatedEpochDay=" + this.l + ", typicalDailyKm=" + this.m + ", createdEpochDay=" + this.n + ")";
    }
}
