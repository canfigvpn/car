package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class kn {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final j11 f;
    public final ni0 g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;

    public kn(long j, String str, String str2, String str3, String str4, j11 j11Var, ni0 ni0Var, String str5, String str6, boolean z, boolean z2) {
        ni0Var.getClass();
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = j11Var;
        this.g = ni0Var;
        this.h = str5;
        this.i = str6;
        this.j = z;
        this.k = z2;
    }

    public static kn a(kn knVar, String str, String str2, String str3, String str4, j11 j11Var, ni0 ni0Var, String str5, String str6, boolean z, int i) {
        long j = knVar.a;
        if ((i & 2) != 0) {
            str = knVar.b;
        }
        String str7 = str;
        String str8 = (i & 4) != 0 ? knVar.c : str2;
        String str9 = (i & 8) != 0 ? knVar.d : str3;
        String str10 = (i & 16) != 0 ? knVar.e : str4;
        j11 j11Var2 = (i & 32) != 0 ? knVar.f : j11Var;
        ni0 ni0Var2 = (i & 64) != 0 ? knVar.g : ni0Var;
        String str11 = (i & 128) != 0 ? knVar.h : str5;
        String str12 = (i & 256) != 0 ? knVar.i : str6;
        boolean z2 = (i & 512) != 0 ? knVar.j : z;
        boolean z3 = (i & 1024) != 0 ? knVar.k : true;
        knVar.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        ni0Var2.getClass();
        str11.getClass();
        return new kn(j, str7, str8, str9, str10, j11Var2, ni0Var2, str11, str12, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn)) {
            return false;
        }
        kn knVar = (kn) obj;
        return this.a == knVar.a && this.b.equals(knVar.b) && this.c.equals(knVar.c) && this.d.equals(knVar.d) && this.e.equals(knVar.e) && this.f.equals(knVar.f) && this.g == knVar.g && this.h.equals(knVar.h) && this.i.equals(knVar.i) && this.j == knVar.j && this.k == knVar.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + k3.f(k3.e(k3.e((this.g.hashCode() + ((this.f.hashCode() + k3.e(k3.e(k3.e(k3.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        return "CarFormUiState(carId=" + this.a + ", name=" + this.b + ", make=" + this.c + ", model=" + this.d + ", year=" + this.e + ", plate=" + this.f + ", fuelType=" + this.g + ", odometer=" + this.h + ", typicalDailyKm=" + this.i + ", showNameError=" + this.j + ", isSaved=" + this.k + ")";
    }
}
