package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class lt implements ij0 {
    public static final lt f = new lt(0);
    public static final lt g = new lt(1);
    public static final lt h = new lt(2);
    public static final lt i = new lt(3);
    public static final lt j = new lt(4);
    public static final lt k = new lt(5);
    public static final lt l = new lt(6);
    public final /* synthetic */ int e;

    public /* synthetic */ lt(int i2) {
        this.e = i2;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i2 = this.e;
        ll2 ll2Var = ll2.a;
        switch (i2) {
            case 0:
                ak0 ak0Var = (ak0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ak0Var.R();
                }
                return ll2Var;
            case 1:
                ak0 ak0Var2 = (ak0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!ak0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ak0Var2.R();
                }
                return ll2Var;
            case 2:
                ak0 ak0Var3 = (ak0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!ak0Var3.O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ak0Var3.R();
                }
                return ll2Var;
            case 3:
                ak0 ak0Var4 = (ak0) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!ak0Var4.O(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ak0Var4.R();
                }
                return ll2Var;
            case 4:
                ak0 ak0Var5 = (ak0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (!ak0Var5.O(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ak0Var5.R();
                }
                return ll2Var;
            case 5:
                ak0 ak0Var6 = (ak0) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (ak0Var6.O(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    kz1.a.a(6, ak0Var6);
                } else {
                    ak0Var6.R();
                }
                return ll2Var;
            default:
                long j2 = ((dr) obj2).a;
                return j2 == 16 ? Boolean.FALSE : Integer.valueOf(ws0.V(j2));
        }
    }
}
