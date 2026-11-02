package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qa extends dw0 implements ij0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ ki2 g;
    public final /* synthetic */ ej0 h;
    public final /* synthetic */ u71 i;
    public final /* synthetic */ gt j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa(ki2 ki2Var, ej0 ej0Var, u71 u71Var, sb0 sb0Var, kc0 kc0Var, gt gtVar, int i) {
        super(2);
        this.g = ki2Var;
        this.h = ej0Var;
        this.i = u71Var;
        this.l = sb0Var;
        this.m = kc0Var;
        this.j = gtVar;
        this.k = i;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.f;
        ll2 ll2Var = ll2.a;
        int i2 = this.k;
        Object obj3 = this.m;
        Object obj4 = this.l;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iP = ei1.P(i2 | 1);
                ki2 ki2Var = this.g;
                u71 u71Var = this.i;
                ej0 ej0Var = this.h;
                p61.b(ki2Var, u71Var, ej0Var, (t3) obj3, (ej0) obj4, this.j, (ak0) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = ei1.P(i2 | 1);
                ki2 ki2Var2 = this.g;
                ej0 ej0Var2 = this.h;
                u71 u71Var2 = this.i;
                dv1.d(ki2Var2, ej0Var2, u71Var2, (sb0) obj4, (kc0) obj3, this.j, (ak0) obj, iP2);
                break;
        }
        return ll2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa(ki2 ki2Var, u71 u71Var, ej0 ej0Var, t3 t3Var, ej0 ej0Var2, gt gtVar, int i) {
        super(2);
        this.g = ki2Var;
        this.i = u71Var;
        this.h = ej0Var;
        this.m = t3Var;
        this.l = ej0Var2;
        this.j = gtVar;
        this.k = i;
    }
}
