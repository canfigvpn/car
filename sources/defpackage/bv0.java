package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bv0 implements mv0 {
    public static final bv0 a = new bv0();
    public static final u12 b = v12.e("kotlinx.serialization.json.JsonPrimitive", xp1.j, new s12[0]);

    @Override // defpackage.mv0
    public final Object a(n20 n20Var) {
        iu0 iu0VarN0 = qx.k(n20Var).n0();
        if (iu0VarN0 instanceof av0) {
            return (av0) iu0VarN0;
        }
        throw ux.c(-1, "Unexpected JSON element, expected JsonPrimitive, had " + js1.a(iu0VarN0.getClass()), iu0VarN0.toString());
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return b;
    }

    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        av0 av0Var = (av0) obj;
        av0Var.getClass();
        qx.l(p61Var);
        if (av0Var instanceof tu0) {
            p61Var.O(uu0.a, tu0.INSTANCE);
        } else {
            p61Var.O(ru0.a, (qu0) av0Var);
        }
    }
}
