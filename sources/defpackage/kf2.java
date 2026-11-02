package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class kf2 {
    public final r72 a;
    public final r72 b;
    public final r72 c;
    public final r72 d;

    public kf2(r72 r72Var, r72 r72Var2, r72 r72Var3, r72 r72Var4) {
        this.a = r72Var;
        this.b = r72Var2;
        this.c = r72Var3;
        this.d = r72Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof kf2)) {
            return false;
        }
        kf2 kf2Var = (kf2) obj;
        return ws0.j(this.a, kf2Var.a) && ws0.j(this.b, kf2Var.b) && ws0.j(this.c, kf2Var.c) && ws0.j(this.d, kf2Var.d);
    }

    public final int hashCode() {
        r72 r72Var = this.a;
        int iHashCode = (r72Var != null ? r72Var.hashCode() : 0) * 31;
        r72 r72Var2 = this.b;
        int iHashCode2 = (iHashCode + (r72Var2 != null ? r72Var2.hashCode() : 0)) * 31;
        r72 r72Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (r72Var3 != null ? r72Var3.hashCode() : 0)) * 31;
        r72 r72Var4 = this.d;
        return iHashCode3 + (r72Var4 != null ? r72Var4.hashCode() : 0);
    }
}
