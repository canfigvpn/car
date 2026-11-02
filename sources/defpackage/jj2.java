package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jj2 implements Serializable {
    public final Object e;
    public final Object f;
    public final Object g;

    public jj2(Object obj, Object obj2, Object obj3) {
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj2)) {
            return false;
        }
        jj2 jj2Var = (jj2) obj;
        return ws0.j(this.e, jj2Var.e) && ws0.j(this.f, jj2Var.f) && ws0.j(this.g, jj2Var.g);
    }

    public final int hashCode() {
        Object obj = this.e;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.g;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.e + ", " + this.f + ", " + this.g + ')';
    }
}
