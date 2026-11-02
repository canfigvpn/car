package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class o52 {
    public final l52 a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public d91 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final rr0 p;
    public final rr0 q;
    public final rr0 r;
    public d91 s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public c91 x;

    public o52(l52 l52Var) {
        this.a = l52Var;
        int[] iArr = l52Var.e;
        this.b = iArr;
        Object[] objArr = l52Var.g;
        this.c = objArr;
        this.d = l52Var.m;
        this.e = l52Var.n;
        this.f = l52Var.o;
        int i = l52Var.f;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = l52Var.h;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.p = new rr0();
        this.q = new rr0();
        this.r = new rr0();
        this.u = i;
        this.v = -1;
    }

    public static int h(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public static void y(o52 o52Var) {
        int i = o52Var.v;
        int iQ = o52Var.q(i);
        int[] iArr = o52Var.b;
        int i2 = (iQ * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        o52Var.S(o52Var.D(iArr, i));
    }

    public final void A(int i) {
        vj0 vj0Var;
        int i2;
        vj0 vj0Var2;
        int i3;
        int i4;
        int i5 = this.h;
        int i6 = this.g;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int iN = n() - this.h;
                ArrayList arrayList = this.d;
                if (i6 < i) {
                    for (int iB = n52.b(arrayList, i6, iN); iB < this.d.size() && (i3 = (vj0Var2 = (vj0) this.d.get(iB)).a) < 0 && (i4 = i3 + iN) < i; iB++) {
                        vj0Var2.a = i4;
                    }
                } else {
                    for (int iB2 = n52.b(arrayList, i, iN); iB2 < this.d.size() && (i2 = (vj0Var = (vj0) this.d.get(iB2)).a) >= 0; iB2++) {
                        vj0Var.a = -(iN - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.b;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    ve.u0(i8 + i7, i7, i9, iArr, iArr);
                } else {
                    ve.u0(i9, i9 + i8, i7 + i8, iArr, iArr);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iN2 = n();
            if (i6 >= iN2) {
                hv.a("Check failed");
            }
            while (i6 < iN2) {
                int i10 = (i6 * 5) + 2;
                int i11 = this.b[i10];
                int iO = i11 > -2 ? i11 : (o() + i11) - (-2);
                if (iO >= i) {
                    iO = -((o() - iO) - (-2));
                }
                if (iO != i11) {
                    this.b[i10] = iO;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.g = i;
    }

    public final void B(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, o());
        if (i5 != iMin) {
            int length = this.c.length - i3;
            if (iMin < i5) {
                int iQ = q(iMin);
                int iQ2 = q(i5);
                int i7 = this.g;
                while (iQ < iQ2) {
                    int i8 = (iQ * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        hv.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    iQ++;
                    if (iQ == i7) {
                        iQ += this.h;
                    }
                }
            } else {
                int iQ3 = q(i5);
                int iQ4 = q(iMin);
                while (iQ3 < iQ4) {
                    int i10 = (iQ3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        hv.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    iQ3++;
                    if (iQ3 == this.g) {
                        iQ3 += this.h;
                    }
                }
            }
            this.m = iMin;
        }
        this.k = i;
    }

    public final Object C(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        if ((iArr[(iQ * 5) + 1] & 1073741824) != 0) {
            return this.c[g(f(iArr, iQ))];
        }
        return null;
    }

    public final int D(int[] iArr, int i) {
        int i2 = iArr[(q(i) * 5) + 2];
        return i2 > -2 ? i2 : (o() + i2) - (-2);
    }

    public final Object E(Object obj) {
        if (this.n > 0) {
            w(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[g(i)];
        if (this.i > this.j) {
            hv.a("Writing to an invalid slot");
        }
        this.c[g(this.i - 1)] = obj;
        return obj2;
    }

    public final void F() {
        int i;
        c91 c91Var = this.x;
        if (c91Var != null) {
            while (c91Var.b != 0) {
                int iH = ux.H(c91Var);
                int iQ = q(iH);
                int iT = iH + 1;
                int iT2 = t(iH) + iH;
                while (true) {
                    if (iT >= iT2) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(q(iT) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iT += t(iT);
                    }
                }
                int[] iArr = this.b;
                int i2 = (iQ * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iD = D(iArr, iH);
                    if (iD >= 0) {
                        ux.j(c91Var, iD);
                    }
                }
            }
        }
    }

    public final boolean G() {
        if (this.n != 0) {
            hv.a("Cannot remove group while inserting");
        }
        int i = this.t;
        int i2 = this.i;
        int iF = f(this.b, q(i));
        int iK = K();
        N(this.v);
        c91 c91Var = this.x;
        if (c91Var != null) {
            while (true) {
                int i3 = c91Var.b;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    fu1.k("IntList is empty.");
                    return false;
                }
                if (c91Var.a[0] < i) {
                    break;
                }
                ux.H(c91Var);
            }
        }
        boolean zH = H(i, this.t - i);
        I(iF, this.i - iF, i - 1);
        this.t = i;
        this.i = i2;
        this.o -= iK;
        return zH;
    }

    public final boolean H(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            A(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.e;
                int i3 = i + i2;
                int iB = n52.b(this.d, i3, n() - this.h);
                if (iB >= this.d.size()) {
                    iB--;
                }
                int i4 = iB + 1;
                int i5 = 0;
                while (iB >= 0) {
                    vj0 vj0Var = (vj0) this.d.get(iB);
                    int iC = c(vj0Var);
                    if (iC < i) {
                        break;
                    }
                    if (iC < i3) {
                        vj0Var.a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iB + 1;
                        }
                        i4 = iB;
                    }
                    iB--;
                }
                z = i4 < i5;
                if (z) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.u;
            if (i7 >= this.g) {
                this.u = i7 - i2;
            }
            int i8 = this.v;
            if (i8 >= 0 && (this.b[(q(i8) * 5) + 1] & 67108864) != 0) {
                S(i8);
            }
        }
        return z;
    }

    public final void I(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            B(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            Arrays.fill(this.c, i, i5, (Object) null);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final Object J(int i, int i2, Object obj) {
        int iM = M(this.b, q(i));
        int iF = f(this.b, q(i + 1));
        int i3 = iM + i2;
        if (i3 < iM || i3 >= iF) {
            hv.a("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int iG = g(i3);
        Object[] objArr = this.c;
        Object obj2 = objArr[iG];
        objArr[iG] = obj;
        return obj2;
    }

    public final int K() {
        int iQ = q(this.t);
        int i = this.t;
        int[] iArr = this.b;
        int i2 = iQ * 5;
        int i3 = iArr[i2 + 3] + i;
        this.t = i3;
        this.i = f(iArr, q(i3));
        int i4 = this.b[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void L() {
        int i = this.u;
        this.t = i;
        this.i = f(this.b, q(i));
    }

    public final int M(int[] iArr, int i) {
        if (i >= n()) {
            return this.c.length - this.l;
        }
        int iD = n52.d(iArr, i);
        return iD < 0 ? (this.c.length - this.l) + iD + 1 : iD;
    }

    public final ck0 N(int i) {
        vj0 vj0VarQ;
        HashMap map = this.e;
        if (map == null || (vj0VarQ = Q(i)) == null) {
            return null;
        }
        return (ck0) map.get(vj0VarQ);
    }

    public final void O() {
        if (this.n != 0) {
            hv.a("Key must be supplied when inserting");
        }
        is1 is1Var = cv.a;
        P(0, is1Var, is1Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P(int i, Object obj, Object obj2, boolean z) {
        int i2;
        int i3 = this.v;
        byte b = this.n > 0;
        this.r.c(this.o);
        is1 is1Var = cv.a;
        if (b == true) {
            int i4 = this.t;
            int iF = f(this.b, q(i4));
            v(1);
            this.i = iF;
            this.j = iF;
            int iQ = q(i4);
            int i5 = obj != is1Var ? 1 : 0;
            int i6 = (z || obj2 == is1Var) ? 0 : 1;
            int iH = h(iF, this.k, this.l, this.c.length);
            if (iH >= 0 && this.m < i4) {
                iH = -(((this.c.length - this.l) - iH) + 1);
            }
            int[] iArr = this.b;
            int i7 = this.v;
            int i8 = iQ * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = iH;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                w(i9, i4);
                Object[] objArr = this.c;
                int i10 = this.i;
                if (z) {
                    objArr[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr[i10] = obj2;
                    i10++;
                }
                this.i = i10;
            }
            this.o = 0;
            i2 = i4 + 1;
            this.v = i4;
            this.t = i2;
            if (i3 >= 0) {
                N(i3);
            }
        } else {
            this.p.c(i3);
            this.q.c((n() - this.h) - this.u);
            int i11 = this.t;
            int iQ2 = q(i11);
            if (!ws0.j(obj2, is1Var)) {
                if (z) {
                    T(this.t, obj2);
                } else {
                    R(obj2);
                }
            }
            this.i = M(this.b, iQ2);
            this.j = f(this.b, q(this.t + 1));
            int[] iArr2 = this.b;
            int i12 = iQ2 * 5;
            this.o = iArr2[i12 + 1] & 67108863;
            this.v = i11;
            this.t = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.u = i2;
    }

    public final vj0 Q(int i) {
        ArrayList arrayList;
        int iC;
        if (i < 0 || i >= o() || (iC = n52.c((arrayList = this.d), i, o())) < 0) {
            return null;
        }
        return (vj0) arrayList.get(iC);
    }

    public final void R(Object obj) {
        int iQ = q(this.t);
        int i = (iQ * 5) + 1;
        if ((this.b[i] & 268435456) == 0) {
            hv.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        objArr[g(Integer.bitCount(iArr[i] >> 29) + f(iArr, iQ))] = obj;
    }

    public final void S(int i) {
        if (i >= 0) {
            c91 c91Var = this.x;
            if (c91Var == null) {
                c91Var = new c91();
                this.x = c91Var;
            }
            ux.j(c91Var, i);
        }
    }

    public final void T(int i, Object obj) {
        int iQ = q(i);
        int[] iArr = this.b;
        if (iQ >= iArr.length || (iArr[(iQ * 5) + 1] & 1073741824) == 0) {
            hv.a("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.c[g(f(this.b, iQ))] = obj;
    }

    public final void a(int i) {
        if (i < 0) {
            hv.a("Cannot seek backwards");
        }
        if (this.n > 0) {
            cp1.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        if (i2 < this.v || i2 > this.u) {
            hv.a("Cannot seek outside the current group (" + this.v + '-' + this.u + ')');
        }
        this.t = i2;
        int iF = f(this.b, q(i2));
        this.i = iF;
        this.j = iF;
    }

    public final vj0 b(int i) {
        ArrayList arrayList = this.d;
        int iC = n52.c(arrayList, i, o());
        if (iC >= 0) {
            return (vj0) arrayList.get(iC);
        }
        if (i > this.g) {
            i = -(o() - i);
        }
        vj0 vj0Var = new vj0(i);
        arrayList.add(-(iC + 1), vj0Var);
        return vj0Var;
    }

    public final int c(vj0 vj0Var) {
        int i = vj0Var.a;
        return i < 0 ? o() + i : i;
    }

    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.c((n() - this.h) - this.u);
        }
    }

    public final void e(boolean z) {
        this.w = true;
        if (z && this.p.b == 0) {
            A(o());
            B(this.c.length - this.l, this.g);
            int i = this.k;
            Arrays.fill(this.c, i, this.l + i, (Object) null);
            F();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList arrayList = this.d;
        HashMap map = this.e;
        d91 d91Var = this.f;
        l52 l52Var = this.a;
        if (!l52Var.k) {
            cp1.a("Unexpected writer close()");
        }
        l52Var.k = false;
        l52Var.e = iArr;
        l52Var.f = i2;
        l52Var.g = objArr;
        l52Var.h = i3;
        l52Var.m = arrayList;
        l52Var.n = map;
        l52Var.o = d91Var;
    }

    public final int f(int[] iArr, int i) {
        if (i >= n()) {
            return this.c.length - this.l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.c.length - this.l) + i2 + 1 : i2;
    }

    public final int g(int i) {
        return (this.l * (i < this.k ? 0 : 1)) + i;
    }

    public final void i() {
        p91 p91Var;
        boolean z = this.n > 0;
        int i = this.t;
        int i2 = this.u;
        int i3 = this.v;
        int iQ = q(i3);
        int i4 = this.o;
        int i5 = i - i3;
        int i6 = iQ * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.b[i7] & 1073741824) != 0;
        rr0 rr0Var = this.r;
        if (z) {
            d91 d91Var = this.s;
            if (d91Var != null && (p91Var = (p91) d91Var.b(i3)) != null) {
                Object[] objArr = p91Var.a;
                int i8 = p91Var.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    E(objArr[i9]);
                }
            }
            int[] iArr = this.b;
            iArr[i6 + 3] = i5;
            n52.f(iQ, i4, iArr);
            int iB = rr0Var.b();
            if (z2) {
                i4 = 1;
            }
            this.o = iB + i4;
            int iD = D(this.b, i3);
            this.v = iD;
            int iO = iD < 0 ? o() : q(iD + 1);
            int iF = iO >= 0 ? f(this.b, iO) : 0;
            this.i = iF;
            this.j = iF;
            return;
        }
        if (i != i2) {
            hv.a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.b;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        n52.f(iQ, i4, iArr2);
        int iB2 = this.p.b();
        this.u = (n() - this.h) - this.q.b();
        this.v = iB2;
        int iD2 = D(this.b, i3);
        int iB3 = rr0Var.b();
        this.o = iB3;
        if (iD2 == iB2) {
            this.o = iB3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (iD2 != 0 && iD2 != iB2 && (i14 != 0 || i13 != 0)) {
                int iQ2 = q(iD2);
                if (i13 != 0) {
                    int[] iArr3 = this.b;
                    int i15 = (iQ2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.b;
                    n52.f(iQ2, (iArr4[(iQ2 * 5) + 1] & 67108863) + i14, iArr4);
                }
                int[] iArr5 = this.b;
                if ((iArr5[(iQ2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                iD2 = D(iArr5, iD2);
            }
        }
        this.o += i14;
    }

    public final void j() {
        if (this.n <= 0) {
            cp1.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.r.b != this.p.b) {
                hv.a("startGroup/endGroup mismatch while inserting");
            }
            this.u = (n() - this.h) - this.q.b();
        }
    }

    public final void k(int i) {
        boolean z = false;
        if (!(this.n <= 0)) {
            hv.a("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z = true;
            }
            if (!z) {
                hv.a("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            O();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void l(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((o() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(q(i3) * 5) + 2] = i;
            int i4 = this.b[(q(i3) * 5) + 3] + i3;
            l(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0096  */
    public final void m(int i, ij0 ij0Var) {
        int i2;
        int i3;
        int i4;
        int iD = D(this.b, i);
        int iO = o();
        int iT = t(i) + i;
        int i5 = i;
        e91 e91Var = null;
        c91 c91Var = null;
        while (i5 < iT) {
            int iF = f(this.b, q(i5));
            int i6 = i5 + 1;
            int iF2 = f(this.b, q(i6));
            while (iF < iF2) {
                Object obj = this.c[g(iF)];
                if (obj instanceof ek0) {
                    ek0 ek0Var = (ek0) obj;
                    if (!(ek0Var instanceof ek0)) {
                        ek0Var = null;
                    }
                    if (ek0Var == null) {
                        hv.b("Inconsistent composition");
                        qj.e();
                        return;
                    }
                    int i7 = ek0Var.b;
                    if (i7 >= 0) {
                        int iT2 = t(i5) + i5;
                        int i8 = i6;
                        int i9 = 0;
                        while (i8 < iT2 && i9 < i7) {
                            int iQ = q(i8);
                            int i10 = iD;
                            int[] iArr = this.b;
                            int i11 = iQ * 5;
                            i8 = iArr[i11 + 3] + i8;
                            if (i8 < iT2 && (iArr[i11 + 1] & 536870912) == 0) {
                                i9++;
                            }
                            iD = i10;
                        }
                        i4 = iD;
                        if (e91Var == null) {
                            int[] iArr2 = pr0.a;
                            e91Var = new e91();
                        }
                        if (c91Var == null) {
                            c91Var = new c91();
                        }
                        e91Var.a(i8);
                        c91Var.a(i8);
                        c91Var.a(iF);
                    } else {
                        i4 = iD;
                        ij0Var.g(Integer.valueOf(iF), obj);
                    }
                } else {
                    i4 = iD;
                    ij0Var.g(Integer.valueOf(iF), obj);
                }
                iF++;
                iD = i4;
            }
            int i12 = iD;
            iD = i6 < iO ? D(this.b, i6) : -1;
            if (iD != i5) {
                int iD2 = i12;
                while (true) {
                    if (c91Var == null || e91Var == null || !e91Var.e(i5)) {
                        i2 = iO;
                    } else {
                        int i13 = c91Var.b;
                        int i14 = i13 / 2;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < i14) {
                            int i17 = i15 * 2;
                            int i18 = iO;
                            int iB = c91Var.b(i17);
                            if (iB == i5) {
                                int iB2 = c91Var.b(i17 + 1);
                                ij0Var.g(Integer.valueOf(iB2), this.c[g(iB2)]);
                            } else if (i17 != i16) {
                                int i19 = i16 + 1;
                                c91Var.d(i16, iB);
                                i16 += 2;
                                c91Var.d(i19, c91Var.b(i17 + 1));
                            } else {
                                i16 += 2;
                            }
                            i15++;
                            ij0Var = ij0Var;
                            iO = i18;
                        }
                        i2 = iO;
                        if (i16 != i13) {
                            if (i16 < 0 || i16 > (i3 = c91Var.b) || i13 < 0 || i13 > i3) {
                                qj.j("Index must be between 0 and size");
                                return;
                            }
                            if (i13 < i16) {
                                qj.r("The end index must be < start index");
                                return;
                            } else if (i13 != i16) {
                                if (i13 < i3) {
                                    int[] iArr3 = c91Var.a;
                                    ve.u0(i16, i13, i3, iArr3, iArr3);
                                }
                                c91Var.b -= i13 - i16;
                            }
                        }
                    }
                    if (i5 == i || iD2 == iD) {
                        break;
                    }
                    i5 = iD2;
                    iO = i2;
                    iD2 = D(this.b, iD2);
                    ij0Var = ij0Var;
                }
            } else {
                i2 = iO;
            }
            i5 = i6;
            iO = i2;
        }
    }

    public final int n() {
        return this.b.length / 5;
    }

    public final int o() {
        return n() - this.h;
    }

    public final Object p(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        int i2 = (iQ * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return cv.a;
        }
        return this.c[Integer.bitCount(iArr[i2] >> 29) + f(iArr, iQ)];
    }

    public final int q(int i) {
        return (this.h * (i < this.g ? 0 : 1)) + i;
    }

    public final int r(int i) {
        return this.b[q(i) * 5];
    }

    public final Object s(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        int i2 = iQ * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final int t(int i) {
        return this.b[(q(i) * 5) + 3];
    }

    public final String toString() {
        return "SlotWriter(current = " + this.t + " end=" + this.u + " size = " + o() + " gap=" + this.g + '-' + (this.g + this.h) + ')';
    }

    public final boolean u(int i, int i2) {
        int iN;
        int iT;
        if (i2 == this.v) {
            iN = this.u;
        } else {
            rr0 rr0Var = this.p;
            if (i2 > rr0Var.a(0)) {
                iT = t(i2);
            } else {
                int[] iArr = rr0Var.a;
                int iMin = Math.min(iArr.length, rr0Var.b);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    iT = t(i2);
                } else {
                    iN = (n() - this.h) - this.q.a[i3];
                }
            }
            iN = iT + i2;
        }
        return i > i2 && i < iN;
    }

    public final void v(int i) {
        if (i > 0) {
            int i2 = this.t;
            A(i2);
            int i3 = this.g;
            int i4 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                ve.u0(0, 0, i3 * 5, iArr, iArr2);
                ve.u0((i3 + i6) * 5, (i4 + i3) * 5, length * 5, iArr, iArr2);
                this.b = iArr2;
                i4 = i6;
                iArr = iArr2;
            }
            int i7 = this.u;
            if (i7 >= i3) {
                this.u = i7 + i;
            }
            int i8 = i3 + i;
            this.g = i8;
            this.h = i4 - i;
            int iH = h(i5 > 0 ? f(iArr, q(i2 + i)) : 0, this.m >= i3 ? this.k : 0, this.l, this.c.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.b[(i9 * 5) + 4] = iH;
            }
            int i10 = this.m;
            if (i10 >= i3) {
                this.m = i10 + i;
            }
        }
    }

    public final void w(int i, int i2) {
        if (i > 0) {
            B(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    public final boolean x(int i) {
        return (this.b[(q(i) * 5) + 1] & 1073741824) != 0;
    }

    public final void z(l52 l52Var, int i) {
        if (this.n <= 0) {
            hv.a("Check failed");
        }
        boolean z = false;
        byte b = 0;
        byte b2 = 0;
        if (i == 0 && this.t == 0 && this.a.f == 0) {
            int[] iArr = l52Var.e;
            int i2 = iArr[(i * 5) + 3];
            int i3 = l52Var.f;
            if (i2 == i3) {
                int[] iArr2 = this.b;
                Object[] objArr = this.c;
                ArrayList arrayList = this.d;
                HashMap map = this.e;
                d91 d91Var = this.f;
                Object[] objArr2 = l52Var.g;
                int i4 = l52Var.h;
                HashMap map2 = l52Var.n;
                d91 d91Var2 = l52Var.o;
                this.b = iArr;
                this.c = objArr2;
                this.d = l52Var.m;
                this.g = i3;
                this.h = (iArr.length / 5) - i3;
                this.k = i4;
                this.l = objArr2.length - i4;
                this.m = i3;
                this.e = map2;
                this.f = d91Var2;
                l52Var.e = iArr2;
                l52Var.f = b2 == true ? 1 : 0;
                l52Var.g = objArr;
                l52Var.h = b == true ? 1 : 0;
                l52Var.m = arrayList;
                l52Var.n = map;
                l52Var.o = d91Var;
                return;
            }
        }
        o52 o52VarD = l52Var.d();
        try {
            c22.k(o52VarD, i, this, true, true, false);
            boolean z2 = true;
        } finally {
            o52VarD.e(z);
        }
    }
}
