package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jl extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ ur0 k;
    public final /* synthetic */ h72 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jl(ur0 ur0Var, h72 h72Var, sx sxVar, int i) {
        super(2, sxVar);
        this.i = i;
        this.k = ur0Var;
        this.l = h72Var;
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
        return ((jl) p(sxVar, ezVar)).r(ll2Var);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        h72 h72Var = this.l;
        ur0 ur0Var = this.k;
        switch (i) {
            case 0:
                return new jl(ur0Var, h72Var, sxVar, 0);
            case 1:
                return new jl(ur0Var, h72Var, sxVar, 1);
            default:
                return new jl(ur0Var, h72Var, sxVar, 2);
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        h72 h72Var = this.l;
        ur0 ur0Var = this.k;
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
                pe0 pe0VarA = ur0Var.a();
                il ilVar = new il(h72Var, 0);
                this.j = 1;
                return pe0VarA.a(ilVar, this) == fzVar ? fzVar : ll2Var;
            case 1:
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
                pe0 pe0VarA2 = ur0Var.a();
                il ilVar2 = new il(h72Var, 1);
                this.j = 1;
                return pe0VarA2.a(ilVar2, this) == fzVar ? fzVar : ll2Var;
            default:
                int i4 = this.j;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ix.Q(obj);
                        return ll2Var;
                    }
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ix.Q(obj);
                pe0 pe0VarA3 = ur0Var.a();
                il ilVar3 = new il(h72Var, 2);
                this.j = 1;
                return pe0VarA3.a(ilVar3, this) == fzVar ? fzVar : ll2Var;
        }
    }
}
