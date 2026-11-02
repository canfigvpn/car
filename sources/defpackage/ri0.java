package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ri0 implements wq1 {
    public final /* synthetic */ int a;
    public final wq1 b;
    public final wq1 c;
    public final wq1 d;

    public /* synthetic */ ri0(wq1 wq1Var, wq1 wq1Var2, wq1 wq1Var3, int i) {
        this.a = i;
        this.b = wq1Var;
        this.c = wq1Var2;
        this.d = wq1Var3;
    }

    @Override // defpackage.wq1
    public final Object get() {
        int i = this.a;
        wq1 wq1Var = this.d;
        wq1 wq1Var2 = this.c;
        wq1 wq1Var3 = this.b;
        switch (i) {
            case 0:
                return new qi0((vn) wq1Var3.get(), (q22) wq1Var2.get(), (sz1) wq1Var.get());
            case 1:
                return new rm0((vn) wq1Var3.get(), (q22) wq1Var2.get(), (sz1) wq1Var.get());
            default:
                return new mn((vn) wq1Var3.get(), (sz1) wq1Var2.get(), (kw1) ((zd) wq1Var).b);
        }
    }
}
