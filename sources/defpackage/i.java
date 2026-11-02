package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends wa2 implements ij0 {
    public final /* synthetic */ int i = 1;
    public int j;
    public final /* synthetic */ f91 k;
    public final /* synthetic */ rp1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f91 f91Var, rp1 rp1Var, sx sxVar) {
        super(2, sxVar);
        this.k = f91Var;
        this.l = rp1Var;
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
        return ((i) p(sxVar, ezVar)).r(ll2Var);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        rp1 rp1Var = this.l;
        f91 f91Var = this.k;
        switch (i) {
            case 0:
                return new i(rp1Var, f91Var, sxVar);
            default:
                return new i(f91Var, rp1Var, sxVar);
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        rp1 rp1Var = this.l;
        f91 f91Var = this.k;
        fz fzVar = fz.e;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 == 0) {
                    ix.Q(obj);
                    sp1 sp1Var = new sp1(rp1Var);
                    this.j = 1;
                    return f91Var.b(sp1Var, this) == fzVar ? fzVar : ll2Var;
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
                    this.j = 1;
                    return f91Var.b(rp1Var, this) == fzVar ? fzVar : ll2Var;
                }
                if (i3 == 1) {
                    ix.Q(obj);
                    return ll2Var;
                }
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(rp1 rp1Var, f91 f91Var, sx sxVar) {
        super(2, sxVar);
        this.l = rp1Var;
        this.k = f91Var;
    }
}
