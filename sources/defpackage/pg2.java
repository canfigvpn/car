package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pg2 {
    public final d91 a;
    public og2 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;

    public pg2() {
        d91 d91Var = hr0.a;
        this.a = new d91();
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
    }

    public final void a(og2 og2Var, long j, long j2, float[] fArr, long j3) {
        long j4 = og2Var.g;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            og2Var.g = j3;
            og2Var.a(og2Var.e, og2Var.f, j, j2, fArr);
        }
    }

    public final boolean b(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (ir0.a(j2, this.d)) {
            z = false;
        } else {
            this.d = j2;
            z = true;
        }
        if (!ir0.a(j, this.e)) {
            this.e = j;
            z = true;
        }
        if (fArr != null) {
            this.g = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.f) {
            return z;
        }
        this.f = j3;
        return true;
    }
}
