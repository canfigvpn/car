package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class zd2 extends wa2 implements jj0 {
    public int i;
    public /* synthetic */ pp1 j;
    public /* synthetic */ long k;
    public final /* synthetic */ ez l;
    public final /* synthetic */ da1 m;
    public final /* synthetic */ f91 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd2(ez ezVar, da1 da1Var, f91 f91Var, sx sxVar) {
        super(3, sxVar);
        this.l = ezVar;
        this.m = da1Var;
        this.n = f91Var;
    }

    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        long j = ((uf1) obj2).a;
        da1 da1Var = this.m;
        f91 f91Var = this.n;
        zd2 zd2Var = new zd2(this.l, da1Var, f91Var, (sx) obj3);
        zd2Var.j = (pp1) obj;
        zd2Var.k = j;
        return zd2Var.r(ll2.a);
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        ez ezVar = this.l;
        if (i == 0) {
            ix.Q(obj);
            pp1 pp1Var = this.j;
            nj2.y(ezVar, null, new h(this.m, this.k, this.n, (sx) null, 4), 3);
            this.i = 1;
            obj = pp1Var.f(this);
            fz fzVar = fz.e;
            if (obj == fzVar) {
                return fzVar;
            }
        } else {
            if (i != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ix.Q(obj);
        }
        nj2.y(ezVar, null, new j(this.m, ((Boolean) obj).booleanValue(), this.n, null), 3);
        return ll2.a;
    }
}
