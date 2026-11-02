package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class m52 implements nv, Iterable, fv0 {
    public final l52 e;
    public final int f;
    public final int g;

    public m52(l52 l52Var, int i, int i2) {
        this.e = l52Var;
        this.f = i;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m52)) {
            return false;
        }
        m52 m52Var = (m52) obj;
        return m52Var.f == this.f && m52Var.g == this.g && m52Var.e == this.e;
    }

    public final int hashCode() {
        return (this.e.hashCode() * 31) + this.f;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        l52 l52Var = this.e;
        if (l52Var.l != this.g) {
            n52.e();
        }
        int i = this.f;
        l52Var.f(i);
        return new pl0(l52Var, i + 1, l52Var.e[(i * 5) + 3] + i);
    }
}
