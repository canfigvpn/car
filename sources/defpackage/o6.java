package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class o6 extends dw0 implements ij0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ u71 g;
    public final /* synthetic */ ij0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o6(u71 u71Var, ij0 ij0Var, int i, int i2) {
        super(2);
        this.f = i2;
        this.g = u71Var;
        this.h = ij0Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.f;
        ll2 ll2Var = ll2.a;
        ij0 ij0Var = this.h;
        u71 u71Var = this.g;
        ak0 ak0Var = (ak0) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                p61.e(u71Var, ij0Var, ak0Var, ei1.P(1));
                break;
            default:
                ws0.g(u71Var, ij0Var, ak0Var, ei1.P(1));
                break;
        }
        return ll2Var;
    }
}
