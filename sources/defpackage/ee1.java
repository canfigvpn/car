package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ee1 extends re1 {
    public final t71 c;
    public final qs d;
    public final t41 e;
    public me1 f;
    public pn1 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public ee1(t71 t71Var) {
        this.c = t71Var;
        qs qsVar = new qs(3, (byte) 0);
        qsVar.c = new long[2];
        this.d = qsVar;
        this.e = new t41(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Code duplicated, block: B:172:0x032b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [t71] */
    /* JADX WARN: Type inference failed for: r5v1, types: [t71] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41, types: [t71] */
    /* JADX WARN: Type inference failed for: r5v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [fa1] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [fa1] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    @Override // defpackage.re1
    public final boolean a(t41 t41Var, jw0 jw0Var, dq0 dq0Var, boolean z) {
        qs qsVar;
        t41 t41Var2;
        Object obj;
        boolean z2;
        boolean z3;
        pn1 pn1Var;
        boolean z4;
        int i;
        int i2;
        boolean z5;
        boolean zA = super.a(t41Var, jw0Var, dq0Var, z);
        ?? P = this.c;
        boolean z6 = true;
        if (P.r) {
            ?? fa1Var = 0;
            while (P != 0) {
                if (P instanceof zn1) {
                    this.f = qx.T((zn1) P, 16);
                } else if ((P.g & 16) != 0 && (P instanceof c40)) {
                    t71 t71Var = ((c40) P).t;
                    int i3 = 0;
                    while (t71Var != null) {
                        if ((t71Var.g & 16) != 0) {
                            i3++;
                            if (i3 == 1) {
                                P = P;
                                fa1Var = fa1Var;
                                fa1Var = fa1Var;
                                P = t71Var;
                            } else {
                                if (fa1Var == 0) {
                                    fa1Var = new fa1(new t71[16]);
                                }
                                if (P != 0) {
                                    fa1Var.b(P);
                                    P = 0;
                                }
                                fa1Var.b(t71Var);
                            }
                        } else {
                            P = P;
                            fa1Var = fa1Var;
                        }
                        t71Var = t71Var.j;
                        P = P;
                        fa1Var = fa1Var;
                    }
                    if (i3 == 1) {
                        P = P;
                        fa1Var = fa1Var;
                    } else {
                        P = P;
                        fa1Var = fa1Var;
                    }
                }
                P = qx.P(fa1Var);
            }
            if (this.f != null) {
                int iE = t41Var.e();
                int i4 = 0;
                while (true) {
                    qsVar = this.d;
                    t41Var2 = this.e;
                    if (i4 >= iE) {
                        break;
                    }
                    long jB = t41Var.b(i4);
                    wn1 wn1Var = (wn1) t41Var.f(i4);
                    if (qsVar.b(jB)) {
                        boolean z7 = z6;
                        long j = wn1Var.g;
                        ArrayList arrayList = wn1Var.m;
                        long j2 = wn1Var.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z5 = z7;
                            cb0 cb0Var = cb0.e;
                            ArrayList arrayList2 = new ArrayList((arrayList == null ? cb0Var : arrayList).size());
                            List list = arrayList == null ? cb0Var : arrayList;
                            int size = list.size();
                            int i5 = 0;
                            while (i5 < size) {
                                List list2 = list;
                                km0 km0Var = (km0) list.get(i5);
                                t41 t41Var3 = t41Var2;
                                long j3 = jB;
                                long j4 = km0Var.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    long j5 = km0Var.a;
                                    me1 me1Var = this.f;
                                    me1Var.getClass();
                                    arrayList2.add(new km0(j5, me1Var.G(jw0Var, j4), km0Var.c, km0Var.d, km0Var.e));
                                }
                                i5++;
                                size = size;
                                list = list2;
                                t41Var2 = t41Var3;
                                jB = j3;
                                wn1Var = wn1Var;
                            }
                            t41 t41Var4 = t41Var2;
                            long j6 = jB;
                            me1 me1Var2 = this.f;
                            me1Var2.getClass();
                            long jG = me1Var2.G(jw0Var, j);
                            me1 me1Var3 = this.f;
                            me1Var3.getClass();
                            wn1 wn1Var2 = new wn1(wn1Var.a, wn1Var.b, me1Var3.G(jw0Var, j2), wn1Var.d, wn1Var.e, wn1Var.f, jG, wn1Var.h, wn1Var.i, arrayList2, wn1Var.j, wn1Var.k, wn1Var.l, wn1Var.n);
                            wn1 wn1Var3 = wn1Var.q;
                            if (wn1Var3 == null) {
                                wn1Var3 = wn1Var;
                            }
                            wn1Var2.q = wn1Var3;
                            wn1 wn1Var4 = wn1Var.q;
                            if (wn1Var4 != null) {
                                wn1Var = wn1Var4;
                            }
                            wn1Var2.q = wn1Var;
                            t41Var4.c(j6, wn1Var2);
                        } else {
                            z5 = z7;
                        }
                    } else {
                        z5 = z6;
                    }
                    i4++;
                    iE = iE;
                    z6 = z5;
                    zA = zA;
                }
                boolean z8 = zA;
                boolean z9 = z6;
                if (t41Var2.e() == 0) {
                    qsVar.b = 0;
                    this.a.g();
                    return z9;
                }
                int i6 = qsVar.b;
                while (true) {
                    i6--;
                    if (-1 >= i6) {
                        break;
                    }
                    long j7 = ((long[]) qsVar.c)[i6];
                    if (t41Var.e) {
                        int i7 = t41Var.h;
                        long[] jArr = t41Var.f;
                        Object[] objArr = t41Var.g;
                        int i8 = 0;
                        for (int i9 = 0; i9 < i7; i9++) {
                            Object obj2 = objArr[i9];
                            if (obj2 != ws0.y) {
                                if (i9 != i8) {
                                    jArr[i8] = jArr[i9];
                                    objArr[i8] = obj2;
                                    objArr[i9] = null;
                                }
                                i8++;
                            }
                        }
                        t41Var.e = false;
                        t41Var.h = i8;
                    }
                    if (sv0.N(t41Var.f, t41Var.h, j7) < 0 && i6 < (i2 = qsVar.b)) {
                        int i10 = i2 - 1;
                        int i11 = i6;
                        while (i11 < i10) {
                            long[] jArr2 = (long[]) qsVar.c;
                            int i12 = i11 + 1;
                            jArr2[i11] = jArr2[i12];
                            i11 = i12;
                        }
                        qsVar.b--;
                    }
                }
                ArrayList arrayList3 = new ArrayList(t41Var2.e());
                int iE2 = t41Var2.e();
                for (int i13 = 0; i13 < iE2; i13++) {
                    arrayList3.add(t41Var2.f(i13));
                }
                pn1 pn1Var2 = new pn1(arrayList3, dq0Var);
                int size2 = arrayList3.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList3.get(i14);
                    if (dq0Var.h(((wn1) obj).a)) {
                        break;
                    }
                    i14++;
                }
                wn1 wn1Var5 = (wn1) obj;
                if (wn1Var5 != null) {
                    boolean z10 = wn1Var5.d;
                    if (z) {
                        z2 = false;
                        z4 = this.i;
                        if (!z4 && (z10 || wn1Var5.h)) {
                            me1 me1Var4 = this.f;
                            me1Var4.getClass();
                            long j8 = me1Var4.g;
                            long j9 = wn1Var5.c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
                            int i15 = (int) (j8 >> 32);
                            z4 = !((fIntBitsToFloat2 > ((float) ((int) (j8 & 4294967295L))) ? z9 : false) | (fIntBitsToFloat2 < 0.0f ? z9 : false) | (fIntBitsToFloat > ((float) i15) ? z9 : false) | (fIntBitsToFloat < 0.0f ? z9 : false));
                            this.i = z4;
                        }
                    } else {
                        z2 = false;
                        this.i = false;
                        z4 = false;
                    }
                    boolean z11 = this.h;
                    if (z4 == z11 || !((i = pn1Var2.f) == 3 || i == 4 || i == 5)) {
                        int i16 = pn1Var2.f;
                        if (i16 == 4 && z11 && !this.j) {
                            pn1Var2.f = 3;
                        } else if (i16 == 5 && z4 && z10) {
                            pn1Var2.f = 3;
                        }
                    } else {
                        pn1Var2.f = z4 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (!z8 && pn1Var2.f == 3 && (pn1Var = this.g) != null) {
                    ?? r1 = pn1Var.a;
                    int size3 = r1.size();
                    ?? r4 = pn1Var2.a;
                    if (size3 != r4.size()) {
                        z3 = z9;
                        break;
                    }
                    int size4 = r4.size();
                    ?? r5 = z2;
                    while (true) {
                        if (r5 >= size4) {
                            z3 = z2;
                            break;
                        }
                        if (!uf1.b(((wn1) r1.get(r5)).c, ((wn1) r4.get(r5)).c)) {
                            z3 = z9;
                            break;
                        }
                        r5++;
                    }
                } else {
                    z3 = z9;
                    break;
                }
                this.g = pn1Var2;
                return z3;
            }
        }
        return true;
    }

    @Override // defpackage.re1
    public final void b(dq0 dq0Var) {
        super.b(dq0Var);
        pn1 pn1Var = this.g;
        if (pn1Var == null) {
            return;
        }
        this.h = this.i;
        List list = pn1Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            wn1 wn1Var = (wn1) list.get(i);
            boolean z = wn1Var.d;
            long j = wn1Var.a;
            boolean zH = dq0Var.h(j);
            boolean z2 = this.i;
            if ((!z && !zH) || (!z && !z2)) {
                this.d.l(j);
            }
        }
        this.i = false;
        this.j = pn1Var.f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [fa1] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [fa1] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [t71] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [t71] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [t71] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        fa1 fa1Var = this.a;
        Object[] objArr = fa1Var.e;
        int i = fa1Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((ee1) objArr[i2]).c();
        }
        ?? P = this.c;
        ?? fa1Var2 = 0;
        while (P != 0) {
            if (P instanceof zn1) {
                ((zn1) P).f0();
            } else if ((P.g & 16) != 0 && (P instanceof c40)) {
                t71 t71Var = ((c40) P).t;
                int i3 = 0;
                fa1Var2 = fa1Var2;
                P = P;
                while (t71Var != null) {
                    if ((t71Var.g & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
                            fa1Var2 = fa1Var2;
                            P = t71Var;
                        } else {
                            if (fa1Var2 == 0) {
                                fa1Var2 = new fa1(new t71[16]);
                            }
                            if (P != 0) {
                                fa1Var2.b(P);
                                P = 0;
                            }
                            fa1Var2.b(t71Var);
                        }
                    }
                    t71Var = t71Var.j;
                    fa1Var2 = fa1Var2;
                    P = P;
                }
                if (i3 == 1) {
                }
            }
            P = qx.P(fa1Var2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [t71] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [t71] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [fa1] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [fa1] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(dq0 dq0Var) {
        boolean z;
        ax0 ax0Var;
        t41 t41Var = this.e;
        if (t41Var.e() == 0) {
            z = false;
        } else {
            t71 t71Var = this.c;
            if (t71Var.r) {
                me1 me1Var = t71Var.l;
                if ((me1Var == null || (ax0Var = me1Var.s) == null) ? false : ax0Var.I()) {
                    pn1 pn1Var = this.g;
                    pn1Var.getClass();
                    me1 me1Var2 = this.f;
                    me1Var2.getClass();
                    long j = me1Var2.g;
                    ?? P = t71Var;
                    ?? fa1Var = 0;
                    while (true) {
                        z = true;
                        if (P == 0) {
                            break;
                        }
                        if (P instanceof zn1) {
                            ((zn1) P).G(pn1Var, qn1.g, j);
                        } else if ((P.g & 16) != 0 && (P instanceof c40)) {
                            t71 t71Var2 = ((c40) P).t;
                            int i = 0;
                            while (t71Var2 != null) {
                                if ((t71Var2.g & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        P = P;
                                        fa1Var = fa1Var;
                                        fa1Var = fa1Var;
                                        P = t71Var2;
                                    } else {
                                        if (fa1Var == 0) {
                                            fa1Var = new fa1(new t71[16]);
                                        }
                                        if (P != 0) {
                                            fa1Var.b(P);
                                            P = 0;
                                        }
                                        fa1Var.b(t71Var2);
                                    }
                                } else {
                                    P = P;
                                    fa1Var = fa1Var;
                                }
                                t71Var2 = t71Var2.j;
                                P = P;
                                fa1Var = fa1Var;
                            }
                            if (i == 1) {
                                P = P;
                                fa1Var = fa1Var;
                            } else {
                                P = P;
                                fa1Var = fa1Var;
                            }
                        }
                        P = qx.P(fa1Var);
                    }
                    if (t71Var.r) {
                        fa1 fa1Var2 = this.a;
                        Object[] objArr = fa1Var2.e;
                        int i2 = fa1Var2.g;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((ee1) objArr[i3]).d(dq0Var);
                        }
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        b(dq0Var);
        int i4 = t41Var.h;
        Object[] objArr2 = t41Var.g;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr2[i5] = null;
        }
        t41Var.h = 0;
        t41Var.e = false;
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [t71] */
    /* JADX WARN: Type inference failed for: r0v3, types: [t71] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [t71] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [fa1] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [fa1] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [t71] */
    /* JADX WARN: Type inference failed for: r6v10, types: [t71] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [fa1] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [fa1] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(dq0 dq0Var, boolean z) {
        ax0 ax0Var;
        if (this.e.e() == 0) {
            return false;
        }
        ?? P = this.c;
        if (P.r) {
            me1 me1Var = P.l;
            if ((me1Var == null || (ax0Var = me1Var.s) == null) ? false : ax0Var.I()) {
                pn1 pn1Var = this.g;
                pn1Var.getClass();
                me1 me1Var2 = this.f;
                me1Var2.getClass();
                long j = me1Var2.g;
                ?? P2 = P;
                ?? fa1Var = 0;
                while (P2 != 0) {
                    if (P2 instanceof zn1) {
                        ((zn1) P2).G(pn1Var, qn1.e, j);
                    } else if ((P2.g & 16) != 0 && (P2 instanceof c40)) {
                        t71 t71Var = ((c40) P2).t;
                        int i = 0;
                        while (t71Var != null) {
                            if ((t71Var.g & 16) != 0) {
                                i++;
                                if (i == 1) {
                                    P2 = P2;
                                    fa1Var = fa1Var;
                                    fa1Var = fa1Var;
                                    P2 = t71Var;
                                } else {
                                    if (fa1Var == 0) {
                                        fa1Var = new fa1(new t71[16]);
                                    }
                                    if (P2 != 0) {
                                        fa1Var.b(P2);
                                        P2 = 0;
                                    }
                                    fa1Var.b(t71Var);
                                }
                            } else {
                                P2 = P2;
                                fa1Var = fa1Var;
                            }
                            t71Var = t71Var.j;
                            P2 = P2;
                            fa1Var = fa1Var;
                        }
                        if (i == 1) {
                            P2 = P2;
                            fa1Var = fa1Var;
                        } else {
                            P2 = P2;
                            fa1Var = fa1Var;
                        }
                    }
                    P2 = qx.P(fa1Var);
                }
                if (P.r) {
                    fa1 fa1Var2 = this.a;
                    Object[] objArr = fa1Var2.e;
                    int i2 = fa1Var2.g;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ee1 ee1Var = (ee1) objArr[i3];
                        this.f.getClass();
                        ee1Var.e(dq0Var, z);
                    }
                }
                if (P.r) {
                    ?? fa1Var3 = 0;
                    while (P != 0) {
                        if (P instanceof zn1) {
                            ((zn1) P).G(pn1Var, qn1.f, j);
                        } else if ((P.g & 16) != 0 && (P instanceof c40)) {
                            t71 t71Var2 = ((c40) P).t;
                            int i4 = 0;
                            while (t71Var2 != null) {
                                if ((t71Var2.g & 16) != 0) {
                                    i4++;
                                    if (i4 == 1) {
                                        P = P;
                                        fa1Var3 = fa1Var3;
                                        fa1Var3 = fa1Var3;
                                        P = t71Var2;
                                    } else {
                                        if (fa1Var3 == 0) {
                                            fa1Var3 = new fa1(new t71[16]);
                                        }
                                        if (P != 0) {
                                            fa1Var3.b(P);
                                            P = 0;
                                        }
                                        fa1Var3.b(t71Var2);
                                    }
                                } else {
                                    P = P;
                                    fa1Var3 = fa1Var3;
                                }
                                t71Var2 = t71Var2.j;
                                P = P;
                                fa1Var3 = fa1Var3;
                            }
                            if (i4 == 1) {
                                P = P;
                                fa1Var3 = fa1Var3;
                            } else {
                                P = P;
                                fa1Var3 = fa1Var3;
                            }
                        }
                        P = qx.P(fa1Var3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j, p91 p91Var) {
        qs qsVar = this.d;
        if (qsVar.b(j) && p91Var.g(this) < 0) {
            qsVar.l(j);
            this.e.d(j);
        }
        fa1 fa1Var = this.a;
        Object[] objArr = fa1Var.e;
        int i = fa1Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((ee1) objArr[i2]).f(j, p91Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ')';
    }
}
