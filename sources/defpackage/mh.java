package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
@z12
public final class mh {
    public static final lh Companion = new lh();
    public final String a;
    public final Boolean b;
    public final String c;
    public final Boolean d;

    public /* synthetic */ mh(int i, String str, Boolean bool, String str2, Boolean bool2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh)) {
            return false;
        }
        mh mhVar = (mh) obj;
        return ws0.j(this.a, mhVar.a) && ws0.j(this.b, mhVar.b) && ws0.j(this.c, mhVar.c) && ws0.j(this.d, mhVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.d;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "BackupSettings(themeMode=" + this.a + ", dynamicColor=" + this.b + ", language=" + this.c + ", smartOdometer=" + this.d + ")";
    }

    public mh(String str, Boolean bool, String str2, Boolean bool2) {
        this.a = str;
        this.b = bool;
        this.c = str2;
        this.d = bool2;
    }
}
