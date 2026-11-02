package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q10 implements ti0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ej0 f;

    public /* synthetic */ q10(ej0 ej0Var, int i) {
        this.e = i;
        this.f = ej0Var;
    }

    @Override // defpackage.ti0
    public final Object a() {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        ej0 ej0Var = this.f;
        switch (i) {
            case 0:
                ej0Var.h(new x50(1));
                break;
            case 1:
                ej0Var.h(new x50(0));
                break;
            default:
                ej0Var.h(Boolean.FALSE);
                break;
        }
        return ll2Var;
    }
}
