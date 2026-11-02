package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class sk1 extends ll1 {
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;

    public sk1(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
        this.g = z2;
        this.h = f4;
        this.i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk1)) {
            return false;
        }
        sk1 sk1Var = (sk1) obj;
        return Float.compare(this.c, sk1Var.c) == 0 && Float.compare(this.d, sk1Var.d) == 0 && Float.compare(this.e, sk1Var.e) == 0 && this.f == sk1Var.f && this.g == sk1Var.g && Float.compare(this.h, sk1Var.h) == 0 && Float.compare(this.i, sk1Var.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + k3.a(this.h, k3.f(k3.f(k3.a(this.e, k3.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.d);
        sb.append(", theta=");
        sb.append(this.e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f);
        sb.append(", isPositiveArc=");
        sb.append(this.g);
        sb.append(", arcStartX=");
        sb.append(this.h);
        sb.append(", arcStartY=");
        return k3.k(sb, this.i, ')');
    }
}
