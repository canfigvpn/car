package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class q32 {
    public static final q32 d = new q32(ws0.d(4278190080L), 0, 0.0f);
    public final long a;
    public final long b;
    public final float c;

    public q32(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q32)) {
            return false;
        }
        q32 q32Var = (q32) obj;
        long j = q32Var.a;
        int i = dr.h;
        return vk2.a(this.a, j) && uf1.b(this.b, q32Var.b) && this.c == q32Var.c;
    }

    public final int hashCode() {
        int i = dr.h;
        return Float.hashCode(this.c) + k3.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        k3.r(this.a, sb, ", offset=");
        sb.append((Object) uf1.g(this.b));
        sb.append(", blurRadius=");
        return k3.k(sb, this.c, ')');
    }
}
