package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class m10 extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m10(Object obj, int i, sx sxVar, int i2) {
        super(2, sxVar);
        this.i = i2;
        this.l = obj;
        this.k = i;
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
        return ((m10) p(sxVar, ezVar)).r(ll2Var);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        int i2 = this.k;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                return new m10((q01) obj2, i2, sxVar, 0);
            default:
                return new m10((c01) obj2, i2, sxVar, 1);
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        int i2 = this.k;
        Object obj2 = this.l;
        fz fzVar = fz.e;
        switch (i) {
            case 0:
                q01 q01Var = (q01) obj2;
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
                if (q01Var.i.b() || q01Var.h() == i2) {
                    return ll2Var;
                }
                this.j = 1;
                return q01.l(q01Var, i2, this) == fzVar ? fzVar : ll2Var;
            default:
                int i4 = this.j;
                if (i4 == 0) {
                    ix.Q(obj);
                    xz0 xz0Var = ((c01) obj2).t;
                    this.j = 1;
                    return xz0Var.b(i2, this) == fzVar ? fzVar : ll2Var;
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
