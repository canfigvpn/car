package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class re implements Collection {
    public final /* synthetic */ se e;

    public re(se seVar) {
        this.e = seVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.e.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.e.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.e.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new oe(this.e, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        se seVar = this.e;
        int iA = seVar.a(obj);
        if (iA < 0) {
            return false;
        }
        seVar.f(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        se seVar = this.e;
        int i = seVar.g;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(seVar.h(i2))) {
                seVar.f(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        se seVar = this.e;
        int i = seVar.g;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(seVar.h(i2))) {
                seVar.f(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.e.g;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        se seVar = this.e;
        int i = seVar.g;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = seVar.h(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        se seVar = this.e;
        int i = seVar.g;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = seVar.h(i2);
        }
        return objArr;
    }
}
