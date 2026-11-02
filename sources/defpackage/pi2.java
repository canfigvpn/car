package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pi2 extends ba1 {
    public final ba1 o;
    public final boolean p;
    public final boolean q;
    public ej0 r;
    public ej0 s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    public pi2(ba1 ba1Var, ej0 ej0Var, ej0 ej0Var2, boolean z, boolean z2) {
        ej0 ej0VarI;
        ej0 ej0VarE;
        v22 v22Var = x62.a;
        super(0L, u62.i, x62.i(ej0Var, (ba1Var == null || (ej0VarE = ba1Var.e()) == null) ? x62.j.e : ej0VarE, z), x62.j(ej0Var2, (ba1Var == null || (ej0VarI = ba1Var.i()) == null) ? x62.j.f : ej0VarI));
        this.o = ba1Var;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = y12.d();
    }

    @Override // defpackage.ba1
    public final void B(x91 x91Var) {
        c22.s();
        throw null;
    }

    @Override // defpackage.ba1
    public final ba1 C(ej0 ej0Var, ej0 ej0Var2) {
        ej0 ej0VarI = x62.i(ej0Var, this.r, true);
        ej0 ej0VarJ = x62.j(ej0Var2, this.s);
        return !this.p ? new pi2(D().C(null, ej0VarJ), ej0VarI, ej0VarJ, false, true) : D().C(ej0VarI, ej0VarJ);
    }

    public final ba1 D() {
        ba1 ba1Var = this.o;
        return ba1Var == null ? x62.j : ba1Var;
    }

    @Override // defpackage.ba1, defpackage.o62
    public final void c() {
        ba1 ba1Var;
        this.c = true;
        if (!this.q || (ba1Var = this.o) == null) {
            return;
        }
        ba1Var.c();
    }

    @Override // defpackage.o62
    public final u62 d() {
        return D().d();
    }

    @Override // defpackage.ba1, defpackage.o62
    public final ej0 e() {
        return this.r;
    }

    @Override // defpackage.ba1, defpackage.o62
    public final boolean f() {
        return D().f();
    }

    @Override // defpackage.o62
    public final long g() {
        return D().g();
    }

    @Override // defpackage.ba1, defpackage.o62
    public final int h() {
        return D().h();
    }

    @Override // defpackage.ba1, defpackage.o62
    public final ej0 i() {
        return this.s;
    }

    @Override // defpackage.ba1, defpackage.o62
    public final void k() {
        c22.s();
        throw null;
    }

    @Override // defpackage.ba1, defpackage.o62
    public final void l() {
        c22.s();
        throw null;
    }

    @Override // defpackage.ba1, defpackage.o62
    public final void m() {
        D().m();
    }

    @Override // defpackage.ba1, defpackage.o62
    public final void n(v82 v82Var) {
        D().n(v82Var);
    }

    @Override // defpackage.o62
    public final void r(u62 u62Var) {
        c22.s();
        throw null;
    }

    @Override // defpackage.o62
    public final void s(long j) {
        c22.s();
        throw null;
    }

    @Override // defpackage.ba1, defpackage.o62
    public final void t(int i) {
        D().t(i);
    }

    @Override // defpackage.ba1, defpackage.o62
    public final o62 u(ej0 ej0Var) {
        ej0 ej0VarI = x62.i(ej0Var, this.r, true);
        return !this.p ? x62.e(D().u(null), ej0VarI, true) : D().u(ej0VarI);
    }

    @Override // defpackage.ba1
    public final j12 w() {
        return D().w();
    }

    @Override // defpackage.ba1
    public final x91 x() {
        return D().x();
    }

    @Override // defpackage.ba1
    /* JADX INFO: renamed from: y */
    public final ej0 e() {
        return this.r;
    }
}
