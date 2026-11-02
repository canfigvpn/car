package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class sh2 {
    public di1 a;
    public long b;

    public sh2(long j, di1 di1Var) {
        this.a = di1Var;
        this.b = j;
    }

    public final long a(long j, long j2, float f) {
        long jE = uf1.e(this.b, uf1.d(j, j2));
        this.b = jE;
        if ((this.a == null ? uf1.c(jE) : Math.abs(b(jE))) < f) {
            return 9205357640488583168L;
        }
        di1 di1Var = this.a;
        long j3 = this.b;
        if (di1Var == null) {
            float fC = uf1.c(j3);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) / fC;
            return uf1.d(this.b, uf1.f(f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) / fC)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32)));
        }
        float fB = b(j3) - (Math.signum(b(this.b)) * f);
        long j4 = this.b;
        di1 di1Var2 = this.a;
        di1 di1Var3 = di1.f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (di1Var2 == di1Var3 ? j4 & 4294967295L : j4 >> 32));
        if (this.a == di1Var3) {
            return (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
    }

    public final float b(long j) {
        return Float.intBitsToFloat((int) (this.a == di1.f ? j >> 32 : j & 4294967295L));
    }

    public sh2(di1 di1Var) {
        this(0L, di1Var);
    }
}
