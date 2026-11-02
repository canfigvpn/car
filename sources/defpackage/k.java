package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ jq k;
    public final /* synthetic */ rp1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(jq jqVar, rp1 rp1Var, sx sxVar, int i) {
        super(2, sxVar);
        this.i = i;
        this.k = jqVar;
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
            case 1:
                break;
            case 2:
                break;
        }
        return ((k) p(sxVar, ezVar)).r(ll2Var);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        rp1 rp1Var = this.l;
        jq jqVar = this.k;
        switch (i) {
            case 0:
                return new k(jqVar, rp1Var, sxVar, 0);
            case 1:
                return new k(jqVar, rp1Var, sxVar, 1);
            case 2:
                return new k(jqVar, rp1Var, sxVar, 2);
            default:
                return new k(jqVar, rp1Var, sxVar, 3);
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        rp1 rp1Var = this.l;
        jq jqVar = this.k;
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
                f91 f91Var = jqVar.u;
                if (f91Var == null) {
                    return ll2Var;
                }
                qp1 qp1Var = new qp1(rp1Var);
                this.j = 1;
                return f91Var.b(qp1Var, this) == fzVar ? fzVar : ll2Var;
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
                f91 f91Var2 = jqVar.u;
                if (f91Var2 == null) {
                    return ll2Var;
                }
                qp1 qp1Var2 = new qp1(rp1Var);
                this.j = 1;
                return f91Var2.b(qp1Var2, this) == fzVar ? fzVar : ll2Var;
            case 2:
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
                f91 f91Var3 = jqVar.u;
                if (f91Var3 == null) {
                    return ll2Var;
                }
                this.j = 1;
                return f91Var3.b(rp1Var, this) == fzVar ? fzVar : ll2Var;
            default:
                int i5 = this.j;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ix.Q(obj);
                        return ll2Var;
                    }
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ix.Q(obj);
                f91 f91Var4 = jqVar.u;
                if (f91Var4 == null) {
                    return ll2Var;
                }
                sp1 sp1Var = new sp1(rp1Var);
                this.j = 1;
                return f91Var4.b(sp1Var, this) == fzVar ? fzVar : ll2Var;
        }
    }
}
