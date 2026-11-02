package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class os1 extends n02 {
    public final n02 a;
    public final int b;

    public os1(n02 n02Var, int i) {
        this.a = n02Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof os1)) {
            return false;
        }
        os1 os1Var = (os1) obj;
        return os1Var.a.equals(this.a) && os1Var.b == this.b;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b * 31);
    }
}
