package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q41 implements ti0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ id2 f;

    public /* synthetic */ q41(id2 id2Var, int i) {
        this.e = i;
        this.f = id2Var;
    }

    @Override // defpackage.ti0
    public final Object a() {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        id2 id2Var = this.f;
        switch (i) {
            case 0:
                id2Var.a();
                break;
            default:
                id2Var.onCancel();
                break;
        }
        return ll2Var;
    }
}
