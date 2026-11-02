package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class k10 implements ij0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ f20 f;
    public final /* synthetic */ l00 g;

    public /* synthetic */ k10(f20 f20Var, l00 l00Var, int i) {
        this.e = i;
        this.f = f20Var;
        this.g = l00Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        r71 r71Var = r71.a;
        f20 f20Var = this.f;
        switch (i) {
            case 0:
                ak0 ak0Var = (ak0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ak0Var.R();
                } else {
                    o00.a.b(f20Var.a(), p61.b0(r71Var, e20.b), this.g.b, ak0Var, 3120);
                }
                break;
            default:
                ak0 ak0Var2 = (ak0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!ak0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ak0Var2.R();
                } else {
                    u71 u71VarB0 = p61.b0(r71Var, e20.a);
                    int iA = f20Var.a();
                    boolean zF = ak0Var2.f(f20Var);
                    Object objL = ak0Var2.L();
                    if (zF || objL == cv.a) {
                        objL = new l10(f20Var, 0);
                        ak0Var2.g0(objL);
                    }
                    e20.f(u71VarB0, iA, (ej0) objL, this.g, ak0Var2, 6);
                }
                break;
        }
        return ll2Var;
    }
}
