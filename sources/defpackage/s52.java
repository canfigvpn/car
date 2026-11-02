package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class s52 implements ij0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ u52 f;

    public s52(u52 u52Var, int i) {
        this.e = i;
        switch (i) {
            case 1:
                this.f = u52Var;
                break;
            default:
                gt gtVar = zt.a;
                this.f = u52Var;
                break;
        }
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        u52 u52Var = this.f;
        switch (i) {
            case 0:
                ak0 ak0Var = (ak0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!ak0Var.O(1 & iIntValue, (iIntValue & 3) != 2)) {
                    ak0Var.R();
                } else {
                    gt gtVar = zt.a;
                    u52Var.getClass();
                    gtVar.d(u52Var, ak0Var, 0);
                }
                break;
            default:
                ak0 ak0Var2 = (ak0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!ak0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ak0Var2.R();
                } else {
                    ef2.b(u52Var.a.a, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ak0Var2, 0, 0, 262142);
                }
                break;
        }
        return ll2Var;
    }
}
