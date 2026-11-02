package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class j11 {
    public static final List e = vs0.v("الف", "ب", "پ", "ت", "ث", "ج", "د", "ز", "س", "ش", "ص", "ط", "ع", "ف", "ق", "ک", "گ", "ل", "م", "ن", "و", "ه", "ی", "ژ", "S", "D");
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public j11(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public static j11 a(j11 j11Var, String str, String str2, String str3, String str4, int i) {
        if ((i & 1) != 0) {
            str = j11Var.a;
        }
        if ((i & 2) != 0) {
            str2 = j11Var.b;
        }
        if ((i & 4) != 0) {
            str3 = j11Var.c;
        }
        if ((i & 8) != 0) {
            str4 = j11Var.d;
        }
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new j11(str, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j11)) {
            return false;
        }
        j11 j11Var = (j11) obj;
        return ws0.j(this.a, j11Var.a) && ws0.j(this.b, j11Var.b) && ws0.j(this.c, j11Var.c) && ws0.j(this.d, j11Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k3.e(k3.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "LicensePlate(twoDigits=" + this.a + ", letter=" + this.b + ", threeDigits=" + this.c + ", region=" + this.d + ")";
    }
}
