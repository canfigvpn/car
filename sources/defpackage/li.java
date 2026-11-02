package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class li extends wa2 implements ij0 {
    public /* synthetic */ boolean i;
    public final /* synthetic */ mh2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li(mh2 mh2Var, sx sxVar) {
        super(2, sxVar);
        this.j = mh2Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        li liVar = (li) p((sx) obj2, bool);
        ll2 ll2Var = ll2.a;
        liVar.r(ll2Var);
        return ll2Var;
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        li liVar = new li(this.j, sxVar);
        liVar.i = ((Boolean) obj).booleanValue();
        return liVar;
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        ix.Q(obj);
        if (!this.i) {
            this.j.a();
        }
        return ll2.a;
    }
}
