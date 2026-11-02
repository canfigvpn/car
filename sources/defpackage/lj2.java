package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class lj2 implements ld0 {
    public final int a;
    public final int b;
    public final c90 c;

    public lj2(int i, int i2, c90 c90Var) {
        this.a = i;
        this.b = i2;
        this.c = c90Var;
    }

    @Override // defpackage.nb
    public final nm2 a(mj2 mj2Var) {
        return new vf1(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lj2) {
            lj2 lj2Var = (lj2) obj;
            if (lj2Var.a == this.a && lj2Var.b == this.b && ws0.j(lj2Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }
}
