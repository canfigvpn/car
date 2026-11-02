package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ql1 implements ry {
    public final float a;

    public ql1(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            yp0.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.ry
    public final float a(long j, m40 m40Var) {
        return (this.a / 100.0f) * d52.b(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ql1) && Float.compare(this.a, ((ql1) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
