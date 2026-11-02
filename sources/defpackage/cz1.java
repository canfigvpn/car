package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cz1 extends wa2 implements ej0 {
    public int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ fz1 l;
    public final /* synthetic */ ki2 m;
    public final /* synthetic */ float n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz1(Object obj, Object obj2, fz1 fz1Var, ki2 ki2Var, float f, sx sxVar) {
        super(1, sxVar);
        this.j = obj;
        this.k = obj2;
        this.l = fz1Var;
        this.m = ki2Var;
        this.n = f;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        ki2 ki2Var = this.m;
        float f = this.n;
        return new cz1(this.j, this.k, this.l, ki2Var, f, (sx) obj).r(ll2.a);
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        if (i == 0) {
            ix.Q(obj);
            bz1 bz1Var = new bz1(this.j, this.k, this.l, this.m, this.n, null);
            this.i = 1;
            Object objW = qx.w(bz1Var, this);
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
        return ll2.a;
    }
}
