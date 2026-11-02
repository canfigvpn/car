package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class nu1 extends y implements RandomAccess {
    public final Object[] e;
    public final int f;
    public int g;
    public int h;

    public nu1(int i, Object[] objArr) {
        this.e = objArr;
        if (i < 0) {
            qj.f(k3.i("ring buffer filled size should not be negative but it is ", i));
            throw null;
        }
        if (i <= objArr.length) {
            this.f = objArr.length;
            this.h = i;
        } else {
            StringBuilder sbM = k3.m(i, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbM.append(objArr.length);
            throw new IllegalArgumentException(sbM.toString().toString());
        }
    }

    @Override // defpackage.n
    public final int a() {
        return this.h;
    }

    public final void b() {
        if (2 > this.h) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 2, size = " + this.h).toString());
        }
        int i = this.g;
        int i2 = this.f;
        int i3 = (i + 2) % i2;
        Object[] objArr = this.e;
        if (i > i3) {
            Arrays.fill(objArr, i, i2, (Object) null);
            Arrays.fill(objArr, 0, i3, (Object) null);
        } else {
            Arrays.fill(objArr, i, i3, (Object) null);
        }
        this.g = i3;
        this.h -= 2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.h;
        if (i < 0 || i >= i2) {
            qj.j(k3.h(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.e[(this.g + i) % this.f];
    }

    @Override // defpackage.y, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new mu1(this);
    }

    @Override // defpackage.n, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int length = objArr.length;
        int i = this.h;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.h;
        int i3 = this.g;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.e;
            if (i5 >= i2 || i3 >= this.f) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // defpackage.n, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }
}
