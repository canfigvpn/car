package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vi2 extends z {
    public int g;
    public Object[] h;
    public boolean i;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public vi2(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.g = i3;
        Object[] objArr2 = new Object[i3];
        this.h = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.i = r5;
        objArr2[0] = objArr;
        b(i - r5, 1);
    }

    public final Object a() {
        int i = this.e & 31;
        Object obj = this.h[this.g - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    public final void b(int i, int i2) {
        int i3 = (this.g - i2) * 5;
        while (i2 < this.g) {
            Object[] objArr = this.h;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[v12.l(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void c(int i) {
        int i2 = 0;
        while (v12.l(this.e, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(this.e, ((this.g - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            qj.t();
            return null;
        }
        Object objA = a();
        int i = this.e + 1;
        this.e = i;
        if (i == this.f) {
            this.i = true;
            return objA;
        }
        c(0);
        return objA;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            qj.t();
            return null;
        }
        this.e--;
        if (this.i) {
            this.i = false;
            return a();
        }
        c(31);
        return a();
    }
}
