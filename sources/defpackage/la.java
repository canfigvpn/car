package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class la extends dw0 implements ij0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ ej0 g;
    public final /* synthetic */ u71 h;
    public final /* synthetic */ gt i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(x50 x50Var, u71 u71Var, ej0 ej0Var, t3 t3Var, String str, ej0 ej0Var2, gt gtVar, int i) {
        super(2);
        this.k = x50Var;
        this.h = u71Var;
        this.g = ej0Var;
        this.m = t3Var;
        this.n = str;
        this.l = ej0Var2;
        this.i = gtVar;
        this.j = i;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.f;
        ll2 ll2Var = ll2.a;
        int i2 = this.j;
        Object obj3 = this.n;
        Object obj4 = this.m;
        Object obj5 = this.l;
        Object obj6 = this.k;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iP = ei1.P(i2 | 1);
                u71 u71Var = this.h;
                ej0 ej0Var = this.g;
                p61.a((x50) obj6, u71Var, ej0Var, (t3) obj4, (String) obj3, (ej0) obj5, this.i, (ak0) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = ei1.P(i2 | 1);
                ej0 ej0Var2 = this.g;
                u71 u71Var2 = this.h;
                dv1.a((ki2) obj6, ej0Var2, u71Var2, (sb0) obj5, (kc0) obj4, (ij0) obj3, this.i, (ak0) obj, iP2);
                break;
        }
        return ll2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(ki2 ki2Var, ej0 ej0Var, u71 u71Var, sb0 sb0Var, kc0 kc0Var, ij0 ij0Var, gt gtVar, int i) {
        super(2);
        this.k = ki2Var;
        this.g = ej0Var;
        this.h = u71Var;
        this.l = sb0Var;
        this.m = kc0Var;
        this.n = ij0Var;
        this.i = gtVar;
        this.j = i;
    }
}
