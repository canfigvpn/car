package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x62 {
    public static final v22 a = new v22(1);
    public static final ud b = new ud(15);
    public static final Object c = new Object();
    public static u62 d;
    public static long e;
    public static final s62 f;
    public static final h7 g;
    public static List h;
    public static List i;
    public static final tk0 j;
    public static final ff k;

    static {
        u62 u62Var = u62.i;
        d = u62Var;
        e = 2L;
        s62 s62Var = new s62();
        s62Var.b = new long[16];
        s62Var.c = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        s62Var.d = iArr;
        f = s62Var;
        h7 h7Var = new h7(6);
        h7Var.g = new int[16];
        h7Var.h = new no2[16];
        g = h7Var;
        cb0 cb0Var = cb0.e;
        h = cb0Var;
        i = cb0Var;
        long j2 = e;
        e = 1 + j2;
        tk0 tk0Var = new tk0(j2, u62Var, null, new n30(9));
        d = d.e(tk0Var.b);
        j = tk0Var;
        k = new ff(0);
    }

    public static final u62 a(u62 u62Var, long j2, long j3) {
        while (ws0.o(j2, j3) < 0) {
            u62Var = u62Var.e(j2);
            j2++;
        }
        return u62Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0090 A[LOOP:1: B:30:0x0056->B:43:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0093 A[EDGE_INSN: B:58:0x0093->B:44:0x0093 BREAK  A[LOOP:1: B:30:0x0056->B:43:0x0090], SYNTHETIC] */
    public static final Object b(ej0 ej0Var) {
        x91 x91Var;
        Object objU;
        tk0 tk0Var = j;
        synchronized (c) {
            try {
                x91Var = tk0Var.h;
                if (x91Var != null) {
                    k.addAndGet(1);
                }
                objU = u(tk0Var, ej0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (x91Var != null) {
            try {
                List list = h;
                lx1 lx1Var = new lx1(x91Var);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((ij0) list.get(i2)).g(lx1Var, tk0Var);
                }
                k.addAndGet(-1);
            } catch (Throwable th2) {
                k.addAndGet(-1);
                throw th2;
            }
        }
        synchronized (c) {
            d();
            if (x91Var != null) {
                Object[] objArr = x91Var.b;
                long[] jArr = x91Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    p((v82) objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                            if (i3 != length) {
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
        }
        return objU;
    }

    public static final void c() {
        b(a);
    }

    public static final void d() {
        h7 h7Var = g;
        int i2 = h7Var.f;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            no2 no2Var = ((no2[]) h7Var.h)[i3];
            Object obj = no2Var != null ? no2Var.get() : null;
            if (obj != null && o((v82) obj)) {
                if (i4 != i3) {
                    ((no2[]) h7Var.h)[i4] = no2Var;
                    int[] iArr = (int[]) h7Var.g;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((no2[]) h7Var.h)[i5] = null;
            ((int[]) h7Var.g)[i5] = 0;
        }
        if (i4 != i2) {
            h7Var.f = i4;
        }
    }

    public static final o62 e(o62 o62Var, ej0 ej0Var, boolean z) {
        boolean z2 = o62Var instanceof ba1;
        if (z2 || o62Var == null) {
            return new pi2(z2 ? (ba1) o62Var : null, ej0Var, null, false, z);
        }
        return new qi2(o62Var, ej0Var, false, z);
    }

    public static final x82 f(x82 x82Var) {
        x82 x82VarR;
        o62 o62VarH = h();
        x82 x82VarR2 = r(x82Var, o62VarH.g(), o62VarH.d());
        if (x82VarR2 != null) {
            return x82VarR2;
        }
        synchronized (c) {
            o62 o62VarH2 = h();
            x82VarR = r(x82Var, o62VarH2.g(), o62VarH2.d());
        }
        if (x82VarR != null) {
            return x82VarR;
        }
        q();
        throw null;
    }

    public static final x82 g(x82 x82Var, o62 o62Var) {
        x82 x82VarR;
        x82 x82VarR2 = r(x82Var, o62Var.g(), o62Var.d());
        if (x82VarR2 != null) {
            return x82VarR2;
        }
        synchronized (c) {
            x82VarR = r(x82Var, o62Var.g(), o62Var.d());
        }
        if (x82VarR != null) {
            return x82VarR;
        }
        q();
        throw null;
    }

    public static final o62 h() {
        o62 o62Var = (o62) b.f();
        return o62Var == null ? j : o62Var;
    }

    public static final ej0 i(ej0 ej0Var, ej0 ej0Var2, boolean z) {
        if (!z) {
            ej0Var2 = null;
        }
        if (ej0Var == null || ej0Var2 == null || ej0Var == ej0Var2) {
            return ej0Var == null ? ej0Var2 : ej0Var;
        }
        return new v62(ej0Var, ej0Var2, 0);
    }

    public static final ej0 j(ej0 ej0Var, ej0 ej0Var2) {
        if (ej0Var == null || ej0Var2 == null || ej0Var == ej0Var2) {
            return ej0Var == null ? ej0Var2 : ej0Var;
        }
        return new v62(ej0Var, ej0Var2, 1);
    }

    public static final x82 k(x82 x82Var, v82 v82Var) {
        long j2 = e;
        s62 s62Var = f;
        if (s62Var.a > 0) {
            j2 = s62Var.b[0];
        }
        long j3 = j2 - 1;
        x82 x82Var2 = null;
        x82 x82Var3 = null;
        for (x82 x82VarA = v82Var.a(); x82VarA != null; x82VarA = x82VarA.b) {
            long j4 = x82VarA.a;
            if (j4 != 0) {
                if (j4 != 0 && ws0.o(j4, j3) <= 0 && !u62.i.c(j4)) {
                    if (x82Var3 != null) {
                        if (ws0.o(x82VarA.a, x82Var3.a) >= 0) {
                            x82Var2 = x82Var3;
                            break;
                        }
                        break;
                    }
                    x82Var3 = x82VarA;
                }
            }
            x82Var2 = x82VarA;
            break;
        }
        if (x82Var2 != null) {
            x82Var2.a = Long.MAX_VALUE;
            return x82Var2;
        }
        x82 x82VarB = x82Var.b(Long.MAX_VALUE);
        x82VarB.b = v82Var.a();
        v82Var.d(x82VarB);
        return x82VarB;
    }

    public static final void l(o62 o62Var, v82 v82Var) {
        o62Var.t(o62Var.h() + 1);
        ej0 ej0VarI = o62Var.i();
        if (ej0VarI != null) {
            ej0VarI.h(v82Var);
        }
    }

    public static final HashMap m(long j2, ba1 ba1Var, u62 u62Var) {
        long[] jArr;
        u62 u62Var2;
        long[] jArr2;
        int i2;
        int i3;
        x82 x82VarR;
        x91 x91VarX = ba1Var.x();
        if (x91VarX != null) {
            long jG = ba1Var.g();
            u62 u62VarD = ba1Var.d().e(jG).d(ba1Var.j);
            Object[] objArr = x91VarX.b;
            long[] jArr3 = x91VarX.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap map = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                v82 v82Var = (v82) objArr[(i4 << 3) + i7];
                                x82 x82VarA = v82Var.a();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                x82 x82VarR2 = r(x82VarA, j2, u62Var);
                                if (x82VarR2 != null && (x82VarR = r(x82VarA, jG, u62VarD)) != null && !x82VarR2.equals(x82VarR)) {
                                    x82 x82VarR3 = r(x82VarA, jG, ba1Var.d());
                                    if (x82VarR3 == null) {
                                        q();
                                        throw null;
                                    }
                                    x82 x82VarB = v82Var.b(x82VarR, x82VarR2, x82VarR3);
                                    if (x82VarB == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(x82VarR2, x82VarB);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            u62VarD = u62VarD;
                        }
                        jArr = jArr3;
                        u62Var2 = u62VarD;
                        if (i6 != i5) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        u62Var2 = u62VarD;
                    }
                    if (i4 == length) {
                        return map;
                    }
                    i4++;
                    jArr3 = jArr;
                    u62VarD = u62Var2;
                }
            }
        }
        return null;
    }

    public static final x82 n(x82 x82Var, w82 w82Var, o62 o62Var, x82 x82Var2) {
        x82 x82VarK;
        if (o62Var.f()) {
            o62Var.n(w82Var);
        }
        long jG = o62Var.g();
        if (x82Var2.a == jG) {
            return x82Var2;
        }
        synchronized (c) {
            x82VarK = k(x82Var, w82Var);
        }
        x82VarK.a = jG;
        if (x82Var2.a != 1) {
            o62Var.n(w82Var);
        }
        return x82VarK;
    }

    public static final boolean o(v82 v82Var) {
        x82 x82Var;
        long j2 = e;
        s62 s62Var = f;
        if (s62Var.a > 0) {
            j2 = s62Var.b[0];
        }
        x82 x82Var2 = null;
        x82 x82VarA = null;
        int i2 = 0;
        for (x82 x82VarA2 = v82Var.a(); x82VarA2 != null; x82VarA2 = x82VarA2.b) {
            long j3 = x82VarA2.a;
            if (j3 != 0) {
                if (ws0.o(j3, j2) >= 0) {
                    i2++;
                } else if (x82Var2 == null) {
                    i2++;
                    x82Var2 = x82VarA2;
                } else {
                    if (ws0.o(x82VarA2.a, x82Var2.a) < 0) {
                        x82Var = x82Var2;
                        x82Var2 = x82VarA2;
                    } else {
                        x82Var = x82VarA2;
                    }
                    if (x82VarA == null) {
                        x82VarA = v82Var.a();
                        x82 x82Var3 = x82VarA;
                        while (true) {
                            if (x82VarA == null) {
                                x82VarA = x82Var3;
                                break;
                            }
                            if (ws0.o(x82VarA.a, j2) >= 0) {
                                break;
                            }
                            if (ws0.o(x82Var3.a, x82VarA.a) < 0) {
                                x82Var3 = x82VarA;
                            }
                            x82VarA = x82VarA.b;
                        }
                    }
                    x82Var2.a = 0L;
                    x82Var2.a(x82VarA);
                    x82Var2 = x82Var;
                }
            }
        }
        return i2 > 1;
    }

    public static final void p(v82 v82Var) {
        if (o(v82Var)) {
            h7 h7Var = g;
            int i2 = h7Var.f;
            int iIdentityHashCode = System.identityHashCode(v82Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = h7Var.f - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) h7Var.g)[i6];
                    if (i7 < iIdentityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > iIdentityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        no2 no2Var = ((no2[]) h7Var.h)[i6];
                        if (v82Var == (no2Var != null ? no2Var.get() : null)) {
                            i3 = i6;
                            break;
                        }
                        int i8 = i6 - 1;
                        while (true) {
                            if (-1 >= i8 || ((int[]) h7Var.g)[i8] != iIdentityHashCode) {
                                i6++;
                                int i9 = h7Var.f;
                                while (true) {
                                    if (i6 >= i9) {
                                        i3 = -(h7Var.f + 1);
                                        break;
                                    }
                                    if (((int[]) h7Var.g)[i6] != iIdentityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    no2 no2Var2 = ((no2[]) h7Var.h)[i6];
                                    if ((no2Var2 != null ? no2Var2.get() : null) == v82Var) {
                                        i3 = i6;
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                no2 no2Var3 = ((no2[]) h7Var.h)[i8];
                                if ((no2Var3 != null ? no2Var3.get() : null) == v82Var) {
                                    i3 = i8;
                                    break;
                                }
                                i8--;
                            }
                        }
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            no2[] no2VarArr = (no2[]) h7Var.h;
            int length = no2VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                no2[] no2VarArr2 = new no2[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(no2VarArr, i10, no2VarArr2, i12, i2 - i10);
                System.arraycopy((no2[]) h7Var.h, 0, no2VarArr2, 0, i10);
                ve.u0(i12, i10, i2, (int[]) h7Var.g, iArr);
                ve.x0(0, i10, 6, (int[]) h7Var.g, iArr);
                h7Var.h = no2VarArr2;
                h7Var.g = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(no2VarArr, i10, no2VarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) h7Var.g;
                ve.u0(i13, i10, i2, iArr2, iArr2);
            }
            ((no2[]) h7Var.h)[i10] = new no2(v82Var);
            ((int[]) h7Var.g)[i10] = iIdentityHashCode;
            h7Var.f++;
        }
    }

    public static final void q() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final x82 r(x82 x82Var, long j2, u62 u62Var) {
        x82 x82Var2 = null;
        while (x82Var != null) {
            long j3 = x82Var.a;
            if (j3 != 0 && ws0.o(j3, j2) <= 0 && !u62Var.c(j3) && (x82Var2 == null || ws0.o(x82Var2.a, x82Var.a) < 0)) {
                x82Var2 = x82Var;
            }
            x82Var = x82Var.b;
        }
        if (x82Var2 != null) {
            return x82Var2;
        }
        return null;
    }

    public static final x82 s(x82 x82Var, v82 v82Var) {
        x82 x82VarR;
        o62 o62VarH = h();
        ej0 ej0VarE = o62VarH.e();
        if (ej0VarE != null) {
            ej0VarE.h(v82Var);
        }
        x82 x82VarR2 = r(x82Var, o62VarH.g(), o62VarH.d());
        if (x82VarR2 != null) {
            return x82VarR2;
        }
        synchronized (c) {
            o62 o62VarH2 = h();
            x82 x82VarA = v82Var.a();
            x82VarA.getClass();
            x82VarR = r(x82VarA, o62VarH2.g(), o62VarH2.d());
            if (x82VarR == null) {
                q();
                throw null;
            }
        }
        return x82VarR;
    }

    public static final void t(int i2) {
        s62 s62Var = f;
        int i3 = s62Var.d[i2];
        s62Var.b(i3, s62Var.a - 1);
        s62Var.a--;
        long[] jArr = s62Var.b;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (ws0.o(jArr[i5], j2) <= 0) {
                break;
            }
            s62Var.b(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = s62Var.b;
        int i6 = s62Var.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < s62Var.a && ws0.o(jArr2[i7], jArr2[i8]) < 0) {
                if (ws0.o(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                s62Var.b(i7, i3);
                i3 = i7;
            } else {
                if (ws0.o(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                s62Var.b(i8, i3);
                i3 = i8;
            }
        }
        s62Var.d[i2] = s62Var.e;
        s62Var.e = i2;
    }

    public static final Object u(tk0 tk0Var, ej0 ej0Var) {
        long j2 = tk0Var.b;
        Object objH = ej0Var.h(d.b(j2));
        long j3 = e;
        e = 1 + j3;
        u62 u62VarB = d.b(j2);
        d = u62VarB;
        tk0Var.b = j3;
        tk0Var.a = u62VarB;
        tk0Var.g = 0;
        tk0Var.h = null;
        tk0Var.o();
        d = d.e(j3);
        return objH;
    }

    public static final void v(o62 o62Var) {
        long j2;
        if (d.c(o62Var.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(o62Var.g());
        sb.append(", disposed=");
        sb.append(o62Var.c);
        sb.append(", applied=");
        ba1 ba1Var = o62Var instanceof ba1 ? (ba1) o62Var : null;
        sb.append(ba1Var != null ? Boolean.valueOf(ba1Var.m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (c) {
            s62 s62Var = f;
            j2 = s62Var.a > 0 ? s62Var.b[0] : -1L;
        }
        sb.append(j2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final x82 w(x82 x82Var, v82 v82Var, o62 o62Var) {
        x82 x82VarR;
        if (o62Var.f()) {
            o62Var.n(v82Var);
        }
        long jG = o62Var.g();
        x82 x82VarR2 = r(x82Var, jG, o62Var.d());
        if (x82VarR2 == null) {
            q();
            throw null;
        }
        if (x82VarR2.a == o62Var.g()) {
            return x82VarR2;
        }
        synchronized (c) {
            x82VarR = r(v82Var.a(), jG, o62Var.d());
            if (x82VarR == null) {
                q();
                throw null;
            }
            if (x82VarR.a != jG) {
                x82 x82VarK = k(x82VarR, v82Var);
                x82VarK.a(x82VarR);
                x82VarK.a = o62Var.g();
                x82VarR = x82VarK;
            }
        }
        if (x82VarR2.a != 1) {
            o62Var.n(v82Var);
        }
        return x82VarR;
    }
}
