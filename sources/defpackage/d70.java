package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class d70 extends t71 implements si2, hw0 {
    public d70 s;
    public d70 t;
    public long u;

    public final boolean F0() {
        d70 d70Var = this.s;
        if (d70Var != null) {
            return d70Var.F0();
        }
        d70 d70Var2 = this.t;
        if (d70Var2 != null) {
            return d70Var2.F0();
        }
        return false;
    }

    public final void G0() {
        d70 d70Var = this.t;
        if (d70Var != null) {
            d70Var.G0();
            return;
        }
        d70 d70Var2 = this.s;
        if (d70Var2 != null) {
            d70Var2.G0();
        }
    }

    public final void H0() {
        d70 d70Var = this.t;
        if (d70Var != null) {
            d70Var.H0();
        }
        d70 d70Var2 = this.s;
        if (d70Var2 != null) {
            d70Var2.H0();
        }
        this.s = null;
    }

    public final void I0(ao2 ao2Var) {
        si2 si2Var;
        d70 d70Var;
        d70 d70Var2 = this.s;
        int i = 1;
        if (d70Var2 == null || !qx.v(d70Var2, ux.v(ao2Var))) {
            if (this.e.r) {
                gs1 gs1Var = new gs1();
                p12.p(this, new na(gs1Var, this, ao2Var, i));
                si2Var = (si2) gs1Var.e;
            } else {
                si2Var = null;
            }
            d70Var = (d70) si2Var;
        } else {
            d70Var = d70Var2;
        }
        if (d70Var != null && d70Var2 == null) {
            d70Var.G0();
            d70Var.I0(ao2Var);
            d70 d70Var3 = this.t;
            if (d70Var3 != null) {
                d70Var3.H0();
            }
        } else if (d70Var == null && d70Var2 != null) {
            d70 d70Var4 = this.t;
            if (d70Var4 != null) {
                d70Var4.G0();
                d70Var4.I0(ao2Var);
            }
            d70Var2.H0();
        } else if (!ws0.j(d70Var, d70Var2)) {
            if (d70Var != null) {
                d70Var.G0();
                d70Var.I0(ao2Var);
            }
            if (d70Var2 != null) {
                d70Var2.H0();
            }
        } else if (d70Var != null) {
            d70Var.I0(ao2Var);
        } else {
            d70 d70Var5 = this.t;
            if (d70Var5 != null) {
                d70Var5.I0(ao2Var);
            }
        }
        this.s = d70Var;
    }

    public final void J0() {
        d70 d70Var = this.t;
        if (d70Var != null) {
            d70Var.J0();
            return;
        }
        d70 d70Var2 = this.s;
        if (d70Var2 != null) {
            d70Var2.J0();
        }
    }

    @Override // defpackage.hw0, defpackage.z61
    public final void c(long j) {
        this.u = j;
    }

    @Override // defpackage.si2
    public final Object p() {
        return q90.E;
    }

    @Override // defpackage.t71
    public final void y0() {
        this.t = null;
        this.s = null;
    }
}
