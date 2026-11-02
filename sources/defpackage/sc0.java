package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sc0 implements ij0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ej0 g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ sc0(String str, String str2, boolean z, ej0 ej0Var, int i) {
        this.h = str;
        this.i = str2;
        this.f = z;
        this.g = ej0Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = ei1.P(3121);
                ex.b(this.f, this.g, (u71) obj4, (gt) obj3, (ak0) obj, iP);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = ei1.P(1);
                l32.g((String) obj4, (String) obj3, this.f, this.g, (ak0) obj, iP2);
                break;
        }
        return ll2Var;
    }

    public /* synthetic */ sc0(boolean z, ej0 ej0Var, u71 u71Var, gt gtVar, int i) {
        this.f = z;
        this.g = ej0Var;
        this.h = u71Var;
        this.i = gtVar;
    }
}
