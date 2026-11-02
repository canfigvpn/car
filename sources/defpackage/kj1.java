package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class kj1 implements gj1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public kj1(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            tp0.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.gj1
    public final float a(kw0 kw0Var) {
        return kw0Var == kw0.e ? this.a : this.c;
    }

    @Override // defpackage.gj1
    public final float b(kw0 kw0Var) {
        return kw0Var == kw0.e ? this.c : this.a;
    }

    @Override // defpackage.gj1
    public final float c() {
        return this.d;
    }

    @Override // defpackage.gj1
    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kj1)) {
            return false;
        }
        kj1 kj1Var = (kj1) obj;
        return w60.b(this.a, kj1Var.a) && w60.b(this.b, kj1Var.b) && w60.b(this.c, kj1Var.c) && w60.b(this.d, kj1Var.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + k3.a(this.c, k3.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) w60.c(this.a)) + ", top=" + ((Object) w60.c(this.b)) + ", end=" + ((Object) w60.c(this.c)) + ", bottom=" + ((Object) w60.c(this.d)) + ')';
    }
}
