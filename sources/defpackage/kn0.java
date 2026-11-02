package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class kn0 extends wa2 implements ij0 {
    public int i;
    public final /* synthetic */ ln0 j;
    public final /* synthetic */ long k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn0(ln0 ln0Var, long j, int i, sx sxVar) {
        super(2, sxVar);
        this.j = ln0Var;
        this.k = j;
        this.l = i;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        return ((kn0) p((sx) obj2, (ez) obj)).r(ll2.a);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        return new kn0(this.j, this.k, this.l, sxVar);
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        if (i == 0) {
            ix.Q(obj);
            vn vnVar = this.j.b;
            this.i = 1;
            Object objT = dv1.T(vnVar.a, new un(vnVar, this.k, this.l, null), this);
            fz fzVar = fz.e;
            if (objT == fzVar) {
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
