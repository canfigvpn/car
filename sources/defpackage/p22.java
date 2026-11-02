package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class p22 extends wa2 implements ej0 {
    public q22 i;
    public Iterator j;
    public int k;
    public int l;
    public final /* synthetic */ ArrayList m;
    public final /* synthetic */ q22 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p22(ArrayList arrayList, q22 q22Var, sx sxVar) {
        super(1, sxVar);
        this.m = arrayList;
        this.n = q22Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        return new p22(this.m, this.n, (sx) obj).r(ll2.a);
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i;
        q22 q22Var;
        Iterator it;
        int i2 = this.l;
        if (i2 == 0) {
            ix.Q(obj);
            Iterator it2 = this.m.iterator();
            i = 0;
            q22Var = this.n;
            it = it2;
        } else {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.k;
            it = this.j;
            q22Var = this.i;
            ix.Q(obj);
        }
        while (it.hasNext()) {
            g22 g22Var = (g22) it.next();
            this.i = q22Var;
            this.j = it;
            this.k = i;
            this.l = 1;
            Object objT = dv1.T(q22Var.a, new o22(g22Var, q22Var, null), this);
            fz fzVar = fz.e;
            if (objT == fzVar) {
                return fzVar;
            }
        }
        return ll2.a;
    }
}
