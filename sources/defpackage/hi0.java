package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hi0 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ p82 f;
    public final /* synthetic */ ij0 g;

    public /* synthetic */ hi0(p82 p82Var, ij0 ij0Var, int i) {
        this.e = i;
        this.f = p82Var;
        this.g = ij0Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        ij0 ij0Var = this.g;
        final p82 p82Var = this.f;
        final int i2 = 1;
        f01 f01Var = (f01) obj;
        switch (i) {
            case 0:
                f01Var.getClass();
                final int i3 = 0;
                f01.U(f01Var, null, new gt(new jj0() { // from class: gi0
                    @Override // defpackage.jj0
                    public final Object d(Object obj2, Object obj3, Object obj4) {
                        int i4 = i3;
                        ll2 ll2Var2 = ll2.a;
                        p82 p82Var2 = p82Var;
                        vy0 vy0Var = (vy0) obj2;
                        ak0 ak0Var = (ak0) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        switch (i4) {
                            case 0:
                                vy0Var.getClass();
                                if (!ak0Var.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    ak0Var.R();
                                } else {
                                    p61.c(((oi0) p82Var2.getValue()).d, ak0Var, 8);
                                }
                                break;
                            default:
                                vy0Var.getClass();
                                if (!ak0Var.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    ak0Var.R();
                                } else {
                                    p61.q(((oi0) p82Var2.getValue()).d, ak0Var, 8);
                                }
                                break;
                        }
                        return ll2Var2;
                    }
                }, true, -1413520592), 3);
                f01.U(f01Var, null, new gt(new jj0() { // from class: gi0
                    @Override // defpackage.jj0
                    public final Object d(Object obj2, Object obj3, Object obj4) {
                        int i4 = i2;
                        ll2 ll2Var2 = ll2.a;
                        p82 p82Var2 = p82Var;
                        vy0 vy0Var = (vy0) obj2;
                        ak0 ak0Var = (ak0) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        switch (i4) {
                            case 0:
                                vy0Var.getClass();
                                if (!ak0Var.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    ak0Var.R();
                                } else {
                                    p61.c(((oi0) p82Var2.getValue()).d, ak0Var, 8);
                                }
                                break;
                            default:
                                vy0Var.getClass();
                                if (!ak0Var.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    ak0Var.R();
                                } else {
                                    p61.q(((oi0) p82Var2.getValue()).d, ak0Var, 8);
                                }
                                break;
                        }
                        return ll2Var2;
                    }
                }, true, -1640328345), 3);
                f01.U(f01Var, null, ws0.n, 3);
                List list = ((oi0) p82Var.getValue()).c;
                f01Var.V(list.size(), new qi(3, new n30(4), list), new sd(1, list), new gt(new li0(list, ij0Var, p82Var, 0), true, 802480018));
                break;
            default:
                f01Var.getClass();
                List list2 = ((om0) p82Var.getValue()).b;
                f01Var.V(list2.size(), new qi(6, new n30(11), list2), new sd(3, list2), new gt(new li0(list2, ij0Var, p82Var, 1), true, 802480018));
                break;
        }
        return ll2Var;
    }
}
