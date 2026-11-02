package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ei2 implements p82 {
    public final ii2 e;
    public ej0 f;
    public ej0 g;
    public final /* synthetic */ fi2 h;

    public ei2(fi2 fi2Var, ii2 ii2Var, ej0 ej0Var, ej0 ej0Var2) {
        this.h = fi2Var;
        this.e = ii2Var;
        this.f = ej0Var;
        this.g = ej0Var2;
    }

    public final void a(gi2 gi2Var) {
        Object objH = this.g.h(gi2Var.c());
        boolean zG = this.h.c.g();
        ii2 ii2Var = this.e;
        if (zG) {
            ii2Var.g(this.g.h(gi2Var.a()), objH, (ld0) this.f.h(gi2Var));
        } else {
            ii2Var.h(objH, (ld0) this.f.h(gi2Var));
        }
    }

    @Override // defpackage.p82
    public final Object getValue() {
        a(this.h.c.f());
        return this.e.n.getValue();
    }
}
