package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yu0 implements mv0 {
    public static final yu0 a = new yu0();
    public static final xu0 b = xu0.b;

    @Override // defpackage.mv0
    public final Object a(n20 n20Var) {
        qx.k(n20Var);
        return new wu0((Map) new bm0(g92.a, lu0.a, 1).i(n20Var));
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return b;
    }

    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        wu0 wu0Var = (wu0) obj;
        wu0Var.getClass();
        qx.l(p61Var);
        new bm0(g92.a, lu0.a, 1).d(p61Var, wu0Var);
    }
}
