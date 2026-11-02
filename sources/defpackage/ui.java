package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ui implements s3 {
    public final float a;

    public ui(float f) {
        this.a = f;
    }

    @Override // defpackage.s3
    public final int a(int i, int i2, kw0 kw0Var) {
        float f = (i2 - i) / 2.0f;
        kw0 kw0Var2 = kw0.e;
        float f2 = this.a;
        if (kw0Var != kw0Var2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ui) && Float.compare(this.a, ((ui) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return k3.k(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}
