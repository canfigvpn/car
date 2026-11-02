package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gi implements ij0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ qj0 l;

    public /* synthetic */ gi(u71 u71Var, ti0 ti0Var, boolean z, u32 u32Var, co0 co0Var, ij0 ij0Var, int i) {
        this.h = u71Var;
        this.i = ti0Var;
        this.f = z;
        this.j = u32Var;
        this.k = co0Var;
        this.l = ij0Var;
        this.g = i;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        int i2 = this.g;
        qj0 qj0Var = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = ei1.P(i2 | 1);
                nj2.e((xo1) obj6, (mh2) obj5, (ez) obj4, this.f, (da1) obj3, (gt) qj0Var, (ak0) obj, iP);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = ei1.P(i2 | 1);
                px.c((String) obj6, this.f, (lx) obj5, (u71) obj4, (jj0) obj3, (ti0) qj0Var, (ak0) obj, iP2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP3 = ei1.P(i2 | 1);
                j20.e((u71) obj6, (ti0) obj5, this.f, (u32) obj4, (co0) obj3, (ij0) qj0Var, (ak0) obj, iP3);
                break;
        }
        return ll2Var;
    }

    public /* synthetic */ gi(xo1 xo1Var, mh2 mh2Var, ez ezVar, boolean z, da1 da1Var, gt gtVar, int i) {
        this.h = xo1Var;
        this.i = mh2Var;
        this.j = ezVar;
        this.f = z;
        this.k = da1Var;
        this.l = gtVar;
        this.g = i;
    }

    public /* synthetic */ gi(String str, boolean z, lx lxVar, u71 u71Var, jj0 jj0Var, ti0 ti0Var, int i) {
        this.h = str;
        this.f = z;
        this.i = lxVar;
        this.j = u71Var;
        this.k = jj0Var;
        this.l = ti0Var;
        this.g = i;
    }
}
