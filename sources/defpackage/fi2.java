package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fi2 {
    public final mj2 a;
    public final dk1 b = y12.s(null);
    public final /* synthetic */ ki2 c;

    public fi2(ki2 ki2Var, mj2 mj2Var, String str) {
        this.c = ki2Var;
        this.a = mj2Var;
    }

    public final ei2 a(ej0 ej0Var, ej0 ej0Var2) {
        dk1 dk1Var = this.b;
        ei2 ei2Var = (ei2) dk1Var.getValue();
        ki2 ki2Var = this.c;
        if (ei2Var == null) {
            Object objH = ej0Var2.h(ki2Var.a.f());
            Object objH2 = ej0Var2.h(ki2Var.a.f());
            mj2 mj2Var = this.a;
            tb tbVar = (tb) mj2Var.a.h(objH2);
            tbVar.d();
            ii2 ii2Var = new ii2(ki2Var, objH, tbVar, mj2Var);
            ei2Var = new ei2(this, ii2Var, ej0Var, ej0Var2);
            dk1Var.setValue(ei2Var);
            ki2Var.i.add(ii2Var);
        }
        ei2Var.g = ej0Var2;
        ei2Var.f = ej0Var;
        ei2Var.a(ki2Var.f());
        return ei2Var;
    }
}
