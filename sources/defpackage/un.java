package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class un extends wa2 implements ej0 {
    public int i;
    public int j;
    public final /* synthetic */ vn k;
    public final /* synthetic */ long l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un(vn vnVar, long j, int i, sx sxVar) {
        super(1, sxVar);
        this.k = vnVar;
        this.l = j;
        this.m = i;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        long j = this.l;
        int i = this.m;
        return new un(this.k, j, i, (sx) obj).r(ll2.a);
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int iA;
        int i = this.j;
        vn vnVar = this.k;
        Object obj2 = fz.e;
        if (i == 0) {
            ix.Q(obj);
            vnVar.b.getClass();
            iA = jb2.a();
            bn bnVar = vnVar.c;
            this.i = iA;
            this.j = 1;
            Object objR = sv.R(this, new xm(this.m, iA, this.l), bnVar.a, false, true);
            if (objR != obj2) {
                objR = ll2.a;
            }
            if (objR != obj2) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                ix.Q(obj);
                return obj;
            }
            fu1.h("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        iA = this.i;
        ix.Q(obj);
        int i2 = iA;
        rf1 rf1Var = vnVar.f;
        sf1 sf1Var = new sf1(0L, this.l, i2, this.m, "MANUAL", null);
        this.i = i2;
        this.j = 2;
        Object objA = rf1Var.a(sf1Var, this);
        return objA == obj2 ? obj2 : objA;
    }
}
