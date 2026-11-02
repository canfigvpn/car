package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class e52 extends y71 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    public e52(float f, float f2, float f3, float f4, boolean z, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e52)) {
            return false;
        }
        e52 e52Var = (e52) obj;
        return w60.b(this.a, e52Var.a) && w60.b(this.b, e52Var.b) && w60.b(this.c, e52Var.c) && w60.b(this.d, e52Var.d) && this.e == e52Var.e;
    }

    @Override // defpackage.y71
    public final t71 f() {
        g52 g52Var = new g52();
        g52Var.s = this.a;
        g52Var.t = this.b;
        g52Var.u = this.c;
        g52Var.v = this.d;
        g52Var.w = this.e;
        return g52Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        g52 g52Var = (g52) t71Var;
        g52Var.s = this.a;
        g52Var.t = this.b;
        g52Var.u = this.c;
        g52Var.v = this.d;
        g52Var.w = this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + k3.a(this.d, k3.a(this.c, k3.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public e52(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }
}
