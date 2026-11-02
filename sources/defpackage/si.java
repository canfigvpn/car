package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class si implements s3 {
    public final float a;

    public si(float f) {
        this.a = f;
    }

    @Override // defpackage.s3
    public final int a(int i, int i2, kw0 kw0Var) {
        return Math.round((1.0f + this.a) * ((i2 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof si) && Float.compare(this.a, ((si) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return k3.k(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}
