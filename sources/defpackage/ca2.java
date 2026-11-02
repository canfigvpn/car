package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ca2 implements Collection, fv0 {
    public final /* synthetic */ int e = 0;
    public final Object f;

    public ca2() {
        int i = ci1.a;
        this.f = new q91(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.e) {
            case 0:
                return ((q91) this.f).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.e) {
            case 0:
                ((q91) this.f).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return ((q91) obj2).c(obj);
            default:
                return ((w91) obj2).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((q91) obj).c(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                collection.getClass();
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((w91) obj).d(it2.next())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((q91) obj).g == 0;
            default:
                return ((w91) obj).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                return new nk0(new s91((q91) this.f));
            default:
                return p12.i(new tb0(3, null, this));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.e) {
            case 0:
                return ((q91) this.f).g(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.e) {
            case 0:
                return ((q91) this.f).g(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.e) {
            case 0:
                return ((q91) this.f).i(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((q91) obj).g;
            default:
                return ((w91) obj).e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.e) {
            case 0:
                break;
            default:
                objArr.getClass();
                break;
        }
        return p61.o0(this, objArr);
    }

    public ca2(w91 w91Var) {
        this.f = w91Var;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.e) {
            case 0:
                break;
        }
        return p61.n0(this);
    }
}
