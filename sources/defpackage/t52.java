package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class t52 extends wa2 implements ij0 {
    public int i;
    public final /* synthetic */ ia j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ g82 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t52(ia iaVar, boolean z, g82 g82Var, sx sxVar) {
        super(2, sxVar);
        this.j = iaVar;
        this.k = z;
        this.l = g82Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        return ((t52) p((sx) obj2, (ez) obj)).r(ll2.a);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        return new t52(this.j, this.k, this.l, sxVar);
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        if (i == 0) {
            ix.Q(obj);
            Float f = new Float(this.k ? 1.0f : 0.8f);
            this.i = 1;
            Object objA = ia.a(this.j, f, this.l, this);
            fz fzVar = fz.e;
            if (objA == fzVar) {
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
