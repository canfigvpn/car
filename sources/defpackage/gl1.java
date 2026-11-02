package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class gl1 extends ll1 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public gl1(float f, float f2, float f3, float f4) {
        super(1);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl1)) {
            return false;
        }
        gl1 gl1Var = (gl1) obj;
        return Float.compare(this.c, gl1Var.c) == 0 && Float.compare(this.d, gl1Var.d) == 0 && Float.compare(this.e, gl1Var.e) == 0 && Float.compare(this.f, gl1Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + k3.a(this.e, k3.a(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.c);
        sb.append(", dy1=");
        sb.append(this.d);
        sb.append(", dx2=");
        sb.append(this.e);
        sb.append(", dy2=");
        return k3.k(sb, this.f, ')');
    }
}
