package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yu extends dw0 implements ij0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ av g;
    public final /* synthetic */ e5 h;
    public final /* synthetic */ gt i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu(e5 e5Var, av avVar, gt gtVar) {
        super(2);
        this.h = e5Var;
        this.g = avVar;
        this.i = gtVar;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.f;
        ll2 ll2Var = ll2.a;
        gt gtVar = this.i;
        e5 e5Var = this.h;
        av avVar = this.g;
        switch (i) {
            case 0:
                ak0 ak0Var = (ak0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ak0Var.R();
                } else {
                    ak0Var.W(866651995);
                    yv.a(e5Var, avVar.k, gtVar, ak0Var, 0);
                    ak0Var.p(false);
                }
                break;
            default:
                ((Number) obj2).intValue();
                avVar.a(e5Var, gtVar, (ak0) obj, ei1.P(1));
                break;
        }
        return ll2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu(av avVar, e5 e5Var, gt gtVar, int i) {
        super(2);
        this.g = avVar;
        this.h = e5Var;
        this.i = gtVar;
    }
}
