package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z00 implements ij0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ti0 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ z00(ti0 ti0Var, boolean z, u71 u71Var, gt gtVar, int i) {
        this.g = ti0Var;
        this.f = z;
        this.i = u71Var;
        this.j = gtVar;
        this.h = i;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        int i2 = this.h;
        Object obj3 = this.j;
        Object obj4 = this.i;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = ei1.P(i2 | 1);
                e20.o(this.g, this.f, (u71) obj4, (gt) obj3, (ak0) obj, iP);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = ei1.P(i2 | 1);
                l32.b((String) obj4, (String) obj3, this.f, this.g, (ak0) obj, iP2);
                break;
        }
        return ll2Var;
    }

    public /* synthetic */ z00(String str, String str2, boolean z, ti0 ti0Var, int i) {
        this.i = str;
        this.j = str2;
        this.f = z;
        this.g = ti0Var;
        this.h = i;
    }
}
