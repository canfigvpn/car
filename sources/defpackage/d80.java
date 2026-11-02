package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class d80 extends wa2 implements jj0 {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d80(int i, sx sxVar, int i2) {
        super(i, sxVar);
        this.i = i2;
    }

    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        int i2 = 3;
        switch (i) {
            case 0:
                long j = ((uf1) obj2).a;
                new d80(i2, (sx) obj3, 0).r(ll2Var);
                break;
            case 1:
                ((Number) obj2).floatValue();
                new d80(i2, (sx) obj3, 1).r(ll2Var);
                break;
            default:
                long j2 = ((uf1) obj2).a;
                new d80(i2, (sx) obj3, 2).r(ll2Var);
                break;
        }
        return ll2Var;
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                ix.Q(obj);
                break;
            case 1:
                ix.Q(obj);
                break;
            default:
                ix.Q(obj);
                break;
        }
        return ll2Var;
    }
}
