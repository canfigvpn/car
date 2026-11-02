package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eu1 implements s60 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ju1 f;

    public /* synthetic */ eu1(ju1 ju1Var, int i) {
        this.e = i;
        this.f = ju1Var;
    }

    @Override // defpackage.s60
    public final double d(double d) {
        int i = this.e;
        ju1 ju1Var = this.f;
        switch (i) {
            case 0:
                return ex.f(ju1Var.k.d(d), ju1Var.e, ju1Var.f);
            default:
                return ju1Var.n.d(ex.f(d, ju1Var.e, ju1Var.f));
        }
    }
}
