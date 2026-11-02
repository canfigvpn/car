package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bu1 implements m40 {
    public int e;
    public float f = 1.0f;
    public float g = 1.0f;
    public float h = 1.0f;
    public float i;
    public long j;
    public long k;
    public float l;
    public float m;
    public long n;
    public u32 o;
    public boolean p;
    public long q;
    public m40 r;
    public kw0 s;
    public int t;
    public mx u;

    public bu1() {
        long j = el0.a;
        this.j = j;
        this.k = j;
        this.m = 8.0f;
        this.n = ai2.b;
        this.o = vs0.C;
        this.q = 9205357640488583168L;
        this.r = vv.a();
        this.s = kw0.e;
        this.t = 3;
    }

    public final void a() {
        h(1.0f);
        i(1.0f);
        c(1.0f);
        j(0.0f);
        long j = el0.a;
        e(j);
        m(j);
        if (this.l != 0.0f) {
            this.e |= 1024;
            this.l = 0.0f;
        }
        if (this.m != 8.0f) {
            this.e |= 2048;
            this.m = 8.0f;
        }
        n(ai2.b);
        k(vs0.C);
        f(false);
        if (this.t != 3) {
            this.e |= 524288;
            this.t = 3;
        }
        this.q = 9205357640488583168L;
        this.u = null;
        this.e = 0;
    }

    @Override // defpackage.m40
    public final float b() {
        return this.r.b();
    }

    public final void c(float f) {
        if (this.h == f) {
            return;
        }
        this.e |= 4;
        this.h = f;
    }

    public final void e(long j) {
        long j2 = this.j;
        int i = dr.h;
        if (vk2.a(j2, j)) {
            return;
        }
        this.e |= 64;
        this.j = j;
    }

    public final void f(boolean z) {
        if (this.p != z) {
            this.e |= 16384;
            this.p = z;
        }
    }

    public final void h(float f) {
        if (this.f == f) {
            return;
        }
        this.e |= 1;
        this.f = f;
    }

    public final void i(float f) {
        if (this.g == f) {
            return;
        }
        this.e |= 2;
        this.g = f;
    }

    public final void j(float f) {
        if (this.i == f) {
            return;
        }
        this.e |= 32;
        this.i = f;
    }

    public final void k(u32 u32Var) {
        if (ws0.j(this.o, u32Var)) {
            return;
        }
        this.e |= 8192;
        this.o = u32Var;
    }

    @Override // defpackage.m40
    public final float l() {
        return this.r.l();
    }

    public final void m(long j) {
        long j2 = this.k;
        int i = dr.h;
        if (vk2.a(j2, j)) {
            return;
        }
        this.e |= 128;
        this.k = j;
    }

    public final void n(long j) {
        if (ai2.a(this.n, j)) {
            return;
        }
        this.e |= 4096;
        this.n = j;
    }
}
