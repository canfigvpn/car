package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class te0 extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ pe0 k;
    public final /* synthetic */ gq1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ te0(pe0 pe0Var, gq1 gq1Var, sx sxVar, int i) {
        super(2, sxVar);
        this.i = i;
        this.k = pe0Var;
        this.l = gq1Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        ez ezVar = (ez) obj;
        sx sxVar = (sx) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((te0) p(sxVar, ezVar)).r(ll2Var);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        switch (this.i) {
            case 0:
                return new te0(this.k, this.l, sxVar, 0);
            default:
                return new te0(this.k, this.l, sxVar, 1);
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        gq1 gq1Var = this.l;
        pe0 pe0Var = this.k;
        fz fzVar = fz.e;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 == 0) {
                    ix.Q(obj);
                    se0 se0Var = new se0(gq1Var, 1);
                    this.j = 1;
                    return pe0Var.a(se0Var, this) == fzVar ? fzVar : ll2Var;
                }
                if (i2 == 1) {
                    ix.Q(obj);
                    return ll2Var;
                }
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i3 = this.j;
                if (i3 == 0) {
                    ix.Q(obj);
                    se0 se0Var2 = new se0(gq1Var, 3);
                    this.j = 1;
                    return pe0Var.a(se0Var2, this) == fzVar ? fzVar : ll2Var;
                }
                if (i3 == 1) {
                    ix.Q(obj);
                    return ll2Var;
                }
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
