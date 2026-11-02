package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class lu0 implements mv0 {
    public static final lu0 a = new lu0();
    public static final u12 b = v12.d("kotlinx.serialization.json.JsonElement", eo1.c, new s12[0], new n30(21));

    @Override // defpackage.mv0
    public final Object a(n20 n20Var) {
        return qx.k(n20Var).n0();
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return b;
    }

    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        iu0 iu0Var = (iu0) obj;
        iu0Var.getClass();
        qx.l(p61Var);
        if (iu0Var instanceof av0) {
            p61Var.O(bv0.a, iu0Var);
            return;
        }
        if (iu0Var instanceof wu0) {
            p61Var.O(yu0.a, iu0Var);
        } else if (iu0Var instanceof au0) {
            p61Var.O(cu0.a, iu0Var);
        } else {
            qj.p();
        }
    }
}
