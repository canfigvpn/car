package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class iu1 extends dw0 implements ej0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ju1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iu1(ju1 ju1Var, int i) {
        super(1);
        this.f = i;
        this.g = ju1Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.f;
        ju1 ju1Var = this.g;
        switch (i) {
            case 0:
                return Double.valueOf(ju1Var.n.d(ex.f(((Number) obj).doubleValue(), ju1Var.e, ju1Var.f)));
            default:
                return Double.valueOf(ex.f(ju1Var.k.d(((Number) obj).doubleValue()), ju1Var.e, ju1Var.f));
        }
    }
}
