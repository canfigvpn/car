package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xv extends dw0 implements ij0 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ gt g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv(aj1 aj1Var, is1 is1Var, gt gtVar, int i) {
        super(2);
        this.h = aj1Var;
        this.i = is1Var;
        this.g = gtVar;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.f;
        ll2 ll2Var = ll2.a;
        gt gtVar = this.g;
        Object obj3 = this.i;
        Object obj4 = this.h;
        int i2 = 1;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                yv.a((aj1) obj4, (is1) obj3, gtVar, (ak0) obj, ei1.P(1));
                break;
            default:
                ak0 ak0Var = (ak0) obj;
                int iIntValue = ((Number) obj2).intValue();
                cr2 cr2Var = (cr2) obj4;
                int i3 = 0;
                if (!ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ak0Var.R();
                } else {
                    e5 e5Var = cr2Var.e;
                    boolean zH = ak0Var.h(cr2Var);
                    Object objL = ak0Var.L();
                    sx sxVar = null;
                    is1 is1Var = cv.a;
                    if (zH || objL == is1Var) {
                        objL = new br2(cr2Var, sxVar, i3);
                        ak0Var.g0(objL);
                    }
                    s5.o((ij0) objL, ak0Var, e5Var);
                    boolean zH2 = ak0Var.h(cr2Var);
                    Object objL2 = ak0Var.L();
                    if (zH2 || objL2 == is1Var) {
                        objL2 = new br2(cr2Var, sxVar, i2);
                        ak0Var.g0(objL2);
                    }
                    s5.o((ij0) objL2, ak0Var, e5Var);
                    ((av) obj3).a(e5Var, gtVar, ak0Var, 0);
                }
                break;
        }
        return ll2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv(cr2 cr2Var, av avVar, gt gtVar) {
        super(2);
        this.h = cr2Var;
        this.i = avVar;
        this.g = gtVar;
    }
}
