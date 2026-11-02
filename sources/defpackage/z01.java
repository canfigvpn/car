package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class z01 extends t71 implements rv, pk0 {
    public o7 s;
    public f11 t;
    public me2 u;
    public final dk1 v = y12.s(null);

    public z01(o7 o7Var, f11 f11Var, me2 me2Var) {
        this.s = o7Var;
        this.t = f11Var;
        this.u = me2Var;
    }

    @Override // defpackage.pk0
    public final void t(me1 me1Var) {
        this.v.setValue(me1Var);
    }

    @Override // defpackage.t71
    public final void x0() {
        o7 o7Var = this.s;
        if (o7Var.a != null) {
            yp0.c("Expected textInputModifierNode to be null");
        }
        o7Var.a = this;
    }

    @Override // defpackage.t71
    public final void y0() {
        this.s.k(this);
    }
}
