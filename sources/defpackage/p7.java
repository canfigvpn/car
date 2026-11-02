package defpackage;

import ir.alirezaivaz.mygarage.R;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p7 implements ij0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ da1 f;

    public /* synthetic */ p7(da1 da1Var, int i) {
        this.e = i;
        this.f = da1Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.e;
        is1 is1Var = cv.a;
        ll2 ll2Var = ll2.a;
        da1 da1Var = this.f;
        switch (i) {
            case 0:
                da1Var.setValue(new ai2(sv0.P((mr0) obj, (mr0) obj2)));
                break;
            case 1:
                ak0 ak0Var = (ak0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ak0Var.R();
                } else {
                    ef2.b(j02.r(((kn) da1Var.getValue()).a == 0 ? R.string.car_new_title : R.string.car_edit_title, ak0Var), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var, 0, 0, 262142);
                }
                break;
            case 2:
                ak0 ak0Var2 = (ak0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ak0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ak0Var2.R();
                } else {
                    q90.K.j(((Boolean) da1Var.getValue()).booleanValue(), null, ak0Var2, 0);
                }
                break;
            case 3:
                da1Var.setValue(new ai2(sv0.P((mr0) obj, (mr0) obj2)));
                break;
            case 4:
                ak0 ak0Var3 = (ak0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!ak0Var3.O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ak0Var3.R();
                } else {
                    Object objL = ak0Var3.L();
                    if (objL == is1Var) {
                        objL = new r9(da1Var, 12);
                        ak0Var3.g0(objL);
                    }
                    j20.h((ti0) objL, null, false, null, null, null, p61.k, ak0Var3, 805306374, 510);
                }
                break;
            case 5:
                ak0 ak0Var4 = (ak0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!ak0Var4.O(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ak0Var4.R();
                } else {
                    String str = (String) da1Var.getValue();
                    Object objL2 = ak0Var4.L();
                    if (objL2 == is1Var) {
                        objL2 = new s9(da1Var, 5);
                        ak0Var4.g0(objL2);
                    }
                    ux.f(str, (ej0) objL2, null, false, false, null, p61.r, null, null, null, false, mx.L(ak0Var4), new aw0(3, 0, 123), null, true, 0, 0, null, null, null, ak0Var4, 1572912, 12779520, 0, 8208316);
                }
                break;
            case 6:
                ak0 ak0Var5 = (ak0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!ak0Var5.O(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ak0Var5.R();
                } else {
                    q90.K.j(((Boolean) da1Var.getValue()).booleanValue(), null, ak0Var5, 0);
                }
                break;
            case 7:
                ak0 ak0Var6 = (ak0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!ak0Var6.O(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ak0Var6.R();
                } else {
                    Object objL3 = ak0Var6.L();
                    if (objL3 == is1Var) {
                        objL3 = new r9(da1Var, 24);
                        ak0Var6.g0(objL3);
                    }
                    j20.h((ti0) objL3, null, false, null, null, null, nj2.u, ak0Var6, 805306374, 510);
                }
                break;
            default:
                ak0 ak0Var7 = (ak0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!ak0Var7.O(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ak0Var7.R();
                } else {
                    ef2.b(j02.r(((d41) da1Var.getValue()).a != 0 ? R.string.log_edit_title : R.string.log_new_title, ak0Var7), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var7, 0, 0, 262142);
                }
                break;
        }
        return ll2Var;
    }
}
