package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j9 implements ti0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ p9 f;
    public final /* synthetic */ nc2 g;

    public /* synthetic */ j9(p9 p9Var, nc2 nc2Var, int i) {
        this.e = i;
        this.f = p9Var;
        this.g = nc2Var;
    }

    @Override // defpackage.ti0
    public final Object a() {
        int i = this.e;
        int i2 = 1;
        nc2 nc2Var = this.g;
        p9 p9Var = this.f;
        switch (i) {
            case 0:
                i9 i9Var = p9Var.f;
                w8 w8Var = new w8(i2, nc2Var);
                gs1 gs1Var = new gs1();
                p9Var.e.c("dataBuilder", i9Var, new n1(i2, gs1Var, w8Var));
                Object obj = gs1Var.e;
                if (obj != null) {
                    return (mc2) obj;
                }
                ws0.U("result");
                throw null;
            case 1:
                i9 i9Var2 = p9Var.g;
                j9 j9Var = new j9(p9Var, nc2Var, 2);
                gs1 gs1Var2 = new gs1();
                p9Var.e.c("positioner", i9Var2, new n1(i2, gs1Var2, j9Var));
                Object obj2 = gs1Var2.e;
                if (obj2 != null) {
                    return (yr1) obj2;
                }
                ws0.U("result");
                throw null;
            default:
                Object objA = p9Var.c.a();
                jw0 jw0Var = (jw0) (((jw0) objA).A() ? objA : null);
                return jw0Var == null ? yr1.e : nc2Var.m(jw0Var).i(jw0Var.R(0L));
        }
    }
}
