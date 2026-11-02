package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cx0 implements l80 {
    public final um e = new um();
    public k80 f;

    @Override // defpackage.l80
    public final ud B() {
        return this.e.f;
    }

    @Override // defpackage.m40
    public final float H(long j) {
        return this.e.H(j);
    }

    @Override // defpackage.l80
    public final void M(g7 g7Var, long j, long j2, long j3, float f, yi yiVar, int i) {
        this.e.M(g7Var, j, j2, j3, f, yiVar, i);
    }

    @Override // defpackage.m40
    public final int O(float f) {
        return this.e.O(f);
    }

    @Override // defpackage.l80
    public final void S(long j, long j2, long j3, float f, int i) {
        this.e.S(j, j2, j3, f, i);
    }

    @Override // defpackage.l80
    public final long V() {
        return this.e.V();
    }

    @Override // defpackage.l80
    public final void W(d8 d8Var, long j, m80 m80Var) {
        this.e.W(d8Var, j, m80Var);
    }

    @Override // defpackage.m40
    public final long Y(long j) {
        return this.e.Y(j);
    }

    public final void a() {
        um umVar = this.e;
        ud udVar = umVar.f;
        sm smVarG = umVar.f.g();
        b40 b40Var = this.f;
        if (b40Var == null) {
            throw k3.g("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        t71 t71Var = (t71) b40Var;
        t71 t71VarP = t71Var.e.j;
        if (t71VarP != null && (t71VarP.h & 4) != 0) {
            while (true) {
                if (t71VarP != null) {
                    int i = t71VarP.g;
                    if ((i & 2) == 0) {
                        if ((i & 4) != 0) {
                            break;
                        } else {
                            t71VarP = t71VarP.j;
                        }
                    }
                }
                t71VarP = null;
                break;
            }
        } else {
            t71VarP = null;
            break;
        }
        if (t71VarP == null) {
            me1 me1VarT = qx.T(b40Var, 4);
            if (me1VarT.S0() == t71Var.e) {
                me1VarT = me1VarT.t;
                me1VarT.getClass();
            }
            me1VarT.h1(smVarG, (al0) udVar.c);
            return;
        }
        fa1 fa1Var = null;
        while (t71VarP != null) {
            if (t71VarP instanceof k80) {
                k80 k80Var = (k80) t71VarP;
                al0 al0Var = (al0) udVar.c;
                me1 me1VarT2 = qx.T(k80Var, 4);
                long jM = ux.M(me1VarT2.g);
                ax0 ax0Var = me1VarT2.s;
                ax0Var.getClass();
                ((e5) dx0.a(ax0Var)).getSharedDrawScope().c(smVarG, jM, me1VarT2, k80Var, al0Var);
            } else if ((t71VarP.g & 4) != 0 && (t71VarP instanceof c40)) {
                int i2 = 0;
                for (t71 t71Var2 = ((c40) t71VarP).t; t71Var2 != null; t71Var2 = t71Var2.j) {
                    if ((t71Var2.g & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
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
                if (i2 == 1) {
                }
            }
            t71VarP = qx.P(fa1Var);
        }
    }

    @Override // defpackage.m40
    public final float b() {
        return this.e.b();
    }

    @Override // defpackage.m40
    public final float b0(long j) {
        return this.e.b0(j);
    }

    public final void c(sm smVar, long j, me1 me1Var, k80 k80Var, al0 al0Var) {
        k80 k80Var2 = this.f;
        this.f = k80Var;
        kw0 kw0Var = me1Var.s.C;
        ud udVar = this.e.f;
        tm tmVar = ((um) udVar.d).e;
        m40 m40Var = tmVar.a;
        kw0 kw0Var2 = tmVar.b;
        sm smVarG = udVar.g();
        long jM = udVar.m();
        al0 al0Var2 = (al0) udVar.c;
        udVar.x(me1Var);
        udVar.y(kw0Var);
        udVar.w(smVar);
        udVar.z(j);
        udVar.c = al0Var;
        smVar.l();
        try {
            k80Var.K(this);
            smVar.i();
            udVar.x(m40Var);
            udVar.y(kw0Var2);
            udVar.w(smVarG);
            udVar.z(jM);
            udVar.c = al0Var2;
            this.f = k80Var2;
        } catch (Throwable th) {
            smVar.i();
            udVar.x(m40Var);
            udVar.y(kw0Var2);
            udVar.w(smVarG);
            udVar.z(jM);
            udVar.c = al0Var2;
            throw th;
        }
    }

    @Override // defpackage.l80
    public final long d() {
        return this.e.d();
    }

    @Override // defpackage.l80
    public final void g(d8 d8Var, rk rkVar, float f, m80 m80Var, int i) {
        this.e.g(d8Var, rkVar, f, m80Var, i);
    }

    @Override // defpackage.l80
    public final kw0 getLayoutDirection() {
        return this.e.e.b;
    }

    @Override // defpackage.l80
    public final void i0(long j, float f, long j2, m80 m80Var) {
        this.e.i0(j, f, j2, m80Var);
    }

    @Override // defpackage.m40
    public final long j0(float f) {
        return this.e.j0(f);
    }

    @Override // defpackage.m40
    public final float l() {
        return this.e.l();
    }

    @Override // defpackage.m40
    public final float n0(int i) {
        return this.e.n0(i);
    }

    @Override // defpackage.m40
    public final float q0(float f) {
        return f / this.e.b();
    }

    @Override // defpackage.l80
    public final void r0(int i, long j, long j2, long j3) {
        this.e.r0(i, j, j2, j3);
    }

    @Override // defpackage.l80
    public final void u(long j, long j2, long j3, long j4) {
        this.e.u(j, j2, j3, j4);
    }

    @Override // defpackage.m40
    public final long v(float f) {
        return this.e.v(f);
    }

    @Override // defpackage.m40
    public final long w(long j) {
        return this.e.w(j);
    }

    @Override // defpackage.m40
    public final float x(float f) {
        return this.e.b() * f;
    }
}
