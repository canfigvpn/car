package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class tf2 {
    public final String a;
    public String b;
    public boolean c = false;
    public vj1 d = null;

    public tf2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf2)) {
            return false;
        }
        tf2 tf2Var = (tf2) obj;
        return ws0.j(this.a, tf2Var.a) && ws0.j(this.b, tf2Var.b) && this.c == tf2Var.c && ws0.j(this.d, tf2Var.d);
    }

    public final int hashCode() {
        int iF = k3.f(k3.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        vj1 vj1Var = this.d;
        return iF + (vj1Var == null ? 0 : vj1Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ')';
    }
}
