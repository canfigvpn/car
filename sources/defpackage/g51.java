package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g51 implements ti0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ h51 f;

    public /* synthetic */ g51(h51 h51Var, int i) {
        this.e = i;
        this.f = h51Var;
    }

    @Override // defpackage.ti0
    public final Object a() {
        int i = this.e;
        h51 h51Var = this.f;
        switch (i) {
            case 0:
                h51Var.H0();
                return ll2.a;
            case 1:
                return new uf1(h51Var.G);
            default:
                jw0 jw0Var = (jw0) h51Var.E.getValue();
                return new uf1(jw0Var != null ? jw0Var.R(0L) : 9205357640488583168L);
        }
    }
}
