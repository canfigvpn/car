package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class n12 implements Iterator, sx, fv0 {
    public int e;
    public Object f;
    public sx g;

    public final RuntimeException a() {
        int i = this.e;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.e);
    }

    public final void b(sx sxVar, Object obj) {
        this.f = obj;
        this.e = 3;
        this.g = sxVar;
        sxVar.getClass();
    }

    @Override // defpackage.sx
    public final uy f() {
        return ab0.e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.e;
            if (i != 0) {
                break;
            }
            this.e = 5;
            sx sxVar = this.g;
            sxVar.getClass();
            this.g = null;
            sxVar.i(ll2.a);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw a();
    }

    @Override // defpackage.sx
    public final void i(Object obj) {
        ix.Q(obj);
        this.e = 4;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.e;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            qj.t();
            return null;
        }
        if (i == 2) {
            this.e = 1;
            throw null;
        }
        if (i != 3) {
            throw a();
        }
        this.e = 0;
        Object obj = this.f;
        this.f = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
