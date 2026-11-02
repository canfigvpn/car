package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qe implements Iterator, Map.Entry {
    public int e;
    public int f = -1;
    public boolean g;
    public final /* synthetic */ se h;

    public qe(se seVar) {
        this.h = seVar;
        this.e = seVar.g - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.g) {
            fu1.h("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.f;
            se seVar = this.h;
            if (ws0.j(key, seVar.e(i)) && ws0.j(entry.getValue(), seVar.h(this.f))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.g) {
            return this.h.e(this.f);
        }
        fu1.h("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.g) {
            return this.h.h(this.f);
        }
        fu1.h("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f < this.e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.g) {
            fu1.h("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.f;
        se seVar = this.h;
        Object objE = seVar.e(i);
        Object objH = seVar.h(this.f);
        return (objE == null ? 0 : objE.hashCode()) ^ (objH != null ? objH.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            qj.t();
            return null;
        }
        this.f++;
        this.g = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.g) {
            throw new IllegalStateException();
        }
        this.h.f(this.f);
        this.f--;
        this.e--;
        this.g = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.g) {
            return this.h.g(this.f, obj);
        }
        fu1.h("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
