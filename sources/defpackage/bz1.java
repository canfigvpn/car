package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bz1 extends wa2 implements ij0 {
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ fz1 m;
    public final /* synthetic */ ki2 n;
    public final /* synthetic */ float o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz1(Object obj, Object obj2, fz1 fz1Var, ki2 ki2Var, float f, sx sxVar) {
        super(2, sxVar);
        this.k = obj;
        this.l = obj2;
        this.m = fz1Var;
        this.n = ki2Var;
        this.o = f;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        return ((bz1) p((sx) obj2, (ez) obj)).r(ll2.a);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        bz1 bz1Var = new bz1(this.k, this.l, this.m, this.n, this.o, sxVar);
        bz1Var.j = obj;
        return bz1Var;
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        fz1 fz1Var = this.m;
        if (i == 0) {
            ix.Q(obj);
            ez ezVar = (ez) this.j;
            Object obj2 = this.k;
            Object obj3 = this.l;
            if (ws0.j(obj2, obj3)) {
                fz1Var.n = null;
                if (ws0.j(fz1Var.c.getValue(), obj2)) {
                    return ll2Var;
                }
            } else {
                fz1Var.p();
            }
            boolean zJ = ws0.j(obj2, obj3);
            float f = this.o;
            if (!zJ) {
                ki2 ki2Var = this.n;
                ki2Var.p(obj2);
                ki2Var.n(0L);
                fz1Var.b.setValue(obj2);
                ki2Var.j(f);
            }
            fz1Var.u(f);
            if (fz1Var.m.i()) {
                nj2.y(ezVar, null, new ln(12, (sx) null, fz1Var), 3);
            } else {
                fz1Var.l = Long.MIN_VALUE;
            }
            this.i = 1;
            Object objW = fz1Var.w(this);
            fz fzVar = fz.e;
            if (objW == fzVar) {
                return fzVar;
            }
        } else {
            if (i != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ix.Q(obj);
        }
        fz1Var.t();
        return ll2Var;
    }
}
