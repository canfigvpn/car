package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wy0 {
    public final int a;
    public final int b;

    public wy0(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!(i >= 0)) {
            yp0.a("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        yp0.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy0)) {
            return false;
        }
        wy0 wy0Var = (wy0) obj;
        return this.a == wy0Var.a && this.b == wy0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.a);
        sb.append(", end=");
        return k3.l(sb, this.b, ')');
    }
}
