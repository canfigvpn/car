package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class dm1 extends a0 implements Collection, gv0 {
    public d0 e;
    public Object[] f;
    public Object[] g;
    public int h;
    public w40 i = new w40(17);
    public Object[] j;
    public Object[] k;
    public int l;

    public dm1(d0 d0Var, Object[] objArr, Object[] objArr2, int i) {
        this.e = d0Var;
        this.f = objArr;
        this.g = objArr2;
        this.h = i;
        this.j = objArr;
        this.k = objArr2;
        this.l = d0Var.a();
    }

    public static void d(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object A(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.l - i;
        Object[] objArr2 = this.k;
        if (i4 == 1) {
            Object obj = objArr2[0];
            q(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrK = k(objArr2);
        ve.w0(objArr2, objArrK, i3, i3 + 1, i4);
        objArrK[i4 - 1] = null;
        this.j = objArr;
        this.k = objArrK;
        this.l = (i + i4) - 1;
        this.h = i2;
        return obj2;
    }

    public final int B() {
        int i = this.l;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] C(Object[] objArr, int i, int i2, Object obj, pf pfVar) {
        int iL = v12.l(i2, i);
        Object[] objArrK = k(objArr);
        if (i != 0) {
            Object obj2 = objArrK[iL];
            obj2.getClass();
            objArrK[iL] = C((Object[]) obj2, i - 5, i2, obj, pfVar);
            return objArrK;
        }
        if (objArrK != objArr) {
            ((AbstractList) this).modCount++;
        }
        pfVar.a = objArrK[iL];
        objArrK[iL] = obj;
        return objArrK;
    }

    public final void D(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrM;
        if (i3 < 1) {
            cp1.a("requires at least one nullBuffer");
        }
        Object[] objArrK = k(objArr);
        objArr2[0] = objArrK;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            ve.w0(objArrK, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrM = objArrK;
            } else {
                objArrM = m();
                i3--;
                objArr2[i3] = objArrM;
            }
            int i7 = i2 - i6;
            ve.w0(objArrK, objArr3, 0, i7, i2);
            ve.w0(objArrK, objArrM, size + 1, i4, i7);
            objArr3 = objArrM;
        }
        Iterator it = collection.iterator();
        d(objArrK, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrM2 = m();
            d(objArrM2, 0, it);
            objArr2[i8] = objArrM2;
        }
        d(objArr3, 0, it);
    }

    public final int E() {
        int i = this.l;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // defpackage.a0
    public final int a() {
        return this.l;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        sv.s(i, a());
        if (i == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iB = B();
        if (i >= iB) {
            h(this.j, i - iB, obj);
            return;
        }
        pf pfVar = new pf(null);
        Object[] objArr = this.j;
        objArr.getClass();
        h(g(objArr, this.h, i, obj, pfVar), 0, pfVar.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrM;
        sv.s(i, this.l);
        if (i == this.l) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.l - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.k;
            Object[] objArrK = k(objArr);
            ve.w0(objArr, objArrK, size2 + 1, i3, E());
            d(objArrK, i3, collection.iterator());
            this.k = objArrK;
            this.l = collection.size() + this.l;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iE = E();
        int size3 = collection.size() + this.l;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= B()) {
            objArrM = m();
            collection2 = collection;
            D(collection2, i, this.k, iE, objArr2, size, objArrM);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.k;
            if (size3 > iE) {
                int i4 = size3 - iE;
                Object[] objArrL = l(i4, objArr3);
                f(collection2, i, i4, objArr2, size, objArrL);
                objArr2 = objArr2;
                objArrM = objArrL;
            } else {
                objArrM = m();
                int i5 = iE - size3;
                ve.w0(objArr3, objArrM, 0, i5, iE);
                int i6 = 32 - i5;
                Object[] objArrL2 = l(i6, this.k);
                int i7 = size - 1;
                objArr2[i7] = objArrL2;
                f(collection2, i, i6, objArr2, i7, objArrL2);
                collection2 = collection2;
            }
        }
        this.j = s(this.j, i2, objArr2);
        this.k = objArrM;
        this.l = collection2.size() + this.l;
        return true;
    }

    @Override // defpackage.a0
    public final Object b(int i) {
        sv.r(i, a());
        ((AbstractList) this).modCount++;
        int iB = B();
        if (i >= iB) {
            return A(this.j, iB, this.h, i - iB);
        }
        pf pfVar = new pf(this.k[0]);
        Object[] objArr = this.j;
        objArr.getClass();
        A(z(objArr, this.h, i, pfVar), iB, this.h, 0);
        return pfVar.a;
    }

    public final d0 c() {
        d0 cm1Var;
        Object[] objArr = this.j;
        if (objArr == this.f && this.k == this.g) {
            cm1Var = this.e;
        } else {
            this.i = new w40(17);
            this.f = objArr;
            Object[] objArr2 = this.k;
            this.g = objArr2;
            if (objArr == null) {
                cm1Var = objArr2.length == 0 ? p52.f : new p52(Arrays.copyOf(objArr2, this.l));
            } else {
                cm1Var = new cm1(objArr, objArr2, this.l, this.h);
            }
        }
        this.e = cm1Var;
        return cm1Var;
    }

    public final int e() {
        return ((AbstractList) this).modCount;
    }

    public final void f(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.j == null) {
            fu1.h("root is null");
            return;
        }
        int i4 = i >> 5;
        z zVarJ = j(B() >> 5);
        int i5 = i3;
        Object[] objArrL = objArr2;
        while (zVarJ.e - 1 != i4) {
            Object[] objArr3 = (Object[]) zVarJ.previous();
            ve.w0(objArr3, objArrL, 0, 32 - i2, 32);
            objArrL = l(i2, objArr3);
            i5--;
            objArr[i5] = objArrL;
        }
        Object[] objArr4 = (Object[]) zVarJ.previous();
        int iB = i3 - (((B() >> 5) - 1) - i4);
        if (iB < i3) {
            objArr2 = objArr[iB];
            objArr2.getClass();
        }
        D(collection, i, objArr4, 32, objArr, iB, objArr2);
    }

    public final Object[] g(Object[] objArr, int i, int i2, Object obj, pf pfVar) {
        Object obj2;
        int iL = v12.l(i2, i);
        if (i == 0) {
            pfVar.a = objArr[31];
            Object[] objArrK = k(objArr);
            ve.w0(objArr, objArrK, iL + 1, iL, 31);
            objArrK[iL] = obj;
            return objArrK;
        }
        Object[] objArrK2 = k(objArr);
        int i3 = i - 5;
        Object obj3 = objArrK2[iL];
        obj3.getClass();
        objArrK2[iL] = g((Object[]) obj3, i3, i2, obj, pfVar);
        while (true) {
            iL++;
            if (iL >= 32 || (obj2 = objArrK2[iL]) == null) {
                break;
            }
            objArrK2[iL] = g((Object[]) obj2, i3, 0, pfVar.a, pfVar);
        }
        return objArrK2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        sv.r(i, a());
        if (B() <= i) {
            objArr = this.k;
        } else {
            Object[] objArr2 = this.j;
            objArr2.getClass();
            for (int i2 = this.h; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[v12.l(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final void h(Object[] objArr, int i, Object obj) {
        int iE = E();
        Object[] objArrK = k(this.k);
        Object[] objArr2 = this.k;
        if (iE >= 32) {
            Object obj2 = objArr2[31];
            ve.w0(objArr2, objArrK, i + 1, i, 31);
            objArrK[i] = obj;
            t(objArr, objArrK, n(obj2));
            return;
        }
        ve.w0(objArr2, objArrK, i + 1, i, iE);
        objArrK[i] = obj;
        this.j = objArr;
        this.k = objArrK;
        this.l++;
    }

    public final boolean i(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final z j(int i) {
        Object[] objArr = this.j;
        if (objArr == null) {
            fu1.h("Invalid root");
            return null;
        }
        int iB = B() >> 5;
        sv.s(i, iB);
        int i2 = this.h;
        return i2 == 0 ? new uk(i, objArr) : new vi2(objArr, i, iB, i2 / 5);
    }

    public final Object[] k(Object[] objArr) {
        if (objArr == null) {
            return m();
        }
        if (i(objArr)) {
            return objArr;
        }
        Object[] objArrM = m();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        ve.y0(objArr, objArrM, 0, length, 6);
        return objArrM;
    }

    public final Object[] l(int i, Object[] objArr) {
        if (i(objArr)) {
            ve.w0(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        Object[] objArrM = m();
        ve.w0(objArr, objArrM, i, 0, 32 - i);
        return objArrM;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        sv.s(i, this.l);
        return new fm1(this, i);
    }

    public final Object[] m() {
        Object[] objArr = new Object[33];
        objArr[32] = this.i;
        return objArr;
    }

    public final Object[] n(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.i;
        return objArr;
    }

    public final Object[] o(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            cp1.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iL = v12.l(i, i2);
        Object obj = objArr[iL];
        obj.getClass();
        Object objO = o((Object[]) obj, i, i2 - 5);
        if (iL < 31) {
            int i3 = iL + 1;
            if (objArr[i3] != null) {
                if (i(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrM = m();
                ve.w0(objArr, objArrM, 0, 0, i3);
                objArr = objArrM;
            }
        }
        if (objO == objArr[iL]) {
            return objArr;
        }
        Object[] objArrK = k(objArr);
        objArrK[iL] = objO;
        return objArrK;
    }

    public final Object[] p(Object[] objArr, int i, int i2, pf pfVar) {
        Object[] objArrP;
        int iL = v12.l(i2 - 1, i);
        if (i == 5) {
            pfVar.a = objArr[iL];
            objArrP = null;
        } else {
            Object obj = objArr[iL];
            obj.getClass();
            objArrP = p((Object[]) obj, i - 5, i2, pfVar);
        }
        if (objArrP == null && iL == 0) {
            return null;
        }
        Object[] objArrK = k(objArr);
        objArrK[iL] = objArrP;
        return objArrK;
    }

    public final void q(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.j = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.k = objArr;
            this.l = i;
            this.h = i2;
            return;
        }
        pf pfVar = new pf(null);
        objArr.getClass();
        Object[] objArrP = p(objArr, i2, i, pfVar);
        objArrP.getClass();
        Object obj = pfVar.a;
        obj.getClass();
        this.k = (Object[]) obj;
        this.l = i;
        if (objArrP[1] == null) {
            this.j = (Object[]) objArrP[0];
            this.h = i2 - 5;
        } else {
            this.j = objArrP;
            this.h = i2;
        }
    }

    public final Object[] r(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            cp1.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            cp1.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrK = k(objArr);
        int iL = v12.l(i, i2);
        int i3 = i2 - 5;
        objArrK[iL] = r((Object[]) objArrK[iL], i, i3, it);
        while (true) {
            iL++;
            if (iL >= 32 || !it.hasNext()) {
                break;
            }
            objArrK[iL] = r((Object[]) objArrK[iL], 0, i3, it);
        }
        return objArrK;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return y(new c0(1, collection));
    }

    public final Object[] s(Object[] objArr, int i, Object[][] objArr2) {
        v vVar = new v(1, objArr2);
        int i2 = i >> 5;
        int i3 = this.h;
        Object[] objArrR = i2 < (1 << i3) ? r(objArr, i, i3, vVar) : k(objArr);
        while (vVar.hasNext()) {
            this.h += 5;
            objArrR = n(objArrR);
            int i4 = this.h;
            r(objArrR, 1 << i4, i4, vVar);
        }
        return objArrR;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        sv.r(i, a());
        if (B() > i) {
            pf pfVar = new pf(null);
            Object[] objArr = this.j;
            objArr.getClass();
            this.j = C(objArr, this.h, i, obj, pfVar);
            return pfVar.a;
        }
        Object[] objArrK = k(this.k);
        if (objArrK != this.k) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrK[i2];
        objArrK[i2] = obj;
        this.k = objArrK;
        return obj2;
    }

    public final void t(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.l;
        int i2 = i >> 5;
        int i3 = this.h;
        if (i2 > (1 << i3)) {
            this.j = u(this.h + 5, n(objArr), objArr2);
            this.k = objArr3;
            this.h += 5;
            this.l++;
            return;
        }
        if (objArr == null) {
            this.j = objArr2;
            this.k = objArr3;
            this.l = i + 1;
        } else {
            this.j = u(i3, objArr, objArr2);
            this.k = objArr3;
            this.l++;
        }
    }

    public final Object[] u(int i, Object[] objArr, Object[] objArr2) {
        int iL = v12.l(a() - 1, i);
        Object[] objArrK = k(objArr);
        if (i == 5) {
            objArrK[iL] = objArr2;
            return objArrK;
        }
        objArrK[iL] = u(i - 5, (Object[]) objArrK[iL], objArr2);
        return objArrK;
    }

    public final int v(ej0 ej0Var, Object[] objArr, int i, int i2, pf pfVar, ArrayList arrayList, ArrayList arrayList2) {
        if (i(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = pfVar.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrM = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) ej0Var.h(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrM = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m();
                    i2 = 0;
                }
                objArrM[i2] = obj2;
                i2++;
            }
        }
        pfVar.a = objArrM;
        if (objArr2 != objArrM) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int w(ej0 ej0Var, Object[] objArr, int i, pf pfVar) {
        Object[] objArrK = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) ej0Var.h(obj)).booleanValue()) {
                if (!z) {
                    objArrK = k(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrK[i2] = obj;
                i2++;
            }
        }
        pfVar.a = objArrK;
        return i2;
    }

    public final int x(ej0 ej0Var, int i, pf pfVar) {
        int iW = w(ej0Var, this.k, i, pfVar);
        Object obj = pfVar.a;
        if (iW == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iW, i, (Object) null);
        this.k = objArr;
        this.l -= i - iW;
        return iW;
    }

    public final boolean y(ej0 ej0Var) {
        int i;
        ej0 ej0Var2 = ej0Var;
        int iE = E();
        Object[] objArrO = null;
        pf pfVar = new pf(null);
        boolean z = false;
        if (this.j != null) {
            z zVarJ = j(0);
            int iW = 32;
            while (iW == 32 && zVarJ.hasNext()) {
                iW = w(ej0Var2, (Object[]) zVarJ.next(), 32, pfVar);
            }
            if (iW == 32) {
                int iX = x(ej0Var2, iE, pfVar);
                if (iX == 0) {
                    q(this.j, this.l, this.h);
                }
                if (iX != iE) {
                }
            } else {
                int i2 = (zVarJ.e - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iV = iW;
                while (zVarJ.hasNext()) {
                    iV = v(ej0Var2, (Object[]) zVarJ.next(), 32, iV, pfVar, arrayList2, arrayList);
                    ej0Var2 = ej0Var;
                }
                int iV2 = v(ej0Var, this.k, iE, iV, pfVar, arrayList2, arrayList);
                Object obj = pfVar.a;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iV2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrR = this.j;
                if (zIsEmpty) {
                    objArrR.getClass();
                } else {
                    objArrR = r(objArrR, i2, this.h, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    cp1.a("invalid size");
                }
                if (size == 0) {
                    this.h = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.h;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.h = i - 5;
                        Object[] objArr2 = objArrR[0];
                        objArr2.getClass();
                        objArrR = objArr2;
                    }
                    objArrO = o(objArrR, i3, i);
                }
                this.j = objArrO;
                this.k = objArr;
                this.l = size + iV2;
            }
            z = true;
        } else if (x(ej0Var2, iE, pfVar) != iE) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] z(Object[] objArr, int i, int i2, pf pfVar) {
        int iL = v12.l(i2, i);
        if (i == 0) {
            Object obj = objArr[iL];
            Object[] objArrK = k(objArr);
            ve.w0(objArr, objArrK, iL, iL + 1, 32);
            objArrK[31] = pfVar.a;
            pfVar.a = obj;
            return objArrK;
        }
        int iL2 = objArr[31] == null ? v12.l(B() - 1, i) : 31;
        Object[] objArrK2 = k(objArr);
        int i3 = i - 5;
        int i4 = iL + 1;
        if (i4 <= iL2) {
            while (true) {
                Object obj2 = objArrK2[iL2];
                obj2.getClass();
                objArrK2[iL2] = z((Object[]) obj2, i3, 0, pfVar);
                if (iL2 == i4) {
                    break;
                }
                iL2--;
            }
        }
        Object obj3 = objArrK2[iL];
        obj3.getClass();
        objArrK2[iL] = z((Object[]) obj3, i3, i2, pfVar);
        return objArrK2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iE = E();
        if (iE < 32) {
            Object[] objArrK = k(this.k);
            objArrK[iE] = obj;
            this.k = objArrK;
            this.l = a() + 1;
        } else {
            t(this.j, this.k, n(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iE = E();
        Iterator it = collection.iterator();
        if (32 - iE >= collection.size()) {
            Object[] objArrK = k(this.k);
            d(objArrK, iE, it);
            this.k = objArrK;
            this.l = collection.size() + this.l;
            return true;
        }
        int size = ((collection.size() + iE) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrK2 = k(this.k);
        d(objArrK2, iE, it);
        objArr[0] = objArrK2;
        for (int i = 1; i < size; i++) {
            Object[] objArrM = m();
            d(objArrM, 0, it);
            objArr[i] = objArrM;
        }
        this.j = s(this.j, B(), objArr);
        Object[] objArrM2 = m();
        d(objArrM2, 0, it);
        this.k = objArrM2;
        this.l = collection.size() + this.l;
        return true;
    }
}
