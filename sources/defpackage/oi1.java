package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class oi1 implements ij0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public oi1(yc1 yc1Var, boolean z, boolean z2, g82 g82Var, ij0 ij0Var) {
        this.e = 2;
        this.h = yc1Var;
        this.f = z;
        this.g = z2;
        this.i = g82Var;
        this.j = ij0Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                ak0 ak0Var = (ak0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ak0Var.R();
                } else {
                    q90.W.h(this.f, this.g, (f91) obj5, null, (jd2) obj4, (u32) obj3, 0.0f, 0.0f, ak0Var, 100663296, 200);
                }
                break;
            case 1:
                ak0 ak0Var2 = (ak0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!ak0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ak0Var2.R();
                } else {
                    q90.W.h(this.f, this.g, (f91) obj5, null, (jd2) obj4, (u32) obj3, 0.0f, 0.0f, ak0Var2, 100663296, 200);
                }
                break;
            default:
                ak0 ak0Var3 = (ak0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!ak0Var3.O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ak0Var3.R();
                } else {
                    yc1 yc1Var = (yc1) obj5;
                    vv.d(((dr) c52.a(this.g ? this.f ? yc1Var.b : yc1Var.e : yc1Var.g, (g82) obj4, ak0Var3).getValue()).a, ik2.a(ir2.O, ak0Var3), (ij0) obj3, ak0Var3, 0);
                }
                break;
        }
        return ll2Var;
    }

    public /* synthetic */ oi1(boolean z, boolean z2, f91 f91Var, jd2 jd2Var, u32 u32Var, int i) {
        this.e = i;
        this.f = z;
        this.g = z2;
        this.h = f91Var;
        this.i = jd2Var;
        this.j = u32Var;
    }
}
