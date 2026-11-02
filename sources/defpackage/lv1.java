package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class lv1 extends rw {
    @Override // defpackage.rw
    public final void x(g42 g42Var, float f, float f2) {
        float f3 = f2 * f;
        g42Var.d(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        c42 c42Var = new c42(0.0f, 0.0f, f4, f4);
        c42Var.f = 180.0f;
        c42Var.g = 90.0f;
        g42Var.f.add(c42Var);
        a42 a42Var = new a42(c42Var);
        g42Var.a(180.0f);
        g42Var.g.add(a42Var);
        g42Var.d = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        g42Var.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        g42Var.c = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
