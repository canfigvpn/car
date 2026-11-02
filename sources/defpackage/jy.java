package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jy extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ ao1 k;
    public final /* synthetic */ id2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jy(ao1 ao1Var, id2 id2Var, sx sxVar, int i) {
        super(2, sxVar);
        this.i = i;
        this.k = ao1Var;
        this.l = id2Var;
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
        return ((jy) p(sxVar, ezVar)).r(ll2Var);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        switch (this.i) {
            case 0:
                return new jy(this.k, this.l, sxVar, 0);
            case 1:
                return new jy(this.k, this.l, sxVar, 1);
            default:
                return new jy(this.k, this.l, sxVar, 2);
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        id2 id2Var = this.l;
        ao1 ao1Var = this.k;
        fz fzVar = fz.e;
        ll2 ll2Var = ll2.a;
        sx sxVar = null;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.j;
                if (i3 == 0) {
                    ix.Q(obj);
                    this.j = 1;
                    Object objW = qx.w(new d50(ao1Var, id2Var, null), this);
                    if (objW != fzVar) {
                        objW = ll2Var;
                    }
                    if (objW == fzVar) {
                        return fzVar;
                    }
                } else {
                    if (i3 != 1) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ix.Q(obj);
                }
                return ll2Var;
            case 1:
                int i4 = this.j;
                if (i4 == 0) {
                    ix.Q(obj);
                    this.j = 1;
                    Object objH = ei1.h(ao1Var, new qh0(i2, sxVar, id2Var), this);
                    if (objH != fzVar) {
                        objH = ll2Var;
                    }
                    if (objH == fzVar) {
                        return fzVar;
                    }
                } else {
                    if (i4 != 1) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ix.Q(obj);
                }
                return ll2Var;
            default:
                int i5 = this.j;
                if (i5 == 0) {
                    ix.Q(obj);
                    this.j = 1;
                    p41 p41Var = new p41(id2Var, 0);
                    q41 q41Var = new q41(id2Var, 0);
                    q41 q41Var2 = new q41(id2Var, 1);
                    x7 x7Var = new x7(19, id2Var);
                    ji0 ji0Var = new ji0(6, p41Var);
                    m mVar = new m(9, q41Var);
                    m2 m2Var = new m2(19);
                    float f = u70.a;
                    Object objH2 = ei1.h(ao1Var, new s70(m2Var, new fs1(), null, ji0Var, x7Var, q41Var2, mVar, null), this);
                    if (objH2 != fzVar) {
                        objH2 = ll2Var;
                    }
                    if (objH2 != fzVar) {
                        objH2 = ll2Var;
                    }
                    if (objH2 != fzVar) {
                        objH2 = ll2Var;
                    }
                    if (objH2 == fzVar) {
                        return fzVar;
                    }
                } else {
                    if (i5 != 1) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ix.Q(obj);
                }
                return ll2Var;
        }
    }
}
