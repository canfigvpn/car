package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class lm2 extends nj1 {
    public final dk1 e = y12.s(new d52(0));
    public final dk1 f = y12.s(Boolean.FALSE);
    public final fm2 g;
    public final dk1 h;
    public float i;
    public yi j;

    public lm2(nl0 nl0Var) {
        fm2 fm2Var = new fm2(nl0Var);
        fm2Var.f = new h8(15, this);
        this.g = fm2Var;
        this.h = new dk1(ll2.a, q90.U);
        this.i = 1.0f;
    }

    @Override // defpackage.nj1
    public final void a(float f) {
        this.i = f;
    }

    @Override // defpackage.nj1
    public final void b(yi yiVar) {
        this.j = yiVar;
    }

    @Override // defpackage.nj1
    public final long d() {
        return ((d52) this.e.getValue()).a;
    }

    @Override // defpackage.nj1
    public final void e(l80 l80Var) {
        yi yiVar = this.j;
        fm2 fm2Var = this.g;
        if (yiVar == null) {
            yiVar = (yi) fm2Var.g.getValue();
        }
        if (((Boolean) this.f.getValue()).booleanValue() && l80Var.getLayoutDirection() == kw0.f) {
            long jV = l80Var.V();
            ud udVarB = l80Var.B();
            long jM = udVarB.m();
            udVarB.g().l();
            try {
                ((ao2) udVarB.b).s(-1.0f, 1.0f, jV);
                fm2Var.e(l80Var, this.i, yiVar);
                k3.s(udVarB, jM);
            } catch (Throwable th) {
                k3.s(udVarB, jM);
                throw th;
            }
        } else {
            fm2Var.e(l80Var, this.i, yiVar);
        }
        this.h.getValue();
    }
}
