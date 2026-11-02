package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yh implements ij0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ yh(ti0 ti0Var, ij0 ij0Var, ij0 ij0Var2, qi0 qi0Var, int i) {
        this.f = ti0Var;
        this.g = ij0Var;
        this.h = ij0Var2;
        this.i = qi0Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.f;
        Object obj6 = this.g;
        switch (i) {
            case 0:
                u71 u71Var = (u71) obj5;
                da1 da1Var = (da1) obj6;
                gt gtVar = (gt) obj4;
                xh xhVar = (xh) obj3;
                ak0 ak0Var = (ak0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ak0Var.R();
                } else {
                    Object objL = ak0Var.L();
                    is1 is1Var = cv.a;
                    if (objL == is1Var) {
                        objL = new s9(da1Var, 2);
                        ak0Var.g0(objL);
                    }
                    u71 u71VarZ = j20.z(u71Var, (ej0) objL);
                    w61 w61VarC = xj.c(q90.f, true);
                    int iHashCode = Long.hashCode(ak0Var.T);
                    sl1 sl1VarL = ak0Var.l();
                    u71 u71VarB = nj2.B(ak0Var, u71VarZ);
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
                    gtVar.g(ak0Var, 0);
                    Object objL2 = ak0Var.L();
                    if (objL2 == is1Var) {
                        objL2 = new r9(da1Var, 2);
                        ak0Var.g0(objL2);
                    }
                    xhVar.b((ti0) objL2, ak0Var, 6);
                    ak0Var.p(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                p61.g((ti0) obj5, (ij0) obj6, (ij0) obj4, (qi0) obj3, (ak0) obj, ei1.P(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                gn0.f((ul2) obj6, (String) obj4, (ti0) obj3, (u71) obj5, (ak0) obj, ei1.P(1));
                break;
            default:
                ((Integer) obj2).getClass();
                mx.f((ti0) obj6, (u71) obj5, (tz0) obj4, (lz0) obj3, (ak0) obj, ei1.P(1));
                break;
        }
        return ll2Var;
    }

    public /* synthetic */ yh(ti0 ti0Var, u71 u71Var, tz0 tz0Var, lz0 lz0Var, int i) {
        this.g = ti0Var;
        this.f = u71Var;
        this.h = tz0Var;
        this.i = lz0Var;
    }

    public /* synthetic */ yh(u71 u71Var, da1 da1Var, gt gtVar, xh xhVar) {
        this.f = u71Var;
        this.g = da1Var;
        this.h = gtVar;
        this.i = xhVar;
    }

    public /* synthetic */ yh(ul2 ul2Var, String str, ti0 ti0Var, u71 u71Var, int i) {
        this.g = ul2Var;
        this.h = str;
        this.i = ti0Var;
        this.f = u71Var;
    }
}
