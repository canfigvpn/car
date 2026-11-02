package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pr1 extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pr1(int i, sx sxVar, int i2) {
        super(i, sxVar);
        this.i = i2;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                return ((pr1) p((sx) obj2, (or1) obj)).r(ll2Var);
            default:
                return ((pr1) p((sx) obj2, (p42) obj)).r(ll2Var);
        }
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        switch (this.i) {
            case 0:
                pr1 pr1Var = new pr1(2, sxVar, 0);
                pr1Var.j = obj;
                return pr1Var;
            default:
                pr1 pr1Var2 = new pr1(2, sxVar, 1);
                pr1Var2.j = obj;
                return pr1Var2;
        }
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        switch (this.i) {
            case 0:
                ix.Q(obj);
                return Boolean.valueOf(((or1) this.j) == or1.e);
            default:
                ix.Q(obj);
                return Boolean.valueOf(((p42) this.j) != p42.e);
        }
    }
}
