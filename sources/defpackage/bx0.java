package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bx0 {
    public final z3 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public z3 h;
    public final /* synthetic */ int j;
    public boolean b = true;
    public final HashMap i = new HashMap();

    public bx0(z3 z3Var, int i) {
        this.j = i;
        this.a = z3Var;
    }

    public final void a(u3 u3Var, int i, me1 me1Var) {
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        while (true) {
            long jI = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (this.j) {
                    case 0:
                        zi1 zi1Var = me1Var.P;
                        if (zi1Var != null) {
                            dl0 dl0Var = (dl0) zi1Var;
                            float[] fArrB = dl0Var.b();
                            if (!dl0Var.w) {
                                jI = q61.b(jI, fArrB);
                            }
                        }
                        jI = mx.I(jI, me1Var.D);
                        break;
                    default:
                        z41 z41VarQ0 = me1Var.Q0();
                        z41VarQ0.getClass();
                        long j = z41VarQ0.t;
                        jI = uf1.e((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32), jI);
                        break;
                }
                me1Var = me1Var.u;
                me1Var.getClass();
                if (me1Var.equals(this.a.o())) {
                    int iRound = Math.round(u3Var instanceof on0 ? Float.intBitsToFloat((int) (jI & 4294967295L)) : Float.intBitsToFloat((int) (jI >> 32)));
                    HashMap map = this.i;
                    if (map.containsKey(u3Var)) {
                        int iIntValue = ((Number) h61.d0(u3Var, map)).intValue();
                        on0 on0Var = x3.a;
                        iRound = ((Number) u3Var.a.g(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(u3Var, Integer.valueOf(iRound));
                    return;
                }
            } while (!b(me1Var).containsKey(u3Var));
            float fC = c(me1Var, u3Var);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(me1 me1Var) {
        switch (this.j) {
            case 0:
                return me1Var.A0().a();
            default:
                z41 z41VarQ0 = me1Var.Q0();
                z41VarQ0.getClass();
                return z41VarQ0.A0().a();
        }
    }

    public final int c(me1 me1Var, u3 u3Var) {
        switch (this.j) {
            case 0:
                return me1Var.f0(u3Var);
            default:
                z41 z41VarQ0 = me1Var.Q0();
                z41VarQ0.getClass();
                return z41VarQ0.f0(u3Var);
        }
    }

    public final boolean d() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean e() {
        h();
        return this.h != null;
    }

    public final void f() {
        this.b = true;
        z3 z3Var = this.a;
        z3 z3VarP = z3Var.p();
        if (z3VarP == null) {
            return;
        }
        if (this.c) {
            z3VarP.Z();
        } else if (this.e || this.d) {
            z3VarP.requestLayout();
        }
        if (this.f) {
            z3Var.Z();
        }
        if (this.g) {
            z3Var.requestLayout();
        }
        z3VarP.a().f();
    }

    public final void g() {
        HashMap map = this.i;
        map.clear();
        y3 y3Var = new y3(0, this);
        z3 z3Var = this.a;
        z3Var.m(y3Var);
        map.putAll(b(z3Var.o()));
        this.b = false;
    }

    public final void h() {
        bx0 bx0VarA;
        bx0 bx0VarA2;
        boolean zD = d();
        z3 z3Var = this.a;
        if (!zD) {
            z3 z3VarP = z3Var.p();
            if (z3VarP == null) {
                return;
            }
            z3Var = z3VarP.a().h;
            if (z3Var == null || !z3Var.a().d()) {
                z3 z3Var2 = this.h;
                if (z3Var2 == null || z3Var2.a().d()) {
                    return;
                }
                z3 z3VarP2 = z3Var2.p();
                if (z3VarP2 != null && (bx0VarA2 = z3VarP2.a()) != null) {
                    bx0VarA2.h();
                }
                z3 z3VarP3 = z3Var2.p();
                z3Var = (z3VarP3 == null || (bx0VarA = z3VarP3.a()) == null) ? null : bx0VarA.h;
            }
        }
        this.h = z3Var;
    }
}
