package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class em1 extends z {
    public final Object[] g;
    public final vi2 h;

    public em1(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.g = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.h = new vi2(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            qj.t();
            return null;
        }
        vi2 vi2Var = this.h;
        if (vi2Var.hasNext()) {
            this.e++;
            return vi2Var.next();
        }
        int i = this.e;
        this.e = i + 1;
        return this.g[i - vi2Var.f];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            qj.t();
            return null;
        }
        int i = this.e;
        vi2 vi2Var = this.h;
        int i2 = vi2Var.f;
        if (i <= i2) {
            this.e = i - 1;
            return vi2Var.previous();
        }
        int i3 = i - 1;
        this.e = i3;
        return this.g[i3 - i2];
    }
}
