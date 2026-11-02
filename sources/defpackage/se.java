package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class se extends w42 implements Map {
    public ne h;
    public pe i;
    public re j;

    @Override // java.util.Map
    public final Set entrySet() {
        ne neVar = this.h;
        if (neVar != null) {
            return neVar;
        }
        ne neVar2 = new ne(this);
        this.h = neVar2;
        return neVar2;
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i = this.g;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.g;
    }

    @Override // java.util.Map
    public final Set keySet() {
        pe peVar = this.i;
        if (peVar != null) {
            return peVar;
        }
        pe peVar2 = new pe(this);
        this.i = peVar2;
        return peVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.g;
        int i = this.g;
        int[] iArr = this.e;
        if (iArr.length < size) {
            this.e = Arrays.copyOf(iArr, size);
            this.f = Arrays.copyOf(this.f, size * 2);
        }
        if (this.g != i) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        re reVar = this.j;
        if (reVar != null) {
            return reVar;
        }
        re reVar2 = new re(this);
        this.j = reVar2;
        return reVar2;
    }
}
