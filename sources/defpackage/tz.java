package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class tz extends rw {
    @Override // defpackage.rw
    public final void x(g42 g42Var, float f, float f2) {
        float f3 = f2 * f;
        g42Var.d(f3, 180.0f, 90.0f);
        double d = f3;
        g42Var.c((float) (Math.sin(Math.toRadians(90.0d)) * d), (float) (Math.sin(Math.toRadians(0.0d)) * d));
    }
}
