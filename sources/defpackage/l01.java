package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class l01 implements nz0 {
    public final int a;
    public final List b;
    public final boolean c;
    public final s3 d;
    public final vi e;
    public final kw0 f;
    public final int g;
    public final long h;
    public final Object i;
    public final Object j;
    public final gz0 k;
    public int l;
    public final int m;
    public final int n;
    public final int o;
    public boolean p;
    public int q = Integer.MIN_VALUE;
    public final int[] r;

    public l01(int i, List list, boolean z, s3 s3Var, vi viVar, kw0 kw0Var, int i2, int i3, int i4, long j, Object obj, Object obj2, gz0 gz0Var, long j2) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = s3Var;
        this.e = viVar;
        this.f = kw0Var;
        this.g = i4;
        this.h = j;
        this.i = obj;
        this.j = obj2;
        this.k = gz0Var;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            jm1 jm1Var = (jm1) list.get(i6);
            boolean z2 = this.c;
            i5 += z2 ? jm1Var.f : jm1Var.e;
            iMax = Math.max(iMax, !z2 ? jm1Var.f : jm1Var.e);
        }
        this.m = i5;
        int i7 = i5 + this.g;
        this.n = i7 >= 0 ? i7 : 0;
        this.o = iMax;
        this.r = new int[this.b.size() * 2];
    }

    public final void a(im1 im1Var) {
        if (this.q == Integer.MIN_VALUE) {
            yp0.a("position() should be called first");
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            jm1 jm1Var = (jm1) list.get(i);
            boolean z = this.c;
            if (z) {
                int i2 = jm1Var.f;
            } else {
                int i3 = jm1Var.e;
            }
            long jG = g(i);
            this.k.a(i, this.i);
            long jC = ir0.c(jG, this.h);
            if (z) {
                im1.o(im1Var, jm1Var, jC);
            } else {
                int i4 = km1.b;
                je1 je1Var = je1.q;
                if (im1Var.c() == kw0.e || im1Var.e() == 0) {
                    im1Var.f(jm1Var);
                    jm1Var.l0(ir0.c(jC, jm1Var.i), 0.0f, je1Var);
                } else {
                    int iE = (im1Var.e() - jm1Var.e) - ((int) (jC >> 32));
                    im1Var.f(jm1Var);
                    jm1Var.l0(ir0.c((((long) iE) << 32) | (4294967295L & ((long) ((int) (jC & 4294967295L)))), jm1Var.i), 0.0f, je1Var);
                }
            }
        }
    }

    @Override // defpackage.nz0
    public final int b() {
        return this.b.size();
    }

    @Override // defpackage.nz0
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.nz0
    public final void d() {
        this.p = true;
    }

    @Override // defpackage.nz0
    public final void e(int i, int i2, int i3) {
        k(i, i2, i3);
    }

    @Override // defpackage.nz0
    public final int f() {
        return this.n;
    }

    @Override // defpackage.nz0
    public final long g(int i) {
        if (i == 0 && this.b.size() == 0) {
            int i2 = this.l;
            return this.c ? ((long) i2) & 4294967295L : ((long) i2) << 32;
        }
        int i3 = i * 2;
        int[] iArr = this.r;
        return (((long) iArr[i3 + 1]) & 4294967295L) | (((long) iArr[i3]) << 32);
    }

    @Override // defpackage.nz0
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.nz0
    public final Object getKey() {
        return this.i;
    }

    @Override // defpackage.nz0
    public final int h() {
        return 1;
    }

    @Override // defpackage.nz0
    public final Object i(int i) {
        return ((jm1) this.b.get(i)).j();
    }

    @Override // defpackage.nz0
    public final int j() {
        return 0;
    }

    public final void k(int i, int i2, int i3) {
        int i4;
        this.l = i;
        boolean z = this.c;
        this.q = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            jm1 jm1Var = (jm1) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.r;
            if (z) {
                s3 s3Var = this.d;
                if (s3Var == null) {
                    yp0.b("null horizontalAlignment when isVertical == true");
                    qj.e();
                    return;
                } else {
                    iArr[i6] = s3Var.a(jm1Var.e, i2, this.f);
                    iArr[i6 + 1] = i;
                    i4 = jm1Var.f;
                }
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                vi viVar = this.e;
                if (viVar == null) {
                    yp0.b("null verticalAlignment when isVertical == false");
                    qj.e();
                    return;
                } else {
                    iArr[i7] = viVar.a(jm1Var.f, i3);
                    i4 = jm1Var.e;
                }
            }
            i += i4;
        }
    }
}
