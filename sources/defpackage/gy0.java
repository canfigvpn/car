package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class gy0 implements x61 {
    public final iy0 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final x61 e;
    public final float f;
    public final boolean g;
    public final ez h;
    public final m40 i;
    public final int j;
    public final ej0 k;
    public final ej0 l;
    public final List m;
    public final int n;
    public final int o;
    public final int p;
    public final di1 q;
    public final int r;
    public final int s;

    public gy0(iy0 iy0Var, int i, boolean z, float f, x61 x61Var, float f2, boolean z2, ez ezVar, m40 m40Var, int i2, ej0 ej0Var, ej0 ej0Var2, List list, int i3, int i4, int i5, di1 di1Var, int i6, int i7) {
        this.a = iy0Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = x61Var;
        this.f = f2;
        this.g = z2;
        this.h = ezVar;
        this.i = m40Var;
        this.j = i2;
        this.k = ej0Var;
        this.l = ej0Var2;
        this.m = list;
        this.n = i3;
        this.o = i4;
        this.p = i5;
        this.q = di1Var;
        this.r = i6;
        this.s = i7;
    }

    @Override // defpackage.x61
    public final Map a() {
        return this.e.a();
    }

    @Override // defpackage.x61
    public final void b() {
        this.e.b();
    }

    @Override // defpackage.x61
    public final int c() {
        return this.e.c();
    }

    @Override // defpackage.x61
    public final ej0 d() {
        return this.e.d();
    }

    @Override // defpackage.x61
    public final int e() {
        return this.e.e();
    }

    public final gy0 f(int i, boolean z) {
        iy0 iy0Var;
        int i2;
        if (this.g) {
            return null;
        }
        List list = this.m;
        if (list.isEmpty() || (iy0Var = this.a) == null) {
            return null;
        }
        int i3 = iy0Var.g;
        int i4 = this.b - i;
        if (i4 < 0 || i4 >= i3) {
            return null;
        }
        hy0 hy0Var = (hy0) vq.Q(list);
        hy0 hy0Var2 = (hy0) vq.W(list);
        if (hy0Var.r || hy0Var2.r) {
            return null;
        }
        int i5 = this.o;
        int i6 = this.n;
        di1 di1Var = this.q;
        if (i < 0) {
            if (Math.min((sv.Q(hy0Var, di1Var) + hy0Var.l) - i6, (sv.Q(hy0Var2, di1Var) + hy0Var2.l) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - sv.Q(hy0Var, di1Var), i5 - sv.Q(hy0Var2, di1Var)) <= i) {
            return null;
        }
        int size = list.size();
        int i7 = 0;
        while (i7 < size) {
            hy0 hy0Var3 = (hy0) list.get(i7);
            hy0Var3.getClass();
            if (hy0Var3.r) {
                i2 = i4;
            } else {
                long j = hy0Var3.o;
                i2 = i4;
                hy0Var3.o = (((long) ((int) (j >> 32))) << 32) | (((long) (((int) (j & 4294967295L)) + i)) & 4294967295L);
                if (z) {
                    int size2 = hy0Var3.e.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        hy0Var3.h.a(i8, hy0Var3.b);
                    }
                }
            }
            i7++;
            i4 = i2;
        }
        return new gy0(this.a, i4, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, list, this.n, this.o, this.p, di1Var, this.r, this.s);
    }

    public final long g() {
        x61 x61Var = this.e;
        return (((long) x61Var.e()) << 32) | (((long) x61Var.c()) & 4294967295L);
    }
}
