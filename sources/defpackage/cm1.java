package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cm1 extends d0 {
    public final Object[] e;
    public final Object[] f;
    public final int g;
    public final int h;

    public cm1(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.e = objArr;
        this.f = objArr2;
        this.g = i;
        this.h = i2;
        if (!(a() > 32)) {
            cp1.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    public static Object[] i(Object[] objArr, int i, int i2, Object obj, pf pfVar) {
        int iL = v12.l(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iL == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            ve.w0(objArr, objArrCopyOf, iL + 1, iL, 31);
            pfVar.a = objArr[31];
            objArrCopyOf[iL] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[iL];
        obj2.getClass();
        objArrCopyOf2[iL] = i((Object[]) obj2, i3, i2, obj, pfVar);
        while (true) {
            iL++;
            if (iL >= 32 || objArrCopyOf2[iL] == null) {
                break;
            }
            Object obj3 = objArr[iL];
            obj3.getClass();
            objArrCopyOf2[iL] = i((Object[]) obj3, i3, 0, pfVar.a, pfVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] k(Object[] objArr, int i, int i2, pf pfVar) {
        Object[] objArrK;
        int iL = v12.l(i2, i);
        if (i == 5) {
            pfVar.a = objArr[iL];
            objArrK = null;
        } else {
            Object obj = objArr[iL];
            obj.getClass();
            objArrK = k((Object[]) obj, i - 5, i2, pfVar);
        }
        if (objArrK == null && iL == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iL] = objArrK;
        return objArrCopyOf;
    }

    public static Object[] q(int i, int i2, Object obj, Object[] objArr) {
        int iL = v12.l(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iL] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iL];
        obj2.getClass();
        objArrCopyOf[iL] = q(i - 5, i2, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    @Override // defpackage.n
    public final int a() {
        return this.g;
    }

    @Override // defpackage.d0
    public final d0 b(int i, Object obj) {
        int i2 = this.g;
        sv.s(i, i2);
        if (i == i2) {
            return c(obj);
        }
        int iP = p();
        Object[] objArr = this.e;
        if (i >= iP) {
            return j(objArr, i - iP, obj);
        }
        pf pfVar = new pf(null);
        return j(i(objArr, this.h, i, obj, pfVar), 0, pfVar.a);
    }

    @Override // defpackage.d0
    public final d0 c(Object obj) {
        int iP = p();
        int i = this.g;
        int i2 = i - iP;
        Object[] objArr = this.e;
        Object[] objArr2 = this.f;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = obj;
            return new cm1(objArr, objArrCopyOf, i + 1, this.h);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return l(objArr, objArr2, objArr3);
    }

    @Override // defpackage.d0
    public final dm1 e() {
        return new dm1(this, this.e, this.f, this.h);
    }

    @Override // defpackage.d0
    public final d0 f(c0 c0Var) {
        dm1 dm1Var = new dm1(this, this.e, this.f, this.h);
        dm1Var.y(c0Var);
        return dm1Var.c();
    }

    @Override // defpackage.d0
    public final d0 g(int i) {
        sv.r(i, a());
        int iP = p();
        int i2 = this.h;
        Object[] objArr = this.e;
        return i >= iP ? o(objArr, iP, i2, i - iP) : o(n(objArr, i2, i, new pf(this.f[0])), iP, i2, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        sv.r(i, a());
        if (p() <= i) {
            objArr = this.f;
        } else {
            Object[] objArr2 = this.e;
            for (int i2 = this.h; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[v12.l(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.d0
    public final d0 h(int i, Object obj) {
        int i2 = this.g;
        sv.r(i, i2);
        int iP = p();
        Object[] objArr = this.e;
        Object[] objArr2 = this.f;
        int i3 = this.h;
        if (iP > i) {
            return new cm1(q(i3, i, obj, objArr), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new cm1(objArr, objArrCopyOf, i2, i3);
    }

    public final cm1 j(Object[] objArr, int i, Object obj) {
        int iP = p();
        int i2 = this.g;
        int i3 = i2 - iP;
        Object[] objArr2 = this.f;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            ve.w0(objArr2, objArrCopyOf, i + 1, i, i3);
            objArrCopyOf[i] = obj;
            return new cm1(objArr, objArrCopyOf, i2 + 1, this.h);
        }
        Object obj2 = objArr2[31];
        ve.w0(objArr2, objArrCopyOf, i + 1, i, i3 - 1);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return l(objArr, objArrCopyOf, objArr3);
    }

    public final cm1 l(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.g;
        int i2 = i >> 5;
        int i3 = this.h;
        if (i2 <= (1 << i3)) {
            return new cm1(m(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new cm1(m(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    @Override // defpackage.y, java.util.List
    public final ListIterator listIterator(int i) {
        sv.s(i, this.g);
        return new em1(this.e, this.f, i, this.g, (this.h / 5) + 1);
    }

    public final Object[] m(int i, Object[] objArr, Object[] objArr2) {
        int iL = v12.l(a() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iL] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iL] = m(i - 5, (Object[]) objArrCopyOf[iL], objArr2);
        return objArrCopyOf;
    }

    public final Object[] n(Object[] objArr, int i, int i2, pf pfVar) {
        int iL = v12.l(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iL == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            ve.w0(objArr, objArrCopyOf, iL, iL + 1, 32);
            objArrCopyOf[31] = pfVar.a;
            pfVar.a = objArr[iL];
            return objArrCopyOf;
        }
        int iL2 = objArr[31] == null ? v12.l(p() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iL + 1;
        if (i4 <= iL2) {
            while (true) {
                Object obj = objArrCopyOf2[iL2];
                obj.getClass();
                objArrCopyOf2[iL2] = n((Object[]) obj, i3, 0, pfVar);
                if (iL2 == i4) {
                    break;
                }
                iL2--;
            }
        }
        Object obj2 = objArrCopyOf2[iL];
        obj2.getClass();
        objArrCopyOf2[iL] = n((Object[]) obj2, i3, i2, pfVar);
        return objArrCopyOf2;
    }

    public final d0 o(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.g - i;
        if (i4 != 1) {
            Object[] objArr2 = this.f;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                ve.w0(objArr2, objArrCopyOf, i3, i3 + 1, i4);
            }
            objArrCopyOf[i5] = null;
            return new cm1(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new p52(objArr);
        }
        pf pfVar = new pf(null);
        Object[] objArrK = k(objArr, i2, i - 1, pfVar);
        objArrK.getClass();
        Object obj = pfVar.a;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrK[1] != null) {
            return new cm1(objArrK, objArr3, i, i2);
        }
        Object obj2 = objArrK[0];
        obj2.getClass();
        return new cm1((Object[]) obj2, objArr3, i, i2 - 5);
    }

    public final int p() {
        return (this.g - 1) & (-32);
    }
}
