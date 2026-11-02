package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class js {
    public final u22 a;
    public final is b;
    public final String c;

    public js(u22 u22Var, is isVar, String str) {
        this.a = u22Var;
        this.b = isVar;
        this.c = str;
    }

    public static js a(js jsVar, is isVar, String str, int i) {
        u22 u22Var = jsVar.a;
        if ((i & 2) != 0) {
            isVar = jsVar.b;
        }
        if ((i & 4) != 0) {
            str = jsVar.c;
        }
        return new js(u22Var, isVar, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js)) {
            return false;
        }
        js jsVar = (js) obj;
        return this.a.equals(jsVar.a) && this.b == jsVar.b && this.c.equals(jsVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CompanionUiState(type=" + this.a + ", choice=" + this.b + ", cost=" + this.c + ")";
    }
}
