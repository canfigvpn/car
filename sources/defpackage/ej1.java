package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
final class ej1 extends y71 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public ej1(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            tp0.a("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        ej1 ej1Var = obj instanceof ej1 ? (ej1) obj : null;
        return ej1Var != null && w60.b(this.a, ej1Var.a) && w60.b(this.b, ej1Var.b) && w60.b(this.c, ej1Var.c) && w60.b(this.d, ej1Var.d);
    }

    @Override // defpackage.y71
    public final t71 f() {
        fj1 fj1Var = new fj1();
        fj1Var.s = this.a;
        fj1Var.t = this.b;
        fj1Var.u = this.c;
        fj1Var.v = this.d;
        fj1Var.w = true;
        return fj1Var;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        fj1 fj1Var = (fj1) t71Var;
        fj1Var.s = this.a;
        fj1Var.t = this.b;
        fj1Var.u = this.c;
        fj1Var.v = this.d;
        fj1Var.w = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + k3.a(this.d, k3.a(this.c, k3.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
