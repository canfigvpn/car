package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class mw0 {
    public final int a;
    public final int b;
    public final boolean c;

    public mw0(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw0)) {
            return false;
        }
        mw0 mw0Var = (mw0) obj;
        return this.a == mw0Var.a && this.b == mw0Var.b && this.c == mw0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k3.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.a + ", end=" + this.b + ", isRtl=" + this.c + ')';
    }
}
