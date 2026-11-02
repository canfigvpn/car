package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class gg0 extends c40 implements m02, pk0, rv, lf1, si2 {
    public static final w40 A = new w40(6);
    public f91 u;
    public final ej0 v;
    public nf0 w;
    public pz0 x;
    public me1 y;
    public final cg0 z;

    public gg0(f91 f91Var, int i, f fVar) {
        this.u = f91Var;
        this.v = fVar;
        cg0 cg0Var = new cg0(i, new fg0(2, this, gg0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0), 10);
        F0(cg0Var);
        this.z = cg0Var;
    }

    @Override // defpackage.lf1
    public final void I() {
        gs1 gs1Var = new gs1();
        ux.C(this, new n1(16, gs1Var, this));
        pz0 pz0Var = (pz0) gs1Var.e;
        if (this.z.K0().a()) {
            pz0 pz0Var2 = this.x;
            if (pz0Var2 != null) {
                pz0Var2.b();
            }
            if (pz0Var != null) {
                pz0Var.a();
            } else {
                pz0Var = null;
            }
            this.x = pz0Var;
        }
    }

    public final void I0(f91 f91Var, tr0 tr0Var) {
        if (!this.r) {
            f91Var.c(tr0Var);
            return;
        }
        ot0 ot0Var = (ot0) ((rx) t0()).e.p(q90.P);
        nj2.y(t0(), null, new g(f91Var, tr0Var, ot0Var != null ? ot0Var.t(new d(15, f91Var, tr0Var)) : null, null, 11), 3);
    }

    public final void J0() {
        he1 he1Var;
        if (this.r) {
            if (!this.e.r) {
                vp0.b("visitAncestors called on an unattached node");
            }
            t71 t71Var = this.e.i;
            ax0 ax0VarV = qx.V(this);
            while (ax0VarV != null) {
                if ((ax0VarV.I.f.h & 262144) != 0) {
                    while (t71Var != null) {
                        if ((t71Var.g & 262144) != 0) {
                            t71 t71VarP = t71Var;
                            fa1 fa1Var = null;
                            while (t71VarP != null) {
                                if (t71VarP instanceof si2) {
                                    if (hg0.s == ((si2) t71VarP).p()) {
                                        return;
                                    }
                                }
                                if ((t71VarP.g & 262144) != 0 && (t71VarP instanceof c40)) {
                                    int i = 0;
                                    for (t71 t71Var2 = ((c40) t71VarP).t; t71Var2 != null; t71Var2 = t71Var2.j) {
                                        if ((t71Var2.g & 262144) != 0) {
                                            i++;
                                            if (i == 1) {
                                                t71VarP = t71Var2;
                                            } else {
                                                if (fa1Var == null) {
                                                    fa1Var = new fa1(new t71[16]);
                                                }
                                                if (t71VarP != null) {
                                                    fa1Var.b(t71VarP);
                                                    t71VarP = null;
                                                }
                                                fa1Var.b(t71Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                t71VarP = qx.P(fa1Var);
                            }
                        }
                        t71Var = t71Var.i;
                    }
                }
                ax0VarV = ax0VarV.u();
                t71Var = (ax0VarV == null || (he1Var = ax0VarV.I) == null) ? null : he1Var.e;
            }
        }
    }

    public final void K0(f91 f91Var) {
        nf0 nf0Var;
        if (ws0.j(this.u, f91Var)) {
            return;
        }
        f91 f91Var2 = this.u;
        if (f91Var2 != null && (nf0Var = this.w) != null) {
            f91Var2.c(new of0(nf0Var));
        }
        this.w = null;
        this.u = f91Var;
    }

    @Override // defpackage.m02
    public final void e0(z02 z02Var) {
        boolean zA = this.z.K0().a();
        lv0[] lv0VarArr = w02.a;
        y02 y02Var = u02.l;
        lv0 lv0Var = w02.a[4];
        z02Var.a(y02Var, Boolean.valueOf(zA));
        z02Var.a(h02.w, new p0(null, new t4(0, this, gg0.class, "requestFocus", "requestFocus()Z", 0, 4)));
    }

    @Override // defpackage.si2
    public final Object p() {
        return A;
    }

    @Override // defpackage.pk0
    public final void t(me1 me1Var) {
        this.y = me1Var;
        if (this.z.K0().a()) {
            if (!me1Var.S0().r) {
                J0();
                return;
            }
            me1 me1Var2 = this.y;
            if (me1Var2 == null || !me1Var2.S0().r) {
                return;
            }
            J0();
        }
    }

    @Override // defpackage.t71
    public final boolean u0() {
        return false;
    }

    @Override // defpackage.t71
    public final void z0() {
        pz0 pz0Var = this.x;
        if (pz0Var != null) {
            pz0Var.b();
        }
        this.x = null;
    }
}
