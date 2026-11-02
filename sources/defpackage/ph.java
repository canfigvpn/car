package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ph extends un2 {
    public final xg b;
    public final s82 c;
    public final jr1 d;

    public ph(xg xgVar) {
        xgVar.getClass();
        this.b = xgVar;
        s82 s82VarF = j20.f(new nh(false, null, null));
        this.c = s82VarF;
        this.d = new jr1(s82VarF);
    }

    public final void e(ej0 ej0Var, ij0 ij0Var) {
        Object value;
        sx sxVar;
        s82 s82Var = this.c;
        if (((nh) s82Var.getValue()).a) {
            return;
        }
        do {
            value = s82Var.getValue();
            sxVar = null;
        } while (!s82Var.h(value, nh.a((nh) value, true, null, null, 6)));
        nj2.y(s5.H(this), null, new g(ej0Var, this, ij0Var, sxVar, 3), 3);
    }
}
