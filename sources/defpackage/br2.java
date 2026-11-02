package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class br2 extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ cr2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ br2(cr2 cr2Var, sx sxVar, int i) {
        super(2, sxVar);
        this.i = i;
        this.k = cr2Var;
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
        return ((br2) p(sxVar, ezVar)).r(ll2Var);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        cr2 cr2Var = this.k;
        switch (i) {
            case 0:
                return new br2(cr2Var, sxVar, 0);
            default:
                return new br2(cr2Var, sxVar, 1);
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) throws Throwable {
        int i = this.i;
        cr2 cr2Var = this.k;
        fz fzVar = fz.e;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                int i2 = this.j;
                if (i2 == 0) {
                    ix.Q(obj);
                    e5 e5Var = cr2Var.e;
                    this.j = 1;
                    Object objG = e5Var.D.g(this);
                    if (objG != fzVar) {
                        objG = ll2Var;
                    }
                    if (objG == fzVar) {
                        return fzVar;
                    }
                } else {
                    if (i2 != 1) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ix.Q(obj);
                }
                return ll2Var;
            default:
                int i3 = this.j;
                if (i3 == 0) {
                    ix.Q(obj);
                    e5 e5Var2 = cr2Var.e;
                    this.j = 1;
                    Object objA = e5Var2.E.a(this);
                    if (objA != fzVar) {
                        objA = ll2Var;
                    }
                    if (objA == fzVar) {
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
        }
    }
}
