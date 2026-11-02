package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class r8 extends dw0 implements ij0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ uo1 g;
    public final /* synthetic */ da1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r8(uo1 uo1Var, da1 da1Var, int i) {
        super(2);
        this.f = i;
        this.g = uo1Var;
        this.h = da1Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.f;
        ll2 ll2Var = ll2.a;
        da1 da1Var = this.h;
        uo1 uo1Var = this.g;
        int i2 = 0;
        switch (i) {
            case 0:
                ak0 ak0Var = (ak0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ak0Var.R();
                } else {
                    Object objL = ak0Var.L();
                    is1 is1Var = cv.a;
                    if (objL == is1Var) {
                        objL = x4.n;
                        ak0Var.g0(objL);
                    }
                    u71 u71VarA = l02.a(r71.a, false, (ej0) objL);
                    boolean zH = ak0Var.h(uo1Var);
                    Object objL2 = ak0Var.L();
                    if (zH || objL2 == is1Var) {
                        objL2 = new o8(uo1Var, 1);
                        ak0Var.g0(objL2);
                    }
                    u71 u71VarZ = vs0.z(u71VarA, (ej0) objL2);
                    float f = uo1Var.getCanCalculatePosition() ? 1.0f : 0.0f;
                    if (f != 1.0f) {
                        u71VarZ = nj2.v(u71VarZ, f, 0.0f, null, 520187);
                    }
                    a90 a90Var = s8.a;
                    ij0 ij0Var = (ij0) da1Var.getValue();
                    Object objL3 = ak0Var.L();
                    if (objL3 == is1Var) {
                        objL3 = n6.c;
                        ak0Var.g0(objL3);
                    }
                    w61 w61Var = (w61) objL3;
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
                    p12.l(vu.f, ak0Var, w61Var);
                    p12.l(vu.e, ak0Var, sl1VarL);
                    p12.l(vu.g, ak0Var, Integer.valueOf(iHashCode));
                    p12.k(ak0Var, vu.h);
                    p12.l(vu.d, ak0Var, u71VarB);
                    ij0Var.g(ak0Var, 0);
                    ak0Var.p(true);
                }
                break;
            default:
                ak0 ak0Var2 = (ak0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!ak0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ak0Var2.R();
                } else {
                    sv.a(s8.b.a(Boolean.TRUE), vs0.C(1022273628, new r8(uo1Var, da1Var, i2), ak0Var2), ak0Var2, 56);
                }
                break;
        }
        return ll2Var;
    }
}
