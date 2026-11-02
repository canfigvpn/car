package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class z92 extends dw0 implements ij0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ aa2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z92(aa2 aa2Var, int i) {
        super(2);
        this.f = i;
        this.g = aa2Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.f;
        ll2 ll2Var = ll2.a;
        aa2 aa2Var = this.g;
        switch (i) {
            case 0:
                aa2Var.a().f = (lv) obj2;
                break;
            case 1:
                ox0 ox0VarA = aa2Var.a();
                ((ax0) obj).c0(new kx0(ox0VarA, (ij0) obj2, ox0VarA.t));
                break;
            default:
                ax0 ax0Var = (ax0) obj;
                da2 da2Var = aa2Var.a;
                ox0 ox0Var = ax0Var.K;
                if (ox0Var == null) {
                    ox0Var = new ox0(ax0Var, da2Var);
                    ax0Var.K = ox0Var;
                }
                aa2Var.b = ox0Var;
                aa2Var.a().h();
                ox0 ox0VarA2 = aa2Var.a();
                if (ox0VarA2.g != da2Var) {
                    ox0VarA2.g = da2Var;
                    ox0VarA2.i(false);
                    ax0.V(ox0VarA2.e, false, 7);
                }
                break;
        }
        return ll2Var;
    }
}
