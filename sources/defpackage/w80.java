package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class w80 implements Comparable {
    public static final w40 f = new w40(1);
    public static final long g = rw.r(4611686018427387903L);
    public static final long h = rw.r(-4611686018427387903L);
    public static final long i = 9223372036854759646L;
    public final long e;

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long jM = rw.m(j, j3);
        if (-4611686018426L > jM || jM >= 4611686018427L) {
            return rw.r(jM);
        }
        long j4 = ((jM * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i2 = x80.a;
        return j4;
    }

    public static final void b(StringBuilder sb, int i2, int i3, int i4, String str, boolean z) {
        sb.append(i2);
        if (i3 != 0) {
            sb.append('.');
            String strL = h92.L(String.valueOf(i3), i4);
            int i5 = -1;
            int length = strL.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i6 = length - 1;
                    if (strL.charAt(length) != '0') {
                        i5 = length;
                        break;
                    } else if (i6 < 0) {
                        break;
                    } else {
                        length = i6;
                    }
                }
            }
            int i7 = i5 + 1;
            if (z || i7 >= 3) {
                sb.append((CharSequence) strL, 0, ((i5 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strL, 0, i7);
            }
        }
        sb.append(str);
    }

    public static final int c(long j) {
        if (d(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    public static final boolean d(long j) {
        return j == g || j == h;
    }

    public static final long e(long j, long j2) {
        int i2 = ((int) j) & 1;
        if (i2 != (((int) j2) & 1)) {
            return i2 == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        if (i2 == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            if (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) {
                return rw.r(j3 / 1000000);
            }
            long j4 = j3 << 1;
            int i3 = x80.a;
            return j4;
        }
        long jM = rw.m(j >> 1, j2 >> 1);
        if (jM == 9223372036854759646L) {
            qj.r("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (jM == 4611686018427387903L || jM == -4611686018427387903L) {
            return rw.r(jM);
        }
        if (-4611686018426L > jM || jM >= 4611686018427L) {
            return rw.r(ex.i(jM));
        }
        long j5 = (jM * 1000000) << 1;
        int i4 = x80.a;
        return j5;
    }

    public static final long f(long j, z80 z80Var) {
        if (j == g) {
            return Long.MAX_VALUE;
        }
        if (j == h) {
            return Long.MIN_VALUE;
        }
        return z80Var.e.convert(j >> 1, ((((int) j) & 1) == 0 ? z80.NANOSECONDS : z80.MILLISECONDS).e);
    }

    public static final long g(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i2 = x80.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((w80) obj).e;
        long j2 = this.e;
        long j3 = j2 ^ j;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return ws0.o(j2, j);
        }
        int i2 = (((int) j2) & 1) - (((int) j) & 1);
        return j2 < 0 ? -i2 : i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w80) {
            return this.e == ((w80) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e);
    }

    public final String toString() {
        long jG = this.e;
        if (jG == 0) {
            return "0s";
        }
        if (jG == g) {
            return "Infinity";
        }
        if (jG == h) {
            return "-Infinity";
        }
        int i2 = 0;
        boolean z = jG < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (jG < 0) {
            jG = g(jG);
        }
        long jF = f(jG, z80.DAYS);
        int iF = d(jG) ? 0 : (int) (f(jG, z80.HOURS) % 24);
        int iF2 = d(jG) ? 0 : (int) (f(jG, z80.MINUTES) % 60);
        int iF3 = d(jG) ? 0 : (int) (f(jG, z80.SECONDS) % 60);
        int iC = c(jG);
        boolean z2 = jF != 0;
        boolean z3 = iF != 0;
        boolean z4 = iF2 != 0;
        boolean z5 = (iF3 == 0 && iC == 0) ? false : true;
        if (z2) {
            sb.append(jF);
            sb.append('d');
            i2 = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i3 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iF);
            sb.append('h');
            i2 = i3;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i4 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iF2);
            sb.append('m');
            i2 = i4;
        }
        if (z5) {
            int i5 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            if (iF3 != 0 || z2 || z3 || z4) {
                b(sb, iF3, iC, 9, "s", false);
            } else if (iC >= 1000000) {
                b(sb, iC / 1000000, iC % 1000000, 6, "ms", false);
            } else if (iC >= 1000) {
                b(sb, iC / 1000, iC % 1000, 3, "us", false);
            } else {
                sb.append(iC);
                sb.append("ns");
            }
            i2 = i5;
        }
        if (z && i2 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
