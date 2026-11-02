package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
@z12
public final class pg {
    public static final og Companion = new og();
    public final int a;
    public final int b;
    public final String c;
    public final Integer d;

    public /* synthetic */ pg(int i, int i2, int i3, String str, Integer num) {
        if (3 != (i & 3)) {
            qx.Z(i, 3, ng.a.c());
            throw null;
        }
        this.a = i2;
        this.b = i3;
        if ((i & 4) == 0) {
            this.c = "MANUAL";
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg)) {
            return false;
        }
        pg pgVar = (pg) obj;
        return this.a == pgVar.a && this.b == pgVar.b && ws0.j(this.c, pgVar.c) && ws0.j(this.d, pgVar.d);
    }

    public final int hashCode() {
        int iE = k3.e(k3.b(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
        Integer num = this.d;
        return iE + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "BackupReading(epochDay=" + this.a + ", odometerKm=" + this.b + ", source=" + this.c + ", recordRef=" + this.d + ")";
    }

    public pg(int i, int i2, String str, Integer num) {
        str.getClass();
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = num;
    }
}
