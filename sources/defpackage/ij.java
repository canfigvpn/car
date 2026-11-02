package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ij {
    public g7 a = null;
    public j4 b = null;
    public um c = null;
    public d8 d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij)) {
            return false;
        }
        ij ijVar = (ij) obj;
        return ws0.j(this.a, ijVar.a) && ws0.j(this.b, ijVar.b) && ws0.j(this.c, ijVar.c) && ws0.j(this.d, ijVar.d);
    }

    public final int hashCode() {
        g7 g7Var = this.a;
        int iHashCode = (g7Var == null ? 0 : g7Var.hashCode()) * 31;
        j4 j4Var = this.b;
        int iHashCode2 = (iHashCode + (j4Var == null ? 0 : j4Var.hashCode())) * 31;
        um umVar = this.c;
        int iHashCode3 = (iHashCode2 + (umVar == null ? 0 : umVar.hashCode())) * 31;
        d8 d8Var = this.d;
        return iHashCode3 + (d8Var != null ? d8Var.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }
}
