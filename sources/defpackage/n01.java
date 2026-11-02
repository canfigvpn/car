package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class n01 extends wa2 implements ij0 {
    public final /* synthetic */ int i = 1;
    public int j;
    public final /* synthetic */ int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n01(ia iaVar, int i, jz1 jz1Var, sx sxVar) {
        super(2, sxVar);
        this.l = iaVar;
        this.k = i;
        this.m = jz1Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                return ((n01) p((sx) obj2, (xx1) obj)).r(ll2Var);
            default:
                return ((n01) p((sx) obj2, (ez) obj)).r(ll2Var);
        }
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        Object obj2 = this.m;
        int i2 = this.k;
        switch (i) {
            case 0:
                n01 n01Var = new n01((q01) obj2, i2, sxVar);
                n01Var.l = obj;
                return n01Var;
            default:
                return new n01((ia) this.l, i2, (jz1) obj2, sxVar);
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        Object obj2 = this.m;
        int i2 = this.k;
        fz fzVar = fz.e;
        switch (i) {
            case 0:
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
                q01 q01Var = (q01) obj2;
                m01 m01Var = new m01(0, (xx1) this.l, q01Var);
                m40 m40Var = ((k01) q01Var.f.getValue()).i;
                this.j = 1;
                return ux.k(m01Var, i2, 100, m40Var, this) == fzVar ? fzVar : ll2Var;
            default:
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
                ia iaVar = (ia) this.l;
                Integer num = new Integer(i2);
                g82 g82Var = ((jz1) obj2).b;
                this.j = 1;
                return ia.a(iaVar, num, g82Var, this) == fzVar ? fzVar : ll2Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n01(q01 q01Var, int i, sx sxVar) {
        super(2, sxVar);
        this.m = q01Var;
        this.k = i;
    }
}
