package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jn extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ ti0 j;
    public final /* synthetic */ da1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jn(ti0 ti0Var, da1 da1Var, sx sxVar, int i) {
        super(2, sxVar);
        this.i = i;
        this.j = ti0Var;
        this.k = da1Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        ez ezVar = (ez) obj;
        sx sxVar = (sx) obj2;
        switch (i) {
            case 0:
                ((jn) p(sxVar, ezVar)).r(ll2Var);
                break;
            default:
                ((jn) p(sxVar, ezVar)).r(ll2Var);
                break;
        }
        return ll2Var;
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        da1 da1Var = this.k;
        ti0 ti0Var = this.j;
        switch (i) {
            case 0:
                return new jn(ti0Var, da1Var, sxVar, 0);
            default:
                return new jn(ti0Var, da1Var, sxVar, 1);
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        ti0 ti0Var = this.j;
        da1 da1Var = this.k;
        switch (i) {
            case 0:
                ix.Q(obj);
                if (((kn) da1Var.getValue()).k) {
                    ti0Var.a();
                }
                break;
            default:
                ix.Q(obj);
                if (((d41) da1Var.getValue()).m) {
                    ti0Var.a();
                }
                break;
        }
        return ll2Var;
    }
}
