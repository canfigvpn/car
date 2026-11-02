package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class th1 extends zh1 {
    public static final th1 c = new th1(0, 1, 1);

    @Override // defpackage.zh1
    public final void a(vp vpVar, ae aeVar, o52 o52Var, rs1 rs1Var, ai1 ai1Var) {
        lr1 lr1Var = (lr1) vpVar.e(0);
        w91 w91Var = (w91) rs1Var.j;
        ol1 ol1Var = w91Var != null ? (ol1) w91Var.g(lr1Var) : null;
        if (ol1Var != null) {
            ArrayList arrayList = (ArrayList) rs1Var.k;
            if (arrayList == null) {
                arrayList = new ArrayList();
                rs1Var.k = arrayList;
            }
            arrayList.add((fa1) rs1Var.d);
            rs1Var.d = ol1Var.f;
        }
    }
}
