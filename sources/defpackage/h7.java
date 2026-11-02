package defpackage;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class h7 implements xf1 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public Object h;

    /* JADX WARN: Code duplicated, block: B:30:0x00cf  */
    public h7(lr0 lr0Var, ex exVar) {
        Object d30Var;
        this.e = 4;
        h7 h7VarW = exVar.w();
        int i = lr0Var.e;
        if (i < 0) {
            yp0.c("negative nearestRange.first");
        }
        int iMin = Math.min(lr0Var.f, h7VarW.f - 1);
        if (iMin < i) {
            l91 l91Var = ef1.a;
            l91Var.getClass();
            this.g = l91Var;
            this.h = new Object[0];
            this.f = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.h = new Object[i2];
        this.f = i;
        l91 l91Var2 = new l91(i2);
        fa1 fa1Var = (fa1) h7VarW.g;
        if (i < 0 || i >= h7VarW.f) {
            StringBuilder sbM = k3.m(i, "Index ", ", size ");
            sbM.append(h7VarW.f);
            yp0.e(sbM.toString());
        }
        if (iMin < 0 || iMin >= h7VarW.f) {
            StringBuilder sbM2 = k3.m(iMin, "Index ", ", size ");
            sbM2.append(h7VarW.f);
            yp0.e(sbM2.toString());
        }
        if (iMin < i) {
            yp0.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ')');
        }
        int iK = sv.k(i, fa1Var);
        int i3 = ((ds0) fa1Var.e[iK]).a;
        while (i3 <= iMin) {
            ds0 ds0Var = (ds0) fa1Var.e[iK];
            ej0 key = ds0Var.c.getKey();
            int i4 = ds0Var.a;
            int iMax = Math.max(i, i4);
            int iMin2 = Math.min(iMin, (ds0Var.b + i4) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    if (key != null) {
                        d30Var = key.h(Integer.valueOf(iMax - i4));
                        d30Var = d30Var == null ? new d30(iMax) : d30Var;
                    }
                    l91Var2.g(iMax, d30Var);
                    ((Object[]) this.h)[iMax - this.f] = d30Var;
                    iMax = iMax != iMin2 ? iMax + 1 : iMax;
                }
            }
            i3 += ds0Var.b;
            iK++;
        }
        this.g = l91Var2;
    }

    public void a(int i, cz0 cz0Var) {
        if (i < 0) {
            yp0.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        ds0 ds0Var = new ds0(this.f, i, cz0Var);
        this.f += i;
        ((fa1) this.g).b(ds0Var);
    }

    public ds0 b(int i) {
        if (i < 0 || i >= this.f) {
            StringBuilder sbM = k3.m(i, "Index ", ", size ");
            sbM.append(this.f);
            yp0.e(sbM.toString());
        }
        ds0 ds0Var = (ds0) this.h;
        if (ds0Var != null) {
            int i2 = ds0Var.a;
            if (i < ds0Var.b + i2 && i2 <= i) {
                return ds0Var;
            }
        }
        fa1 fa1Var = (fa1) this.g;
        ds0 ds0Var2 = (ds0) fa1Var.e[sv.k(i, fa1Var)];
        this.h = ds0Var2;
        return ds0Var2;
    }

    public int c(Object obj) {
        l91 l91Var = (l91) this.g;
        int iD = l91Var.d(obj);
        if (iD >= 0) {
            return l91Var.c[iD];
        }
        return -1;
    }

    public String d() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.g)[i2];
            if (obj instanceof s12) {
                s12 s12Var = (s12) obj;
                boolean zJ = ws0.j(s12Var.c(), q92.c);
                int[] iArr = (int[]) this.h;
                if (!zJ) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(s12Var.e(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.h)[i2]);
                    sb.append("]");
                }
            } else if (obj != q90.Q) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public void e(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7) {
        long[] jArr = (long[]) this.g;
        int i8 = this.f;
        int i9 = i8 + 3;
        this.f = i9;
        int length = jArr.length;
        if (length <= i9) {
            int iMax = Math.max(length * 2, i9);
            this.g = Arrays.copyOf(jArr, iMax);
            this.h = Arrays.copyOf((long[]) this.h, iMax);
        }
        long[] jArr2 = (long[]) this.g;
        jArr2[i8] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i8 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
        int i10 = i6 & 33554431;
        jArr2[i8 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (((long) Math.min(0, 1023)) << 50) | (((long) i10) << 25) | ((long) (i & 33554431));
        if (i6 < 0) {
            return;
        }
        for (int i11 = i7 != -1 ? i7 : i8 - 3; i11 >= 0; i11 -= 3) {
            int i12 = i11 + 2;
            long j = jArr2[i12];
            if ((((int) j) & 33554431) == i10) {
                int i13 = (i8 - i11) / 3;
                int i14 = zr1.b;
                jArr2[i12] = (((long) Math.min(i13, 1023)) << 50) | (j & (-1151795604700004353L));
                return;
            }
        }
    }

    public void g() {
        int i = this.f * 2;
        this.g = Arrays.copyOf((Object[]) this.g, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        ve.x0(0, 0, 14, (int[]) this.h, iArr);
        this.h = iArr;
    }

    public void h(int i, boolean z) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.g;
        int i3 = this.f;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            int i5 = i4 + 2;
            long j = jArr[i5];
            if ((((int) j) & 33554431) == i2) {
                long j2 = 8070450532247928831L & j;
                long j3 = z ? 1L : 0L;
                jArr[i5] = j2 | (1152921504606846976L * j3) | (j3 * Long.MIN_VALUE);
                return;
            }
        }
    }

    public void i(int i, int i2, long j) {
        int i3;
        char c;
        char c2;
        long[] jArr = (long[]) this.g;
        long[] jArr2 = (long[]) this.h;
        jArr2[0] = j;
        int i4 = 1;
        while (i4 > 0) {
            i4--;
            long j2 = jArr2[i4];
            int i5 = 33554431;
            int i6 = ((int) j2) & 33554431;
            char c3 = 25;
            int i7 = ((int) (j2 >> 25)) & 33554431;
            char c4 = '2';
            int i8 = ((int) (j2 >> 50)) & 1023;
            int i9 = i8 == 1023 ? this.f : (i8 * 3) + i7;
            if (i7 < 0) {
                return;
            }
            while (i7 < jArr.length - 2 && i7 < i9) {
                int i10 = i7 + 2;
                long j3 = jArr[i10];
                if ((((int) (j3 >> c3)) & i5) == i6) {
                    long j4 = jArr[i7];
                    int i11 = i7 + 1;
                    i3 = i5;
                    c = c3;
                    long j5 = jArr[i11];
                    c2 = c4;
                    jArr[i7] = (((long) (((int) j4) + i2)) & 4294967295L) | (((long) (((int) (j4 >> 32)) + i)) << 32);
                    jArr[i11] = (((long) (((int) j5) + i2)) & 4294967295L) | (((long) (((int) (j5 >> 32)) + i)) << 32);
                    jArr[i10] = (((j3 >> 63) & 1) << 60) | j3;
                    if ((((int) (j3 >> c2)) & 1023) > 0) {
                        int i12 = zr1.b;
                        jArr2[i4] = ((-1125899873288193L) & j3) | (((long) ((i7 + 3) & i3)) << c);
                        i4++;
                    }
                } else {
                    i3 = i5;
                    c = c3;
                    c2 = c4;
                }
                i7 += 3;
                i5 = i3;
                c3 = c;
                c4 = c2;
            }
        }
    }

    public void j(int i, kj0 kj0Var) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.g;
        int i3 = this.f;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                kj0Var.l(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }

    @Override // defpackage.xf1
    public int n(int i) {
        String str = (String) this.g;
        int iH = ex.h(i, 0, str.length());
        String strP = h92.P(str, iH);
        fg2 fg2Var = (fg2) this.h;
        int i2 = 0;
        for (int i3 = 0; i3 < strP.length(); i3++) {
            if (strP.charAt(i3) == fg2Var.e) {
                i2++;
            }
        }
        return iH - i2;
    }

    @Override // defpackage.xf1
    public int r(int i) {
        int i2 = this.f;
        int iH = ex.h(i, 0, i2);
        int i3 = ((i2 - 1) / 3) + iH;
        int i4 = (i2 - 1) - iH;
        return i3 - ((i4 >= 0 ? i4 : 0) / 3);
    }

    public String toString() {
        switch (this.e) {
            case 2:
                return d();
            default:
                return super.toString();
        }
    }

    public h7(int i, String str, fg2 fg2Var) {
        this.e = 7;
        this.f = i;
        this.g = str;
        this.h = fg2Var;
    }

    public h7(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.e = 0;
        this.g = arrayList;
        this.f = i;
        this.h = motionEvent;
        if (arrayList.isEmpty()) {
            qj.r("changes cannot be empty");
            throw null;
        }
    }

    public /* synthetic */ h7(int i) {
        this.e = i;
    }

    public h7() {
        this.e = 3;
        this.g = new fa1(new ds0[16]);
    }

    public h7(on2 on2Var) {
        this.e = 1;
        this.g = on2Var;
    }
}
