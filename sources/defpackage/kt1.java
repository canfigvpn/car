package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class kt1 {
    public final int a;
    public final lh0 b;
    public final kh0 c;

    public kt1(int i, lh0 lh0Var, kh0 kh0Var) {
        this.a = i;
        this.b = lh0Var;
        this.c = kh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt1)) {
            return false;
        }
        kt1 kt1Var = (kt1) obj;
        return this.a == kt1Var.a && ws0.j(this.b, kt1Var.b) && this.c.equals(kt1Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + k3.b(0, k3.b(0, ((this.a * 31) + this.b.e) * 31, 31), 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.a + ", weight=" + this.b + ", style=" + ((Object) "Normal") + ", loadingStrategy=Blocking)";
    }
}
