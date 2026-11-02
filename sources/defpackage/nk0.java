package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class nk0 implements Iterator, fv0 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public final Object h;

    public nk0(z91 z91Var) {
        this.e = 2;
        this.h = z91Var;
        this.f = -1;
        this.g = p12.i(new y91(z91Var, this, null));
    }

    public void a() {
        Object objH;
        int i = this.f;
        jd0 jd0Var = (jd0) this.h;
        if (i == -2) {
            objH = ((ti0) jd0Var.b).a();
        } else {
            ej0 ej0Var = jd0Var.c;
            Object obj = this.g;
            obj.getClass();
            objH = ej0Var.h(obj);
        }
        this.g = objH;
        this.f = objH == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                if (this.f < 0) {
                    a();
                }
                return this.f == 1;
            case 1:
                return ((n12) this.g).hasNext();
            case 2:
                return ((n12) this.g).hasNext();
            default:
                return this.f < ((Map) this.h).size();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = null;
        switch (this.e) {
            case 0:
                if (this.f < 0) {
                    a();
                }
                if (this.f == 0) {
                    qj.t();
                    return null;
                }
                Object obj2 = this.g;
                obj2.getClass();
                this.f = -1;
                return obj2;
            case 1:
                return ((n12) this.g).next();
            case 2:
                return ((n12) this.g).next();
            default:
                if (hasNext()) {
                    obj = this.g;
                    this.f++;
                    Object obj3 = ((Map) this.h).get(obj);
                    if (obj3 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                    this.g = ((x21) obj3).b;
                } else {
                    qj.t();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.e;
        Object obj = this.h;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.f;
                if (i2 != -1) {
                    ((s91) obj).f.h(i2);
                    this.f = -1;
                    return;
                }
                return;
            case 2:
                int i3 = this.f;
                if (i3 != -1) {
                    ((z91) obj).f.m(i3);
                    this.f = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public nk0(jd0 jd0Var) {
        this.e = 0;
        this.h = jd0Var;
        this.f = -2;
    }

    public nk0(Object obj, Map map) {
        this.e = 3;
        this.g = obj;
        this.h = map;
    }

    public nk0(s91 s91Var) {
        this.e = 1;
        this.h = s91Var;
        this.f = -1;
        this.g = p12.i(new r91(s91Var, this, null));
    }
}
