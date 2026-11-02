package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b10 implements ti0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ q01 f;

    public /* synthetic */ b10(q01 q01Var, int i) {
        this.e = i;
        this.f = q01Var;
    }

    @Override // defpackage.ti0
    public final Object a() {
        int iH;
        int i = this.e;
        q01 q01Var = this.f;
        switch (i) {
            case 0:
                iH = q01Var.h();
                break;
            default:
                iH = q01Var.j().n;
                break;
        }
        return Integer.valueOf(iH);
    }
}
