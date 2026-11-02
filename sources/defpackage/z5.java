package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class z5 extends dw0 implements ij0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z5(int i, Object obj, Object obj2) {
        super(2);
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.f;
        ll2 ll2Var = ll2.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                p02 p02Var = (p02) obj2;
                a6 a6Var = (a6) obj3;
                if (!((q02) obj4).b.b(p02Var.f)) {
                    a6Var.l(iIntValue, p02Var);
                    a6Var.k.c(ll2Var);
                }
                break;
            case 1:
                ak0 ak0Var = (ak0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!ak0Var.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ak0Var.R();
                } else {
                    Boolean bool = (Boolean) ((gx0) obj4).g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    ij0 ij0Var = (ij0) obj3;
                    ak0Var.Y(bool);
                    boolean zG = ak0Var.g(zBooleanValue);
                    if (zBooleanValue) {
                        ij0Var.g(ak0Var, 0);
                    } else {
                        if (ak0Var.l != 0) {
                            hv.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!ak0Var.S) {
                            if (zG) {
                                k52 k52Var = ak0Var.G;
                                int i2 = k52Var.g;
                                int i3 = k52Var.h;
                                ev evVar = ak0Var.M;
                                evVar.getClass();
                                evVar.d(false);
                                evVar.b.d.Z(yg1.c);
                                dv1.I(ak0Var.s, i2, i3);
                                ak0Var.G.t();
                            } else {
                                ak0Var.Q();
                            }
                        }
                    }
                    if (ak0Var.y && ak0Var.G.i == ak0Var.z) {
                        ak0Var.z = -1;
                        ak0Var.y = false;
                    }
                    ak0Var.p(false);
                }
                break;
            default:
                sm smVar = (sm) obj;
                al0 al0Var = (al0) obj2;
                me1 me1Var = (me1) obj4;
                ax0 ax0Var = me1Var.s;
                if (!ax0Var.I()) {
                    me1Var.O = true;
                } else {
                    me1Var.L = smVar;
                    me1Var.K = al0Var;
                    cj1 snapshotObserver = ((e5) dx0.a(ax0Var)).getSnapshotObserver();
                    bu1 bu1Var = me1.Q;
                    snapshotObserver.a.c(me1Var, je1.g, (le1) obj3);
                    me1Var.O = false;
                }
                break;
        }
        return ll2Var;
    }
}
