package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ym implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ bn f;
    public final /* synthetic */ cn g;

    public /* synthetic */ ym(bn bnVar, cn cnVar, int i) {
        this.e = i;
        this.f = bnVar;
        this.g = cnVar;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        cn cnVar = this.g;
        bn bnVar = this.f;
        vv1 vv1Var = (vv1) obj;
        switch (i) {
            case 0:
                vv1Var.getClass();
                return Long.valueOf(bnVar.b.G(vv1Var, cnVar));
            default:
                vv1Var.getClass();
                bnVar.c.A(vv1Var, cnVar);
                return ll2.a;
        }
    }
}
