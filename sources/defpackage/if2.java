package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class if2 {
    public final hf2 a;
    public jw0 b = null;
    public jw0 c;

    public if2(hf2 hf2Var, jw0 jw0Var) {
        this.a = hf2Var;
        this.c = jw0Var;
    }

    public final long a(long j) {
        yr1 yr1VarK;
        jw0 jw0Var = this.b;
        yr1 yr1Var = yr1.e;
        if (jw0Var != null) {
            if (jw0Var.A()) {
                jw0 jw0Var2 = this.c;
                yr1VarK = jw0Var2 != null ? jw0Var2.K(jw0Var, true) : null;
            } else {
                yr1VarK = yr1Var;
            }
            if (yr1VarK != null) {
                yr1Var = yr1VarK;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = yr1Var.a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = yr1Var.c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = yr1Var.b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = yr1Var.d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    public final boolean c(long j) {
        long jD = d(a(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        hf2 hf2Var = this.a;
        int iE = hf2Var.b.e(fIntBitsToFloat);
        int i = (int) (jD >> 32);
        return Float.intBitsToFloat(i) >= hf2Var.d(iE) && Float.intBitsToFloat(i) <= hf2Var.e(iE);
    }

    public final long d(long j) {
        jw0 jw0Var;
        jw0 jw0Var2 = this.b;
        if (jw0Var2 != null) {
            if (!jw0Var2.A()) {
                jw0Var2 = null;
            }
            if (jw0Var2 != null && (jw0Var = this.c) != null) {
                jw0 jw0Var3 = jw0Var.A() ? jw0Var : null;
                if (jw0Var3 != null) {
                    return jw0Var2.t(jw0Var3, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        jw0 jw0Var;
        jw0 jw0Var2 = this.b;
        if (jw0Var2 != null) {
            if (!jw0Var2.A()) {
                jw0Var2 = null;
            }
            if (jw0Var2 != null && (jw0Var = this.c) != null) {
                jw0 jw0Var3 = jw0Var.A() ? jw0Var : null;
                if (jw0Var3 != null) {
                    return jw0Var3.t(jw0Var2, j);
                }
            }
        }
        return j;
    }
}
