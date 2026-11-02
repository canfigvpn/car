package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ed0 implements Map.Entry, fv0 {
    public final x11 e;
    public final a21 f;
    public ed0 g;
    public ed0 h;
    public boolean i;

    public ed0(x11 x11Var, a21 a21Var) {
        this.e = x11Var;
        this.f = a21Var;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ed0) {
            ed0 ed0Var = (ed0) obj;
            return this.e.equals(ed0Var.e) && this.f == ed0Var.f;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f.hashCode() + (this.e.hashCode() * 31);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "Entry(key=" + this.e + ", value=" + this.f + ")";
    }
}
