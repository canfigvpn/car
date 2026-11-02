package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ke2 implements id2 {
    public of2 b;
    public final /* synthetic */ me2 d;
    public boolean a = true;
    public fu1 c = is1.j;

    public ke2(me2 me2Var) {
        this.d = me2Var;
    }

    @Override // defpackage.id2
    public final void a() {
        f();
    }

    @Override // defpackage.id2
    public final void d(long j, fu1 fu1Var) {
        long j2;
        if2 if2VarD;
        if2 if2VarD2;
        me2 me2Var = this.d;
        if (me2Var.i() && ((ql0) me2Var.q.getValue()) == null) {
            me2Var.q(ql0.g);
            me2Var.s = -1;
            this.a = true;
            this.c = fu1Var;
            me2Var.m();
            f11 f11Var = me2Var.d;
            if (f11Var == null || (if2VarD2 = f11Var.d()) == null || !if2VarD2.c(j)) {
                j2 = j;
                f11 f11Var2 = me2Var.d;
                if (f11Var2 != null && (if2VarD = f11Var2.d()) != null) {
                    int iN = me2Var.b.n(if2VarD.b(j2, true));
                    te2 te2VarB = me2.b(me2Var.l().a, j02.c(iN, iN));
                    me2Var.e(false);
                    yl0 yl0Var = me2Var.j;
                    if (yl0Var != null) {
                        ((om1) yl0Var).a();
                    }
                    me2Var.c.h(te2VarB);
                    me2Var.v = new of2(te2VarB.b);
                }
                this.a = false;
            } else {
                if (me2Var.l().a.f.length() == 0) {
                    return;
                }
                me2Var.e(false);
                long jV = me2Var.v(te2.a(me2Var.l(), null, of2.b, 5), j, true, false, this.c, true);
                j2 = j;
                me2Var.o = new of2(jV);
                this.b = new of2(jV);
            }
            me2Var.r(sl0.e);
            me2Var.n = j2;
            me2Var.p(new uf1(j2));
            me2Var.p = 0L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:24:0x0097  */
    @Override // defpackage.id2
    public final void e(long j) {
        if2 if2VarD;
        of2 of2Var;
        int iB;
        long jV;
        me2 me2Var = this.d;
        if (!me2Var.i() || me2Var.l().a.f.length() == 0) {
            return;
        }
        me2Var.p = uf1.e(me2Var.p, j);
        f11 f11Var = me2Var.d;
        if (f11Var != null && (if2VarD = f11Var.d()) != null) {
            me2Var.p(new uf1(uf1.e(me2Var.n, me2Var.p)));
            if (me2Var.o == null) {
                uf1 uf1VarG = me2Var.g();
                uf1VarG.getClass();
                if (if2VarD.c(uf1VarG.a)) {
                    of2Var = me2Var.o;
                    if (of2Var != null) {
                        iB = (int) (of2Var.a >> 32);
                    } else {
                        iB = if2VarD.b(me2Var.n, false);
                    }
                    uf1 uf1VarG2 = me2Var.g();
                    uf1VarG2.getClass();
                    int iB2 = if2VarD.b(uf1VarG2.a, false);
                    if (me2Var.o != null && iB == iB2) {
                        return;
                    }
                    te2 te2VarL = me2Var.l();
                    uf1 uf1VarG3 = me2Var.g();
                    uf1VarG3.getClass();
                    jV = me2Var.v(te2VarL, uf1VarG3.a, false, false, this.c, true);
                } else {
                    int iN = me2Var.b.n(if2VarD.b(me2Var.n, true));
                    xf1 xf1Var = me2Var.b;
                    uf1 uf1VarG4 = me2Var.g();
                    uf1VarG4.getClass();
                    fu1 fu1Var = iN == xf1Var.n(if2VarD.b(uf1VarG4.a, true)) ? is1.j : is1.k;
                    te2 te2VarL2 = me2Var.l();
                    uf1 uf1VarG5 = me2Var.g();
                    uf1VarG5.getClass();
                    jV = me2Var.v(te2VarL2, uf1VarG5.a, false, false, fu1Var, true);
                }
            } else {
                of2Var = me2Var.o;
                if (of2Var != null) {
                    iB = (int) (of2Var.a >> 32);
                } else {
                    iB = if2VarD.b(me2Var.n, false);
                }
                uf1 uf1VarG6 = me2Var.g();
                uf1VarG6.getClass();
                int iB3 = if2VarD.b(uf1VarG6.a, false);
                if (me2Var.o != null) {
                }
                te2 te2VarL3 = me2Var.l();
                uf1 uf1VarG7 = me2Var.g();
                uf1VarG7.getClass();
                jV = me2Var.v(te2VarL3, uf1VarG7.a, false, false, this.c, true);
            }
            this.b = new of2(jV);
            if (!of2.a(jV, me2Var.o)) {
                this.a = false;
            }
        }
        me2Var.u(false);
    }

    public final void f() {
        me2 me2Var = this.d;
        me2Var.q(null);
        me2Var.p(null);
        this.c = is1.j;
        me2Var.u(true);
        of2 of2Var = this.b;
        boolean zC = of2.c(of2Var != null ? of2Var.a : me2Var.l().b);
        me2Var.r(zC ? sl0.g : sl0.f);
        f11 f11Var = me2Var.d;
        if (f11Var != null) {
            f11Var.m.setValue(Boolean.valueOf(!zC && v12.n(me2Var, true)));
        }
        f11 f11Var2 = me2Var.d;
        if (f11Var2 != null) {
            f11Var2.n.setValue(Boolean.valueOf(!zC && v12.n(me2Var, false)));
        }
        f11 f11Var3 = me2Var.d;
        if (f11Var3 != null) {
            f11Var3.o.setValue(Boolean.valueOf(zC && v12.n(me2Var, true)));
        }
        if (this.a) {
            me2Var.n(me2Var.o);
        }
        me2Var.o = null;
    }

    @Override // defpackage.id2
    public final void onCancel() {
        f();
    }

    @Override // defpackage.id2
    public final void b() {
    }

    @Override // defpackage.id2
    public final void c() {
    }
}
