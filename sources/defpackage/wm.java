package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wm {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final j11 f;
    public final ni0 g;
    public final int h;
    public final int i;
    public final Integer j;
    public final int k;

    public wm(long j, String str, String str2, String str3, Integer num, j11 j11Var, ni0 ni0Var, int i, int i2, Integer num2, int i3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        ni0Var.getClass();
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = num;
        this.f = j11Var;
        this.g = ni0Var;
        this.h = i;
        this.i = i2;
        this.j = num2;
        this.k = i3;
    }

    public static wm a(wm wmVar, int i, int i2) {
        long j = wmVar.a;
        String str = wmVar.b;
        String str2 = wmVar.c;
        String str3 = wmVar.d;
        Integer num = wmVar.e;
        j11 j11Var = wmVar.f;
        ni0 ni0Var = wmVar.g;
        int i3 = wmVar.h;
        Integer num2 = wmVar.j;
        wmVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        ni0Var.getClass();
        return new wm(j, str, str2, str3, num, j11Var, ni0Var, i3, i, num2, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm)) {
            return false;
        }
        wm wmVar = (wm) obj;
        return this.a == wmVar.a && ws0.j(this.b, wmVar.b) && ws0.j(this.c, wmVar.c) && ws0.j(this.d, wmVar.d) && ws0.j(this.e, wmVar.e) && this.f.equals(wmVar.f) && this.g == wmVar.g && this.h == wmVar.h && this.i == wmVar.i && ws0.j(this.j, wmVar.j) && this.k == wmVar.k;
    }

    public final int hashCode() {
        int iE = k3.e(k3.e(k3.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        Integer num = this.e;
        int iB = k3.b(this.i, k3.b(this.h, (this.g.hashCode() + ((this.f.hashCode() + ((iE + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31, 31), 31);
        Integer num2 = this.j;
        return Integer.hashCode(this.k) + ((iB + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Car(id=" + this.a + ", name=" + this.b + ", make=" + this.c + ", model=" + this.d + ", year=" + this.e + ", plate=" + this.f + ", fuelType=" + this.g + ", currentOdometerKm=" + this.h + ", odometerUpdatedEpochDay=" + this.i + ", typicalDailyKm=" + this.j + ", createdEpochDay=" + this.k + ")";
    }
}
