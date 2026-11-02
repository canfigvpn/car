package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class uz1 {
    public final jt1 a;
    public final int b;
    public final long c;

    public uz1(jt1 jt1Var, int i, long j) {
        this.a = jt1Var;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz1)) {
            return false;
        }
        uz1 uz1Var = (uz1) obj;
        return this.a == uz1Var.a && this.b == uz1Var.b && this.c == uz1Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + k3.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.a + ", offset=" + this.b + ", selectableId=" + this.c + ')';
    }
}
