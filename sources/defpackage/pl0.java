package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pl0 implements Iterator, fv0 {
    public final l52 e;
    public final int f;
    public int g;
    public final int h;

    public pl0(l52 l52Var, int i, int i2) {
        this.e = l52Var;
        this.f = i2;
        this.g = i;
        this.h = l52Var.l;
        if (l52Var.k) {
            n52.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g < this.f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        l52 l52Var = this.e;
        int i = l52Var.l;
        int i2 = this.h;
        if (i != i2) {
            n52.e();
        }
        int i3 = this.g;
        this.g = l52Var.e[(i3 * 5) + 3] + i3;
        return new m52(l52Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
