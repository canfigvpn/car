package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class u6 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ao1 ao1Var, sx sxVar) {
        int i = this.a;
        int i2 = 0;
        sx sxVar2 = null;
        Object obj = this.b;
        fz fzVar = fz.e;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                Object objH = ei1.h(ao1Var, new t6(i2, sxVar2, (v6) obj), sxVar);
                return objH == fzVar ? objH : ll2Var;
            case 1:
                me2 me2Var = (me2) obj;
                a52 a52Var = me2Var.z;
                ke2 ke2Var = me2Var.y;
                cb2 cb2Var = (cb2) ao1Var;
                cb2Var.getClass();
                Object objH2 = ei1.h(ao1Var, new pi(new h7(qx.V(cb2Var).D), a52Var, ke2Var, null), sxVar);
                if (objH2 != fzVar) {
                    objH2 = ll2Var;
                }
                return objH2 == fzVar ? objH2 : ll2Var;
            case 2:
                Object objH3 = ei1.h(ao1Var, new t6(2, sxVar2, (tc0) obj), sxVar);
                return objH3 == fzVar ? objH3 : ll2Var;
            case 3:
                Object objF0 = ((cb2) ao1Var).F0(new lu1((ej0) obj, sxVar2, 1), sxVar);
                return objF0 == fzVar ? objF0 : ll2Var;
            case 4:
                Object objH4 = ei1.h(ao1Var, new pi((s92) obj, null), sxVar);
                return objH4 == fzVar ? objH4 : ll2Var;
            case 5:
                Object objH5 = ei1.h(ao1Var, new lu1(new f(1, (rc2) obj, rc2.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 22), sxVar2, i2), sxVar);
                if (objH5 != fzVar) {
                    objH5 = ll2Var;
                }
                return objH5 == fzVar ? objH5 : ll2Var;
            default:
                Object objW = qx.w(new d50(ao1Var, (id2) obj, null), sxVar);
                if (objW != fzVar) {
                    objW = ll2Var;
                }
                return objW == fzVar ? objW : ll2Var;
        }
    }
}
