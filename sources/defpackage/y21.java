package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class y21 extends a0 implements RandomAccess, Serializable {
    public Object[] e;
    public final int f;
    public int g;
    public final y21 h;
    public final z21 i;

    public y21(Object[] objArr, int i, int i2, y21 y21Var, z21 z21Var) {
        objArr.getClass();
        this.e = objArr;
        this.f = i;
        this.g = i2;
        this.h = y21Var;
        this.i = z21Var;
        ((AbstractList) this).modCount = ((AbstractList) z21Var).modCount;
    }

    @Override // defpackage.a0
    public final int a() {
        f();
        return this.g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        f();
        int i2 = this.g;
        if (i < 0 || i > i2) {
            qj.j(k3.h(i, i2, "index: ", ", size: "));
        } else {
            e(this.f + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        g();
        f();
        int i2 = this.g;
        if (i < 0 || i > i2) {
            qj.j(k3.h(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        d(this.f + i, collection, size);
        return size > 0;
    }

    @Override // defpackage.a0
    public final Object b(int i) {
        g();
        f();
        int i2 = this.g;
        if (i >= 0 && i < i2) {
            return h(this.f + i);
        }
        qj.j(k3.h(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        i(this.f, this.g);
    }

    public final void d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        z21 z21Var = this.i;
        y21 y21Var = this.h;
        if (y21Var != null) {
            y21Var.d(i, collection, i2);
        } else {
            z21 z21Var2 = z21.h;
            z21Var.d(i, collection, i2);
        }
        this.e = z21Var.e;
        this.g += i2;
    }

    public final void e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        z21 z21Var = this.i;
        y21 y21Var = this.h;
        if (y21Var != null) {
            y21Var.e(i, obj);
        } else {
            z21 z21Var2 = z21.h;
            z21Var.e(i, obj);
        }
        this.e = z21Var.e;
        this.g++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.e;
            int i = this.g;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (ws0.j(objArr[this.f + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (((AbstractList) this.i).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void g() {
        if (this.i.g) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        f();
        int i2 = this.g;
        if (i >= 0 && i < i2) {
            return this.e[this.f + i];
        }
        qj.j(k3.h(i, i2, "index: ", ", size: "));
        return null;
    }

    public final Object h(int i) {
        Object objH;
        ((AbstractList) this).modCount++;
        y21 y21Var = this.h;
        if (y21Var != null) {
            objH = y21Var.h(i);
        } else {
            z21 z21Var = z21.h;
            objH = this.i.h(i);
        }
        this.g--;
        return objH;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        Object[] objArr = this.e;
        int i = this.g;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.f + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        y21 y21Var = this.h;
        if (y21Var != null) {
            y21Var.i(i, i2);
        } else {
            z21 z21Var = z21.h;
            this.i.i(i, i2);
        }
        this.g -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i = 0; i < this.g; i++) {
            if (ws0.j(this.e[this.f + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        return this.g == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i, int i2, Collection collection, boolean z) {
        int iJ;
        y21 y21Var = this.h;
        if (y21Var != null) {
            iJ = y21Var.j(i, i2, collection, z);
        } else {
            z21 z21Var = z21.h;
            iJ = this.i.j(i, i2, collection, z);
        }
        if (iJ > 0) {
            ((AbstractList) this).modCount++;
        }
        this.g -= iJ;
        return iJ;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i = this.g - 1; i >= 0; i--) {
            if (ws0.j(this.e[this.f + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        f();
        int i2 = this.g;
        if (i >= 0 && i <= i2) {
            return new tm0(this, i);
        }
        qj.j(k3.h(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
        f();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        g();
        f();
        return j(this.f, this.g, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        g();
        f();
        return j(this.f, this.g, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        f();
        int i2 = this.g;
        if (i < 0 || i >= i2) {
            qj.j(k3.h(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.e;
        int i3 = this.f;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        nj2.j(i, i2, this.g);
        return new y21(this.e, this.f + i, i2 - i, this, this.i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        f();
        int length = objArr.length;
        int i = this.g;
        Object[] objArr2 = this.e;
        int i2 = this.f;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        ve.w0(objArr2, objArr, 0, i2, i + i2);
        int i3 = this.g;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return ux.G(this.e, this.f, this.g, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.f + this.g, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.e;
        int i = this.g;
        int i2 = this.f;
        return ve.z0(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        g();
        f();
        int size = collection.size();
        d(this.f + this.g, collection, size);
        return size > 0;
    }
}
