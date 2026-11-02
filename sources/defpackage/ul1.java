package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ul1 implements Iterator, fv0 {
    public final xi2[] e;
    public int f;
    public boolean g = true;

    public ul1(wi2 wi2Var, xi2[] xi2VarArr) {
        this.e = xi2VarArr;
        xi2VarArr[0].a(wi2Var.d, Integer.bitCount(wi2Var.a) * 2, 0);
        this.f = 0;
        a();
    }

    public final void a() {
        int i = this.f;
        xi2[] xi2VarArr = this.e;
        xi2 xi2Var = xi2VarArr[i];
        if (xi2Var.g < xi2Var.f) {
            return;
        }
        while (-1 < i) {
            int iB = b(i);
            if (iB == -1) {
                xi2 xi2Var2 = xi2VarArr[i];
                int i2 = xi2Var2.g;
                Object[] objArr = xi2Var2.e;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    xi2Var2.g = i2 + 1;
                    iB = b(i);
                }
            }
            if (iB != -1) {
                this.f = iB;
                return;
            }
            if (i > 0) {
                xi2 xi2Var3 = xi2VarArr[i - 1];
                int i3 = xi2Var3.g;
                int length2 = xi2Var3.e.length;
                xi2Var3.g = i3 + 1;
            }
            xi2VarArr[i].a(wi2.e.d, 0, 0);
            i--;
        }
        this.g = false;
    }

    public final int b(int i) {
        xi2[] xi2VarArr = this.e;
        xi2 xi2Var = xi2VarArr[i];
        int i2 = xi2Var.g;
        if (i2 < xi2Var.f) {
            return i;
        }
        Object[] objArr = xi2Var.e;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        wi2 wi2Var = (wi2) obj;
        if (i == 6) {
            xi2 xi2Var2 = xi2VarArr[i + 1];
            Object[] objArr2 = wi2Var.d;
            xi2Var2.a(objArr2, objArr2.length, 0);
        } else {
            xi2VarArr[i + 1].a(wi2Var.d, Integer.bitCount(wi2Var.a) * 2, 0);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.g) {
            qj.t();
            return null;
        }
        Object next = this.e[this.f].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
