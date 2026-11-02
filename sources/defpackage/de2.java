package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class de2 {
    public static final ru1 g = vv.H(new v22(13), new xw1(26, 0));
    public final zj1 a;
    public final zj1 b = new zj1(0.0f);
    public final ak1 c = new ak1(0);
    public yr1 d = yr1.e;
    public long e = of2.b;
    public final dk1 f;

    public de2(di1 di1Var, float f) {
        this.a = new zj1(f);
        this.f = new dk1(di1Var, is1.o);
    }

    public final void a(di1 di1Var, yr1 yr1Var, int i, int i2) {
        float f;
        float f2 = i2 - i;
        this.b.i(f2);
        float f3 = yr1Var.a;
        float f4 = yr1Var.b;
        yr1 yr1Var2 = this.d;
        float f5 = yr1Var2.a;
        zj1 zj1Var = this.a;
        if (f3 != f5 || f4 != yr1Var2.b) {
            boolean z = di1Var == di1.e;
            if (z) {
                f3 = f4;
            }
            float f6 = z ? yr1Var.d : yr1Var.c;
            float fH = zj1Var.h();
            float f7 = i;
            float f8 = fH + f7;
            if (f6 <= f8 && (f3 >= fH || f6 - f3 <= f7)) {
                f = (f3 >= fH || f6 - f3 > f7) ? 0.0f : f3 - fH;
            } else {
                f = f6 - f8;
            }
            zj1Var.i(zj1Var.h() + f);
            this.d = yr1Var;
        }
        zj1Var.i(ex.g(zj1Var.h(), 0.0f, f2));
        this.c.i(i);
    }
}
