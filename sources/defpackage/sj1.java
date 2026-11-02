package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class sj1 {
    public final y7 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public sj1(y7 y7Var, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = y7Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final yr1 a(yr1 yr1Var) {
        return yr1Var.i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = of2.b;
            if (of2.b(j, j2)) {
                return j2;
            }
        }
        int i = of2.c;
        int i2 = this.b;
        return j02.c(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final yr1 c(yr1 yr1Var) {
        float f = -this.f;
        return yr1Var.i((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return ex.h(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sj1) {
            sj1 sj1Var = (sj1) obj;
            if (this.a == sj1Var.a && this.b == sj1Var.b && this.c == sj1Var.c && this.d == sj1Var.d && this.e == sj1Var.e && Float.compare(this.f, sj1Var.f) == 0 && Float.compare(this.g, sj1Var.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + k3.a(this.f, k3.b(this.e, k3.b(this.d, k3.b(this.c, k3.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        sb.append(this.c);
        sb.append(", startLineIndex=");
        sb.append(this.d);
        sb.append(", endLineIndex=");
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        return k3.k(sb, this.g, ')');
    }
}
