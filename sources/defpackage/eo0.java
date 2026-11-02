package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eo0 implements ij0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ u71 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    public /* synthetic */ eo0(Object obj, String str, u71 u71Var, long j, int i, int i2, int i3) {
        this.e = i3;
        this.k = obj;
        this.f = str;
        this.g = u71Var;
        this.h = j;
        this.i = i;
        this.j = i2;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        int i2 = this.i;
        Object obj3 = this.k;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = ei1.P(i2 | 1);
                fo0.a((jo0) obj3, this.f, this.g, this.h, (ak0) obj, iP, this.j);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = ei1.P(i2 | 1);
                fo0.b((nj1) obj3, this.f, this.g, this.h, (ak0) obj, iP2, this.j);
                break;
        }
        return ll2Var;
    }
}
