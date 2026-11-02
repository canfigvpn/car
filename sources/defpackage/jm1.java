package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jm1 {
    public int e;
    public int f;
    public long g = 0;
    public long h = km1.a;
    public long i = 0;

    public abstract int f0(u3 u3Var);

    public int g0() {
        return (int) (this.g & 4294967295L);
    }

    public int h0() {
        return (int) (this.g >> 32);
    }

    public Object j() {
        return null;
    }

    public final void k0() {
        this.e = ex.h((int) (this.g >> 32), sw.j(this.h), sw.h(this.h));
        int iH = ex.h((int) (this.g & 4294967295L), sw.i(this.h), sw.g(this.h));
        this.f = iH;
        int i = this.e;
        long j = this.g;
        this.i = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iH - ((int) (j & 4294967295L))) / 2)));
    }

    public abstract void l0(long j, float f, ej0 ej0Var);

    public final void m0(long j) {
        if (qr0.a(this.g, j)) {
            return;
        }
        this.g = j;
        k0();
    }

    public final void o0(long j) {
        if (sw.b(this.h, j)) {
            return;
        }
        this.h = j;
        k0();
    }
}
