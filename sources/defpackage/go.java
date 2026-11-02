package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class go implements ij0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ gt f;

    public /* synthetic */ go(gt gtVar, int i) {
        this.e = i;
        this.f = gtVar;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        xr xrVar = xr.a;
        r71 r71Var = r71.a;
        gt gtVar = this.f;
        switch (i) {
            case 0:
                ak0 ak0Var = (ak0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ak0Var.R();
                } else {
                    wr wrVarA = ur.a(ws0.g, q90.r, ak0Var, 0);
                    int iX = ws0.x(ak0Var);
                    sl1 sl1VarL = ak0Var.l();
                    u71 u71VarB = nj2.B(ak0Var, r71Var);
                    wu.c.getClass();
                    wv wvVar = vu.b;
                    ak0Var.Z();
                    if (ak0Var.S) {
                        ak0Var.k(wvVar);
                    } else {
                        ak0Var.j0();
                    }
                    p12.l(vu.f, ak0Var, wrVarA);
                    p12.l(vu.e, ak0Var, sl1VarL);
                    ra raVar = vu.g;
                    if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX))) {
                        k3.p(iX, ak0Var, iX, raVar);
                    }
                    p12.l(vu.d, ak0Var, u71VarB);
                    gtVar.d(xrVar, ak0Var, 6);
                    ak0Var.p(true);
                }
                break;
            default:
                ak0 ak0Var2 = (ak0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!ak0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ak0Var2.R();
                } else {
                    wr wrVarA2 = ur.a(ws0.g, q90.r, ak0Var2, 0);
                    int iX2 = ws0.x(ak0Var2);
                    sl1 sl1VarL2 = ak0Var2.l();
                    u71 u71VarB2 = nj2.B(ak0Var2, r71Var);
                    wu.c.getClass();
                    wv wvVar2 = vu.b;
                    ak0Var2.Z();
                    if (ak0Var2.S) {
                        ak0Var2.k(wvVar2);
                    } else {
                        ak0Var2.j0();
                    }
                    p12.l(vu.f, ak0Var2, wrVarA2);
                    p12.l(vu.e, ak0Var2, sl1VarL2);
                    ra raVar2 = vu.g;
                    if (ak0Var2.S || !ws0.j(ak0Var2.L(), Integer.valueOf(iX2))) {
                        k3.p(iX2, ak0Var2, iX2, raVar2);
                    }
                    p12.l(vu.d, ak0Var2, u71VarB2);
                    gtVar.d(xrVar, ak0Var2, 6);
                    ak0Var2.p(true);
                }
                break;
        }
        return ll2Var;
    }
}
