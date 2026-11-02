package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class mu1 implements Iterator, fv0 {
    public final /* synthetic */ int e = 1;
    public int f;
    public int g;
    public int h;
    public Object i;
    public final Object j;

    public mu1(nu1 nu1Var) {
        this.j = nu1Var;
        this.g = nu1Var.h;
        this.h = nu1Var.g;
    }

    public boolean a() {
        this.f = 3;
        int i = this.g;
        if (i == 0) {
            this.f = 2;
            return false;
        }
        nu1 nu1Var = (nu1) this.j;
        Object[] objArr = nu1Var.e;
        int i2 = this.h;
        this.i = objArr[i2];
        this.f = 1;
        this.h = (i2 + 1) % nu1Var.f;
        this.g = i - 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                int i = this.f;
                if (i == 0) {
                    return a();
                }
                if (i == 1) {
                    return true;
                }
                if (i != 2) {
                    qj.r("hasNext called when the iterator is in the FAILED state.");
                }
                return false;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                int i = this.f;
                if (i == 1) {
                    this.f = 0;
                    return this.i;
                }
                if (i == 2 || !a()) {
                    qj.t();
                    return null;
                }
                this.f = 0;
                return this.i;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public mu1(l52 l52Var, int i, ck0 ck0Var, n02 n02Var) {
        this.i = l52Var;
        this.f = i;
        this.j = n02Var;
        this.g = l52Var.l;
    }
}
