package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cu1 implements ListIterator, fv0 {
    public final /* synthetic */ int e = 0;
    public final Object f;
    public final /* synthetic */ Object g;

    public cu1(du1 du1Var, int i) {
        this.g = du1Var;
        List list = du1Var.e;
        if (i >= 0 && i <= du1Var.a()) {
            this.f = list.listIterator(du1Var.a() - i);
            return;
        }
        StringBuilder sbM = k3.m(i, "Position index ", " must be in range [");
        sbM.append(new lr0(0, du1Var.a(), 1));
        sbM.append("].");
        throw new IndexOutOfBoundsException(sbM.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasPrevious();
            default:
                return ((es1) obj).e < ((w92) this.g).h - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasNext();
            default:
                return ((es1) obj).e >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((ListIterator) obj).previous();
            default:
                es1 es1Var = (es1) obj;
                int i2 = es1Var.e + 1;
                w92 w92Var = (w92) this.g;
                nj2.I(i2, w92Var.h);
                es1Var.e = i2;
                return w92Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return (((du1) this.g).size() - 1) - ((ListIterator) obj).previousIndex();
            default:
                return ((es1) obj).e + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((ListIterator) obj).next();
            default:
                es1 es1Var = (es1) obj;
                int i2 = es1Var.e;
                w92 w92Var = (w92) this.g;
                nj2.I(i2, w92Var.h);
                es1Var.e = i2 - 1;
                return w92Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return (((du1) this.g).size() - 1) - ((ListIterator) obj).nextIndex();
            default:
                return ((es1) obj).e;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public cu1(es1 es1Var, w92 w92Var) {
        this.f = es1Var;
        this.g = w92Var;
    }
}
