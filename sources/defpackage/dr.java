package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class dr {
    public static final long b = ws0.d(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final /* synthetic */ int h = 0;
    public final long a;

    static {
        ws0.d(4282664004L);
        ws0.d(4287137928L);
        ws0.d(4291611852L);
        c = ws0.d(4294967295L);
        d = ws0.d(4294901760L);
        ws0.d(4278255360L);
        e = ws0.d(4278190335L);
        ws0.d(4294967040L);
        ws0.d(4278255615L);
        ws0.d(4294902015L);
        f = ws0.c(0);
        g = ws0.b(0.0f, 0.0f, 0.0f, 0.0f, qr.u);
    }

    public /* synthetic */ dr(long j) {
        this.a = j;
    }

    public static final long a(long j, mr mrVar) {
        ow owVarQ;
        mr mrVarE = e(j);
        int i = mrVarE.c;
        int i2 = mrVar.c;
        if ((i | i2) < 0) {
            owVarQ = dv1.q(mrVarE, mrVar);
        } else {
            d91 d91Var = pw.a;
            int i3 = i | (i2 << 6);
            Object objB = d91Var.b(i3);
            if (objB == null) {
                objB = dv1.q(mrVarE, mrVar);
                d91Var.h(i3, objB);
            }
            owVarQ = (ow) objB;
        }
        return owVarQ.a(j);
    }

    public static long b(float f2, long j) {
        return ws0.b(g(j), f(j), d(j), f2, e(j));
    }

    public static final float c(long j) {
        float fP;
        float f2;
        if ((63 & j) == 0) {
            fP = (float) j12.p((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            fP = (float) j12.p((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fP / f2;
    }

    public static final float d(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) j12.p((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - ud0.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final mr e(long j) {
        float[] fArr = qr.a;
        return qr.y[(int) (j & 63)];
    }

    public static final float f(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) j12.p((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - ud0.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float g(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) j12.p((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - ud0.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static String h(long j) {
        return "Color(" + g(j) + ", " + f(j) + ", " + d(j) + ", " + c(j) + ", " + e(j).a + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dr) {
            return this.a == ((dr) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return h(this.a);
    }
}
