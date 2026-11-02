package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class gf0 extends wa2 implements ij0 {
    public /* synthetic */ int i;

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        return ((gf0) p((sx) obj2, Integer.valueOf(((Number) obj).intValue()))).r(ll2.a);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        gf0 gf0Var = new gf0(2, sxVar);
        gf0Var.i = ((Number) obj).intValue();
        return gf0Var;
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        ix.Q(obj);
        return Boolean.valueOf(this.i > 0);
    }
}
