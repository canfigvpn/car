package defpackage;

import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fm1 extends z {
    public final dm1 g;
    public int h;
    public vi2 i;
    public int j;

    public fm1(dm1 dm1Var, int i) {
        super(i, dm1Var.l);
        this.g = dm1Var;
        this.h = dm1Var.e();
        this.j = -1;
        b();
    }

    public final void a() {
        if (this.h != this.g.e()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // defpackage.z, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.e;
        dm1 dm1Var = this.g;
        dm1Var.add(i, obj);
        this.e++;
        this.f = dm1Var.a();
        this.h = dm1Var.e();
        this.j = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        dm1 dm1Var = this.g;
        Object[] objArr = dm1Var.j;
        if (objArr == null) {
            this.i = null;
            return;
        }
        int i = (dm1Var.l - 1) & (-32);
        int i2 = this.e;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (dm1Var.h / 5) + 1;
        vi2 vi2Var = this.i;
        if (vi2Var == null) {
            this.i = new vi2(objArr, i2, i, i3);
            return;
        }
        vi2Var.e = i2;
        vi2Var.f = i;
        vi2Var.g = i3;
        Object[] objArr2 = vi2Var.h;
        if (objArr2.length < i3) {
            objArr2 = new Object[i3];
            vi2Var.h = objArr2;
        }
        objArr2[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        vi2Var.i = r0;
        vi2Var.b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            qj.t();
            return null;
        }
        int i = this.e;
        this.j = i;
        vi2 vi2Var = this.i;
        dm1 dm1Var = this.g;
        if (vi2Var == null) {
            Object[] objArr = dm1Var.k;
            this.e = i + 1;
            return objArr[i];
        }
        if (vi2Var.hasNext()) {
            this.e++;
            return vi2Var.next();
        }
        Object[] objArr2 = dm1Var.k;
        int i2 = this.e;
        this.e = i2 + 1;
        return objArr2[i2 - vi2Var.f];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            qj.t();
            return null;
        }
        int i = this.e;
        this.j = i - 1;
        vi2 vi2Var = this.i;
        dm1 dm1Var = this.g;
        if (vi2Var == null) {
            Object[] objArr = dm1Var.k;
            int i2 = i - 1;
            this.e = i2;
            return objArr[i2];
        }
        int i3 = vi2Var.f;
        if (i <= i3) {
            this.e = i - 1;
            return vi2Var.previous();
        }
        Object[] objArr2 = dm1Var.k;
        int i4 = i - 1;
        this.e = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.z, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.j;
        if (i == -1) {
            throw new IllegalStateException();
        }
        dm1 dm1Var = this.g;
        dm1Var.b(i);
        int i2 = this.j;
        if (i2 < this.e) {
            this.e = i2;
        }
        this.f = dm1Var.a();
        this.h = dm1Var.e();
        this.j = -1;
        b();
    }

    @Override // defpackage.z, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.j;
        if (i == -1) {
            throw new IllegalStateException();
        }
        dm1 dm1Var = this.g;
        dm1Var.set(i, obj);
        this.h = dm1Var.e();
        b();
    }
}
