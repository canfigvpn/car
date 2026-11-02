package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class he2 extends wa2 implements ij0 {
    public int i;
    public final /* synthetic */ me2 j;
    public final /* synthetic */ boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he2(me2 me2Var, boolean z, sx sxVar) {
        super(2, sxVar);
        this.j = me2Var;
        this.k = z;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        return ((he2) p((sx) obj2, (ez) obj)).r(ll2.a);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        return new he2(this.j, this.k, sxVar);
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        mq mqVar;
        int i = this.i;
        yb ybVarM = null;
        ll2 ll2Var = ll2.a;
        if (i != 0) {
            if (i == 1) {
                ix.Q(obj);
                return ll2Var;
            }
            fu1.h("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ix.Q(obj);
        me2 me2Var = this.j;
        if (!of2.c(me2Var.l().b)) {
            ybVarM = y12.m(me2Var.l());
            if (this.k) {
                int iE = of2.e(me2Var.l().b);
                me2Var.c.h(me2.b(me2Var.l().a, j02.c(iE, iE)));
                me2Var.r(sl0.e);
            }
        }
        if (ybVarM != null && (mqVar = me2Var.g) != null) {
            lq lqVarG = ir2.G(ybVarM);
            this.i = 1;
            ((l4) mqVar).a(lqVarG);
            fz fzVar = fz.e;
            if (ll2Var == fzVar) {
                return fzVar;
            }
        }
        return ll2Var;
    }
}
