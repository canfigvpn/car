package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class rd0 implements yd0 {
    public final float e;
    public final float f;

    public rd0() {
        this.e = Math.max(1.0E-7f, Math.abs(0.1f));
        this.f = Math.max(1.0E-4f, 1.0f) * (-4.2f);
    }

    public qd0 a(float f) {
        double dB = b(f);
        double d = sd0.a;
        double d2 = d - 1.0d;
        return new qd0(f, (float) (Math.exp((d / d2) * dB) * ((double) (this.e * this.f))), (long) (Math.exp(dB / d2) * 1000.0d));
    }

    public double b(float f) {
        float[] fArr = a7.a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.e * this.f)));
    }

    @Override // defpackage.yd0
    public long e(float f) {
        return ((long) ((((float) Math.log(this.e / Math.abs(f))) * 1000.0f) / this.f)) * 1000000;
    }

    @Override // defpackage.yd0
    public float f() {
        return this.e;
    }

    @Override // defpackage.yd0
    public float g(float f, float f2) {
        float fAbs = Math.abs(f2);
        float f3 = this.e;
        if (fAbs <= f3) {
            return f;
        }
        double dLog = Math.log(Math.abs(f3 / f2));
        float f4 = this.f;
        return ((f2 / f4) * ((float) Math.exp((((double) f4) * ((dLog / ((double) f4)) * 1000.0d)) / 1000.0d))) + (f - (f2 / f4));
    }

    @Override // defpackage.yd0
    public float m(float f, long j) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.f));
    }

    @Override // defpackage.yd0
    public float n(float f, float f2, long j) {
        float f3 = this.f;
        return ((f2 / f3) * ((float) Math.exp((f3 * (j / 1000000)) / 1000.0f))) + (f - (f2 / f3));
    }

    public rd0(float f, m40 m40Var) {
        this.e = f;
        float fB = m40Var.b();
        float f2 = sd0.a;
        this.f = fB * 386.0878f * 160.0f * 0.84f;
    }
}
