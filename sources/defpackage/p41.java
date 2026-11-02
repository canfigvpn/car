package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p41 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ id2 f;

    public /* synthetic */ p41(id2 id2Var, int i) {
        this.e = i;
        this.f = id2Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        id2 id2Var = this.f;
        switch (i) {
            case 0:
                id2Var.d(((uf1) obj).a, is1.j);
                break;
            case 1:
                wn1 wn1Var = (wn1) obj;
                id2Var.e(sv.S(wn1Var, false));
                wn1Var.a();
                break;
            default:
                wn1 wn1Var2 = (wn1) obj;
                id2Var.e(sv.S(wn1Var2, false));
                wn1Var2.a();
                break;
        }
        return ll2Var;
    }
}
