package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class uk1 extends ll1 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public uk1(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk1)) {
            return false;
        }
        uk1 uk1Var = (uk1) obj;
        return Float.compare(this.c, uk1Var.c) == 0 && Float.compare(this.d, uk1Var.d) == 0 && Float.compare(this.e, uk1Var.e) == 0 && Float.compare(this.f, uk1Var.f) == 0 && Float.compare(this.g, uk1Var.g) == 0 && Float.compare(this.h, uk1Var.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + k3.a(this.g, k3.a(this.f, k3.a(this.e, k3.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.c);
        sb.append(", y1=");
        sb.append(this.d);
        sb.append(", x2=");
        sb.append(this.e);
        sb.append(", y2=");
        sb.append(this.f);
        sb.append(", x3=");
        sb.append(this.g);
        sb.append(", y3=");
        return k3.k(sb, this.h, ')');
    }
}
