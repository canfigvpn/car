package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class p3 implements ij0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ij0 f;
    public final /* synthetic */ gt g;

    public /* synthetic */ p3(ij0 ij0Var, gt gtVar, int i) {
        this.e = i;
        this.f = ij0Var;
        this.g = gtVar;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        gt gtVar = this.g;
        ij0 ij0Var = this.f;
        int i2 = 2;
        switch (i) {
            case 0:
                ak0 ak0Var = (ak0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ak0Var.R();
                } else {
                    if (ij0Var == null) {
                        ak0Var.W(-1102039173);
                    } else {
                        ak0Var.W(795734342);
                        ij0Var.g(ak0Var, 0);
                    }
                    ak0Var.p(false);
                    gtVar.g(ak0Var, 0);
                }
                break;
            case 1:
                ak0 ak0Var2 = (ak0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!ak0Var2.O(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    ak0Var2.R();
                } else {
                    kj1 kj1Var = r3.a;
                    r3.b(8.0f, 12.0f, vs0.C(-459506658, new p3(ij0Var, gtVar, 0 == true ? 1 : 0), ak0Var2), ak0Var2, 438);
                }
                break;
            case 2:
                ak0 ak0Var3 = (ak0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!ak0Var3.O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ak0Var3.R();
                } else {
                    if (ij0Var == null) {
                        ak0Var3.W(322524505);
                    } else {
                        ak0Var3.W(-266690648);
                        ij0Var.g(ak0Var3, 0);
                    }
                    ak0Var3.p(false);
                    gtVar.g(ak0Var3, 0);
                }
                break;
            case 3:
                ak0 ak0Var4 = (ak0) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!ak0Var4.O(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ak0Var4.R();
                } else {
                    r3.b(q00.b, q00.c, vs0.C(-1980163584, new p3(ij0Var, gtVar, i2), ak0Var4), ak0Var4, 438);
                }
                break;
            default:
                ak0 ak0Var5 = (ak0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (!ak0Var5.O(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ak0Var5.R();
                } else {
                    if (1.0f <= 0.0d) {
                        tp0.a("invalid weight; must be greater than zero");
                    }
                    u71 u71VarF0 = p61.f0(new px0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), ij0Var != null ? 12.0f : 0.0f, 0.0f, 0.0f, 0.0f, 10);
                    w61 w61VarC = xj.c(q90.f, false);
                    int iX = ws0.x(ak0Var5);
                    sl1 sl1VarL = ak0Var5.l();
                    u71 u71VarB = nj2.B(ak0Var5, u71VarF0);
                    wu.c.getClass();
                    wv wvVar = vu.b;
                    ak0Var5.Z();
                    if (ak0Var5.S) {
                        ak0Var5.k(wvVar);
                    } else {
                        ak0Var5.j0();
                    }
                    p12.l(vu.f, ak0Var5, w61VarC);
                    p12.l(vu.e, ak0Var5, sl1VarL);
                    ra raVar = vu.g;
                    if (ak0Var5.S || !ws0.j(ak0Var5.L(), Integer.valueOf(iX))) {
                        k3.p(iX, ak0Var5, iX, raVar);
                    }
                    p12.l(vu.d, ak0Var5, u71VarB);
                    k3.o(0, gtVar, ak0Var5, true);
                }
                break;
        }
        return ll2Var;
    }
}
