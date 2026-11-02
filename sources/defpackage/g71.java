package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class g71 implements ij0 {
    public final /* synthetic */ ij0 e;
    public final /* synthetic */ d71 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ gt h;

    public g71(ij0 ij0Var, d71 d71Var, boolean z, gt gtVar) {
        this.e = ij0Var;
        this.f = d71Var;
        this.g = z;
        this.h = gtVar;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        ak0 ak0Var = (ak0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (ak0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
            int i = 4;
            boolean z = this.g;
            d71 d71Var = this.f;
            ij0 ij0Var = this.e;
            if (ij0Var != null) {
                ak0Var.W(-864613220);
                sv.a(yw.a.a(new dr(z ? d71Var.b : d71Var.e)), vs0.C(1241781204, new l3(i, ij0Var), ak0Var), ak0Var, 56);
                ak0Var.p(false);
            } else {
                ak0Var.W(-864293207);
                ak0Var.p(false);
            }
            sv.a(yw.a.a(new dr(z ? d71Var.a : d71Var.d)), vs0.C(-893579015, new p3(ij0Var, this.h, i), ak0Var), ak0Var, 56);
            ak0Var.W(-863072055);
            ak0Var.p(false);
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}
