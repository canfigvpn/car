package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.ViewParent;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class me1 extends x41 implements r61, jw0, bj1 {
    public static final bu1 Q = new bu1();
    public static final gw0 R = new gw0();
    public static final float[] S = q61.a();
    public static final ie1 T = new ie1();
    public static final w40 U = new w40(20);
    public x61 B;
    public l91 C;
    public float E;
    public v91 F;
    public gw0 G;
    public boolean I;
    public boolean J;
    public al0 K;
    public sm L;
    public z5 M;
    public boolean O;
    public zi1 P;
    public final ax0 s;
    public me1 t;
    public me1 u;
    public boolean v;
    public boolean w;
    public ej0 x;
    public m40 y;
    public kw0 z;
    public float A = 0.8f;
    public long D = 0;
    public u32 H = vs0.C;
    public final le1 N = new le1(this, 1);

    public me1(ax0 ax0Var) {
        this.s = ax0Var;
        this.y = ax0Var.B;
        this.z = ax0Var.C;
    }

    public static me1 n1(jw0 jw0Var) {
        me1 me1Var;
        a51 a51Var = jw0Var instanceof a51 ? (a51) jw0Var : null;
        if (a51Var != null && (me1Var = a51Var.e.s) != null) {
            return me1Var;
        }
        jw0Var.getClass();
        return (me1) jw0Var;
    }

    @Override // defpackage.jw0
    public final boolean A() {
        return S0().r;
    }

    @Override // defpackage.x41
    public final x61 A0() {
        x61 x61Var = this.B;
        if (x61Var != null) {
            return x61Var;
        }
        fu1.h("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // defpackage.x41
    public final x41 B0() {
        return this.u;
    }

    @Override // defpackage.x41
    public final long C0() {
        return this.D;
    }

    @Override // defpackage.jw0
    public final void D(float[] fArr) {
        aj1 aj1VarA = dx0.a(this.s);
        me1 me1VarN1 = n1(sv.A(this));
        q1(me1VarN1, fArr);
        if (aj1VarA instanceof e5) {
            ((e5) aj1VarA).t(fArr);
            return;
        }
        long jC = me1VarN1.c(0L);
        if ((9223372034707292159L & jC) != 9205357640488583168L) {
            q61.f(fArr, Float.intBitsToFloat((int) (jC >> 32)), Float.intBitsToFloat((int) (jC & 4294967295L)));
        }
    }

    @Override // defpackage.jw0
    public final long G(jw0 jw0Var, long j) {
        if (jw0Var instanceof a51) {
            a51 a51Var = (a51) jw0Var;
            a51Var.e.s.b1();
            return a51Var.G(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        me1 me1VarN1 = n1(jw0Var);
        me1VarN1.b1();
        me1 me1VarO0 = O0(me1VarN1);
        while (me1VarN1 != me1VarO0) {
            zi1 zi1Var = me1VarN1.P;
            if (zi1Var != null) {
                dl0 dl0Var = (dl0) zi1Var;
                float[] fArrB = dl0Var.b();
                if (!dl0Var.w) {
                    j = q61.b(j, fArrB);
                }
            }
            j = mx.I(j, me1VarN1.D);
            me1VarN1 = me1VarN1.u;
            me1VarN1.getClass();
        }
        return I0(me1VarO0, j);
    }

    @Override // defpackage.x41
    public final void G0() {
        l0(this.D, this.E, this.x);
    }

    public final void H0(me1 me1Var, v91 v91Var, boolean z) {
        if (me1Var == this) {
            return;
        }
        me1 me1Var2 = this.u;
        if (me1Var2 != null) {
            me1Var2.H0(me1Var, v91Var, z);
        }
        long j = this.D;
        float f = (int) (j >> 32);
        v91Var.a -= f;
        v91Var.c -= f;
        float f2 = (int) (j & 4294967295L);
        v91Var.b -= f2;
        v91Var.d -= f2;
        zi1 zi1Var = this.P;
        if (zi1Var != null) {
            dl0 dl0Var = (dl0) zi1Var;
            float[] fArrA = dl0Var.a();
            if (!dl0Var.w) {
                if (fArrA == null) {
                    v91Var.a = 0.0f;
                    v91Var.b = 0.0f;
                    v91Var.c = 0.0f;
                    v91Var.d = 0.0f;
                } else {
                    q61.c(fArrA, v91Var);
                }
            }
            if (this.w && z) {
                long j2 = this.g;
                v91Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    @Override // defpackage.jw0
    public final void I(jw0 jw0Var, float[] fArr) {
        me1 me1VarN1 = n1(jw0Var);
        me1VarN1.b1();
        me1 me1VarO0 = O0(me1VarN1);
        q61.d(fArr);
        me1VarN1.q1(me1VarO0, fArr);
        p1(me1VarO0, fArr);
    }

    public final long I0(me1 me1Var, long j) {
        if (me1Var == this) {
            return j;
        }
        me1 me1Var2 = this.u;
        return (me1Var2 == null || ws0.j(me1Var, me1Var2)) ? P0(j) : P0(me1Var2.I0(me1Var, j));
    }

    public final long J0(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - h0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - g0();
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L);
    }

    @Override // defpackage.jw0
    public final yr1 K(jw0 jw0Var, boolean z) {
        if (!S0().r) {
            vp0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!jw0Var.A()) {
            vp0.b("LayoutCoordinates " + jw0Var + " is not attached!");
        }
        me1 me1VarN1 = n1(jw0Var);
        me1VarN1.b1();
        me1 me1VarO0 = O0(me1VarN1);
        v91 v91Var = this.F;
        if (v91Var == null) {
            v91Var = new v91();
            this.F = v91Var;
        }
        v91Var.a = 0.0f;
        v91Var.b = 0.0f;
        v91Var.c = (int) (jw0Var.P() >> 32);
        v91Var.d = (int) (jw0Var.P() & 4294967295L);
        while (me1VarN1 != me1VarO0) {
            me1VarN1.j1(v91Var, z, false);
            if (v91Var.b()) {
                return yr1.e;
            }
            me1VarN1 = me1VarN1.u;
            me1VarN1.getClass();
        }
        H0(me1VarO0, v91Var, z);
        return new yr1(v91Var.a, v91Var.b, v91Var.c, v91Var.d);
    }

    public final float K0(long j, long j2) {
        if (h0() >= Float.intBitsToFloat((int) (j2 >> 32)) && g0() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jJ0 = J0(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jJ0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jJ0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - h0());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - g0()))) & 4294967295L);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= fIntBitsToFloat) {
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void L0(sm smVar, al0 al0Var) {
        float f;
        zi1 zi1Var = this.P;
        if (zi1Var == null) {
            long j = this.D;
            float f2 = (int) (j >> 32);
            float f3 = (int) (j & 4294967295L);
            smVar.f(f2, f3);
            M0(smVar, al0Var);
            smVar.f(-f2, -f3);
            return;
        }
        dl0 dl0Var = (dl0) zi1Var;
        um umVar = dl0Var.q;
        dl0Var.g();
        boolean z = false;
        dl0Var.x = dl0Var.e.a.G() > 0.0f;
        ud udVar = umVar.f;
        udVar.w(smVar);
        udVar.c = al0Var;
        al0 al0Var2 = dl0Var.e;
        sm smVarG = umVar.B().g();
        al0 al0Var3 = (al0) umVar.B().c;
        cl0 cl0Var = al0Var2.a;
        if (al0Var2.s) {
            return;
        }
        al0Var2.a();
        if (!cl0Var.H()) {
            try {
                al0Var2.a.x(al0Var2.b, al0Var2.c, al0Var2, al0Var2.e);
            } catch (Throwable unused) {
            }
        }
        boolean z2 = cl0Var.G() > 0.0f;
        if (z2) {
            smVarG.r();
        }
        Canvas canvasA = k4.a(smVarG);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j2 = al0Var2.t;
            float f4 = (int) (j2 >> 32);
            float f5 = (int) (j2 & 4294967295L);
            long j3 = al0Var2.u;
            float f6 = ((int) (j3 >> 32)) + f4;
            float f7 = f5 + ((int) (j3 & 4294967295L));
            float fA = cl0Var.a();
            yi yiVarY = cl0Var.y();
            int iK = cl0Var.K();
            if (fA < 1.0f || iK != 3 || yiVarY != null || cl0Var.v() == 1) {
                v7 v7VarC = al0Var2.p;
                if (v7VarC == null) {
                    v7VarC = vs0.c();
                    al0Var2.p = v7VarC;
                }
                v7VarC.c(fA);
                v7VarC.d(iK);
                v7VarC.f(yiVarY);
                f = f4;
                canvasA.saveLayer(f, f5, f6, f7, (Paint) v7VarC.b);
            } else {
                canvasA.save();
                f = f4;
            }
            canvasA.translate(f, f5);
            canvasA.concat(cl0Var.C());
        }
        boolean z3 = !zIsHardwareAccelerated && al0Var2.w;
        if (z3) {
            smVarG.l();
            mx mxVarD = al0Var2.d();
            if (mxVarD instanceof hi1) {
                sm.k(smVarG, ((hi1) mxVarD).i);
            } else if (mxVarD instanceof ii1) {
                d8 d8VarA = al0Var2.m;
                if (d8VarA != null) {
                    d8VarA.a.rewind();
                } else {
                    d8VarA = f8.a();
                    al0Var2.m = d8VarA;
                }
                d8.b(d8VarA, ((ii1) mxVarD).i);
                smVarG.s(d8VarA);
            } else {
                if (!(mxVarD instanceof gi1)) {
                    qj.p();
                    return;
                }
                smVarG.s(((gi1) mxVarD).i);
            }
        }
        if (al0Var3 != null) {
            jp jpVar = al0Var3.r;
            if (!jpVar.a) {
                up0.a("Only add dependencies during a tracking");
            }
            x91 x91Var = (x91) jpVar.d;
            if (x91Var != null) {
                x91Var.a(al0Var2);
            } else if (((al0) jpVar.b) != null) {
                x91 x91Var2 = kx1.a;
                x91 x91Var3 = new x91();
                al0 al0Var4 = (al0) jpVar.b;
                al0Var4.getClass();
                x91Var3.a(al0Var4);
                x91Var3.a(al0Var2);
                jpVar.d = x91Var3;
                jpVar.b = null;
            } else {
                jpVar.b = al0Var2;
            }
            x91 x91Var4 = (x91) jpVar.e;
            if (x91Var4 != null) {
                z = !x91Var4.l(al0Var2);
            } else if (((al0) jpVar.c) != al0Var2) {
                z = true;
            } else {
                jpVar.c = null;
            }
            if (z) {
                al0Var2.q++;
            }
        }
        if (((j4) smVarG).a.isHardwareAccelerated()) {
            cl0Var.t(smVarG);
        } else {
            um umVar2 = al0Var2.o;
            if (umVar2 == null) {
                umVar2 = new um();
                al0Var2.o = umVar2;
            }
            ud udVar2 = umVar2.f;
            m40 m40Var = al0Var2.b;
            kw0 kw0Var = al0Var2.c;
            long jM = ux.M(al0Var2.u);
            tm tmVar = ((um) udVar2.d).e;
            m40 m40Var2 = tmVar.a;
            kw0 kw0Var2 = tmVar.b;
            sm smVarG2 = udVar2.g();
            long jM2 = udVar2.m();
            al0 al0Var5 = (al0) udVar2.c;
            udVar2.x(m40Var);
            udVar2.y(kw0Var);
            udVar2.w(smVarG);
            udVar2.z(jM);
            udVar2.c = al0Var2;
            smVarG.l();
            try {
                al0Var2.c(umVar2);
                smVarG.i();
                udVar2.x(m40Var2);
                udVar2.y(kw0Var2);
                udVar2.w(smVarG2);
                udVar2.z(jM2);
                udVar2.c = al0Var5;
            } catch (Throwable th) {
                smVarG.i();
                udVar2.x(m40Var2);
                udVar2.y(kw0Var2);
                udVar2.w(smVarG2);
                udVar2.z(jM2);
                udVar2.c = al0Var5;
                throw th;
            }
        }
        if (z3) {
            smVarG.i();
        }
        if (z2) {
            smVarG.n();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasA.restore();
    }

    public final void M0(sm smVar, al0 al0Var) {
        me1 me1Var;
        sm smVar2;
        al0 al0Var2;
        t71 t71VarT0 = T0(4);
        if (t71VarT0 == null) {
            h1(smVar, al0Var);
            return;
        }
        ax0 ax0Var = this.s;
        ax0Var.getClass();
        cx0 sharedDrawScope = ((e5) dx0.a(ax0Var)).getSharedDrawScope();
        long jM = ux.M(this.g);
        sharedDrawScope.getClass();
        fa1 fa1Var = null;
        while (t71VarT0 != null) {
            if (t71VarT0 instanceof k80) {
                me1Var = this;
                smVar2 = smVar;
                al0Var2 = al0Var;
                sharedDrawScope.c(smVar2, jM, me1Var, (k80) t71VarT0, al0Var2);
            } else {
                me1Var = this;
                smVar2 = smVar;
                al0Var2 = al0Var;
                if ((t71VarT0.g & 4) != 0 && (t71VarT0 instanceof c40)) {
                    int i = 0;
                    for (t71 t71Var = ((c40) t71VarT0).t; t71Var != null; t71Var = t71Var.j) {
                        if ((t71Var.g & 4) != 0) {
                            i++;
                            if (i == 1) {
                                t71VarT0 = t71Var;
                            } else {
                                if (fa1Var == null) {
                                    fa1Var = new fa1(new t71[16]);
                                }
                                if (t71VarT0 != null) {
                                    fa1Var.b(t71VarT0);
                                    t71VarT0 = null;
                                }
                                fa1Var.b(t71Var);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                smVar = smVar2;
                this = me1Var;
                al0Var = al0Var2;
            }
            t71VarT0 = qx.P(fa1Var);
            smVar = smVar2;
            this = me1Var;
            al0Var = al0Var2;
        }
    }

    public abstract void N0();

    public final me1 O0(me1 me1Var) {
        ax0 ax0VarU = me1Var.s;
        ax0 ax0Var = this.s;
        if (ax0VarU == ax0Var) {
            t71 t71VarS0 = me1Var.S0();
            t71 t71VarS1 = S0();
            if (!t71VarS1.e.r) {
                vp0.b("visitLocalAncestors called on an unattached node");
            }
            for (t71 t71Var = t71VarS1.e.i; t71Var != null; t71Var = t71Var.i) {
                if ((t71Var.g & 2) != 0 && t71Var == t71VarS0) {
                    return me1Var;
                }
            }
            return this;
        }
        while (ax0VarU.s > ax0Var.s) {
            ax0VarU = ax0VarU.u();
            ax0VarU.getClass();
        }
        ax0 ax0VarU2 = ax0Var;
        while (ax0VarU2.s > ax0VarU.s) {
            ax0VarU2 = ax0VarU2.u();
            ax0VarU2.getClass();
        }
        while (ax0VarU != ax0VarU2) {
            ax0VarU = ax0VarU.u();
            ax0VarU2 = ax0VarU2.u();
            if (ax0VarU == null || ax0VarU2 == null) {
                qj.r("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (ax0VarU2 != ax0Var) {
            if (ax0VarU != me1Var.s) {
                return ax0VarU.I.c;
            }
            return me1Var;
        }
        return this;
    }

    @Override // defpackage.jw0
    public final long P() {
        return this.g;
    }

    public final long P0(long j) {
        long j2 = this.D;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        zi1 zi1Var = this.P;
        if (zi1Var != null) {
            dl0 dl0Var = (dl0) zi1Var;
            float[] fArrA = dl0Var.a();
            if (fArrA == null) {
                return 9187343241974906880L;
            }
            if (!dl0Var.w) {
                return q61.b(jFloatToRawIntBits, fArrA);
            }
        }
        return jFloatToRawIntBits;
    }

    public abstract z41 Q0();

    @Override // defpackage.jw0
    public final long R(long j) {
        if (!S0().r) {
            vp0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        b1();
        while (this != null) {
            ax0 ax0Var = this.s;
            if (this == ax0Var.I.d && !ax0Var.g) {
                long jB = ((e5) dx0.a(ax0Var)).getRectManager().b(ax0Var);
                if (!ir0.a(jB, 9223372034707292159L)) {
                    return mx.I(j, jB);
                }
            }
            zi1 zi1Var = this.P;
            if (zi1Var != null) {
                dl0 dl0Var = (dl0) zi1Var;
                float[] fArrB = dl0Var.b();
                if (!dl0Var.w) {
                    j = q61.b(j, fArrB);
                }
            }
            j = mx.I(j, this.D);
            this = this.u;
        }
        return j;
    }

    public final long R0() {
        return this.y.Y(this.s.D.g());
    }

    public abstract t71 S0();

    public final t71 T0(int i) {
        boolean zG = ne1.g(i);
        t71 t71VarS0 = S0();
        if (!zG && (t71VarS0 = t71VarS0.i) == null) {
            return null;
        }
        for (t71 t71VarU0 = U0(zG); t71VarU0 != null && (t71VarU0.h & i) != 0; t71VarU0 = t71VarU0.j) {
            if ((t71VarU0.g & i) != 0) {
                return t71VarU0;
            }
            if (t71VarU0 == t71VarS0) {
                return null;
            }
        }
        return null;
    }

    public final t71 U0(boolean z) {
        t71 t71VarS0;
        he1 he1Var = this.s.I;
        if (he1Var.d == this) {
            return he1Var.f;
        }
        me1 me1Var = this.u;
        if (!z) {
            if (me1Var != null) {
                return me1Var.S0();
            }
            return null;
        }
        if (me1Var == null || (t71VarS0 = me1Var.S0()) == null) {
            return null;
        }
        return t71VarS0.j;
    }

    public final void V0(t71 t71Var, ke1 ke1Var, long j, vm0 vm0Var, int i, boolean z) {
        if (t71Var == null) {
            Y0(ke1Var, j, vm0Var, i, z);
            return;
        }
        if (!ke1Var.c(t71Var)) {
            V0(ei1.D(t71Var, ke1Var.b()), ke1Var, j, vm0Var, i, z);
            return;
        }
        int i2 = vm0Var.g;
        p91 p91Var = vm0Var.e;
        vm0Var.b(i2 + 1, p91Var.b);
        vm0Var.g++;
        p91Var.a(t71Var);
        vm0Var.f.a(ex.a(-1.0f, z, false));
        V0(ei1.D(t71Var, ke1Var.b()), ke1Var, j, vm0Var, i, z);
        vm0Var.g = i2;
    }

    public final void W0(t71 t71Var, ke1 ke1Var, long j, vm0 vm0Var, int i, boolean z, float f) {
        if (t71Var == null) {
            Y0(ke1Var, j, vm0Var, i, z);
            return;
        }
        if (!ke1Var.c(t71Var)) {
            W0(ei1.D(t71Var, ke1Var.b()), ke1Var, j, vm0Var, i, z, f);
            return;
        }
        int i2 = vm0Var.g;
        p91 p91Var = vm0Var.e;
        vm0Var.b(i2 + 1, p91Var.b);
        vm0Var.g++;
        p91Var.a(t71Var);
        vm0Var.f.a(ex.a(f, z, false));
        g1(ei1.D(t71Var, ke1Var.b()), ke1Var, j, vm0Var, i, z, f, true);
        vm0Var.g = i2;
    }

    public final void X0(ke1 ke1Var, long j, vm0 vm0Var, int i, boolean z) {
        boolean z2;
        p91 p91Var = vm0Var.e;
        t71 t71VarT0 = T0(ke1Var.b());
        boolean z3 = false;
        if (!t1(j)) {
            if (i == 1) {
                float fK0 = K0(j, R0());
                if ((Float.floatToRawIntBits(fK0) & Integer.MAX_VALUE) < 2139095040) {
                    if (vm0Var.g != p91Var.b - 1) {
                        if (ei1.j(vm0Var.a(), ex.a(fK0, false, false)) <= 0) {
                            return;
                        }
                    }
                    W0(t71VarT0, ke1Var, j, vm0Var, i, false, fK0);
                    return;
                }
                return;
            }
            return;
        }
        if (t71VarT0 == null) {
            Y0(ke1Var, j, vm0Var, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < h0() && fIntBitsToFloat2 < g0()) {
            V0(t71VarT0, ke1Var, j, vm0Var, i, z);
            return;
        }
        float fK1 = i == 1 ? K0(j, R0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fK1) & Integer.MAX_VALUE) < 2139095040) {
            if (vm0Var.g == p91Var.b - 1) {
                z2 = z;
            } else {
                z2 = z;
                if (ei1.j(vm0Var.a(), ex.a(fK1, z2, false)) > 0) {
                }
            }
            z3 = true;
        } else {
            z2 = z;
        }
        g1(t71VarT0, ke1Var, j, vm0Var, i, z2, fK1, z3);
    }

    public void Y0(ke1 ke1Var, long j, vm0 vm0Var, int i, boolean z) {
        me1 me1Var = this.t;
        if (me1Var != null) {
            me1Var.X0(ke1Var, me1Var.P0(j), vm0Var, i, z);
        }
    }

    public final void Z0() {
        zi1 zi1Var = this.P;
        if (zi1Var != null) {
            ((dl0) zi1Var).c();
            return;
        }
        me1 me1Var = this.u;
        if (me1Var != null) {
            me1Var.Z0();
        }
    }

    public final boolean a1() {
        if (this.P != null && this.A <= 0.0f) {
            return true;
        }
        me1 me1Var = this.u;
        if (me1Var != null) {
            return me1Var.a1();
        }
        return false;
    }

    @Override // defpackage.m40
    public final float b() {
        return this.s.B.b();
    }

    public final void b1() {
        this.s.J.b();
    }

    @Override // defpackage.jw0
    public final long c(long j) {
        if (!S0().r) {
            vp0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((e5) dx0.a(this.s)).u(R(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [t71] */
    /* JADX WARN: Type inference failed for: r7v7, types: [t71] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [fa1] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [fa1] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void c1() {
        t71 t71VarS0;
        boolean zG = ne1.g(128);
        t71 t71VarU0 = U0(zG);
        if (t71VarU0 == null || (t71VarU0.e.h & 128) == 0) {
            return;
        }
        o62 o62VarJ = c12.j();
        ej0 ej0VarE = o62VarJ != null ? o62VarJ.e() : null;
        o62 o62VarP = c12.p(o62VarJ);
        try {
            if (!zG) {
                t71VarS0 = S0().i;
                if (t71VarS0 == null) {
                }
                c12.s(o62VarJ, o62VarP, ej0VarE);
            }
            t71VarS0 = S0();
            for (t71 t71VarU1 = U0(zG); t71VarU1 != null && (t71VarU1.h & 128) != 0; t71VarU1 = t71VarU1.j) {
                if ((t71VarU1.g & 128) != 0) {
                    ?? P = t71VarU1;
                    ?? fa1Var = 0;
                    while (P != 0) {
                        if (P instanceof z61) {
                            ((z61) P).c(this.g);
                        } else if ((P.g & 128) != 0 && (P instanceof c40)) {
                            t71 t71Var = ((c40) P).t;
                            int i = 0;
                            P = P;
                            fa1Var = fa1Var;
                            while (t71Var != null) {
                                if ((t71Var.g & 128) != 0) {
                                    i++;
                                    if (i == 1) {
                                        fa1Var = fa1Var;
                                        P = t71Var;
                                    } else {
                                        if (fa1Var == 0) {
                                            fa1Var = new fa1(new t71[16]);
                                        }
                                        if (P != 0) {
                                            fa1Var.b(P);
                                            P = 0;
                                        }
                                        fa1Var.b(t71Var);
                                    }
                                }
                                t71Var = t71Var.j;
                                P = P;
                                fa1Var = fa1Var;
                            }
                            if (i == 1) {
                            }
                        }
                        P = qx.P(fa1Var);
                    }
                }
                if (t71VarU1 == t71VarS0) {
                    break;
                }
            }
            c12.s(o62VarJ, o62VarP, ej0VarE);
        } catch (Throwable th) {
            c12.s(o62VarJ, o62VarP, ej0VarE);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [t71] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [t71] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [fa1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [fa1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void d1() {
        boolean zG = ne1.g(4194304);
        t71 t71VarS0 = S0();
        if (!zG && (t71VarS0 = t71VarS0.i) == null) {
            return;
        }
        for (t71 t71VarU0 = U0(zG); t71VarU0 != null && (t71VarU0.h & 4194304) != 0; t71VarU0 = t71VarU0.j) {
            if ((t71VarU0.g & 4194304) != 0) {
                ?? P = t71VarU0;
                ?? fa1Var = 0;
                while (P != 0) {
                    if (P instanceof hw0) {
                        ((hw0) P).o(this);
                    } else if ((P.g & 4194304) != 0 && (P instanceof c40)) {
                        t71 t71Var = ((c40) P).t;
                        int i = 0;
                        P = P;
                        fa1Var = fa1Var;
                        while (t71Var != null) {
                            if ((t71Var.g & 4194304) != 0) {
                                i++;
                                if (i == 1) {
                                    fa1Var = fa1Var;
                                    P = t71Var;
                                } else {
                                    if (fa1Var == 0) {
                                        fa1Var = new fa1(new t71[16]);
                                    }
                                    if (P != 0) {
                                        fa1Var.b(P);
                                        P = 0;
                                    }
                                    fa1Var.b(t71Var);
                                }
                            }
                            t71Var = t71Var.j;
                            P = P;
                            fa1Var = fa1Var;
                        }
                        if (i == 1) {
                        }
                    }
                    P = qx.P(fa1Var);
                }
            }
            if (t71VarU0 == t71VarS0) {
                return;
            }
        }
    }

    public final void e1() {
        this.v = true;
        this.N.a();
        k1();
        if (ir0.a(this.D, 0L)) {
            return;
        }
        this.s.N(this);
    }

    public final void f1() {
        boolean zG = ne1.g(1048576);
        t71 t71VarU0 = U0(zG);
        if (t71VarU0 == null || (t71VarU0.e.h & 1048576) == 0) {
            return;
        }
        t71 t71VarS0 = S0();
        if (!zG && (t71VarS0 = t71VarS0.i) == null) {
            return;
        }
        for (t71 t71VarU1 = U0(zG); t71VarU1 != null && (t71VarU1.h & 1048576) != 0; t71VarU1 = t71VarU1.j) {
            if ((t71VarU1.g & 1048576) != 0) {
                t71 t71VarP = t71VarU1;
                fa1 fa1Var = null;
                while (t71VarP != null) {
                    if ((t71VarP.g & 1048576) != 0 && (t71VarP instanceof c40)) {
                        int i = 0;
                        for (t71 t71Var = ((c40) t71VarP).t; t71Var != null; t71Var = t71Var.j) {
                            if ((t71Var.g & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    t71VarP = t71Var;
                                } else {
                                    if (fa1Var == null) {
                                        fa1Var = new fa1(new t71[16]);
                                    }
                                    if (t71VarP != null) {
                                        fa1Var.b(t71VarP);
                                        t71VarP = null;
                                    }
                                    fa1Var.b(t71Var);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    t71VarP = qx.P(fa1Var);
                }
            }
            if (t71VarU1 == t71VarS0) {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01d7 A[PHI: r3
  0x01d7: PHI (r3v18 ??) = (r3v1 ??), (r3v1 ??), (r3v20 ??) binds: [B:58:0x01a1, B:60:0x01a5, B:74:0x01cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [t71] */
    /* JADX WARN: Type inference failed for: r2v22, types: [t71] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v18, types: [fa1] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [fa1] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r4v13 */
    public final void g1(t71 t71Var, ke1 ke1Var, long j, vm0 vm0Var, int i, boolean z, float f, boolean z2) {
        char c;
        int i2;
        ?? P;
        p91 p91Var = vm0Var.e;
        if (t71Var == null) {
            Y0(ke1Var, j, vm0Var, i, z);
            return;
        }
        if (!ke1Var.c(t71Var)) {
            g1(ei1.D(t71Var, ke1Var.b()), ke1Var, j, vm0Var, i, z, f, z2);
            return;
        }
        int i3 = i;
        if (i3 == 3 || i3 == 4) {
            ?? r2 = t71Var;
            ?? fa1Var = 0;
            while (r2 != 0) {
                if (r2 instanceof zn1) {
                    long jQ = ((zn1) r2).q();
                    int i4 = (int) (j >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i4);
                    ax0 ax0Var = this.s;
                    kw0 kw0Var = ax0Var.C;
                    int i5 = rh2.b;
                    long j2 = Long.MIN_VALUE & jQ;
                    kw0 kw0Var2 = kw0.e;
                    if (j2 == 0 || kw0Var == kw0Var2) {
                        c = 30;
                        i2 = (int) jQ;
                    } else {
                        c = 30;
                        i2 = (int) (jQ >> 30);
                    }
                    if (fIntBitsToFloat < (-(i2 & 32767))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i4) >= h0() + (((j2 == 0 || ax0Var.C == kw0Var2) ? (int) (jQ >> c) : (int) jQ) & 32767)) {
                        break;
                    }
                    int i6 = (int) (j & 4294967295L);
                    if (Float.intBitsToFloat(i6) < (-(((int) (jQ >> 15)) & 32767))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i6) >= (((int) (jQ >> 45)) & 32767) + g0()) {
                        break;
                    }
                    g91 g91Var = vm0Var.f;
                    int i7 = vm0Var.g;
                    int i8 = p91Var.b;
                    if (i7 == i8 - 1) {
                        vm0Var.b(i7 + 1, i8);
                        vm0Var.g++;
                        p91Var.a(t71Var);
                        g91Var.a(ex.a(0.0f, z, true));
                        g1(ei1.D(t71Var, ke1Var.b()), ke1Var, j, vm0Var, i3, z, f, z2);
                        vm0Var.g = i7;
                        return;
                    }
                    long jA = vm0Var.a();
                    int i9 = vm0Var.g;
                    if (!ei1.z(jA)) {
                        if (ei1.u(jA) > 0.0f) {
                            int i10 = vm0Var.g;
                            vm0Var.b(i10 + 1, p91Var.b);
                            vm0Var.g++;
                            p91Var.a(t71Var);
                            g91Var.a(ex.a(0.0f, z, true));
                            g1(ei1.D(t71Var, ke1Var.b()), ke1Var, j, vm0Var, i, z, f, z2);
                            vm0Var.g = i10;
                            return;
                        }
                        return;
                    }
                    int i11 = p91Var.b;
                    int i12 = i11 - 1;
                    vm0Var.g = i12;
                    vm0Var.b(i11, p91Var.b);
                    vm0Var.g++;
                    p91Var.a(t71Var);
                    g91Var.a(ex.a(0.0f, z, true));
                    g1(ei1.D(t71Var, ke1Var.b()), ke1Var, j, vm0Var, i, z, f, z2);
                    vm0Var.g = i12;
                    if (ei1.u(vm0Var.a()) < 0.0f) {
                        vm0Var.b(i9 + 1, vm0Var.g + 1);
                    }
                    vm0Var.g = i9;
                    return;
                }
                if ((r2.g & 16) == 0 || !(r2 instanceof c40)) {
                    P = r2;
                    fa1Var = fa1Var;
                    P = qx.P(fa1Var);
                } else {
                    t71 t71Var2 = ((c40) r2).t;
                    int i13 = 0;
                    while (t71Var2 != null) {
                        if ((t71Var2.g & 16) != 0) {
                            i13++;
                            if (i13 == 1) {
                                P = r2;
                                fa1Var = fa1Var;
                                fa1Var = fa1Var;
                                P = t71Var2;
                            } else {
                                if (fa1Var == 0) {
                                    fa1Var = new fa1(new t71[16]);
                                }
                                if (P != 0) {
                                    fa1Var.b(P);
                                    P = 0;
                                }
                                fa1Var.b(t71Var2);
                            }
                        } else {
                            P = r2;
                            fa1Var = fa1Var;
                        }
                        t71Var2 = t71Var2.j;
                        P = P;
                        fa1Var = fa1Var;
                    }
                    if (i13 == 1) {
                        P = r2;
                        fa1Var = fa1Var;
                    } else {
                        P = r2;
                        fa1Var = fa1Var;
                        P = qx.P(fa1Var);
                    }
                }
                i3 = i;
                r2 = P;
                fa1Var = fa1Var;
            }
        }
        if (z2) {
            W0(t71Var, ke1Var, j, vm0Var, i, z, f);
        } else {
            m1(t71Var, ke1Var, j, vm0Var, i, z, f);
        }
    }

    @Override // defpackage.os0
    public final kw0 getLayoutDirection() {
        return this.s.C;
    }

    @Override // defpackage.jw0
    public final long h(long j) {
        if (!S0().r) {
            vp0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        jw0 jw0VarA = sv.A(this);
        e5 e5Var = (e5) dx0.a(this.s);
        e5Var.C();
        return G(jw0VarA, uf1.d(q61.b(j, e5Var.h0), jw0VarA.R(0L)));
    }

    public abstract void h1(sm smVar, al0 al0Var);

    @Override // defpackage.jw0
    public final long i(long j) {
        long jR = R(j);
        e5 e5Var = (e5) dx0.a(this.s);
        e5Var.C();
        return q61.b(jR, e5Var.g0);
    }

    public final void i1(long j, float f, ej0 ej0Var) {
        r1(ej0Var, false);
        boolean zA = ir0.a(this.D, j);
        ax0 ax0Var = this.s;
        if (!zA) {
            ((e5) dx0.a(ax0Var)).M(-4.0f);
            this.D = j;
            zi1 zi1Var = this.P;
            if (zi1Var != null) {
                ((dl0) zi1Var).d(j);
            } else {
                me1 me1Var = this.u;
                if (me1Var != null) {
                    me1Var.Z0();
                }
            }
            ax0Var.N(this);
            x41.E0(this);
            aj1 aj1Var = ax0Var.r;
            if (aj1Var != null) {
                ((e5) aj1Var).y(ax0Var);
            }
        }
        this.E = f;
        if (this == ax0Var.I.d) {
            ((e5) dx0.a(ax0Var)).getRectManager().f(ax0Var);
        }
        if (this.o) {
            return;
        }
        v0(A0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [t71] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [t71] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [fa1] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [fa1] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // defpackage.jm1, defpackage.r61
    public final Object j() {
        ax0 ax0Var = this.s;
        if (!ax0Var.I.c(64)) {
            return null;
        }
        S0();
        Object objK0 = null;
        for (t71 t71Var = ax0Var.I.e; t71Var != null; t71Var = t71Var.i) {
            if ((t71Var.g & 64) != 0) {
                ?? P = t71Var;
                ?? fa1Var = 0;
                while (P != 0) {
                    if (P instanceof ek1) {
                        objK0 = ((ek1) P).k0(objK0);
                    } else if ((P.g & 64) != 0 && (P instanceof c40)) {
                        t71 t71Var2 = ((c40) P).t;
                        int i = 0;
                        P = P;
                        fa1Var = fa1Var;
                        while (t71Var2 != null) {
                            if ((t71Var2.g & 64) != 0) {
                                i++;
                                if (i == 1) {
                                    fa1Var = fa1Var;
                                    P = t71Var2;
                                } else {
                                    if (fa1Var == 0) {
                                        fa1Var = new fa1(new t71[16]);
                                    }
                                    if (P != 0) {
                                        fa1Var.b(P);
                                        P = 0;
                                    }
                                    fa1Var.b(t71Var2);
                                }
                            }
                            t71Var2 = t71Var2.j;
                            P = P;
                            fa1Var = fa1Var;
                        }
                        if (i == 1) {
                        }
                    }
                    P = qx.P(fa1Var);
                }
            }
        }
        return objK0;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    public final void j1(v91 v91Var, boolean z, boolean z2) {
        long jFloatToRawIntBits;
        zi1 zi1Var = this.P;
        if (zi1Var != null) {
            if (this.w) {
                if (z2) {
                    long jR0 = R0();
                    float f = v91Var.a;
                    float f2 = v91Var.b;
                    if (v91Var.c >= 0.0f) {
                        long j = this.g;
                        if (f > ((int) (j >> 32)) || v91Var.d < 0.0f || f2 > ((int) (j & 4294967295L))) {
                            jFloatToRawIntBits = 0;
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jR0 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jR0 & 4294967295L));
                            float f3 = (fIntBitsToFloat - (v91Var.c - v91Var.a)) / 2.0f;
                            if (f3 > 0.0f) {
                                f -= f3;
                            } else {
                                float f4 = (-fIntBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (fIntBitsToFloat2 - (v91Var.d - v91Var.b)) / 2.0f;
                            if (f5 > 0.0f) {
                                f2 -= f5;
                            } else {
                                float f6 = (-fIntBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                        }
                    } else {
                        jFloatToRawIntBits = 0;
                    }
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    long j2 = this.g;
                    float f7 = (int) (j2 >> 32);
                    int i = (int) (jR0 >> 32);
                    float f8 = (int) (j2 & 4294967295L);
                    int i2 = (int) (jR0 & 4294967295L);
                    v91Var.a(fIntBitsToFloat3, fIntBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + fIntBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + fIntBitsToFloat4)));
                } else if (z) {
                    long j3 = this.g;
                    v91Var.a(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L));
                }
                if (v91Var.b()) {
                    return;
                }
            }
            dl0 dl0Var = (dl0) zi1Var;
            float[] fArrB = dl0Var.b();
            if (!dl0Var.w) {
                if (fArrB == null) {
                    v91Var.a = 0.0f;
                    v91Var.b = 0.0f;
                    v91Var.c = 0.0f;
                    v91Var.d = 0.0f;
                } else {
                    q61.c(fArrB, v91Var);
                }
            }
        }
        long j4 = this.D;
        float f9 = (int) (j4 >> 32);
        v91Var.a += f9;
        v91Var.c += f9;
        float f10 = (int) (j4 & 4294967295L);
        v91Var.b += f10;
        v91Var.d += f10;
    }

    @Override // defpackage.jw0
    public final jw0 k() {
        boolean z = S0().r;
        ax0 ax0Var = this.s;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (ax0 ax0VarU = ax0Var; ax0VarU != null; ax0VarU = ax0VarU.u()) {
                sb.append("\n|");
                sb.append(ax0VarU);
                sb.append(" isAttached=");
                sb.append(ax0VarU.H());
                sb.append(" modifier=");
                sb.append(ax0VarU.N);
                sb.append(" tail=");
                sb.append(S0());
            }
            vp0.b(sb.toString());
        }
        b1();
        return ax0Var.I.d.u;
    }

    public final void k1() {
        if (this.P != null) {
            r1(null, false);
            this.s.U(false);
        }
    }

    @Override // defpackage.m40
    public final float l() {
        return this.s.B.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [t71] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [t71] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [fa1] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [fa1] */
    public final void l1(x61 x61Var) {
        me1 me1Var;
        x61 x61Var2 = this.B;
        if (x61Var != x61Var2) {
            this.B = x61Var;
            ax0 ax0Var = this.s;
            int i = 0;
            if (x61Var2 == null || x61Var.e() != x61Var2.e() || x61Var.c() != x61Var2.c()) {
                int iE = x61Var.e();
                int iC = x61Var.c();
                zi1 zi1Var = this.P;
                if (zi1Var != null) {
                    ((dl0) zi1Var).e((((long) iE) << 32) | (((long) iC) & 4294967295L));
                } else if (ax0Var.I() && (me1Var = this.u) != null) {
                    me1Var.Z0();
                }
                m0((((long) iC) & 4294967295L) | (((long) iE) << 32));
                if (this.x != null) {
                    s1(false);
                }
                boolean zG = ne1.g(4);
                t71 t71VarS0 = S0();
                if (zG || (t71VarS0 = t71VarS0.i) != null) {
                    for (t71 t71VarU0 = U0(zG); t71VarU0 != null && (t71VarU0.h & 4) != 0; t71VarU0 = t71VarU0.j) {
                        if ((t71VarU0.g & 4) != 0) {
                            ?? P = t71VarU0;
                            ?? fa1Var = 0;
                            while (P != 0) {
                                if (P instanceof k80) {
                                    ((k80) P).l0();
                                } else if ((P.g & 4) != 0 && (P instanceof c40)) {
                                    t71 t71Var = ((c40) P).t;
                                    int i2 = 0;
                                    P = P;
                                    fa1Var = fa1Var;
                                    while (t71Var != null) {
                                        if ((t71Var.g & 4) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                fa1Var = fa1Var;
                                                P = t71Var;
                                            } else {
                                                if (fa1Var == 0) {
                                                    fa1Var = new fa1(new t71[16]);
                                                }
                                                if (P != 0) {
                                                    fa1Var.b(P);
                                                    P = 0;
                                                }
                                                fa1Var.b(t71Var);
                                            }
                                        }
                                        t71Var = t71Var.j;
                                        P = P;
                                        fa1Var = fa1Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                P = qx.P(fa1Var);
                            }
                        }
                        if (t71VarU0 == t71VarS0) {
                            break;
                        }
                    }
                }
                aj1 aj1Var = ax0Var.r;
                if (aj1Var != null) {
                    ((e5) aj1Var).y(ax0Var);
                }
                ax0Var.N(this);
            }
            l91 l91Var = this.C;
            if ((l91Var == null || l91Var.e == 0) && x61Var.a().isEmpty()) {
                return;
            }
            l91 l91Var2 = this.C;
            Map mapA = x61Var.a();
            if (l91Var2 != null && l91Var2.e == mapA.size()) {
                Object[] objArr = l91Var2.b;
                int[] iArr = l91Var2.c;
                long[] jArr = l91Var2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) mapA.get((u3) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            ax0Var.J.p.B.f();
            l91 l91Var3 = this.C;
            if (l91Var3 == null) {
                l91 l91Var4 = ef1.a;
                l91Var3 = new l91();
                this.C = l91Var3;
            }
            l91Var3.a();
            for (Map.Entry entry : x61Var.a().entrySet()) {
                l91Var3.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final void m1(t71 t71Var, ke1 ke1Var, long j, vm0 vm0Var, int i, boolean z, float f) {
        int i2;
        p91 p91Var = vm0Var.e;
        if (t71Var == null) {
            Y0(ke1Var, j, vm0Var, i, z);
            return;
        }
        if (!ke1Var.c(t71Var)) {
            m1(ei1.D(t71Var, ke1Var.b()), ke1Var, j, vm0Var, i, z, f);
            return;
        }
        if (!ke1Var.a(t71Var)) {
            g1(ei1.D(t71Var, ke1Var.b()), ke1Var, j, vm0Var, i, z, f, false);
            return;
        }
        g91 g91Var = vm0Var.f;
        int i3 = vm0Var.g;
        int i4 = p91Var.b;
        if (i3 != i4 - 1) {
            long jA = vm0Var.a();
            int i5 = vm0Var.g;
            int i6 = p91Var.b;
            int i7 = i6 - 1;
            vm0Var.g = i7;
            vm0Var.b(i6, p91Var.b);
            vm0Var.g++;
            p91Var.a(t71Var);
            g91Var.a(ex.a(f, z, false));
            g1(ei1.D(t71Var, ke1Var.b()), ke1Var, j, vm0Var, i, z, f, false);
            vm0Var.g = i7;
            long jA2 = vm0Var.a();
            if (vm0Var.g + 1 >= p91Var.b - 1 || ei1.j(jA, jA2) <= 0) {
                vm0Var.b(vm0Var.g + 1, p91Var.b);
            } else {
                int i8 = i5 + 1;
                boolean z2 = ei1.z(jA2);
                int i9 = vm0Var.g;
                vm0Var.b(i8, z2 ? i9 + 2 : i9 + 1);
            }
            vm0Var.g = i5;
            return;
        }
        int i10 = i3 + 1;
        vm0Var.b(i10, i4);
        vm0Var.g++;
        p91Var.a(t71Var);
        g91Var.a(ex.a(f, z, false));
        g1(ei1.D(t71Var, ke1Var.b()), ke1Var, j, vm0Var, i, z, f, false);
        vm0Var.g = i3;
        if (i10 == p91Var.b - 1 || ei1.z(vm0Var.a())) {
            int i11 = vm0Var.g;
            int i12 = i11 + 1;
            p91Var.k(i12);
            if (i12 < 0 || i12 >= (i2 = g91Var.b)) {
                qj.j("Index must be between 0 and size");
                return;
            }
            long[] jArr = g91Var.a;
            long j2 = jArr[i12];
            if (i12 != i2 - 1) {
                ve.v0(jArr, jArr, i12, i11 + 2, i2);
            }
            g91Var.b--;
        }
    }

    public final yr1 o1() {
        if (S0().r) {
            jw0 jw0VarA = sv.A(this);
            v91 v91Var = this.F;
            if (v91Var == null) {
                v91Var = new v91();
                this.F = v91Var;
            }
            long jJ0 = J0(R0());
            int i = (int) (jJ0 >> 32);
            v91Var.a = -Float.intBitsToFloat(i);
            int i2 = (int) (jJ0 & 4294967295L);
            v91Var.b = -Float.intBitsToFloat(i2);
            v91Var.c = Float.intBitsToFloat(i) + h0();
            v91Var.d = Float.intBitsToFloat(i2) + g0();
            while (this != jw0VarA) {
                this.j1(v91Var, false, true);
                if (!v91Var.b()) {
                    this = this.u;
                    this.getClass();
                }
            }
            return new yr1(v91Var.a, v91Var.b, v91Var.c, v91Var.d);
        }
        return yr1.e;
    }

    public final void p1(me1 me1Var, float[] fArr) {
        float[] fArrA;
        if (ws0.j(me1Var, this)) {
            return;
        }
        me1 me1Var2 = this.u;
        me1Var2.getClass();
        me1Var2.p1(me1Var, fArr);
        if (!ir0.a(this.D, 0L)) {
            float[] fArr2 = S;
            q61.d(fArr2);
            long j = this.D;
            q61.f(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            q61.e(fArr, fArr2);
        }
        zi1 zi1Var = this.P;
        if (zi1Var == null || (fArrA = ((dl0) zi1Var).a()) == null) {
            return;
        }
        q61.e(fArr, fArrA);
    }

    public final void q1(me1 me1Var, float[] fArr) {
        while (!this.equals(me1Var)) {
            zi1 zi1Var = this.P;
            if (zi1Var != null) {
                q61.e(fArr, ((dl0) zi1Var).b());
            }
            long j = this.D;
            if (!ir0.a(j, 0L)) {
                float[] fArr2 = S;
                q61.d(fArr2);
                q61.f(fArr2, (int) (j >> 32), (int) (j & 4294967295L));
                q61.e(fArr, fArr2);
            }
            this = this.u;
            this.getClass();
        }
    }

    public final void r1(ej0 ej0Var, boolean z) {
        aj1 aj1Var;
        fa1 fa1Var;
        Reference referencePoll;
        z5 z5Var;
        fa1 fa1Var2;
        Reference referencePoll2;
        Object obj;
        int i = 0;
        ax0 ax0Var = this.s;
        boolean z2 = (!z && this.x == ej0Var && ws0.j(this.y, ax0Var.B) && this.z == ax0Var.C) ? false : true;
        this.y = ax0Var.B;
        this.z = ax0Var.C;
        boolean zH = ax0Var.H();
        le1 le1Var = this.N;
        if (!zH || ej0Var == null) {
            this.x = null;
            zi1 zi1Var = this.P;
            if (zi1Var != null) {
                dl0 dl0Var = (dl0) zi1Var;
                if (!ex.z(dl0Var.b())) {
                    ax0Var.N(this);
                }
                dl0Var.h = null;
                dl0Var.i = null;
                dl0Var.k = true;
                dl0Var.f(false);
                zk0 zk0Var = dl0Var.f;
                if (zk0Var != null) {
                    zk0Var.a(dl0Var.e);
                    e5 e5Var = dl0Var.g;
                    ru1 ru1Var = e5Var.B0;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) ru1Var.c;
                        fa1Var = (fa1) ru1Var.b;
                        referencePoll = referenceQueue.poll();
                        if (referencePoll != null) {
                            fa1Var.j(referencePoll);
                        }
                    } while (referencePoll != null);
                    fa1Var.b(new WeakReference(dl0Var, (ReferenceQueue) ru1Var.c));
                    e5Var.I.j(dl0Var);
                }
                this.P = null;
                ax0Var.M = true;
                le1Var.a();
                if (S0().r && ax0Var.I() && (aj1Var = ax0Var.r) != null) {
                    ((e5) aj1Var).y(ax0Var);
                }
            }
            this.O = false;
            return;
        }
        this.x = ej0Var;
        if (this.P != null) {
            if (z2) {
                s1(true);
                return;
            }
            return;
        }
        aj1 aj1VarA = dx0.a(ax0Var);
        z5 z5Var2 = this.M;
        if (z5Var2 == null) {
            z5 z5Var3 = new z5(2, this, new le1(this, i));
            this.M = z5Var3;
            z5Var = z5Var3;
        } else {
            z5Var = z5Var2;
        }
        e5 e5Var2 = (e5) aj1VarA;
        ru1 ru1Var2 = e5Var2.B0;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) ru1Var2.c;
            fa1Var2 = (fa1) ru1Var2.b;
            referencePoll2 = referenceQueue2.poll();
            if (referencePoll2 != null) {
                fa1Var2.j(referencePoll2);
            }
        } while (referencePoll2 != null);
        do {
            int i2 = fa1Var2.g;
            if (i2 == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) fa1Var2.k(i2 - 1)).get();
        } while (obj == null);
        zi1 dl0Var2 = (zi1) obj;
        if (dl0Var2 != null) {
            dl0 dl0Var3 = (dl0) dl0Var2;
            zk0 zk0Var2 = dl0Var3.f;
            if (zk0Var2 == null) {
                throw k3.g("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!dl0Var3.e.s) {
                vp0.a("layer should have been released before reuse");
            }
            dl0Var3.e = zk0Var2.b();
            dl0Var3.k = false;
            dl0Var3.h = z5Var;
            dl0Var3.i = le1Var;
            dl0Var3.u = false;
            dl0Var3.v = false;
            dl0Var3.w = true;
            q61.d(dl0Var3.l);
            float[] fArr = dl0Var3.m;
            if (fArr != null) {
                q61.d(fArr);
            }
            dl0Var3.s = ai2.b;
            dl0Var3.x = false;
            dl0Var3.j = 9223372034707292159L;
            dl0Var3.t = null;
            dl0Var3.r = 0;
        } else {
            dl0Var2 = new dl0(e5Var2.getGraphicsContext().b(), e5Var2.getGraphicsContext(), e5Var2, z5Var, le1Var);
        }
        dl0 dl0Var4 = (dl0) dl0Var2;
        dl0Var4.e(this.g);
        dl0Var4.d(this.D);
        this.P = dl0Var2;
        s1(true);
        ax0Var.M = true;
        le1Var.a();
    }

    public final void s1(boolean z) {
        char c;
        e5 e5Var;
        boolean z2;
        e5 e5Var2;
        aj1 aj1Var;
        ti0 ti0Var;
        ti0 ti0Var2;
        zi1 zi1Var = this.P;
        ej0 ej0Var = this.x;
        if (zi1Var == null) {
            if (ej0Var == null) {
                return;
            }
            vp0.b("null layer with a non-null layerBlock");
            return;
        }
        if (ej0Var == null) {
            throw k3.g("updateLayerParameters requires a non-null layerBlock");
        }
        bu1 bu1Var = Q;
        bu1Var.a();
        ax0 ax0Var = this.s;
        bu1Var.r = ax0Var.B;
        bu1Var.s = ax0Var.C;
        bu1Var.q = ux.M(this.g);
        ((e5) dx0.a(ax0Var)).getSnapshotObserver().a.c(this, je1.h, new v4(7, ej0Var, this));
        gw0 gw0Var = this.G;
        if (gw0Var == null) {
            gw0Var = new gw0();
            this.G = gw0Var;
        }
        gw0 gw0Var2 = R;
        gw0Var2.getClass();
        gw0Var2.a = gw0Var.a;
        gw0Var2.b = gw0Var.b;
        gw0Var2.c = gw0Var.c;
        gw0Var2.d = gw0Var.d;
        gw0Var2.e = gw0Var.e;
        float f = bu1Var.f;
        gw0Var.a = f;
        gw0Var.b = bu1Var.g;
        gw0Var.c = bu1Var.l;
        gw0Var.d = bu1Var.m;
        long j = bu1Var.n;
        gw0Var.e = j;
        dl0 dl0Var = (dl0) zi1Var;
        e5 e5Var3 = dl0Var.g;
        int i = bu1Var.e | dl0Var.r;
        dl0Var.p = bu1Var.s;
        dl0Var.o = bu1Var.r;
        int i2 = i & 4096;
        if (i2 != 0) {
            dl0Var.s = j;
        }
        if ((i & 1) != 0) {
            cl0 cl0Var = dl0Var.e.a;
            if (cl0Var.d() != f) {
                cl0Var.n(f);
            }
        }
        if ((i & 2) != 0) {
            al0 al0Var = dl0Var.e;
            float f2 = bu1Var.g;
            cl0 cl0Var2 = al0Var.a;
            if (cl0Var2.I() != f2) {
                cl0Var2.B(f2);
            }
        }
        if ((i & 4) != 0) {
            al0 al0Var2 = dl0Var.e;
            float f3 = bu1Var.h;
            cl0 cl0Var3 = al0Var2.a;
            if (cl0Var3.a() != f3) {
                cl0Var3.c(f3);
            }
        }
        if ((i & 8) != 0) {
            cl0 cl0Var4 = dl0Var.e.a;
            if (cl0Var4.r() != 0.0f) {
                cl0Var4.s();
            }
        }
        if ((i & 16) != 0) {
            cl0 cl0Var5 = dl0Var.e.a;
            if (cl0Var5.f() != 0.0f) {
                cl0Var5.g();
            }
        }
        if ((i & 32) != 0) {
            al0 al0Var3 = dl0Var.e;
            float f4 = bu1Var.i;
            cl0 cl0Var6 = al0Var3.a;
            if (cl0Var6.G() != f4) {
                cl0Var6.e(f4);
                al0Var3.g = true;
                al0Var3.a();
            }
            if (bu1Var.i > 0.0f && !dl0Var.x && (ti0Var2 = dl0Var.i) != null) {
                ti0Var2.a();
            }
        }
        if ((i & 64) != 0) {
            al0 al0Var4 = dl0Var.e;
            long j2 = bu1Var.j;
            cl0 cl0Var7 = al0Var4.a;
            long jM = cl0Var7.M();
            int i3 = dr.h;
            if (!vk2.a(j2, jM)) {
                cl0Var7.k(j2);
            }
        }
        if ((i & 128) != 0) {
            al0 al0Var5 = dl0Var.e;
            long j3 = bu1Var.k;
            cl0 cl0Var8 = al0Var5.a;
            long j4 = cl0Var8.j();
            int i4 = dr.h;
            if (!vk2.a(j3, j4)) {
                cl0Var8.A(j3);
            }
        }
        if ((i & 1024) != 0) {
            al0 al0Var6 = dl0Var.e;
            float f5 = bu1Var.l;
            cl0 cl0Var9 = al0Var6.a;
            if (cl0Var9.J() != f5) {
                cl0Var9.h(f5);
            }
        }
        if ((i & 256) != 0) {
            cl0 cl0Var10 = dl0Var.e.a;
            if (cl0Var10.w() != 0.0f) {
                cl0Var10.b();
            }
        }
        if ((i & 512) != 0) {
            cl0 cl0Var11 = dl0Var.e.a;
            if (cl0Var11.E() != 0.0f) {
                cl0Var11.i();
            }
        }
        if ((i & 2048) != 0) {
            al0 al0Var7 = dl0Var.e;
            float f6 = bu1Var.m;
            cl0 cl0Var12 = al0Var7.a;
            if (cl0Var12.p() != f6) {
                cl0Var12.F(f6);
            }
        }
        if (i2 != 0) {
            c = ' ';
            boolean zA = ai2.a(dl0Var.s, ai2.b);
            al0 al0Var8 = dl0Var.e;
            if (!zA) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dl0Var.s & 4294967295L)) * ((int) (dl0Var.j & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dl0Var.s >> 32)) * ((int) (dl0Var.j >> 32)))) << 32);
                if (!uf1.b(al0Var8.v, jFloatToRawIntBits)) {
                    al0Var8.v = jFloatToRawIntBits;
                    al0Var8.a.L(jFloatToRawIntBits);
                }
            } else if (!uf1.b(al0Var8.v, 9205357640488583168L)) {
                al0Var8.v = 9205357640488583168L;
                al0Var8.a.L(9205357640488583168L);
            }
        } else {
            c = ' ';
        }
        if ((i & 16384) != 0) {
            al0 al0Var9 = dl0Var.e;
            boolean z3 = bu1Var.p;
            if (al0Var9.w != z3) {
                al0Var9.w = z3;
                al0Var9.g = true;
                al0Var9.a();
            }
        }
        if ((131072 & i) != 0) {
            cl0 cl0Var13 = dl0Var.e.a;
        }
        if ((262144 & i) != 0) {
            cl0 cl0Var14 = dl0Var.e.a;
            if (!ws0.j(cl0Var14.y(), null)) {
                cl0Var14.m();
            }
        }
        if ((524288 & i) != 0) {
            al0 al0Var10 = dl0Var.e;
            int i5 = bu1Var.t;
            cl0 cl0Var15 = al0Var10.a;
            if (cl0Var15.K() != i5) {
                cl0Var15.o(i5);
            }
        }
        if ((32768 & i) != 0) {
            cl0 cl0Var16 = dl0Var.e.a;
            if (cl0Var16.v() != 0) {
                cl0Var16.z(0);
            }
        }
        if ((i & 7963) != 0) {
            dl0Var.u = true;
            dl0Var.v = true;
        }
        if (ws0.j(dl0Var.t, bu1Var.u)) {
            e5Var = e5Var3;
            z2 = false;
        } else {
            mx mxVar = bu1Var.u;
            dl0Var.t = mxVar;
            if (mxVar == null) {
                e5Var = e5Var3;
            } else {
                al0 al0Var11 = dl0Var.e;
                if (mxVar instanceof hi1) {
                    yr1 yr1Var = ((hi1) mxVar).i;
                    float f7 = yr1Var.a;
                    float f8 = yr1Var.b;
                    e5Var = e5Var3;
                    al0Var11.e((((long) Float.floatToRawIntBits(f7)) << c) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), (((long) Float.floatToRawIntBits(yr1Var.c - f7)) << c) | (((long) Float.floatToRawIntBits(yr1Var.d - f8)) & 4294967295L), 0.0f);
                } else {
                    e5Var = e5Var3;
                    if (mxVar instanceof gi1) {
                        d8 d8Var = ((gi1) mxVar).i;
                        al0Var11.k = null;
                        al0Var11.i = 9205357640488583168L;
                        al0Var11.h = 0L;
                        al0Var11.j = 0.0f;
                        al0Var11.g = true;
                        al0Var11.n = false;
                        al0Var11.l = d8Var;
                        al0Var11.a();
                    } else {
                        if (!(mxVar instanceof ii1)) {
                            qj.p();
                            return;
                        }
                        ii1 ii1Var = (ii1) mxVar;
                        d8 d8Var2 = ii1Var.j;
                        if (d8Var2 != null) {
                            al0Var11.k = null;
                            al0Var11.i = 9205357640488583168L;
                            al0Var11.h = 0L;
                            al0Var11.j = 0.0f;
                            al0Var11.g = true;
                            al0Var11.n = false;
                            al0Var11.l = d8Var2;
                            al0Var11.a();
                        } else {
                            hv1 hv1Var = ii1Var.i;
                            float f9 = hv1Var.b;
                            float f10 = hv1Var.a;
                            al0Var11.e((((long) Float.floatToRawIntBits(f10)) << c) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L), (((long) Float.floatToRawIntBits(hv1Var.c - f10)) << c) | (((long) Float.floatToRawIntBits(hv1Var.d - f9)) & 4294967295L), Float.intBitsToFloat((int) (hv1Var.h >> c)));
                        }
                    }
                }
                if (Build.VERSION.SDK_INT < 33 && (((mxVar instanceof gi1) || ((mxVar instanceof ii1) && !ux.A(((ii1) mxVar).i))) && (ti0Var = dl0Var.i) != null)) {
                    ti0Var.a();
                }
            }
            z2 = true;
        }
        dl0Var.r = bu1Var.e;
        if (i != 0 || z2) {
            if (Build.VERSION.SDK_INT >= 26) {
                ViewParent parent = e5Var.getParent();
                if (parent != null) {
                    e5Var2 = e5Var;
                    parent.onDescendantInvalidated(e5Var2, e5Var2);
                } else {
                    e5Var2 = e5Var;
                }
            } else {
                e5Var2 = e5Var;
                e5Var2.invalidate();
            }
            if (e5.p()) {
                e5Var2.M(0.0f);
            }
        }
        boolean z4 = this.w;
        this.w = bu1Var.p;
        this.A = bu1Var.h;
        boolean z5 = gw0Var2.a == gw0Var.a && gw0Var2.b == gw0Var.b && gw0Var2.c == gw0Var.c && gw0Var2.d == gw0Var.d && ai2.a(gw0Var2.e, gw0Var.e);
        if (z && ((!z5 || z4 != this.w) && (aj1Var = ax0Var.r) != null)) {
            ((e5) aj1Var).y(ax0Var);
        }
        if (z5) {
            return;
        }
        ax0Var.N(this);
        if (ax0Var.Q > 0) {
            e5 e5Var4 = (e5) dx0.a(ax0Var);
            dq0 dq0Var = (dq0) e5Var4.c0.e;
            if (ax0Var.Q > 0) {
                ((fa1) dq0Var.f).b(ax0Var);
                ax0Var.P = true;
            }
            e5Var4.F(null);
        }
    }

    @Override // defpackage.jw0
    public final long t(jw0 jw0Var, long j) {
        return G(jw0Var, j);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x017d  */
    public final boolean t1(long j) {
        boolean z;
        boolean z2;
        boolean zH;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        zi1 zi1Var = this.P;
        if (zi1Var == null || !this.w) {
            return true;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        al0 al0Var = ((dl0) zi1Var).e;
        if (al0Var.w) {
            mx mxVarD = al0Var.d();
            if (mxVarD instanceof hi1) {
                yr1 yr1Var = ((hi1) mxVarD).i;
                if (yr1Var.a > fIntBitsToFloat || fIntBitsToFloat >= yr1Var.c || yr1Var.b > fIntBitsToFloat2 || fIntBitsToFloat2 >= yr1Var.d) {
                    z = false;
                    z2 = true;
                }
                z = false;
                z2 = true;
            } else if (mxVarD instanceof ii1) {
                hv1 hv1Var = ((ii1) mxVarD).i;
                float f = hv1Var.c;
                float f2 = hv1Var.b;
                float f3 = hv1Var.d;
                float f4 = hv1Var.a;
                long j2 = hv1Var.f;
                long j3 = hv1Var.h;
                z = false;
                z2 = true;
                long j4 = hv1Var.g;
                long j5 = hv1Var.e;
                if (fIntBitsToFloat >= f4 && fIntBitsToFloat < f && fIntBitsToFloat2 >= f2 && fIntBitsToFloat2 < f3) {
                    int i = (int) (j5 >> 32);
                    float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                    int i2 = (int) (j2 >> 32);
                    if (Float.intBitsToFloat(i2) + fIntBitsToFloat3 <= f - f4) {
                        int i3 = (int) (j3 >> 32);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i3);
                        int i4 = (int) (j4 >> 32);
                        if (Float.intBitsToFloat(i4) + fIntBitsToFloat4 <= f - f4) {
                            int i5 = (int) (j5 & 4294967295L);
                            int i6 = (int) (j3 & 4294967295L);
                            if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= f3 - f2) {
                                int i7 = (int) (j2 & 4294967295L);
                                int i8 = (int) (j4 & 4294967295L);
                                if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= f3 - f2) {
                                    float fIntBitsToFloat5 = Float.intBitsToFloat(i) + f4;
                                    float fIntBitsToFloat6 = Float.intBitsToFloat(i5) + f2;
                                    float fIntBitsToFloat7 = f - Float.intBitsToFloat(i2);
                                    float fIntBitsToFloat8 = Float.intBitsToFloat(i7) + f2;
                                    float fIntBitsToFloat9 = f - Float.intBitsToFloat(i4);
                                    float fIntBitsToFloat10 = f3 - Float.intBitsToFloat(i8);
                                    float fIntBitsToFloat11 = f3 - Float.intBitsToFloat(i6);
                                    float fIntBitsToFloat12 = Float.intBitsToFloat(i3) + f4;
                                    if (fIntBitsToFloat < fIntBitsToFloat5 && fIntBitsToFloat2 < fIntBitsToFloat6) {
                                        zH = p12.h(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, hv1Var.e);
                                    } else if (fIntBitsToFloat < fIntBitsToFloat12 && fIntBitsToFloat2 > fIntBitsToFloat11) {
                                        zH = p12.h(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat12, fIntBitsToFloat11, hv1Var.h);
                                    } else if (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 >= fIntBitsToFloat8) {
                                        zH = (fIntBitsToFloat <= fIntBitsToFloat9 || fIntBitsToFloat2 <= fIntBitsToFloat10) ? z2 : p12.h(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat9, fIntBitsToFloat10, hv1Var.g);
                                    } else {
                                        zH = p12.h(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, hv1Var.f);
                                    }
                                } else {
                                    d8 d8VarA = f8.a();
                                    d8.b(d8VarA, hv1Var);
                                    zH = p12.g(fIntBitsToFloat, fIntBitsToFloat2, d8VarA);
                                }
                            } else {
                                d8 d8VarA2 = f8.a();
                                d8.b(d8VarA2, hv1Var);
                                zH = p12.g(fIntBitsToFloat, fIntBitsToFloat2, d8VarA2);
                            }
                        } else {
                            d8 d8VarA3 = f8.a();
                            d8.b(d8VarA3, hv1Var);
                            zH = p12.g(fIntBitsToFloat, fIntBitsToFloat2, d8VarA3);
                        }
                    } else {
                        d8 d8VarA4 = f8.a();
                        d8.b(d8VarA4, hv1Var);
                        zH = p12.g(fIntBitsToFloat, fIntBitsToFloat2, d8VarA4);
                    }
                }
            } else {
                z = false;
                z2 = true;
                if (!(mxVarD instanceof gi1)) {
                    qj.p();
                    return false;
                }
                zH = p12.g(fIntBitsToFloat, fIntBitsToFloat2, ((gi1) mxVarD).i);
            }
            zH = z;
        } else {
            z = false;
            z2 = true;
        }
        return zH ? z2 : z;
    }

    @Override // defpackage.x41
    public final x41 w0() {
        return this.t;
    }

    @Override // defpackage.bj1
    public final boolean y() {
        return (this.P == null || this.v || !this.s.H()) ? false : true;
    }

    @Override // defpackage.x41
    public final boolean y0() {
        return this.B != null;
    }

    @Override // defpackage.jw0
    public final long z(long j) {
        if (!S0().r) {
            vp0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return G(sv.A(this), ((e5) dx0.a(this.s)).G(j));
    }

    @Override // defpackage.x41
    public final ax0 z0() {
        return this.s;
    }

    @Override // defpackage.x41
    public final jw0 x0() {
        return this;
    }
}
