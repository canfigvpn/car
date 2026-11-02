package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class mu extends wa2 implements jj0 {
    public final /* synthetic */ cs1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu(cs1 cs1Var, sx sxVar) {
        super(3, sxVar);
        this.i = cs1Var;
    }

    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        mu muVar = new mu(this.i, (sx) obj3);
        ll2 ll2Var = ll2.a;
        muVar.r(ll2Var);
        return ll2Var;
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        ix.Q(obj);
        this.i.e = true;
        return ll2.a;
    }
}
