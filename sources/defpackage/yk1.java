package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yk1 extends ll1 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public yk1(float f, float f2, float f3, float f4) {
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
        if (!(obj instanceof yk1)) {
            return false;
        }
        yk1 yk1Var = (yk1) obj;
        return Float.compare(this.c, yk1Var.c) == 0 && Float.compare(this.d, yk1Var.d) == 0 && Float.compare(this.e, yk1Var.e) == 0 && Float.compare(this.f, yk1Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + k3.a(this.e, k3.a(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuadTo(x1=");
        sb.append(this.c);
        sb.append(", y1=");
        sb.append(this.d);
        sb.append(", x2=");
        sb.append(this.e);
        sb.append(", y2=");
        return k3.k(sb, this.f, ')');
    }
}
