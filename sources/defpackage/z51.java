package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class z51 extends AbstractCollection implements Collection, gv0 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ z51(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                ((x51) obj).clear();
                break;
            default:
                ((rl1) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return ((x51) obj2).containsValue(obj);
            default:
                return ((rl1) obj2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.e) {
            case 0:
                return ((x51) this.f).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return new u51((x51) obj, 2);
            default:
                rl1 rl1Var = (rl1) obj;
                xi2[] xi2VarArr = new xi2[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    xi2VarArr[i2] = new yi2(2);
                }
                return new yl1(rl1Var, xi2VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.e) {
            case 0:
                x51 x51Var = (x51) this.f;
                x51Var.c();
                int iH = x51Var.h(obj);
                if (iH < 0) {
                    return false;
                }
                x51Var.k(iH);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                ((x51) this.f).c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                ((x51) this.f).c();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((x51) obj).m;
            default:
                return ((rl1) obj).i;
        }
    }
}
