package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class nh2 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public nh2(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof nh2)) {
            return false;
        }
        nh2 nh2Var = (nh2) obj;
        long j = nh2Var.a;
        int i = dr.h;
        return vk2.a(this.a, j) && vk2.a(this.b, nh2Var.b) && vk2.a(this.c, nh2Var.c) && vk2.a(this.d, nh2Var.d) && vk2.a(this.e, nh2Var.e) && vk2.a(this.f, nh2Var.f);
    }

    public final int hashCode() {
        int i = dr.h;
        return Long.hashCode(this.f) + k3.c(k3.c(k3.c(k3.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
