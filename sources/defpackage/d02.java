package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class d02 {
    public final ql0 a;
    public final long b;
    public final c02 c;
    public final boolean d;

    public d02(ql0 ql0Var, long j, c02 c02Var, boolean z) {
        this.a = ql0Var;
        this.b = j;
        this.c = c02Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d02)) {
            return false;
        }
        d02 d02Var = (d02) obj;
        return this.a == d02Var.a && uf1.b(this.b, d02Var.b) && this.c == d02Var.c && this.d == d02Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + k3.c(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.a + ", position=" + ((Object) uf1.g(this.b)) + ", anchor=" + this.c + ", visible=" + this.d + ')';
    }
}
