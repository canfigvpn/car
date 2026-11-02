package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class v51 implements Map.Entry, fv0 {
    public final x51 e;
    public final int f;
    public final int g;

    public v51(x51 x51Var, int i) {
        this.e = x51Var;
        this.f = i;
        this.g = x51Var.l;
    }

    public final void a() {
        if (this.e.l != this.g) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return ws0.j(entry.getKey(), getKey()) && ws0.j(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.e.e[this.f];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.e.f;
        objArr.getClass();
        return objArr[this.f];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        x51 x51Var = this.e;
        x51Var.c();
        Object[] objArr = x51Var.f;
        if (objArr == null) {
            int length = x51Var.e.length;
            if (length < 0) {
                qj.r("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            x51Var.f = objArr;
        }
        int i = this.f;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
