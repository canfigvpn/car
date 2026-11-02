package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class je2 implements id2 {
    public final /* synthetic */ me2 a;
    public final /* synthetic */ boolean b;

    public je2(me2 me2Var, boolean z) {
        this.a = me2Var;
        this.b = z;
    }

    @Override // defpackage.id2
    public final void a() {
        me2 me2Var = this.a;
        me2Var.q(null);
        me2Var.p(null);
        me2Var.u(true);
    }

    @Override // defpackage.id2
    public final void b() {
        me2 me2Var = this.a;
        me2Var.q(null);
        me2Var.p(null);
        me2Var.u(true);
    }

    @Override // defpackage.id2
    public final void c() {
        if2 if2VarD;
        boolean z = this.b;
        ql0 ql0Var = z ? ql0.f : ql0.g;
        me2 me2Var = this.a;
        me2Var.q(ql0Var);
        long jA = e02.a(me2Var.j(z));
        f11 f11Var = me2Var.d;
        if (f11Var == null || (if2VarD = f11Var.d()) == null) {
            return;
        }
        long jE = if2VarD.e(jA);
        me2Var.n = jE;
        me2Var.p(new uf1(jE));
        me2Var.p = 0L;
        me2Var.s = -1;
        f11 f11Var2 = me2Var.d;
        if (f11Var2 != null) {
            f11Var2.q.setValue(Boolean.TRUE);
        }
        me2Var.u(false);
    }

    @Override // defpackage.id2
    public final void e(long j) {
        me2 me2Var = this.a;
        long jE = uf1.e(me2Var.p, j);
        me2Var.p = jE;
        me2Var.p(new uf1(uf1.e(me2Var.n, jE)));
        te2 te2VarL = me2Var.l();
        uf1 uf1VarG = me2Var.g();
        uf1VarG.getClass();
        me2Var.v(te2VarL, uf1VarG.a, false, this.b, is1.m, true);
        me2Var.u(false);
    }

    @Override // defpackage.id2
    public final void onCancel() {
    }

    @Override // defpackage.id2
    public final void d(long j, fu1 fu1Var) {
    }
}
