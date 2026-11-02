package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
@z12
public final class jh {
    public static final ih Companion = new ih();
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final boolean f;
    public final boolean g;
    public final int h;

    public /* synthetic */ jh(int i, String str, String str2, String str3, Integer num, Integer num2, boolean z, boolean z2, int i2) {
        if (1 != (i & 1)) {
            qx.Z(i, 1, hh.a.c());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "🔧";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        if ((i & 64) == 0) {
            this.g = true;
        } else {
            this.g = z2;
        }
        if ((i & 128) == 0) {
            this.h = 1000;
        } else {
            this.h = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh)) {
            return false;
        }
        jh jhVar = (jh) obj;
        return ws0.j(this.a, jhVar.a) && ws0.j(this.b, jhVar.b) && ws0.j(this.c, jhVar.c) && ws0.j(this.d, jhVar.d) && ws0.j(this.e, jhVar.e) && this.f == jhVar.f && this.g == jhVar.g && this.h == jhVar.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iE = k3.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        Integer num = this.d;
        int iHashCode2 = (iE + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return Integer.hashCode(this.h) + k3.f(k3.f((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        return "BackupServiceType(key=" + this.a + ", customName=" + this.b + ", icon=" + this.c + ", defaultIntervalKm=" + this.d + ", defaultIntervalMonths=" + this.e + ", tracksQuantity=" + this.f + ", isBuiltIn=" + this.g + ", sortOrder=" + this.h + ")";
    }

    public jh(String str, String str2, String str3, Integer num, Integer num2, boolean z, boolean z2, int i) {
        str.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = num2;
        this.f = z;
        this.g = z2;
        this.h = i;
    }
}
