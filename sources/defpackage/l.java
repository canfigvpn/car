package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ jq j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(jq jqVar, sx sxVar, int i) {
        super(2, sxVar);
        this.i = i;
        this.j = jqVar;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        ez ezVar = (ez) obj;
        sx sxVar = (sx) obj2;
        switch (i) {
            case 0:
                ((l) p(sxVar, ezVar)).r(ll2Var);
                break;
            default:
                ((l) p(sxVar, ezVar)).r(ll2Var);
                break;
        }
        return ll2Var;
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        jq jqVar = this.j;
        switch (i) {
            case 0:
                return new l(jqVar, sxVar, 0);
            default:
                return new l(jqVar, sxVar, 1);
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        sx sxVar = null;
        jq jqVar = this.j;
        switch (i) {
            case 0:
                ix.Q(obj);
                if (jqVar.F == null) {
                    wn0 wn0Var = new wn0();
                    f91 f91Var = jqVar.u;
                    if (f91Var != null) {
                        nj2.y(jqVar.t0(), null, new e(0, sxVar, f91Var, wn0Var), 3);
                    }
                    jqVar.F = wn0Var;
                }
                break;
            default:
                ix.Q(obj);
                wn0 wn0Var2 = jqVar.F;
                if (wn0Var2 != null) {
                    xn0 xn0Var = new xn0(wn0Var2);
                    f91 f91Var2 = jqVar.u;
                    if (f91Var2 != null) {
                        nj2.y(jqVar.t0(), null, new e(1, sxVar, f91Var2, xn0Var), 3);
                    }
                    jqVar.F = null;
                }
                break;
        }
        return ll2Var;
    }
}
