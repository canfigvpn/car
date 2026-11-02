package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ww {
    public final int a;
    public final long b;
    public final xw c;
    public final qk1 d;

    public ww(int i, long j, xw xwVar, qk1 qk1Var) {
        this.a = i;
        this.b = j;
        this.c = xwVar;
        this.d = qk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww)) {
            return false;
        }
        ww wwVar = (ww) obj;
        return this.a == wwVar.a && this.b == wwVar.b && this.c == wwVar.c && ws0.j(this.d, wwVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + k3.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        qk1 qk1Var = this.d;
        return iHashCode + (qk1Var == null ? 0 : qk1Var.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ')';
    }
}
