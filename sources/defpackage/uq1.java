package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uq1 implements ij0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ int i;

    public /* synthetic */ uq1(o00 o00Var, int i, u71 u71Var, long j, int i2) {
        this.e = 2;
        this.g = o00Var;
        this.i = i;
        this.h = u71Var;
        this.f = j;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.e;
        int i2 = this.i;
        ll2 ll2Var = ll2.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int iP = ei1.P(i2 | 1);
                vv.d(this.f, (vf2) obj4, (ij0) obj3, (ak0) obj, iP);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = ei1.P(i2 | 1);
                j12.b(this.f, (vf2) obj4, (ij0) obj3, (ak0) obj, iP2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP3 = ei1.P(3121);
                ((o00) obj4).b(this.i, (u71) obj3, this.f, (ak0) obj, iP3);
                break;
        }
        return ll2Var;
    }

    public /* synthetic */ uq1(long j, vf2 vf2Var, ij0 ij0Var, int i, int i2) {
        this.e = i2;
        this.f = j;
        this.g = vf2Var;
        this.h = ij0Var;
        this.i = i;
    }
}
