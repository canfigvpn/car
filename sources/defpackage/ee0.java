package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ee0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public ee0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ee0)) {
            return false;
        }
        ee0 ee0Var = (ee0) obj;
        if (w60.b(this.a, ee0Var.a) && w60.b(this.b, ee0Var.b) && w60.b(this.c, ee0Var.c)) {
            return w60.b(this.d, ee0Var.d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + k3.a(this.c, k3.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }
}
