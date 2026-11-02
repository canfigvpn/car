package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class le extends a0 {
    public static final Object[] h = new Object[0];
    public int e;
    public Object[] f;
    public int g;

    public le(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = h;
        } else {
            if (i <= 0) {
                qj.r(k3.i("Illegal Capacity: ", i));
                throw null;
            }
            objArr = new Object[i];
        }
        this.f = objArr;
    }

    @Override // defpackage.a0
    public final int a() {
        return this.g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.g;
        if (i < 0 || i > i2) {
            qj.j(k3.h(i, i2, "index: ", ", size: "));
            return;
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        k();
        d(this.g + 1);
        int iJ = j(this.e + i);
        int i3 = this.g;
        if (i < ((i3 + 1) >> 1)) {
            int length = iJ == 0 ? this.f.length - 1 : iJ - 1;
            int i4 = this.e;
            int length2 = i4 == 0 ? this.f.length - 1 : i4 - 1;
            Object[] objArr = this.f;
            if (length >= i4) {
                objArr[length2] = objArr[i4];
                ve.w0(objArr, objArr, i4, i4 + 1, length + 1);
            } else {
                ve.w0(objArr, objArr, i4 - 1, i4, objArr.length);
                Object[] objArr2 = this.f;
                objArr2[objArr2.length - 1] = objArr2[0];
                ve.w0(objArr2, objArr2, 0, 1, length + 1);
            }
            this.f[length] = obj;
            this.e = length2;
        } else {
            int iJ2 = j(i3 + this.e);
            Object[] objArr3 = this.f;
            if (iJ < iJ2) {
                ve.w0(objArr3, objArr3, iJ + 1, iJ, iJ2);
            } else {
                ve.w0(objArr3, objArr3, 1, 0, iJ2);
                Object[] objArr4 = this.f;
                objArr4[0] = objArr4[objArr4.length - 1];
                ve.w0(objArr4, objArr4, iJ + 1, iJ, objArr4.length - 1);
            }
            this.f[iJ] = obj;
        }
        this.g++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.g;
        if (i < 0 || i > i2) {
            qj.j(k3.h(i, i2, "index: ", ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.g) {
            return addAll(collection);
        }
        k();
        d(collection.size() + this.g);
        int iJ = j(this.g + this.e);
        int iJ2 = j(this.e + i);
        int size = collection.size();
        if (i >= ((this.g + 1) >> 1)) {
            int i3 = iJ2 + size;
            Object[] objArr = this.f;
            if (iJ2 < iJ) {
                int i4 = size + iJ;
                if (i4 <= objArr.length) {
                    ve.w0(objArr, objArr, i3, iJ2, iJ);
                } else if (i3 >= objArr.length) {
                    ve.w0(objArr, objArr, i3 - objArr.length, iJ2, iJ);
                } else {
                    int length = iJ - (i4 - objArr.length);
                    ve.w0(objArr, objArr, 0, length, iJ);
                    Object[] objArr2 = this.f;
                    ve.w0(objArr2, objArr2, i3, iJ2, length);
                }
            } else {
                ve.w0(objArr, objArr, size, 0, iJ);
                Object[] objArr3 = this.f;
                if (i3 >= objArr3.length) {
                    ve.w0(objArr3, objArr3, i3 - objArr3.length, iJ2, objArr3.length);
                } else {
                    ve.w0(objArr3, objArr3, 0, objArr3.length - size, objArr3.length);
                    Object[] objArr4 = this.f;
                    ve.w0(objArr4, objArr4, i3, iJ2, objArr4.length - size);
                }
            }
            c(iJ2, collection);
            return true;
        }
        int i5 = this.e;
        int length2 = i5 - size;
        Object[] objArr5 = this.f;
        if (iJ2 < i5) {
            ve.w0(objArr5, objArr5, length2, i5, objArr5.length);
            Object[] objArr6 = this.f;
            if (size >= iJ2) {
                ve.w0(objArr6, objArr6, objArr6.length - size, 0, iJ2);
            } else {
                ve.w0(objArr6, objArr6, objArr6.length - size, 0, size);
                Object[] objArr7 = this.f;
                ve.w0(objArr7, objArr7, 0, size, iJ2);
            }
        } else if (length2 >= 0) {
            ve.w0(objArr5, objArr5, length2, i5, iJ2);
        } else {
            length2 += objArr5.length;
            int i6 = iJ2 - i5;
            int length3 = objArr5.length - length2;
            if (length3 >= i6) {
                ve.w0(objArr5, objArr5, length2, i5, iJ2);
            } else {
                ve.w0(objArr5, objArr5, length2, i5, i5 + length3);
                Object[] objArr8 = this.f;
                ve.w0(objArr8, objArr8, 0, this.e + length3, iJ2);
            }
        }
        this.e = length2;
        c(h(iJ2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        k();
        d(this.g + 1);
        int length = this.e;
        if (length == 0) {
            length = this.f.length;
        }
        int i = length - 1;
        this.e = i;
        this.f[i] = obj;
        this.g++;
    }

    public final void addLast(Object obj) {
        k();
        d(this.g + 1);
        this.f[j(this.g + this.e)] = obj;
        this.g++;
    }

    @Override // defpackage.a0
    public final Object b(int i) {
        int i2 = this.g;
        if (i < 0 || i >= i2) {
            qj.j(k3.h(i, i2, "index: ", ", size: "));
            return null;
        }
        if (i == a() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        k();
        int iJ = j(this.e + i);
        Object[] objArr = this.f;
        Object obj = objArr[iJ];
        int i3 = this.g >> 1;
        int i4 = this.e;
        if (i < i3) {
            if (iJ >= i4) {
                ve.w0(objArr, objArr, i4 + 1, i4, iJ);
            } else {
                ve.w0(objArr, objArr, 1, 0, iJ);
                Object[] objArr2 = this.f;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.e;
                ve.w0(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.f;
            int i6 = this.e;
            objArr3[i6] = null;
            this.e = f(i6);
        } else {
            int iJ2 = j((a() - 1) + i4);
            Object[] objArr4 = this.f;
            if (iJ <= iJ2) {
                ve.w0(objArr4, objArr4, iJ, iJ + 1, iJ2 + 1);
            } else {
                ve.w0(objArr4, objArr4, iJ, iJ + 1, objArr4.length);
                Object[] objArr5 = this.f;
                objArr5[objArr5.length - 1] = objArr5[0];
                ve.w0(objArr5, objArr5, 0, 1, iJ2 + 1);
            }
            this.f[iJ2] = null;
        }
        this.g--;
        return obj;
    }

    public final void c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f.length;
        while (i < length && it.hasNext()) {
            this.f[i] = it.next();
            i++;
        }
        int i2 = this.e;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f[i3] = it.next();
        }
        this.g = collection.size() + this.g;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            k();
            i(this.e, j(this.g + this.e));
        }
        this.e = 0;
        this.g = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        if (i < 0) {
            fu1.h("Deque is too big.");
            return;
        }
        Object[] objArr = this.f;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == h) {
            if (i < 10) {
                i = 10;
            }
            this.f = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        ve.w0(objArr, objArr2, 0, this.e, objArr.length);
        Object[] objArr3 = this.f;
        int length2 = objArr3.length;
        int i3 = this.e;
        ve.w0(objArr3, objArr2, length2 - i3, 0, i3);
        this.e = 0;
        this.f = objArr2;
    }

    public final Object e() {
        if (isEmpty()) {
            return null;
        }
        return this.f[this.e];
    }

    public final int f(int i) {
        if (i == this.f.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.f[this.e];
        }
        fu1.k("ArrayDeque is empty.");
        return null;
    }

    public final Object g() {
        if (isEmpty()) {
            return null;
        }
        return this.f[j((a() - 1) + this.e)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.g;
        if (i >= 0 && i < i2) {
            return this.f[j(this.e + i)];
        }
        qj.j(k3.h(i, i2, "index: ", ", size: "));
        return null;
    }

    public final int h(int i) {
        return i < 0 ? i + this.f.length : i;
    }

    public final void i(int i, int i2) {
        Object[] objArr = this.f;
        if (i < i2) {
            Arrays.fill(objArr, i, i2, (Object) null);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            Arrays.fill(this.f, 0, i2, (Object) null);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iJ = j(this.g + this.e);
        int length = this.e;
        if (length < iJ) {
            while (length < iJ) {
                if (ws0.j(obj, this.f[length])) {
                    i = this.e;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.e) < iJ) {
            return -1;
        }
        int length2 = this.f.length;
        while (length < length2) {
            if (ws0.j(obj, this.f[length])) {
                i = this.e;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iJ; i2++) {
            if (ws0.j(obj, this.f[i2])) {
                length = i2 + this.f.length;
                i = this.e;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final int j(int i) {
        Object[] objArr = this.f;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void k() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (isEmpty()) {
            fu1.k("ArrayDeque is empty.");
            return null;
        }
        return this.f[j((a() - 1) + this.e)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr;
        int length;
        int i;
        int iJ = j(this.g + this.e);
        int i2 = this.e;
        if (i2 < iJ) {
            length = iJ - 1;
            if (i2 <= length) {
                while (!ws0.j(obj, this.f[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.e;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.e >= iJ) {
            do {
                iJ--;
                objArr = this.f;
                if (-1 >= iJ) {
                    length = objArr.length - 1;
                    int i3 = this.e;
                    if (i3 <= length) {
                        while (!ws0.j(obj, this.f[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.e;
                    }
                }
                return length - i;
            } while (!ws0.j(obj, objArr[iJ]));
            length = iJ + this.f.length;
            i = this.e;
            return length - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iJ;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f.length != 0) {
            int iJ2 = j(this.g + this.e);
            int i = this.e;
            if (i < iJ2) {
                iJ = i;
                while (true) {
                    objArr = this.f;
                    if (i >= iJ2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f[iJ] = obj;
                        iJ++;
                    }
                    i++;
                }
                Arrays.fill(objArr, iJ, iJ2, (Object) null);
            } else {
                int length = this.f.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iJ = j(i2);
                for (int i3 = 0; i3 < iJ2; i3++) {
                    Object[] objArr3 = this.f;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f[iJ] = obj3;
                        iJ = f(iJ);
                    }
                }
                z = z2;
            }
            if (z) {
                k();
                this.g = h(iJ - this.e);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            fu1.k("ArrayDeque is empty.");
            return null;
        }
        k();
        Object[] objArr = this.f;
        int i = this.e;
        Object obj = objArr[i];
        objArr[i] = null;
        this.e = f(i);
        this.g--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            fu1.k("ArrayDeque is empty.");
            return null;
        }
        k();
        int iJ = j((a() - 1) + this.e);
        Object[] objArr = this.f;
        Object obj = objArr[iJ];
        objArr[iJ] = null;
        this.g--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        nj2.j(i, i2, this.g);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.g) {
            clear();
            return;
        }
        if (i3 == 1) {
            b(i);
            return;
        }
        k();
        int i4 = this.g - i2;
        int i5 = this.e;
        int i6 = this.e;
        if (i < i4) {
            int iJ = j((i - 1) + i5);
            int iJ2 = j((i2 - 1) + i6);
            while (i > 0) {
                int i7 = iJ + 1;
                int iMin = Math.min(i, Math.min(i7, iJ2 + 1));
                Object[] objArr = this.f;
                int i8 = iJ2 - iMin;
                int i9 = iJ - iMin;
                ve.w0(objArr, objArr, i8 + 1, i9 + 1, i7);
                iJ = h(i9);
                iJ2 = h(i8);
                i -= iMin;
            }
            int iJ3 = j(this.e + i3);
            i(this.e, iJ3);
            this.e = iJ3;
        } else {
            int iJ4 = j(i5 + i2);
            int iJ5 = j(i6 + i);
            int i10 = this.g;
            while (true) {
                i10 -= i2;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f;
                i2 = Math.min(i10, Math.min(objArr2.length - iJ4, objArr2.length - iJ5));
                Object[] objArr3 = this.f;
                int i11 = iJ4 + i2;
                ve.w0(objArr3, objArr3, iJ5, iJ4, i11);
                iJ4 = j(i11);
                iJ5 = j(iJ5 + i2);
            }
            int iJ6 = j(this.g + this.e);
            i(h(iJ6 - i3), iJ6);
        }
        this.g -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iJ;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f.length != 0) {
            int iJ2 = j(this.g + this.e);
            int i = this.e;
            if (i < iJ2) {
                iJ = i;
                while (true) {
                    objArr = this.f;
                    if (i >= iJ2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.f[iJ] = obj;
                        iJ++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(objArr, iJ, iJ2, (Object) null);
            } else {
                int length = this.f.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.f[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iJ = j(i2);
                for (int i3 = 0; i3 < iJ2; i3++) {
                    Object[] objArr3 = this.f;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f[iJ] = obj3;
                        iJ = f(iJ);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                k();
                this.g = h(iJ - this.e);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.g;
        if (i < 0 || i >= i2) {
            qj.j(k3.h(i, i2, "index: ", ", size: "));
            return null;
        }
        int iJ = j(this.e + i);
        Object[] objArr = this.f;
        Object obj2 = objArr[iJ];
        objArr[iJ] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.g;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iJ = j(this.g + this.e);
        int i2 = this.e;
        if (i2 < iJ) {
            ve.y0(this.f, objArr, i2, iJ, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f;
            ve.w0(objArr2, objArr, 0, this.e, objArr2.length);
            Object[] objArr3 = this.f;
            ve.w0(objArr3, objArr, objArr3.length - this.e, 0, iJ);
        }
        int i3 = this.g;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public le() {
        this.f = h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        k();
        d(collection.size() + this.g);
        c(j(this.g + this.e), collection);
        return true;
    }
}
