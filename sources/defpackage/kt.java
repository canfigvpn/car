package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class kt implements jj0 {
    public static final kt f = new kt(0);
    public static final kt g = new kt(1);
    public static final kt h = new kt(2);
    public final /* synthetic */ int e;

    public /* synthetic */ kt(int i) {
        this.e = i;
    }

    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        r71 r71Var = r71.a;
        is1 is1Var = cv.a;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                ak0 ak0Var = (ak0) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (!ak0Var.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ak0Var.R();
                }
                break;
            case 1:
                ((Number) obj3).intValue();
                break;
            case 2:
                u52 u52Var = (u52) obj;
                ak0 ak0Var2 = (ak0) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ak0Var2.f(u52Var) ? 4 : 2;
                }
                if (!ak0Var2.O(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    ak0Var2.R();
                } else {
                    n02.c(u52Var, null, null, 0L, 0L, 0L, 0L, 0L, ak0Var2, iIntValue2 & 14);
                }
                break;
            case 3:
                ak0 ak0Var3 = (ak0) obj2;
                ((Number) obj3).intValue();
                kj1 kj1Var = sp.a;
                ak0Var3.W(1575618259);
                ak0Var3.p(false);
                Object objL = ak0Var3.L();
                if (objL == is1Var) {
                    objL = y12.s(null);
                    ak0Var3.g0(objL);
                }
                da1 da1Var = (da1) objL;
                w61 w61VarC = xj.c(q90.j, false);
                int iX = ws0.x(ak0Var3);
                sl1 sl1VarL = ak0Var3.l();
                u71 u71VarB = nj2.B(ak0Var3, r71Var);
                wu.c.getClass();
                wv wvVar = vu.b;
                ak0Var3.Z();
                if (ak0Var3.S) {
                    ak0Var3.k(wvVar);
                } else {
                    ak0Var3.j0();
                }
                p12.l(vu.f, ak0Var3, w61VarC);
                p12.l(vu.e, ak0Var3, sl1VarL);
                ra raVar = vu.g;
                if (ak0Var3.S || !ws0.j(ak0Var3.L(), Integer.valueOf(iX))) {
                    k3.p(iX, ak0Var3, iX, raVar);
                }
                p12.l(vu.d, ak0Var3, u71VarB);
                ij0 ij0Var = (ij0) da1Var.getValue();
                if (ij0Var == null) {
                    ak0Var3.W(-1538103400);
                } else {
                    ak0Var3.W(-326710903);
                    ij0Var.g(ak0Var3, 0);
                }
                ak0Var3.p(false);
                ak0Var3.p(true);
                break;
            case 4:
                ak0 ak0Var4 = (ak0) obj2;
                ((Number) obj3).intValue();
                kj1 kj1Var2 = sp.a;
                ak0Var4.W(-1218863531);
                ak0Var4.p(false);
                Object objL2 = ak0Var4.L();
                if (objL2 == is1Var) {
                    objL2 = y12.s(null);
                    ak0Var4.g0(objL2);
                }
                da1 da1Var2 = (da1) objL2;
                w61 w61VarC2 = xj.c(q90.j, false);
                int iX2 = ws0.x(ak0Var4);
                sl1 sl1VarL2 = ak0Var4.l();
                u71 u71VarB2 = nj2.B(ak0Var4, r71Var);
                wu.c.getClass();
                wv wvVar2 = vu.b;
                ak0Var4.Z();
                if (ak0Var4.S) {
                    ak0Var4.k(wvVar2);
                } else {
                    ak0Var4.j0();
                }
                p12.l(vu.f, ak0Var4, w61VarC2);
                p12.l(vu.e, ak0Var4, sl1VarL2);
                ra raVar2 = vu.g;
                if (ak0Var4.S || !ws0.j(ak0Var4.L(), Integer.valueOf(iX2))) {
                    k3.p(iX2, ak0Var4, iX2, raVar2);
                }
                p12.l(vu.d, ak0Var4, u71VarB2);
                ij0 ij0Var2 = (ij0) da1Var2.getValue();
                if (ij0Var2 == null) {
                    ak0Var4.W(-2101783313);
                } else {
                    ak0Var4.W(-344894126);
                    ij0Var2.g(ak0Var4, 0);
                }
                ak0Var4.p(false);
                ak0Var4.p(true);
                break;
            default:
                ((Number) obj3).intValue();
                xt.a.g((ak0) obj2, 0);
                break;
        }
        return ll2Var;
    }
}
