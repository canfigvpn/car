package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vz1 {
    public final uz1 a;
    public final uz1 b;
    public final boolean c;

    public vz1(uz1 uz1Var, uz1 uz1Var2, boolean z) {
        this.a = uz1Var;
        this.b = uz1Var2;
        this.c = z;
    }

    public static vz1 a(vz1 vz1Var, uz1 uz1Var, uz1 uz1Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            uz1Var = vz1Var.a;
        }
        if ((i & 2) != 0) {
            uz1Var2 = vz1Var.b;
        }
        vz1Var.getClass();
        return new vz1(uz1Var, uz1Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz1)) {
            return false;
        }
        vz1 vz1Var = (vz1) obj;
        return ws0.j(this.a, vz1Var.a) && ws0.j(this.b, vz1Var.b) && this.c == vz1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.a + ", end=" + this.b + ", handlesCrossed=" + this.c + ')';
    }
}
