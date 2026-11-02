package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xb {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public xb(int i, int i2, Object obj, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        wp0.a("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb)) {
            return false;
        }
        xb xbVar = (xb) obj;
        return ws0.j(this.a, xbVar.a) && this.b == xbVar.b && this.c == xbVar.c && ws0.j(this.d, xbVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + k3.b(this.c, k3.b(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ')';
    }

    public xb(int i, int i2, Object obj) {
        this(i, i2, obj, "");
    }
}
