package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
@z12
public final class sg {
    public static final rg Companion = new rg();
    public final int a;
    public final String b;
    public final int c;
    public final Integer d;
    public final Long e;
    public final Double f;
    public final String g;
    public final String h;

    public /* synthetic */ sg(int i, int i2, String str, int i3, Integer num, Long l, Double d, String str2, String str3) {
        if (7 != (i & 7)) {
            qx.Z(i, 7, qg.a.c());
            throw null;
        }
        this.a = i2;
        this.b = str;
        this.c = i3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = d;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str2;
        }
        if ((i & 128) == 0) {
            this.h = "CHANGE";
        } else {
            this.h = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg)) {
            return false;
        }
        sg sgVar = (sg) obj;
        return this.a == sgVar.a && ws0.j(this.b, sgVar.b) && this.c == sgVar.c && ws0.j(this.d, sgVar.d) && ws0.j(this.e, sgVar.e) && ws0.j(this.f, sgVar.f) && ws0.j(this.g, sgVar.g) && ws0.j(this.h, sgVar.h);
    }

    public final int hashCode() {
        int iB = k3.b(this.c, k3.e(Integer.hashCode(this.a) * 31, 31, this.b), 31);
        Integer num = this.d;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.e;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Double d = this.f;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.g;
        return this.h.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BackupRecord(ref=" + this.a + ", serviceKey=" + this.b + ", epochDay=" + this.c + ", odometerKm=" + this.d + ", cost=" + this.e + ", quantity=" + this.f + ", note=" + this.g + ", action=" + this.h + ")";
    }

    public sg(int i, String str, int i2, Integer num, Long l, Double d, String str2, String str3) {
        str3.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = num;
        this.e = l;
        this.f = d;
        this.g = str2;
        this.h = str3;
    }
}
