package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ha extends wa2 implements ej0 {
    public final /* synthetic */ ia i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(ia iaVar, Object obj, sx sxVar) {
        super(1, sxVar);
        this.i = iaVar;
        this.j = obj;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        ha haVar = new ha(this.i, this.j, (sx) obj);
        ll2 ll2Var = ll2.a;
        haVar.r(ll2Var);
        return ll2Var;
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        ix.Q(obj);
        ia iaVar = this.i;
        iaVar.c();
        Object objB = iaVar.b(this.j);
        iaVar.c.f.setValue(objB);
        iaVar.e.setValue(objB);
        return ll2.a;
    }
}
