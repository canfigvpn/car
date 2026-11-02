package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c40 extends t71 {
    public final int s = ne1.e(this);
    public t71 t;

    @Override // defpackage.t71
    public final void A0() {
        super.A0();
        for (t71 t71Var = this.t; t71Var != null; t71Var = t71Var.j) {
            t71Var.A0();
        }
    }

    @Override // defpackage.t71
    public final void B0() {
        for (t71 t71Var = this.t; t71Var != null; t71Var = t71Var.j) {
            t71Var.B0();
        }
        super.B0();
    }

    @Override // defpackage.t71
    public final void C0() {
        super.C0();
        for (t71 t71Var = this.t; t71Var != null; t71Var = t71Var.j) {
            t71Var.C0();
        }
    }

    @Override // defpackage.t71
    public final void D0(t71 t71Var) {
        this.e = t71Var;
        for (t71 t71Var2 = this.t; t71Var2 != null; t71Var2 = t71Var2.j) {
            t71Var2.D0(t71Var);
        }
    }

    @Override // defpackage.t71
    public final void E0(me1 me1Var) {
        this.l = me1Var;
        for (t71 t71Var = this.t; t71Var != null; t71Var = t71Var.j) {
            t71Var.E0(me1Var);
        }
    }

    public final b40 F0(b40 b40Var) {
        t71 t71Var = ((t71) b40Var).e;
        if (t71Var != b40Var) {
            t71 t71Var2 = b40Var instanceof t71 ? (t71) b40Var : null;
            t71 t71Var3 = t71Var2 != null ? t71Var2.i : null;
            if (t71Var != this.e || !ws0.j(t71Var3, this)) {
                fu1.h("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (t71Var.r) {
                vp0.b("Cannot delegate to an already attached node");
            }
            t71Var.D0(this.e);
            int i = this.g;
            int iF = ne1.f(t71Var);
            t71Var.g = iF;
            int i2 = this.g;
            int i3 = iF & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof sw0)) {
                vp0.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + t71Var);
            }
            t71Var.j = this.t;
            this.t = t71Var;
            t71Var.i = this;
            H0(iF | this.g, false);
            if (this.r) {
                if (i3 == 0 || (i & 2) != 0) {
                    E0(this.l);
                } else {
                    he1 he1Var = qx.V(this).I;
                    this.e.E0(null);
                    he1Var.g();
                }
                t71Var.v0();
                t71Var.B0();
                if (!t71Var.r) {
                    vp0.b("autoInvalidateInsertedNode called on unattached node");
                }
                ne1.a(t71Var, -1, 1);
            }
        }
        return b40Var;
    }

    public final void G0(b40 b40Var) {
        t71 t71Var = null;
        for (t71 t71Var2 = this.t; t71Var2 != null; t71Var2 = t71Var2.j) {
            if (t71Var2 == b40Var) {
                boolean z = t71Var2.r;
                if (z) {
                    l91 l91Var = ne1.a;
                    if (!z) {
                        vp0.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    ne1.a(t71Var2, -1, 2);
                    t71Var2.C0();
                    t71Var2.w0();
                }
                t71Var2.D0(t71Var2);
                t71Var2.h = 0;
                t71 t71Var3 = t71Var2.j;
                if (t71Var == null) {
                    this.t = t71Var3;
                } else {
                    t71Var.j = t71Var3;
                }
                t71Var2.j = null;
                t71Var2.i = null;
                int i = this.g;
                int iF = ne1.f(this);
                H0(iF, true);
                if (this.r && (i & 2) != 0 && (iF & 2) == 0) {
                    he1 he1Var = qx.V(this).I;
                    this.e.E0(null);
                    he1Var.g();
                    return;
                }
                return;
            }
            t71Var = t71Var2;
        }
        qj.i(b40Var, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [t71] */
    /* JADX WARN: Type inference failed for: r2v2, types: [t71] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final void H0(int i, boolean z) {
        t71 t71Var;
        int i2 = this.g;
        this.g = i;
        if (i2 != i) {
            t71 t71Var2 = this.e;
            if (t71Var2 == this) {
                this.h = i;
            }
            boolean z2 = this.r;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.g;
                    r2.g = i;
                    if (r2 == t71Var2) {
                        break;
                    } else {
                        r2 = r2.i;
                    }
                }
                if (z && r2 == t71Var2) {
                    i = ne1.f(t71Var2);
                    t71Var2.g = i;
                }
                int i3 = i | ((r2 == 0 || (t71Var = r2.j) == null) ? 0 : t71Var.h);
                for (?? r3 = r2; r3 != 0; r3 = r3.i) {
                    i3 |= r3.g;
                    r3.h = i3;
                }
            }
        }
    }

    @Override // defpackage.t71
    public final void v0() {
        super.v0();
        for (t71 t71Var = this.t; t71Var != null; t71Var = t71Var.j) {
            t71Var.E0(this.l);
            if (!t71Var.r) {
                t71Var.v0();
            }
        }
    }

    @Override // defpackage.t71
    public final void w0() {
        for (t71 t71Var = this.t; t71Var != null; t71Var = t71Var.j) {
            t71Var.w0();
        }
        super.w0();
    }
}
