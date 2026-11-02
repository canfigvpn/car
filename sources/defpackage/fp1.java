package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fp1 extends vv {
    public final Object d;
    public final long e;

    public fp1(long j, Object obj) {
        this.d = obj;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp1)) {
            return false;
        }
        fp1 fp1Var = (fp1) obj;
        return this.d.equals(fp1Var.d) && this.e == fp1Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "PredictiveBackHandlerInfo(owner=" + this.d + ", compositeKey=" + this.e + ')';
    }
}
