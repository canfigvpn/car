package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ob2 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public ob2(String str, String str2, boolean z, int i, String str3, int i2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.g = h92.C(upperCase, "INT", false) ? 3 : (h92.C(upperCase, "CHAR", false) || h92.C(upperCase, "CLOB", false) || h92.C(upperCase, "TEXT", false)) ? 2 : h92.C(upperCase, "BLOB", false) ? 5 : (h92.C(upperCase, "REAL", false) || h92.C(upperCase, "FLOA", false) || h92.C(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ob2) {
                boolean z = this.d > 0;
                ob2 ob2Var = (ob2) obj;
                int i = ob2Var.f;
                if (z == (ob2Var.d > 0) && ws0.j(this.a, ob2Var.a) && this.c == ob2Var.c) {
                    String str = ob2Var.e;
                    int i2 = this.f;
                    String str2 = this.e;
                    if ((i2 != 1 || i != 2 || str2 == null || v12.h(str2, str)) && ((i2 != 2 || i != 1 || str == null || v12.h(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : v12.h(str2, str))) && this.g == ob2Var.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return i92.r(i92.t(sb.toString()));
    }
}
