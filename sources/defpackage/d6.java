package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d6 implements ij0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;

    public /* synthetic */ d6(long j, ij0 ij0Var, int i) {
        this.f = j;
        this.g = ij0Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        Object obj3 = this.g;
        long j = this.f;
        switch (i) {
            case 0:
                u71 u71Var = (u71) obj3;
                ak0 ak0Var = (ak0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ak0Var.R();
                } else if (j == 9205357640488583168L) {
                    ak0Var.W(-1243644858);
                    i6.b(u71Var, ak0Var, 0, 0);
                    ak0Var.p(false);
                } else {
                    ak0Var.W(-1244013944);
                    u71 u71VarH = f52.h(u71Var, z60.b(j), z60.a(j), 0.0f, 0.0f, 12);
                    w61 w61VarC = xj.c(q90.g, false);
                    int iHashCode = Long.hashCode(ak0Var.T);
                    sl1 sl1VarL = ak0Var.l();
                    u71 u71VarB = nj2.B(ak0Var, u71VarH);
                    wu.c.getClass();
                    wv wvVar = vu.b;
                    ak0Var.Z();
                    if (ak0Var.S) {
                        ak0Var.k(wvVar);
                    } else {
                        ak0Var.j0();
                    }
                    p12.l(vu.f, ak0Var, w61VarC);
                    p12.l(vu.e, ak0Var, sl1VarL);
                    p12.f(ak0Var, Integer.valueOf(iHashCode), vu.g);
                    p12.k(ak0Var, vu.h);
                    p12.l(vu.d, ak0Var, u71VarB);
                    i6.b(null, ak0Var, 0, 1);
                    ak0Var.p(true);
                    ak0Var.p(false);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                j12.c(j, (ij0) obj3, (ak0) obj, ei1.P(1));
                break;
        }
        return ll2Var;
    }

    public /* synthetic */ d6(long j, u71 u71Var) {
        this.f = j;
        this.g = u71Var;
    }
}
