package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class nh1 extends zh1 {
    public static final nh1 c = new nh1(0, 1, 1);

    @Override // defpackage.zh1
    public final void a(vp vpVar, ae aeVar, o52 o52Var, rs1 rs1Var, ai1 ai1Var) {
        lr1 lr1Var = (lr1) vpVar.e(0);
        Set set = (Set) rs1Var.a;
        if (set == null) {
            return;
        }
        ol1 ol1Var = new ol1(set);
        w91 w91Var = (w91) rs1Var.j;
        if (w91Var == null) {
            long[] jArr = jx1.a;
            w91Var = new w91();
            rs1Var.j = w91Var;
        }
        w91Var.m(lr1Var, ol1Var);
        ((fa1) rs1Var.d).b(new ek0(ol1Var, -1));
    }
}
