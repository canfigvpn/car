package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ec1 implements Iterator, fv0 {
    public int e = -1;
    public boolean f;
    public final /* synthetic */ fc1 g;

    public ec1(fc1 fc1Var) {
        this.g = fc1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e + 1 < ((v72) this.g.f).d();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            qj.t();
            return null;
        }
        this.f = true;
        v72 v72Var = (v72) this.g.f;
        int i = this.e + 1;
        this.e = i;
        return (zb1) v72Var.e(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f) {
            fu1.h("You must call next() before you can remove an element");
            return;
        }
        v72 v72Var = (v72) this.g.f;
        ((zb1) v72Var.e(this.e)).g = null;
        int i = this.e;
        Object[] objArr = v72Var.g;
        Object obj = objArr[i];
        Object obj2 = s5.T;
        if (obj != obj2) {
            objArr[i] = obj2;
            v72Var.e = true;
        }
        this.e = i - 1;
        this.f = false;
    }
}
