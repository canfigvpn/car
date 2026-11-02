package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wj1 implements ub {
    public final int a;
    public final int b;
    public final long c;
    public final xe2 d;
    public final ym1 e;
    public final o21 f;
    public final int g;
    public final int h;
    public final mf2 i;

    public wj1(int i, int i2, long j, xe2 xe2Var, ym1 ym1Var, o21 o21Var, int i3, int i4, mf2 mf2Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = xe2Var;
        this.e = ym1Var;
        this.f = o21Var;
        this.g = i3;
        this.h = i4;
        this.i = mf2Var;
        zf2[] zf2VarArr = yf2.b;
        if (yf2.a(j, yf2.c)) {
            return;
        }
        if (yf2.c(j) >= 0.0f) {
            return;
        }
        wp0.b("lineHeight can't be negative (" + yf2.c(j) + ')');
    }

    public final wj1 a(wj1 wj1Var) {
        return wj1Var == null ? this : xj1.a(this, wj1Var.a, wj1Var.b, wj1Var.c, wj1Var.d, wj1Var.e, wj1Var.f, wj1Var.g, wj1Var.h, wj1Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj1)) {
            return false;
        }
        wj1 wj1Var = (wj1) obj;
        return this.a == wj1Var.a && this.b == wj1Var.b && yf2.a(this.c, wj1Var.c) && ws0.j(this.d, wj1Var.d) && ws0.j(this.e, wj1Var.e) && ws0.j(this.f, wj1Var.f) && this.g == wj1Var.g && this.h == wj1Var.h && ws0.j(this.i, wj1Var.i);
    }

    public final int hashCode() {
        int iB = k3.b(this.b, Integer.hashCode(this.a) * 31, 31);
        zf2[] zf2VarArr = yf2.b;
        int iC = k3.c(iB, 31, this.c);
        xe2 xe2Var = this.d;
        int iHashCode = (iC + (xe2Var != null ? xe2Var.hashCode() : 0)) * 31;
        ym1 ym1Var = this.e;
        int iHashCode2 = (iHashCode + (ym1Var != null ? ym1Var.hashCode() : 0)) * 31;
        o21 o21Var = this.f;
        int iB2 = k3.b(this.h, k3.b(this.g, (iHashCode2 + (o21Var != null ? o21Var.hashCode() : 0)) * 31, 31), 31);
        mf2 mf2Var = this.i;
        return iB2 + (mf2Var != null ? mf2Var.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) gc2.a(this.a)) + ", textDirection=" + ((Object) hd2.a(this.b)) + ", lineHeight=" + ((Object) yf2.d(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) j21.a(this.g)) + ", hyphens=" + ((Object) yn0.a(this.h)) + ", textMotion=" + this.i + ')';
    }
}
