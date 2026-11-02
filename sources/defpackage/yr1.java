package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yr1 {
    public static final yr1 e = new yr1(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public yr1(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.a) & (fIntBitsToFloat < this.c) & (fIntBitsToFloat2 >= this.b) & (fIntBitsToFloat2 < this.d);
    }

    public final long b() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long c() {
        float f = this.c - this.a;
        return (((long) Float.floatToRawIntBits(this.d - this.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final long d() {
        return (((long) Float.floatToRawIntBits(this.a)) << 32) | (((long) Float.floatToRawIntBits(this.b)) & 4294967295L);
    }

    public final yr1 e(yr1 yr1Var) {
        return new yr1(Math.max(this.a, yr1Var.a), Math.max(this.b, yr1Var.b), Math.min(this.c, yr1Var.c), Math.min(this.d, yr1Var.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr1)) {
            return false;
        }
        yr1 yr1Var = (yr1) obj;
        return Float.compare(this.a, yr1Var.a) == 0 && Float.compare(this.b, yr1Var.b) == 0 && Float.compare(this.c, yr1Var.c) == 0 && Float.compare(this.d, yr1Var.d) == 0;
    }

    public final boolean f() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final boolean g(yr1 yr1Var) {
        return (this.a < yr1Var.c) & (yr1Var.a < this.c) & (this.b < yr1Var.d) & (yr1Var.b < this.d);
    }

    public final yr1 h(float f, float f2) {
        return new yr1(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + k3.a(this.c, k3.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final yr1 i(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new yr1(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + vv.R(this.a) + ", " + vv.R(this.b) + ", " + vv.R(this.c) + ", " + vv.R(this.d) + ')';
    }
}
