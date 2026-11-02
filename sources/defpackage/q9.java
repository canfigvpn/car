package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q9 implements ij0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ u71 f;
    public final /* synthetic */ gt g;
    public final /* synthetic */ int h;

    public /* synthetic */ q9(u71 u71Var, gt gtVar, int i, int i2) {
        this.e = i2;
        this.f = u71Var;
        this.g = gtVar;
        this.h = i;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        int i2 = this.h;
        gt gtVar = this.g;
        u71 u71Var = this.f;
        ak0 ak0Var = (ak0) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                p61.n(u71Var, gtVar, ak0Var, ei1.P(i2 | 1));
                break;
            case 1:
                p61.o(u71Var, gtVar, ak0Var, ei1.P(i2 | 1));
                break;
            case 2:
                v30.d(u71Var, gtVar, ak0Var, ei1.P(i2 | 1));
                break;
            case 3:
                ix.e(u71Var, gtVar, ak0Var, ei1.P(i2 | 1));
                break;
            default:
                ix.d(u71Var, gtVar, ak0Var, ei1.P(i2 | 1));
                break;
        }
        return ll2Var;
    }
}
