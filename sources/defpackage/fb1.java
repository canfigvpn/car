package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fb1 extends wa2 implements ij0 {
    public final /* synthetic */ boolean i;
    public final /* synthetic */ qh2 j;
    public final /* synthetic */ ic1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb1(boolean z, qh2 qh2Var, ic1 ic1Var, sx sxVar) {
        super(2, sxVar);
        this.i = z;
        this.j = qh2Var;
        this.k = ic1Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        fb1 fb1Var = (fb1) p((sx) obj2, (ez) obj);
        ll2 ll2Var = ll2.a;
        fb1Var.r(ll2Var);
        return ll2Var;
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        return new fb1(this.i, this.j, this.k, sxVar);
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        qh2 qh2Var;
        ix.Q(obj);
        if (!this.i && (qh2Var = this.j) != null && qh2Var.i) {
            ei1.C(this.k, qh2.HOME);
        }
        return ll2.a;
    }
}
