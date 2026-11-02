package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class f72 extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ij0 l;
    public final /* synthetic */ da1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f72(ij0 ij0Var, da1 da1Var, sx sxVar, int i) {
        super(2, sxVar);
        this.i = i;
        this.l = ij0Var;
        this.m = da1Var;
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
            case 1:
                break;
        }
        return ((f72) p(sxVar, ezVar)).r(ll2Var);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        switch (this.i) {
            case 0:
                f72 f72Var = new f72(this.l, this.m, sxVar, 0);
                f72Var.k = obj;
                return f72Var;
            case 1:
                f72 f72Var2 = new f72(this.l, this.m, sxVar, 1);
                f72Var2.k = obj;
                return f72Var2;
            default:
                f72 f72Var3 = new f72(this.l, this.m, sxVar, 2);
                f72Var3.k = obj;
                return f72Var3;
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        da1 da1Var = this.m;
        ij0 ij0Var = this.l;
        fz fzVar = fz.e;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 == 0) {
                    ix.Q(obj);
                    gq1 gq1Var = new gq1(da1Var, ((ez) this.k).h());
                    this.j = 1;
                    return ij0Var.g(gq1Var, this) == fzVar ? fzVar : ll2Var;
                }
                if (i2 == 1) {
                    ix.Q(obj);
                    return ll2Var;
                }
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i3 = this.j;
                if (i3 == 0) {
                    ix.Q(obj);
                    gq1 gq1Var2 = new gq1(da1Var, ((ez) this.k).h());
                    this.j = 1;
                    return ij0Var.g(gq1Var2, this) == fzVar ? fzVar : ll2Var;
                }
                if (i3 == 1) {
                    ix.Q(obj);
                    return ll2Var;
                }
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i4 = this.j;
                if (i4 == 0) {
                    ix.Q(obj);
                    gq1 gq1Var3 = new gq1(da1Var, ((ez) this.k).h());
                    this.j = 1;
                    return ij0Var.g(gq1Var3, this) == fzVar ? fzVar : ll2Var;
                }
                if (i4 == 1) {
                    ix.Q(obj);
                    return ll2Var;
                }
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
