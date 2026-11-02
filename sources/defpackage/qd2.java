package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qd2 implements jj0 {
    public final /* synthetic */ p82 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ vf2 g;
    public final /* synthetic */ ij0 h;

    public qd2(ii2 ii2Var, long j, vf2 vf2Var, ij0 ij0Var) {
        this.e = ii2Var;
        this.f = j;
        this.g = vf2Var;
        this.h = ij0Var;
    }

    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        u71 u71Var = (u71) obj;
        ak0 ak0Var = (ak0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ak0Var.f(u71Var) ? 4 : 2;
        }
        if (ak0Var.O(iIntValue & 1, (iIntValue & 19) != 18)) {
            p82 p82Var = this.e;
            boolean zF = ak0Var.f(p82Var);
            Object objL = ak0Var.L();
            if (zF || objL == cv.a) {
                objL = new m30(p82Var, 2);
                ak0Var.g0(objL);
            }
            u71 u71VarT = nj2.t(u71Var, (ej0) objL);
            w61 w61VarC = xj.c(q90.f, false);
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71VarT);
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
            j12.b(this.f, this.g, this.h, ak0Var, 0);
            ak0Var.p(true);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}
