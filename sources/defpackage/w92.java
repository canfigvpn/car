package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class w92 implements List, gv0 {
    public final h72 e;
    public final int f;
    public int g;
    public int h;

    public w92(h72 h72Var, int i, int i2) {
        this.e = h72Var;
        this.f = i;
        this.g = nj2.s(h72Var);
        this.h = i2 - i;
    }

    public final void a() {
        if (nj2.s(this.e) != this.g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.f + this.h;
        h72 h72Var = this.e;
        h72Var.add(i, obj);
        this.h++;
        this.g = nj2.s(h72Var);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i2 = i + this.f;
        h72 h72Var = this.e;
        boolean zAddAll = h72Var.addAll(i2, collection);
        if (zAddAll) {
            this.h = collection.size() + this.h;
            this.g = nj2.s(h72Var);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.h > 0) {
            a();
            int i = this.h;
            int i2 = this.f;
            h72 h72Var = this.e;
            h72Var.c(i2, i + i2);
            this.h = 0;
            this.g = nj2.s(h72Var);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        nj2.I(i, this.h);
        return this.e.get(this.f + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i = this.h;
        int i2 = this.f;
        Iterator it = ex.S(i2, i + i2).iterator();
        while (((kr0) it).g) {
            int iNextInt = ((er0) it).nextInt();
            if (ws0.j(obj, this.e.get(iNextInt))) {
                return iNextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.h == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.h;
        int i2 = this.f;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (ws0.j(obj, this.e.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        es1 es1Var = new es1();
        es1Var.e = i - 1;
        return new cu1(es1Var, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i2 = this.f + i;
        h72 h72Var = this.e;
        Object objRemove = h72Var.remove(i2);
        this.h--;
        this.g = nj2.s(h72Var);
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        d0 d0Var;
        o62 o62VarH;
        boolean zH;
        a();
        h72 h72Var = this.e;
        int i2 = this.f;
        int i3 = this.h + i2;
        int size = h72Var.size();
        do {
            synchronized (nj2.A0) {
                u82 u82Var = h72Var.e;
                u82Var.getClass();
                u82 u82Var2 = (u82) x62.f(u82Var);
                i = u82Var2.d;
                d0Var = u82Var2.c;
            }
            d0Var.getClass();
            dm1 dm1VarE = d0Var.e();
            dm1VarE.subList(i2, i3).retainAll(collection);
            d0 d0VarC = dm1VarE.c();
            if (ws0.j(d0VarC, d0Var)) {
                break;
            }
            u82 u82Var3 = h72Var.e;
            u82Var3.getClass();
            synchronized (x62.c) {
                o62VarH = x62.h();
                zH = nj2.h((u82) x62.w(u82Var3, h72Var, o62VarH), i, d0VarC, true);
            }
            x62.l(o62VarH, h72Var);
        } while (!zH);
        int size2 = size - h72Var.size();
        if (size2 > 0) {
            this.g = nj2.s(this.e);
            this.h -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        nj2.I(i, this.h);
        a();
        int i2 = i + this.f;
        h72 h72Var = this.e;
        Object obj2 = h72Var.set(i2, obj);
        this.g = nj2.s(h72Var);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.h;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.h) {
            cp1.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i3 = this.f;
        return new w92(this.e, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return p61.n0(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return p61.o0(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        int i2 = this.f + i;
        h72 h72Var = this.e;
        h72Var.add(i2, obj);
        this.h++;
        this.g = nj2.s(h72Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.h, collection);
    }
}
