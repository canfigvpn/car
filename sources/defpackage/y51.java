package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class y51 extends b0 {
    public final /* synthetic */ int e;
    public final x51 f;

    public /* synthetic */ y51(x51 x51Var, int i) {
        this.e = i;
        this.f = x51Var;
    }

    @Override // defpackage.b0
    public final int a() {
        int i = this.e;
        x51 x51Var = this.f;
        switch (i) {
            case 0:
                break;
        }
        return x51Var.m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.e) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.e;
        collection.getClass();
        switch (i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.e;
        x51 x51Var = this.f;
        switch (i) {
            case 0:
                x51Var.clear();
                break;
            default:
                x51Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.e;
        x51 x51Var = this.f;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int iG = x51Var.g(entry.getKey());
                if (iG < 0) {
                    return false;
                }
                Object[] objArr = x51Var.f;
                objArr.getClass();
                return ws0.j(objArr[iG], entry.getValue());
            default:
                return x51Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                return this.f.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        int i = this.e;
        x51 x51Var = this.f;
        switch (i) {
            case 0:
                break;
        }
        return x51Var.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.e;
        x51 x51Var = this.f;
        switch (i) {
            case 0:
                return new u51(x51Var, 0);
            default:
                return new u51(x51Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.e;
        x51 x51Var = this.f;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    x51Var.c();
                    int iG = x51Var.g(entry.getKey());
                    if (iG >= 0) {
                        Object[] objArr = x51Var.f;
                        objArr.getClass();
                        if (ws0.j(objArr[iG], entry.getValue())) {
                            x51Var.k(iG);
                            return true;
                        }
                    }
                }
                return false;
            default:
                x51Var.c();
                int iG2 = x51Var.g(obj);
                if (iG2 < 0) {
                    return false;
                }
                x51Var.k(iG2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.e;
        x51 x51Var = this.f;
        collection.getClass();
        switch (i) {
            case 0:
                x51Var.c();
                break;
            default:
                x51Var.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.e;
        x51 x51Var = this.f;
        collection.getClass();
        switch (i) {
            case 0:
                x51Var.c();
                break;
            default:
                x51Var.c();
                break;
        }
        return super.retainAll(collection);
    }
}
