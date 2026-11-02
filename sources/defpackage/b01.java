package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b01 implements ti0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ c01 f;

    public /* synthetic */ b01(c01 c01Var, int i) {
        this.e = i;
        this.f = c01Var;
    }

    @Override // defpackage.ti0
    public final Object a() {
        int i = this.e;
        c01 c01Var = this.f;
        switch (i) {
            case 0:
                return Float.valueOf(c01Var.t.c());
            case 1:
                return Float.valueOf(c01Var.t.f());
            default:
                return Float.valueOf(c01Var.t.a() - c01Var.t.e());
        }
    }
}
