package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class d50 extends wa2 implements ij0 {
    public final /* synthetic */ int i = 1;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d50(da1 da1Var, h50 h50Var, h72 h72Var, sx sxVar) {
        super(2, sxVar);
        this.j = da1Var;
        this.k = h50Var;
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
                ((d50) p(sxVar, ezVar)).r(ll2Var);
                return ll2Var;
            default:
                return ((d50) p(sxVar, ezVar)).r(ll2Var);
        }
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        Object obj2 = this.l;
        Object obj3 = this.k;
        switch (i) {
            case 0:
                return new d50((da1) this.j, (h50) obj3, (h72) obj2, sxVar);
            default:
                d50 d50Var = new d50((ao1) obj3, (id2) obj2, sxVar);
                d50Var.j = obj;
                return d50Var;
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        Object obj2 = this.l;
        Object obj3 = this.k;
        switch (i) {
            case 0:
                ix.Q(obj);
                h50 h50Var = (h50) obj3;
                h72 h72Var = (h72) obj2;
                for (kb1 kb1Var : (Set) ((da1) this.j).getValue()) {
                    if (!((List) h50Var.b().e.e.getValue()).contains(kb1Var) && !h72Var.contains(kb1Var)) {
                        h50Var.b().c(kb1Var);
                    }
                }
                return ll2.a;
            default:
                ix.Q(obj);
                ez ezVar = (ez) this.j;
                ao1 ao1Var = (ao1) obj3;
                id2 id2Var = (id2) obj2;
                sx sxVar = null;
                nj2.y(ezVar, null, new jy(ao1Var, id2Var, sxVar, 1), 1);
                return nj2.y(ezVar, null, new jy(ao1Var, id2Var, sxVar, 2), 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d50(ao1 ao1Var, id2 id2Var, sx sxVar) {
        super(2, sxVar);
        this.k = ao1Var;
        this.l = id2Var;
    }
}
