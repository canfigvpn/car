package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class j61 {
    public final String a;
    public final lr0 b;

    public j61(String str, lr0 lr0Var) {
        this.a = str;
        this.b = lr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j61)) {
            return false;
        }
        j61 j61Var = (j61) obj;
        return this.a.equals(j61Var.a) && this.b.equals(j61Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
