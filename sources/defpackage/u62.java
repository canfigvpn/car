package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class u62 implements Iterable, fv0 {
    public static final u62 i = new u62(0, 0, 0, null);
    public final long e;
    public final long f;
    public final long g;
    public final long[] h;

    public u62(long j, long j2, long j3, long[] jArr) {
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = jArr;
    }

    public final u62 a(u62 u62Var) {
        long[] jArr;
        u62 u62VarB = this;
        u62 u62Var2 = i;
        if (u62Var == u62Var2) {
            return u62VarB;
        }
        if (u62VarB == u62Var2) {
            return u62Var2;
        }
        long j = u62Var.g;
        long j2 = u62Var.g;
        long[] jArr2 = u62Var.h;
        long j3 = u62Var.f;
        long j4 = u62Var.e;
        long j5 = u62VarB.g;
        if (j == j5 && jArr2 == (jArr = u62VarB.h)) {
            return new u62(u62VarB.e & (~j4), u62VarB.f & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                u62VarB = u62VarB.b(j6);
            }
        }
        if (j3 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j3) != 0) {
                    u62VarB = u62VarB.b(((long) i2) + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j4) != 0) {
                    u62VarB = u62VarB.b(((long) i3) + j2 + 64);
                }
            }
        }
        return u62VarB;
    }

    public final u62 b(long j) {
        long[] jArr;
        int iA;
        long[] jArr2;
        long j2 = j - this.g;
        if (ws0.o(j2, 0L) >= 0 && ws0.o(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.f;
            if ((j4 & j3) != 0) {
                return new u62(this.e, j4 & (~j3), this.g, this.h);
            }
        } else if (ws0.o(j2, 64L) >= 0 && ws0.o(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.e;
            if ((j6 & j5) != 0) {
                return new u62(j6 & (~j5), this.f, this.g, this.h);
            }
        } else if (ws0.o(j2, 0L) < 0 && (jArr = this.h) != null && (iA = p12.a(jArr, j)) >= 0) {
            int length = jArr.length;
            int i2 = length - 1;
            if (i2 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i2];
                if (iA > 0) {
                    ve.v0(jArr, jArr3, 0, 0, iA);
                }
                if (iA < i2) {
                    ve.v0(jArr, jArr3, iA, iA + 1, length);
                }
                jArr2 = jArr3;
            }
            return new u62(this.e, this.f, this.g, jArr2);
        }
        return this;
    }

    public final boolean c(long j) {
        long[] jArr;
        long j2 = j - this.g;
        if (ws0.o(j2, 0L) >= 0 && ws0.o(j2, 64L) < 0) {
            return ((1 << ((int) j2)) & this.f) != 0;
        }
        if (ws0.o(j2, 64L) < 0 || ws0.o(j2, 128L) >= 0) {
            return ws0.o(j2, 0L) <= 0 && (jArr = this.h) != null && p12.a(jArr, j) >= 0;
        }
        return ((1 << (((int) j2) + (-64))) & this.e) != 0;
    }

    public final u62 d(u62 u62Var) {
        u62 u62VarE;
        long[] jArr;
        u62 u62VarE2 = this;
        u62 u62Var2 = i;
        if (u62Var == u62Var2) {
            return u62VarE2;
        }
        if (u62VarE2 == u62Var2) {
            return u62Var;
        }
        long j = u62Var.g;
        long j2 = u62Var.g;
        long[] jArr2 = u62Var.h;
        long j3 = u62Var.f;
        long j4 = u62Var.e;
        long j5 = u62VarE2.g;
        long j6 = u62VarE2.f;
        long j7 = u62VarE2.e;
        if (j == j5 && jArr2 == (jArr = u62VarE2.h)) {
            return new u62(j7 | j4, j6 | j3, j5, jArr);
        }
        int i2 = 0;
        long[] jArr3 = u62VarE2.h;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    u62VarE2 = u62VarE2.e(j8);
                }
            }
            if (j3 != 0) {
                for (int i3 = 0; i3 < 64; i3++) {
                    if (((1 << i3) & j3) != 0) {
                        u62VarE2 = u62VarE2.e(((long) i3) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i2 < 64) {
                    if (((1 << i2) & j4) != 0) {
                        u62VarE2 = u62VarE2.e(((long) i2) + j2 + 64);
                    }
                    i2++;
                }
            }
            return u62VarE2;
        }
        if (jArr3 != null) {
            u62VarE = u62Var;
            for (long j9 : jArr3) {
                u62VarE = u62VarE.e(j9);
            }
        } else {
            u62VarE = u62Var;
        }
        long j10 = u62VarE2.g;
        if (j6 != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                if (((1 << i4) & j6) != 0) {
                    u62VarE = u62VarE.e(((long) i4) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i2 < 64) {
                if (((1 << i2) & j7) != 0) {
                    u62VarE = u62VarE.e(((long) i2) + j10 + 64);
                }
                i2++;
            }
        }
        return u62VarE;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00fa  */
    public final u62 e(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i2;
        long j4 = this.g;
        long j5 = j - j4;
        long j6 = 0;
        int iO = ws0.o(j5, 0L);
        long j7 = this.f;
        if (iO < 0 || ws0.o(j5, 64L) >= 0) {
            int iO2 = ws0.o(j5, 64L);
            long j8 = this.e;
            int i3 = 64;
            if (iO2 < 0 || ws0.o(j5, 128L) >= 0) {
                int iO3 = ws0.o(j5, 128L);
                long[] jArr3 = this.h;
                if (iO3 < 0) {
                    if (jArr3 == null) {
                        return new u62(this.e, this.f, this.g, new long[]{j});
                    }
                    int iA = p12.a(jArr3, j);
                    if (iA < 0) {
                        int i4 = -(iA + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        ve.v0(jArr3, jArr4, 0, 0, i4);
                        ve.v0(jArr3, jArr4, i4 + 1, i4, length);
                        jArr4[i4] = j;
                        return new u62(this.e, this.f, this.g, jArr4);
                    }
                } else if (!c(j)) {
                    long j9 = ((j + 1) / 64) * 64;
                    if (ws0.o(j9, 0L) < 0) {
                        j9 = 9223372036854775680L;
                    }
                    long j10 = j8;
                    qk1 qk1Var = null;
                    while (true) {
                        if (ws0.o(j4, j9) >= 0) {
                            j2 = j4;
                            j3 = j7;
                            break;
                        }
                        if (j7 != j6) {
                            if (qk1Var == null) {
                                qk1Var = new qk1(jArr3);
                            }
                            int i5 = 0;
                            i2 = i3;
                            while (i5 < i2) {
                                if ((j7 & (1 << i5)) != j6) {
                                    ((g91) qk1Var.f).a(((long) i5) + j4);
                                }
                                i5++;
                                j6 = j6;
                            }
                        } else {
                            i2 = i3;
                        }
                        long j11 = j6;
                        if (j10 == j11) {
                            j2 = j9;
                            j3 = j11;
                            break;
                        }
                        j4 += 64;
                        j6 = j11;
                        j7 = j10;
                        i3 = i2;
                        j10 = j6;
                    }
                    if (qk1Var == null) {
                        jArr = jArr3;
                    } else {
                        g91 g91Var = (g91) qk1Var.f;
                        int i6 = g91Var.b;
                        if (i6 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i6];
                            long[] jArr6 = g91Var.a;
                            for (int i7 = 0; i7 < i6; i7++) {
                                jArr5[i7] = jArr6[i7];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 == null) {
                            jArr = jArr3;
                        } else {
                            jArr = jArr2;
                        }
                    }
                    return new u62(j10, j3, j2, jArr).e(j);
                }
            } else {
                long j12 = 1 << (((int) j5) - 64);
                if ((j8 & j12) == 0) {
                    return new u62(j8 | j12, this.f, this.g, this.h);
                }
            }
        } else {
            long j13 = 1 << ((int) j5);
            if ((j7 & j13) == 0) {
                return new u62(this.e, j7 | j13, this.g, this.h);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return p12.i(new t62(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(wq.G(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = arrayList.get(i3);
            i2++;
            if (i2 > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
