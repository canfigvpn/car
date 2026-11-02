package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nj1 {
    public v7 a;
    public yi b;
    public float c = 1.0f;
    public kw0 d = kw0.e;

    public abstract void a(float f);

    public abstract void b(yi yiVar);

    public final void c(l80 l80Var, long j, float f, yi yiVar) {
        if (this.c != f) {
            a(f);
            this.c = f;
        }
        if (!ws0.j(this.b, yiVar)) {
            b(yiVar);
            this.b = yiVar;
        }
        kw0 layoutDirection = l80Var.getLayoutDirection();
        if (this.d != layoutDirection) {
            this.d = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (l80Var.d() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (l80Var.d() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((ao2) l80Var.B().b).o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    e(l80Var);
                }
            } finally {
                ((ao2) l80Var.B().b).o(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
    }

    public abstract long d();

    public abstract void e(l80 l80Var);
}
