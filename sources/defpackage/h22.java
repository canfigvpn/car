package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h22 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ i22 f;
    public final /* synthetic */ j22 g;

    public /* synthetic */ h22(i22 i22Var, j22 j22Var, int i) {
        this.e = i;
        this.f = i22Var;
        this.g = j22Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        j22 j22Var = this.g;
        i22 i22Var = this.f;
        vv1 vv1Var = (vv1) obj;
        switch (i) {
            case 0:
                vv1Var.getClass();
                i22Var.c.A(vv1Var, j22Var);
                return ll2Var;
            case 1:
                vv1Var.getClass();
                i22Var.d.A(vv1Var, j22Var);
                return ll2Var;
            default:
                vv1Var.getClass();
                return Long.valueOf(i22Var.b.G(vv1Var, j22Var));
        }
    }
}
