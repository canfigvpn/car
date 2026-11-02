package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vb {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public vb(int i, int i2, Object obj, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb)) {
            return false;
        }
        vb vbVar = (vb) obj;
        return ws0.j(this.a, vbVar.a) && this.b == vbVar.b && this.c == vbVar.c && ws0.j(this.d, vbVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + k3.b(this.c, k3.b(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "MutableRange(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ')';
    }
}
