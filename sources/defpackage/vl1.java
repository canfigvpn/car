package defpackage;

import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class vl1 extends ul1 {
    public final rl1 h;
    public Object i;
    public boolean j;
    public int k;

    public vl1(rl1 rl1Var, xi2[] xi2VarArr) {
        super(rl1Var.f, xi2VarArr);
        this.h = rl1Var;
        this.k = rl1Var.h;
    }

    public final void c(int i, wi2 wi2Var, Object obj, int i2) {
        int i3 = i2 * 5;
        xi2[] xi2VarArr = this.e;
        if (i3 <= 30) {
            int iK = 1 << v12.k(i, i3);
            if (wi2Var.h(iK)) {
                xi2VarArr[i2].a(wi2Var.d, Integer.bitCount(wi2Var.a) * 2, wi2Var.f(iK));
                this.f = i2;
                return;
            } else {
                int iT = wi2Var.t(iK);
                wi2 wi2VarS = wi2Var.s(iT);
                xi2VarArr[i2].a(wi2Var.d, Integer.bitCount(wi2Var.a) * 2, iT);
                c(i, wi2VarS, obj, i2 + 1);
                return;
            }
        }
        xi2 xi2Var = xi2VarArr[i2];
        Object[] objArr = wi2Var.d;
        xi2Var.a(objArr, objArr.length, 0);
        while (true) {
            xi2 xi2Var2 = xi2VarArr[i2];
            if (ws0.j(xi2Var2.e[xi2Var2.g], obj)) {
                this.f = i2;
                return;
            } else {
                xi2VarArr[i2].g += 2;
            }
        }
    }

    @Override // defpackage.ul1, java.util.Iterator
    public final Object next() {
        if (this.h.h != this.k) {
            throw new ConcurrentModificationException();
        }
        if (!this.g) {
            qj.t();
            return null;
        }
        xi2 xi2Var = this.e[this.f];
        this.i = xi2Var.e[xi2Var.g];
        this.j = true;
        return super.next();
    }

    @Override // defpackage.ul1, java.util.Iterator
    public final void remove() {
        if (!this.j) {
            throw new IllegalStateException();
        }
        boolean z = this.g;
        rl1 rl1Var = this.h;
        if (!z) {
            nj2.g(rl1Var).remove(this.i);
        } else {
            if (!z) {
                qj.t();
                return;
            }
            xi2 xi2Var = this.e[this.f];
            Object obj = xi2Var.e[xi2Var.g];
            nj2.g(rl1Var).remove(this.i);
            c(obj != null ? obj.hashCode() : 0, rl1Var.f, obj, 0);
        }
        this.i = null;
        this.j = false;
        this.k = rl1Var.h;
    }
}
