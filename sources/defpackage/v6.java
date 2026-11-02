package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class v6 {
    public final m40 a;
    public long b = 9205357640488583168L;
    public final g90 c;
    public final dk1 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final c40 i;

    public v6(Context context, m40 m40Var, long j, kj1 kj1Var) {
        this.a = m40Var;
        g90 g90Var = new g90(context, ws0.V(j));
        this.c = g90Var;
        this.d = new dk1(ll2.a, q90.U);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        u6 u6Var = new u6(0, this);
        pn1 pn1Var = ya2.a;
        cb2 cb2Var = new cb2(null, null, u6Var);
        this.i = Build.VERSION.SDK_INT >= 31 ? new wk0(cb2Var, this, g90Var) : new wk0(cb2Var, this, g90Var, kj1Var);
    }

    public final void a() {
        boolean z;
        g90 g90Var = this.c;
        EdgeEffect edgeEffect = g90Var.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = g90Var.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = g90Var.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = g90Var.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0137, code lost:
    
        if (r4 == r6) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r19, defpackage.ty1 r21, defpackage.tx r22) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v6.b(long, ty1, tx):java.lang.Object");
    }

    public final long c() {
        long jK = this.b;
        if ((9223372034707292159L & jK) == 9205357640488583168L) {
            jK = y12.k(this.g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jK >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jK & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void d() {
        if (this.e) {
            this.d.setValue(ll2.a);
        }
    }

    public final float e(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectB = this.c.b();
        float f = -fIntBitsToFloat2;
        float f2 = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = x5.f(edgeEffectB, f, f2);
        } else {
            edgeEffectB.onPull(f, f2);
        }
        return (i2 >= 31 ? x5.d(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-f) : Float.intBitsToFloat(i);
    }

    public final float f(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectC = this.c.c();
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = x5.f(edgeEffectC, fIntBitsToFloat2, f);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? x5.d(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final float g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectD = this.c.d();
        float f = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = x5.f(edgeEffectD, f, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(f, fIntBitsToFloat);
        }
        return (i2 >= 31 ? x5.d(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-f) : Float.intBitsToFloat(i);
    }

    public final float h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectE = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = x5.f(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? x5.d(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void i(long j) {
        boolean zA = d52.a(this.g, 0L);
        boolean zA2 = d52.a(j, this.g);
        this.g = j;
        if (!zA2) {
            int iJ0 = p61.j0(Float.intBitsToFloat((int) (j >> 32)));
            long jJ0 = (((long) p61.j0(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iJ0) << 32);
            g90 g90Var = this.c;
            g90Var.c = jJ0;
            EdgeEffect edgeEffect = g90Var.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jJ0 >> 32), (int) (jJ0 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = g90Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jJ0 >> 32), (int) (jJ0 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = g90Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jJ0 & 4294967295L), (int) (jJ0 >> 32));
            }
            EdgeEffect edgeEffect4 = g90Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jJ0 & 4294967295L), (int) (jJ0 >> 32));
            }
            EdgeEffect edgeEffect5 = g90Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jJ0 >> 32), (int) (jJ0 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = g90Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jJ0 >> 32), (int) (jJ0 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = g90Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jJ0 & 4294967295L), (int) (jJ0 >> 32));
            }
            EdgeEffect edgeEffect8 = g90Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jJ0), (int) (jJ0 >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        a();
    }
}
