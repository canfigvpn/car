package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fl {
    public final String a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final boolean e;

    public fl(String str, String str2, Integer num, Integer num2, int i) {
        num = (i & 4) != 0 ? null : num;
        num2 = (i & 8) != 0 ? null : num2;
        boolean z = (i & 16) == 0;
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = num2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl)) {
            return false;
        }
        fl flVar = (fl) obj;
        return this.a.equals(flVar.a) && this.b.equals(flVar.b) && ws0.j(this.c, flVar.c) && ws0.j(this.d, flVar.d) && this.e == flVar.e;
    }

    public final int hashCode() {
        int iE = k3.e(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BuiltInService(key=" + this.a + ", icon=" + this.b + ", intervalKm=" + this.c + ", intervalMonths=" + this.d + ", tracksQuantity=" + this.e + ")";
    }
}
