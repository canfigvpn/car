package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ir1 extends o62 {
    public final ej0 e;
    public int f;

    public ir1(long j, u62 u62Var, ej0 ej0Var) {
        super(j, u62Var);
        this.e = ej0Var;
        this.f = 1;
    }

    @Override // defpackage.o62
    public final void c() {
        if (this.c) {
            return;
        }
        l();
        this.c = true;
        synchronized (x62.c) {
            o();
        }
    }

    @Override // defpackage.o62
    public final ej0 e() {
        return this.e;
    }

    @Override // defpackage.o62
    public final boolean f() {
        return true;
    }

    @Override // defpackage.o62
    public final ej0 i() {
        return null;
    }

    @Override // defpackage.o62
    public final void k() {
        this.f++;
    }

    @Override // defpackage.o62
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // defpackage.o62
    public final void n(v82 v82Var) {
        v22 v22Var = x62.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.o62
    public final o62 u(ej0 ej0Var) {
        x62.v(this);
        return new ud1(this.b, this.a, x62.i(ej0Var, this.e, true), this);
    }

    @Override // defpackage.o62
    public final void m() {
    }
}
