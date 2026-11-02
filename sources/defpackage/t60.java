package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class t60 implements mv0 {
    public static final t60 a = new t60();
    public static final yp1 b = new yp1("kotlin.Double", xp1.e);

    @Override // defpackage.mv0
    public final Object a(n20 n20Var) {
        return Double.valueOf(n20Var.C());
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return b;
    }

    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        p61Var.B(((Number) obj).doubleValue());
    }
}
