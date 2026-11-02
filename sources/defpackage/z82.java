package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class z82 {
    public final long a;
    public final long b;

    public z82(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z82)) {
            return false;
        }
        z82 z82Var = (z82) obj;
        long j = z82Var.a;
        int i = dr.h;
        return vk2.a(this.a, j) && vk2.a(this.b, z82Var.b);
    }

    public final int hashCode() {
        int i = dr.h;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "StatusColors(container=" + dr.h(this.a) + ", content=" + dr.h(this.b) + ")";
    }
}
