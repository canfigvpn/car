package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hn implements jj0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ej0 f;
    public final /* synthetic */ da1 g;

    public /* synthetic */ hn(int i, ej0 ej0Var, da1 da1Var) {
        this.e = i;
        this.f = ej0Var;
        this.g = da1Var;
    }

    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        is1 is1Var = cv.a;
        da1 da1Var = this.g;
        ej0 ej0Var = this.f;
        switch (i) {
            case 0:
                ak0 ak0Var = (ak0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((xr) obj).getClass();
                if (ak0Var.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    for (ni0 ni0Var : ni0.g) {
                        gt gtVarC = vs0.C(1826576385, new x7(2, ni0Var), ak0Var);
                        boolean zF = ak0Var.f(ej0Var) | ak0Var.d(ni0Var.ordinal());
                        Object objL = ak0Var.L();
                        if (zF || objL == is1Var) {
                            objL = new vf(ej0Var, ni0Var, da1Var, 3);
                            ak0Var.g0(objL);
                        }
                        t7.b(gtVarC, (ti0) objL, null, null, false, null, null, ak0Var, 6, 508);
                    }
                } else {
                    ak0Var.R();
                }
                break;
            default:
                ak0 ak0Var2 = (ak0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((xr) obj).getClass();
                if (ak0Var2.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    for (String str : j11.e) {
                        gt gtVarC2 = vs0.C(1169931427, new x7(14, str), ak0Var2);
                        boolean zF2 = ak0Var2.f(ej0Var) | ak0Var2.f(str);
                        Object objL2 = ak0Var2.L();
                        if (zF2 || objL2 == is1Var) {
                            objL2 = new vf(ej0Var, str, da1Var, 8);
                            ak0Var2.g0(objL2);
                        }
                        t7.b(gtVarC2, (ti0) objL2, null, null, false, null, null, ak0Var2, 6, 508);
                    }
                } else {
                    ak0Var2.R();
                }
                break;
        }
        return ll2Var;
    }
}
