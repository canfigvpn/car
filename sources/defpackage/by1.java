package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class by1 extends c40 implements rv, lf1 {
    public v6 A;
    public ny1 B;
    public b40 C;
    public w6 D;
    public v6 E;
    public boolean F;
    public oy1 u;
    public di1 v;
    public boolean w;
    public pd0 x;
    public f91 y;
    public boolean z;

    @Override // defpackage.lf1
    public final void I() {
        w6 w6Var = (w6) ir2.j(this, yi1.a);
        if (ws0.j(w6Var, this.D)) {
            return;
        }
        this.D = w6Var;
        this.E = null;
        b40 b40Var = this.C;
        if (b40Var != null) {
            G0(b40Var);
        }
        this.C = null;
        I0();
        ny1 ny1Var = this.B;
        if (ny1Var != null) {
            oy1 oy1Var = this.u;
            di1 di1Var = this.v;
            ny1Var.Y0(this.z ? this.E : this.A, this.x, this.y, di1Var, oy1Var, this.w, this.F);
        }
    }

    public final void I0() {
        b40 b40Var = this.C;
        if (b40Var != null) {
            if (((t71) b40Var).e.r) {
                return;
            }
            F0(b40Var);
            return;
        }
        if (this.z) {
            ux.C(this, new w8(28, this));
        }
        v6 v6Var = this.z ? this.E : this.A;
        if (v6Var != null) {
            c40 c40Var = v6Var.i;
            if (c40Var.e.r) {
                return;
            }
            F0(c40Var);
            this.C = c40Var;
        }
    }

    public final boolean J0() {
        return (this.r ? qx.V(this).C : kw0.e) != kw0.f || this.v == di1.e;
    }

    public final void K0(v6 v6Var, pd0 pd0Var, f91 f91Var, di1 di1Var, oy1 oy1Var, boolean z, boolean z2) {
        boolean z3;
        this.u = oy1Var;
        this.v = di1Var;
        boolean z4 = true;
        if (this.z != z) {
            this.z = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (ws0.j(this.A, v6Var)) {
            z4 = false;
        } else {
            this.A = v6Var;
        }
        if (z3 || (z4 && !z)) {
            b40 b40Var = this.C;
            if (b40Var != null) {
                G0(b40Var);
            }
            this.C = null;
            I0();
        }
        this.w = z2;
        this.x = pd0Var;
        this.y = f91Var;
        boolean zJ0 = J0();
        this.F = zJ0;
        ny1 ny1Var = this.B;
        if (ny1Var != null) {
            ny1Var.Y0(this.z ? this.E : this.A, pd0Var, f91Var, di1Var, oy1Var, z2, zJ0);
        }
    }

    @Override // defpackage.b40
    public final void p0() {
        boolean zJ0 = J0();
        if (this.F != zJ0) {
            this.F = zJ0;
            oy1 oy1Var = this.u;
            di1 di1Var = this.v;
            boolean z = this.z;
            K0(z ? this.E : this.A, this.x, this.y, di1Var, oy1Var, z, this.w);
        }
    }

    @Override // defpackage.t71
    public final boolean u0() {
        return false;
    }

    @Override // defpackage.t71
    public final void x0() {
        this.F = J0();
        I0();
        if (this.B == null) {
            oy1 oy1Var = this.u;
            ny1 ny1Var = new ny1(this.z ? this.E : this.A, this.x, this.y, this.v, oy1Var, this.w, this.F);
            F0(ny1Var);
            this.B = ny1Var;
        }
    }

    @Override // defpackage.t71
    public final void y0() {
        b40 b40Var = this.C;
        if (b40Var != null) {
            G0(b40Var);
        }
    }
}
