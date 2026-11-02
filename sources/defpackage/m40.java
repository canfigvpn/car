package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public interface m40 {
    default float H(long j) {
        if (!zf2.a(yf2.b(j), 4294967296L)) {
            xp0.b("Only Sp can convert to Px");
        }
        float[] fArr = fh0.a;
        if (l() < 1.03f) {
            return l() * yf2.c(j);
        }
        eh0 eh0VarA = fh0.a(l());
        if (eh0VarA != null) {
            return eh0VarA.b(yf2.c(j));
        }
        return l() * yf2.c(j);
    }

    default int O(float f) {
        float fX = x(f);
        if (Float.isInfinite(fX)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fX);
    }

    default long Y(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fX = x(z60.b(j));
        float fX2 = x(z60.a(j));
        return (((long) Float.floatToRawIntBits(fX)) << 32) | (((long) Float.floatToRawIntBits(fX2)) & 4294967295L);
    }

    float b();

    default float b0(long j) {
        if (!zf2.a(yf2.b(j), 4294967296L)) {
            xp0.b("Only Sp can convert to Px");
        }
        return x(H(j));
    }

    default long j0(float f) {
        return v(q0(f));
    }

    float l();

    default float n0(int i) {
        return i / b();
    }

    default float q0(float f) {
        return f / b();
    }

    default long v(float f) {
        float[] fArr = fh0.a;
        if (l() < 1.03f) {
            return r02.o(f / l(), 4294967296L);
        }
        eh0 eh0VarA = fh0.a(l());
        return r02.o(eh0VarA != null ? eh0VarA.a(f) : f / l(), 4294967296L);
    }

    default long w(long j) {
        if (j != 9205357640488583168L) {
            return mx.a(q0(Float.intBitsToFloat((int) (j >> 32))), q0(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float x(float f) {
        return b() * f;
    }
}
