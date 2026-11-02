package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yd2 {
    public final yb a;
    public final long b;
    public final hf2 c;
    public final xf1 d;
    public final nf2 e;
    public long f;
    public final yb g;
    public final te2 h;
    public final if2 i;

    public yd2(te2 te2Var, xf1 xf1Var, if2 if2Var, nf2 nf2Var) {
        yb ybVar = te2Var.a;
        long j = te2Var.b;
        hf2 hf2Var = if2Var != null ? if2Var.a : null;
        this.a = ybVar;
        this.b = j;
        this.c = hf2Var;
        this.d = xf1Var;
        this.e = nf2Var;
        this.f = j;
        this.g = ybVar;
        this.h = te2Var;
        this.i = if2Var;
    }

    public final List a(ej0 ej0Var) {
        if (!of2.c(this.f)) {
            return vs0.v(new es("", 0), new c32(of2.f(this.f), of2.f(this.f)));
        }
        r90 r90Var = (r90) ej0Var.h(this);
        if (r90Var != null) {
            return vs0.u(r90Var);
        }
        return null;
    }

    public final Integer b() {
        hf2 hf2Var = this.c;
        if (hf2Var == null) {
            return null;
        }
        t81 t81Var = hf2Var.b;
        int iE = of2.e(this.f);
        xf1 xf1Var = this.d;
        return Integer.valueOf(xf1Var.n(t81Var.c(t81Var.d(xf1Var.r(iE)), true)));
    }

    public final Integer c() {
        hf2 hf2Var = this.c;
        if (hf2Var == null) {
            return null;
        }
        int iF = of2.f(this.f);
        xf1 xf1Var = this.d;
        return Integer.valueOf(xf1Var.n(hf2Var.f(hf2Var.b.d(xf1Var.r(iF)))));
    }

    public final Integer d() {
        int length;
        hf2 hf2Var = this.c;
        if (hf2Var == null) {
            return null;
        }
        int iR = r();
        while (true) {
            yb ybVar = this.a;
            if (iR < ybVar.f.length()) {
                int length2 = this.g.f.length() - 1;
                if (iR <= length2) {
                    length2 = iR;
                }
                long jI = hf2Var.i(length2);
                int i = of2.c;
                int i2 = (int) (jI & 4294967295L);
                if (i2 > iR) {
                    length = this.d.n(i2);
                    break;
                }
                iR++;
            } else {
                length = ybVar.f.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int iN;
        hf2 hf2Var = this.c;
        if (hf2Var == null) {
            return null;
        }
        for (int iR = r(); iR > 0; iR--) {
            int length = this.g.f.length() - 1;
            if (iR <= length) {
                length = iR;
            }
            long jI = hf2Var.i(length);
            int i = of2.c;
            int i2 = (int) (jI >> 32);
            if (i2 < iR) {
                iN = this.d.n(i2);
                return Integer.valueOf(iN);
            }
        }
        iN = 0;
        return Integer.valueOf(iN);
    }

    public final boolean f() {
        hf2 hf2Var = this.c;
        return (hf2Var != null ? hf2Var.g(r()) : null) != jt1.f;
    }

    public final int g(hf2 hf2Var, int i) {
        int iR = r();
        nf2 nf2Var = this.e;
        if (nf2Var.a == null) {
            nf2Var.a = Float.valueOf(hf2Var.c(iR).a);
        }
        t81 t81Var = hf2Var.b;
        int iD = t81Var.d(iR) + i;
        if (iD < 0) {
            return 0;
        }
        if (iD >= t81Var.f) {
            return this.g.f.length();
        }
        float fB = t81Var.b(iD) - 1.0f;
        Float f = nf2Var.a;
        f.getClass();
        float fFloatValue = f.floatValue();
        if ((f() && fFloatValue >= hf2Var.e(iD)) || (!f() && fFloatValue <= hf2Var.d(iD))) {
            return t81Var.c(iD, true);
        }
        return this.d.n(t81Var.g((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final int h(if2 if2Var, int i) {
        yr1 yr1VarK;
        jw0 jw0Var = if2Var.b;
        hf2 hf2Var = if2Var.a;
        if (jw0Var == null) {
            yr1VarK = yr1.e;
        } else {
            jw0 jw0Var2 = if2Var.c;
            yr1VarK = jw0Var2 != null ? jw0Var2.K(jw0Var, true) : null;
            if (yr1VarK == null) {
                yr1VarK = yr1.e;
            }
        }
        long j = this.h.b;
        int i2 = of2.c;
        xf1 xf1Var = this.d;
        yr1 yr1VarC = hf2Var.c(xf1Var.r((int) (j & 4294967295L)));
        float f = yr1VarC.a;
        return xf1Var.n(hf2Var.b.g((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (yr1VarK.c() & 4294967295L)) * i) + yr1VarC.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
    }

    public final void i() {
        nf2 nf2Var = this.e;
        nf2Var.a = null;
        yb ybVar = this.g;
        if (ybVar.f.length() > 0) {
            if (f()) {
                k();
                return;
            }
            nf2Var.a = null;
            if (ybVar.f.length() > 0) {
                String str = ybVar.f;
                long j = this.f;
                int i = of2.c;
                int iC = c22.c(str, (int) (j & 4294967295L));
                if (iC != -1) {
                    q(iC, iC);
                }
            }
        }
    }

    public final void j() {
        this.e.a = null;
        yb ybVar = this.g;
        String str = ybVar.f;
        String str2 = ybVar.f;
        if (str.length() > 0) {
            int iG = y12.g(str2, of2.e(this.f));
            if (iG == of2.e(this.f) && iG != str2.length()) {
                iG = y12.g(str2, iG + 1);
            }
            q(iG, iG);
        }
    }

    public final void k() {
        this.e.a = null;
        yb ybVar = this.g;
        if (ybVar.f.length() > 0) {
            String str = ybVar.f;
            long j = this.f;
            int i = of2.c;
            int iD = c22.d(str, (int) (j & 4294967295L));
            if (iD != -1) {
                q(iD, iD);
            }
        }
    }

    public final void l() {
        this.e.a = null;
        yb ybVar = this.g;
        String str = ybVar.f;
        String str2 = ybVar.f;
        if (str.length() > 0) {
            int iH = y12.h(str2, of2.f(this.f));
            if (iH == of2.f(this.f) && iH != 0) {
                iH = y12.h(str2, iH - 1);
            }
            q(iH, iH);
        }
    }

    public final void m() {
        nf2 nf2Var = this.e;
        nf2Var.a = null;
        yb ybVar = this.g;
        if (ybVar.f.length() > 0) {
            if (!f()) {
                k();
                return;
            }
            nf2Var.a = null;
            if (ybVar.f.length() > 0) {
                String str = ybVar.f;
                long j = this.f;
                int i = of2.c;
                int iC = c22.c(str, (int) (j & 4294967295L));
                if (iC != -1) {
                    q(iC, iC);
                }
            }
        }
    }

    public final void n() {
        Integer numB;
        this.e.a = null;
        if (this.g.f.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        q(iIntValue, iIntValue);
    }

    public final void o() {
        Integer numC;
        this.e.a = null;
        if (this.g.f.length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        q(iIntValue, iIntValue);
    }

    public final void p() {
        if (this.g.f.length() > 0) {
            int i = of2.c;
            this.f = j02.c((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void q(int i, int i2) {
        this.f = j02.c(i, i2);
    }

    public final int r() {
        long j = this.f;
        int i = of2.c;
        return this.d.r((int) (j & 4294967295L));
    }
}
