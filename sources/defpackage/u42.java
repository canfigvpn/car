package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class u42 implements mv0 {
    public static final u42 a = new u42();
    public static final yp1 b = new yp1("kotlin.Short", xp1.i);

    @Override // defpackage.mv0
    public final Object a(n20 n20Var) {
        return Short.valueOf(n20Var.w());
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return b;
    }

    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        p61Var.P(((Number) obj).shortValue());
    }
}
