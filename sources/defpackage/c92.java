package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class c92 extends p61 {
    public final dv o0;
    public final yt0 p0;
    public final gr2 q0;
    public final c92[] r0;
    public final iq1 s0;
    public final eu0 t0;
    public boolean u0;
    public String v0;
    public String w0;

    public c92(dv dvVar, yt0 yt0Var, gr2 gr2Var, c92[] c92VarArr) {
        dvVar.getClass();
        this.o0 = dvVar;
        this.p0 = yt0Var;
        this.q0 = gr2Var;
        this.r0 = c92VarArr;
        this.s0 = yt0Var.b;
        this.t0 = yt0Var.a;
        int iOrdinal = gr2Var.ordinal();
        if (c92VarArr != null) {
            c92 c92Var = c92VarArr[iOrdinal];
            if (c92Var == null && c92Var == this) {
                return;
            }
            c92VarArr[iOrdinal] = this;
        }
    }

    @Override // defpackage.p61
    public final void A(char c) {
        Q(String.valueOf(c));
    }

    @Override // defpackage.p61
    public final void B(double d) {
        boolean z = this.u0;
        dv dvVar = this.o0;
        if (z) {
            Q(String.valueOf(d));
        } else {
            ((qs) dvVar.b).m(String.valueOf(d));
        }
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw ux.b(Double.valueOf(d), ((qs) dvVar.b).toString());
        }
    }

    @Override // defpackage.p61
    public final void C(s12 s12Var, int i) {
        s12Var.getClass();
        int iOrdinal = this.q0.ordinal();
        dv dvVar = this.o0;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!dvVar.a) {
                dvVar.f(',');
            }
            dvVar.b();
            return;
        }
        if (iOrdinal == 2) {
            if (dvVar.a) {
                this.u0 = true;
                dvVar.b();
                return;
            }
            if (i % 2 == 0) {
                dvVar.f(',');
                dvVar.b();
            } else {
                dvVar.f(':');
                dvVar.k();
                z = false;
            }
            this.u0 = z;
            return;
        }
        if (iOrdinal != 3) {
            if (!dvVar.a) {
                dvVar.f(',');
            }
            dvVar.b();
            ir2.w(this.p0, s12Var);
            Q(s12Var.e(i));
            dvVar.f(':');
            dvVar.k();
            return;
        }
        if (i == 0) {
            this.u0 = true;
        }
        if (i == 1) {
            dvVar.f(',');
            dvVar.k();
            this.u0 = false;
        }
    }

    @Override // defpackage.p61
    public final void D(s12 s12Var, int i) {
        s12Var.getClass();
        Q(s12Var.e(i));
    }

    @Override // defpackage.p61
    public final void E(float f) {
        boolean z = this.u0;
        dv dvVar = this.o0;
        if (z) {
            Q(String.valueOf(f));
        } else {
            ((qs) dvVar.b).m(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw ux.b(Float.valueOf(f), ((qs) dvVar.b).toString());
        }
    }

    @Override // defpackage.p61
    public final p61 F(s12 s12Var) {
        s12Var.getClass();
        boolean zA = d92.a(s12Var);
        gr2 gr2Var = this.q0;
        yt0 yt0Var = this.p0;
        dv fvVar = this.o0;
        if (zA) {
            if (!(fvVar instanceof gv)) {
                fvVar = new gv((qs) fvVar.b, this.u0);
            }
            return new c92(fvVar, yt0Var, gr2Var, null);
        }
        if (s12Var.f() && s12Var.equals(ju0.a)) {
            if (!(fvVar instanceof fv)) {
                fvVar = new fv((qs) fvVar.b, this.u0);
            }
            return new c92(fvVar, yt0Var, gr2Var, null);
        }
        if (this.v0 != null) {
            this.w0 = s12Var.b();
        }
        return this;
    }

    @Override // defpackage.p61
    public final void H(int i) {
        if (this.u0) {
            Q(String.valueOf(i));
        } else {
            this.o0.g(i);
        }
    }

    @Override // defpackage.p61
    public final void J(long j) {
        if (this.u0) {
            Q(String.valueOf(j));
        } else {
            this.o0.h(j);
        }
    }

    @Override // defpackage.p61
    public final void L() {
        dv dvVar = this.o0;
        dvVar.getClass();
        ((qs) dvVar.b).m("null");
    }

    @Override // defpackage.p61
    public final void M(s12 s12Var, int i, mv0 mv0Var, Object obj) {
        s12Var.getClass();
        if (obj != null || this.t0.c) {
            super.M(s12Var, i, mv0Var, obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    @Override // defpackage.p61
    public final void O(mv0 mv0Var, Object obj) {
        String strP;
        mv0Var.getClass();
        yt0 yt0Var = this.p0;
        boolean z = mv0Var instanceof fo1;
        zp zpVar = yt0Var.a.g;
        if (!z) {
            int iOrdinal = zpVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    y12 y12VarC = mv0Var.c().c();
                    if (ws0.j(y12VarC, q92.b) || ws0.j(y12VarC, q92.e)) {
                        strP = rw.p(yt0Var, mv0Var.c());
                    }
                } else if (iOrdinal != 2) {
                    qj.p();
                    return;
                }
            }
            strP = null;
        } else if (zpVar != zp.e) {
            strP = rw.p(yt0Var, mv0Var.c());
        } else {
            strP = null;
        }
        if (z) {
            fo1 fo1Var = (fo1) mv0Var;
            if (obj == null) {
                fu1.f(fo1Var.c(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.", "Value for serializer ");
                return;
            } else {
                ex.p(fo1Var, this, obj);
                throw null;
            }
        }
        if (strP != null) {
            String strB = mv0Var.c().b();
            this.v0 = strP;
            this.w0 = strB;
        }
        mv0Var.d(this, obj);
    }

    @Override // defpackage.p61
    public final void P(short s) {
        if (this.u0) {
            Q(String.valueOf((int) s));
        } else {
            this.o0.i(s);
        }
    }

    @Override // defpackage.p61
    public final void Q(String str) {
        str.getClass();
        this.o0.j(str);
    }

    @Override // defpackage.p61
    public final void T(s12 s12Var) {
        s12Var.getClass();
        dv dvVar = this.o0;
        dvVar.l();
        dvVar.c();
        dvVar.f(this.q0.f);
    }

    @Override // defpackage.p61
    public final iq1 Z() {
        return this.s0;
    }

    @Override // defpackage.p61
    public final boolean l0(s12 s12Var) {
        s12Var.getClass();
        return false;
    }

    @Override // defpackage.p61
    public final p61 u(s12 s12Var) {
        c92 c92Var;
        s12Var.getClass();
        yt0 yt0Var = this.p0;
        gr2 gr2VarT = j02.t(yt0Var, s12Var);
        char c = gr2VarT.e;
        dv dvVar = this.o0;
        dvVar.f(c);
        dvVar.a();
        String str = this.v0;
        if (str != null) {
            String strB = this.w0;
            if (strB == null) {
                strB = s12Var.b();
            }
            dvVar.b();
            dvVar.j(str);
            dvVar.f(':');
            dvVar.k();
            Q(strB);
            this.v0 = null;
            this.w0 = null;
        }
        if (this.q0 == gr2VarT) {
            return this;
        }
        c92[] c92VarArr = this.r0;
        return (c92VarArr == null || (c92Var = c92VarArr[gr2VarT.ordinal()]) == null) ? new c92(dvVar, yt0Var, gr2VarT, c92VarArr) : c92Var;
    }

    @Override // defpackage.p61
    public final void y(boolean z) {
        if (this.u0) {
            Q(String.valueOf(z));
        } else {
            ((qs) this.o0.b).m(String.valueOf(z));
        }
    }

    @Override // defpackage.p61
    public final void z(byte b) {
        if (this.u0) {
            Q(String.valueOf((int) b));
        } else {
            this.o0.e(b);
        }
    }
}
