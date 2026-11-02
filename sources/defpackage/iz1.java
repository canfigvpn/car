package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class iz1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;

    public iz1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iz1.class != obj.getClass()) {
            return false;
        }
        iz1 iz1Var = (iz1) obj;
        long j = iz1Var.c;
        int i = dr.h;
        return vk2.a(this.c, j) && vk2.a(this.b, iz1Var.b) && vk2.a(this.a, iz1Var.a) && vk2.a(this.f, iz1Var.f) && vk2.a(this.e, iz1Var.e) && vk2.a(this.d, iz1Var.d) && vk2.a(this.i, iz1Var.i) && vk2.a(this.h, iz1Var.h) && vk2.a(this.g, iz1Var.g) && vk2.a(this.l, iz1Var.l) && vk2.a(this.k, iz1Var.k) && vk2.a(this.j, iz1Var.j);
    }

    public final int hashCode() {
        int i = dr.h;
        return Long.hashCode(this.j) + k3.c(k3.c(k3.c(k3.c(k3.c(k3.c(k3.c(k3.c(k3.c(k3.c(Long.hashCode(this.c) * 31, 31, this.b), 31, this.a), 31, this.f), 31, this.e), 31, this.d), 31, this.i), 31, this.h), 31, this.g), 31, this.l), 31, this.k);
    }
}
