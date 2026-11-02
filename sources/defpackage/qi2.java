package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qi2 extends o62 {
    public final o62 e;
    public final boolean f;
    public final boolean g;
    public ej0 h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi2(o62 o62Var, ej0 ej0Var, boolean z, boolean z2) {
        ej0 ej0VarE;
        super(0L, u62.i);
        v22 v22Var = x62.a;
        this.e = o62Var;
        this.f = z;
        this.g = z2;
        this.h = x62.i(ej0Var, (o62Var == null || (ej0VarE = o62Var.e()) == null) ? x62.j.e : ej0VarE, z);
        this.i = y12.d();
    }

    @Override // defpackage.o62
    public final void c() {
        o62 o62Var;
        this.c = true;
        if (!this.g || (o62Var = this.e) == null) {
            return;
        }
        o62Var.c();
    }

    @Override // defpackage.o62
    public final u62 d() {
        return v().d();
    }

    @Override // defpackage.o62
    public final ej0 e() {
        return this.h;
    }

    @Override // defpackage.o62
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.o62
    public final long g() {
        return v().g();
    }

    @Override // defpackage.o62
    public final ej0 i() {
        return null;
    }

    @Override // defpackage.o62
    public final void k() {
        c22.s();
        throw null;
    }

    @Override // defpackage.o62
    public final void l() {
        c22.s();
        throw null;
    }

    @Override // defpackage.o62
    public final void m() {
        v().m();
    }

    @Override // defpackage.o62
    public final void n(v82 v82Var) {
        v().n(v82Var);
    }

    @Override // defpackage.o62
    public final o62 u(ej0 ej0Var) {
        ej0 ej0VarI = x62.i(ej0Var, this.h, true);
        return !this.f ? x62.e(v().u(null), ej0VarI, true) : v().u(ej0VarI);
    }

    public final o62 v() {
        o62 o62Var = this.e;
        return o62Var == null ? x62.j : o62Var;
    }
}
