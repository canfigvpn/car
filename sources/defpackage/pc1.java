package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pc1 implements kj0 {
    public final /* synthetic */ fz1 e;
    public final /* synthetic */ kb1 f;
    public final /* synthetic */ ew1 g;
    public final /* synthetic */ da1 h;
    public final /* synthetic */ p82 i;

    public pc1(fz1 fz1Var, kb1 kb1Var, fw1 fw1Var, da1 da1Var, p82 p82Var) {
        this.e = fz1Var;
        this.f = kb1Var;
        this.g = fw1Var;
        this.h = da1Var;
        this.i = p82Var;
    }

    @Override // defpackage.kj0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        Object objPrevious;
        ua uaVar = (ua) obj;
        kb1 kb1Var = (kb1) obj2;
        ak0 ak0Var = (ak0) obj3;
        ((Number) obj4).intValue();
        boolean zJ = ws0.j(this.e.c.getValue(), this.f);
        if (!((Boolean) this.h.getValue()).booleanValue() && !zJ) {
            List list = (List) this.i.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!ws0.j(kb1Var, (kb1) objPrevious));
            kb1Var = (kb1) objPrevious;
        }
        if (kb1Var == null) {
            ak0Var.W(105930796);
        } else {
            ak0Var.W(-1520603531);
            qx.f(kb1Var, this.g, vs0.C(-1263531443, new ji(7, kb1Var, uaVar), ak0Var), ak0Var, 384);
        }
        ak0Var.p(false);
        return ll2.a;
    }
}
