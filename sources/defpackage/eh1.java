package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class eh1 extends zh1 {
    public static final eh1 c = new eh1(0, 1, 1);

    @Override // defpackage.zh1
    public final void a(vp vpVar, ae aeVar, o52 o52Var, rs1 rs1Var, ai1 ai1Var) {
        fa1 fa1Var;
        lr1 lr1Var = (lr1) vpVar.e(0);
        w91 w91Var = (w91) rs1Var.j;
        if (w91Var == null || ((ol1) w91Var.g(lr1Var)) == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) rs1Var.k;
        if (arrayList != null && (fa1Var = (fa1) arrayList.remove(arrayList.size() - 1)) != null) {
            rs1Var.d = fa1Var;
        }
        w91Var.k(lr1Var);
    }
}
