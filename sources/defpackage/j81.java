package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class j81 {
    public final long a;
    public final long b;
    public final boolean c;

    public j81(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final j81 a(j81 j81Var) {
        return new j81(uf1.e(this.a, j81Var.a), Math.max(this.b, j81Var.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j81)) {
            return false;
        }
        j81 j81Var = (j81) obj;
        return uf1.b(this.a, j81Var.a) && this.b == j81Var.b && this.c == j81Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k3.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) uf1.g(this.a)) + ", timeMillis=" + this.b + ", shouldApplyImmediately=" + this.c + ')';
    }
}
