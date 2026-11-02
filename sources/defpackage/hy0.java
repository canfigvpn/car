package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hy0 implements nz0 {
    public final int a;
    public final Object b;
    public final int c;
    public final kw0 d;
    public final List e;
    public final long f;
    public final Object g;
    public final gz0 h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public int m = Integer.MIN_VALUE;
    public final long n;
    public long o;
    public int p;
    public int q;
    public boolean r;

    public hy0(int i, Object obj, int i2, int i3, kw0 kw0Var, int i4, int i5, List list, long j, Object obj2, gz0 gz0Var, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.c = i2;
        this.d = kw0Var;
        this.e = list;
        this.f = j;
        this.g = obj2;
        this.h = gz0Var;
        this.i = i6;
        this.j = i7;
        int size = list.size();
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iMax = Math.max(iMax, ((jm1) list.get(i8)).f);
        }
        this.k = iMax;
        int i9 = i3 + iMax;
        this.l = i9 >= 0 ? i9 : 0;
        this.n = (((long) this.c) << 32) | (((long) iMax) & 4294967295L);
        this.o = 0L;
        this.p = -1;
        this.q = -1;
    }

    public final void a(im1 im1Var) {
        if (this.m == Integer.MIN_VALUE) {
            yp0.a("position() should be called first");
        }
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            jm1 jm1Var = (jm1) list.get(i);
            int i2 = jm1Var.f;
            long j = this.o;
            this.h.a(i, this.b);
            im1.o(im1Var, jm1Var, ir0.c(j, this.f));
        }
    }

    @Override // defpackage.nz0
    public final int b() {
        return this.e.size();
    }

    @Override // defpackage.nz0
    public final boolean c() {
        return true;
    }

    @Override // defpackage.nz0
    public final void d() {
        this.r = true;
    }

    @Override // defpackage.nz0
    public final void e(int i, int i2, int i3) {
        k(i, 0, i2, i3, -1, -1);
    }

    @Override // defpackage.nz0
    public final int f() {
        return this.l;
    }

    @Override // defpackage.nz0
    public final long g(int i) {
        return this.o;
    }

    @Override // defpackage.nz0
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.nz0
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.nz0
    public final int h() {
        return this.j;
    }

    @Override // defpackage.nz0
    public final Object i(int i) {
        return ((jm1) this.e.get(i)).j();
    }

    @Override // defpackage.nz0
    public final int j() {
        return this.i;
    }

    public final void k(int i, int i2, int i3, int i4, int i5, int i6) {
        this.m = i4;
        if (this.d == kw0.f) {
            i2 = (i3 - i2) - this.c;
        }
        this.o = (((long) i2) << 32) | (((long) i) & 4294967295L);
        this.p = i5;
        this.q = i6;
    }
}
