package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class rh extends t71 implements sw0, k80, m02, zn1, w71, ek1, hw0, pk0, mf0, zf0, bj1, el {
    public s71 s;

    @Override // defpackage.sw0
    public final int A(x41 x41Var, r61 r61Var, int i) {
        s71 s71Var = this.s;
        s71Var.getClass();
        return ((qw0) s71Var).e(new ct0(x41Var, x41Var.getLayoutDirection()), new a30(r61Var, a71.e, b71.f, 1), tw.b(i, 0, 13)).c();
    }

    public final void F0(boolean z) {
        if (!this.r) {
            vp0.b("initializeModifier called on unattached node");
        }
        s71 s71Var = this.s;
        if ((this.g & 4) != 0 && !z) {
            qx.T(this, 2).Z0();
        }
        if ((this.g & 2) != 0) {
            sb2 sb2Var = qx.V(this).I.e;
            sb2Var.getClass();
            if (sb2Var.s) {
                me1 me1Var = this.l;
                me1Var.getClass();
                ((uw0) me1Var).u1(this);
                zi1 zi1Var = me1Var.P;
                if (zi1Var != null) {
                    ((dl0) zi1Var).c();
                }
            }
            if (!z) {
                qx.T(this, 2).Z0();
                qx.V(this).E();
            }
        }
        if (s71Var instanceof py0) {
            py0 py0Var = (py0) s71Var;
            ax0 ax0VarV = qx.V(this);
            switch (py0Var.a) {
                case 0:
                    ((ry0) py0Var.b).j = ax0VarV;
                    break;
                default:
                    ((q01) py0Var.b).k = ax0VarV;
                    break;
            }
        }
        if ((this.g & 8) != 0) {
            ((e5) qx.W(this)).B();
        }
    }

    @Override // defpackage.zn1
    public final void G(pn1 pn1Var, qn1 qn1Var, long j) {
        this.s.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.k80
    public final void K(cx0 cx0Var) {
        s71 s71Var = this.s;
        s71Var.getClass();
        cx0Var.a();
    }

    @Override // defpackage.sw0
    public final int P(x41 x41Var, r61 r61Var, int i) {
        s71 s71Var = this.s;
        s71Var.getClass();
        return ((qw0) s71Var).e(new ct0(x41Var, x41Var.getLayoutDirection()), new a30(r61Var, a71.e, b71.e, 1), tw.b(0, i, 7)).e();
    }

    @Override // defpackage.mf0
    public final void U(bg0 bg0Var) {
        s71 s71Var = this.s;
        vp0.b("onFocusEvent called on wrong node");
        s71Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.zn1
    public final boolean X() {
        this.s.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.el
    public final m40 b() {
        return qx.V(this).B;
    }

    @Override // defpackage.el
    public final long d() {
        return ux.M(qx.T(this, 128).g);
    }

    @Override // defpackage.sw0
    public final x61 e(y61 y61Var, r61 r61Var, long j) {
        s71 s71Var = this.s;
        s71Var.getClass();
        return ((qw0) s71Var).e(y61Var, r61Var, j);
    }

    @Override // defpackage.m02
    public final void e0(z02 z02Var) {
        s71 s71Var = this.s;
        s71Var.getClass();
        i02 i02VarD = ((k02) s71Var).d();
        z02Var.getClass();
        i02 i02Var = (i02) z02Var;
        w91 w91Var = i02Var.e;
        if (i02VarD.g) {
            i02Var.g = true;
        }
        if (i02VarD.h) {
            i02Var.h = true;
        }
        w91 w91Var2 = i02VarD.e;
        Object[] objArr = w91Var2.b;
        Object[] objArr2 = w91Var2.c;
        long[] jArr = w91Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        y02 y02Var = (y02) obj;
                        if (!w91Var.b(y02Var)) {
                            w91Var.m(y02Var, obj2);
                        } else if (obj2 instanceof p0) {
                            Object objG = w91Var.g(y02Var);
                            objG.getClass();
                            p0 p0Var = (p0) objG;
                            String str = p0Var.a;
                            if (str == null) {
                                str = ((p0) obj2).a;
                            }
                            qj0 qj0Var = p0Var.b;
                            if (qj0Var == null) {
                                qj0Var = ((p0) obj2).b;
                            }
                            w91Var.m(y02Var, new p0(str, qj0Var));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.sw0
    public final int f(x41 x41Var, r61 r61Var, int i) {
        s71 s71Var = this.s;
        s71Var.getClass();
        return ((qw0) s71Var).e(new ct0(x41Var, x41Var.getLayoutDirection()), new a30(r61Var, a71.f, b71.e, 1), tw.b(0, i, 7)).e();
    }

    @Override // defpackage.zn1
    public final void f0() {
        this.s.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.el
    public final kw0 getLayoutDirection() {
        return qx.V(this).C;
    }

    @Override // defpackage.w71
    public final q90 j() {
        return q90.I;
    }

    @Override // defpackage.ek1
    public final Object k0(Object obj) {
        s71 s71Var = this.s;
        s71Var.getClass();
        return (va) s71Var;
    }

    @Override // defpackage.k80
    public final void l0() {
        vv.B(this);
    }

    @Override // defpackage.zn1
    public final boolean m0() {
        this.s.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.sw0
    public final int n(x41 x41Var, r61 r61Var, int i) {
        s71 s71Var = this.s;
        s71Var.getClass();
        return ((qw0) s71Var).e(new ct0(x41Var, x41Var.getLayoutDirection()), new a30(r61Var, a71.f, b71.f, 1), tw.b(i, 0, 13)).c();
    }

    @Override // defpackage.pk0
    public final void t(me1 me1Var) {
        this.s.getClass();
        throw new ClassCastException();
    }

    public final String toString() {
        return this.s.toString();
    }

    @Override // defpackage.t71
    public final void x0() {
        F0(true);
    }

    @Override // defpackage.bj1
    public final boolean y() {
        return this.r;
    }

    @Override // defpackage.t71
    public final void y0() {
        if (!this.r) {
            vp0.b("unInitializeModifier called on unattached node");
        }
        if ((this.g & 8) != 0) {
            ((e5) qx.W(this)).B();
        }
    }

    @Override // defpackage.b40, defpackage.zn1
    public final void a() {
    }

    @Override // defpackage.hw0, defpackage.z61
    public final void c(long j) {
    }

    @Override // defpackage.hw0
    public final void o(jw0 jw0Var) {
    }
}
