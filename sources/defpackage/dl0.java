package defpackage;

import android.os.Build;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class dl0 implements zi1 {
    public al0 e;
    public final zk0 f;
    public final e5 g;
    public ij0 h;
    public ti0 i;
    public boolean k;
    public float[] m;
    public boolean n;
    public int r;
    public mx t;
    public boolean u;
    public boolean v;
    public boolean x;
    public long j = 9223372034707292159L;
    public final float[] l = q61.a();
    public m40 o = vv.a();
    public kw0 p = kw0.e;
    public final um q = new um();
    public long s = ai2.b;
    public boolean w = true;
    public final y3 y = new y3(13, this);

    public dl0(al0 al0Var, zk0 zk0Var, e5 e5Var, ij0 ij0Var, ti0 ti0Var) {
        this.e = al0Var;
        this.f = zk0Var;
        this.g = e5Var;
        this.h = ij0Var;
        this.i = ti0Var;
    }

    public final float[] a() {
        float[] fArrA = this.m;
        if (fArrA == null) {
            fArrA = q61.a();
            this.m = fArrA;
        }
        if (this.v) {
            this.v = false;
            float[] fArrB = b();
            if (this.w) {
                return fArrB;
            }
            if (!ix.G(fArrB, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] b() {
        boolean z = this.u;
        float[] fArr = this.l;
        if (z) {
            al0 al0Var = this.e;
            long jK = al0Var.v;
            cl0 cl0Var = al0Var.a;
            if ((9223372034707292159L & jK) == 9205357640488583168L) {
                jK = y12.k(ux.M(this.j));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jK >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jK & 4294967295L));
            float fR = cl0Var.r();
            float f = cl0Var.f();
            float fW = cl0Var.w();
            float fE = cl0Var.E();
            float fJ = cl0Var.J();
            float fD = cl0Var.d();
            float fI = cl0Var.I();
            double d = ((double) fW) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f2 = -fSin;
            float f3 = (f * fCos) - (0.0f * fSin);
            float f4 = (0.0f * fCos) + (f * fSin);
            double d2 = ((double) fE) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f5 = -fSin2;
            float f6 = fSin * fSin2;
            float f7 = fSin * fCos2;
            float f8 = fCos * fSin2;
            float f9 = fCos * fCos2;
            float f10 = (f4 * fSin2) + (fR * fCos2);
            float f11 = (f4 * fCos2) + ((-fR) * fSin2);
            double d3 = ((double) fJ) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f12 = -fSin3;
            float f13 = (fCos3 * f6) + (f12 * fCos2);
            float f14 = (f6 * fSin3) + (fCos2 * fCos3);
            float f15 = fSin3 * fCos;
            float f16 = f14 * fD;
            float f17 = f15 * fD;
            float f18 = ((fSin3 * f7) + (fCos3 * f5)) * fD;
            float f19 = f13 * fI;
            float f20 = fCos * fCos3 * fI;
            float f21 = ((fCos3 * f7) + (f12 * f5)) * fI;
            float f22 = f8 * 1.0f;
            float f23 = f2 * 1.0f;
            float f24 = f9 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f16;
                fArr[1] = f17;
                fArr[2] = f18;
                fArr[3] = 0.0f;
                fArr[4] = f19;
                fArr[5] = f20;
                fArr[6] = f21;
                fArr[7] = 0.0f;
                fArr[8] = f22;
                fArr[9] = f23;
                fArr[10] = f24;
                fArr[11] = 0.0f;
                float f25 = -fIntBitsToFloat;
                fArr[12] = ((f16 * f25) - (fIntBitsToFloat2 * f19)) + f10 + fIntBitsToFloat;
                fArr[13] = ((f17 * f25) - (fIntBitsToFloat2 * f20)) + f3 + fIntBitsToFloat2;
                fArr[14] = ((f25 * f18) - (fIntBitsToFloat2 * f21)) + f11;
                fArr[15] = 1.0f;
            }
            this.u = false;
            this.w = ex.z(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (this.n || this.k) {
            return;
        }
        this.g.invalidate();
        f(true);
    }

    public final void d(long j) {
        boolean zP = e5.p();
        e5 e5Var = this.g;
        if (zP) {
            e5Var.M(-4.0f);
        }
        al0 al0Var = this.e;
        if (!ir0.a(al0Var.t, j)) {
            al0Var.t = j;
            al0Var.a.D((int) (j >> 32), (int) (j & 4294967295L), al0Var.u);
        }
        if (Build.VERSION.SDK_INT < 26) {
            e5Var.invalidate();
            return;
        }
        ViewParent parent = e5Var.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(e5Var, e5Var);
        }
    }

    public final void e(long j) {
        if (qr0.a(j, this.j)) {
            return;
        }
        if (e5.p()) {
            this.g.M(-4.0f);
        }
        this.j = j;
        c();
    }

    public final void f(boolean z) {
        if (z != this.n) {
            this.n = z;
            e5 e5Var = this.g;
            p91 p91Var = e5Var.I;
            boolean z2 = e5Var.K;
            if (!z) {
                if (z2) {
                    return;
                }
                p91Var.j(this);
                p91 p91Var2 = e5Var.J;
                if (p91Var2 != null) {
                    p91Var2.j(this);
                    return;
                }
                return;
            }
            if (!z2) {
                p91Var.a(this);
                return;
            }
            p91 p91Var3 = e5Var.J;
            if (p91Var3 == null) {
                p91Var3 = new p91();
                e5Var.J = p91Var3;
            }
            p91Var3.a(this);
        }
    }

    public final void g() {
        e5.p();
        if (this.n) {
            if (!ai2.a(this.s, ai2.b) && !qr0.a(this.e.u, this.j)) {
                al0 al0Var = this.e;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.s >> 32)) * ((int) (this.j >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.s & 4294967295L)) * ((int) (this.j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                if (!uf1.b(al0Var.v, jFloatToRawIntBits)) {
                    al0Var.v = jFloatToRawIntBits;
                    al0Var.a.L(jFloatToRawIntBits);
                }
            }
            al0 al0Var2 = this.e;
            m40 m40Var = this.o;
            kw0 kw0Var = this.p;
            long j = this.j;
            long j2 = al0Var2.u;
            cl0 cl0Var = al0Var2.a;
            if (!qr0.a(j2, j)) {
                al0Var2.u = j;
                long j3 = al0Var2.t;
                cl0Var.D((int) (j3 >> 32), (int) (4294967295L & j3), j);
                if (al0Var2.i == 9205357640488583168L) {
                    al0Var2.g = true;
                    al0Var2.a();
                }
            }
            al0Var2.b = m40Var;
            al0Var2.c = kw0Var;
            al0Var2.d = this.y;
            cl0Var.x(m40Var, kw0Var, al0Var2, al0Var2.e);
            f(false);
        }
    }
}
