package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class de0 implements vd0 {
    public final int a;
    public final c90 b;
    public final long c;
    public final long d;

    public de0(int i, int i2, c90 c90Var) {
        this.a = i;
        this.b = c90Var;
        this.c = ((long) i) * 1000000;
        this.d = ((long) i2) * 1000000;
    }

    @Override // defpackage.vd0
    public final float b(long j, float f, float f2, float f3) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        if (j2 > j3) {
            j2 = j3;
        }
        float fC = this.b.c(this.a == 0 ? 1.0f : j2 / j3);
        return (f2 * fC) + ((1.0f - fC) * f);
    }

    @Override // defpackage.vd0
    public final float c(long j, float f, float f2, float f3) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (b(j4, f, f2, f3) - b(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.vd0
    public final long d(float f, float f2, float f3) {
        return this.d + this.c;
    }
}
