package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hs implements ij0 {
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ hs(int i, ij0 ij0Var, gt gtVar, ij0 ij0Var2, ij0 ij0Var3, uo2 uo2Var, ij0 ij0Var4, int i2) {
        this.f = i;
        this.g = ij0Var;
        this.h = gtVar;
        this.i = ij0Var2;
        this.j = ij0Var3;
        this.k = uo2Var;
        this.l = ij0Var4;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.e;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.h;
        ll2 ll2Var = ll2.a;
        Object obj7 = this.i;
        Object obj8 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                dv1.f((String) obj8, (String) obj6, (String) obj7, (u71) obj4, (String) obj5, (ti0) obj3, (ak0) obj, ei1.P(7), this.f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP = ei1.P(this.f) | 1;
                ((gt) obj8).i(this.h, (Boolean) obj7, this.j, this.k, this.l, (ak0) obj, iP);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = ei1.P(1);
                ix.g(this.f, (ij0) obj8, (gt) obj6, (ij0) obj7, (ij0) obj5, (uo2) obj4, (ij0) obj3, (ak0) obj, iP2);
                break;
        }
        return ll2Var;
    }

    public /* synthetic */ hs(gt gtVar, Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, int i) {
        this.g = gtVar;
        this.h = obj;
        this.i = bool;
        this.j = obj2;
        this.k = obj3;
        this.l = obj4;
        this.f = i;
    }

    public /* synthetic */ hs(String str, String str2, String str3, u71 u71Var, String str4, ti0 ti0Var, int i, int i2) {
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.k = u71Var;
        this.j = str4;
        this.l = ti0Var;
        this.f = i2;
    }
}
