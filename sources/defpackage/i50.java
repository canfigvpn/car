package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class i50 {
    public final wy1 a;
    public final boolean b;

    public i50(int i) {
        boolean z = (i & 4) != 0;
        this.a = wy1.e;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i50)) {
            return false;
        }
        i50 i50Var = (i50) obj;
        return this.a == i50Var.a && this.b == i50Var.b;
    }

    public final int hashCode() {
        return (((Boolean.hashCode(true) + k3.f((this.a.hashCode() + k3.f(Boolean.hashCode(true) * 31, 31, true)) * 31, 31, this.b)) * 31) + 2) * 31;
    }
}
