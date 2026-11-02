package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class a30 implements r61 {
    public final /* synthetic */ int e;
    public final r61 f;
    public final Enum g;
    public final Enum h;

    public /* synthetic */ a30(r61 r61Var, Enum r2, Enum r3, int i) {
        this.e = i;
        this.f = r61Var;
        this.g = r2;
        this.h = r3;
    }

    @Override // defpackage.r61
    public final int U(int i) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f.U(i);
    }

    @Override // defpackage.r61
    public final int a0(int i) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f.a0(i);
    }

    @Override // defpackage.r61
    public final jm1 e(long j) {
        int i = this.e;
        Enum r1 = this.g;
        Enum r2 = this.h;
        r61 r61Var = this.f;
        switch (i) {
            case 0:
                ts0 ts0Var = (ts0) r2;
                ps0 ps0Var = (ps0) r1;
                ps0 ps0Var2 = ps0.f;
                if (ts0Var == ts0.e) {
                    return new nd0(ps0Var == ps0Var2 ? r61Var.a0(sw.g(j)) : r61Var.U(sw.g(j)), sw.c(j) ? sw.g(j) : 32767, 0);
                }
                return new nd0(sw.d(j) ? sw.h(j) : 32767, ps0Var == ps0Var2 ? r61Var.f(sw.h(j)) : r61Var.e0(sw.h(j)), 0);
            case 1:
                b71 b71Var = (b71) r2;
                a71 a71Var = (a71) r1;
                a71 a71Var2 = a71.f;
                if (b71Var == b71.e) {
                    return new nd0(a71Var == a71Var2 ? r61Var.a0(sw.g(j)) : r61Var.U(sw.g(j)), sw.c(j) ? sw.g(j) : 32767, 1);
                }
                return new nd0(sw.d(j) ? sw.h(j) : 32767, a71Var == a71Var2 ? r61Var.f(sw.h(j)) : r61Var.e0(sw.h(j)), 1);
            default:
                qe1 qe1Var = (qe1) r2;
                pe1 pe1Var = (pe1) r1;
                pe1 pe1Var2 = pe1.f;
                if (qe1Var == qe1.e) {
                    return new nd0(pe1Var == pe1Var2 ? r61Var.a0(sw.g(j)) : r61Var.U(sw.g(j)), sw.c(j) ? sw.g(j) : 32767, 2);
                }
                return new nd0(sw.d(j) ? sw.h(j) : 32767, pe1Var == pe1Var2 ? r61Var.f(sw.h(j)) : r61Var.e0(sw.h(j)), 2);
        }
    }

    @Override // defpackage.r61
    public final int e0(int i) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f.e0(i);
    }

    @Override // defpackage.r61
    public final int f(int i) {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f.f(i);
    }

    @Override // defpackage.r61
    public final Object j() {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f.j();
    }
}
