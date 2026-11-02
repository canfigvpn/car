package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cu0 implements mv0 {
    public static final cu0 a = new cu0();
    public static final bu0 b = bu0.b;

    @Override // defpackage.mv0
    public final Object a(n20 n20Var) {
        qx.k(n20Var);
        return new au0((List) new me(lu0.a, 0).i(n20Var));
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return b;
    }

    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        au0 au0Var = (au0) obj;
        au0Var.getClass();
        qx.l(p61Var);
        lu0 lu0Var = lu0.a;
        u12 u12Var = lu0.b;
        u12Var.getClass();
        ke keVar = new ke(u12Var, 1);
        List list = au0Var.e;
        int size = list.size();
        p61 p61VarU = p61Var.u(keVar);
        Iterator it = list.iterator();
        for (int i = 0; i < size; i++) {
            p61VarU.N(keVar, i, lu0Var, it.next());
        }
        p61VarU.T(keVar);
    }
}
