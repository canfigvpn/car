package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ne1 {
    public static final l91 a;

    static {
        l91 l91Var = ef1.a;
        a = new l91();
    }

    public static final void a(t71 t71Var, int i, int i2) {
        if (!(t71Var instanceof c40)) {
            b(t71Var, i & t71Var.g, i2);
            return;
        }
        c40 c40Var = (c40) t71Var;
        int i3 = c40Var.s;
        b(t71Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (t71 t71Var2 = c40Var.t; t71Var2 != null; t71Var2 = t71Var2.j) {
            a(t71Var2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(t71 t71Var, int i, int i2) {
        if (i2 != 0 || t71Var.u0()) {
            if ((i & 2) != 0 && (t71Var instanceof sw0)) {
                rw.z((sw0) t71Var);
                if (i2 == 2) {
                    qx.T(t71Var, 2).e1();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                qx.V(t71Var).E();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                qx.V(t71Var).U(false);
            }
            if ((i & 256) != 0 && (t71Var instanceof pk0)) {
                if (i2 == 1) {
                    ax0 ax0VarV = qx.V(t71Var);
                    ax0VarV.a0(ax0VarV.Q + 1);
                } else if (i2 == 2) {
                    ax0 ax0VarV2 = qx.V(t71Var);
                    ax0VarV2.a0(ax0VarV2.Q - 1);
                }
                if (i2 != 2) {
                    ax0 ax0VarV3 = qx.V(t71Var);
                    if (ax0VarV3.Q != 0 && !ax0VarV3.p() && !ax0VarV3.q() && !ax0VarV3.P) {
                        e5 e5Var = (e5) dx0.a(ax0VarV3);
                        dq0 dq0Var = (dq0) e5Var.c0.e;
                        if (ax0VarV3.Q > 0) {
                            ((fa1) dq0Var.f).b(ax0VarV3);
                            ax0VarV3.P = true;
                        }
                        e5Var.F(null);
                    }
                }
            }
            if ((i & 4) != 0 && (t71Var instanceof k80)) {
                vv.B((k80) t71Var);
            }
            if ((i & 8) != 0 && (t71Var instanceof m02)) {
                qx.V(t71Var).u = true;
            }
            if ((i & 64) != 0 && (t71Var instanceof ek1)) {
                ex0 ex0Var = qx.V((ek1) t71Var).J;
                ex0Var.p.u = true;
                d51 d51Var = ex0Var.q;
                if (d51Var != null) {
                    d51Var.A = true;
                }
            }
            if ((i & 2048) != 0 && (t71Var instanceof rh)) {
                s71 s71Var = ((rh) t71Var).s;
                vp0.b("applyFocusProperties called on wrong node");
                s71Var.getClass();
                fu1.c();
                return;
            }
            if ((i & 4096) != 0 && (t71Var instanceof mf0)) {
                mf0 mf0Var = (mf0) t71Var;
                qf0 qf0Var = ((vf0) ((e5) qx.W(mf0Var)).getFocusOwner()).d;
                if (qf0Var.d.a(mf0Var)) {
                    qf0Var.a();
                }
            }
            if ((i & 2097152) != 0 && (t71Var instanceof mp0) && i2 == 2) {
                ((mp0) t71Var).z();
            }
        }
    }

    public static final void c(t71 t71Var) {
        if (!t71Var.r) {
            vp0.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(t71Var, -1, 0);
    }

    public static final int d(s71 s71Var) {
        int i = s71Var instanceof qw0 ? 3 : 1;
        if (s71Var instanceof j80) {
            i |= 4;
        }
        if (s71Var instanceof k02) {
            i |= 8;
        }
        if (s71Var instanceof va) {
            i |= 64;
        }
        return s71Var instanceof bk ? 524288 | i : i;
    }

    public static final int e(t71 t71Var) {
        int i = t71Var.g;
        if (i != 0) {
            return i;
        }
        Class<?> cls = t71Var.getClass();
        l91 l91Var = a;
        int iD = l91Var.d(cls);
        if (iD >= 0) {
            return l91Var.c[iD];
        }
        int i2 = t71Var instanceof sw0 ? 3 : 1;
        if (t71Var instanceof k80) {
            i2 |= 4;
        }
        if (t71Var instanceof m02) {
            i2 |= 8;
        }
        if (t71Var instanceof zn1) {
            i2 |= 16;
        }
        if (t71Var instanceof w71) {
            i2 |= 32;
        }
        if (t71Var instanceof ek1) {
            i2 |= 64;
        }
        if (t71Var instanceof hw0) {
            i2 |= 4194432;
        } else if (t71Var instanceof z61) {
            i2 |= 128;
        }
        if (t71Var instanceof pk0) {
            i2 |= 256;
        }
        if (t71Var instanceof cg0) {
            i2 |= 1024;
        }
        if (t71Var instanceof rh) {
            i2 |= 2048;
        }
        if (t71Var instanceof mf0) {
            i2 |= 4096;
        }
        if (t71Var instanceof vv0) {
            i2 |= 8192;
        }
        if (t71Var instanceof r4) {
            i2 |= 16384;
        }
        if (t71Var instanceof rv) {
            i2 |= 32768;
        }
        if (t71Var instanceof si2) {
            i2 |= 262144;
        }
        if (t71Var instanceof bk) {
            i2 |= 524288;
        }
        if (t71Var instanceof mp0) {
            i2 |= 2097152;
        }
        if (t71Var instanceof az0) {
            i2 |= 8388608;
        }
        l91Var.g(i2, cls);
        return i2;
    }

    public static final int f(t71 t71Var) {
        if (!(t71Var instanceof c40)) {
            return e(t71Var);
        }
        c40 c40Var = (c40) t71Var;
        int iF = c40Var.s;
        for (t71 t71Var2 = c40Var.t; t71Var2 != null; t71Var2 = t71Var2.j) {
            iF |= f(t71Var2);
        }
        return iF;
    }

    public static final boolean g(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}
