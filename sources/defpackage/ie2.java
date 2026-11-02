package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ie2 implements id2 {
    public final /* synthetic */ me2 a;

    public ie2(me2 me2Var) {
        this.a = me2Var;
    }

    @Override // defpackage.id2
    public final void a() {
        me2 me2Var = this.a;
        me2Var.q(null);
        me2Var.p(null);
    }

    @Override // defpackage.id2
    public final void b() {
        me2 me2Var = this.a;
        me2Var.q(null);
        me2Var.p(null);
    }

    @Override // defpackage.id2
    public final void d(long j, fu1 fu1Var) {
        if2 if2VarD;
        me2 me2Var = this.a;
        long jA = e02.a(me2Var.j(true));
        f11 f11Var = me2Var.d;
        if (f11Var == null || (if2VarD = f11Var.d()) == null) {
            return;
        }
        long jE = if2VarD.e(jA);
        me2Var.n = jE;
        me2Var.p(new uf1(jE));
        me2Var.p = 0L;
        me2Var.q(ql0.e);
        me2Var.u(false);
    }

    @Override // defpackage.id2
    public final void e(long j) {
        if2 if2VarD;
        yl0 yl0Var;
        me2 me2Var = this.a;
        me2Var.p = uf1.e(me2Var.p, j);
        f11 f11Var = me2Var.d;
        if (f11Var == null || (if2VarD = f11Var.d()) == null) {
            return;
        }
        me2Var.p(new uf1(uf1.e(me2Var.n, me2Var.p)));
        xf1 xf1Var = me2Var.b;
        uf1 uf1VarG = me2Var.g();
        uf1VarG.getClass();
        int iN = xf1Var.n(if2VarD.b(uf1VarG.a, true));
        long jC = j02.c(iN, iN);
        if (of2.b(jC, me2Var.l().b)) {
            return;
        }
        f11 f11Var2 = me2Var.d;
        if ((f11Var2 == null || ((Boolean) f11Var2.q.getValue()).booleanValue()) && (yl0Var = me2Var.j) != null) {
            ((om1) yl0Var).a();
        }
        me2Var.c.h(me2.b(me2Var.l().a, jC));
        me2Var.v = new of2(jC);
    }

    @Override // defpackage.id2
    public final void c() {
    }

    @Override // defpackage.id2
    public final void onCancel() {
    }
}
