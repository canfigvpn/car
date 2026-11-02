package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class od2 implements ij0 {
    public final /* synthetic */ da1 e;
    public final /* synthetic */ xd2 f;
    public final /* synthetic */ gj1 g;
    public final /* synthetic */ gt h;

    public od2(da1 da1Var, xd2 xd2Var, gj1 gj1Var, gt gtVar) {
        this.e = da1Var;
        this.f = xd2Var;
        this.g = gj1Var;
        this.h = gtVar;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            u71 u71VarS = vs0.s(r71.a, "Container");
            nd2 nd2Var = new nd2(this.e, da1.class, "value", "getValue()Ljava/lang/Object;", 0);
            j12.h(this.f);
            u71 u71VarN = ir2.n(u71VarS, new o1(nd2Var, this.g, q90.r, 10));
            w61 w61VarC = xj.c(q90.f, true);
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71VarN);
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
            ra raVar = vu.g;
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX))) {
                k3.p(iX, ak0Var, iX, raVar);
            }
            p12.l(vu.d, ak0Var, u71VarB);
            k3.o(0, this.h, ak0Var, true);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}
