package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pf1 {
    public final int a;
    public final double b;
    public final int c;
    public final int d;
    public final of1 e;

    public pf1(int i, double d, int i2, int i3, of1 of1Var) {
        this.a = i;
        this.b = d;
        this.c = i2;
        this.d = i3;
        this.e = of1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf1)) {
            return false;
        }
        pf1 pf1Var = (pf1) obj;
        return this.a == pf1Var.a && Double.compare(this.b, pf1Var.b) == 0 && this.c == pf1Var.c && this.d == pf1Var.d && this.e == pf1Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + k3.b(this.d, k3.b(this.c, (Double.hashCode(this.b) + (Integer.hashCode(this.a) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "OdometerEstimate(odometerKm=" + this.a + ", kmPerDay=" + this.b + ", anchorKm=" + this.c + ", anchorEpochDay=" + this.d + ", basis=" + this.e + ")";
    }
}
