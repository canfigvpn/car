package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class nz1 {
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
    public final long m;

    public nz1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
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
        this.m = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof nz1)) {
            return false;
        }
        nz1 nz1Var = (nz1) obj;
        long j = nz1Var.a;
        int i = dr.h;
        return vk2.a(this.a, j) && vk2.a(this.b, nz1Var.b) && vk2.a(this.c, nz1Var.c) && vk2.a(this.d, nz1Var.d) && vk2.a(this.e, nz1Var.e) && vk2.a(this.f, nz1Var.f) && vk2.a(this.g, nz1Var.g) && vk2.a(this.h, nz1Var.h) && vk2.a(this.i, nz1Var.i) && vk2.a(this.j, nz1Var.j) && vk2.a(this.k, nz1Var.k) && vk2.a(this.l, nz1Var.l) && vk2.a(this.m, nz1Var.m);
    }

    public final int hashCode() {
        int i = dr.h;
        return Long.hashCode(this.m) + k3.c(k3.c(k3.c(k3.c(k3.c(k3.c(k3.c(k3.c(k3.c(k3.c(k3.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }
}
