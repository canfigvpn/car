package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ky extends wa2 implements ij0 {
    public /* synthetic */ Object i;
    public final /* synthetic */ ao1 j;
    public final /* synthetic */ id2 k;
    public final /* synthetic */ me2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky(ao1 ao1Var, id2 id2Var, me2 me2Var, sx sxVar) {
        super(2, sxVar);
        this.j = ao1Var;
        this.k = id2Var;
        this.l = me2Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ky kyVar = (ky) p((sx) obj2, (ez) obj);
        ll2 ll2Var = ll2.a;
        kyVar.r(ll2Var);
        return ll2Var;
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        ky kyVar = new ky(this.j, this.k, this.l, sxVar);
        kyVar.i = obj;
        return kyVar;
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        ix.Q(obj);
        ez ezVar = (ez) this.i;
        ao1 ao1Var = this.j;
        sx sxVar = null;
        nj2.y(ezVar, null, new jy(ao1Var, this.k, sxVar, 0), 1);
        nj2.y(ezVar, null, new e(13, sxVar, ao1Var, this.l), 1);
        return ll2.a;
    }
}
