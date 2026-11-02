package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wb2 extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ pp1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wb2(pp1 pp1Var, sx sxVar, int i) {
        super(2, sxVar);
        this.i = i;
        this.j = pp1Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        ez ezVar = (ez) obj;
        sx sxVar = (sx) obj2;
        switch (i) {
            case 0:
                ((wb2) p(sxVar, ezVar)).r(ll2Var);
                break;
            case 1:
                ((wb2) p(sxVar, ezVar)).r(ll2Var);
                break;
            case 2:
                ((wb2) p(sxVar, ezVar)).r(ll2Var);
                break;
            case 3:
                ((wb2) p(sxVar, ezVar)).r(ll2Var);
                break;
            case 4:
                ((wb2) p(sxVar, ezVar)).r(ll2Var);
                break;
            case 5:
                ((wb2) p(sxVar, ezVar)).r(ll2Var);
                break;
            case 6:
                ((wb2) p(sxVar, ezVar)).r(ll2Var);
                break;
            default:
                ((wb2) p(sxVar, ezVar)).r(ll2Var);
                break;
        }
        return ll2Var;
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        pp1 pp1Var = this.j;
        switch (i) {
            case 0:
                return new wb2(pp1Var, sxVar, 0);
            case 1:
                return new wb2(pp1Var, sxVar, 1);
            case 2:
                return new wb2(pp1Var, sxVar, 2);
            case 3:
                return new wb2(pp1Var, sxVar, 3);
            case 4:
                return new wb2(pp1Var, sxVar, 4);
            case 5:
                return new wb2(pp1Var, sxVar, 5);
            case 6:
                return new wb2(pp1Var, sxVar, 6);
            default:
                return new wb2(pp1Var, sxVar, 7);
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        pp1 pp1Var = this.j;
        switch (i) {
            case 0:
                ix.Q(obj);
                pp1Var.a();
                break;
            case 1:
                ix.Q(obj);
                pp1Var.c();
                break;
            case 2:
                ix.Q(obj);
                pp1Var.c();
                break;
            case 3:
                ix.Q(obj);
                pp1Var.a();
                break;
            case 4:
                ix.Q(obj);
                pp1Var.c();
                break;
            case 5:
                ix.Q(obj);
                pp1Var.c();
                break;
            case 6:
                ix.Q(obj);
                pp1Var.a();
                break;
            default:
                ix.Q(obj);
                pp1Var.c();
                break;
        }
        return ll2Var;
    }
}
