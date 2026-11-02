package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class uu0 implements mv0 {
    public static final uu0 a = new uu0();
    public static final u12 b = v12.e("kotlinx.serialization.json.JsonNull", x12.b, new s12[0]);

    @Override // defpackage.mv0
    public final Object a(n20 n20Var) {
        qx.k(n20Var);
        if (n20Var.d()) {
            throw new gu0("Expected 'null' literal");
        }
        return tu0.INSTANCE;
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return b;
    }

    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        ((tu0) obj).getClass();
        qx.l(p61Var);
        p61Var.L();
    }
}
