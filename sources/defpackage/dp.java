package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class dp implements mv0 {
    public static final dp a = new dp();
    public static final yp1 b = new yp1("kotlin.Char", xp1.d);

    @Override // defpackage.mv0
    public final Object a(n20 n20Var) {
        return Character.valueOf(n20Var.e());
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return b;
    }

    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        p61Var.A(((Character) obj).charValue());
    }
}
