package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class i52 {
    public final ej0 a;
    public final g82 b;

    public i52(ej0 ej0Var, g82 g82Var) {
        this.a = ej0Var;
        this.b = g82Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i52)) {
            return false;
        }
        i52 i52Var = (i52) obj;
        return this.a.equals(i52Var.a) && this.b.equals(i52Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
