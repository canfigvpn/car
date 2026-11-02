package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class oa2 implements ij0 {
    public final /* synthetic */ u71 e;
    public final /* synthetic */ u32 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ float h;
    public final /* synthetic */ oj i;
    public final /* synthetic */ float j;
    public final /* synthetic */ gt k;

    public oa2(u71 u71Var, u32 u32Var, long j, float f, oj ojVar, float f2, gt gtVar) {
        this.e = u71Var;
        this.f = u32Var;
        this.g = j;
        this.h = f;
        this.i = ojVar;
        this.j = f2;
        this.k = gtVar;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean zO = ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2);
        ll2 ll2Var = ll2.a;
        if (!zO) {
            ak0Var.R();
            return ll2Var;
        }
        u71 u71VarD = ra2.d(this.e, this.f, ra2.e(this.g, this.h, ak0Var), this.i, ((m40) ak0Var.j(yv.h)).x(this.j));
        Object objL = ak0Var.L();
        is1 is1Var = cv.a;
        if (objL == is1Var) {
            objL = new v22(3);
            ak0Var.g0(objL);
        }
        u71 u71VarA = l02.a(u71VarD, false, (ej0) objL);
        Object objL2 = ak0Var.L();
        if (objL2 == is1Var) {
            objL2 = p30.c;
            ak0Var.g0(objL2);
        }
        u71 u71VarA2 = ya2.a(u71VarA, ll2Var, (PointerInputEventHandler) objL2);
        w61 w61VarC = xj.c(q90.f, true);
        int iX = ws0.x(ak0Var);
        sl1 sl1VarL = ak0Var.l();
        u71 u71VarB = nj2.B(ak0Var, u71VarA2);
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
        k3.o(0, this.k, ak0Var, true);
        return ll2Var;
    }
}
