package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class v21 extends w21 {
    public final String a;
    public final kf2 b;

    public v21(String str, kf2 kf2Var) {
        this.a = str;
        this.b = kf2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v21)) {
            return false;
        }
        v21 v21Var = (v21) obj;
        return this.a.equals(v21Var.a) && ws0.j(this.b, v21Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        kf2 kf2Var = this.b;
        return (iHashCode + (kf2Var != null ? kf2Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LinkAnnotation.Url(url=" + this.a + ')';
    }
}
