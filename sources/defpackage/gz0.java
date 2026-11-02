package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class gz0 {
    public final w91 a;
    public h7 b;
    public final x91 c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final u71 i;

    public gz0() {
        long[] jArr = jx1.a;
        this.a = new w91();
        x91 x91Var = kx1.a;
        this.c = new x91();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new dz0(this);
    }

    public static int e(int[] iArr, nz0 nz0Var) {
        int iJ = nz0Var.j();
        int iH = nz0Var.h() + iJ;
        int iMax = 0;
        while (iJ < iH) {
            int iF = nz0Var.f() + iArr[iJ];
            iArr[iJ] = iF;
            iMax = Math.max(iMax, iF);
            iJ++;
        }
        return iMax;
    }

    public final void a(int i, Object obj) {
        k3.v(this.a.g(obj));
    }

    public final long b() {
        ArrayList arrayList = this.h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        k3.v(arrayList.get(0));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0094 A[EDGE_INSN: B:110:0x0094->B:34:0x0094 BREAK  A[LOOP:2: B:21:0x005a->B:33:0x0091], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091 A[LOOP:2: B:21:0x005a->B:33:0x0091, LOOP_END] */
    public final void c(int i, int i2, ArrayList arrayList, h7 h7Var, tu tuVar, boolean z, int i3, boolean z2, int i4, int i5) throws Throwable {
        Throwable th;
        Object[] objArr;
        Object[] objArr2;
        int i6;
        h7 h7Var2 = this.b;
        this.b = h7Var;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            nz0 nz0Var = (nz0) arrayList.get(i7);
            int iB = nz0Var.b();
            for (int i8 = 0; i8 < iB; i8++) {
                nz0Var.i(i8);
            }
        }
        w91 w91Var = this.a;
        if (w91Var.i()) {
            d();
            return;
        }
        boolean z3 = z || !z2;
        Object[] objArr3 = w91Var.b;
        long[] jArr = w91Var.a;
        int i9 = 2;
        int length = jArr.length - 2;
        x91 x91Var = this.c;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                int i11 = i10;
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i10 = i11 + 1;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    long j2 = j;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((j2 & 255) < 128) {
                            x91Var.a(objArr3[(i11 << 3) + i13]);
                        }
                        j2 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    } else if (i11 != length) {
                        break;
                    } else {
                        i10 = i11 + 1;
                    }
                }
            }
        }
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            nz0 nz0Var2 = (nz0) arrayList.get(i14);
            x91Var.l(nz0Var2.getKey());
            int iB2 = nz0Var2.b();
            for (int i15 = 0; i15 < iB2; i15++) {
                nz0Var2.i(i15);
            }
            k3.v(w91Var.k(nz0Var2.getKey()));
        }
        int[] iArr = new int[i3];
        Throwable th2 = null;
        ArrayList arrayList2 = this.e;
        ArrayList arrayList3 = this.d;
        if (z3 && h7Var2 != null) {
            if (arrayList3.isEmpty()) {
                i6 = 0;
            } else {
                if (arrayList3.size() > 1) {
                    zq.H(arrayList3, new fz0(h7Var2, i9));
                }
                if (arrayList3.size() > 0) {
                    nz0 nz0Var3 = (nz0) arrayList3.get(0);
                    e(iArr, nz0Var3);
                    Object objG = w91Var.g(nz0Var3.getKey());
                    objG.getClass();
                    k3.v(objG);
                    nz0Var3.g(0);
                    throw null;
                }
                i6 = 0;
                Arrays.fill(iArr, 0, i3, 0);
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList2.size() > 1) {
                    zq.H(arrayList2, new fz0(h7Var2, i6));
                }
                if (arrayList2.size() > 0) {
                    nz0 nz0Var4 = (nz0) arrayList2.get(i6);
                    e(iArr, nz0Var4);
                    Object objG2 = w91Var.g(nz0Var4.getKey());
                    objG2.getClass();
                    k3.v(objG2);
                    nz0Var4.g(i6);
                    throw null;
                }
                Arrays.fill(iArr, i6, i3, i6);
            }
        }
        Object[] objArr4 = x91Var.b;
        long[] jArr2 = x91Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i16 = 0;
            while (true) {
                long j3 = jArr2[i16];
                th = th2;
                long[] jArr3 = jArr2;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8 - ((~(i16 - length2)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr4;
                            k3.v(w91Var.g(objArr2[(i16 << 3) + i18]));
                        } else {
                            objArr2 = objArr4;
                        }
                        j3 >>= 8;
                        i18++;
                        objArr4 = objArr2;
                    }
                    objArr = objArr4;
                    if (i17 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr4;
                }
                if (i16 == length2) {
                    break;
                }
                i16++;
                th2 = th;
                jArr2 = jArr3;
                objArr4 = objArr;
            }
        } else {
            th = null;
        }
        ArrayList arrayList4 = this.f;
        if (!arrayList4.isEmpty()) {
            if (arrayList4.size() > 1) {
                zq.H(arrayList4, new fz0(h7Var, 3));
            }
            if (arrayList4.size() > 0) {
                nz0 nz0Var5 = (nz0) arrayList4.get(0);
                Object objG3 = w91Var.g(nz0Var5.getKey());
                objG3.getClass();
                k3.v(objG3);
                e(iArr, nz0Var5);
                if (!z) {
                    throw th;
                }
                ((nz0) vq.Q(arrayList)).g(0);
                throw th;
            }
            Arrays.fill(iArr, 0, i3, 0);
        }
        ArrayList arrayList5 = this.g;
        if (!arrayList5.isEmpty()) {
            int i19 = 1;
            if (arrayList5.size() > 1) {
                zq.H(arrayList5, new fz0(h7Var, i19));
            }
            if (arrayList5.size() > 0) {
                nz0 nz0Var6 = (nz0) arrayList5.get(0);
                Object objG4 = w91Var.g(nz0Var6.getKey());
                objG4.getClass();
                k3.v(objG4);
                e(iArr, nz0Var6);
                throw th;
            }
        }
        Collections.reverse(arrayList4);
        arrayList.addAll(0, arrayList4);
        arrayList.addAll(arrayList5);
        arrayList3.clear();
        arrayList2.clear();
        arrayList4.clear();
        arrayList5.clear();
        x91Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004a A[LOOP:0: B:7:0x0013->B:18:0x004a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x004d A[EDGE_INSN: B:22:0x004d->B:19:0x004d BREAK  A[LOOP:0: B:7:0x0013->B:18:0x004a], SYNTHETIC] */
    public final void d() {
        w91 w91Var = this.a;
        if (w91Var.j()) {
            Object[] objArr = w91Var.c;
            long[] jArr = w91Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                k3.v(objArr[(i << 3) + i3]);
                                throw null;
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            w91Var.a();
        }
    }
}
