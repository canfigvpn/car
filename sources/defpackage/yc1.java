package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yc1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public yc1(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof yc1)) {
            return false;
        }
        yc1 yc1Var = (yc1) obj;
        long j = yc1Var.a;
        int i = dr.h;
        return vk2.a(this.a, j) && vk2.a(this.d, yc1Var.d) && vk2.a(this.b, yc1Var.b) && vk2.a(this.e, yc1Var.e) && vk2.a(this.c, yc1Var.c) && vk2.a(this.f, yc1Var.f) && vk2.a(this.g, yc1Var.g);
    }

    public final int hashCode() {
        int i = dr.h;
        return Long.hashCode(this.g) + k3.c(k3.c(k3.c(k3.c(k3.c(Long.hashCode(this.a) * 31, 31, this.d), 31, this.b), 31, this.e), 31, this.c), 31, this.f);
    }
}
