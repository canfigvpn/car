package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class db2 {
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
    public final long n;
    public final long o;
    public final long p;

    public db2(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
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
        this.n = j14;
        this.o = j15;
        this.p = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof db2)) {
            return false;
        }
        db2 db2Var = (db2) obj;
        long j = db2Var.a;
        int i = dr.h;
        return vk2.a(this.a, j) && vk2.a(this.b, db2Var.b) && vk2.a(this.c, db2Var.c) && vk2.a(this.d, db2Var.d) && vk2.a(this.e, db2Var.e) && vk2.a(this.f, db2Var.f) && vk2.a(this.g, db2Var.g) && vk2.a(this.h, db2Var.h) && vk2.a(this.i, db2Var.i) && vk2.a(this.j, db2Var.j) && vk2.a(this.k, db2Var.k) && vk2.a(this.l, db2Var.l) && vk2.a(this.m, db2Var.m) && vk2.a(this.n, db2Var.n) && vk2.a(this.o, db2Var.o) && vk2.a(this.p, db2Var.p);
    }

    public final int hashCode() {
        int i = dr.h;
        return Long.hashCode(this.p) + k3.c(k3.c(k3.c(k3.c(k3.c(k3.c(k3.c(k3.c(k3.c(k3.c(k3.c(k3.c(k3.c(k3.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }
}
