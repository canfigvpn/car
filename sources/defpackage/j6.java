package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class j6 extends dw0 implements ej0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ k50 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j6(k50 k50Var, int i) {
        super(1);
        this.f = i;
        this.g = k50Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.f;
        k50 k50Var = this.g;
        switch (i) {
            case 0:
                k50Var.show();
                return new r2(1, k50Var);
            default:
                k50Var.j.getClass();
                k50Var.i.a();
                return ll2.a;
        }
    }
}
