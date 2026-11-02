package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class rq0 extends mq0 implements sw0 {
    public uo2 u;

    public rq0(uo2 uo2Var) {
        this.u = uo2Var;
    }

    @Override // defpackage.mq0
    public final uo2 F0(uo2 uo2Var) {
        return new kl2(uo2Var, this.u);
    }

    @Override // defpackage.mq0
    public final void G0() {
        super.G0();
        rw.z(this);
    }

    @Override // defpackage.sw0
    public final x61 e(y61 y61Var, r61 r61Var, long j) {
        int iD = this.t.d(y61Var, y61Var.getLayoutDirection()) - this.s.d(y61Var, y61Var.getLayoutDirection());
        int iB = this.t.b(y61Var) - this.s.b(y61Var);
        int iC = (this.t.c(y61Var, y61Var.getLayoutDirection()) - this.s.c(y61Var, y61Var.getLayoutDirection())) + iD;
        int iA = (this.t.a(y61Var) - this.s.a(y61Var)) + iB;
        jm1 jm1VarE = r61Var.e(tw.i(-iC, -iA, j));
        return y61Var.d0(tw.g(jm1VarE.e + iC, j), tw.f(jm1VarE.f + iA, j), db0.e, new qq0(jm1VarE, iD, iB, 0));
    }
}
