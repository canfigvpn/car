package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ky1 extends wa2 implements ij0 {
    public /* synthetic */ Object i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky1(long j, sx sxVar) {
        super(2, sxVar);
        this.j = j;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ky1 ky1Var = (ky1) p((sx) obj2, (sy1) obj);
        ll2 ll2Var = ll2.a;
        ky1Var.r(ll2Var);
        return ll2Var;
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        ky1 ky1Var = new ky1(this.j, sxVar);
        ky1Var.i = obj;
        return ky1Var;
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        ix.Q(obj);
        uy1 uy1Var = ((sy1) this.i).a;
        uy1Var.c(uy1Var.k, this.j, 1);
        return ll2.a;
    }
}
