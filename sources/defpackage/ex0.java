package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ex0 {
    public final ax0 a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public d51 q;
    public ww0 d = ww0.i;
    public final v61 p = new v61(this);

    public ex0(ax0 ax0Var) {
        this.a = ax0Var;
    }

    public final me1 a() {
        return this.a.I.d;
    }

    public final void b() {
        ww0 ww0Var = this.a.J.d;
        ww0 ww0Var2 = ww0.g;
        ww0 ww0Var3 = ww0.h;
        if (ww0Var == ww0Var2 || ww0Var == ww0Var3) {
            if (this.p.E) {
                g(true);
            } else {
                f(true);
            }
        }
        if (ww0Var == ww0Var3) {
            d51 d51Var = this.q;
            if (d51Var == null || !d51Var.y) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        d51 d51Var = this.q;
        if (d51Var != null) {
            ex0 ex0Var = d51Var.j;
            ex0Var.d = ww0.f;
            ax0 ax0Var = ex0Var.a;
            ex0Var.e = false;
            d51Var.C = j;
            cj1 snapshotObserver = ((e5) dx0.a(ax0Var)).getSnapshotObserver();
            c51 c51Var = d51Var.D;
            snapshotObserver.getClass();
            snapshotObserver.a.c(ax0Var, je1.n, c51Var);
            ex0Var.f = true;
            ex0Var.g = true;
            boolean zB = ex.B(ax0Var);
            v61 v61Var = ex0Var.p;
            if (zB) {
                v61Var.z = true;
                v61Var.A = true;
            } else {
                v61Var.y = true;
            }
            ex0Var.d = ww0.i;
        }
    }

    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            ax0 ax0VarU = this.a.u();
            ex0 ex0Var = ax0VarU != null ? ax0VarU.J : null;
            if (ex0Var != null) {
                int i3 = ex0Var.l;
                if (i == 0) {
                    ex0Var.d(i3 - 1);
                } else {
                    ex0Var.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            ax0 ax0VarU = this.a.u();
            ex0 ex0Var = ax0VarU != null ? ax0VarU.J : null;
            if (ex0Var != null) {
                int i3 = ex0Var.o;
                if (i == 0) {
                    ex0Var.e(i3 - 1);
                } else {
                    ex0Var.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        v61 v61Var = this.p;
        ex0 ex0Var = v61Var.j;
        Object obj = v61Var.v;
        ax0 ax0Var = this.a;
        if ((obj != null || ex0Var.a().j() != null) && v61Var.u) {
            v61Var.u = false;
            v61Var.v = ex0Var.a().j();
            ax0 ax0VarU = ax0Var.u();
            if (ax0VarU != null) {
                ax0.V(ax0VarU, false, 7);
            }
        }
        d51 d51Var = this.q;
        if (d51Var != null) {
            ex0 ex0Var2 = d51Var.j;
            if (d51Var.B == null) {
                z41 z41VarQ0 = ex0Var2.a().Q0();
                z41VarQ0.getClass();
                if (z41VarQ0.s.j() == null) {
                    return;
                }
            }
            if (d51Var.A) {
                d51Var.A = false;
                z41 z41VarQ1 = ex0Var2.a().Q0();
                z41VarQ1.getClass();
                d51Var.B = z41VarQ1.s.j();
                if (ex.B(ax0Var)) {
                    ax0 ax0VarU2 = ax0Var.u();
                    if (ax0VarU2 != null) {
                        ax0.V(ax0VarU2, false, 7);
                        return;
                    }
                    return;
                }
                ax0 ax0VarU3 = ax0Var.u();
                if (ax0VarU3 != null) {
                    ax0.T(ax0VarU3, false, 7);
                }
            }
        }
    }
}
