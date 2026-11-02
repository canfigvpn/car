package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class lx {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public lx(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof lx)) {
            return false;
        }
        lx lxVar = (lx) obj;
        long j = lxVar.a;
        int i = dr.h;
        return vk2.a(this.a, j) && vk2.a(this.b, lxVar.b) && vk2.a(this.c, lxVar.c) && vk2.a(this.d, lxVar.d) && vk2.a(this.e, lxVar.e);
    }

    public final int hashCode() {
        int i = dr.h;
        return Long.hashCode(this.e) + k3.c(k3.c(k3.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        k3.r(this.a, sb, ", textColor=");
        k3.r(this.b, sb, ", iconColor=");
        k3.r(this.c, sb, ", disabledTextColor=");
        k3.r(this.d, sb, ", disabledIconColor=");
        sb.append((Object) dr.h(this.e));
        sb.append(')');
        return sb.toString();
    }
}
