package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class tm0 implements ListIterator, fv0 {
    public final /* synthetic */ int e;
    public int f;
    public int g;
    public int h;
    public final Object i;

    public tm0(h72 h72Var, int i) {
        this.e = 3;
        this.i = h72Var;
        this.f = i - 1;
        this.g = -1;
        this.h = nj2.s(h72Var);
    }

    public void a() {
        if (((AbstractList) ((y21) this.i).i).modCount != this.h) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                y21 y21Var = (y21) obj2;
                int i2 = this.f;
                this.f = i2 + 1;
                y21Var.add(i2, obj);
                this.g = -1;
                this.h = ((AbstractList) y21Var).modCount;
                return;
            case 2:
                b();
                z21 z21Var = (z21) obj2;
                int i3 = this.f;
                this.f = i3 + 1;
                z21Var.add(i3, obj);
                this.g = -1;
                this.h = ((AbstractList) z21Var).modCount;
                return;
            default:
                c();
                h72 h72Var = (h72) obj2;
                h72Var.add(this.f + 1, obj);
                this.g = -1;
                this.f++;
                this.h = nj2.s(h72Var);
                return;
        }
    }

    public void b() {
        if (((AbstractList) ((z21) this.i)).modCount != this.h) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (nj2.s((h72) this.i) != this.h) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.e;
        Object obj = this.i;
        switch (i) {
            case 0:
                return this.f < this.h;
            case 1:
                return this.f < ((y21) obj).g;
            case 2:
                return this.f < ((z21) obj).f;
            default:
                return this.f < ((h72) obj).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.e) {
            case 0:
                return this.f > this.g;
            case 1:
                return this.f > 0;
            case 2:
                return this.f > 0;
            default:
                return this.f >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.e;
        Object obj = this.i;
        switch (i) {
            case 0:
                p91 p91Var = ((vm0) obj).e;
                int i2 = this.f;
                this.f = i2 + 1;
                Object objF = p91Var.f(i2);
                objF.getClass();
                return (t71) objF;
            case 1:
                a();
                int i3 = this.f;
                y21 y21Var = (y21) obj;
                if (i3 >= y21Var.g) {
                    qj.t();
                    return null;
                }
                this.f = i3 + 1;
                this.g = i3;
                return y21Var.e[y21Var.f + i3];
            case 2:
                b();
                int i4 = this.f;
                z21 z21Var = (z21) obj;
                if (i4 >= z21Var.f) {
                    qj.t();
                    return null;
                }
                this.f = i4 + 1;
                this.g = i4;
                return z21Var.e[i4];
            default:
                c();
                int i5 = this.f + 1;
                this.g = i5;
                h72 h72Var = (h72) obj;
                nj2.I(i5, h72Var.size());
                Object obj2 = h72Var.get(i5);
                this.f = i5;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.e) {
            case 0:
                return this.f - this.g;
            case 1:
                return this.f;
            case 2:
                return this.f;
            default:
                return this.f + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.e;
        Object obj = this.i;
        switch (i) {
            case 0:
                p91 p91Var = ((vm0) obj).e;
                int i2 = this.f - 1;
                this.f = i2;
                Object objF = p91Var.f(i2);
                objF.getClass();
                return (t71) objF;
            case 1:
                a();
                int i3 = this.f;
                if (i3 <= 0) {
                    qj.t();
                    return null;
                }
                int i4 = i3 - 1;
                this.f = i4;
                this.g = i4;
                y21 y21Var = (y21) obj;
                return y21Var.e[y21Var.f + i4];
            case 2:
                b();
                int i5 = this.f;
                if (i5 <= 0) {
                    qj.t();
                    return null;
                }
                int i6 = i5 - 1;
                this.f = i6;
                this.g = i6;
                return ((z21) obj).e[i6];
            default:
                c();
                h72 h72Var = (h72) obj;
                nj2.I(this.f, h72Var.size());
                int i7 = this.f;
                this.g = i7;
                Object obj2 = h72Var.get(i7);
                this.f--;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.e) {
            case 0:
                return (this.f - this.g) - 1;
            case 1:
                i = this.f;
                break;
            case 2:
                i = this.f;
                break;
            default:
                return this.f;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.e;
        Object obj = this.i;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                y21 y21Var = (y21) obj;
                a();
                int i2 = this.g;
                if (i2 == -1) {
                    fu1.h("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                y21Var.b(i2);
                this.f = this.g;
                this.g = -1;
                this.h = ((AbstractList) y21Var).modCount;
                return;
            case 2:
                z21 z21Var = (z21) obj;
                b();
                int i3 = this.g;
                if (i3 == -1) {
                    fu1.h("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                z21Var.b(i3);
                this.f = this.g;
                this.g = -1;
                this.h = ((AbstractList) z21Var).modCount;
                return;
            default:
                c();
                h72 h72Var = (h72) obj;
                h72Var.remove(this.g);
                this.f--;
                this.g = -1;
                this.h = nj2.s(h72Var);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i2 = this.g;
                if (i2 != -1) {
                    ((y21) obj2).set(i2, obj);
                    return;
                } else {
                    fu1.h("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                b();
                int i3 = this.g;
                if (i3 != -1) {
                    ((z21) obj2).set(i3, obj);
                    return;
                } else {
                    fu1.h("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                h72 h72Var = (h72) obj2;
                c();
                int i4 = this.g;
                if (i4 < 0) {
                    fu1.h("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    h72Var.set(i4, obj);
                    this.h = nj2.s(h72Var);
                    return;
                }
        }
    }

    public tm0(z21 z21Var, int i) {
        this.e = 2;
        this.i = z21Var;
        this.f = i;
        this.g = -1;
        this.h = ((AbstractList) z21Var).modCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tm0(vm0 vm0Var, int i, int i2) {
        this(vm0Var, (i2 & 1) != 0 ? 0 : i, 0, vm0Var.e.b);
        this.e = 0;
    }

    public tm0(vm0 vm0Var, int i, int i2, int i3) {
        this.e = 0;
        this.i = vm0Var;
        this.f = i;
        this.g = i2;
        this.h = i3;
    }

    public tm0(y21 y21Var, int i) {
        this.e = 1;
        this.i = y21Var;
        this.f = i;
        this.g = -1;
        this.h = ((AbstractList) y21Var).modCount;
    }
}
