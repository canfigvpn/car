package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
@z12
public final class gh {
    public static final fh Companion = new fh();
    public final String a;
    public final Integer b;
    public final Integer c;
    public final boolean d;

    public /* synthetic */ gh(int i, String str, Integer num, Integer num2, boolean z) {
        if (1 != (i & 1)) {
            qx.Z(i, 1, eh.a.c());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = true;
        } else {
            this.d = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh)) {
            return false;
        }
        gh ghVar = (gh) obj;
        return ws0.j(this.a, ghVar.a) && ws0.j(this.b, ghVar.b) && ws0.j(this.c, ghVar.c) && this.d == ghVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BackupSchedule(serviceKey=" + this.a + ", intervalKm=" + this.b + ", intervalMonths=" + this.c + ", enabled=" + this.d + ")";
    }

    public gh(String str, Integer num, Integer num2, boolean z) {
        str.getClass();
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = z;
    }
}
