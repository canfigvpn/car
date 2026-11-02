package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hx1 {
    public final float a;
    public final long b;
    public final ld0 c;

    public hx1(float f, long j, ld0 ld0Var) {
        this.a = f;
        this.b = j;
        this.c = ld0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx1)) {
            return false;
        }
        hx1 hx1Var = (hx1) obj;
        return Float.compare(this.a, hx1Var.a) == 0 && ai2.a(this.b, hx1Var.b) && this.c.equals(hx1Var.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        int i = ai2.c;
        return this.c.hashCode() + k3.c(iHashCode, 31, this.b);
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + ((Object) ai2.b(this.b)) + ", animationSpec=" + this.c + ')';
    }
}
