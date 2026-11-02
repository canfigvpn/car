package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vb2 extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ jj0 k;
    public final /* synthetic */ pp1 l;
    public final /* synthetic */ wn1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vb2(jj0 jj0Var, pp1 pp1Var, wn1 wn1Var, sx sxVar, int i) {
        super(2, sxVar);
        this.i = i;
        this.k = jj0Var;
        this.l = pp1Var;
        this.m = wn1Var;
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
        return ((vb2) p(sxVar, ezVar)).r(ll2Var);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        switch (this.i) {
            case 0:
                return new vb2(this.k, this.l, this.m, sxVar, 0);
            case 1:
                return new vb2(this.k, this.l, this.m, sxVar, 1);
            default:
                return new vb2(this.k, this.l, this.m, sxVar, 2);
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        wn1 wn1Var = this.m;
        pp1 pp1Var = this.l;
        jj0 jj0Var = this.k;
        fz fzVar = fz.e;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 == 0) {
                    ix.Q(obj);
                    uf1 uf1Var = new uf1(wn1Var.c);
                    this.j = 1;
                    return jj0Var.d(pp1Var, uf1Var, this) == fzVar ? fzVar : ll2Var;
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
                    uf1 uf1Var2 = new uf1(wn1Var.c);
                    this.j = 1;
                    return jj0Var.d(pp1Var, uf1Var2, this) == fzVar ? fzVar : ll2Var;
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
                    uf1 uf1Var3 = new uf1(wn1Var.c);
                    this.j = 1;
                    return jj0Var.d(pp1Var, uf1Var3, this) == fzVar ? fzVar : ll2Var;
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
