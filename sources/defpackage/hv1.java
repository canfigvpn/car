package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hv1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        ux.i(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public hv1(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv1)) {
            return false;
        }
        hv1 hv1Var = (hv1) obj;
        return Float.compare(this.a, hv1Var.a) == 0 && Float.compare(this.b, hv1Var.b) == 0 && Float.compare(this.c, hv1Var.c) == 0 && Float.compare(this.d, hv1Var.d) == 0 && vv.i(this.e, hv1Var.e) && vv.i(this.f, hv1Var.f) && vv.i(this.g, hv1Var.g) && vv.i(this.h, hv1Var.h);
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + k3.c(k3.c(k3.c(k3.a(this.d, k3.a(this.c, k3.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String str = vv.R(this.a) + ", " + vv.R(this.b) + ", " + vv.R(this.c) + ", " + vv.R(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean zI = vv.i(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!zI || !vv.i(j2, j3) || !vv.i(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) vv.P(j)) + ", topRight=" + ((Object) vv.P(j2)) + ", bottomRight=" + ((Object) vv.P(j3)) + ", bottomLeft=" + ((Object) vv.P(j4)) + ')';
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "RoundRect(rect=" + str + ", radius=" + vv.R(Float.intBitsToFloat(i)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + vv.R(Float.intBitsToFloat(i)) + ", y=" + vv.R(Float.intBitsToFloat(i2)) + ')';
    }
}
