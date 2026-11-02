package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xe2 {
    public static final xe2 c = new xe2(r02.k(0), r02.k(0));
    public final long a;
    public final long b;

    public xe2(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe2)) {
            return false;
        }
        xe2 xe2Var = (xe2) obj;
        return yf2.a(this.a, xe2Var.a) && yf2.a(this.b, xe2Var.b);
    }

    public final int hashCode() {
        zf2[] zf2VarArr = yf2.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) yf2.d(this.a)) + ", restLine=" + ((Object) yf2.d(this.b)) + ')';
    }
}
