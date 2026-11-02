package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a3 implements sj0, Serializable {
    public final Object e;
    public final Class f;
    public final String g;
    public final String h;
    public final boolean i = false;
    public final int j;
    public final int k;

    public a3(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.e = obj;
        this.f = cls;
        this.g = str;
        this.h = str2;
        this.j = i;
        this.k = i2 >> 1;
    }

    @Override // defpackage.sj0
    public final int c() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        return this.i == a3Var.i && this.j == a3Var.j && this.k == a3Var.k && this.e.equals(a3Var.e) && this.f.equals(a3Var.f) && this.g.equals(a3Var.g) && this.h.equals(a3Var.h);
    }

    public final int hashCode() {
        return ((((k3.e(k3.e((this.f.hashCode() + (this.e.hashCode() * 31)) * 31, 31, this.g), 31, this.h) + (this.i ? 1231 : 1237)) * 31) + this.j) * 31) + this.k;
    }

    public final String toString() {
        js1.a.getClass();
        return ks1.a(this);
    }
}
