package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fo implements ij0 {
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ gt f;
    public final /* synthetic */ ti0 g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ fo(gt gtVar, gt gtVar2, gt gtVar3, ij0 ij0Var, boolean z, ti0 ti0Var, ti0 ti0Var2, int i) {
        this.f = gtVar;
        this.h = gtVar2;
        this.k = gtVar3;
        this.l = ij0Var;
        this.i = z;
        this.g = ti0Var;
        this.m = ti0Var2;
        this.j = i;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        int i2 = this.j;
        Object obj3 = this.m;
        Object obj4 = this.l;
        Object obj5 = this.k;
        Object obj6 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = ei1.P(i2 | 1);
                nj2.c(this.g, (u71) obj6, this.i, (u32) obj5, (bo) obj4, (co) obj3, this.f, (ak0) obj, iP);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = ei1.P(i2 | 1);
                sv0.H(this.f, this.g, (u71) obj6, (ij0) obj5, this.i, (d71) obj4, (gj1) obj3, (ak0) obj, iP2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP3 = ei1.P(i2 | 1);
                fd1.c(this.f, (gt) obj6, (gt) obj5, (ij0) obj4, this.i, this.g, (ti0) obj3, (ak0) obj, iP3);
                break;
        }
        return ll2Var;
    }

    public /* synthetic */ fo(gt gtVar, ti0 ti0Var, u71 u71Var, ij0 ij0Var, boolean z, d71 d71Var, gj1 gj1Var, int i) {
        this.f = gtVar;
        this.g = ti0Var;
        this.h = u71Var;
        this.k = ij0Var;
        this.i = z;
        this.l = d71Var;
        this.m = gj1Var;
        this.j = i;
    }

    public /* synthetic */ fo(ti0 ti0Var, u71 u71Var, boolean z, u32 u32Var, bo boVar, co coVar, gt gtVar, int i) {
        this.g = ti0Var;
        this.h = u71Var;
        this.i = z;
        this.k = u32Var;
        this.l = boVar;
        this.m = coVar;
        this.f = gtVar;
        this.j = i;
    }
}
