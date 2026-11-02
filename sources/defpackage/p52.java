package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class p52 extends d0 {
    public static final p52 f = new p52(new Object[0]);
    public final Object[] e;

    public p52(Object[] objArr) {
        this.e = objArr;
    }

    @Override // defpackage.n
    public final int a() {
        return this.e.length;
    }

    @Override // defpackage.d0
    public final d0 b(int i, Object obj) {
        Object[] objArr = this.e;
        sv.s(i, objArr.length);
        if (i == objArr.length) {
            return c(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            ve.y0(objArr, objArr2, 0, i, 6);
            ve.w0(objArr, objArr2, i + 1, i, objArr.length);
            objArr2[i] = obj;
            return new p52(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        ve.w0(objArr, objArrCopyOf, i + 1, i, objArr.length - 1);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new cm1(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.d0
    public final d0 c(Object obj) {
        Object[] objArr = this.e;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = obj;
            return new p52(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new cm1(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.d0
    public final d0 d(Collection collection) {
        Object[] objArr = this.e;
        if (collection.size() + objArr.length > 32) {
            dm1 dm1VarE = e();
            dm1VarE.addAll(collection);
            return dm1VarE.c();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new p52(objArrCopyOf);
    }

    @Override // defpackage.d0
    public final dm1 e() {
        return new dm1(this, null, this.e, 0);
    }

    @Override // defpackage.d0
    public final d0 f(c0 c0Var) {
        Object[] objArr = this.e;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) c0Var.h(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? f : new p52(ve.z0(objArrCopyOf, 0, length));
    }

    @Override // defpackage.d0
    public final d0 g(int i) {
        Object[] objArr = this.e;
        sv.r(i, objArr.length);
        if (objArr.length == 1) {
            return f;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        ve.w0(objArr, objArrCopyOf, i, i + 1, objArr.length);
        return new p52(objArrCopyOf);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.e;
        sv.r(i, objArr.length);
        return objArr[i];
    }

    @Override // defpackage.d0
    public final d0 h(int i, Object obj) {
        Object[] objArr = this.e;
        sv.r(i, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = obj;
        return new p52(objArrCopyOf);
    }

    @Override // defpackage.y, java.util.List
    public final int indexOf(Object obj) {
        return ve.G0(this.e, obj);
    }

    @Override // defpackage.y, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.e;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i >= 0) {
                        length = i;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.y, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.e;
        sv.s(i, objArr.length);
        return new uk(objArr, i, objArr.length);
    }
}
