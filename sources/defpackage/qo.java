package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qo extends wa2 implements ij0 {
    public final /* synthetic */ int i = 0;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ to l;
    public final /* synthetic */ qe0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo(to toVar, qe0 qe0Var, Object obj, sx sxVar) {
        super(2, sxVar);
        this.l = toVar;
        this.m = qe0Var;
        this.k = obj;
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
        return ((qo) p(sxVar, ezVar)).r(ll2Var);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        qe0 qe0Var = this.m;
        to toVar = this.l;
        switch (i) {
            case 0:
                return new qo(toVar, qe0Var, this.k, sxVar);
            default:
                qo qoVar = new qo(toVar, qe0Var, sxVar);
                qoVar.k = obj;
                return qoVar;
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        fz fzVar = fz.e;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ix.Q(obj);
                        return ll2Var;
                    }
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ix.Q(obj);
                jj0 jj0Var = this.l.i;
                Object obj2 = this.k;
                this.j = 1;
                return jj0Var.d(this.m, obj2, this) == fzVar ? fzVar : ll2Var;
            default:
                int i3 = this.j;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ix.Q(obj);
                        return ll2Var;
                    }
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ix.Q(obj);
                ez ezVar = (ez) this.k;
                gs1 gs1Var = new gs1();
                to toVar = this.l;
                pe0 pe0Var = toVar.h;
                so soVar = new so(gs1Var, ezVar, toVar, this.m, 0);
                this.j = 1;
                return pe0Var.a(soVar, this) == fzVar ? fzVar : ll2Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo(to toVar, qe0 qe0Var, sx sxVar) {
        super(2, sxVar);
        this.l = toVar;
        this.m = qe0Var;
    }
}
