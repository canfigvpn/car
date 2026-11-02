package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class i00 implements ij0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;

    public /* synthetic */ i00(String str, int i) {
        this.e = i;
        this.f = str;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                ak0 ak0Var = (ak0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ak0Var.R();
                } else {
                    Object objL = ak0Var.L();
                    if (objL == cv.a) {
                        objL = new s1(23);
                        ak0Var.g0(objL);
                    }
                    AtomicInteger atomicInteger = l02.a;
                    ef2.b(this.f, new gq((ej0) objL), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var, 0, 0, 262140);
                }
                break;
            default:
                ak0 ak0Var2 = (ak0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!ak0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ak0Var2.R();
                } else {
                    ef2.b(this.f, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var2, 0, 0, 262142);
                }
                break;
        }
        return ll2Var;
    }
}
