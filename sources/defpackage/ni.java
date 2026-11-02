package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ni extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ao1 l;
    public final /* synthetic */ mh2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ni(ao1 ao1Var, mh2 mh2Var, sx sxVar, int i) {
        super(2, sxVar);
        this.i = i;
        this.l = ao1Var;
        this.m = mh2Var;
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
        return ((ni) p(sxVar, ezVar)).r(ll2Var);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        switch (this.i) {
            case 0:
                ni niVar = new ni(this.l, this.m, sxVar, 0);
                niVar.k = obj;
                return niVar;
            default:
                ni niVar2 = new ni(this.l, this.m, sxVar, 1);
                niVar2.k = obj;
                return niVar2;
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        mh2 mh2Var = this.m;
        ao1 ao1Var = this.l;
        fz fzVar = fz.e;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 == 0) {
                    ix.Q(obj);
                    mi miVar = new mi((ez) this.k, mh2Var, null);
                    this.j = 1;
                    return ei1.h(ao1Var, miVar, this) == fzVar ? fzVar : ll2Var;
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
                    pi piVar = new pi((ez) this.k, mh2Var, null);
                    this.j = 1;
                    return ((cb2) ao1Var).F0(piVar, this) == fzVar ? fzVar : ll2Var;
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
